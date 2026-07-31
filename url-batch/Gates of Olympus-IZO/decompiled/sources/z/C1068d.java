package z;

import A2.w;
import B0.C;
import B0.C0007d;
import B0.y;
import B0.z;
import I2.l;
import M1.u;
import f.AbstractC0382a;
import java.util.List;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068d {

    /* renamed from: a, reason: collision with root package name */
    public C0007d f8877a;

    /* renamed from: b, reason: collision with root package name */
    public C f8878b;

    /* renamed from: c, reason: collision with root package name */
    public F0.e f8879c;

    /* renamed from: d, reason: collision with root package name */
    public int f8880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8881e;

    /* renamed from: f, reason: collision with root package name */
    public int f8882f;

    /* renamed from: g, reason: collision with root package name */
    public int f8883g;

    /* renamed from: h, reason: collision with root package name */
    public List f8884h;

    /* renamed from: i, reason: collision with root package name */
    public C1066b f8885i;

    /* renamed from: j, reason: collision with root package name */
    public long f8886j = AbstractC1065a.f8865a;

    /* renamed from: k, reason: collision with root package name */
    public M0.b f8887k;

    /* renamed from: l, reason: collision with root package name */
    public w f8888l;

    /* renamed from: m, reason: collision with root package name */
    public M0.j f8889m;

    /* renamed from: n, reason: collision with root package name */
    public z f8890n;

    public C1068d(C0007d c0007d, C c3, F0.e eVar, int i3, boolean z3, int i4, int i5, List list) {
        this.f8877a = c0007d;
        this.f8878b = c3;
        this.f8879c = eVar;
        this.f8880d = i3;
        this.f8881e = z3;
        this.f8882f = i4;
        this.f8883g = i5;
        this.f8884h = list;
    }

    public final void a(M0.b bVar) {
        long j3;
        M0.b bVar2 = this.f8887k;
        if (bVar != null) {
            int i3 = AbstractC1065a.f8866b;
            j3 = AbstractC1065a.a(bVar.a(), bVar.p());
        } else {
            j3 = AbstractC1065a.f8865a;
        }
        if (bVar2 == null) {
            this.f8887k = bVar;
            this.f8886j = j3;
        } else if (bVar == null || this.f8886j != j3) {
            this.f8887k = bVar;
            this.f8886j = j3;
            this.f8888l = null;
            this.f8890n = null;
        }
    }

    public final z b(M0.j jVar, long j3, B0.j jVar2) {
        float min = Math.min(jVar2.f268a.b(), jVar2.f271d);
        C0007d c0007d = this.f8877a;
        C c3 = this.f8878b;
        List list = this.f8884h;
        if (list == null) {
            list = u.f2803d;
        }
        int i3 = this.f8882f;
        boolean z3 = this.f8881e;
        int i4 = this.f8880d;
        M0.b bVar = this.f8887k;
        Z1.i.c(bVar);
        return new z(new y(c0007d, c3, list, i3, z3, i4, bVar, jVar, this.f8879c, j3), jVar2, l.o(j3, l.e(AbstractC0382a.e(min), AbstractC0382a.e(jVar2.f272e))));
    }
}
