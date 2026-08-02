package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfq extends hen {
    private transient Object[] d;
    private transient Object[] e;
    private final Comparator f;

    public hfq(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // defpackage.hen
    public final /* bridge */ /* synthetic */ her b() {
        int i = this.b;
        if (i == 0) {
            return hfs.a(this.f);
        }
        if (i == 1) {
            Comparator comparator = this.f;
            Object obj = this.d[0];
            obj.getClass();
            Object obj2 = this.e[0];
            obj2.getClass();
            return hfs.o(comparator, obj, obj2);
        }
        Object[] copyOf = Arrays.copyOf(this.d, i);
        Comparator comparator2 = this.f;
        Arrays.sort(copyOf, comparator2);
        Object[] objArr = new Object[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (comparator2.compare(copyOf[i3], copyOf[i2]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + String.valueOf(copyOf[i3]) + " and " + String.valueOf(copyOf[i2]));
                }
            }
            Object obj3 = this.d[i2];
            obj3.getClass();
            int binarySearch = Arrays.binarySearch(copyOf, obj3, comparator2);
            Object obj4 = this.e[i2];
            obj4.getClass();
            objArr[binarySearch] = obj4;
        }
        return new hfs(new hjc(hel.h(copyOf), comparator2), hel.h(objArr), null);
    }

    @Override // defpackage.hen
    public final /* bridge */ /* synthetic */ void g(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.d.length;
        if (i > length) {
            int f = hea.f(length, i);
            this.d = Arrays.copyOf(this.d, f);
            this.e = Arrays.copyOf(this.e, f);
        }
        hnu.ao(obj, obj2);
        Object[] objArr = this.d;
        int i2 = this.b;
        objArr[i2] = obj;
        this.e[i2] = obj2;
        this.b = i2 + 1;
    }
}
