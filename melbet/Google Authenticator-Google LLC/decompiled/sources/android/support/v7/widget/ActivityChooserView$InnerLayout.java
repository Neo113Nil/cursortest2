package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.byo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    private static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        byo t = byo.t(context, attributeSet, a);
        setBackgroundDrawable(t.j(0));
        t.n();
    }
}
