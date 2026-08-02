package j;

import D0.RunnableC0043c;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: j.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243t {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3049b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3050c;

    public C0243t(C0244u c0244u, int i2, int i3) {
        this.f3048a = new WeakReference(c0244u);
        this.f3049b = i2;
        this.f3050c = i3;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0043c(5, this));
    }

    public final void b(Typeface typeface) {
        int i2;
        WeakReference weakReference = this.f3048a;
        C0244u c0244u = (C0244u) weakReference.get();
        if (c0244u == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f3049b) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f3050c & 2) != 0);
        }
        c0244u.f3053a.post(new d1.i(weakReference, typeface, 2, false));
    }
}
