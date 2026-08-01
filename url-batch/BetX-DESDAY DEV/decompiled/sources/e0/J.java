package e0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class J extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public X f2127a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2128b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2129c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2130d;

    public J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2128b = new Rect();
        this.f2129c = true;
        this.f2130d = false;
    }

    public J(int i, int i2) {
        super(i, i2);
        this.f2128b = new Rect();
        this.f2129c = true;
        this.f2130d = false;
    }

    public J(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2128b = new Rect();
        this.f2129c = true;
        this.f2130d = false;
    }

    public J(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2128b = new Rect();
        this.f2129c = true;
        this.f2130d = false;
    }

    public J(J j2) {
        super((ViewGroup.LayoutParams) j2);
        this.f2128b = new Rect();
        this.f2129c = true;
        this.f2130d = false;
    }
}
