package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2490a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.a f2491b;

    public x(TextView textView) {
        this.f2490a = textView;
        this.f2491b = new u2.a(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2490a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((t0.d) this.f2491b.f3355a).r(z3);
    }

    public final void c(boolean z3) {
        ((t0.d) this.f2491b.f3355a).s(z3);
    }
}
