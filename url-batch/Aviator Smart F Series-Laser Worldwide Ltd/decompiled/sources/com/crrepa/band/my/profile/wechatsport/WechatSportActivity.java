package com.crrepa.band.my.profile.wechatsport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityWechatSportBinding;
import com.crrepa.band.my.databinding.BandDataAppbarBinding;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.f;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class WechatSportActivity extends BaseActivity implements c {
    private static final String WECHAT_PACKAGE = "com.tencent.mm";
    private ActivityWechatSportBinding binding;
    private final b presenter = new b();
    private Bitmap qrCodeBitmap;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (WechatSportActivity.this.qrCodeBitmap != null) {
                WechatSportActivity.this.presenter.saveQrCode(WechatSportActivity.this.qrCodeBitmap);
            }
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) WechatSportActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onBackPressedSupport();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(this.binding.titleBar.appbar);
        BandDataAppbarBinding bandDataAppbarBinding = this.binding.titleBar;
        bVar.addTitleScrollEvent(bandDataAppbarBinding.tvTitle, bandDataAppbarBinding.tvExpandedTitle);
        setSupportActionBar(this.binding.titleBar.toolbar);
    }

    private void setActivityTitle(int i8) {
        this.binding.titleBar.tvTitle.setText(i8);
        this.binding.titleBar.tvExpandedTitle.setText(i8);
        this.binding.titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityWechatSportBinding inflate = ActivityWechatSportBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        this.presenter.getQrCodeView();
        this.binding.titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.wechatsport.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatSportActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.wechatSportQrCodeView.btnSaveQrCode.setOnClickListener(new a());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        Bitmap bitmap = this.qrCodeBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.qrCodeBitmap = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "微信运动");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7 && this.binding.wechatSportQrCodeView.ivQrCode.getVisibility() == 0) {
            this.presenter.getQrCode(this, this.binding.wechatSportQrCodeView.ivQrCode.getHeight());
        }
    }

    @Override // com.crrepa.band.my.profile.wechatsport.c
    public void renderWechatSportQrCode(Bitmap bitmap) {
        this.qrCodeBitmap = bitmap;
        this.binding.wechatSportQrCodeView.ivQrCode.setImageBitmap(bitmap);
    }

    @Override // com.crrepa.band.my.profile.wechatsport.c
    public void saveFail() {
        r0.showLong(this, getString(R.string.qr_code_save_error));
    }

    @Override // com.crrepa.band.my.profile.wechatsport.c
    public void saveSuccess() {
        r0.showLong(this, getString(R.string.qr_code_save_success));
        f.startApp(this, "com.tencent.mm");
    }

    @Override // com.crrepa.band.my.profile.wechatsport.c
    public void showNetError(int i8) {
        r0.showLong(this, getString(i8));
    }

    @Override // com.crrepa.band.my.profile.wechatsport.c
    public void showNotBoundBand() {
        this.binding.wechatNotBoundBand.wechatNotBoundBand.setVisibility(0);
        setActivityTitle(R.string.wechat_sport);
    }

    @Override // com.crrepa.band.my.profile.wechatsport.c
    public void showQrCode() {
        this.binding.wechatSportQrCodeView.wechatSportQrCode.setVisibility(0);
        setActivityTitle(R.string.wechat_sport_access);
    }
}
