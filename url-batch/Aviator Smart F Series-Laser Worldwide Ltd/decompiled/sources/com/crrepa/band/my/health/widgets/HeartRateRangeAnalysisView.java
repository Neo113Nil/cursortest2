package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.HeartRateRangeAnalysisViewBinding;

/* loaded from: classes2.dex */
public class HeartRateRangeAnalysisView extends LinearLayout {
    private final HeartRateRangeAnalysisViewBinding binding;

    public HeartRateRangeAnalysisView(Context context) {
        this(context, null);
    }

    private String getTime(Context context, int i8, int i9) {
        int i10 = i8 * i9;
        int i11 = i10 / 60;
        StringBuilder sb = new StringBuilder();
        if (i11 <= 0 && i10 > 0) {
            sb.append("<");
        }
        if (i10 % 60 > 0) {
            i11++;
        }
        if (i11 < 60) {
            sb.append(i11);
            sb.append(context.getString(R.string.minute_unit));
        } else {
            int i12 = i11 / 60;
            int i13 = i11 % 60;
            sb.append(i12);
            sb.append(context.getString(R.string.hour));
            if (i13 > 0) {
                sb.append(i13);
                sb.append(context.getString(R.string.minute));
            }
        }
        return sb.toString();
    }

    private void setProgressMaxValue(int[] iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        this.binding.lightProgressbar.setMax(i8);
        this.binding.wightProgressbar.setMax(i8);
        this.binding.aerobicProgressbar.setMax(i8);
        this.binding.anaerobicProgressbar.setMax(i8);
        this.binding.maxProgressbar.setMax(i8);
    }

    private void setValue(ProgressBar progressBar, TextView textView, int i8, int i9) {
        if (i8 < 0) {
            i8 = 0;
        }
        textView.setText(getTime(getContext(), i8, i9));
        progressBar.setProgress(i8);
    }

    public void setHeartRateRangeData(int i8, int... iArr) {
        if (iArr == null || iArr.length < 5) {
            return;
        }
        setProgressMaxValue(iArr);
        HeartRateRangeAnalysisViewBinding heartRateRangeAnalysisViewBinding = this.binding;
        setValue(heartRateRangeAnalysisViewBinding.lightProgressbar, heartRateRangeAnalysisViewBinding.tvLightTime, iArr[0], i8);
        HeartRateRangeAnalysisViewBinding heartRateRangeAnalysisViewBinding2 = this.binding;
        setValue(heartRateRangeAnalysisViewBinding2.wightProgressbar, heartRateRangeAnalysisViewBinding2.tvWightTime, iArr[1], i8);
        HeartRateRangeAnalysisViewBinding heartRateRangeAnalysisViewBinding3 = this.binding;
        setValue(heartRateRangeAnalysisViewBinding3.aerobicProgressbar, heartRateRangeAnalysisViewBinding3.tvAerobicTime, iArr[2], i8);
        HeartRateRangeAnalysisViewBinding heartRateRangeAnalysisViewBinding4 = this.binding;
        setValue(heartRateRangeAnalysisViewBinding4.anaerobicProgressbar, heartRateRangeAnalysisViewBinding4.tvAnaerobicTime, iArr[3], i8);
        HeartRateRangeAnalysisViewBinding heartRateRangeAnalysisViewBinding5 = this.binding;
        setValue(heartRateRangeAnalysisViewBinding5.maxProgressbar, heartRateRangeAnalysisViewBinding5.tvMaxTime, iArr[4], i8);
    }

    public HeartRateRangeAnalysisView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartRateRangeAnalysisView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.binding = HeartRateRangeAnalysisViewBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
