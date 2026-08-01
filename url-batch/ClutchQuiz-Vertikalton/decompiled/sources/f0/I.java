package f0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class I extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public W f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2155b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2156c;
    public boolean d;

    public I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2155b = new Rect();
        this.f2156c = true;
        this.d = false;
    }

    public I(int i, int i2) {
        super(i, i2);
        this.f2155b = new Rect();
        this.f2156c = true;
        this.d = false;
    }

    public I(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2155b = new Rect();
        this.f2156c = true;
        this.d = false;
    }

    public I(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2155b = new Rect();
        this.f2156c = true;
        this.d = false;
    }

    public I(I i) {
        super((ViewGroup.LayoutParams) i);
        this.f2155b = new Rect();
        this.f2156c = true;
        this.d = false;
    }
}
