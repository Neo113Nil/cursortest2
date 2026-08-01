package n;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC0122a;

/* renamed from: n.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3734a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.d f3735b;

    public C0308x(TextView textView) {
        this.f3734a = textView;
        this.f3735b = new C1.d(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((H1.l) this.f3735b.f145b).x(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3734a.getContext().obtainStyledAttributes(attributeSet, AbstractC0122a.i, i, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z2) {
        ((H1.l) this.f3735b.f145b).V(z2);
    }

    public final void d(boolean z2) {
        ((H1.l) this.f3735b.f145b).X(z2);
    }
}
