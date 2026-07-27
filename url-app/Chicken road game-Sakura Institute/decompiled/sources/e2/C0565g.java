package e2;

import B1.C0097d;
import java.util.HashMap;
import java.util.Map;
import y.t;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565g implements InterfaceC0567i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f6186c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f6187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f6188e;

    public C0565g(n nVar, String str, long j4, l lVar, t tVar) {
        this.f6188e = nVar;
        this.f6184a = str;
        this.f6185b = j4;
        this.f6186c = lVar;
        this.f6187d = tVar;
    }

    @Override // e2.InterfaceC0567i
    public final void a(Map map) {
        n nVar = this.f6188e;
        boolean y4 = nVar.f6235x.y();
        C0097d c0097d = nVar.f6235x;
        if (y4) {
            c0097d.d(this.f6184a + " response: " + map, null, new Object[0]);
        }
        HashMap hashMap = nVar.f6224m;
        long j4 = this.f6185b;
        if (((l) hashMap.get(Long.valueOf(j4))) == this.f6186c) {
            nVar.f6224m.remove(Long.valueOf(j4));
            t tVar = this.f6187d;
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                tVar.s(null, null);
            } else {
                tVar.s(str, (String) map.get("d"));
            }
        } else if (c0097d.y()) {
            c0097d.d("Ignoring on complete for put " + j4 + " because it was removed already.", null, new Object[0]);
        }
        nVar.b();
    }
}
