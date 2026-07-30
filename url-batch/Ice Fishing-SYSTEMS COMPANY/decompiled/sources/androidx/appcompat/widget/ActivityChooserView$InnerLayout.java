package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import m.Q0;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4685n = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Q0 o9 = Q0.o(context, attributeSet, f4685n);
        setBackgroundDrawable(o9.g(0));
        o9.q();
    }
}
