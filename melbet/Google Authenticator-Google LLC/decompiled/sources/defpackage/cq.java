package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cq extends ViewGroup.MarginLayoutParams {
    public int a;

    public cq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, em.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public cq() {
        super(-2, -2);
        this.a = 8388627;
    }

    public cq(cq cqVar) {
        super((ViewGroup.MarginLayoutParams) cqVar);
        this.a = 0;
        this.a = cqVar.a;
    }

    public cq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
