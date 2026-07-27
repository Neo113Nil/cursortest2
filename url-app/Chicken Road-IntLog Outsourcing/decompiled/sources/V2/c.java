package V2;

import B0.o;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3233a;

    /* renamed from: b, reason: collision with root package name */
    public int f3234b;

    public c(Object[] objArr) {
        this.f3233a = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if ((r3 == null ? r4 == null ? 0 : -1 : r4 == null ? 1 : r9.compare(r3, r4)) <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Object[] objArr, int i2, int i3, Object[] objArr2, Comparator comparator) {
        if (i3 - i2 <= 2) {
            return;
        }
        int i6 = ((i3 + i2) / 4) * 2;
        b(objArr2, i2, i6, objArr, comparator);
        b(objArr2, i6, i3, objArr, comparator);
        int i7 = i2;
        int i8 = i6;
        while (i2 < i3) {
            if (i7 < i6 - 1) {
                if (i8 < i3 - 1) {
                    Object obj = objArr[i7];
                    Object obj2 = objArr[i8];
                }
                objArr2[i2] = objArr[i7];
                objArr2[i2 + 1] = objArr[i7 + 1];
                i7 += 2;
                i2 += 2;
            }
            objArr2[i2] = objArr[i8];
            objArr2[i2 + 1] = objArr[i8 + 1];
            i8 += 2;
            i2 += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Arrays.equals(this.f3233a, ((c) obj).f3233a);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f3233a;
            if (i2 >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i2], objArr[i2 + 1]);
            i2 += 2;
        }
    }

    public final int hashCode() {
        int i2 = this.f3234b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f3233a) ^ 1000003;
        this.f3234b = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f3233a.length == 0;
    }

    public final int size() {
        return this.f3233a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f3233a;
            if (i2 >= objArr.length) {
                break;
            }
            Object obj = objArr[i2 + 1];
            String l2 = obj instanceof String ? o.l(new StringBuilder("\""), (String) obj, '\"') : obj.toString();
            sb.append(objArr[i2]);
            sb.append("=");
            sb.append(l2);
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
            b(objArr2, 0, objArr.length, objArr, comparator);
            Object obj = null;
            int i2 = 0;
            for (int i3 = 0; i3 < objArr.length; i3 += 2) {
                Object obj2 = objArr[i3];
                Object obj3 = objArr[i3 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator.compare(obj2, obj) == 0) {
                        i2 -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i6 = i2 + 1;
                        objArr[i2] = obj2;
                        i2 += 2;
                        objArr[i6] = obj3;
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
