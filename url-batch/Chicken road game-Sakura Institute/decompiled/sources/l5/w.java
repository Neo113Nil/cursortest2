package l5;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public e f6086b;

    /* renamed from: d, reason: collision with root package name */
    public final i f6088d;

    /* renamed from: e, reason: collision with root package name */
    public final g5.k f6089e;

    /* renamed from: f, reason: collision with root package name */
    public final q5.i f6090f;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6085a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f6087c = false;

    public w(i iVar, g5.k kVar, q5.i iVar2) {
        this.f6088d = iVar;
        this.f6089e = kVar;
        this.f6090f = iVar2;
    }

    public final void a() {
        e eVar;
        int i7 = 0;
        boolean z8 = true;
        if (!this.f6085a.compareAndSet(false, true) || (eVar = this.f6086b) == null) {
            return;
        }
        y yVar = (y) eVar;
        synchronized (yVar.f6096a) {
            try {
                List list = (List) yVar.f6096a.get(this);
                int i8 = 0;
                if (list != null) {
                    while (true) {
                        if (i8 >= list.size()) {
                            i8 = 0;
                            break;
                        } else {
                            if (list.get(i8) == this) {
                                list.remove(i8);
                                i8 = 1;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (list.isEmpty()) {
                        yVar.f6096a.remove(this);
                    }
                }
                if (i8 == 0 && this.f6087c) {
                    z8 = false;
                }
                o5.j.c(z8);
                if (!this.f6090f.b()) {
                    w wVar = new w(this.f6088d, this.f6089e, q5.i.a(this.f6090f.f7535a));
                    List list2 = (List) yVar.f6096a.get(wVar);
                    if (list2 != null) {
                        while (true) {
                            if (i7 >= list2.size()) {
                                break;
                            }
                            if (list2.get(i7) == this) {
                                list2.remove(i7);
                                break;
                            }
                            i7++;
                        }
                        if (list2.isEmpty()) {
                            yVar.f6096a.remove(wVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6086b = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return wVar.f6089e.equals(this.f6089e) && wVar.f6088d.equals(this.f6088d) && wVar.f6090f.equals(this.f6090f);
    }

    public final int hashCode() {
        return this.f6090f.hashCode() + ((this.f6088d.hashCode() + (this.f6089e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
