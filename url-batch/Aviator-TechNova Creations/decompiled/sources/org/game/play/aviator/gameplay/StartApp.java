package org.game.play.aviator.gameplay;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.internal.AssetHelper;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import org.game.play.aviator.gameplay.StartApp;
import org.game.play.aviator.gameplay.databinding.ActivityStartAppBinding;

/* loaded from: classes3.dex */
public class StartApp extends AppCompatActivity {
    private ActivityStartAppBinding binding;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityStartAppBinding inflate = ActivityStartAppBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        final int paddingTop = this.binding.llContent.getPaddingTop();
        final int paddingBottom = this.binding.llContent.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.StartApp$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return StartApp.this.m2265lambda$onCreate$0$orggameplayaviatorgameplayStartApp(paddingTop, paddingBottom, view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        this.binding.rateus.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.StartApp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StartApp startApp = StartApp.this;
                startApp.updateSelection(startApp.binding.rateus);
                try {
                    StartApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + StartApp.this.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    StartApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + StartApp.this.getPackageName())));
                }
            }
        });
        this.binding.shareapp.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.StartApp.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StartApp startApp = StartApp.this;
                startApp.updateSelection(startApp.binding.shareapp);
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                    intent.putExtra("android.intent.extra.SUBJECT", "My application name");
                    intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=" + StartApp.this.getPackageName() + "\n\n");
                    StartApp.this.startActivity(Intent.createChooser(intent, "choose one"));
                } catch (Exception unused) {
                }
            }
        });
        this.binding.privacypolicy.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.StartApp.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StartApp startApp = StartApp.this;
                startApp.updateSelection(startApp.binding.privacypolicy);
                StartApp.this.startActivity(new Intent(StartApp.this, (Class<?>) SettingPoliceActivity.class));
            }
        });
        this.binding.btnStartApp.setOnClickListener(new AnonymousClass5());
    }

    /* renamed from: org.game.play.aviator.gameplay.StartApp$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(StartApp.this);
            final StartApp startApp = StartApp.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.StartApp$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    StartApp.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-StartApp, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2265lambda$onCreate$0$orggameplayaviatorgameplayStartApp(int i, int i2, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        this.binding.llContent.setPadding(this.binding.llContent.getPaddingLeft(), insets.top + i, this.binding.llContent.getPaddingRight(), insets.bottom + i2);
        return windowInsetsCompat;
    }

    /* renamed from: org.game.play.aviator.gameplay.StartApp$5, reason: invalid class name */
    class AnonymousClass5 implements View.OnClickListener {
        AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StartApp startApp = StartApp.this;
            startApp.updateSelection(startApp.binding.btnStartApp);
            AppManage.getInstance(StartApp.this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.StartApp$5$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    StartApp.AnonymousClass5.this.m2266lambda$onClick$0$orggameplayaviatorgameplayStartApp$5();
                }
            }, Click.FORWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }

        /* renamed from: lambda$onClick$0$org-game-play-aviator-gameplay-StartApp$5, reason: not valid java name */
        /* synthetic */ void m2266lambda$onClick$0$orggameplayaviatorgameplayStartApp$5() {
            StartApp.this.startActivity(new Intent(StartApp.this, (Class<?>) MainActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelection(View view) {
        this.binding.btnStartApp.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.shareapp.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.rateus.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.privacypolicy.setBackgroundResource(R.drawable.bg_language_card_unselected);
        view.setBackgroundResource(R.drawable.bg_aviator_unique_button);
    }
}
