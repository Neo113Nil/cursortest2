package S1;

import H2.AbstractC0080b;
import M1.AbstractC0143d;
import Z1.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends AbstractC0143d implements a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Enum[] f3276d;

    public b(Enum[] enumArr) {
        i.f(enumArr, "entries");
        this.f3276d = enumArr;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f3276d.length;
    }

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        i.f(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f3276d;
        i.f(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Enum[] enumArr = this.f3276d;
        int length = enumArr.length;
        if (i3 < 0 || i3 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, length, "index: ", ", size: "));
        }
        return enumArr[i3];
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        i.f(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f3276d;
        i.f(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        i.f(r22, "element");
        return indexOf(r22);
    }
}
