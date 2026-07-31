package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f705a;

    public i0(s1 s1Var, s1 s1Var2, a4.i iVar) {
        this.f705a = new h0(s1Var, s1Var2, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(h0 h0Var, Object obj, Object obj2) {
        int N;
        int size;
        int M;
        s1 s1Var;
        int size2;
        int M2;
        s1 s1Var2 = h0Var.f694a;
        int i = r.f756c;
        int i8 = 1;
        int L = m.L(1);
        p1 p1Var = s1.f767g;
        if (s1Var2 == p1Var) {
            L *= 2;
        }
        switch (s1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                N = 8;
                int i9 = N + L;
                s1Var = h0Var.f695b;
                int L2 = m.L(2);
                if (s1Var == p1Var) {
                    L2 *= 2;
                }
                switch (s1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i8 = 8;
                        return i8 + L2 + i9;
                    case 1:
                        ((Float) obj2).getClass();
                        i8 = 4;
                        return i8 + L2 + i9;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        i8 = m.N(((Long) obj2).longValue());
                        return i8 + L2 + i9;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        i8 = m.N(((Long) obj2).longValue());
                        return i8 + L2 + i9;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        i8 = m.N(((Integer) obj2).intValue());
                        return i8 + L2 + i9;
                    case 5:
                        ((Long) obj2).getClass();
                        i8 = 8;
                        return i8 + L2 + i9;
                    case 6:
                        ((Integer) obj2).getClass();
                        i8 = 4;
                        return i8 + L2 + i9;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i8 + L2 + i9;
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof g)) {
                            i8 = m.K((String) obj2);
                            return i8 + L2 + i9;
                        }
                        size2 = ((g) obj2).size();
                        M2 = m.M(size2);
                        i8 = M2 + size2;
                        return i8 + L2 + i9;
                    case x.v0.f8304b /* 9 */:
                        i8 = ((w) ((a) obj2)).a(null);
                        return i8 + L2 + i9;
                    case x.v0.f8306d /* 10 */:
                        size2 = ((w) ((a) obj2)).a(null);
                        M2 = m.M(size2);
                        i8 = M2 + size2;
                        return i8 + L2 + i9;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            M2 = m.M(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            M2 = m.M(size2);
                        }
                        i8 = M2 + size2;
                        return i8 + L2 + i9;
                    case 12:
                        i8 = m.M(((Integer) obj2).intValue());
                        return i8 + L2 + i9;
                    case 13:
                        i8 = m.N(((Integer) obj2).intValue());
                        return i8 + L2 + i9;
                    case 14:
                        ((Integer) obj2).getClass();
                        i8 = 4;
                        return i8 + L2 + i9;
                    case x.v0.f8308f /* 15 */:
                        ((Long) obj2).getClass();
                        i8 = 8;
                        return i8 + L2 + i9;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i8 = m.M((intValue >> 31) ^ (intValue << 1));
                        return i8 + L2 + i9;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i8 = m.N((longValue >> 63) ^ (longValue << 1));
                        return i8 + L2 + i9;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                N = 4;
                int i92 = N + L;
                s1Var = h0Var.f695b;
                int L22 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                N = m.N(((Long) obj).longValue());
                int i922 = N + L;
                s1Var = h0Var.f695b;
                int L222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                N = m.N(((Long) obj).longValue());
                int i9222 = N + L;
                s1Var = h0Var.f695b;
                int L2222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                N = m.N(((Integer) obj).intValue());
                int i92222 = N + L;
                s1Var = h0Var.f695b;
                int L22222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                N = 8;
                int i922222 = N + L;
                s1Var = h0Var.f695b;
                int L222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                N = 4;
                int i9222222 = N + L;
                s1Var = h0Var.f695b;
                int L2222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                N = 1;
                int i92222222 = N + L;
                s1Var = h0Var.f695b;
                int L22222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof g) {
                    size = ((g) obj).size();
                    M = m.M(size);
                    N = size + M;
                    int i922222222 = N + L;
                    s1Var = h0Var.f695b;
                    int L222222222 = m.L(2);
                    if (s1Var == p1Var) {
                    }
                    switch (s1Var.ordinal()) {
                    }
                } else {
                    N = m.K((String) obj);
                    int i9222222222 = N + L;
                    s1Var = h0Var.f695b;
                    int L2222222222 = m.L(2);
                    if (s1Var == p1Var) {
                    }
                    switch (s1Var.ordinal()) {
                    }
                }
            case x.v0.f8304b /* 9 */:
                N = ((w) ((a) obj)).a(null);
                int i92222222222 = N + L;
                s1Var = h0Var.f695b;
                int L22222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case x.v0.f8306d /* 10 */:
                size = ((w) ((a) obj)).a(null);
                M = m.M(size);
                N = size + M;
                int i922222222222 = N + L;
                s1Var = h0Var.f695b;
                int L222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 11:
                if (obj instanceof g) {
                    size = ((g) obj).size();
                    M = m.M(size);
                } else {
                    size = ((byte[]) obj).length;
                    M = m.M(size);
                }
                N = size + M;
                int i9222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L2222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 12:
                N = m.M(((Integer) obj).intValue());
                int i92222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L22222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 13:
                N = m.N(((Integer) obj).intValue());
                int i922222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L222222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                N = 4;
                int i9222222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L2222222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case x.v0.f8308f /* 15 */:
                ((Long) obj).getClass();
                N = 8;
                int i92222222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L22222222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                N = m.M((intValue2 >> 31) ^ (intValue2 << 1));
                int i922222222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L222222222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                N = m.N((longValue2 >> 63) ^ (longValue2 << 1));
                int i9222222222222222222 = N + L;
                s1Var = h0Var.f695b;
                int L2222222222222222222 = m.L(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
