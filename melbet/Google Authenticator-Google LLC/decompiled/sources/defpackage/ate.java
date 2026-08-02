package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ate {
    public boolean a;
    public UUID b;
    public axt c;
    public final Set d;
    private final Class e;

    public ate(Class cls) {
        this.e = cls;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new axt(uuid, (atb) null, name, (String) null, (asa) null, (asa) null, 0L, 0L, 0L, (ary) null, 0, (art) null, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String name2 = cls.getName();
        name2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(ixd.m(1));
        ixc.S(new String[]{name2}, linkedHashSet);
        this.d = linkedHashSet;
    }

    public abstract bvw a();

    public final void b(ary aryVar) {
        aryVar.getClass();
        this.c.k = aryVar;
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.c.h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.h) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void d(asa asaVar) {
        asaVar.getClass();
        this.c.f = asaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    public final bvw e() {
        ?? arrayList;
        bvw a = a();
        ary aryVar = this.c.k;
        int i = 1;
        boolean z = aryVar.b() || aryVar.e || aryVar.c || aryVar.d;
        axt axtVar = this.c;
        if (axtVar.r) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (axtVar.h > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = axtVar.x;
        if (str == null) {
            String str2 = axtVar.d;
            String[] strArr = {"."};
            str2.getClass();
            if (".".length() > 0) {
                int i2 = ksp.i(str2, ".", 0, false);
                if (i2 != -1) {
                    arrayList = new ArrayList(10);
                    int i3 = 0;
                    do {
                        arrayList.add(str2.subSequence(i3, i2).toString());
                        i3 = i2 + 1;
                        i2 = ksp.i(str2, ".", i3, false);
                    } while (i2 != -1);
                    arrayList.add(str2.subSequence(i3, str2.length()).toString());
                } else {
                    arrayList = ixc.b(str2);
                }
            } else {
                ktx<kth> ktxVar = new ktx(new ktz(str2, new lbh(ixc.D(strArr), i), 2));
                arrayList = new ArrayList(ixc.w(ktxVar));
                for (kth kthVar : ktxVar) {
                    kthVar.getClass();
                    int i4 = kthVar.a;
                    Integer.valueOf(i4).getClass();
                    int i5 = kthVar.b;
                    Integer.valueOf(i5).getClass();
                    arrayList.add(str2.subSequence(i4, i5 + 1).toString());
                }
            }
            String str3 = arrayList.size() == 1 ? (String) arrayList.get(0) : (String) ixc.h(arrayList);
            if (str3.length() > 127) {
                str3 = ksp.u(str3);
            }
            axtVar.x = str3;
        } else if (str.length() > 127) {
            axtVar.x = ksp.u(str);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        axt axtVar2 = this.c;
        axtVar2.getClass();
        this.c = new axt(uuid, axtVar2.c, axtVar2.d, axtVar2.e, new asa(axtVar2.f), new asa(axtVar2.g), axtVar2.h, axtVar2.i, axtVar2.j, new ary(axtVar2.k), axtVar2.l, axtVar2.m, axtVar2.n, axtVar2.o, axtVar2.p, axtVar2.q, axtVar2.r, axtVar2.z, axtVar2.s, axtVar2.u, axtVar2.v, axtVar2.w, axtVar2.x, axtVar2.y, 524288);
        return a;
    }
}
