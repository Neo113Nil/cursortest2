package y1;

import android.annotation.SuppressLint;
import android.widget.RadioGroup;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceTimePreviewBinding;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceTimeStyleBinding;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import z1.i;

/* loaded from: classes2.dex */
public class b {
    private i numberLayoutDelegate;
    private final LayoutNewWatchFaceTimePreviewBinding timePreviewBinding;
    private CRPWatchFaceTimeStyle timeStyle;
    private final LayoutNewWatchFaceTimeStyleBinding timeStyleBinding;
    private final CRPWatchFaceType watchFaceType;

    public b(LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding, LayoutNewWatchFaceTimeStyleBinding layoutNewWatchFaceTimeStyleBinding, CRPWatchFaceType cRPWatchFaceType) {
        this.timePreviewBinding = layoutNewWatchFaceTimePreviewBinding;
        this.timeStyleBinding = layoutNewWatchFaceTimeStyleBinding;
        this.watchFaceType = cRPWatchFaceType;
        initDelegate();
        CRPWatchFaceTimeStyle timeStyle = c.getTimeStyle(cRPWatchFaceType);
        this.timeStyle = timeStyle;
        if (timeStyle == null) {
            layoutNewWatchFaceTimeStyleBinding.tvTitle.setVisibility(8);
            layoutNewWatchFaceTimeStyleBinding.rgTimeStyle.setVisibility(8);
        } else {
            initListener();
            renderTimeStyle();
        }
    }

    private void initDelegate() {
        this.numberLayoutDelegate = new i(this.watchFaceType, this.timePreviewBinding, this.timeStyleBinding.includeNumberPicker);
    }

    @SuppressLint({"NonConstantResourceId"})
    private void initListener() {
        this.timeStyleBinding.rgTimeStyle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: y1.a
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                b.this.lambda$initListener$0(radioGroup, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(RadioGroup radioGroup, int i8) {
        switch (i8) {
            case R.id.rb_time_style_clock /* 2131363321 */:
                this.timeStyle = CRPWatchFaceTimeStyle.CLASS;
                break;
            case R.id.rb_time_style_number /* 2131363322 */:
                this.timeStyle = CRPWatchFaceTimeStyle.NUMBER;
                break;
        }
        renderTimeStyle();
    }

    public CRPWatchFaceTimeStyle getTimeStyle() {
        return this.timeStyle;
    }

    public boolean isClockStyle() {
        CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle = this.timeStyle;
        return cRPWatchFaceTimeStyle != null && cRPWatchFaceTimeStyle == CRPWatchFaceTimeStyle.CLASS;
    }

    public boolean isNumberStyle() {
        CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle = this.timeStyle;
        return cRPWatchFaceTimeStyle != null && cRPWatchFaceTimeStyle == CRPWatchFaceTimeStyle.NUMBER;
    }

    public boolean isTimeStyleChanged() {
        return !isTimeStyleNotChanged();
    }

    public boolean isTimeStyleNotChanged() {
        CRPWatchFaceTimeStyle timeStyle = c.getTimeStyle(this.watchFaceType);
        return timeStyle == null || this.timeStyle == timeStyle;
    }

    public void renderEditStatus(boolean z7) {
        this.numberLayoutDelegate.renderEditState(z7);
        this.timeStyleBinding.rbTimeStyleNumber.setEnabled(z7);
        this.timeStyleBinding.rbTimeStyleClock.setEnabled(z7);
    }

    public void renderTimePreview() {
        if (isNumberStyle()) {
            this.timePreviewBinding.dragLayout.setVisibility(0);
            this.timePreviewBinding.ivClockPointer.setVisibility(8);
            this.timeStyleBinding.includeNumberPicker.root.setVisibility(0);
        } else {
            this.timePreviewBinding.dragLayout.setVisibility(8);
            this.timePreviewBinding.ivClockPointer.setVisibility(0);
            this.timeStyleBinding.includeNumberPicker.root.setVisibility(8);
        }
    }

    public void renderTimeStyle() {
        if (isNumberStyle()) {
            this.timeStyleBinding.rbTimeStyleNumber.setChecked(true);
        } else {
            this.timeStyleBinding.rbTimeStyleClock.setChecked(true);
        }
        renderTimePreview();
    }

    public void sendWatchFaceLayout() {
        if (isClockStyle()) {
            return;
        }
        i4.getInstance().sendHisiliconWatchFaceLayout(this.numberLayoutDelegate.getWatchFaceLayout());
    }

    public void sendWatchFaceTimeStyle() {
        if (getTimeStyle() == null) {
            return;
        }
        i4 i4Var = i4.getInstance();
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.PHOTO_WATCH_FACE;
        i4Var.sendHisiliconWatchFaceTimeStyle(cRPWatchFaceType, getTimeStyle());
        c.save(cRPWatchFaceType, getTimeStyle());
    }
}
