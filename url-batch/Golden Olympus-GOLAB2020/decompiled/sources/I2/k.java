package I2;

import Z2.a;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes3.dex */
public abstract class k extends j implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    protected Vector f787b = new Vector();

    protected k() {
    }

    private b h(Enumeration enumeration) {
        return (b) enumeration.nextElement();
    }

    @Override // I2.j
    boolean d(j jVar) {
        if (!(jVar instanceof k)) {
            return false;
        }
        k kVar = (k) jVar;
        if (size() != kVar.size()) {
            return false;
        }
        Enumeration j4 = j();
        Enumeration j5 = kVar.j();
        while (j4.hasMoreElements()) {
            b h4 = h(j4);
            b h5 = h(j5);
            j b4 = h4.b();
            j b5 = h5.b();
            if (b4 != b5 && !b4.equals(b5)) {
                return false;
            }
        }
        return true;
    }

    @Override // I2.j
    j g() {
        o oVar = new o();
        oVar.f787b = this.f787b;
        return oVar;
    }

    @Override // I2.j, I2.e
    public int hashCode() {
        Enumeration j4 = j();
        int size = size();
        while (j4.hasMoreElements()) {
            size = (size * 17) ^ h(j4).hashCode();
        }
        return size;
    }

    public b i(int i4) {
        return (b) this.f787b.elementAt(i4);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0070a(k());
    }

    public Enumeration j() {
        return this.f787b.elements();
    }

    public b[] k() {
        b[] bVarArr = new b[size()];
        for (int i4 = 0; i4 != size(); i4++) {
            bVarArr[i4] = i(i4);
        }
        return bVarArr;
    }

    public int size() {
        return this.f787b.size();
    }

    public String toString() {
        return this.f787b.toString();
    }

    protected k(c cVar) {
        for (int i4 = 0; i4 != cVar.c(); i4++) {
            this.f787b.addElement(cVar.b(i4));
        }
    }
}
