package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Object obj, int i7, Object obj2) {
        int u8;
        int size;
        int t2;
        z1 z1Var;
        int size2;
        int t8;
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i8 = 0;
        if (k0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : k0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            j0Var.getClass();
            int s5 = l.s(i7);
            i0 i0Var = j0Var.f851a;
            z1 z1Var2 = i0Var.f840a;
            int i9 = q.f889c;
            int i10 = 1;
            int s8 = l.s(1);
            w1 w1Var = z1.f934i;
            if (z1Var2 == w1Var) {
                s8 *= 2;
            }
            switch (z1Var2.ordinal()) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((Double) key).getClass();
                    u8 = 8;
                    int i11 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s9 = l.s(2);
                    if (z1Var == w1Var) {
                        s9 *= 2;
                    }
                    switch (z1Var.ordinal()) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            ((Double) value).getClass();
                            i10 = 8;
                            int i12 = i10 + s9 + i11;
                            i8 = a0.m.c(i12, i12, s5, i8);
                        case 1:
                            ((Float) value).getClass();
                            i10 = 4;
                            int i122 = i10 + s9 + i11;
                            i8 = a0.m.c(i122, i122, s5, i8);
                        case 2:
                            i10 = l.u(((Long) value).longValue());
                            int i1222 = i10 + s9 + i11;
                            i8 = a0.m.c(i1222, i1222, s5, i8);
                        case 3:
                            i10 = l.u(((Long) value).longValue());
                            int i12222 = i10 + s9 + i11;
                            i8 = a0.m.c(i12222, i12222, s5, i8);
                        case 4:
                            i10 = l.q(((Integer) value).intValue());
                            int i122222 = i10 + s9 + i11;
                            i8 = a0.m.c(i122222, i122222, s5, i8);
                        case 5:
                            ((Long) value).getClass();
                            i10 = 8;
                            int i1222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i1222222, i1222222, s5, i8);
                        case 6:
                            ((Integer) value).getClass();
                            i10 = 4;
                            int i12222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i12222222, i12222222, s5, i8);
                        case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            ((Boolean) value).getClass();
                            int i122222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i122222222, i122222222, s5, i8);
                        case 8:
                            if (value instanceof g) {
                                size2 = ((g) value).size();
                                t8 = l.t(size2);
                                i10 = t8 + size2;
                                int i1222222222 = i10 + s9 + i11;
                                i8 = a0.m.c(i1222222222, i1222222222, s5, i8);
                            } else {
                                i10 = l.r((String) value);
                                int i12222222222 = i10 + s9 + i11;
                                i8 = a0.m.c(i12222222222, i12222222222, s5, i8);
                            }
                        case q.c.f7259c /* 9 */:
                            i10 = ((v) ((a) value)).a(null);
                            int i122222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i122222222222, i122222222222, s5, i8);
                        case q.c.f7261e /* 10 */:
                            size2 = ((v) ((a) value)).a(null);
                            t8 = l.t(size2);
                            i10 = t8 + size2;
                            int i1222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i1222222222222, i1222222222222, s5, i8);
                        case 11:
                            if (value instanceof g) {
                                size2 = ((g) value).size();
                                t8 = l.t(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                t8 = l.t(size2);
                            }
                            i10 = t8 + size2;
                            int i12222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i12222222222222, i12222222222222, s5, i8);
                        case 12:
                            i10 = l.t(((Integer) value).intValue());
                            int i122222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i122222222222222, i122222222222222, s5, i8);
                        case 13:
                            i10 = l.q(((Integer) value).intValue());
                            int i1222222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i1222222222222222, i1222222222222222, s5, i8);
                        case 14:
                            ((Integer) value).getClass();
                            i10 = 4;
                            int i12222222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i12222222222222222, i12222222222222222, s5, i8);
                        case q.c.f7263g /* 15 */:
                            ((Long) value).getClass();
                            i10 = 8;
                            int i122222222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i122222222222222222, i122222222222222222, s5, i8);
                        case 16:
                            int intValue = ((Integer) value).intValue();
                            i10 = l.t((intValue >> 31) ^ (intValue << 1));
                            int i1222222222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i1222222222222222222, i1222222222222222222, s5, i8);
                        case 17:
                            long longValue = ((Long) value).longValue();
                            i10 = l.u((longValue >> 63) ^ (longValue << 1));
                            int i12222222222222222222 = i10 + s9 + i11;
                            i8 = a0.m.c(i12222222222222222222, i12222222222222222222, s5, i8);
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                case 1:
                    ((Float) key).getClass();
                    u8 = 4;
                    int i112 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s92 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 2:
                    u8 = l.u(((Long) key).longValue());
                    int i1122 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s922 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 3:
                    u8 = l.u(((Long) key).longValue());
                    int i11222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s9222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 4:
                    u8 = l.q(((Integer) key).intValue());
                    int i112222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s92222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 5:
                    ((Long) key).getClass();
                    u8 = 8;
                    int i1122222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s922222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 6:
                    ((Integer) key).getClass();
                    u8 = 4;
                    int i11222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s9222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((Boolean) key).getClass();
                    u8 = 1;
                    int i112222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s92222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 8:
                    if (key instanceof g) {
                        size = ((g) key).size();
                        t2 = l.t(size);
                        u8 = size + t2;
                        int i1122222222 = u8 + s8;
                        z1Var = i0Var.f841b;
                        int s922222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    } else {
                        u8 = l.r((String) key);
                        int i11222222222 = u8 + s8;
                        z1Var = i0Var.f841b;
                        int s9222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    }
                case q.c.f7259c /* 9 */:
                    u8 = ((v) ((a) key)).a(null);
                    int i112222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s92222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case q.c.f7261e /* 10 */:
                    size = ((v) ((a) key)).a(null);
                    t2 = l.t(size);
                    u8 = size + t2;
                    int i1122222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s922222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 11:
                    if (key instanceof g) {
                        size = ((g) key).size();
                        t2 = l.t(size);
                    } else {
                        size = ((byte[]) key).length;
                        t2 = l.t(size);
                    }
                    u8 = size + t2;
                    int i11222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s9222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 12:
                    u8 = l.t(((Integer) key).intValue());
                    int i112222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s92222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 13:
                    u8 = l.q(((Integer) key).intValue());
                    int i1122222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s922222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 14:
                    ((Integer) key).getClass();
                    u8 = 4;
                    int i11222222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s9222222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case q.c.f7263g /* 15 */:
                    ((Long) key).getClass();
                    u8 = 8;
                    int i112222222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s92222222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 16:
                    int intValue2 = ((Integer) key).intValue();
                    u8 = l.t((intValue2 >> 31) ^ (intValue2 << 1));
                    int i1122222222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s922222222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 17:
                    long longValue2 = ((Long) key).longValue();
                    u8 = l.u((longValue2 << 1) ^ (longValue2 >> 63));
                    int i11222222222222222222 = u8 + s8;
                    z1Var = i0Var.f841b;
                    int s9222222222222222222 = l.s(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i8;
    }

    public static k0 b(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f853f) {
                k0Var = k0Var.b();
            }
            k0Var.a();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }
}
