package defpackage;

import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjv implements jzj {
    final /* synthetic */ Object a;
    final /* synthetic */ jzk b;
    private final /* synthetic */ int c;

    public /* synthetic */ kjv(kju kjuVar, kjs kjsVar, int i) {
        this.c = i;
        this.b = kjuVar;
        this.a = kjsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0167, code lost:
    
        if (r9.containsKey(r14.b()) == false) goto L76;
     */
    @Override // defpackage.jzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jxj jxjVar) {
        jzi jzbVar;
        jzb jzbVar2;
        jxi jxiVar;
        if (this.c == 0) {
            jxi jxiVar2 = jxjVar.a;
            if (jxiVar2 == jxi.e) {
                return;
            }
            jzk jzkVar = this.b;
            jxi jxiVar3 = jxi.c;
            if (jxiVar2 == jxiVar3 || jxiVar2 == jxi.d) {
                ((kjy) jzkVar).f.e();
            }
            kjy kjyVar = (kjy) jzkVar;
            if (kjyVar.g == jxiVar3) {
                if (jxiVar2 == jxi.a) {
                    return;
                }
                if (jxiVar2 == jxi.d) {
                    jzkVar.c();
                    return;
                }
            }
            int ordinal = jxiVar2.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    jzbVar2 = new jzb(jze.d((jzh) this.a));
                } else if (ordinal == 2) {
                    jzbVar2 = new jzb(jze.b(jxjVar.b));
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("Unsupported state:".concat(jxiVar2.toString()));
                    }
                    jzbVar = new kjx(kjyVar);
                }
                jzbVar = jzbVar2;
            } else {
                jzbVar = new jzb(jze.a);
            }
            kjyVar.e(jxiVar2, jzbVar);
            return;
        }
        Object obj = this.a;
        kjs kjsVar = (kjs) obj;
        jzh jzhVar = kjsVar.a;
        jzk jzkVar2 = this.b;
        SocketAddress k = kju.k(jzhVar);
        kju kjuVar = (kju) jzkVar2;
        Map map = kjuVar.j;
        if (obj == map.get(k) && (jxiVar = jxjVar.a) != jxi.e) {
            jxi jxiVar4 = jxi.d;
            if (jxiVar == jxiVar4 && kjsVar.b == jxi.b) {
                kjuVar.i.e();
            }
            kjsVar.b(jxiVar);
            jxi jxiVar5 = kjuVar.n;
            jxi jxiVar6 = jxi.c;
            if (jxiVar5 == jxiVar6 || kjuVar.o == jxiVar6) {
                if (jxiVar == jxi.a) {
                    return;
                }
                if (jxiVar == jxiVar4) {
                    jzkVar2.c();
                    return;
                }
            }
            int ordinal2 = jxiVar.ordinal();
            if (ordinal2 == 0) {
                jxi jxiVar7 = jxi.a;
                kjuVar.n = jxiVar7;
                if (kjuVar.h || kjuVar.k.f()) {
                    kjp kjpVar = kjuVar.k;
                    if (kjpVar.f()) {
                    }
                    kjuVar.h(jxiVar7, new jzb(jze.a));
                    return;
                }
                kjuVar.k.g(kju.k(jzhVar));
                kjuVar.h(jxiVar7, new jzb(jze.a));
                return;
            }
            if (ordinal2 == 1) {
                kuq kuqVar = kjuVar.s;
                if (kuqVar != null) {
                    kuqVar.c();
                    kjuVar.s = null;
                }
                kjuVar.q = null;
                kjuVar.f();
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    jzh jzhVar2 = ((kjs) it.next()).a;
                    if (!jzhVar2.equals(jzhVar)) {
                        jzhVar2.b();
                    }
                }
                map.clear();
                jxi jxiVar8 = jxi.b;
                kjsVar.b(jxiVar8);
                map.put(kju.k(jzhVar), obj);
                kjuVar.k.g(kju.k(jzhVar));
                kjuVar.n = jxiVar8;
                kjuVar.i(kjsVar);
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    throw new IllegalArgumentException("Unsupported state:".concat(jxiVar.toString()));
                }
                kjuVar.k.c();
                kjuVar.n = jxiVar4;
                kjuVar.h(jxiVar4, new kjr(kjuVar, kjuVar));
                return;
            }
            kjp kjpVar2 = kjuVar.k;
            if (kjpVar2.f() && map.get(kjpVar2.b()) == obj) {
                if (kjpVar2.e()) {
                    kjuVar.f();
                    jzkVar2.c();
                } else if (map.size() >= kjpVar2.a()) {
                    kjuVar.g();
                } else {
                    kjpVar2.c();
                    jzkVar2.c();
                }
            }
            if (map.size() >= kjpVar2.a()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    if (!((kjs) it2.next()).c) {
                        return;
                    }
                }
                kjuVar.n = jxiVar6;
                kjuVar.h(jxiVar6, new jzb(jze.b(jxjVar.b)));
                int i = kjuVar.l + 1;
                kjuVar.l = i;
                if (i >= kjpVar2.a() || kjuVar.m) {
                    kjuVar.m = false;
                    kjuVar.l = 0;
                    kjuVar.i.e();
                }
            }
        }
    }

    public kjv(kjy kjyVar, jzh jzhVar, int i) {
        this.c = i;
        this.a = jzhVar;
        this.b = kjyVar;
    }
}
