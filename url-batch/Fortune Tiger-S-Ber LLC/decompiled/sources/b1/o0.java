package b1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class o0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c1 f889a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f890b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f891d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f890b = new Rect();
        this.c = true;
        this.f891d = false;
    }

    public o0(int i4, int i5) {
        super(i4, i5);
        this.f890b = new Rect();
        this.c = true;
        this.f891d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f890b = new Rect();
        this.c = true;
        this.f891d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f890b = new Rect();
        this.c = true;
        this.f891d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.f890b = new Rect();
        this.c = true;
        this.f891d = false;
    }
}
