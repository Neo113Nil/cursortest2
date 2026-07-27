package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final F f4366a;

    public G(m0 m0Var, o0 o0Var, O.k kVar) {
        this.f4366a = new F(m0Var, o0Var, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(F f3, Object obj, Object obj2) {
        int d02;
        int size;
        int b02;
        o0 o0Var;
        int size2;
        int b03;
        int i2 = 1;
        int i3 = C0222q.f4480c;
        int Z2 = C0217l.Z(1);
        n0 n0Var = q0.f4484d;
        m0 m0Var = f3.f4363a;
        if (m0Var == n0Var) {
            Z2 *= 2;
        }
        switch (m0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                d02 = 8;
                int i6 = d02 + Z2;
                int Z5 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                    Z5 *= 2;
                }
                switch (o0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i2 = 8;
                        return i2 + Z5 + i6;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + Z5 + i6;
                    case 2:
                        i2 = C0217l.d0(((Long) obj2).longValue());
                        return i2 + Z5 + i6;
                    case 3:
                        i2 = C0217l.d0(((Long) obj2).longValue());
                        return i2 + Z5 + i6;
                    case 4:
                        i2 = C0217l.d0(((Integer) obj2).intValue());
                        return i2 + Z5 + i6;
                    case 5:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + Z5 + i6;
                    case 6:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + Z5 + i6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i2 + Z5 + i6;
                    case 8:
                        if (!(obj2 instanceof C0212g)) {
                            i2 = C0217l.Y((String) obj2);
                            return i2 + Z5 + i6;
                        }
                        size2 = ((C0212g) obj2).size();
                        b03 = C0217l.b0(size2);
                        i2 = b03 + size2;
                        return i2 + Z5 + i6;
                    case 9:
                        i2 = ((AbstractC0226v) ((AbstractC0206a) obj2)).a(null);
                        return i2 + Z5 + i6;
                    case 10:
                        size2 = ((AbstractC0226v) ((AbstractC0206a) obj2)).a(null);
                        b03 = C0217l.b0(size2);
                        i2 = b03 + size2;
                        return i2 + Z5 + i6;
                    case 11:
                        if (obj2 instanceof C0212g) {
                            size2 = ((C0212g) obj2).size();
                            b03 = C0217l.b0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            b03 = C0217l.b0(size2);
                        }
                        i2 = b03 + size2;
                        return i2 + Z5 + i6;
                    case 12:
                        i2 = C0217l.b0(((Integer) obj2).intValue());
                        return i2 + Z5 + i6;
                    case 13:
                        i2 = C0217l.d0(((Integer) obj2).intValue());
                        return i2 + Z5 + i6;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + Z5 + i6;
                    case 15:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + Z5 + i6;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = C0217l.b0((intValue >> 31) ^ (intValue << 1));
                        return i2 + Z5 + i6;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = C0217l.d0((longValue >> 63) ^ (longValue << 1));
                        return i2 + Z5 + i6;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                d02 = 4;
                int i62 = d02 + Z2;
                int Z52 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 2:
                d02 = C0217l.d0(((Long) obj).longValue());
                int i622 = d02 + Z2;
                int Z522 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 3:
                d02 = C0217l.d0(((Long) obj).longValue());
                int i6222 = d02 + Z2;
                int Z5222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 4:
                d02 = C0217l.d0(((Integer) obj).intValue());
                int i62222 = d02 + Z2;
                int Z52222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                d02 = 8;
                int i622222 = d02 + Z2;
                int Z522222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                d02 = 4;
                int i6222222 = d02 + Z2;
                int Z5222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                d02 = 1;
                int i62222222 = d02 + Z2;
                int Z52222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof C0212g) {
                    size = ((C0212g) obj).size();
                    b02 = C0217l.b0(size);
                    d02 = size + b02;
                    int i622222222 = d02 + Z2;
                    int Z522222222 = C0217l.Z(2);
                    o0Var = f3.f4364b;
                    if (o0Var == n0Var) {
                    }
                    switch (o0Var.ordinal()) {
                    }
                } else {
                    d02 = C0217l.Y((String) obj);
                    int i6222222222 = d02 + Z2;
                    int Z5222222222 = C0217l.Z(2);
                    o0Var = f3.f4364b;
                    if (o0Var == n0Var) {
                    }
                    switch (o0Var.ordinal()) {
                    }
                }
            case 9:
                d02 = ((AbstractC0226v) ((AbstractC0206a) obj)).a(null);
                int i62222222222 = d02 + Z2;
                int Z52222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0226v) ((AbstractC0206a) obj)).a(null);
                b02 = C0217l.b0(size);
                d02 = size + b02;
                int i622222222222 = d02 + Z2;
                int Z522222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0212g) {
                    size = ((C0212g) obj).size();
                    b02 = C0217l.b0(size);
                } else {
                    size = ((byte[]) obj).length;
                    b02 = C0217l.b0(size);
                }
                d02 = size + b02;
                int i6222222222222 = d02 + Z2;
                int Z5222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 12:
                d02 = C0217l.b0(((Integer) obj).intValue());
                int i62222222222222 = d02 + Z2;
                int Z52222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 13:
                d02 = C0217l.d0(((Integer) obj).intValue());
                int i622222222222222 = d02 + Z2;
                int Z522222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                d02 = 4;
                int i6222222222222222 = d02 + Z2;
                int Z5222222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                d02 = 8;
                int i62222222222222222 = d02 + Z2;
                int Z52222222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                d02 = C0217l.b0((intValue2 >> 31) ^ (intValue2 << 1));
                int i622222222222222222 = d02 + Z2;
                int Z522222222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                d02 = C0217l.d0((longValue2 >> 63) ^ (longValue2 << 1));
                int i6222222222222222222 = d02 + Z2;
                int Z5222222222222222222 = C0217l.Z(2);
                o0Var = f3.f4364b;
                if (o0Var == n0Var) {
                }
                switch (o0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
