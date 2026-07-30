package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final F f3428a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3429b;

    public G(q0 q0Var, q0 q0Var2, S.j jVar) {
        this.f3428a = new F(q0Var, q0Var2, jVar);
        this.f3429b = jVar;
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
    public static int a(F f7, Object obj, Object obj2) {
        int c02;
        int size;
        int b02;
        q0 q0Var;
        int size2;
        int b03;
        q0 q0Var2 = f7.f3425a;
        int i2 = C0201q.f3542c;
        int i5 = 1;
        int a02 = C0196l.a0(1);
        n0 n0Var = q0.f3546l;
        if (q0Var2 == n0Var) {
            a02 *= 2;
        }
        switch (q0Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                c02 = 8;
                int i7 = c02 + a02;
                q0Var = f7.f3426b;
                int a03 = C0196l.a0(2);
                if (q0Var == n0Var) {
                    a03 *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i5 = 8;
                        return i5 + a03 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        i5 = 4;
                        return i5 + a03 + i7;
                    case 2:
                        i5 = C0196l.c0(((Long) obj2).longValue());
                        return i5 + a03 + i7;
                    case 3:
                        i5 = C0196l.c0(((Long) obj2).longValue());
                        return i5 + a03 + i7;
                    case 4:
                        i5 = C0196l.c0(((Integer) obj2).intValue());
                        return i5 + a03 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        i5 = 8;
                        return i5 + a03 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        i5 = 4;
                        return i5 + a03 + i7;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i5 + a03 + i7;
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof C0191g)) {
                            i5 = C0196l.Z((String) obj2);
                            return i5 + a03 + i7;
                        }
                        size2 = ((C0191g) obj2).size();
                        b03 = C0196l.b0(size2);
                        i5 = b03 + size2;
                        return i5 + a03 + i7;
                    case 9:
                        i5 = ((AbstractC0205v) ((AbstractC0185a) obj2)).a(null);
                        return i5 + a03 + i7;
                    case 10:
                        size2 = ((AbstractC0205v) ((AbstractC0185a) obj2)).a(null);
                        b03 = C0196l.b0(size2);
                        i5 = b03 + size2;
                        return i5 + a03 + i7;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof C0191g) {
                            size2 = ((C0191g) obj2).size();
                            b03 = C0196l.b0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            b03 = C0196l.b0(size2);
                        }
                        i5 = b03 + size2;
                        return i5 + a03 + i7;
                    case 12:
                        i5 = C0196l.b0(((Integer) obj2).intValue());
                        return i5 + a03 + i7;
                    case 13:
                        i5 = C0196l.c0(((Integer) obj2).intValue());
                        return i5 + a03 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        i5 = 4;
                        return i5 + a03 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        i5 = 8;
                        return i5 + a03 + i7;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i5 = C0196l.b0((intValue >> 31) ^ (intValue << 1));
                        return i5 + a03 + i7;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i5 = C0196l.c0((longValue >> 63) ^ (longValue << 1));
                        return i5 + a03 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                c02 = 4;
                int i72 = c02 + a02;
                q0Var = f7.f3426b;
                int a032 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 2:
                c02 = C0196l.c0(((Long) obj).longValue());
                int i722 = c02 + a02;
                q0Var = f7.f3426b;
                int a0322 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 3:
                c02 = C0196l.c0(((Long) obj).longValue());
                int i7222 = c02 + a02;
                q0Var = f7.f3426b;
                int a03222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 4:
                c02 = C0196l.c0(((Integer) obj).intValue());
                int i72222 = c02 + a02;
                q0Var = f7.f3426b;
                int a032222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                c02 = 8;
                int i722222 = c02 + a02;
                q0Var = f7.f3426b;
                int a0322222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                c02 = 4;
                int i7222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a03222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                c02 = 1;
                int i72222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a032222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0191g) {
                    size = ((C0191g) obj).size();
                    b02 = C0196l.b0(size);
                    c02 = size + b02;
                    int i722222222 = c02 + a02;
                    q0Var = f7.f3426b;
                    int a0322222222 = C0196l.a0(2);
                    if (q0Var == n0Var) {
                    }
                    switch (q0Var.ordinal()) {
                    }
                } else {
                    c02 = C0196l.Z((String) obj);
                    int i7222222222 = c02 + a02;
                    q0Var = f7.f3426b;
                    int a03222222222 = C0196l.a0(2);
                    if (q0Var == n0Var) {
                    }
                    switch (q0Var.ordinal()) {
                    }
                }
            case 9:
                c02 = ((AbstractC0205v) ((AbstractC0185a) obj)).a(null);
                int i72222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a032222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0205v) ((AbstractC0185a) obj)).a(null);
                b02 = C0196l.b0(size);
                c02 = size + b02;
                int i722222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a0322222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case RequestError.STOP_TRACKING /* 11 */:
                if (obj instanceof C0191g) {
                    size = ((C0191g) obj).size();
                    b02 = C0196l.b0(size);
                } else {
                    size = ((byte[]) obj).length;
                    b02 = C0196l.b0(size);
                }
                c02 = size + b02;
                int i7222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a03222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 12:
                c02 = C0196l.b0(((Integer) obj).intValue());
                int i72222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a032222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 13:
                c02 = C0196l.c0(((Integer) obj).intValue());
                int i722222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a0322222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                c02 = 4;
                int i7222222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a03222222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                c02 = 8;
                int i72222222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a032222222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                c02 = C0196l.b0((intValue2 >> 31) ^ (intValue2 << 1));
                int i722222222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a0322222222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                c02 = C0196l.c0((longValue2 >> 63) ^ (longValue2 << 1));
                int i7222222222222222222 = c02 + a02;
                q0Var = f7.f3426b;
                int a03222222222222222222 = C0196l.a0(2);
                if (q0Var == n0Var) {
                }
                switch (q0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
