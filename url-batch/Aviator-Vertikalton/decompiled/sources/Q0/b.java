package Q0;

import O0.d;
import X0.f;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f733a;

    public b(Enum[] enumArr) {
        this.f733a = enumArr;
    }

    @Override // O0.d
    public final int a() {
        return this.f733a.length;
    }

    @Override // O0.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        f.e(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f733a;
        f.e(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f733a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + length);
    }

    @Override // O0.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        f.e(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f733a;
        f.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // O0.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        f.e(r2, "element");
        return indexOf(r2);
    }
}
