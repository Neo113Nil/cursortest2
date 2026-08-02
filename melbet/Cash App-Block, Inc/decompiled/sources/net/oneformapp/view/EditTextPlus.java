package net.oneformapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.fillr.core.R$styleable;

/* loaded from: classes9.dex */
public class EditTextPlus extends AppCompatEditText {
    public EditTextPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditTextPlus);
        setFontVariant(context, obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        getTextSize();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (getParent() != null) {
            charSequence.toString();
            ((View) getParent()).getWidth();
        }
    }

    public void setFontVariant(Context context, String str) {
        int i = CustomFontMgr.$r8$clinit;
    }

    public EditTextPlus(Context context) {
        super(context);
        getTextSize();
    }

    public EditTextPlus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditTextPlus);
        setFontVariant(context, obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        getTextSize();
    }
}
