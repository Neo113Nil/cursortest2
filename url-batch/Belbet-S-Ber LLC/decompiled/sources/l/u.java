package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2570a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.a f2571b;

    public u(TextView textView) {
        this.f2570a = textView;
        this.f2571b = new q3.a(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2570a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
        try {
            boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z4) {
        ((r1.b) this.f2571b.f3172a).y(z4);
    }

    public final void c(boolean z4) {
        ((r1.b) this.f2571b.f3172a).z(z4);
    }
}
