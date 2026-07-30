package org.game.play.aviator.gameplay;

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
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;

/* loaded from: classes3.dex */
public class DescriptionActivity2 extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description2);
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        View findViewById = findViewById(R.id.main);
        final View findViewById2 = findViewById(R.id.contentLayout);
        final int paddingTop = findViewById2.getPaddingTop();
        final int paddingBottom = findViewById2.getPaddingBottom();
        final int paddingLeft = findViewById2.getPaddingLeft();
        final int paddingRight = findViewById2.getPaddingRight();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.DescriptionActivity2$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return DescriptionActivity2.lambda$onCreate$0(findViewById2, paddingLeft, paddingTop, paddingRight, paddingBottom, view, windowInsetsCompat);
            }
        });
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE((ViewGroup) findViewById(R.id.rlNativeAd), (TextView) findViewById(R.id.tvNativeAd), AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        BlurUtil.applyBlur((ImageView) findViewById(R.id.ivBackground));
        ImageView imageView = (ImageView) findViewById(R.id.btnBack);
        TextView textView = (TextView) findViewById(R.id.txtFaqTitle);
        TextView textView2 = (TextView) findViewById(R.id.txtFaqDescription);
        String stringExtra = getIntent().getStringExtra("faq_title");
        String stringExtra2 = getIntent().getStringExtra("faq_desc");
        textView.setText(stringExtra);
        textView2.setText(stringExtra2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.DescriptionActivity2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DescriptionActivity2.this.m2182xb1607ac5(view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.DescriptionActivity2$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(DescriptionActivity2.this);
            final DescriptionActivity2 descriptionActivity2 = DescriptionActivity2.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.DescriptionActivity2$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    DescriptionActivity2.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, int i, int i2, int i3, int i4, View view2, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(i, insets.top + i2, i3, insets.bottom + i4);
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-DescriptionActivity2, reason: not valid java name */
    /* synthetic */ void m2182xb1607ac5(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }
}
