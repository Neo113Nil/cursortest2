package k6;

import e6.d;
import java.io.Serializable;
import r6.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends d implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Enum[] f5376f;

    public a(Enum[] enumArr) {
        this.f5376f = enumArr;
    }

    @Override // e6.a
    public final int a() {
        return this.f5376f.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // e6.a, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r02;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f5376f;
            if (ordinal < enumArr.length) {
                r02 = enumArr[ordinal];
                return r02 != r42;
            }
        }
        r02 = null;
        if (r02 != r42) {
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f5376f;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(i.b(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // e6.d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r12;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f5376f;
            if (ordinal < enumArr.length) {
                r12 = enumArr[ordinal];
                if (r12 != r42) {
                    return ordinal;
                }
                return -1;
            }
        }
        r12 = null;
        if (r12 != r42) {
        }
    }

    @Override // e6.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
