package O3;

import E.AbstractC0005f;
import G3.B;
import G3.t;
import W.J;
import a.AbstractC0124a;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H;
import com.google.android.gms.internal.play_billing.M;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.gms.internal.play_billing.Z;
import d.C0373a;
import d3.q;
import i3.C0460b;
import j3.AbstractC1176a;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k3.AbstractC1242a;
import kotlin.KotlinVersion;
import o3.InterfaceC1339l;
import t3.C1441a;
import t3.C1443c;
import w3.AbstractC1510g;
import w3.o;

/* loaded from: classes.dex */
public abstract class d {
    public static void C(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i4));
    }

    public static String D(Throwable th) {
        kotlin.jvm.internal.i.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.i.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static C1441a E(C1443c c1443c, int i4) {
        kotlin.jvm.internal.i.e(c1443c, "<this>");
        boolean z = i4 > 0;
        Integer valueOf = Integer.valueOf(i4);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i5 = c1443c.f15424a;
        int i6 = c1443c.f15425b;
        if (c1443c.f15426c <= 0) {
            i4 = -i4;
        }
        return new C1441a(i5, i6, i4);
    }

    public static int[] F(Collection collection) {
        if (collection instanceof y2.b) {
            y2.b bVar = (y2.b) collection;
            return Arrays.copyOfRange(bVar.f16263a, bVar.f16264b, bVar.f16265c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            iArr[i4] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer G(String str) {
        byte b4;
        Integer num;
        Long l4;
        byte b5;
        str.getClass();
        if (!str.isEmpty()) {
            int i4 = str.charAt(0) == '-' ? 1 : 0;
            if (i4 != str.length()) {
                int i5 = i4 + 1;
                char charAt = str.charAt(i4);
                if (charAt < 128) {
                    b4 = y2.c.f16266a[charAt];
                } else {
                    byte[] bArr = y2.c.f16266a;
                    b4 = -1;
                }
                if (b4 >= 0 && b4 < 10) {
                    long j4 = -b4;
                    long j5 = 10;
                    long j6 = Long.MIN_VALUE / j5;
                    while (true) {
                        if (i5 < str.length()) {
                            int i6 = i5 + 1;
                            char charAt2 = str.charAt(i5);
                            if (charAt2 < 128) {
                                b5 = y2.c.f16266a[charAt2];
                            } else {
                                byte[] bArr2 = y2.c.f16266a;
                                b5 = -1;
                            }
                            if (b5 < 0 || b5 >= 10 || j4 < j6) {
                                break;
                            }
                            long j7 = j4 * j5;
                            num = null;
                            long j8 = b5;
                            if (j7 < j8 - Long.MIN_VALUE) {
                                break;
                            }
                            j4 = j7 - j8;
                            i5 = i6;
                        } else {
                            num = null;
                            if (i4 != 0) {
                                l4 = Long.valueOf(j4);
                            } else if (j4 != Long.MIN_VALUE) {
                                l4 = Long.valueOf(-j4);
                            }
                        }
                    }
                }
                num = null;
                l4 = num;
                return (l4 == 0 && l4.longValue() == ((long) l4.intValue())) ? Integer.valueOf(l4.intValue()) : num;
            }
        }
        l4 = 0;
        num = null;
        if (l4 == 0) {
        }
    }

    public static C1443c H(int i4, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new C1443c(i4, i5 - 1, 1);
        }
        C1443c c1443c = C1443c.f15431d;
        return C1443c.f15431d;
    }

    public static int I(Parcel parcel) {
        int readInt = parcel.readInt();
        int y4 = y(parcel, readInt);
        char c4 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new G1.a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i4 = y4 + dataPosition;
        if (i4 < dataPosition || i4 > parcel.dataSize()) {
            throw new G1.a(AbstractC0005f.i(dataPosition, i4, "Size read is invalid start=", " end="), parcel);
        }
        return i4;
    }

    public static /* synthetic */ boolean L(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, G1 g12, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(g12, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(g12) != obj && atomicReferenceFieldUpdater.get(g12) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void N(Parcel parcel, int i4, int i5) {
        int y4 = y(parcel, i4);
        if (y4 == i5) {
            return;
        }
        String hexString = Integer.toHexString(y4);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(y4);
        sb.append(" (0x");
        throw new G1.a(AbstractC0005f.q(sb, hexString, ")"), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: Exception -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x0020, B:15:0x003a), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str, t1.h hVar) {
        H2.c cVar;
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            H2.b.a(context).getClass();
            H2.d dVar = (H2.d) H2.b.f1091c.get(str);
            if (!(dVar != null ? dVar.b() : false)) {
                return;
            }
            if ("FireTVFOSDAT".equals(str)) {
                cVar = new H2.c(context);
                if (cVar == null) {
                    cVar.a(hVar);
                    return;
                }
                return;
            }
            cVar = null;
            if (cVar == null) {
            }
        } catch (Exception unused) {
        }
    }

    public static boolean b(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!"omid-native".equals(parse.getScheme())) {
                return false;
            }
            V3.b.f(parse);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void c(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC1242a.f14150a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC1176a.f13897a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static void d(StringBuilder sb, Object obj, InterfaceC1339l interfaceC1339l) {
        if (interfaceC1339l != null) {
            sb.append((CharSequence) interfaceC1339l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static List e(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new y2.b(0, iArr.length, iArr);
    }

    public static void f(long j4, T3.g gVar, int i4, ArrayList arrayList, int i5, int i6, ArrayList arrayList2) {
        int i7;
        int i8;
        ArrayList arrayList3;
        long j5;
        int i9;
        int i10 = i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i5 >= i6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i5; i11 < i6; i11++) {
            if (((T3.j) arrayList4.get(i11)).a() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        T3.j jVar = (T3.j) arrayList.get(i5);
        T3.j jVar2 = (T3.j) arrayList4.get(i6 - 1);
        if (i10 == jVar.a()) {
            int intValue = ((Number) arrayList5.get(i5)).intValue();
            int i12 = i5 + 1;
            T3.j jVar3 = (T3.j) arrayList4.get(i12);
            i7 = i12;
            i8 = intValue;
            jVar = jVar3;
        } else {
            i7 = i5;
            i8 = -1;
        }
        if (jVar.d(i10) == jVar2.d(i10)) {
            int min = Math.min(jVar.a(), jVar2.a());
            int i13 = 0;
            for (int i14 = i10; i14 < min && jVar.d(i14) == jVar2.d(i14); i14++) {
                i13++;
            }
            long j6 = 4;
            long j7 = (gVar.f2975b / j6) + j4 + 2 + i13 + 1;
            gVar.z(-i13);
            gVar.z(i8);
            int i15 = i10 + i13;
            while (i10 < i15) {
                gVar.z(jVar.d(i10) & KotlinVersion.MAX_COMPONENT_VALUE);
                i10++;
            }
            if (i7 + 1 == i6) {
                if (i15 != ((T3.j) arrayList4.get(i7)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                gVar.z(((Number) arrayList5.get(i7)).intValue());
                return;
            } else {
                T3.g gVar2 = new T3.g();
                gVar.z(((int) ((gVar2.f2975b / j6) + j7)) * (-1));
                f(j7, gVar2, i15, arrayList4, i7, i6, arrayList5);
                gVar.w(gVar2);
                return;
            }
        }
        int i16 = 1;
        for (int i17 = i7 + 1; i17 < i6; i17++) {
            if (((T3.j) arrayList4.get(i17 - 1)).d(i10) != ((T3.j) arrayList4.get(i17)).d(i10)) {
                i16++;
            }
        }
        long j8 = 4;
        long j9 = (gVar.f2975b / j8) + j4 + 2 + (i16 * 2);
        gVar.z(i16);
        gVar.z(i8);
        for (int i18 = i7; i18 < i6; i18++) {
            int d4 = ((T3.j) arrayList4.get(i18)).d(i10);
            if (i18 == i7 || d4 != ((T3.j) arrayList4.get(i18 - 1)).d(i10)) {
                gVar.z(d4 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        T3.g gVar3 = new T3.g();
        int i19 = i7;
        while (i19 < i6) {
            byte d5 = ((T3.j) arrayList4.get(i19)).d(i10);
            int i20 = i19 + 1;
            int i21 = i20;
            while (true) {
                if (i21 >= i6) {
                    i21 = i6;
                    break;
                } else if (d5 != ((T3.j) arrayList4.get(i21)).d(i10)) {
                    break;
                } else {
                    i21++;
                }
            }
            if (i20 == i21 && i10 + 1 == ((T3.j) arrayList4.get(i19)).a()) {
                gVar.z(((Number) arrayList5.get(i19)).intValue());
                arrayList3 = arrayList5;
                j5 = j9;
                i9 = i21;
            } else {
                gVar.z(((int) ((gVar3.f2975b / j8) + j9)) * (-1));
                arrayList3 = arrayList5;
                j5 = j9;
                i9 = i21;
                f(j5, gVar3, i10 + 1, arrayList, i19, i9, arrayList3);
                arrayList4 = arrayList;
            }
            j9 = j5;
            i19 = i9;
            arrayList5 = arrayList3;
        }
        gVar.w(gVar3);
    }

    public static int g(long j4) {
        int i4 = (int) j4;
        AbstractC0124a.i(((long) i4) == j4, "Out of range: %s", j4);
        return i4;
    }

    public static Parcelable h(Parcel parcel, int i4, Parcelable.Creator creator) {
        int y4 = y(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (y4 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y4);
        return parcelable;
    }

    public static String i(Parcel parcel, int i4) {
        int y4 = y(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (y4 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y4);
        return readString;
    }

    public static Object[] j(Parcel parcel, int i4, Parcelable.Creator creator) {
        int y4 = y(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (y4 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y4);
        return createTypedArray;
    }

    public static ArrayList k(Parcel parcel, int i4, Parcelable.Creator creator) {
        int y4 = y(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (y4 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y4);
        return createTypedArrayList;
    }

    public static void l(Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            throw new G1.a(AbstractC0005f.j(i4, "Overread allowed size end="), parcel);
        }
    }

    public static final C0460b m(Enum[] entries) {
        kotlin.jvm.internal.i.e(entries, "entries");
        return new C0460b(entries);
    }

    public static int n(byte b4, byte b5, byte b6, byte b7) {
        return (b4 << 24) | ((b5 & 255) << 16) | ((b6 & 255) << 8) | (b7 & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G3.l o(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = q.f8333a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(kotlin.jvm.internal.i.h(cipherSuite, "cipherSuite == "));
        }
        G3.g d4 = G3.g.f889b.d(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        B o = V3.b.o(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = H3.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = H3.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new G3.l(o, d4, list2, new G3.k(0, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new G3.l(o, d4, list2, new G3.k(0, list));
    }

    public static Y.k p(int i4) {
        String str = J.f3263a;
        Locale locale = Locale.US;
        return new Y.k(Uri.parse("rtp://0.0.0.0:" + i4), 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }

    public static Object q(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return A.a.a(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0373a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static int r(int i4, int i5, int i6, int[] iArr) {
        while (i5 < i6) {
            if (iArr[i5] == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static L3.h s(String statusLine) {
        int i4;
        String str;
        kotlin.jvm.internal.i.e(statusLine, "statusLine");
        boolean a02 = o.a0(statusLine, "HTTP/1.", false);
        t tVar = t.HTTP_1_0;
        if (a02) {
            i4 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
                }
                tVar = t.HTTP_1_1;
            }
        } else {
            if (!o.a0(statusLine, "ICY ", false)) {
                throw new ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
            }
            i4 = 4;
        }
        int i5 = i4 + 3;
        if (statusLine.length() < i5) {
            throw new ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
        }
        try {
            String substring = statusLine.substring(i4, i5);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (statusLine.length() <= i5) {
                str = "";
            } else {
                if (statusLine.charAt(i5) != ' ') {
                    throw new ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
                }
                str = statusLine.substring(i4 + 4);
                kotlin.jvm.internal.i.d(str, "this as java.lang.String).substring(startIndex)");
            }
            return new L3.h(tVar, parseInt, str, 0);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
        }
    }

    public static v1.h t(String str) {
        String group;
        if (str == null || AbstractC1510g.j0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        kotlin.jvm.internal.i.d(description, "description");
        return new v1.h(description, parseInt, parseInt2, parseInt3);
    }

    public static boolean u(Parcel parcel, int i4) {
        N(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder v(Parcel parcel, int i4) {
        int y4 = y(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (y4 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y4);
        return readStrongBinder;
    }

    public static int w(Parcel parcel, int i4) {
        N(parcel, i4, 4);
        return parcel.readInt();
    }

    public static long x(Parcel parcel, int i4) {
        N(parcel, i4, 8);
        return parcel.readLong();
    }

    public static int y(Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    public static int z(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public abstract void B(boolean z);

    public abstract void J(byte[] bArr, int i4, int i5);

    public abstract H K(Z z);

    public abstract M M(Z z);

    public abstract void O(M m4, M m5);

    public abstract void P(M m4, Thread thread);

    public abstract boolean Q(Z z, H h2, H h4);

    public abstract boolean R(N n, Object obj, Object obj2);

    public abstract boolean S(N n, M m4, M m5);

    public void A(boolean z) {
    }
}
