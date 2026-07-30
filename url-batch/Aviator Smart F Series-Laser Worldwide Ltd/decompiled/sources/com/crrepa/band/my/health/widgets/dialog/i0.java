package com.crrepa.band.my.health.widgets.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.DialogWaterAddBinding;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.health.widgets.WaveHelper;

/* loaded from: classes2.dex */
public class i0 extends Dialog {
    private DialogWaterAddBinding binding;
    private a doneClickListener;
    private float initY;
    private int intervalIntake;
    private WaveHelper mWaveHelper;
    private int maxIntake;
    private int minIntake;
    private int scrollIntake;
    private int selectIntake;
    private String unitText;

    public interface a {
        void onDone(int i8);
    }

    public i0(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.selectIntake = 0;
        this.minIntake = 0;
        this.maxIntake = 0;
        this.intervalIntake = 0;
    }

    private void initData() {
        this.unitText = WaterProvider.getWaterUnit(getContext());
        this.minIntake = WaterProvider.getMinIntake();
        this.maxIntake = WaterProvider.getMaxIntake();
        this.intervalIntake = WaterProvider.getIntervalIntake();
        this.mWaveHelper = new WaveHelper(this.binding.wvWaterIntake);
        updateWaterIntake(this.selectIntake);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getContext().getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initListener() {
        this.binding.wvWaterIntake.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.health.widgets.dialog.f0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initListener$0;
                lambda$initListener$0 = i0.this.lambda$initListener$0(view, motionEvent);
                return lambda$initListener$0;
            }
        });
        this.binding.tvAddWater.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i0.this.lambda$initListener$1(view);
            }
        });
        this.binding.ivDialogClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i0.this.lambda$initListener$2(view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    private void initView() {
        DialogWaterAddBinding inflate = DialogWaterAddBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvAddWater.setText(getContext().getString(R.string.water_symbol_add) + getContext().getString(R.string.water_add));
        initData();
        initLayout();
        initWaveView();
    }

    private void initWaveView() {
        Drawable drawable = ContextCompat.getDrawable(getContext(), R$drawable.water_intake_bg);
        if (drawable != null) {
            drawable.setColorFilter(ContextCompat.getColor(getContext(), R.color.water_main_2_cup), PorterDuff.Mode.SRC_ATOP);
            this.binding.wvWaterIntake.setBackground(drawable);
        }
        this.mWaveHelper.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r3 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ boolean lambda$initListener$0(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    seekTo(motionEvent.getY());
                }
            }
            this.selectIntake = this.scrollIntake;
            sendNestedScrollChangeEvent(true);
        } else {
            seekTo(motionEvent.getY());
            sendNestedScrollChangeEvent(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        a aVar = this.doneClickListener;
        if (aVar != null) {
            aVar.onDone(this.selectIntake);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        dismiss();
    }

    private void move(float f8) {
        int round = Math.round(this.selectIntake - (this.maxIntake * (f8 / this.binding.wvWaterIntake.getHeight())));
        this.scrollIntake = round;
        if (round > this.minIntake && round < this.maxIntake) {
            this.scrollIntake = Math.round((round * 1.0f) / this.intervalIntake) * this.intervalIntake;
        }
        int min = Math.min(this.scrollIntake, this.maxIntake);
        this.scrollIntake = min;
        int max = Math.max(min, this.minIntake);
        this.scrollIntake = max;
        updateWaterIntake(max);
    }

    private void seekTo(float f8) {
        int round = Math.round(this.maxIntake * (1.0f - (f8 / this.binding.wvWaterIntake.getHeight())));
        this.scrollIntake = round;
        if (round > this.minIntake && round < this.maxIntake) {
            this.scrollIntake = Math.round((round * 1.0f) / this.intervalIntake) * this.intervalIntake;
        }
        int min = Math.min(this.scrollIntake, this.maxIntake);
        this.scrollIntake = min;
        int max = Math.max(min, this.minIntake);
        this.scrollIntake = max;
        updateWaterIntake(max);
    }

    private void sendNestedScrollChangeEvent(boolean z7) {
        org.greenrobot.eventbus.c.getDefault().post(new l0.h(z7));
    }

    private void updateWaterIntake(int i8) {
        this.binding.tvWaterIntake.setText(i8 + this.unitText);
        this.mWaveHelper.setWaterLevelRatio((((float) i8) * 1.0f) / ((float) this.maxIntake));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.mWaveHelper.end();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initListener();
    }

    public i0 setDefaultIntake(int i8) {
        this.selectIntake = i8;
        return this;
    }

    public i0 setOnDoneClickListener(a aVar) {
        this.doneClickListener = aVar;
        return this;
    }
}
