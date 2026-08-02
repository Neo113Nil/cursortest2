package defpackage;

import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kju extends jzk {
    public static final Logger f = Logger.getLogger(kju.class.getName());
    static final boolean g;
    public final boolean h;
    public final jzc i;
    public final Map j;
    public final kjp k;
    public int l;
    public boolean m;
    public jxi n;
    public jxi o;
    public boolean p;
    public kgo q;
    public kuq r;
    public kuq s;
    private final boolean t;

    static {
        Charset charset = khd.a;
        g = jxy.a("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    public kju(jzc jzcVar) {
        boolean z;
        if (!j()) {
            int i = kjz.b;
            Charset charset = khd.a;
            if (jxy.a("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
                z = true;
                this.h = z;
                this.j = new HashMap();
                int i2 = hel.d;
                this.k = new kjp(his.a, z);
                this.l = 0;
                this.m = true;
                this.r = null;
                jxi jxiVar = jxi.d;
                this.n = jxiVar;
                this.o = jxiVar;
                this.p = true;
                this.s = null;
                this.t = j();
                this.i = jzcVar;
            }
        }
        z = false;
        this.h = z;
        this.j = new HashMap();
        int i22 = hel.d;
        this.k = new kjp(his.a, z);
        this.l = 0;
        this.m = true;
        this.r = null;
        jxi jxiVar2 = jxi.d;
        this.n = jxiVar2;
        this.o = jxiVar2;
        this.p = true;
        this.s = null;
        this.t = j();
        this.i = jzcVar;
    }

    static List e(List list, Random random) {
        if (!g) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, random);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxx jxxVar = (jxx) it.next();
            Long l = (Long) jxxVar.f.a(jyn.a);
            if (l == null) {
                l = 1L;
            }
            arrayList2.add(new kjt(jxxVar, Math.pow(random.nextDouble(), 1.0d / l.longValue())));
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return hnu.G(arrayList2, new gxw(20));
    }

    static boolean j() {
        Charset charset = khd.a;
        return jxy.a("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SocketAddress k(jzh jzhVar) {
        boolean z;
        ken kenVar = (ken) jzhVar;
        kenVar.i.m.c();
        hoq.I(kenVar.g, "not started");
        List list = kenVar.e;
        if (list != null) {
            z = true;
        }
        z = false;
        hoq.K(z, "%s does not have exactly one group", list);
        return (SocketAddress) ((jxx) list.get(0)).e.get(0);
    }

    private final void l() {
        if (this.h) {
            kuq kuqVar = this.r;
            if (kuqVar == null || !kuqVar.d()) {
                jzc jzcVar = this.i;
                this.r = jzcVar.c().d(new kgf((Object) this, 18), 250L, TimeUnit.MILLISECONDS, jzcVar.d());
            }
        }
    }

    private final boolean m(hel helVar) {
        Map map = this.j;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = helVar.size();
        for (int i = 0; i < size; i++) {
            hashSet2.addAll(((jxx) helVar.get(i)).e);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((kjs) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.jzk
    public final kbq a(jzg jzgVar) {
        kjq kjqVar;
        Boolean bool;
        if (this.n == jxi.e) {
            return kbq.i.e("Already shut down");
        }
        jwt jwtVar = jzgVar.b;
        Boolean bool2 = (Boolean) jwtVar.a(e);
        this.p = bool2 == null || !bool2.booleanValue();
        List<jxx> list = jzgVar.a;
        if (list.isEmpty()) {
            kbq e = kbq.l.e("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + jwtVar.toString());
            b(e);
            return e;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((jxx) it.next()) == null) {
                kbq e2 = kbq.l.e("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list) + ", attrs=" + jwtVar.toString());
                b(e2);
                return e2;
            }
        }
        this.m = true;
        HashSet hashSet = new HashSet();
        List arrayList = new ArrayList();
        for (jxx jxxVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : jxxVar.e) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new jxx(arrayList2, jxxVar.f));
            }
        }
        Object obj = jzgVar.c;
        if ((obj instanceof kjq) && (bool = (kjqVar = (kjq) obj).a) != null && bool.booleanValue()) {
            Long l = kjqVar.b;
            arrayList = e(arrayList, new Random());
        }
        hel o = hel.o(arrayList);
        jxi jxiVar = this.n;
        jxi jxiVar2 = jxi.b;
        if (jxiVar == jxiVar2 || (jxiVar == jxi.a && (!this.h || this.k.f()))) {
            kjp kjpVar = this.k;
            SocketAddress b = kjpVar.b();
            kjpVar.d(o);
            if (kjpVar.g(b)) {
                jzh jzhVar = ((kjs) this.j.get(b)).a;
                if (!kjpVar.f()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                kuq kuqVar = (kuq) kjpVar.a.get(kjpVar.b);
                jzhVar.d(Collections.singletonList(new jxx((SocketAddress) kuqVar.a, (jwt) kuqVar.b)));
                m(o);
                return kbq.b;
            }
        } else {
            this.k.d(o);
        }
        if (m(o)) {
            jxi jxiVar3 = jxi.a;
            this.n = jxiVar3;
            h(jxiVar3, new jzb(jze.a));
        }
        jxi jxiVar4 = this.n;
        if (jxiVar4 == jxiVar2) {
            jxi jxiVar5 = jxi.d;
            this.n = jxiVar5;
            h(jxiVar5, new kjr(this, this));
        } else if (jxiVar4 == jxi.a || jxiVar4 == jxi.c) {
            f();
            c();
        }
        return kbq.b;
    }

    @Override // defpackage.jzk
    public final void b(kbq kbqVar) {
        if (this.n == jxi.e) {
            return;
        }
        Map map = this.j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((kjs) it.next()).a.b();
        }
        map.clear();
        kjp kjpVar = this.k;
        int i = hel.d;
        kjpVar.d(his.a);
        jxi jxiVar = jxi.c;
        this.n = jxiVar;
        h(jxiVar, new jzb(jze.b(kbqVar)));
    }

    @Override // defpackage.jzk
    public final void c() {
        kjp kjpVar = this.k;
        if (kjpVar.f() && this.n != jxi.e && this.s == null) {
            SocketAddress b = kjpVar.b();
            Map map = this.j;
            kjs kjsVar = (kjs) map.get(b);
            if (kjsVar == null) {
                if (!kjpVar.f()) {
                    throw new IllegalStateException("Index is off the end of the address group list");
                }
                Object obj = ((kuq) kjpVar.a.get(kjpVar.b)).b;
                kjo kjoVar = new kjo(this);
                jzc jzcVar = this.i;
                jyx jyxVar = new jyx();
                int i = 1;
                jyxVar.c(hnu.D(new jxx(b, (jwt) obj)));
                jyxVar.b(b, kjoVar);
                jyxVar.b(jzk.c, Boolean.valueOf(this.t));
                jzh b2 = jzcVar.b(jyxVar.a());
                kjs kjsVar2 = new kjs(b2, jxi.d);
                kjoVar.a = kjsVar2;
                map.put(b, kjsVar2);
                jyz jyzVar = ((ken) b2).a;
                if (this.p || jyzVar.b.a(jzk.d) == null) {
                    kjsVar2.d = jxj.a(jxi.b);
                }
                b2.c(new kjv(this, kjsVar2, i));
                kjsVar = kjsVar2;
            }
            int ordinal = kjsVar.b.ordinal();
            if (ordinal == 0) {
                l();
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                kjsVar.a.a();
                kjsVar.b(jxi.a);
                l();
                return;
            }
            if (!this.t) {
                kjpVar.e();
                c();
            } else if (!kjpVar.f()) {
                g();
            } else {
                kjsVar.a.a();
                kjsVar.b(jxi.a);
            }
        }
    }

    @Override // defpackage.jzk
    public final void d() {
        Logger logger = f;
        Level level = Level.FINE;
        Map map = this.j;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        jxi jxiVar = jxi.e;
        this.n = jxiVar;
        this.o = jxiVar;
        f();
        kuq kuqVar = this.s;
        if (kuqVar != null) {
            kuqVar.c();
            this.s = null;
        }
        this.q = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((kjs) it.next()).a.b();
        }
        map.clear();
    }

    public final void f() {
        kuq kuqVar = this.r;
        if (kuqVar != null) {
            kuqVar.c();
            this.r = null;
        }
    }

    public final void g() {
        if (this.t && this.s == null) {
            kgo kgoVar = this.q;
            if (kgoVar == null) {
                kgoVar = new kgo();
                this.q = kgoVar;
            }
            long a = kgoVar.a();
            jzc jzcVar = this.i;
            this.s = jzcVar.c().d(new kgf((Object) this, 17), a, TimeUnit.NANOSECONDS, jzcVar.d());
        }
    }

    public final void h(jxi jxiVar, jzi jziVar) {
        if (jxiVar == this.o && (jxiVar == jxi.d || jxiVar == jxi.a)) {
            return;
        }
        this.o = jxiVar;
        this.i.f(jxiVar, jziVar);
    }

    public final void i(kjs kjsVar) {
        jxi jxiVar = kjsVar.b;
        jxi jxiVar2 = jxi.b;
        if (jxiVar != jxiVar2) {
            return;
        }
        if (this.p || kjsVar.a() == jxiVar2) {
            h(jxiVar2, new jzb(jze.d(kjsVar.a)));
            return;
        }
        jxi a = kjsVar.a();
        jxi jxiVar3 = jxi.c;
        if (a == jxiVar3) {
            h(jxiVar3, new jzb(jze.b(kjsVar.d.b)));
        } else if (this.o != jxiVar3) {
            h(kjsVar.a(), new jzb(jze.a));
        }
    }
}
