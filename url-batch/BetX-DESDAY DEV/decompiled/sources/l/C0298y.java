package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3487a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f3488b;

    public C0298y(TextView textView) {
        this.f3487a = textView;
        this.f3488b = new B0.d(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3487a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((q1.l) this.f3488b.f66b).k0(z2);
    }

    public final void c(boolean z2) {
        ((q1.l) this.f3488b.f66b).o0(z2);
    }
}
