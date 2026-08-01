package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3484a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.c f3485b;

    public C0266w(TextView textView) {
        this.f3484a = textView;
        this.f3485b = new A0.c(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3484a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((H1.l) this.f3485b.f6b).d0(z2);
    }

    public final void c(boolean z2) {
        ((H1.l) this.f3485b.f6b).e0(z2);
    }
}
