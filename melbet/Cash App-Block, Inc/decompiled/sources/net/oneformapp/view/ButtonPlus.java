package net.oneformapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.fillr.core.R$styleable;

/* loaded from: classes9.dex */
public class ButtonPlus extends AppCompatButton {
    public ButtonPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonPlus);
        setFontVariant(context, obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }

    public void setFontVariant(Context context, String str) {
        int i = CustomFontMgr.$r8$clinit;
    }

    public ButtonPlus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonPlus);
        setFontVariant(context, obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }
}
