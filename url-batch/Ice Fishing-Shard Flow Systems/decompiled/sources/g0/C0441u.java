package g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: g0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0441u extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4969a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4970b;

    public C0441u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4969a = new Rect();
        this.f4970b = true;
    }

    public C0441u(int i2, int i5) {
        super(i2, i5);
        this.f4969a = new Rect();
        this.f4970b = true;
    }

    public C0441u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4969a = new Rect();
        this.f4970b = true;
    }

    public C0441u(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4969a = new Rect();
        this.f4970b = true;
    }

    public C0441u(C0441u c0441u) {
        super((ViewGroup.LayoutParams) c0441u);
        this.f4969a = new Rect();
        this.f4970b = true;
    }
}
