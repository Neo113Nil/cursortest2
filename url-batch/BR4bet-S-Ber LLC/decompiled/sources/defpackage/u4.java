package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class u4 {
    public final TextView a;
    public final rc0 b;

    public u4(TextView textView) {
        this.a = textView;
        this.b = new rc0(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, z00.i, i, 0);
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
        ((kr) this.b.g).a0(z);
    }

    public final void c(boolean z) {
        ((kr) this.b.g).b0(z);
    }
}
