package z1;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceTimePreviewBinding;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceTimeStyleNumberPickerBinding;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class i implements a {
    private final LayoutNewWatchFaceTimeStyleNumberPickerBinding numberPickerBinding;
    private final k presenter;
    private final LayoutNewWatchFaceTimePreviewBinding timePreviewBinding;

    public i(CRPWatchFaceType cRPWatchFaceType, final LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding, LayoutNewWatchFaceTimeStyleNumberPickerBinding layoutNewWatchFaceTimeStyleNumberPickerBinding) {
        this.timePreviewBinding = layoutNewWatchFaceTimePreviewBinding;
        this.numberPickerBinding = layoutNewWatchFaceTimeStyleNumberPickerBinding;
        initViewListener();
        this.presenter = new k(this, cRPWatchFaceType);
        layoutNewWatchFaceTimePreviewBinding.rlRoot.post(new Runnable() { // from class: z1.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.lambda$new$0(layoutNewWatchFaceTimePreviewBinding);
            }
        });
    }

    @SuppressLint({"NonConstantResourceId"})
    private void initViewListener() {
        LayoutNewWatchFaceTimeStyleNumberPickerBinding layoutNewWatchFaceTimeStyleNumberPickerBinding = this.numberPickerBinding;
        showWheelPicker(layoutNewWatchFaceTimeStyleNumberPickerBinding.ivTimeLabelPositionArrow, layoutNewWatchFaceTimeStyleNumberPickerBinding.wpTimePosition, layoutNewWatchFaceTimeStyleNumberPickerBinding.rlTimeLabelPosition, layoutNewWatchFaceTimeStyleNumberPickerBinding.rlWp, R.array.watch_face_new_position_array);
        this.numberPickerBinding.wpTimePosition.setOnItemSelectedListener(new WheelPicker.a() { // from class: z1.c
            @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
            public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                i.this.lambda$initViewListener$1(wheelPicker, obj, i8);
            }
        });
        LayoutNewWatchFaceTimeStyleNumberPickerBinding layoutNewWatchFaceTimeStyleNumberPickerBinding2 = this.numberPickerBinding;
        showWheelPicker(layoutNewWatchFaceTimeStyleNumberPickerBinding2.ivTopLabelArrow, layoutNewWatchFaceTimeStyleNumberPickerBinding2.wpTimeTop, layoutNewWatchFaceTimeStyleNumberPickerBinding2.rlTopLabel, layoutNewWatchFaceTimeStyleNumberPickerBinding2.rlTopWp, R.array.watch_face_content_array);
        this.numberPickerBinding.wpTimeTop.setOnItemSelectedListener(new WheelPicker.a() { // from class: z1.d
            @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
            public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                i.this.lambda$initViewListener$2(wheelPicker, obj, i8);
            }
        });
        LayoutNewWatchFaceTimeStyleNumberPickerBinding layoutNewWatchFaceTimeStyleNumberPickerBinding3 = this.numberPickerBinding;
        showWheelPicker(layoutNewWatchFaceTimeStyleNumberPickerBinding3.ivBottomLabelArrow, layoutNewWatchFaceTimeStyleNumberPickerBinding3.wpTimeBottom, layoutNewWatchFaceTimeStyleNumberPickerBinding3.rlBottomLabel, layoutNewWatchFaceTimeStyleNumberPickerBinding3.rlBottomWp, R.array.watch_face_content_array);
        this.numberPickerBinding.wpTimeBottom.setOnItemSelectedListener(new WheelPicker.a() { // from class: z1.e
            @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
            public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                i.this.lambda$initViewListener$3(wheelPicker, obj, i8);
            }
        });
        this.numberPickerBinding.includeColorPicker.rgColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: z1.f
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                i.this.lambda$initViewListener$4(radioGroup, i8);
            }
        });
        this.timePreviewBinding.dragLayout.setDragListener(new DraggableLinearLayout.a() { // from class: z1.g
            @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout.a
            public final void onActionUp(int i8, int i9) {
                i.this.lambda$initViewListener$5(i8, i9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$1(WheelPicker wheelPicker, Object obj, int i8) {
        renderLayoutInfoPositionType(i8 == 2);
        this.numberPickerBinding.tvTimeLabelPosition.setText(w1.j.getWatchFaceNewTimePosition(com.moyoung.dafit.module.common.utils.d.get(), 2));
        this.presenter.setLayoutInfoPositionType(i8);
        this.presenter.updateTimeLabelPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$2(WheelPicker wheelPicker, Object obj, int i8) {
        this.presenter.updateTopLabelContent(i8);
        this.presenter.updateTimeLabelPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$3(WheelPicker wheelPicker, Object obj, int i8) {
        this.presenter.updateBottomLabelContent(i8);
        this.presenter.updateTimeLabelPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$4(RadioGroup radioGroup, int i8) {
        int i9;
        switch (i8) {
            case R.id.rb_color_black /* 2131363307 */:
                i9 = 1;
                break;
            case R.id.rb_color_blue /* 2131363308 */:
                i9 = 6;
                break;
            case R.id.rb_color_green /* 2131363309 */:
                i9 = 8;
                break;
            case R.id.rb_color_indigo /* 2131363310 */:
                i9 = 7;
                break;
            case R.id.rb_color_origin /* 2131363311 */:
                i9 = 3;
                break;
            case R.id.rb_color_purple /* 2131363312 */:
                i9 = 5;
                break;
            case R.id.rb_color_red /* 2131363313 */:
                i9 = 4;
                break;
            case R.id.rb_color_white /* 2131363314 */:
            default:
                i9 = 0;
                break;
            case R.id.rb_color_yellow /* 2131363315 */:
                i9 = 2;
                break;
        }
        this.presenter.updateLabelTextColor(w1.j.getWatchFaceTextColorInt(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$5(int i8, int i9) {
        if (this.numberPickerBinding.tvTimeLabelPositionTips.getVisibility() != 0) {
            return;
        }
        this.presenter.setLayoutInfoPositionXY(this.timePreviewBinding.ivTopLabel.getVisibility() == 0, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding) {
        this.presenter.showWatchFaceLayout(layoutNewWatchFaceTimePreviewBinding.rlRoot.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWheelPicker$6(ViewGroup viewGroup, ObjectAnimator objectAnimator, WheelPicker wheelPicker, View view) {
        if (viewGroup.isShown()) {
            objectAnimator.reverse();
        } else {
            this.numberPickerBinding.ivTimeLabelPositionArrow.setRotation(0.0f);
            this.numberPickerBinding.ivTopLabelArrow.setRotation(0.0f);
            this.numberPickerBinding.ivBottomLabelArrow.setRotation(0.0f);
            this.numberPickerBinding.rlWp.setVisibility(8);
            this.numberPickerBinding.rlTopWp.setVisibility(8);
            this.numberPickerBinding.rlBottomWp.setVisibility(8);
            objectAnimator.start();
        }
        int id = view.getId();
        if (id == R.id.rl_bottom_label) {
            wheelPicker.setSelectedItemPosition(this.presenter.getBottomLabelContent());
        } else if (id == R.id.rl_time_label_position) {
            wheelPicker.setSelectedItemPosition(this.presenter.getLayoutInfoPositionType());
        } else if (id == R.id.rl_top_label) {
            wheelPicker.setSelectedItemPosition(this.presenter.getTopLabelContent());
        }
        viewGroup.setVisibility(viewGroup.isShown() ? 8 : 0);
    }

    private void renderLabelContent(int i8, TextView textView, ImageView imageView) {
        textView.setText(w1.j.getWatchFaceTimeContent(com.moyoung.dafit.module.common.utils.d.get(), i8));
        int watchFaceContentResources = w1.j.getWatchFaceContentResources(i8);
        if (watchFaceContentResources < 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(watchFaceContentResources);
        setIvTint(this.presenter.getLabelTextColor(), imageView);
    }

    private void renderLayoutInfoPositionType(boolean z7) {
        this.timePreviewBinding.dragLayout.setDragEnabled(z7);
        this.numberPickerBinding.tvTimeLabelPositionTips.setVisibility(z7 ? 0 : 8);
    }

    private void setIvTint(@ColorInt int i8, ImageView imageView) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable).mutate(), i8);
    }

    @SuppressLint({"NonConstantResourceId"})
    private void showWheelPicker(ImageView imageView, final WheelPicker wheelPicker, ViewGroup viewGroup, final ViewGroup viewGroup2, int i8) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 90.0f);
        ofFloat.setDuration(300L);
        wheelPicker.setData(Arrays.asList(com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(i8)));
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: z1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.this.lambda$showWheelPicker$6(viewGroup2, ofFloat, wheelPicker, view);
            }
        });
    }

    public CRPHisiliconWatchFaceLayoutInfo getWatchFaceLayout() {
        return this.presenter.getWatchFaceLayout();
    }

    @Override // z1.a
    public void renderBottomLabelContent(int i8) {
        renderLabelContent(i8, this.numberPickerBinding.tvBottomLabel, this.timePreviewBinding.ivBottomLabel);
    }

    @Override // z1.a
    public void renderColorRadioBtn(int i8) {
        RadioGroup radioGroup = this.numberPickerBinding.includeColorPicker.rgColor;
        switch (w1.j.getWatchFaceTextARGBColorIndex(i8)) {
            case 0:
                radioGroup.check(R.id.rb_color_white);
                break;
            case 1:
                radioGroup.check(R.id.rb_color_black);
                break;
            case 2:
                radioGroup.check(R.id.rb_color_yellow);
                break;
            case 3:
                radioGroup.check(R.id.rb_color_origin);
                break;
            case 4:
                radioGroup.check(R.id.rb_color_red);
                break;
            case 5:
                radioGroup.check(R.id.rb_color_purple);
                break;
            case 6:
                radioGroup.check(R.id.rb_color_blue);
                break;
            case 7:
                radioGroup.check(R.id.rb_color_indigo);
                break;
            case 8:
                radioGroup.check(R.id.rb_color_green);
                break;
        }
    }

    @Override // z1.a
    public void renderDragViewPosition(int i8) {
        this.numberPickerBinding.tvTimeLabelPosition.setText(w1.j.getWatchFaceNewTimePosition(com.moyoung.dafit.module.common.utils.d.get(), i8));
        if (i8 == 2) {
            renderLayoutInfoPositionType(true);
        } else {
            renderLayoutInfoPositionType(false);
            this.timePreviewBinding.dragLayout.setCenterInHorizontal(i8 == 0);
        }
    }

    @Override // z1.a
    public void renderDragViewPositionXY(int i8, int i9) {
        renderLayoutInfoPositionType(true);
        this.timePreviewBinding.dragLayout.setPositionInParent(i8, i9);
        this.numberPickerBinding.tvTimeLabelPosition.setText(w1.j.getWatchFaceNewTimePosition(com.moyoung.dafit.module.common.utils.d.get(), 2));
    }

    @Override // z1.a
    public void renderEditState(boolean z7) {
        this.numberPickerBinding.rlTimeLabelPosition.setEnabled(z7);
        this.numberPickerBinding.rlTopLabel.setEnabled(z7);
        this.numberPickerBinding.rlBottomLabel.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorWhite.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorBlack.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorYellow.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorOrigin.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorRed.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorPurple.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorBlue.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorIndigo.setEnabled(z7);
        this.numberPickerBinding.includeColorPicker.rbColorGreen.setEnabled(z7);
    }

    @Override // z1.a
    public void renderLabelTextColor(int i8) {
        setIvTint(i8, this.timePreviewBinding.ivTopLabel);
        setIvTint(i8, this.timePreviewBinding.ivTimeLabel);
        setIvTint(i8, this.timePreviewBinding.ivBottomLabel);
    }

    @Override // z1.a
    public void renderTopLabelContent(int i8) {
        renderLabelContent(i8, this.numberPickerBinding.tvTopLabel, this.timePreviewBinding.ivTopLabel);
    }
}
