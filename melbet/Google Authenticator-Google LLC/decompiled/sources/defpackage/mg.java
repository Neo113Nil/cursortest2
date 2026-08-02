package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mg extends cq {
    public int b;

    public mg(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public mg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public mg(cq cqVar) {
        super(cqVar);
        this.b = 0;
    }

    public mg(mg mgVar) {
        super((cq) mgVar);
        this.b = 0;
        this.b = mgVar.b;
    }

    public mg(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public mg() {
        this.b = 0;
        this.a = 8388627;
    }
}
