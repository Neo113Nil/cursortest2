package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class h0 implements Consumer, Iterable, j$.lang.a {
    public int a;
    public int b;
    public long[] c;
    public Object[] d = new Object[16];
    public Object[][] e;

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.a;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            Object[][] objArr2 = this.e;
            if (objArr2 == null) {
                Object[][] objArr3 = new Object[8][];
                this.e = objArr3;
                this.c = new long[8];
                objArr3[0] = objArr;
                objArr2 = objArr3;
            }
            int i2 = this.b;
            int i3 = i2 + 1;
            if (i3 >= objArr2.length || objArr2[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr2[i2].length + this.c[i2];
                }
                g(length + 1);
            }
            this.a = 0;
            int i4 = this.b + 1;
            this.b = i4;
            objArr = this.e[i4];
            this.d = objArr;
            i = 0;
        }
        this.a = i + 1;
        objArr[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final void clear() {
        Object[][] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.d;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.e = null;
            this.c = null;
        } else {
            for (int i2 = 0; i2 < this.a; i2++) {
                this.d[i2] = null;
            }
        }
        this.a = 0;
        this.b = 0;
    }

    public final long count() {
        int i = this.b;
        return i == 0 ? this.a : this.c[i] + this.a;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            for (Object obj : this.e[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            consumer.accept(this.d[i2]);
        }
    }

    public final void g(long j) {
        int i = this.b;
        long length = i == 0 ? this.d.length : this.c[i] + this.e[i].length;
        if (j > length) {
            if (this.e == null) {
                Object[][] objArr = new Object[8][];
                this.e = objArr;
                this.c = new long[8];
                objArr[0] = this.d;
            }
            int i2 = i + 1;
            while (j > length) {
                Object[][] objArr2 = this.e;
                if (i2 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.e = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.c = Arrays.copyOf(this.c, length2);
                }
                int min = 1 << ((i2 == 0 || i2 == 1) ? 4 : Math.min(i2 + 3, 30));
                this.e[i2] = new Object[min];
                long[] jArr = this.c;
                jArr[i2] = jArr[i2 - 1] + r5[r7].length;
                length += min;
                i2++;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.t(new g0(this, 0, this.b, 0, this.a));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new j$.time.format.s(5, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
