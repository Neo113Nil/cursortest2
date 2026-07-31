package Y1;

import A.k;
import S1.AbstractC0225d;
import f2.j;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a extends AbstractC0225d implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Enum[] f4663d;

    public a(Enum[] enumArr) {
        this.f4663d = enumArr;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f4663d.length;
    }

    @Override // S1.AbstractC0222a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        j.f(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f4663d;
        j.f(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Enum[] enumArr = this.f4663d;
        int length = enumArr.length;
        if (i3 < 0 || i3 >= length) {
            throw new IndexOutOfBoundsException(k.f(i3, length, "index: ", ", size: "));
        }
        return enumArr[i3];
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        j.f(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f4663d;
        j.f(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        j.f(r22, "element");
        return indexOf(r22);
    }
}
