package androidx.preference.internal;

import K.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: e, reason: collision with root package name */
    public int f1643e;

    /* renamed from: f, reason: collision with root package name */
    public int f1644f;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1643e = Integer.MAX_VALUE;
        this.f1644f = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f598h, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f1644f;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f1643e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i2);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i3);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i3 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i2) {
        this.f1644f = i2;
        super.setMaxHeight(i2);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i2) {
        this.f1643e = i2;
        super.setMaxWidth(i2);
    }
}
