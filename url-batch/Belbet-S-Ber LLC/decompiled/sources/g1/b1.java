package g1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class b1 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public q1 f1617a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1618b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1619c;
    public boolean d;

    public b1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1618b = new Rect();
        this.f1619c = true;
        this.d = false;
    }

    public b1(int i, int i4) {
        super(i, i4);
        this.f1618b = new Rect();
        this.f1619c = true;
        this.d = false;
    }

    public b1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1618b = new Rect();
        this.f1619c = true;
        this.d = false;
    }

    public b1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1618b = new Rect();
        this.f1619c = true;
        this.d = false;
    }

    public b1(b1 b1Var) {
        super((ViewGroup.LayoutParams) b1Var);
        this.f1618b = new Rect();
        this.f1619c = true;
        this.d = false;
    }
}
