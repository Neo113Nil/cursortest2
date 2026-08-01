package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3021a;

    /* renamed from: b, reason: collision with root package name */
    public final C.g f3022b;

    public C0252x(TextView textView) {
        this.f3021a = textView;
        this.f3022b = new C.g(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3021a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((u1.d) this.f3022b.f66b).l0(z2);
    }

    public final void c(boolean z2) {
        ((u1.d) this.f3022b.f66b).m0(z2);
    }
}
