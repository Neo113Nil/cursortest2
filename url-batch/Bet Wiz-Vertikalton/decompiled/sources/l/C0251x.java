package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3074a;

    /* renamed from: b, reason: collision with root package name */
    public final C.g f3075b;

    public C0251x(TextView textView) {
        this.f3074a = textView;
        this.f3075b = new C.g(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3074a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((x1.l) this.f3075b.f67b).Z(z2);
    }

    public final void c(boolean z2) {
        ((x1.l) this.f3075b.f67b).a0(z2);
    }
}
