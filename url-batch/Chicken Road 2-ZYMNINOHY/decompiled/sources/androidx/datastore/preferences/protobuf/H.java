package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f4566a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4567b;

    public H(r0 r0Var, r0 r0Var2, M.k kVar) {
        this.f4566a = new G(r0Var, r0Var2, kVar);
        this.f4567b = kVar;
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
    public static int a(G g4, Object obj, Object obj2) {
        int c02;
        int size;
        int b02;
        r0 r0Var;
        int size2;
        int b03;
        r0 r0Var2 = g4.f4563a;
        int i4 = r.f4683c;
        int i5 = 1;
        int a02 = C0180m.a0(1);
        o0 o0Var = r0.f4687d;
        if (r0Var2 == o0Var) {
            a02 *= 2;
        }
        switch (r0Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                c02 = 8;
                int i6 = c02 + a02;
                r0Var = g4.f4564b;
                int a03 = C0180m.a0(2);
                if (r0Var == o0Var) {
                    a03 *= 2;
                }
                switch (r0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i5 = 8;
                        return i5 + a03 + i6;
                    case 1:
                        ((Float) obj2).getClass();
                        i5 = 4;
                        return i5 + a03 + i6;
                    case 2:
                        i5 = C0180m.c0(((Long) obj2).longValue());
                        return i5 + a03 + i6;
                    case 3:
                        i5 = C0180m.c0(((Long) obj2).longValue());
                        return i5 + a03 + i6;
                    case 4:
                        i5 = C0180m.c0(((Integer) obj2).intValue());
                        return i5 + a03 + i6;
                    case 5:
                        ((Long) obj2).getClass();
                        i5 = 8;
                        return i5 + a03 + i6;
                    case 6:
                        ((Integer) obj2).getClass();
                        i5 = 4;
                        return i5 + a03 + i6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i5 + a03 + i6;
                    case 8:
                        if (!(obj2 instanceof C0174g)) {
                            i5 = C0180m.Z((String) obj2);
                            return i5 + a03 + i6;
                        }
                        size2 = ((C0174g) obj2).size();
                        b03 = C0180m.b0(size2);
                        i5 = b03 + size2;
                        return i5 + a03 + i6;
                    case 9:
                        i5 = ((AbstractC0189w) ((AbstractC0168a) obj2)).a(null);
                        return i5 + a03 + i6;
                    case 10:
                        size2 = ((AbstractC0189w) ((AbstractC0168a) obj2)).a(null);
                        b03 = C0180m.b0(size2);
                        i5 = b03 + size2;
                        return i5 + a03 + i6;
                    case 11:
                        if (obj2 instanceof C0174g) {
                            size2 = ((C0174g) obj2).size();
                            b03 = C0180m.b0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            b03 = C0180m.b0(size2);
                        }
                        i5 = b03 + size2;
                        return i5 + a03 + i6;
                    case 12:
                        i5 = C0180m.b0(((Integer) obj2).intValue());
                        return i5 + a03 + i6;
                    case 13:
                        i5 = C0180m.c0(((Integer) obj2).intValue());
                        return i5 + a03 + i6;
                    case 14:
                        ((Integer) obj2).getClass();
                        i5 = 4;
                        return i5 + a03 + i6;
                    case 15:
                        ((Long) obj2).getClass();
                        i5 = 8;
                        return i5 + a03 + i6;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i5 = C0180m.b0((intValue >> 31) ^ (intValue << 1));
                        return i5 + a03 + i6;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i5 = C0180m.c0((longValue >> 63) ^ (longValue << 1));
                        return i5 + a03 + i6;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                c02 = 4;
                int i62 = c02 + a02;
                r0Var = g4.f4564b;
                int a032 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 2:
                c02 = C0180m.c0(((Long) obj).longValue());
                int i622 = c02 + a02;
                r0Var = g4.f4564b;
                int a0322 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 3:
                c02 = C0180m.c0(((Long) obj).longValue());
                int i6222 = c02 + a02;
                r0Var = g4.f4564b;
                int a03222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 4:
                c02 = C0180m.c0(((Integer) obj).intValue());
                int i62222 = c02 + a02;
                r0Var = g4.f4564b;
                int a032222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                c02 = 8;
                int i622222 = c02 + a02;
                r0Var = g4.f4564b;
                int a0322222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                c02 = 4;
                int i6222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a03222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                c02 = 1;
                int i62222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a032222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof C0174g) {
                    size = ((C0174g) obj).size();
                    b02 = C0180m.b0(size);
                    c02 = size + b02;
                    int i622222222 = c02 + a02;
                    r0Var = g4.f4564b;
                    int a0322222222 = C0180m.a0(2);
                    if (r0Var == o0Var) {
                    }
                    switch (r0Var.ordinal()) {
                    }
                } else {
                    c02 = C0180m.Z((String) obj);
                    int i6222222222 = c02 + a02;
                    r0Var = g4.f4564b;
                    int a03222222222 = C0180m.a0(2);
                    if (r0Var == o0Var) {
                    }
                    switch (r0Var.ordinal()) {
                    }
                }
            case 9:
                c02 = ((AbstractC0189w) ((AbstractC0168a) obj)).a(null);
                int i62222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a032222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0189w) ((AbstractC0168a) obj)).a(null);
                b02 = C0180m.b0(size);
                c02 = size + b02;
                int i622222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a0322222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0174g) {
                    size = ((C0174g) obj).size();
                    b02 = C0180m.b0(size);
                } else {
                    size = ((byte[]) obj).length;
                    b02 = C0180m.b0(size);
                }
                c02 = size + b02;
                int i6222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a03222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 12:
                c02 = C0180m.b0(((Integer) obj).intValue());
                int i62222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a032222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 13:
                c02 = C0180m.c0(((Integer) obj).intValue());
                int i622222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a0322222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                c02 = 4;
                int i6222222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a03222222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                c02 = 8;
                int i62222222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a032222222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                c02 = C0180m.b0((intValue2 >> 31) ^ (intValue2 << 1));
                int i622222222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a0322222222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                c02 = C0180m.c0((longValue2 >> 63) ^ (longValue2 << 1));
                int i6222222222222222222 = c02 + a02;
                r0Var = g4.f4564b;
                int a03222222222222222222 = C0180m.a0(2);
                if (r0Var == o0Var) {
                }
                switch (r0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
