package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221S extends B.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3334j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W f3335k;

    public C0221S(W w2, int i, int i2, WeakReference weakReference) {
        this.f3335k = w2;
        this.h = i;
        this.i = i2;
        this.f3334j = weakReference;
    }

    @Override // B.b
    public final void g(int i) {
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = V.a(typeface, i, (this.i & 2) != 0);
        }
        W w2 = this.f3335k;
        if (w2.f3351m) {
            w2.f3350l = typeface;
            TextView textView = (TextView) this.f3334j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new C0.b(textView, typeface, w2.f3348j));
                } else {
                    textView.setTypeface(typeface, w2.f3348j);
                }
            }
        }
    }
}
