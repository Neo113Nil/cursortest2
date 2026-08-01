package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3050a;

    /* renamed from: b, reason: collision with root package name */
    public final C.h f3051b;

    public C0243w(TextView textView) {
        this.f3050a = textView;
        this.f3051b = new C.h(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3050a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((u1.d) this.f3051b.f150b).Y(z2);
    }

    public final void c(boolean z2) {
        ((u1.d) this.f3051b.f150b).Z(z2);
    }
}
