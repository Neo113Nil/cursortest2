package l1;

import f1.k0;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4750b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4751c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4752d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4753e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4754f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4755g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4756h;
    public final c i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4757j;

    public d(String str) {
        long j7 = f1.s.f2704h;
        this.f4749a = str;
        this.f4750b = 24.0f;
        this.f4751c = 24.0f;
        this.f4752d = 24.0f;
        this.f4753e = 24.0f;
        this.f4754f = j7;
        this.f4755g = 5;
        ArrayList arrayList = new ArrayList();
        this.f4756h = arrayList;
        int i = y.f4827a;
        ArrayList arrayList2 = new ArrayList();
        c cVar = new c();
        cVar.f4747a = d6.u.f2326d;
        cVar.f4748b = arrayList2;
        this.i = cVar;
        arrayList.add(cVar);
    }

    public static void a(d dVar, ArrayList arrayList, k0 k0Var) {
        if (dVar.f4757j) {
            t1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((c) dVar.f4756h.get(r1.size() - 1)).f4748b.add(new b0(arrayList, k0Var));
    }

    public final e b() {
        if (this.f4757j) {
            t1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f4756h;
            if (arrayList.size() <= 1) {
                c cVar = this.i;
                cVar.getClass();
                e eVar = new e(this.f4749a, this.f4750b, this.f4751c, this.f4752d, this.f4753e, new x(cVar.f4747a, cVar.f4748b), this.f4754f, this.f4755g);
                this.f4757j = true;
                return eVar;
            }
            if (this.f4757j) {
                t1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            c cVar2 = (c) arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = ((c) arrayList.get(arrayList.size() - 1)).f4748b;
            cVar2.getClass();
            arrayList2.add(new x(cVar2.f4747a, cVar2.f4748b));
        }
    }
}
