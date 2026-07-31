package j6;

import a0.q;
import d6.e;
import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends e implements a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Enum[] f4021d;

    public b(Enum[] enumArr) {
        this.f4021d = enumArr;
    }

    @Override // d6.a
    public final int a() {
        return this.f4021d.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // d6.a, java.util.Collection
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
            Enum[] enumArr = this.f4021d;
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
    public final Object get(int i) {
        Enum[] enumArr = this.f4021d;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", length));
        }
        return enumArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // d6.e, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        int ordinal = r52.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f4021d;
            if (ordinal < enumArr.length) {
                r22 = enumArr[ordinal];
                if (r22 != r52) {
                    return ordinal;
                }
                return -1;
            }
        }
        r22 = null;
        if (r22 != r52) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // d6.e, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        int ordinal = r52.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f4021d;
            if (ordinal < enumArr.length) {
                r22 = enumArr[ordinal];
                if (r22 != r52) {
                    return ordinal;
                }
                return -1;
            }
        }
        r22 = null;
        if (r22 != r52) {
        }
    }
}
