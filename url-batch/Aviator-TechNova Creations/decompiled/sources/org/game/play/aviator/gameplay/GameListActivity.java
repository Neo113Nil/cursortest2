package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.game.play.aviator.gameplay.GameListAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GameListActivity extends AppCompatActivity {
    private String categoryName;
    private RecyclerView rvGameList;
    private TextView tvCategoryTitle;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game_list);
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        this.categoryName = getIntent().getStringExtra("category_name");
        this.rvGameList = (RecyclerView) findViewById(R.id.rvGameList);
        TextView textView = (TextView) findViewById(R.id.tvCategoryTitle);
        this.tvCategoryTitle = textView;
        textView.setText(this.categoryName);
        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GameListActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameListActivity.this.m2185x6012c83c(view);
            }
        });
        BlurUtil.applyBlur((ImageView) findViewById(R.id.ivBackground));
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE((ViewGroup) findViewById(R.id.rlNativeAd), (TextView) findViewById(R.id.tvNativeAd), AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        View findViewById = findViewById(R.id.main);
        final View findViewById2 = findViewById(R.id.rlToolbar);
        final View findViewById3 = findViewById(R.id.rlNativeAd);
        final int paddingTop = findViewById2.getPaddingTop();
        final int paddingBottom = findViewById3.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.GameListActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GameListActivity.lambda$onCreate$1(findViewById2, paddingTop, findViewById3, paddingBottom, view, windowInsetsCompat);
            }
        });
        loadGames();
    }

    /* renamed from: org.game.play.aviator.gameplay.GameListActivity$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(GameListActivity.this);
            final GameListActivity gameListActivity = GameListActivity.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GameListActivity$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GameListActivity.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-GameListActivity, reason: not valid java name */
    /* synthetic */ void m2185x6012c83c(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$1(View view, int i, View view2, int i2, View view3, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(view.getPaddingLeft(), insets.top + i, view.getPaddingRight(), view.getPaddingBottom());
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), insets.bottom + i2);
        return windowInsetsCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r5.has("games") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r0 = r5.getJSONArray("games");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r3 >= r0.length()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r2 = r0.getJSONObject(r3);
        r1.add(new org.game.play.aviator.gameplay.GameModel(r2.getString("title"), r2.getString("shortTitle"), r2.getString("description"), r2.getString("iconUrl"), r2.getString("gameUrl")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadGames() {
        ArrayList arrayList = new ArrayList();
        try {
            String gamesData = FirebaseConfigUtil.getGamesData();
            if (gamesData.isEmpty()) {
                gamesData = loadJSONFromAsset("games_data.json");
            }
            if (gamesData != null && !gamesData.isEmpty()) {
                JSONArray jSONArray = new JSONObject(gamesData).getJSONArray("categories");
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    if (jSONObject.getString("category_name").equals(this.categoryName)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        GameListAdapter gameListAdapter = new GameListAdapter(arrayList, new GameListAdapter.OnGameClickListener() { // from class: org.game.play.aviator.gameplay.GameListActivity$$ExternalSyntheticLambda2
            @Override // org.game.play.aviator.gameplay.GameListAdapter.OnGameClickListener
            public final void onGameClick(GameModel gameModel) {
                GameListActivity.this.m2184xd3fb3a4(gameModel);
            }
        });
        this.rvGameList.setLayoutManager(new GridLayoutManager(this, 3));
        this.rvGameList.setAdapter(gameListAdapter);
    }

    /* renamed from: lambda$loadGames$2$org-game-play-aviator-gameplay-GameListActivity, reason: not valid java name */
    /* synthetic */ void m2184xd3fb3a4(GameModel gameModel) {
        Intent intent = new Intent(this, (Class<?>) decriptionActivity.class);
        intent.putExtra("game_title", gameModel.getTitle());
        intent.putExtra("game_desc", gameModel.getDescription());
        intent.putExtra("game_icon", gameModel.getIconUrl());
        intent.putExtra("game_url", gameModel.getGameUrl());
        startActivity(intent);
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
