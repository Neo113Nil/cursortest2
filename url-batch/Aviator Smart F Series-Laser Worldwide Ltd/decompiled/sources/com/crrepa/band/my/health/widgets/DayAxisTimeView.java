package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.databinding.DayAxisTimeViewBinding;

/* loaded from: classes2.dex */
public class DayAxisTimeView extends LinearLayout {
    private DayAxisTimeViewBinding binding;

    public DayAxisTimeView(Context context) {
        this(context, null);
    }

    public void setTextColor(@ColorRes int i8) {
        int color = ContextCompat.getColor(getContext(), i8);
        this.binding.tvZero.setTextColor(color);
        this.binding.tvSix.setTextColor(color);
        this.binding.tvTwelve.setTextColor(color);
        this.binding.tvEighteen.setTextColor(color);
        this.binding.tvTwentyFour.setTextColor(color);
    }

    public DayAxisTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DayAxisTimeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.binding = DayAxisTimeViewBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
