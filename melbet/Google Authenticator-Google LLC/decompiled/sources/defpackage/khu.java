package defpackage;

import j$.util.DesugarCollections;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khu implements jyo {
    private final kfl A;
    private final kev B;
    private final kag C;
    public final khq a;
    public final ScheduledExecutorService b;
    public final jyl c;
    public final jwy d;
    public final boolean e;
    public final List f;
    public final kbw g;
    public final khr h;
    public volatile List i;
    public final hab j;
    public kjb k;
    public kfr n;
    public volatile kjb o;
    public kbq q;
    public volatile jwt r;
    public final kmq s;
    public final String t;
    public kgo u;
    public kuq v;
    public kuq w;
    private final jyp x;
    private final String y;
    private final String z;
    public final Collection l = new ArrayList();
    public final khh m = new khm(this);
    public volatile jxj p = jxj.a(jxi.d);

    public khu(jyz jyzVar, String str, String str2, kfl kflVar, ScheduledExecutorService scheduledExecutorService, kbw kbwVar, khq khqVar, jyl jylVar, kev kevVar, jyp jypVar, jwy jwyVar, List list, String str3, kag kagVar) {
        Object obj;
        List list2 = jyzVar.a;
        hoq.y(!list2.isEmpty(), "addressGroups is empty");
        i(list2);
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = unmodifiableList;
        this.h = new khr(unmodifiableList);
        this.y = str;
        this.z = str2;
        this.A = kflVar;
        this.b = scheduledExecutorService;
        this.j = new hab();
        this.g = kbwVar;
        this.C = kagVar;
        this.a = khqVar;
        this.c = jylVar;
        this.B = kevVar;
        this.x = jypVar;
        this.d = jwyVar;
        this.f = list;
        jyy jyyVar = jzk.c;
        int i = 0;
        while (true) {
            Object[][] objArr = jyzVar.c;
            if (i >= objArr.length) {
                obj = jyyVar.a;
                break;
            } else {
                if (jyyVar.equals(objArr[i][0])) {
                    obj = jyzVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((Boolean) obj).booleanValue();
        this.t = str3;
        this.s = new kmq(kagVar);
    }

    public static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String j(kbq kbqVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(kbqVar.o);
        String str = kbqVar.p;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = kbqVar.q;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    public final kfj a() {
        kjb kjbVar = this.o;
        if (kjbVar != null) {
            return kjbVar;
        }
        this.g.execute(new kgf(this, 7));
        return null;
    }

    public final void b(jxi jxiVar) {
        this.g.c();
        d(jxj.a(jxiVar));
    }

    @Override // defpackage.jyv
    public final jyp c() {
        return this.x;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, jzj] */
    public final void d(jxj jxjVar) {
        this.g.c();
        jxi jxiVar = this.p.a;
        jxi jxiVar2 = jxjVar.a;
        if (jxiVar != jxiVar2) {
            hoq.K(this.p.a != jxi.e, "Cannot transition out of SHUTDOWN to %s", jxiVar2);
            if (this.e && jxiVar2 == jxi.c) {
                this.p = jxj.a(jxi.d);
            } else {
                this.p = jxjVar;
            }
            this.a.a.a(jxjVar);
        }
    }

    public final void e() {
        this.g.execute(new kgf(this, 9));
    }

    public final void f(kbq kbqVar) {
        this.g.execute(new kga(this, kbqVar, 12, null));
    }

    public final void g() {
        jyg jygVar;
        kbw kbwVar = this.g;
        kbwVar.c();
        hoq.I(this.v == null, "Should have no reconnectTask scheduled");
        khr khrVar = this.h;
        if (khrVar.b == 0 && khrVar.c == 0) {
            hab habVar = this.j;
            habVar.d();
            habVar.e();
        }
        SocketAddress b = khrVar.b();
        if (b instanceof jyg) {
            jyg jygVar2 = (jyg) b;
            jygVar = jygVar2;
            b = jygVar2.a;
        } else {
            jygVar = null;
        }
        jwt a = khrVar.a();
        String str = (String) a.a(jxx.a);
        kfk kfkVar = new kfk();
        if (str == null) {
            str = this.y;
        }
        str.getClass();
        kfkVar.a = str;
        kfkVar.b = a;
        kfkVar.c = this.z;
        this.C.getClass();
        kfkVar.d = jygVar;
        kht khtVar = new kht();
        khtVar.a = this.x;
        InetSocketAddress inetSocketAddress = (InetSocketAddress) b;
        kea keaVar = (kea) ((ket) this.A).a;
        khp khpVar = new khp(new kes(new keh(keaVar.d, inetSocketAddress, kfkVar.a, kfkVar.c, kfkVar.b, keaVar.b, keaVar.c, keaVar.e), kfkVar.a), this.B);
        khtVar.a = khpVar.c();
        jyl.b(this.c.e, khpVar);
        this.n = khpVar;
        this.l.add(khpVar);
        kbwVar.b(khpVar.b(new khs(this, khpVar)));
        this.d.b(2, "Started transport {0}", khtVar.a);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.f("logId", this.x.a);
        T.b("addressGroups", this.i);
        return T.toString();
    }
}
