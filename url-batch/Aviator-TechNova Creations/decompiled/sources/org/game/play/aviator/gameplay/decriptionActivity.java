package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;

/* loaded from: classes3.dex */
public class decriptionActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_decription);
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        final View findViewById = findViewById(R.id.contentLayout);
        View findViewById2 = findViewById(R.id.main);
        final int paddingTop = findViewById.getPaddingTop();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById2, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.decriptionActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return decriptionActivity.lambda$onCreate$0(findViewById, paddingTop, view, windowInsetsCompat);
            }
        });
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE((ViewGroup) findViewById(R.id.rlNativeAd), (TextView) findViewById(R.id.tvNativeAd), AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        BlurUtil.applyBlur((ImageView) findViewById(R.id.ivBackground));
        ImageView imageView = (ImageView) findViewById(R.id.btnBack);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgGameBanner);
        View findViewById3 = findViewById(R.id.cvGameBanner);
        TextView textView = (TextView) findViewById(R.id.txtGameTitle);
        TextView textView2 = (TextView) findViewById(R.id.txtGameDescription);
        Button button = (Button) findViewById(R.id.btnPlayGame);
        String stringExtra = getIntent().getStringExtra("game_title");
        String stringExtra2 = getIntent().getStringExtra("game_desc");
        String stringExtra3 = getIntent().getStringExtra("game_icon");
        final String stringExtra4 = getIntent().getStringExtra("game_url");
        textView.setText(stringExtra);
        textView2.setText(stringExtra2);
        if (stringExtra3 != null && !stringExtra3.isEmpty()) {
            findViewById3.setVisibility(0);
            Glide.with((FragmentActivity) this).load(stringExtra3).placeholder(android.R.drawable.dialog_holo_dark_frame).into(imageView2);
        } else {
            findViewById3.setVisibility(8);
        }
        if (stringExtra4 != null && !stringExtra4.isEmpty()) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.decriptionActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                decriptionActivity.this.m2267x40b86158(view);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.decriptionActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                decriptionActivity.this.m2269xc7ce9cda(stringExtra4, view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.decriptionActivity$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(decriptionActivity.this);
            final decriptionActivity decriptionactivity = decriptionActivity.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.decriptionActivity$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    decriptionActivity.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, int i, View view2, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top + i, view.getPaddingRight(), view.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-decriptionActivity, reason: not valid java name */
    /* synthetic */ void m2267x40b86158(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    /* renamed from: lambda$onCreate$3$org-game-play-aviator-gameplay-decriptionActivity, reason: not valid java name */
    /* synthetic */ void m2269xc7ce9cda(final String str, View view) {
        if (str == null || str.isEmpty()) {
            return;
        }
        AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.decriptionActivity$$ExternalSyntheticLambda3
            @Override // com.pesonal.adsdk.AppManage.MyCallback
            public final void callbackCall() {
                decriptionActivity.this.m2268x84437f19(str);
            }
        }, Click.FORWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
    }

    /* renamed from: lambda$onCreate$2$org-game-play-aviator-gameplay-decriptionActivity, reason: not valid java name */
    /* synthetic */ void m2268x84437f19(String str) {
        Intent intent = new Intent(this, (Class<?>) GameWebViewActivity.class);
        intent.putExtra("url", str);
        startActivity(intent);
    }
}
