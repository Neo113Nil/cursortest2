package h0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: h0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0142H extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public V f2916a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2917b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2918c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2919d;

    public C0142H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2917b = new Rect();
        this.f2918c = true;
        this.f2919d = false;
    }

    public C0142H(int i, int i2) {
        super(i, i2);
        this.f2917b = new Rect();
        this.f2918c = true;
        this.f2919d = false;
    }

    public C0142H(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2917b = new Rect();
        this.f2918c = true;
        this.f2919d = false;
    }

    public C0142H(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2917b = new Rect();
        this.f2918c = true;
        this.f2919d = false;
    }

    public C0142H(C0142H c0142h) {
        super((ViewGroup.LayoutParams) c0142h);
        this.f2917b = new Rect();
        this.f2918c = true;
        this.f2919d = false;
    }
}
