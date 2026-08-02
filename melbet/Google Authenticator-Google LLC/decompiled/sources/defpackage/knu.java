package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class knu extends jzk {
    public static final Logger f = Logger.getLogger(knu.class.getName());
    private static final int l = new Random().nextInt();
    public final jzc h;
    protected boolean i;
    protected jxi k;
    public List g = new ArrayList(0);
    protected final jzm j = new kjz();

    protected knu(jzc jzcVar) {
        this.h = jzcVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.jzk
    public final kbq a(jzg jzgVar) {
        kbq kbqVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", jzgVar);
        boolean z = true;
        try {
            this.i = true;
            List<jxx> list = jzgVar.a;
            LinkedHashMap A = hnu.A(list.size());
            for (jxx jxxVar : list) {
                jwt jwtVar = jwt.a;
                List singletonList = Collections.singletonList(jxxVar);
                kdw kdwVar = new kdw(jwt.a);
                kdwVar.c(e, true);
                A.put(new knt(jxxVar), new jzg(singletonList, kdwVar.a(), null));
            }
            if (A.isEmpty()) {
                kbqVar = kbq.l.e("NameResolver returned no usable address. " + jzgVar.toString());
                b(kbqVar);
            } else {
                LinkedHashMap A2 = hnu.A(this.g.size());
                for (kns knsVar : this.g) {
                    A2.put(knsVar.a, knsVar);
                }
                kbq kbqVar2 = kbq.b;
                ArrayList arrayList = new ArrayList(A.size());
                for (Map.Entry entry : A.entrySet()) {
                    kns knsVar2 = (kns) A2.remove(entry.getKey());
                    if (knsVar2 == null) {
                        knsVar2 = e(entry.getKey());
                    }
                    arrayList.add(knsVar2);
                }
                int aZ = arrayList.isEmpty() ? 0 : (int) (hnu.aZ(l) % hnu.aZ(arrayList.size()));
                Iterable T = hnu.T(arrayList, aZ);
                if (aZ < 0) {
                    z = false;
                }
                hoq.y(z, "limit is negative");
                for (kns knsVar3 : hdb.a(T, new hgc(arrayList, aZ))) {
                    jzg jzgVar2 = (jzg) A.get(knsVar3.a);
                    if (jzgVar2 != null) {
                        kbq a = knsVar3.b.a(jzgVar2);
                        if (!a.g()) {
                            kbqVar2 = a;
                        }
                    }
                }
                this.g = arrayList;
                f();
                Iterator it = A2.values().iterator();
                while (it.hasNext()) {
                    ((kns) it.next()).b();
                }
                kbqVar = kbqVar2;
            }
            return kbqVar;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.jzk
    public final void b(kbq kbqVar) {
        if (this.k != jxi.b) {
            this.h.f(jxi.c, new jzb(jze.b(kbqVar)));
        }
    }

    @Override // defpackage.jzk
    public final void d() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((kns) it.next()).b();
        }
        this.g.clear();
    }

    protected kns e(Object obj) {
        throw null;
    }

    protected abstract void f();
}
