package androidx.lifecycle;

import H1.RunnableC0139m;
import android.os.Handler;

/* loaded from: classes.dex */
public final class E implements InterfaceC0253u {

    /* renamed from: n, reason: collision with root package name */
    public static final E f3455n = new E();

    /* renamed from: f, reason: collision with root package name */
    public int f3456f;

    /* renamed from: g, reason: collision with root package name */
    public int f3457g;

    /* renamed from: j, reason: collision with root package name */
    public Handler f3460j;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3458h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3459i = true;

    /* renamed from: k, reason: collision with root package name */
    public final C0255w f3461k = new C0255w(this);

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0139m f3462l = new RunnableC0139m(9, this);

    /* renamed from: m, reason: collision with root package name */
    public final V5.g f3463m = new V5.g(3, this);

    public final void a() {
        int i7 = this.f3457g + 1;
        this.f3457g = i7;
        if (i7 == 1) {
            if (this.f3458h) {
                this.f3461k.e(EnumC0246m.ON_RESUME);
                this.f3458h = false;
            } else {
                Handler handler = this.f3460j;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.f3462l);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0253u
    public final AbstractC0248o getLifecycle() {
        return this.f3461k;
    }
}
