package n;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC0454a;

/* renamed from: n.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6911a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.c f6912b;

    public C0739v(TextView textView) {
        this.f6911a = textView;
        this.f6912b = new l2.c(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((P0.f) this.f6912b.f6269d).s(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f6911a.getContext().obtainStyledAttributes(attributeSet, AbstractC0454a.f5045i, i2, 0);
        try {
            boolean z7 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z7) {
        ((P0.f) this.f6912b.f6269d).G(z7);
    }

    public final void d(boolean z7) {
        ((P0.f) this.f6912b.f6269d).J(z7);
    }
}
