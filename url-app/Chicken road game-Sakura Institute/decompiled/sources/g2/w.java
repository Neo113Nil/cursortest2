package g2;

import j2.AbstractC0720j;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public y f6765b;

    /* renamed from: d, reason: collision with root package name */
    public final h f6767d;

    /* renamed from: e, reason: collision with root package name */
    public final b2.k f6768e;

    /* renamed from: f, reason: collision with root package name */
    public final l2.i f6769f;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6764a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f6766c = false;

    public w(h hVar, b2.k kVar, l2.i iVar) {
        this.f6767d = hVar;
        this.f6768e = kVar;
        this.f6769f = iVar;
    }

    public final void a() {
        y yVar;
        int i2 = 0;
        boolean z4 = true;
        if (!this.f6764a.compareAndSet(false, true) || (yVar = this.f6765b) == null) {
            return;
        }
        synchronized (yVar.f6775a) {
            try {
                List list = (List) yVar.f6775a.get(this);
                int i4 = 0;
                if (list != null) {
                    while (true) {
                        if (i4 >= list.size()) {
                            i4 = 0;
                            break;
                        } else {
                            if (list.get(i4) == this) {
                                list.remove(i4);
                                i4 = 1;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (list.isEmpty()) {
                        yVar.f6775a.remove(this);
                    }
                }
                if (i4 == 0 && this.f6766c) {
                    z4 = false;
                }
                AbstractC0720j.c(z4);
                if (!this.f6769f.b()) {
                    w wVar = new w(this.f6767d, this.f6768e, l2.i.a(this.f6769f.f7984a));
                    List list2 = (List) yVar.f6775a.get(wVar);
                    if (list2 != null) {
                        while (true) {
                            if (i2 >= list2.size()) {
                                break;
                            }
                            if (list2.get(i2) == this) {
                                list2.remove(i2);
                                break;
                            }
                            i2++;
                        }
                        if (list2.isEmpty()) {
                            yVar.f6775a.remove(wVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6765b = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (wVar.f6768e.equals(this.f6768e) && wVar.f6767d.equals(this.f6767d) && wVar.f6769f.equals(this.f6769f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6769f.hashCode() + ((this.f6767d.hashCode() + (this.f6768e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
