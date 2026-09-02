package f1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class n0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b1 f1460a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1461b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1462c;
    public boolean d;

    public n0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1461b = new Rect();
        this.f1462c = true;
        this.d = false;
    }

    public n0(int i, int i4) {
        super(i, i4);
        this.f1461b = new Rect();
        this.f1462c = true;
        this.d = false;
    }

    public n0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1461b = new Rect();
        this.f1462c = true;
        this.d = false;
    }

    public n0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1461b = new Rect();
        this.f1462c = true;
        this.d = false;
    }

    public n0(n0 n0Var) {
        super((ViewGroup.LayoutParams) n0Var);
        this.f1461b = new Rect();
        this.f1462c = true;
        this.d = false;
    }
}
