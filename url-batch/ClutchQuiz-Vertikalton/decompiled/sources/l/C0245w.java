package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3065a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.h f3066b;

    public C0245w(TextView textView) {
        this.f3065a = textView;
        this.f3066b = new A0.h(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3065a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((T.d) this.f3066b.f30b).O(z2);
    }

    public final void c(boolean z2) {
        ((T.d) this.f3066b.f30b).P(z2);
    }
}
