package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wf {
    public final TextView a;
    public final ar0 b;

    public wf(TextView textView) {
        this.a = textView;
        this.b = new ar0(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, b62.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((tk3) this.b.n).d0(z);
    }

    public final void c(boolean z) {
        ((tk3) this.b.n).e0(z);
    }
}
