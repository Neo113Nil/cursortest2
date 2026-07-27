package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;

/* loaded from: classes.dex */
public final class E implements InterfaceC0481v {

    /* renamed from: o, reason: collision with root package name */
    public static final E f5420o = new E();

    /* renamed from: d, reason: collision with root package name */
    public int f5421d;

    /* renamed from: e, reason: collision with root package name */
    public int f5422e;

    /* renamed from: k, reason: collision with root package name */
    public Handler f5425k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5423i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5424j = true;

    /* renamed from: l, reason: collision with root package name */
    public final C0483x f5426l = new C0483x(this);

    /* renamed from: m, reason: collision with root package name */
    public final C.t f5427m = new C.t(4, this);

    /* renamed from: n, reason: collision with root package name */
    public final C1294c f5428n = new C1294c(this);

    public final void a() {
        int i2 = this.f5422e + 1;
        this.f5422e = i2;
        if (i2 == 1) {
            if (this.f5423i) {
                this.f5426l.d(EnumC0474n.ON_RESUME);
                this.f5423i = false;
            } else {
                Handler handler = this.f5425k;
                Intrinsics.c(handler);
                handler.removeCallbacks(this.f5427m);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0481v
    public final C0483x e() {
        return this.f5426l;
    }
}
