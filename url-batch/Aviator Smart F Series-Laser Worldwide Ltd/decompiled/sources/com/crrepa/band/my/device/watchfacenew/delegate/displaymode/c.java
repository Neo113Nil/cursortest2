package com.crrepa.band.my.device.watchfacenew.delegate.displaymode;

import android.annotation.SuppressLint;
import android.widget.RadioGroup;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceDisplayModeForCustomPhotoBinding;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;

/* loaded from: classes2.dex */
public class c {
    private final LayoutNewWatchFaceDisplayModeForCustomPhotoBinding binding;
    private CRPPhotoWatchFaceDisplayMode displayMode;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPPhotoWatchFaceDisplayMode;

        static {
            int[] iArr = new int[CRPPhotoWatchFaceDisplayMode.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPPhotoWatchFaceDisplayMode = iArr;
            try {
                iArr[CRPPhotoWatchFaceDisplayMode.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPPhotoWatchFaceDisplayMode[CRPPhotoWatchFaceDisplayMode.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPPhotoWatchFaceDisplayMode[CRPPhotoWatchFaceDisplayMode.RANDOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(LayoutNewWatchFaceDisplayModeForCustomPhotoBinding layoutNewWatchFaceDisplayModeForCustomPhotoBinding) {
        this.binding = layoutNewWatchFaceDisplayModeForCustomPhotoBinding;
        initListener();
        this.displayMode = com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.getPhotoDisplayMode();
        renderDisplayMode();
    }

    @SuppressLint({"NonConstantResourceId"})
    private void initListener() {
        this.binding.rgDisplayMode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.displaymode.b
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                c.this.lambda$initListener$0(radioGroup, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(RadioGroup radioGroup, int i8) {
        switch (i8) {
            case R.id.rb_display_mode_sequential /* 2131363318 */:
                this.displayMode = CRPPhotoWatchFaceDisplayMode.SEQUENCE;
                break;
            case R.id.rb_display_mode_singleton /* 2131363319 */:
                this.displayMode = CRPPhotoWatchFaceDisplayMode.FIXED;
                break;
            case R.id.rb_display_mode_stochastic /* 2131363320 */:
                this.displayMode = CRPPhotoWatchFaceDisplayMode.RANDOM;
                break;
        }
    }

    public CRPPhotoWatchFaceDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public boolean isFixedMode() {
        return this.displayMode == CRPPhotoWatchFaceDisplayMode.FIXED;
    }

    public boolean isModeChanged() {
        CRPPhotoWatchFaceDisplayMode photoDisplayMode = com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.getPhotoDisplayMode();
        return (photoDisplayMode == null && this.displayMode != null) || this.displayMode != photoDisplayMode;
    }

    public boolean isModeNotChanged() {
        return !isModeChanged();
    }

    public void renderDisplayMode() {
        int i8 = a.$SwitchMap$com$crrepa$ble$conn$type$CRPPhotoWatchFaceDisplayMode[this.displayMode.ordinal()];
        if (i8 == 1) {
            this.binding.rbDisplayModeSingleton.setChecked(true);
        } else if (i8 == 2) {
            this.binding.rbDisplayModeSequential.setChecked(true);
        } else {
            if (i8 != 3) {
                return;
            }
            this.binding.rbDisplayModeStochastic.setChecked(true);
        }
    }

    public void renderEditStatus(boolean z7) {
        this.binding.rbDisplayModeSequential.setEnabled(z7);
        this.binding.rbDisplayModeSingleton.setEnabled(z7);
        this.binding.rbDisplayModeStochastic.setEnabled(z7);
    }

    public void sendPhotoWatchFaceDisplayMode() {
        if (m.isHisiliconPlatform()) {
            i4.getInstance().sendHisiliconPhotoWatchFaceDisplayMode(getDisplayMode());
        }
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.savePhotoDisplayMode(getDisplayMode());
    }
}
