package h;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: h.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165s {

    /* renamed from: a, reason: collision with root package name */
    public final int f2271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2272b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2273c;

    public C0165s(int i2, String str, double d2, double d3, double d4, double d5, int i3, int i4, ByteBuffer byteBuffer) {
        this.f2271a = i2;
        this.f2273c = str;
        this.f2272b = i3;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new androidx.lifecycle.k(4, this));
    }

    public void b(Typeface typeface) {
        int i2;
        WeakReference weakReference = (WeakReference) this.f2273c;
        C0166t c0166t = (C0166t) weakReference.get();
        if (c0166t == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2271a) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f2272b & 2) != 0);
        }
        c0166t.f2285a.post(new R0.i(weakReference, typeface, 2, false));
    }

    public C0165s(C0166t c0166t, int i2, int i3) {
        this.f2273c = new WeakReference(c0166t);
        this.f2271a = i2;
        this.f2272b = i3;
    }
}
