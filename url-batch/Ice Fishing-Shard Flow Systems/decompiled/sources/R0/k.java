package R0;

/* loaded from: classes.dex */
public final class k extends i {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = i.f2394o;
        }
        if (!i.f2393n.h(this, null, obj)) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!i.f2393n.h(this, null, new c(th))) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean k(O1.a aVar) {
        c cVar;
        aVar.getClass();
        Object obj = this.f2395d;
        if (obj == null) {
            if (aVar.isDone()) {
                if (i.f2393n.h(this, null, i.f(aVar))) {
                    i.c(this);
                    return true;
                }
                return false;
            }
            f fVar = new f(this, aVar);
            if (i.f2393n.h(this, null, fVar)) {
                try {
                    aVar.a(fVar, j.f2398d);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Throwable unused) {
                        cVar = c.f2375b;
                    }
                    i.f2393n.h(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.f2395d;
        }
        if (obj instanceof a) {
            aVar.cancel(((a) obj).f2372a);
        }
        return false;
    }
}
