package net.oneformapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.fillr.core.R$styleable;

/* loaded from: classes9.dex */
public class TextViewPlus extends AppCompatTextView {
    public TextViewPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextViewPlus);
        obtainStyledAttributes.getString(0);
        int i = CustomFontMgr.$r8$clinit;
        obtainStyledAttributes.recycle();
    }
}
