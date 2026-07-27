package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C0793l9;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0325d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5167a;

    public /* synthetic */ AbstractC0325d1(int i2) {
        this.f5167a = i2;
    }

    public static /* bridge */ /* synthetic */ boolean C(byte b6) {
        return b6 >= 0;
    }

    public static int E(D1 d12, int i2, byte[] bArr, int i3, int i6, InterfaceC0346k1 interfaceC0346k1, V0 v02) {
        AbstractC0334g1 f3 = d12.f();
        int T2 = T(f3, d12, bArr, i3, i6, v02);
        d12.a(f3);
        v02.f5113c = f3;
        interfaceC0346k1.add(f3);
        while (T2 < i6) {
            int O5 = O(bArr, T2, v02);
            if (i2 != v02.f5111a) {
                break;
            }
            AbstractC0334g1 f6 = d12.f();
            int T5 = T(f6, d12, bArr, O5, i6, v02);
            d12.a(f6);
            v02.f5113c = f6;
            interfaceC0346k1.add(f6);
            T2 = T5;
        }
        return T2;
    }

    public static void F(int i2, int i3, int i6) {
        if (i2 < 0 || i3 < i2 || i3 > i6) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i6) ? K("start index", i2, i6) : (i3 < 0 || i3 > i6) ? K("end index", i3, i6) : g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static boolean G(byte b6) {
        return b6 > -65;
    }

    public static int J(byte[] bArr, int i2, InterfaceC0346k1 interfaceC0346k1, V0 v02) {
        C0337h1 c0337h1 = (C0337h1) interfaceC0346k1;
        int O5 = O(bArr, i2, v02);
        int i3 = v02.f5111a + O5;
        while (O5 < i3) {
            O5 = O(bArr, O5, v02);
            c0337h1.f(v02.f5111a);
        }
        if (O5 == i3) {
            return O5;
        }
        throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static String K(String str, int i2, int i3) {
        if (i2 < 0) {
            return g("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(AbstractC0279e.d(i3, "negative size: "));
    }

    public static int M(int i2, byte[] bArr, int i3, int i6, H1 h12, V0 v02) {
        if ((i2 >>> 3) == 0) {
            throw new C0355n1("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int R5 = R(bArr, i3, v02);
            h12.c(i2, Long.valueOf(v02.f5112b));
            return R5;
        }
        if (i7 == 1) {
            h12.c(i2, Long.valueOf(U(i3, bArr)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int O5 = O(bArr, i3, v02);
            int i8 = v02.f5111a;
            if (i8 < 0) {
                throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - O5) {
                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                h12.c(i2, Y0.f5142c);
            } else {
                h12.c(i2, Y0.f(bArr, O5, i8));
            }
            return O5 + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new C0355n1("Protocol message contained an invalid tag (zero).");
            }
            h12.c(i2, Integer.valueOf(q(i3, bArr)));
            return i3 + 4;
        }
        int i9 = (i2 & (-8)) | 4;
        H1 b6 = H1.b();
        int i10 = v02.f5114d + 1;
        v02.f5114d = i10;
        if (i10 >= 100) {
            throw new C0355n1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = 0;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int O6 = O(bArr, i3, v02);
            i11 = v02.f5111a;
            if (i11 == i9) {
                i3 = O6;
                break;
            }
            i3 = M(i11, bArr, O6, i6, b6, v02);
        }
        v02.f5114d--;
        if (i3 > i6 || i11 != i9) {
            throw new C0355n1("Failed to parse the message.");
        }
        h12.c(i2, b6);
        return i3;
    }

    public static int O(byte[] bArr, int i2, V0 v02) {
        int i3 = i2 + 1;
        byte b6 = bArr[i2];
        if (b6 < 0) {
            return P(b6, bArr, i3, v02);
        }
        v02.f5111a = b6;
        return i3;
    }

    public static int P(int i2, byte[] bArr, int i3, V0 v02) {
        byte b6 = bArr[i3];
        int i6 = i3 + 1;
        int i7 = i2 & 127;
        if (b6 >= 0) {
            v02.f5111a = i7 | (b6 << 7);
            return i6;
        }
        int i8 = i7 | ((b6 & Byte.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b7 = bArr[i6];
        if (b7 >= 0) {
            v02.f5111a = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & Byte.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            v02.f5111a = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            v02.f5111a = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                v02.f5111a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int Q(int i2, byte[] bArr, int i3, int i6, InterfaceC0346k1 interfaceC0346k1, V0 v02) {
        C0337h1 c0337h1 = (C0337h1) interfaceC0346k1;
        int O5 = O(bArr, i3, v02);
        c0337h1.f(v02.f5111a);
        while (O5 < i6) {
            int O6 = O(bArr, O5, v02);
            if (i2 != v02.f5111a) {
                break;
            }
            O5 = O(bArr, O6, v02);
            c0337h1.f(v02.f5111a);
        }
        return O5;
    }

    public static int R(byte[] bArr, int i2, V0 v02) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            v02.f5112b = j2;
            return i3;
        }
        int i6 = i2 + 2;
        byte b6 = bArr[i3];
        long j6 = (j2 & 127) | ((b6 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b6 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j6 |= (r10 & Byte.MAX_VALUE) << i7;
            b6 = bArr[i6];
            i6 = i8;
        }
        v02.f5112b = j6;
        return i6;
    }

    public static int S(Object obj, D1 d12, byte[] bArr, int i2, int i3, int i6, V0 v02) {
        C0381w1 c0381w1 = (C0381w1) d12;
        int i7 = v02.f5114d + 1;
        v02.f5114d = i7;
        if (i7 >= 100) {
            throw new C0355n1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t5 = c0381w1.t(obj, bArr, i2, i3, i6, v02);
        v02.f5114d--;
        v02.f5113c = obj;
        return t5;
    }

    public static int T(Object obj, D1 d12, byte[] bArr, int i2, int i3, V0 v02) {
        int i6 = i2 + 1;
        int i7 = bArr[i2];
        if (i7 < 0) {
            i6 = P(i7, bArr, i6, v02);
            i7 = v02.f5111a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i3 - i8) {
            throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = v02.f5114d + 1;
        v02.f5114d = i9;
        if (i9 >= 100) {
            throw new C0355n1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = i7 + i8;
        d12.b(obj, bArr, i8, i10, v02);
        v02.f5114d--;
        v02.f5113c = obj;
        return i10;
    }

    public static long U(int i2, byte[] bArr) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }

    public static int c(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int d(byte[] bArr, int i2, V0 v02) {
        int O5 = O(bArr, i2, v02);
        int i3 = v02.f5111a;
        if (i3 < 0) {
            throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - O5) {
            throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            v02.f5113c = Y0.f5142c;
            return O5;
        }
        v02.f5113c = Y0.f(bArr, O5, i3);
        return O5 + i3;
    }

    public static String f(Y0 y02) {
        StringBuilder sb = new StringBuilder(y02.d());
        for (int i2 = 0; i2 < y02.d(); i2++) {
            byte b6 = y02.b(i2);
            if (b6 == 34) {
                sb.append("\\\"");
            } else if (b6 == 39) {
                sb.append("\\'");
            } else if (b6 != 92) {
                switch (b6) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b6 < 32 || b6 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b6 >>> 6) & 3) + 48));
                            sb.append((char) (((b6 >>> 3) & 7) + 48));
                            sb.append((char) ((b6 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b6);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String g(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e3) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e3);
                    str2 = "<" + str3 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i3] = str2;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(objArr[i2]);
            i6 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i7 = i2 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void h(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i2) {
        if (!G(b7)) {
            if ((((b7 + 112) + (b6 << 28)) >> 30) == 0 && !G(b8) && !G(b9)) {
                int i3 = ((b6 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw new C0355n1("Protocol message had invalid UTF-8.");
    }

    public static void i(int i2, int i3) {
        String g6;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                g6 = g("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC0279e.d(i3, "negative size: "));
                }
                g6 = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(g6);
        }
    }

    public static void j(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static boolean l(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = M.f5078a;
            }
        } else {
            if (!(collection instanceof InterfaceC0318b0)) {
                return false;
            }
            obj = ((I) ((InterfaceC0318b0) collection)).f5061c;
        }
        return comparator.equals(obj);
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC0354n0 abstractC0354n0, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0354n0, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0354n0) != obj && atomicReferenceFieldUpdater.get(abstractC0354n0) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, r2 r2Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(r2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(r2Var) != obj && atomicReferenceFieldUpdater.get(r2Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int o(int i2) {
        if (i2 == 90) {
            return 91;
        }
        if (i2 == 91) {
            return 92;
        }
        if (i2 == 93) {
            return 94;
        }
        if (i2 == 94) {
            return 95;
        }
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case C0793l9.f8681C /* 19 */:
                return 20;
            case C0793l9.f8682D /* 20 */:
                return 21;
            case C0793l9.f8683E /* 21 */:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case C0793l9.f8684F /* 25 */:
                return 26;
            case 26:
                return 27;
            case C0793l9.f8686H /* 27 */:
                return 28;
            case 28:
                return 29;
            case C0793l9.f8687I /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case C0793l9.f8688J /* 35 */:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case C0793l9.f8689K /* 38 */:
                return 39;
            case 39:
                return 40;
            case C0793l9.f8690L /* 40 */:
                return 41;
            case 41:
                return 42;
            case C0793l9.f8691M /* 42 */:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i2) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND /* 100 */:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return BuildConfig.API_LEVEL;
                    case BuildConfig.API_LEVEL /* 116 */:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static int p(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static int q(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i6 = bArr[i2 + 1] & 255;
        int i7 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i6 << 8) | i3 | (i7 << 16);
    }

    public static AbstractC0316a1 s() {
        String str;
        ClassLoader classLoader = AbstractC0325d1.class.getClassLoader();
        if (AbstractC0316a1.class.equals(AbstractC0316a1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!AbstractC0316a1.class.getPackage().equals(AbstractC0325d1.class.getPackage())) {
                throw new IllegalArgumentException(AbstractC0316a1.class.getName());
            }
            str = AbstractC0316a1.class.getPackage().getName() + ".BlazeGenerated" + AbstractC0316a1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    AbstractC0279e.o(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e3) {
                    throw new IllegalStateException(e3);
                } catch (InvocationTargetException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (InstantiationException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC0325d1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e9) {
                    Logger.getLogger(Z0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(AbstractC0316a1.class.getSimpleName()), (Throwable) e9);
                }
            }
            if (arrayList.size() == 1) {
                return (AbstractC0316a1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (AbstractC0316a1) AbstractC0316a1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException(e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(e12);
            }
        }
    }

    public static void t(byte b6, byte b7, byte b8, char[] cArr, int i2) {
        if (!G(b7)) {
            if (b6 == -32) {
                if (b7 >= -96) {
                    b6 = -32;
                }
            }
            if (b6 == -19) {
                if (b7 < -96) {
                    b6 = -19;
                }
            }
            if (!G(b8)) {
                cArr[i2] = (char) (((b6 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
                return;
            }
        }
        throw new C0355n1("Protocol message had invalid UTF-8.");
    }

    public static void u(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(K("index", i2, i3));
        }
    }

    public static int w(D1 d12, byte[] bArr, int i2, int i3, int i6, V0 v02) {
        AbstractC0334g1 f3 = d12.f();
        int S5 = S(f3, d12, bArr, i2, i3, i6, v02);
        d12.a(f3);
        v02.f5113c = f3;
        return S5;
    }

    public static long x(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public static void y(byte b6, byte b7, char[] cArr, int i2) {
        if (b6 < -62 || G(b7)) {
            throw new C0355n1("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b6 & 31) << 6) | (b7 & 63));
    }

    public abstract boolean A(r2 r2Var, F1 f12, F1 f13);

    public abstract void B(C0351m0 c0351m0, Thread thread);

    public abstract boolean D(r2 r2Var, Object obj, Object obj2);

    public abstract boolean H(AbstractC0354n0 abstractC0354n0, C0330f0 c0330f0, C0330f0 c0330f02);

    public abstract boolean I(r2 r2Var, q2 q2Var, q2 q2Var2);

    public abstract boolean L(AbstractC0354n0 abstractC0354n0, Object obj, Object obj2);

    public abstract boolean N(AbstractC0354n0 abstractC0354n0, C0351m0 c0351m0, C0351m0 c0351m02);

    public abstract C0330f0 e(AbstractC0354n0 abstractC0354n0);

    public abstract void k(q2 q2Var, q2 q2Var2);

    public abstract C0351m0 r(AbstractC0354n0 abstractC0354n0);

    public String toString() {
        switch (this.f5167a) {
            case 4:
                return ((C0) this).f5031b.toString();
            default:
                return super.toString();
        }
    }

    public abstract void v(q2 q2Var, Thread thread);

    public abstract void z(C0351m0 c0351m0, C0351m0 c0351m02);
}
