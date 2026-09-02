package W;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3284a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3285b;

    /* renamed from: c, reason: collision with root package name */
    public final F f3286c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3287d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3288e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3289f;

    public M(Context context, Looper looper, D d4, int i4) {
        this.f3284a = i4;
        switch (i4) {
            case 1:
                this.f3289f = new l2.e(context.getApplicationContext(), 17, false);
                this.f3285b = d4.a(looper, null);
                this.f3286c = d4.a(Looper.getMainLooper(), null);
                break;
            default:
                this.f3289f = new l2.e(context.getApplicationContext(), 16, false);
                this.f3285b = d4.a(looper, null);
                this.f3286c = d4.a(Looper.getMainLooper(), null);
                break;
        }
    }

    public void a(boolean z, boolean z4) {
        F f4 = this.f3285b;
        if (z && z4) {
            f4.c(new K(this, z, z4, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f3286c.f3257a.postDelayed(new R1.e(this, 7, atomicBoolean), 1000L);
        f4.c(new L(this, atomicBoolean, z, z4, 0));
    }

    public void b(boolean z, boolean z4) {
        F f4 = this.f3285b;
        if (z && z4) {
            f4.c(new K(this, z, z4, 1));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f3286c.f3257a.postDelayed(new R1.e(this, 9, atomicBoolean), 1000L);
        f4.c(new L(this, atomicBoolean, z, z4, 1));
    }

    public final void c(boolean z) {
        switch (this.f3284a) {
            case 0:
                if (this.f3288e != z) {
                    this.f3288e = z;
                    if (this.f3287d) {
                        a(true, z);
                        break;
                    }
                }
                break;
            default:
                if (this.f3288e != z) {
                    this.f3288e = z;
                    if (this.f3287d) {
                        b(true, z);
                        break;
                    }
                }
                break;
        }
    }
}
