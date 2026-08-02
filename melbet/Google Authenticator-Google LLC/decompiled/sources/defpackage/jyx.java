package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyx {
    private static final Object[][] a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    private List b;
    private final jwt c = jwt.a;
    private Object[][] d = a;

    public final jyz a() {
        return new jyz(this.b, this.c, this.d);
    }

    public final void b(jyy jyyVar, Object obj) {
        int i = 0;
        while (true) {
            Object[][] objArr = this.d;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (jyyVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            Object[][] objArr2 = this.d;
            int length = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            this.d = objArr3;
            i = objArr3.length - 1;
        }
        this.d[i] = new Object[]{jyyVar, obj};
    }

    public final void c(List list) {
        hoq.y(!list.isEmpty(), "addrs is empty");
        this.b = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
