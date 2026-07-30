package androidx.lifecycle;

import D.RunnableC0281a;
import android.os.Handler;

/* loaded from: classes.dex */
public final class G implements InterfaceC0513v {

    /* renamed from: B, reason: collision with root package name */
    public static final G f5215B = new G();

    /* renamed from: n, reason: collision with root package name */
    public int f5217n;

    /* renamed from: u, reason: collision with root package name */
    public int f5218u;

    /* renamed from: x, reason: collision with root package name */
    public Handler f5221x;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5219v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5220w = true;

    /* renamed from: y, reason: collision with root package name */
    public final C0515x f5222y = new C0515x(this);

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0281a f5223z = new RunnableC0281a(13, this);

    /* renamed from: A, reason: collision with root package name */
    public final I0.j f5216A = new I0.j(17, this);

    public final void a() {
        int i = this.f5218u + 1;
        this.f5218u = i;
        if (i == 1) {
            if (this.f5219v) {
                this.f5222y.e(EnumC0506n.ON_RESUME);
                this.f5219v = false;
            } else {
                Handler handler = this.f5221x;
                kotlin.jvm.internal.h.b(handler);
                handler.removeCallbacks(this.f5223z);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0513v
    public final AbstractC0508p getLifecycle() {
        return this.f5222y;
    }
}
