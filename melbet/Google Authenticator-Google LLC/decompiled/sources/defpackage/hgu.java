package defpackage;

import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hgu extends hbo implements Serializable, hgv {
    private static final long serialVersionUID = 0;
    public transient hgr a;
    public transient hgr b;
    public transient Map d;
    public transient int e;
    public transient int f;

    public hgu(hhu hhuVar) {
        this(hhuVar.q().size());
        for (Map.Entry entry : hhuVar.o()) {
            a(entry.getKey(), entry.getValue(), null);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new hcl();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            a(objectInputStream.readObject(), objectInputStream.readObject(), null);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e);
        for (Map.Entry entry : o()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final hgr a(Object obj, Object obj2, hgr hgrVar) {
        hgr hgrVar2 = new hgr(obj, obj2);
        if (this.a == null) {
            this.b = hgrVar2;
            this.a = hgrVar2;
            this.d.put(obj, new hgq(hgrVar2));
            this.f++;
        } else if (hgrVar == null) {
            hgr hgrVar3 = this.b;
            hgrVar3.getClass();
            hgrVar3.a = hgrVar2;
            hgrVar2.b = hgrVar3;
            this.b = hgrVar2;
            hgq hgqVar = (hgq) this.d.get(obj);
            if (hgqVar == null) {
                this.d.put(obj, new hgq(hgrVar2));
                this.f++;
            } else {
                hgqVar.c++;
                hgr hgrVar4 = hgqVar.b;
                hgrVar4.c = hgrVar2;
                hgrVar2.d = hgrVar4;
                hgqVar.b = hgrVar2;
            }
        } else {
            hgq hgqVar2 = (hgq) this.d.get(obj);
            hgqVar2.getClass();
            hgqVar2.c++;
            hgrVar2.b = hgrVar.b;
            hgrVar2.d = hgrVar.d;
            hgrVar2.a = hgrVar;
            hgrVar2.c = hgrVar;
            hgr hgrVar5 = hgrVar.d;
            if (hgrVar5 == null) {
                hgqVar2.a = hgrVar2;
            } else {
                hgrVar5.c = hgrVar2;
            }
            hgr hgrVar6 = hgrVar.b;
            if (hgrVar6 == null) {
                this.a = hgrVar2;
            } else {
                hgrVar6.a = hgrVar2;
            }
            hgrVar.b = hgrVar2;
            hgrVar.d = hgrVar2;
        }
        this.e++;
        return hgrVar2;
    }

    @Override // defpackage.hbo, defpackage.hhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List o() {
        return (List) super.o();
    }

    @Override // defpackage.hgv
    public final List c(Object obj) {
        return new hgm(this, obj);
    }

    @Override // defpackage.hhu
    public final int d() {
        throw null;
    }

    @Override // defpackage.hbo
    public final /* synthetic */ Collection e() {
        return new hgn(this);
    }

    public final List f(Object obj) {
        List unmodifiableList = DesugarCollections.unmodifiableList(hnu.C(new hgt(this, obj)));
        h(obj);
        return unmodifiableList;
    }

    @Override // defpackage.hbo
    public final Iterator g() {
        throw null;
    }

    public final void h(Object obj) {
        hnu.M(new hgt(this, obj));
    }

    @Override // defpackage.hbo
    public final Map i() {
        return new hhx(this);
    }

    @Override // defpackage.hbo
    public final Set j() {
        return new hgo(this);
    }

    @Override // defpackage.hhu
    public final void k() {
        throw null;
    }

    public final void l(hgr hgrVar) {
        hgr hgrVar2 = hgrVar.b;
        if (hgrVar2 != null) {
            hgrVar2.a = hgrVar.a;
        } else {
            this.a = hgrVar.a;
        }
        hgr hgrVar3 = hgrVar.a;
        if (hgrVar3 != null) {
            hgrVar3.b = hgrVar2;
        } else {
            this.b = hgrVar2;
        }
        if (hgrVar.d == null && hgrVar.c == null) {
            hgq hgqVar = (hgq) this.d.remove(hgrVar.getKey());
            hgqVar.getClass();
            hgqVar.c = 0;
            this.f++;
        } else {
            hgq hgqVar2 = (hgq) this.d.get(hgrVar.getKey());
            hgqVar2.getClass();
            hgqVar2.c--;
            hgr hgrVar4 = hgrVar.d;
            if (hgrVar4 == null) {
                hgr hgrVar5 = hgrVar.c;
                hgrVar5.getClass();
                hgqVar2.a = hgrVar5;
            } else {
                hgrVar4.c = hgrVar.c;
            }
            hgr hgrVar6 = hgrVar.c;
            if (hgrVar6 == null) {
                hgrVar4.getClass();
                hgqVar2.b = hgrVar4;
            } else {
                hgrVar6.d = hgrVar4;
            }
        }
        this.e--;
    }

    @Override // defpackage.hhu
    public final boolean m(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final boolean n(Object obj, Object obj2) {
        a(obj, obj2, null);
        return true;
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final /* bridge */ /* synthetic */ boolean r(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final /* bridge */ /* synthetic */ boolean s(Object obj, Object obj2) {
        throw null;
    }

    public hgu(int i) {
        this.d = new hci(i);
    }

    public hgu() {
        throw null;
    }
}
