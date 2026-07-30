package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import java.util.List;

/* loaded from: classes2.dex */
public class CustomAxisView extends LinearLayout {
    private final Context context;
    private int textAlignment;
    private int textColor;
    private int textSize;
    private Typeface typeface;

    public CustomAxisView(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    private TextView createTextView(String str, float f8) {
        TextView textView = new TextView(this.context);
        textView.setText(str);
        textView.setTextColor(ContextCompat.getColor(this.context, this.textColor));
        textView.setTextSize(this.textSize);
        textView.setTypeface(this.typeface);
        textView.setTextAlignment(this.textAlignment);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        if (f8 != 0.0f) {
            layoutParams.weight = f8 * 100.0f;
        }
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private void initView() {
        setOrientation(0);
        setGravity(17);
        this.textColor = R.color.black;
        this.textSize = 10;
        this.typeface = Typeface.DEFAULT;
        this.textAlignment = 2;
    }

    public void setData(List<String> list, float[] fArr) {
        removeAllViews();
        for (int i8 = 0; i8 < list.size(); i8++) {
            addView(createTextView(list.get(i8), fArr[i8]));
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i8) {
        this.textAlignment = i8;
    }

    public void setTextColor(int i8) {
        this.textColor = i8;
    }

    public void setTextSize(int i8) {
        this.textSize = i8;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public CustomAxisView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        initView();
    }

    public CustomAxisView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.context = context;
        initView();
    }
}
