package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.databinding.BoDisplayViewBinding;

/* loaded from: classes2.dex */
public class BoDisplayView extends LinearLayout {
    private BoDisplayViewBinding binding;

    public BoDisplayView(Context context) {
        this(context, null);
    }

    public void setBo(int i8) {
        this.binding.pbBo.setProgress(i8);
    }

    public void setBottomText(String... strArr) {
        if (strArr == null || strArr.length < 5) {
            return;
        }
        this.binding.tvEighty.setText(strArr[0]);
        this.binding.tvEightyFive.setText(strArr[1]);
        this.binding.tvNinety.setText(strArr[2]);
        this.binding.tvNinetyFive.setText(strArr[3]);
        this.binding.tvHundred.setText(strArr[4]);
    }

    public void setBottomTextColor(@ColorRes int i8) {
        int color = ContextCompat.getColor(getContext(), i8);
        this.binding.tvEighty.setTextColor(color);
        this.binding.tvEightyFive.setTextColor(color);
        this.binding.tvNinety.setTextColor(color);
        this.binding.tvNinetyFive.setTextColor(color);
        this.binding.tvHundred.setTextColor(color);
    }

    public void setProgressDrawable(int i8) {
        this.binding.pbBo.setProgressDrawable(ContextCompat.getDrawable(getContext(), i8));
    }

    public BoDisplayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoDisplayView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.binding = BoDisplayViewBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
