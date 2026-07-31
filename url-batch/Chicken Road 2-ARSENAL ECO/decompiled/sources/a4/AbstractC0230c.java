package a4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0230c {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f3136f;

    /* renamed from: g, reason: collision with root package name */
    public int f3137g;

    public AbstractC0230c(Object[] objArr) {
        this.f3136f = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r3 == null ? r4 == null ? 0 : -1 : r4 == null ? 1 : r9.compare(r3, r4)) <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Object[] objArr, int i7, int i8, Object[] objArr2, Comparator comparator) {
        if (i8 - i7 <= 2) {
            return;
        }
        int i9 = ((i8 + i7) / 4) * 2;
        d(objArr2, i7, i9, objArr, comparator);
        d(objArr2, i9, i8, objArr, comparator);
        int i10 = i7;
        int i11 = i9;
        while (i7 < i8) {
            if (i10 < i9 - 1) {
                if (i11 < i8 - 1) {
                    Object obj = objArr[i10];
                    Object obj2 = objArr[i11];
                }
                objArr2[i7] = objArr[i10];
                objArr2[i7 + 1] = objArr[i10 + 1];
                i10 += 2;
                i7 += 2;
            }
            objArr2[i7] = objArr[i11];
            objArr2[i7 + 1] = objArr[i11 + 1];
            i11 += 2;
            i7 += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC0230c) {
            return Arrays.equals(this.f3136f, ((AbstractC0230c) obj).f3136f);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f3136f;
            if (i7 >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i7], objArr[i7 + 1]);
            i7 += 2;
        }
    }

    public final int hashCode() {
        int i7 = this.f3137g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f3136f) ^ 1000003;
        this.f3137g = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f3136f.length == 0;
    }

    public final int size() {
        return this.f3136f.length / 2;
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("{");
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f3136f;
            if (i7 >= objArr.length) {
                break;
            }
            Object obj2 = objArr[i7 + 1];
            if (obj2 instanceof String) {
                obj = "\"" + ((String) obj2) + '\"';
            } else {
                obj = obj2.toString();
            }
            sb.append(objArr[i7]);
            sb.append("=");
            sb.append(obj);
            sb.append(", ");
            i7 += 2;
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
    public AbstractC0230c(Object[] objArr, Comparator comparator) {
        this(objArr);
        d.a("You must provide an even number of key/value pair arguments.", objArr.length % 2 == 0);
        if (objArr.length != 0) {
            Object[] objArr2 = new Object[objArr.length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            d(objArr2, 0, objArr.length, objArr, comparator);
            Object obj = null;
            int i7 = 0;
            for (int i8 = 0; i8 < objArr.length; i8 += 2) {
                Object obj2 = objArr[i8];
                Object obj3 = objArr[i8 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator.compare(obj2, obj) == 0) {
                        i7 -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i9 = i7 + 1;
                        objArr[i7] = obj2;
                        i7 += 2;
                        objArr[i9] = obj3;
                        obj = obj2;
                    }
                }
            }
            if (objArr.length != i7) {
                Object[] objArr3 = new Object[i7];
                System.arraycopy(objArr, 0, objArr3, 0, i7);
                objArr = objArr3;
            }
        }
    }
}
