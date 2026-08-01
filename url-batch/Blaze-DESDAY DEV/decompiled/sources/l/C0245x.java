package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final C.g f3039b;

    public C0245x(TextView textView) {
        this.f3038a = textView;
        this.f3039b = new C.g(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3038a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((z1.d) this.f3039b.f80b).k0(z2);
    }

    public final void c(boolean z2) {
        ((z1.d) this.f3039b.f80b).l0(z2);
    }
}
