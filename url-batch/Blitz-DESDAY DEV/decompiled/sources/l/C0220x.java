package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC0084a;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3094a;

    /* renamed from: b, reason: collision with root package name */
    public final E.g f3095b;

    public C0220x(TextView textView) {
        this.f3094a = textView;
        this.f3095b = new E.g(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3094a.getContext().obtainStyledAttributes(attributeSet, AbstractC0084a.i, i, 0);
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
        ((z1.d) this.f3095b.f170b).V(z2);
    }

    public final void c(boolean z2) {
        ((z1.d) this.f3095b.f170b).Z(z2);
    }
}
