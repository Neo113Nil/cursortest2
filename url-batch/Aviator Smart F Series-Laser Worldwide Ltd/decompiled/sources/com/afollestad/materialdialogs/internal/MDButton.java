package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R$dimen;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class MDButton extends TextView {
    private Drawable defaultBackground;
    private boolean stacked;
    private Drawable stackedBackground;
    private int stackedEndPadding;
    private GravityEnum stackedGravity;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stacked = false;
        init(context);
    }

    private void init(Context context) {
        this.stackedEndPadding = context.getResources().getDimensionPixelSize(R$dimen.md_dialog_frame_margin);
        this.stackedGravity = GravityEnum.END;
    }

    public void setAllCapsCompat(boolean z7) {
        setAllCaps(z7);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.defaultBackground = drawable;
        if (this.stacked) {
            return;
        }
        setStacked(false, true);
    }

    void setStacked(boolean z7, boolean z8) {
        if (this.stacked != z7 || z8) {
            setGravity(z7 ? this.stackedGravity.getGravityInt() | 16 : 17);
            setTextAlignment(z7 ? this.stackedGravity.getTextAlignment() : 4);
            com.afollestad.materialdialogs.util.a.setBackgroundCompat(this, z7 ? this.stackedBackground : this.defaultBackground);
            if (z7) {
                setPadding(this.stackedEndPadding, getPaddingTop(), this.stackedEndPadding, getPaddingBottom());
            }
            this.stacked = z7;
        }
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.stackedGravity = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.stackedBackground = drawable;
        if (this.stacked) {
            setStacked(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.stacked = false;
        init(context);
    }
}
