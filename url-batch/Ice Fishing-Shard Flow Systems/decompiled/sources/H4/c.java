package H4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f987d;

    /* renamed from: e, reason: collision with root package name */
    public int f988e;

    public c(Object[] objArr) {
        this.f987d = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r3 == null ? r4 == null ? 0 : -1 : r4 == null ? 1 : r9.compare(r3, r4)) <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Object[] objArr, int i2, int i5, Object[] objArr2, Comparator comparator) {
        if (i5 - i2 <= 2) {
            return;
        }
        int i7 = ((i5 + i2) / 4) * 2;
        d(objArr2, i2, i7, objArr, comparator);
        d(objArr2, i7, i5, objArr, comparator);
        int i8 = i2;
        int i9 = i7;
        while (i2 < i5) {
            if (i8 < i7 - 1) {
                if (i9 < i5 - 1) {
                    Object obj = objArr[i8];
                    Object obj2 = objArr[i9];
                }
                objArr2[i2] = objArr[i8];
                objArr2[i2 + 1] = objArr[i8 + 1];
                i8 += 2;
                i2 += 2;
            }
            objArr2[i2] = objArr[i9];
            objArr2[i2 + 1] = objArr[i9 + 1];
            i9 += 2;
            i2 += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Arrays.equals(this.f987d, ((c) obj).f987d);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f987d;
            if (i2 >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i2], objArr[i2 + 1]);
            i2 += 2;
        }
    }

    public final int hashCode() {
        int i2 = this.f988e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f987d) ^ 1000003;
        this.f988e = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f987d.length == 0;
    }

    public final int size() {
        return this.f987d.length / 2;
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("{");
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f987d;
            if (i2 >= objArr.length) {
                break;
            }
            Object obj2 = objArr[i2 + 1];
            if (obj2 instanceof String) {
                obj = "\"" + ((String) obj2) + '\"';
            } else {
                obj = obj2.toString();
            }
            sb.append(objArr[i2]);
            sb.append("=");
            sb.append(obj);
            sb.append(", ");
            i2 += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Object[] objArr, Comparator comparator) {
        this(objArr);
        d.a("You must provide an even number of key/value pair arguments.", objArr.length % 2 == 0);
        if (objArr.length != 0) {
            Object[] objArr2 = new Object[objArr.length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            d(objArr2, 0, objArr.length, objArr, comparator);
            Object obj = null;
            int i2 = 0;
            for (int i5 = 0; i5 < objArr.length; i5 += 2) {
                Object obj2 = objArr[i5];
                Object obj3 = objArr[i5 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator.compare(obj2, obj) == 0) {
                        i2 -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i7 = i2 + 1;
                        objArr[i2] = obj2;
                        i2 += 2;
                        objArr[i7] = obj3;
                        obj = obj2;
                    }
                }
            }
            if (objArr.length != i2) {
                Object[] objArr3 = new Object[i2];
                System.arraycopy(objArr, 0, objArr3, 0, i2);
                objArr = objArr3;
            }
        }
    }
}
