package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4422a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.b f4423b;

    public v(TextView textView) {
        this.f4422a = textView;
        this.f4423b = new b1.b(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f4422a.getContext().obtainStyledAttributes(attributeSet, h.a.f3055g, i, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((s6.a) this.f4423b.f1050e).F(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
