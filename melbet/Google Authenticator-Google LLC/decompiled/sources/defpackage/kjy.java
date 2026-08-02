package defpackage;

import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjy extends jzk {
    public final jzc f;
    public jxi g = jxi.d;
    private jzh h;

    public kjy(jzc jzcVar) {
        this.f = jzcVar;
    }

    @Override // defpackage.jzk
    public final kbq a(jzg jzgVar) {
        kjw kjwVar;
        Boolean bool;
        List list = jzgVar.a;
        if (list.isEmpty()) {
            jwt jwtVar = jzgVar.b;
            kbq e = kbq.l.e("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + jwtVar.toString());
            b(e);
            return e;
        }
        Object obj = jzgVar.c;
        if ((obj instanceof kjw) && (bool = (kjwVar = (kjw) obj).a) != null && bool.booleanValue()) {
            Long l = kjwVar.b;
            list = kju.e(list, new Random());
        }
        jzh jzhVar = this.h;
        if (jzhVar == null) {
            jzc jzcVar = this.f;
            jyx jyxVar = new jyx();
            jyxVar.c(list);
            jzh b = jzcVar.b(jyxVar.a());
            b.c(new kjv(this, b, 0));
            this.h = b;
            e(jxi.a, new jzb(jze.a));
            b.a();
        } else {
            jzhVar.d(list);
        }
        return kbq.b;
    }

    @Override // defpackage.jzk
    public final void b(kbq kbqVar) {
        jzh jzhVar = this.h;
        if (jzhVar != null) {
            jzhVar.b();
            this.h = null;
        }
        e(jxi.c, new jzb(jze.b(kbqVar)));
    }

    @Override // defpackage.jzk
    public final void c() {
        jzh jzhVar = this.h;
        if (jzhVar != null) {
            jzhVar.a();
        }
    }

    @Override // defpackage.jzk
    public final void d() {
        jzh jzhVar = this.h;
        if (jzhVar != null) {
            jzhVar.b();
        }
    }

    public final void e(jxi jxiVar, jzi jziVar) {
        this.g = jxiVar;
        this.f.f(jxiVar, jziVar);
    }
}
