package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hfk extends hdz {
    Object[] d;
    private int e;

    public hfk(int i) {
        super(i);
        this.d = new Object[hfm.d(i)];
    }

    public hfm g() {
        hfm j;
        int i = this.b;
        if (i == 0) {
            return hjb.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new hjn(obj);
        }
        if (this.d == null || hfm.d(i) != this.d.length) {
            j = hfm.j(this.b, this.a);
            this.b = j.size();
        } else {
            int i2 = this.b;
            Object[] objArr = this.a;
            if (hfm.t(i2, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            j = new hjb(objArr, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return j;
    }

    @Override // defpackage.hdz, defpackage.hea
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int d = hfm.d(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (d <= length) {
                objArr.getClass();
                int hashCode = obj.hashCode();
                int af = hnu.af(hashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = af & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        af = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void i(Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void k(hfk hfkVar) {
        if (this.d == null) {
            a(hfkVar.a, hfkVar.b);
            return;
        }
        for (int i = 0; i < hfkVar.b; i++) {
            Object obj = hfkVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public hfk() {
        super(4);
    }
}
