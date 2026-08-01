package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f558a;

    public h0(r1 r1Var, r1 r1Var2, a4.j jVar) {
        this.f558a = new g0(r1Var, r1Var2, jVar);
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
    public static int a(g0 g0Var, Object obj, Object obj2) {
        int j;
        int size;
        int i3;
        r1 r1Var;
        int size2;
        int i10;
        r1 r1Var2 = g0Var.f546a;
        int i11 = q.f606c;
        int i12 = 1;
        int h10 = l.h(1);
        o1 o1Var = r1.f617r;
        if (r1Var2 == o1Var) {
            h10 *= 2;
        }
        switch (r1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                j = 8;
                int i13 = j + h10;
                r1Var = g0Var.f547b;
                int h11 = l.h(2);
                if (r1Var == o1Var) {
                    h11 *= 2;
                }
                switch (r1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i12 = 8;
                        return i12 + h11 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        i12 = 4;
                        return i12 + h11 + i13;
                    case 2:
                        i12 = l.j(((Long) obj2).longValue());
                        return i12 + h11 + i13;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        i12 = l.j(((Long) obj2).longValue());
                        return i12 + h11 + i13;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        i12 = l.j(((Integer) obj2).intValue());
                        return i12 + h11 + i13;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        i12 = 8;
                        return i12 + h11 + i13;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i12 = 4;
                        return i12 + h11 + i13;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i12 + h11 + i13;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof f)) {
                            i12 = l.g((String) obj2);
                            return i12 + h11 + i13;
                        }
                        size2 = ((f) obj2).size();
                        i10 = l.i(size2);
                        i12 = i10 + size2;
                        return i12 + h11 + i13;
                    case 9:
                        i12 = ((v) ((a) obj2)).a(null);
                        return i12 + h11 + i13;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        i10 = l.i(size2);
                        i12 = i10 + size2;
                        return i12 + h11 + i13;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof f) {
                            size2 = ((f) obj2).size();
                            i10 = l.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i10 = l.i(size2);
                        }
                        i12 = i10 + size2;
                        return i12 + h11 + i13;
                    case 12:
                        i12 = l.i(((Integer) obj2).intValue());
                        return i12 + h11 + i13;
                    case 13:
                        i12 = l.j(((Integer) obj2).intValue());
                        return i12 + h11 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        i12 = 4;
                        return i12 + h11 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        i12 = 8;
                        return i12 + h11 + i13;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i12 = l.i((intValue >> 31) ^ (intValue << 1));
                        return i12 + h11 + i13;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i12 = l.j((longValue >> 63) ^ (longValue << 1));
                        return i12 + h11 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                j = 4;
                int i132 = j + h10;
                r1Var = g0Var.f547b;
                int h112 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 2:
                j = l.j(((Long) obj).longValue());
                int i1322 = j + h10;
                r1Var = g0Var.f547b;
                int h1122 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                j = l.j(((Long) obj).longValue());
                int i13222 = j + h10;
                r1Var = g0Var.f547b;
                int h11222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                j = l.j(((Integer) obj).intValue());
                int i132222 = j + h10;
                r1Var = g0Var.f547b;
                int h112222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                j = 8;
                int i1322222 = j + h10;
                r1Var = g0Var.f547b;
                int h1122222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                j = 4;
                int i13222222 = j + h10;
                r1Var = g0Var.f547b;
                int h11222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                j = 1;
                int i132222222 = j + h10;
                r1Var = g0Var.f547b;
                int h112222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof f) {
                    size = ((f) obj).size();
                    i3 = l.i(size);
                    j = size + i3;
                    int i1322222222 = j + h10;
                    r1Var = g0Var.f547b;
                    int h1122222222 = l.h(2);
                    if (r1Var == o1Var) {
                    }
                    switch (r1Var.ordinal()) {
                    }
                } else {
                    j = l.g((String) obj);
                    int i13222222222 = j + h10;
                    r1Var = g0Var.f547b;
                    int h11222222222 = l.h(2);
                    if (r1Var == o1Var) {
                    }
                    switch (r1Var.ordinal()) {
                    }
                }
            case 9:
                j = ((v) ((a) obj)).a(null);
                int i132222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h112222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 10:
                size = ((v) ((a) obj)).a(null);
                i3 = l.i(size);
                j = size + i3;
                int i1322222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h1122222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case RequestError.STOP_TRACKING /* 11 */:
                if (obj instanceof f) {
                    size = ((f) obj).size();
                    i3 = l.i(size);
                } else {
                    size = ((byte[]) obj).length;
                    i3 = l.i(size);
                }
                j = size + i3;
                int i13222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h11222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 12:
                j = l.i(((Integer) obj).intValue());
                int i132222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h112222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 13:
                j = l.j(((Integer) obj).intValue());
                int i1322222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h1122222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                j = 4;
                int i13222222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h11222222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                j = 8;
                int i132222222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h112222222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                j = l.i((intValue2 >> 31) ^ (intValue2 << 1));
                int i1322222222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h1122222222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                j = l.j((longValue2 >> 63) ^ (longValue2 << 1));
                int i13222222222222222222 = j + h10;
                r1Var = g0Var.f547b;
                int h11222222222222222222 = l.h(2);
                if (r1Var == o1Var) {
                }
                switch (r1Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
