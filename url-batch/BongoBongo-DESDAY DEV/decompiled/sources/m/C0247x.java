package m;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC0097a;

/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3208a;

    /* renamed from: b, reason: collision with root package name */
    public final D.g f3209b;

    public C0247x(TextView textView) {
        this.f3208a = textView;
        this.f3209b = new D.g(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((A1.d) this.f3209b.f122b).I(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3208a.getContext().obtainStyledAttributes(attributeSet, AbstractC0097a.i, i, 0);
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
        ((A1.d) this.f3209b.f122b).c0(z2);
    }

    public final void d(boolean z2) {
        ((A1.d) this.f3209b.f122b).g0(z2);
    }
}
