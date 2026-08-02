package l;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096s {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9885b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9886c;

    public C1096s(C1097t c1097t, int i3, int i4) {
        this.f9884a = new WeakReference(c1097t);
        this.f9885b = i3;
        this.f9886c = i4;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new B0.n(24, this));
    }

    public final void b(Typeface typeface) {
        int i3;
        WeakReference weakReference = this.f9884a;
        C1097t c1097t = (C1097t) weakReference.get();
        if (c1097t == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f9885b) != -1) {
            typeface = Typeface.create(typeface, i3, (this.f9886c & 2) != 0);
        }
        c1097t.f9897a.post(new B.a(weakReference, 9, typeface));
    }
}
