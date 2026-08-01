package k;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2669a;

    /* renamed from: b, reason: collision with root package name */
    public final r0.a f2670b;

    public v(TextView textView) {
        this.f2669a = textView;
        this.f2670b = new r0.a(textView);
    }

    public final void a(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f2669a.getContext().obtainStyledAttributes(attributeSet, e.a.f1500i, i4, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z3) {
        ((m0.a) this.f2670b.f3139f).x(z3);
    }

    public final void c(boolean z3) {
        ((m0.a) this.f2670b.f3139f).y(z3);
    }
}
