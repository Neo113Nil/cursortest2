package r4;

import a2.g0;
import a2.h0;
import a2.j0;
import a8.d;
import android.content.Context;
import android.content.res.Resources;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import c7.q;
import d0.k3;
import d6.z;
import f1.e;
import f1.f;
import f1.g;
import f1.i0;
import f8.i;
import g0.l;
import g0.p;
import g0.p1;
import g0.t0;
import g4.s0;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k.p0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import l.w;
import m2.m;
import m2.n;
import q.j;
import r.s;
import r6.c;
import r6.k;
import s.y;
import s1.f1;
import t3.v;
import y6.h;
import z0.r0;
import z0.u;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements Encoder, n7.b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f7935a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7936b;

    /* renamed from: c, reason: collision with root package name */
    public static f f7937c;

    /* renamed from: d, reason: collision with root package name */
    public static f f7938d;

    /* renamed from: e, reason: collision with root package name */
    public static long f7939e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f7940f;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress A(int i7, int i8, String str) {
        int i9;
        byte[] bArr = new byte[16];
        int i10 = i7;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i10 >= i8) {
                break;
            }
            if (i11 == 16) {
                return null;
            }
            int i14 = i10 + 2;
            if (i14 <= i8 && o.u(str, "::", i10, false)) {
                if (i12 != -1) {
                    return null;
                }
                i11 += 2;
                i12 = i11;
                if (i14 == i8) {
                    break;
                }
                i13 = i14;
                int i15 = 0;
                i10 = i13;
                while (i10 < i8) {
                }
                i9 = i10 - i13;
                return i9 == 0 ? null : null;
            }
            if (i11 != 0) {
                if (o.u(str, ":", i10, false)) {
                    i10++;
                } else {
                    if (!o.u(str, ".", i10, false)) {
                        return null;
                    }
                    int i16 = i11 - 2;
                    int i17 = i16;
                    while (i13 < i8) {
                        if (i17 == 16) {
                            return null;
                        }
                        if (i17 != i16) {
                            if (str.charAt(i13) != '.') {
                                return null;
                            }
                            i13++;
                        }
                        int i18 = 0;
                        int i19 = i13;
                        while (i19 < i8) {
                            char charAt = str.charAt(i19);
                            if (k.g(charAt, 48) < 0 || k.g(charAt, 57) > 0) {
                                break;
                            }
                            if ((i18 == 0 && i13 != i19) || ((i18 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i19++;
                        }
                        if (i19 - i13 == 0) {
                            return null;
                        }
                        bArr[i17] = (byte) i18;
                        i17++;
                        i13 = i19;
                    }
                    if (i17 != i11 + 2) {
                        return null;
                    }
                    i11 += 2;
                }
            }
            i13 = i10;
            int i152 = 0;
            i10 = i13;
            while (i10 < i8) {
                int p6 = t7.b.p(str.charAt(i10));
                if (p6 == -1) {
                    break;
                }
                i152 = (i152 << 4) + p6;
                i10++;
            }
            i9 = i10 - i13;
            if (i9 == 0 && i9 <= 4) {
                int i20 = i11 + 1;
                bArr[i11] = (byte) (255 & (i152 >>> 8));
                i11 += 2;
                bArr[i20] = (byte) (i152 & 255);
            }
        }
        if (i11 != 16) {
            if (i12 == -1) {
                return null;
            }
            int i21 = i11 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i21, i21);
            Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final f C() {
        f fVar = f7937c;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Outlined.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i7 = i0.f3188a;
        r0 r0Var = new r0(u.f10052b);
        g gVar = new g(0);
        gVar.n(19.0f, 13.0f);
        gVar.j(-6.0f);
        gVar.s(6.0f);
        gVar.j(-2.0f);
        gVar.s(-6.0f);
        gVar.i(5.0f);
        gVar.s(-2.0f);
        gVar.j(6.0f);
        gVar.r(5.0f);
        gVar.j(2.0f);
        gVar.s(6.0f);
        gVar.j(6.0f);
        gVar.s(2.0f);
        gVar.e();
        e.a(eVar, gVar.f3153f, r0Var);
        f b9 = eVar.b();
        f7937c = b9;
        return b9;
    }

    public static String D(Context context, int i7) {
        String valueOf;
        k.f(context, "context");
        if (i7 <= 16777215) {
            return String.valueOf(i7);
        }
        try {
            valueOf = context.getResources().getResourceName(i7);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i7);
        }
        k.e(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static y6.f E(v vVar) {
        k.f(vVar, "<this>");
        return h.o(vVar, t3.b.f8742m);
    }

    public static final Class F(x6.b bVar) {
        k.f(bVar, "<this>");
        Class a3 = ((c) bVar).a();
        k.d(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class G(x6.b bVar) {
        k.f(bVar, "<this>");
        Class a3 = ((c) bVar).a();
        if (a3.isPrimitive()) {
            String name = a3.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a3;
    }

    public static final long H(double d8) {
        return O(4294967296L, (float) d8);
    }

    public static final long I(int i7) {
        return O(4294967296L, i7);
    }

    public static final l2.h J(h0 h0Var, int i7) {
        g0 g0Var = h0Var.f388a;
        if (g0Var.f377a.f373f.length() != 0) {
            int e9 = h0Var.e(i7);
            if ((i7 != 0 && e9 == h0Var.e(i7 - 1)) || (i7 != g0Var.f377a.f373f.length() && e9 == h0Var.e(i7 + 1))) {
                return h0Var.a(i7);
            }
        }
        return h0Var.i(i7);
    }

    public static boolean K() {
        boolean isEnabled;
        try {
            if (f7940f == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f7940f == null) {
                f7939e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f7940f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f7940f.invoke(null, Long.valueOf(f7939e))).booleanValue();
        } catch (Exception e9) {
            if (!(e9 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e9);
                return false;
            }
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean L(long j8) {
        n[] nVarArr = m.f6326b;
        return (j8 & 1095216660480L) == 0;
    }

    public static final long M(int i7, int i8, long j8) {
        int j9 = m2.a.j(j8) + i7;
        if (j9 < 0) {
            j9 = 0;
        }
        int h3 = m2.a.h(j8);
        if (h3 != Integer.MAX_VALUE && (h3 = h3 + i7) < 0) {
            h3 = 0;
        }
        int i9 = m2.a.i(j8) + i8;
        if (i9 < 0) {
            i9 = 0;
        }
        int g9 = m2.a.g(j8);
        return b(j9, h3, i9, (g9 == Integer.MAX_VALUE || (g9 = g9 + i8) >= 0) ? g9 : 0);
    }

    public static /* synthetic */ long N(long j8, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return M(i7, i8, j8);
    }

    public static final long O(long j8, float f9) {
        long floatToIntBits = j8 | (Float.floatToIntBits(f9) & 4294967295L);
        n[] nVarArr = m.f6326b;
        return floatToIntBits;
    }

    public static String P(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        i iVar = i.f3600i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        k.e(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i7 = 0;
        t6.a.t(encoded.length, 0, length);
        byte[] a02 = e6.k.a0(encoded, 0, length);
        i iVar2 = new i(a02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(a02, 0, iVar2.e());
        byte[] digest = messageDigest.digest();
        k.c(digest);
        new i(digest);
        byte[] bArr = f8.a.f3567a;
        k.f(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i8 = 0;
        while (i7 < length2) {
            byte b9 = digest[i7];
            int i9 = i7 + 2;
            byte b10 = digest[i7 + 1];
            i7 += 3;
            byte b11 = digest[i9];
            bArr2[i8] = bArr[(b9 & 255) >> 2];
            bArr2[i8 + 1] = bArr[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr2[i8 + 2] = bArr[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i8 += 4;
            bArr2[i10] = bArr[b11 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b12 = digest[i7];
            bArr2[i8] = bArr[(b12 & 255) >> 2];
            bArr2[i8 + 1] = bArr[(b12 & 3) << 4];
            bArr2[i8 + 2] = 61;
            bArr2[i8 + 3] = 61;
        } else if (length3 == 2) {
            int i11 = i7 + 1;
            byte b13 = digest[i7];
            byte b14 = digest[i11];
            bArr2[i8] = bArr[(b13 & 255) >> 2];
            bArr2[i8 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i8 + 2] = bArr[(b14 & 15) << 2];
            bArr2[i8 + 3] = 61;
        }
        sb.append(new String(bArr2, z6.a.f10114a));
        return sb.toString();
    }

    public static m3.b Q(MappedByteBuffer mappedByteBuffer) {
        long j8;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                j8 = -1;
                break;
            }
            int i9 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j8 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i9) {
                break;
            }
            i8++;
        }
        if (j8 != -1) {
            duplicate.position(duplicate.position() + ((int) (j8 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j9 = duplicate.getInt() & 4294967295L;
            for (int i10 = 0; i10 < j9; i10++) {
                int i11 = duplicate.getInt();
                long j10 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i11 || 1701669481 == i11) {
                    duplicate.position((int) (j10 + j8));
                    m3.b bVar = new m3.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f3416i = duplicate;
                    bVar.f3413f = position;
                    int i12 = position - duplicate.getInt(position);
                    bVar.f3414g = i12;
                    bVar.f3415h = ((ByteBuffer) bVar.f3416i).getShort(i12);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void R(Object[] objArr, int i7, int i8) {
        k.f(objArr, "<this>");
        while (i7 < i8) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static final String S(String str) {
        k.f(str, "<this>");
        int i7 = -1;
        int i8 = 0;
        if (!z6.h.y(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                k.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                k.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt = lowerCase.charAt(i9);
                    if (k.g(charAt, 31) <= 0 || k.g(charAt, 127) >= 0 || z6.h.D(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress A = (o.v(str, "[") && o.o(false, str, "]")) ? A(1, str.length() - 1, str) : A(0, str.length(), str);
        if (A == null) {
            return null;
        }
        byte[] address = A.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return A.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < address.length) {
            int i12 = i10;
            while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i7 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        f8.f fVar = new f8.f();
        while (i8 < address.length) {
            if (i8 == i7) {
                fVar.Q(58);
                i8 += i11;
                if (i8 == 16) {
                    fVar.Q(58);
                }
            } else {
                if (i8 > 0) {
                    fVar.Q(58);
                }
                byte b9 = address[i8];
                byte[] bArr = t7.b.f8932a;
                fVar.T(((b9 & 255) << 8) | (address[i8 + 1] & 255));
                i8 += 2;
            }
        }
        return fVar.D(fVar.f3598g, z6.a.f10114a);
    }

    public static final long b(int i7, int i8, int i9, int i10) {
        boolean z8 = false;
        if (!(i8 >= i7)) {
            d.c0("maxWidth(" + i8 + ") must be >= than minWidth(" + i7 + ')');
            throw null;
        }
        if (!(i10 >= i9)) {
            d.c0("maxHeight(" + i10 + ") must be >= than minHeight(" + i9 + ')');
            throw null;
        }
        if (i7 >= 0 && i9 >= 0) {
            z8 = true;
        }
        if (z8) {
            return z(i7, i8, i9, i10);
        }
        d.c0("minWidth(" + i7 + ") and minHeight(" + i9 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long c(int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return b(0, i7, 0, i8);
    }

    public static final long d(int i7) {
        long j8 = (i7 << 32) | (0 & 4294967295L);
        int i8 = j1.a.f4984n;
        return j8;
    }

    public static final void e(int i7, int i8, p pVar, o.k kVar, q.h hVar, q.h0 h0Var, q6.c cVar, s sVar, s0.e eVar, s0.o oVar, boolean z8) {
        int i9;
        q.h0 h0Var2;
        q.h hVar2;
        p pVar2;
        s sVar2;
        int i10;
        s0.e eVar2;
        o.k kVar2;
        boolean z9;
        o.k kVar3;
        q.h hVar3;
        q.h0 h0Var3;
        s sVar3;
        s0.e eVar3;
        boolean z10;
        pVar.S(-740714857);
        if ((i7 & 6) == 0) {
            i9 = (pVar.f(oVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i11 = i9 | 16;
        int i12 = i8 & 4;
        if (i12 != 0) {
            i11 = i9 | 400;
            h0Var2 = h0Var;
        } else {
            h0Var2 = h0Var;
            if ((i7 & 384) == 0) {
                i11 |= pVar.f(h0Var2) ? 256 : 128;
            }
        }
        int i13 = i11 | 3072;
        if ((i7 & 24576) == 0) {
            hVar2 = hVar;
            i13 |= ((i8 & 16) == 0 && pVar.f(hVar2)) ? 16384 : 8192;
        } else {
            hVar2 = hVar;
        }
        int i14 = i13 | 13303808 | (pVar.h(cVar) ? 67108864 : 33554432);
        if ((38347923 & i14) == 38347922 && pVar.x()) {
            pVar.L();
            kVar3 = kVar;
            sVar3 = sVar;
            eVar3 = eVar;
            z10 = z8;
            h0Var3 = h0Var2;
            hVar3 = hVar2;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                float f9 = r.v.f7696a;
                Object[] objArr = new Object[0];
                androidx.room.c cVar2 = s.f7673w;
                boolean d8 = pVar.d(0) | pVar.d(0);
                Object G = pVar.G();
                t0 t0Var = l.f3784a;
                if (d8 || G == t0Var) {
                    G = new r.u(0);
                    pVar.a0(G);
                }
                pVar2 = pVar;
                s sVar4 = (s) a.a.E(objArr, cVar2, (q6.a) G, pVar2, 0, 4);
                int i15 = i14 & (-113);
                if (i12 != 0) {
                    float f10 = 0;
                    h0Var2 = new q.h0(f10, f10, f10, f10);
                }
                if ((i8 & 16) != 0) {
                    hVar2 = j.f7293c;
                    i15 = i14 & (-57457);
                }
                s0.e eVar4 = s0.b.f8089q;
                float f11 = p0.f5256a;
                m2.b bVar = (m2.b) pVar2.k(f1.f8217f);
                boolean c4 = pVar2.c(bVar.a());
                Object G2 = pVar2.G();
                if (c4 || G2 == t0Var) {
                    G2 = new w(new b6.c(bVar));
                    pVar2.a0(G2);
                }
                w wVar = (w) G2;
                boolean f12 = pVar2.f(wVar);
                Object G3 = pVar2.G();
                if (f12 || G3 == t0Var) {
                    G3 = new o.k(wVar);
                    pVar2.a0(G3);
                }
                sVar2 = sVar4;
                i10 = i15 & (-3670017);
                eVar2 = eVar4;
                kVar2 = (o.k) G3;
                z9 = true;
            } else {
                pVar.L();
                int i16 = i14 & (-113);
                if ((i8 & 16) != 0) {
                    i16 = i14 & (-57457);
                }
                i10 = i16 & (-3670017);
                kVar2 = kVar;
                sVar2 = sVar;
                eVar2 = eVar;
                z9 = z8;
                pVar2 = pVar;
            }
            q.h0 h0Var4 = h0Var2;
            q.h hVar4 = hVar2;
            pVar2.q();
            t6.a.f((i10 & 14) | 24576 | (i10 & 896) | 102239232 | ((i10 << 15) & 1879048192), (i10 >> 18) & 896, pVar2, kVar2, hVar4, h0Var4, cVar, sVar2, eVar2, oVar, z9);
            kVar3 = kVar2;
            hVar3 = hVar4;
            h0Var3 = h0Var4;
            sVar3 = sVar2;
            eVar3 = eVar2;
            z10 = z9;
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new r.a(oVar, sVar3, h0Var3, hVar3, eVar3, kVar3, z10, cVar, i7, i8);
        }
    }

    public static final void f(q6.a aVar, s0.o oVar, y yVar, q6.e eVar, p pVar, int i7) {
        pVar.S(2002163445);
        if ((((pVar.h(aVar) ? 4 : 2) | i7 | (pVar.f(oVar) ? 32 : 16) | (pVar.f(yVar) ? 256 : 128) | (pVar.h(eVar) ? 2048 : 1024)) & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            a.a.d(o0.f.b(-1488997347, new androidx.compose.foundation.lazy.layout.b(yVar, oVar, eVar, g0.d.M(aVar, pVar)), pVar), pVar, 6);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new g8.j(aVar, oVar, yVar, eVar, i7);
        }
    }

    public static final void g(int i7, p pVar) {
        pVar.S(-2101175513);
        if (i7 == 0 && pVar.x()) {
            pVar.L();
        } else {
            e4.a j8 = a.a.j(pVar);
            pVar.R(1729797275);
            c1 a3 = r3.b.a(pVar);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 Q = a.a.Q(r6.w.a(g4.w0.class), a3, j8, a3 instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) a3).d() : q3.a.f7511b, pVar);
            pVar.p(false);
            k3.a(null, g4.y.f4444b, null, null, null, 0, 0L, 0L, null, o0.f.b(1461970998, new s0(1, j1.c.P(((g4.w0) Q).f4434b, pVar)), pVar), pVar, 805306416, 509);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new q(i7, 7);
        }
    }

    public static final long h(int i7, int i8) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i7 + ", end: " + i8 + ']').toString());
        }
        if (i8 >= 0) {
            long j8 = (i8 & 4294967295L) | (i7 << 32);
            int i9 = j0.f407c;
            return j8;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i7 + ", end: " + i8 + ']').toString());
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object i(l1.c0 r7, j6.a r8) {
        /*
            boolean r0 = r8 instanceof n.b
            if (r0 == 0) goto L13
            r0 = r8
            n.b r0 = (n.b) r0
            int r1 = r0.f6474h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6474h = r1
            goto L18
        L13:
            n.b r0 = new n.b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6473g
            int r1 = r0.f6474h
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            l1.c0 r7 = r0.f6472f
            d6.a.e(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            d6.a.e(r8)
        L32:
            r0.f6472f = r7
            r0.f6474h = r2
            l1.k r8 = l1.k.f5816g
            java.lang.Object r8 = r7.b(r8, r0)
            i6.a r1 = i6.a.f4956f
            if (r8 != r1) goto L41
            return r1
        L41:
            l1.j r8 = (l1.j) r8
            int r1 = r8.f5813b
            java.lang.Object r8 = r8.f5812a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r8.size()
            r3 = 0
            r4 = r3
        L51:
            if (r4 >= r1) goto L6a
            java.lang.Object r5 = r8.get(r4)
            l1.v r5 = (l1.v) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L32
            boolean r6 = r5.f5837h
            if (r6 != 0) goto L32
            boolean r5 = r5.f5833d
            if (r5 == 0) goto L32
            int r4 = r4 + 1
            goto L51
        L6a:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.a.i(l1.c0, j6.a):java.lang.Object");
    }

    public static final void j(String str, int i7) {
        if (str.charAt(i7) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i7)).toString());
    }

    public static final void k(int i7, int i8, long j8, byte[] bArr) {
        int i9 = (i8 * 2) + i7;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = z6.c.f10122a[(int) (255 & j8)];
            bArr[i9 - 1] = (byte) i11;
            i9 -= 2;
            bArr[i9] = (byte) (i11 >> 8);
            j8 >>= 8;
        }
    }

    public static final int l(int i7) {
        if (i7 < 8191) {
            return 262142;
        }
        if (i7 < 32767) {
            return 65534;
        }
        if (i7 < 65535) {
            return 32766;
        }
        if (i7 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(a0.m.g(i7, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(List list, g3.i iVar, j6.c cVar) {
        g3.d dVar;
        int i7;
        List list2;
        r6.v vVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof g3.d) {
            dVar = (g3.d) cVar;
            int i8 = dVar.f4110i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.f4110i = i8 - Integer.MIN_VALUE;
                Object obj = dVar.f4109h;
                i7 = dVar.f4110i;
                Object obj2 = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    ArrayList arrayList = new ArrayList();
                    androidx.room.d dVar2 = new androidx.room.d(list, arrayList, null);
                    dVar.f4107f = arrayList;
                    dVar.f4110i = 1;
                    if (iVar.a(dVar2, dVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = dVar.f4108g;
                        vVar = (r6.v) dVar.f4107f;
                        try {
                            d6.a.e(obj);
                        } catch (Throwable th2) {
                            Object obj3 = vVar.f7968f;
                            if (obj3 == null) {
                                vVar.f7968f = th2;
                            } else {
                                d6.a.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            q6.c cVar2 = (q6.c) it.next();
                            dVar.f4107f = vVar;
                            dVar.f4108g = it;
                            dVar.f4110i = 2;
                            if (cVar2.f(dVar) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) vVar.f7968f;
                        if (th == null) {
                            return z.f2639a;
                        }
                        throw th;
                    }
                    list2 = (List) dVar.f4107f;
                    d6.a.e(obj);
                }
                vVar = new r6.v();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) vVar.f7968f;
                if (th == null) {
                }
            }
        }
        dVar = new g3.d(cVar);
        Object obj4 = dVar.f4109h;
        i7 = dVar.f4110i;
        Object obj22 = i6.a.f4956f;
        if (i7 != 0) {
        }
        vVar = new r6.v();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) vVar.f7968f;
        if (th == null) {
        }
    }

    public static final String n(Object[] objArr, int i7, int i8, e6.f fVar) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i7 + i9];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        k.e(sb2, "toString(...)");
        return sb2;
    }

    public static final int o(int i7) {
        if (i7 < 8191) {
            return 13;
        }
        if (i7 < 32767) {
            return 15;
        }
        if (i7 < 65535) {
            return 16;
        }
        return i7 < 262143 ? 18 : 255;
    }

    public static final void p(long j8, o.j0 j0Var) {
        if (j0Var == o.j0.f6657f) {
            if (m2.a.g(j8) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (m2.a.h(j8) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static boolean q(e7.e eVar) {
        return eVar.k(null, false);
    }

    public static final void r(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d6.a.a(th, th2);
            }
        }
    }

    public static final long s(long j8, int i7) {
        int i8 = j0.f407c;
        int i9 = (int) (j8 >> 32);
        int e9 = v1.g.e(i9, 0, i7);
        int i10 = (int) (4294967295L & j8);
        int e10 = v1.g.e(i10, 0, i7);
        return (e9 == i9 && e10 == i10) ? j8 : h(e9, e10);
    }

    public static final long t(long j8, long j9) {
        return j1.c.G(v1.g.e((int) (j9 >> 32), m2.a.j(j8), m2.a.h(j8)), v1.g.e((int) (j9 & 4294967295L), m2.a.i(j8), m2.a.g(j8)));
    }

    public static final long u(long j8, long j9) {
        return b(v1.g.e(m2.a.j(j9), m2.a.j(j8), m2.a.h(j8)), v1.g.e(m2.a.h(j9), m2.a.j(j8), m2.a.h(j8)), v1.g.e(m2.a.i(j9), m2.a.i(j8), m2.a.g(j8)), v1.g.e(m2.a.g(j9), m2.a.i(j8), m2.a.g(j8)));
    }

    public static final int v(long j8, int i7) {
        return v1.g.e(i7, m2.a.i(j8), m2.a.g(j8));
    }

    public static final int w(long j8, int i7) {
        return v1.g.e(i7, m2.a.j(j8), m2.a.h(j8));
    }

    public static final boolean x(y0.d dVar, float f9, float f10) {
        float f11 = dVar.f9780a;
        if (f9 > dVar.f9782c || f11 > f9) {
            return false;
        }
        return f10 <= dVar.f9783d && dVar.f9781b <= f10;
    }

    public static final void y(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }

    public static final long z(int i7, int i8, int i9, int i10) {
        int i11 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int o2 = o(i11);
        int i12 = i8 == Integer.MAX_VALUE ? i7 : i8;
        int o6 = o(i12);
        if (o2 + o6 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i12 + " and height of " + i11 + " in Constraints");
        }
        int i13 = i8 + 1;
        int i14 = i13 & (~(i13 >> 31));
        int i15 = i10 + 1;
        int i16 = i15 & (~(i15 >> 31));
        int i17 = 0;
        if (o6 != 13) {
            if (o6 == 18) {
                i17 = 3;
            } else if (o6 == 15) {
                i17 = 1;
            } else if (o6 == 16) {
                i17 = 2;
            }
        }
        int i18 = (((i17 & 2) >> 1) * 3) + ((i17 & 1) << 1);
        return (i14 << 33) | i17 | (i7 << 2) | (i9 << (i18 + 15)) | (i16 << (i18 + 46));
    }

    public abstract void B(SerialDescriptor serialDescriptor, int i7, Object obj);
}
