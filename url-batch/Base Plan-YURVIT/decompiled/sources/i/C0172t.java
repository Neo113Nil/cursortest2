package i;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: i.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172t {

    /* renamed from: a, reason: collision with root package name */
    public final int f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2311b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2312c;

    public C0172t(int i2, String str, double d2, double d3, double d4, double d5, int i3, int i4, ByteBuffer byteBuffer) {
        this.f2310a = i2;
        this.f2312c = str;
        this.f2311b = i3;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new androidx.lifecycle.k(4, this));
    }

    public void b(Typeface typeface) {
        int i2;
        WeakReference weakReference = (WeakReference) this.f2312c;
        C0173u c0173u = (C0173u) weakReference.get();
        if (c0173u == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2310a) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f2311b & 2) != 0);
        }
        c0173u.f2320a.post(new b1.i(weakReference, typeface, 2, false));
    }

    public C0172t(C0173u c0173u, int i2, int i3) {
        this.f2312c = new WeakReference(c0173u);
        this.f2310a = i2;
        this.f2311b = i3;
    }
}
