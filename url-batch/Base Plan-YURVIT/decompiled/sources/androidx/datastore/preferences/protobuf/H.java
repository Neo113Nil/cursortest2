package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f1456a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1457b;

    public H(s0 s0Var, s0 s0Var2, H.k kVar) {
        this.f1456a = new G(s0Var, s0Var2, kVar);
        this.f1457b = kVar;
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
    public static int a(G g2, Object obj, Object obj2) {
        int X2;
        int size;
        int W2;
        s0 s0Var;
        int size2;
        int W3;
        s0 s0Var2 = g2.f1453a;
        int i2 = r.f1573c;
        int i3 = 1;
        int V = C0101m.V(1);
        p0 p0Var = s0.f1582h;
        if (s0Var2 == p0Var) {
            V *= 2;
        }
        switch (s0Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                X2 = 8;
                int i4 = X2 + V;
                s0Var = g2.f1454b;
                int V2 = C0101m.V(2);
                if (s0Var == p0Var) {
                    V2 *= 2;
                }
                switch (s0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i3 = 8;
                        return i3 + V2 + i4;
                    case 1:
                        ((Float) obj2).getClass();
                        i3 = 4;
                        return i3 + V2 + i4;
                    case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i3 = C0101m.X(((Long) obj2).longValue());
                        return i3 + V2 + i4;
                    case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                        i3 = C0101m.X(((Long) obj2).longValue());
                        return i3 + V2 + i4;
                    case H.k.LONG_FIELD_NUMBER /* 4 */:
                        i3 = C0101m.X(((Integer) obj2).intValue());
                        return i3 + V2 + i4;
                    case H.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        return i3 + V2 + i4;
                    case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + V2 + i4;
                    case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i3 + V2 + i4;
                    case H.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof C0095g)) {
                            i3 = C0101m.U((String) obj2);
                            return i3 + V2 + i4;
                        }
                        size2 = ((C0095g) obj2).size();
                        W3 = C0101m.W(size2);
                        i3 = W3 + size2;
                        return i3 + V2 + i4;
                    case 9:
                        i3 = ((AbstractC0110w) ((AbstractC0089a) obj2)).a(null);
                        return i3 + V2 + i4;
                    case 10:
                        size2 = ((AbstractC0110w) ((AbstractC0089a) obj2)).a(null);
                        W3 = C0101m.W(size2);
                        i3 = W3 + size2;
                        return i3 + V2 + i4;
                    case 11:
                        if (obj2 instanceof C0095g) {
                            size2 = ((C0095g) obj2).size();
                            W3 = C0101m.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            W3 = C0101m.W(size2);
                        }
                        i3 = W3 + size2;
                        return i3 + V2 + i4;
                    case 12:
                        i3 = C0101m.W(((Integer) obj2).intValue());
                        return i3 + V2 + i4;
                    case 13:
                        i3 = C0101m.X(((Integer) obj2).intValue());
                        return i3 + V2 + i4;
                    case 14:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + V2 + i4;
                    case 15:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        return i3 + V2 + i4;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i3 = C0101m.W((intValue >> 31) ^ (intValue << 1));
                        return i3 + V2 + i4;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i3 = C0101m.X((longValue >> 63) ^ (longValue << 1));
                        return i3 + V2 + i4;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                X2 = 4;
                int i42 = X2 + V;
                s0Var = g2.f1454b;
                int V22 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                X2 = C0101m.X(((Long) obj).longValue());
                int i422 = X2 + V;
                s0Var = g2.f1454b;
                int V222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                X2 = C0101m.X(((Long) obj).longValue());
                int i4222 = X2 + V;
                s0Var = g2.f1454b;
                int V2222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                X2 = C0101m.X(((Integer) obj).intValue());
                int i42222 = X2 + V;
                s0Var = g2.f1454b;
                int V22222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                X2 = 8;
                int i422222 = X2 + V;
                s0Var = g2.f1454b;
                int V222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                X2 = 4;
                int i4222222 = X2 + V;
                s0Var = g2.f1454b;
                int V2222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                X2 = 1;
                int i42222222 = X2 + V;
                s0Var = g2.f1454b;
                int V22222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case H.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0095g) {
                    size = ((C0095g) obj).size();
                    W2 = C0101m.W(size);
                    X2 = size + W2;
                    int i422222222 = X2 + V;
                    s0Var = g2.f1454b;
                    int V222222222 = C0101m.V(2);
                    if (s0Var == p0Var) {
                    }
                    switch (s0Var.ordinal()) {
                    }
                } else {
                    X2 = C0101m.U((String) obj);
                    int i4222222222 = X2 + V;
                    s0Var = g2.f1454b;
                    int V2222222222 = C0101m.V(2);
                    if (s0Var == p0Var) {
                    }
                    switch (s0Var.ordinal()) {
                    }
                }
            case 9:
                X2 = ((AbstractC0110w) ((AbstractC0089a) obj)).a(null);
                int i42222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V22222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0110w) ((AbstractC0089a) obj)).a(null);
                W2 = C0101m.W(size);
                X2 = size + W2;
                int i422222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0095g) {
                    size = ((C0095g) obj).size();
                    W2 = C0101m.W(size);
                } else {
                    size = ((byte[]) obj).length;
                    W2 = C0101m.W(size);
                }
                X2 = size + W2;
                int i4222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V2222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 12:
                X2 = C0101m.W(((Integer) obj).intValue());
                int i42222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V22222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 13:
                X2 = C0101m.X(((Integer) obj).intValue());
                int i422222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V222222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                X2 = 4;
                int i4222222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V2222222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                X2 = 8;
                int i42222222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V22222222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                X2 = C0101m.W((intValue2 >> 31) ^ (intValue2 << 1));
                int i422222222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V222222222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                X2 = C0101m.X((longValue2 >> 63) ^ (longValue2 << 1));
                int i4222222222222222222 = X2 + V;
                s0Var = g2.f1454b;
                int V2222222222222222222 = C0101m.V(2);
                if (s0Var == p0Var) {
                }
                switch (s0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
