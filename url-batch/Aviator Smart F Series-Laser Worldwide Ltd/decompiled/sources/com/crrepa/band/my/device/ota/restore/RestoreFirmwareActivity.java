package com.crrepa.band.my.device.ota.restore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.ActivityRestoreFirmwareBinding;
import com.crrepa.ble.ota.goodix.RestoreFirmwareChangeListener;
import com.crrepa.ble.ota.goodix.RestoreFirmwareController;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* loaded from: classes2.dex */
public class RestoreFirmwareActivity extends BaseActivity {
    private static final String DEVICE_ADDRESS = "device_address";
    private ActivityRestoreFirmwareBinding binding;
    private final com.crrepa.band.my.device.ota.anim.a upgradeAnimation = new com.crrepa.band.my.device.ota.anim.a();
    private boolean startRestore = false;

    class a implements RestoreFirmwareChangeListener {
        a() {
        }

        @Override // com.crrepa.ble.ota.goodix.RestoreFirmwareChangeListener
        public void onComplete() {
            RestoreFirmwareActivity.this.restoreComplete();
        }

        @Override // com.crrepa.ble.ota.goodix.RestoreFirmwareChangeListener
        public void onError(int i8) {
            RestoreFirmwareActivity.this.restoreError(i8);
        }

        @Override // com.crrepa.ble.ota.goodix.RestoreFirmwareChangeListener
        public void onReadBootInfo() {
            RestoreFirmwareActivity restoreFirmwareActivity = RestoreFirmwareActivity.this;
            restoreFirmwareActivity.updateRestoreState(restoreFirmwareActivity.getString(R.string.restore_dfu_band));
        }

        @Override // com.crrepa.ble.ota.goodix.RestoreFirmwareChangeListener
        public void onSendBootInfo() {
        }
    }

    public static Intent getCallingIntent(Context context, String str) {
        f.d("restore address: " + str);
        Intent intent = new Intent(context, (Class<?>) RestoreFirmwareActivity.class);
        intent.putExtra(DEVICE_ADDRESS, str);
        intent.setFlags(268435456);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        if (this.startRestore) {
            return;
        }
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        startRestore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$restoreComplete$2(Integer num) {
        stopUpdateAnimation();
        updateRestoreState(getString(R.string.restore_complete));
        r0.showLong(this, getString(R.string.restore_complete));
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$restoreError$3(int i8, Integer num) {
        stopUpdateAnimation();
        updateRestoreState(getString(R.string.restore_error) + ": " + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateRestoreState$4(String str) {
        this.binding.tvRestoreState.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void restoreComplete() {
        this.startRestore = false;
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ota.restore.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RestoreFirmwareActivity.this.lambda$restoreComplete$2((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void restoreError(final int i8) {
        this.startRestore = false;
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ota.restore.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RestoreFirmwareActivity.this.lambda$restoreError$3(i8, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void updateRestoreState(String str) {
        Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ota.restore.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RestoreFirmwareActivity.this.lambda$updateRestoreState$4((String) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_restore_firmware);
        ActivityRestoreFirmwareBinding inflate = ActivityRestoreFirmwareBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        inflate.titleBar.tvTitle.setText(R.string.firmware_upgrade);
        this.binding.titleBar.btnTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.restore.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestoreFirmwareActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.btnFirmwareRestore.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.restore.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestoreFirmwareActivity.this.lambda$onCreate$1(view);
            }
        });
    }

    public void playUpdateAnimation() {
        this.binding.ivRestoreAnimation.setVisibility(0);
        this.upgradeAnimation.play(this.binding.ivRestoreAnimation);
    }

    public void startRestore() {
        String stringExtra = getIntent().getStringExtra(DEVICE_ADDRESS);
        if (TextUtils.isEmpty(stringExtra)) {
            r0.showLong(this, getString(R.string.restore_error));
            finish();
            return;
        }
        this.startRestore = true;
        playUpdateAnimation();
        this.binding.tvRestoreState.setVisibility(0);
        updateRestoreState(getString(R.string.connect_dfu_band) + ": " + stringExtra);
        this.binding.btnFirmwareRestore.setVisibility(8);
        RestoreFirmwareController restoreFirmwareController = RestoreFirmwareController.getInstance();
        restoreFirmwareController.setListener(new a());
        restoreFirmwareController.start(stringExtra);
    }

    public void stopUpdateAnimation() {
        this.upgradeAnimation.stop();
    }
}
