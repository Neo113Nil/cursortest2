package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.aiv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PreferenceImageView extends ImageView {
    private int a;
    private int b;

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.j, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public final int getMaxHeight() {
        return this.b;
    }

    @Override // android.widget.ImageView
    public final int getMaxWidth() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r0 == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        int mode;
        int i3;
        int mode2 = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                mode2 = 0;
            }
            mode = View.MeasureSpec.getMode(i2);
            if (mode != Integer.MIN_VALUE) {
                i4 = mode;
            }
            int size = View.MeasureSpec.getSize(i2);
            i3 = this.b;
            if (i3 != Integer.MAX_VALUE && (i3 < size || i4 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i5 = this.a;
        if (i5 != Integer.MAX_VALUE && (i5 < size2 || mode2 == 0)) {
            i = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
        }
        int size3 = View.MeasureSpec.getSize(i2);
        i3 = this.b;
        if (i3 != Integer.MAX_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView
    public final void setMaxHeight(int i) {
        this.b = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public final void setMaxWidth(int i) {
        this.a = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context) {
        this(context, null);
    }
}
