package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ei extends k implements Serializable {
    public final Enum[] f;

    public ei(Enum[] enumArr) {
        this.f = enumArr;
    }

    @Override // defpackage.k
    public final int a() {
        return this.f.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // defpackage.k, java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f;
            if (ordinal < enumArr.length) {
                r2 = enumArr[ordinal];
                return r2 != r3;
            }
        }
        r2 = null;
        if (r2 != r3) {
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(o30.d(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.k, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.k, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }
}
