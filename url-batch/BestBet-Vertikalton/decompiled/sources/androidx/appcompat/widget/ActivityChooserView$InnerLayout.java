package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import c1.AbstractC0091d;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1718a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1718a);
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0091d.j(context, resourceId));
        obtainStyledAttributes.recycle();
    }
}
