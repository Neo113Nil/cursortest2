package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.baidu.mapauto.auth.org.spongycastle.util.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes2.dex */
public abstract class s extends r implements Iterable<d> {

    /* renamed from: a, reason: collision with root package name */
    public Vector f7833a = new Vector();

    public s() {
    }

    public d a(int i8) {
        return (d) this.f7833a.elementAt(i8);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return true;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public r g() {
        z0 z0Var = new z0();
        z0Var.f7833a = this.f7833a;
        return z0Var;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public r h() {
        l1 l1Var = new l1();
        l1Var.f7833a = this.f7833a;
        return l1Var;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        Enumeration i8 = i();
        int size = size();
        while (i8.hasMoreElements()) {
            size = (size * 17) ^ ((d) i8.nextElement()).hashCode();
        }
        return size;
    }

    public Enumeration i() {
        return this.f7833a.elements();
    }

    @Override // java.lang.Iterable
    public final Iterator<d> iterator() {
        d[] dVarArr = new d[size()];
        for (int i8 = 0; i8 != size(); i8++) {
            dVarArr[i8] = a(i8);
        }
        return new a.C0067a(dVarArr);
    }

    public int size() {
        return this.f7833a.size();
    }

    public final String toString() {
        return this.f7833a.toString();
    }

    public s(e eVar) {
        for (int i8 = 0; i8 != eVar.a(); i8++) {
            this.f7833a.addElement(eVar.a(i8));
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof s)) {
            return false;
        }
        s sVar = (s) rVar;
        if (size() != sVar.size()) {
            return false;
        }
        Enumeration i8 = i();
        Enumeration i9 = sVar.i();
        while (i8.hasMoreElements()) {
            d dVar = (d) i8.nextElement();
            d dVar2 = (d) i9.nextElement();
            r c8 = dVar.c();
            r c9 = dVar2.c();
            if (c8 != c9 && !c8.equals(c9)) {
                return false;
            }
        }
        return true;
    }

    public static s a(Object obj) {
        if (obj == null || (obj instanceof s)) {
            return (s) obj;
        }
        if (obj instanceof t) {
            return a((Object) ((t) obj).c());
        }
        if (obj instanceof byte[]) {
            try {
                return a((Object) r.a((byte[]) obj));
            } catch (IOException e8) {
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("failed to construct sequence from byte[]: ");
                a8.append(e8.getMessage());
                throw new IllegalArgumentException(a8.toString());
            }
        }
        if (obj instanceof d) {
            r c8 = ((d) obj).c();
            if (c8 instanceof s) {
                return (s) c8;
            }
        }
        StringBuilder a9 = com.baidu.mapauto.auth.b.a("unknown object in getInstance: ");
        a9.append(obj.getClass().getName());
        throw new IllegalArgumentException(a9.toString());
    }
}
