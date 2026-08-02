package D0;

import android.webkit.ValueCallback;

/* renamed from: D0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0053m implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0.i f388b;

    public /* synthetic */ C0053m(Q0.i iVar, int i2) {
        this.f387a = i2;
        this.f388b = iVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f387a) {
            case 0:
                Boolean bool = (Boolean) obj;
                B b2 = (B) this.f388b;
                Q0.r.a(1, b2);
                Throwable a2 = F0.e.a(bool);
                P.O o2 = b2.f235g;
                if (a2 == null) {
                    o2.b(i1.a.u(bool));
                    break;
                } else {
                    o2.b(i1.a.L(a2));
                    break;
                }
            default:
                String str = (String) obj;
                B b3 = (B) this.f388b;
                Q0.r.a(1, b3);
                Throwable a3 = F0.e.a(str);
                P.O o3 = b3.f235g;
                if (a3 == null) {
                    o3.b(i1.a.u(str));
                    break;
                } else {
                    o3.b(i1.a.L(a3));
                    break;
                }
        }
    }
}
