package od;

import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.c;
import kotlin.collections.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends f implements a, RandomAccess, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Enum[] f7563e;

    public b(Enum[] enumArr) {
        enumArr.getClass();
        this.f7563e = enumArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f7563e.length;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.f7563e;
        enumArr.getClass();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        c cVar = f.f5563d;
        Enum[] enumArr = this.f7563e;
        int length = enumArr.length;
        cVar.getClass();
        c.a(i3, length);
        return enumArr[i3];
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.f7563e;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r52) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.f7563e;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r52) {
            return ordinal;
        }
        return -1;
    }
}
