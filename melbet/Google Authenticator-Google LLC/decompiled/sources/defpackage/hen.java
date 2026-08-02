package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hen {
    Object[] a;
    int b = 0;
    iyi c;

    public hen(int i) {
        this.a = new Object[i + i];
    }

    private final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, hea.f(length, i2));
        }
    }

    public her b() {
        return d(true);
    }

    public final her d(boolean z) {
        iyi iyiVar;
        iyi iyiVar2;
        if (z && (iyiVar2 = this.c) != null) {
            throw iyiVar2.c();
        }
        hix a = hix.a(this.b, this.a, this);
        if (!z || (iyiVar = this.c) == null) {
            return a;
        }
        throw iyiVar.c();
    }

    public final void e(Map.Entry entry) {
        g(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e((Map.Entry) it.next());
        }
    }

    public void g(Object obj, Object obj2) {
        a(this.b + 1);
        hnu.ao(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }
}
