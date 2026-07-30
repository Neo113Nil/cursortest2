package com.crrepa.band.my.device.watchfacenew.delegate.displaymode;

import android.annotation.SuppressLint;
import android.widget.RadioGroup;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceDisplayModeForVideoBinding;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;

/* loaded from: classes2.dex */
public class e {
    private final LayoutNewWatchFaceDisplayModeForVideoBinding binding;
    private CRPVideoWatchFaceDisplayMode displayMode;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPVideoWatchFaceDisplayMode;

        static {
            int[] iArr = new int[CRPVideoWatchFaceDisplayMode.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPVideoWatchFaceDisplayMode = iArr;
            try {
                iArr[CRPVideoWatchFaceDisplayMode.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPVideoWatchFaceDisplayMode[CRPVideoWatchFaceDisplayMode.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(LayoutNewWatchFaceDisplayModeForVideoBinding layoutNewWatchFaceDisplayModeForVideoBinding) {
        this.binding = layoutNewWatchFaceDisplayModeForVideoBinding;
        CRPVideoWatchFaceDisplayMode videoDisplayMode = com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.getVideoDisplayMode();
        this.displayMode = videoDisplayMode;
        if (videoDisplayMode == null) {
            layoutNewWatchFaceDisplayModeForVideoBinding.llDisplayMode.setVisibility(8);
        } else {
            initListener();
            renderDisplayMode();
        }
    }

    @SuppressLint({"NonConstantResourceId"})
    private void initListener() {
        this.binding.rgDisplayMode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.displaymode.d
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                e.this.lambda$initListener$0(radioGroup, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(RadioGroup radioGroup, int i8) {
        switch (i8) {
            case R.id.rb_display_mode_loop /* 2131363316 */:
                this.displayMode = CRPVideoWatchFaceDisplayMode.LOOP;
                break;
            case R.id.rb_display_mode_once /* 2131363317 */:
                this.displayMode = CRPVideoWatchFaceDisplayMode.ONCE;
                break;
        }
    }

    public CRPVideoWatchFaceDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public boolean isOnceMode() {
        return this.displayMode == CRPVideoWatchFaceDisplayMode.ONCE;
    }

    public void renderDisplayMode() {
        int i8 = a.$SwitchMap$com$crrepa$ble$conn$type$CRPVideoWatchFaceDisplayMode[this.displayMode.ordinal()];
        if (i8 == 1) {
            this.binding.rbDisplayModeOnce.setChecked(true);
        } else {
            if (i8 != 2) {
                return;
            }
            this.binding.rbDisplayModeLoop.setChecked(true);
        }
    }

    public void renderEditStatus(boolean z7) {
        this.binding.rbDisplayModeOnce.setEnabled(z7);
        this.binding.rbDisplayModeLoop.setEnabled(z7);
    }
}
