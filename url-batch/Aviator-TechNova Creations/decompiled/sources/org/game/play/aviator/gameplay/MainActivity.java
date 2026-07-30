package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.webkit.internal.AssetHelper;
import com.bumptech.glide.Glide;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.game.play.aviator.gameplay.FaqAdapter;
import org.game.play.aviator.gameplay.databinding.ActivityMainBinding;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MainActivity extends AppCompatActivity {
    private Handler autoScrollHandler;
    private Runnable autoScrollRunnable;
    private ActivityMainBinding binding;
    private int currentBannerPosition = 0;
    private String cachedJsonData = null;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return MainActivity.this.m2241lambda$onCreate$0$orggameplayaviatorgameplayMainActivity(view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        ImageView imageView = (ImageView) findViewById(R.id.ivDrawerBackground);
        if (imageView != null) {
            BlurUtil.applyBlur(imageView);
        }
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        this.binding.btnMenu.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2242lambda$onCreate$1$orggameplayaviatorgameplayMainActivity(view);
            }
        });
        setupDrawerMenu();
        String gamesData = FirebaseConfigUtil.getGamesData();
        this.cachedJsonData = gamesData;
        if (gamesData.isEmpty()) {
            this.cachedJsonData = loadJSONFromAsset("games_data.json");
        }
        initContent();
    }

    /* renamed from: org.game.play.aviator.gameplay.MainActivity$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (MainActivity.this.binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                MainActivity.this.binding.drawerLayout.closeDrawer(GravityCompat.START);
                return;
            }
            AppManage appManage = AppManage.getInstance(MainActivity.this);
            final MainActivity mainActivity = MainActivity.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.MainActivity$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    MainActivity.this.finishAffinity();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2241lambda$onCreate$0$orggameplayaviatorgameplayMainActivity(View view, WindowInsetsCompat windowInsetsCompat) {
        this.binding.contentLayout.setPadding(0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top, 0, 0);
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2242lambda$onCreate$1$orggameplayaviatorgameplayMainActivity(View view) {
        this.binding.drawerLayout.openDrawer(GravityCompat.START);
    }

    private void initContent() {
        setupTopBanner();
        setupFaq();
        setupTrendingGames();
        setupCategories();
        setupTopRatedGames();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        Runnable runnable;
        super.onResume();
        Handler handler = this.autoScrollHandler;
        if (handler == null || (runnable = this.autoScrollRunnable) == null) {
            return;
        }
        handler.postDelayed(runnable, 3000L);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        Runnable runnable;
        super.onPause();
        Handler handler = this.autoScrollHandler;
        if (handler == null || (runnable = this.autoScrollRunnable) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    private void setupDrawerMenu() {
        findViewById(R.id.menuPuzzle).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2245xa6c3003f(view);
            }
        });
        findViewById(R.id.menuStrategy).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2246x4163c2c0(view);
            }
        });
        findViewById(R.id.menuAdventure).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2247xdc048541(view);
            }
        });
        findViewById(R.id.menuArcade).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2248x76a547c2(view);
            }
        });
        findViewById(R.id.menuSports).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2249x11460a43(view);
            }
        });
        findViewById(R.id.menuAction).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2250xabe6ccc4(view);
            }
        });
        findViewById(R.id.menuShare).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2251x46878f45(view);
            }
        });
        findViewById(R.id.menuPrivacy).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2252xe12851c6(view);
            }
        });
        findViewById(R.id.menuRate).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.m2244xef109094(view);
            }
        });
    }

    /* renamed from: lambda$setupDrawerMenu$2$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2245xa6c3003f(View view) {
        openCategory("Puzzle & Logic");
    }

    /* renamed from: lambda$setupDrawerMenu$3$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2246x4163c2c0(View view) {
        openCategory("Strategy");
    }

    /* renamed from: lambda$setupDrawerMenu$4$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2247xdc048541(View view) {
        openCategory("Adventure Games");
    }

    /* renamed from: lambda$setupDrawerMenu$5$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2248x76a547c2(View view) {
        openCategory("Arcade");
    }

    /* renamed from: lambda$setupDrawerMenu$6$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2249x11460a43(View view) {
        openCategory("Sports");
    }

    /* renamed from: lambda$setupDrawerMenu$7$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2250xabe6ccc4(View view) {
        openCategory("Action");
    }

    /* renamed from: lambda$setupDrawerMenu$8$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2251x46878f45(View view) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", "Check out this amazing Aviator Game App: https://play.google.com/store/apps/details?id=" + getPackageName());
        startActivity(Intent.createChooser(intent, "Share via"));
        this.binding.drawerLayout.closeDrawers();
    }

    /* renamed from: lambda$setupDrawerMenu$9$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2252xe12851c6(View view) {
        startActivity(new Intent(this, (Class<?>) SettingPoliceActivity.class));
        this.binding.drawerLayout.closeDrawers();
    }

    /* renamed from: lambda$setupDrawerMenu$10$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2244xef109094(View view) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getPackageName())));
        } catch (Exception unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
        }
        this.binding.drawerLayout.closeDrawers();
    }

    private void openCategory(String str) {
        Intent intent = new Intent(this, (Class<?>) GameListActivity.class);
        intent.putExtra("category_name", str);
        startActivity(intent);
        this.binding.drawerLayout.closeDrawers();
    }

    private void setupTopBanner() {
        final BannerAdapter bannerAdapter = new BannerAdapter(loadGameData("top_banner"));
        this.binding.rvTopBanner.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.binding.rvTopBanner.setAdapter(bannerAdapter);
        new PagerSnapHelper().attachToRecyclerView(this.binding.rvTopBanner);
        if (bannerAdapter.getRealCount() > 0) {
            this.currentBannerPosition = LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % bannerAdapter.getRealCount());
            this.binding.rvTopBanner.scrollToPosition(this.currentBannerPosition);
        }
        this.autoScrollHandler = new Handler(Looper.getMainLooper());
        this.autoScrollRunnable = new Runnable() { // from class: org.game.play.aviator.gameplay.MainActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (bannerAdapter.getRealCount() > 0) {
                    MainActivity.this.currentBannerPosition++;
                    MainActivity.this.binding.rvTopBanner.smoothScrollToPosition(MainActivity.this.currentBannerPosition);
                    MainActivity.this.autoScrollHandler.postDelayed(this, 3000L);
                }
            }
        };
    }

    private void setupFaq() {
        ArrayList arrayList = new ArrayList();
        try {
            String str = this.cachedJsonData;
            if (str == null) {
                str = loadJSONFromAsset("games_data.json");
            }
            if (str != null) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("faq");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new FaqModel(jSONObject.getInt("id"), jSONObject.getString("title"), jSONObject.getString("description")));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        FaqAdapter faqAdapter = new FaqAdapter(arrayList, new FaqAdapter.OnFaqClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda0
            @Override // org.game.play.aviator.gameplay.FaqAdapter.OnFaqClickListener
            public final void onReadClick(FaqModel faqModel) {
                MainActivity.this.m2253lambda$setupFaq$11$orggameplayaviatorgameplayMainActivity(faqModel);
            }
        });
        this.binding.rvFaq.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.binding.rvFaq.setAdapter(faqAdapter);
    }

    /* renamed from: lambda$setupFaq$11$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2253lambda$setupFaq$11$orggameplayaviatorgameplayMainActivity(FaqModel faqModel) {
        Intent intent = new Intent(this, (Class<?>) DescriptionActivity2.class);
        intent.putExtra("faq_title", faqModel.getTitle());
        intent.putExtra("faq_desc", faqModel.getDescription());
        startActivity(intent);
    }

    private void setupTrendingGames() {
        List<GameModel> loadGameData = loadGameData("top_3_games");
        if (!loadGameData.isEmpty()) {
            setTrendingItem(loadGameData.get(0), this.binding.ivTrending1, this.binding.tvTrending1, this.binding.btnTrending1);
        }
        if (loadGameData.size() >= 2) {
            setTrendingItem(loadGameData.get(1), this.binding.ivTrending2, this.binding.tvTrending2, this.binding.btnTrending2);
        }
        if (loadGameData.size() >= 3) {
            setTrendingItem(loadGameData.get(2), this.binding.ivTrending3, this.binding.tvTrending3, this.binding.btnTrending3);
        }
    }

    private void setTrendingItem(final GameModel gameModel, ImageView imageView, TextView textView, View view) {
        textView.setText(gameModel.getShortTitle());
        Glide.with((FragmentActivity) this).load(gameModel.getIconUrl()).placeholder(android.R.drawable.ic_menu_gallery).into(imageView);
        view.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.MainActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MainActivity.this.m2243x47cf36e9(gameModel, view2);
            }
        });
    }

    /* renamed from: lambda$setTrendingItem$12$org-game-play-aviator-gameplay-MainActivity, reason: not valid java name */
    /* synthetic */ void m2243x47cf36e9(GameModel gameModel, View view) {
        Intent intent = new Intent(this, (Class<?>) decriptionActivity.class);
        intent.putExtra("game_title", gameModel.getTitle());
        intent.putExtra("game_desc", gameModel.getDescription());
        intent.putExtra("game_icon", gameModel.getIconUrl());
        intent.putExtra("game_url", gameModel.getGameUrl());
        startActivity(intent);
    }

    private void setupCategories() {
        ArrayList arrayList = new ArrayList();
        try {
            String str = this.cachedJsonData;
            if (str == null) {
                str = loadJSONFromAsset("games_data.json");
            }
            if (str != null) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("categories");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new CategoryModel(jSONObject.getString("category_name"), jSONObject.getString("category_icon"), null));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        CategoryAdapter categoryAdapter = new CategoryAdapter(arrayList);
        this.binding.rvCategories.setLayoutManager(new GridLayoutManager(this, 2));
        this.binding.rvCategories.setAdapter(categoryAdapter);
    }

    private void setupTopRatedGames() {
        RatedAdapter ratedAdapter = new RatedAdapter(loadGameData("top_rated_games"));
        this.binding.rvTopRated.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.binding.rvTopRated.setAdapter(ratedAdapter);
    }

    private List<GameModel> loadGameData(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = this.cachedJsonData;
            if (str2 == null) {
                str2 = loadJSONFromAsset("games_data.json");
            }
            if (str2 != null) {
                JSONArray jSONArray = new JSONObject(str2).getJSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new GameModel(jSONObject.getString("title"), jSONObject.getString("shortTitle"), jSONObject.getString("description"), jSONObject.getString("iconUrl"), jSONObject.getString("gameUrl")));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private String loadJSONFromAsset(String str) {
        try {
            InputStream open = getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            int read = open.read(bArr);
            open.close();
            if (read > 0) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
