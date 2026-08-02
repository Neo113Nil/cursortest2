package O3;

import T.C0096n;
import T.C0097o;
import T.F;
import W.AbstractC0108a;
import a.AbstractC0124a;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.C0174g;
import c3.C0293e;
import com.google.android.gms.internal.play_billing.N;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import e0.C0392b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j0.u;
import j0.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinVersion;
import t0.C1427b;
import v2.I;
import v2.a0;
import v2.f0;
import w.C1482b;
import w3.AbstractC1504a;
import w3.AbstractC1510g;
import w3.o;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f2077a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2078b = true;

    public l() {
        new ConcurrentHashMap();
    }

    public static void A(Parcel parcel, int i4, String str) {
        if (str == null) {
            return;
        }
        int D3 = D(parcel, i4);
        parcel.writeString(str);
        F(parcel, D3);
    }

    public static void B(Parcel parcel, int i4, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int D3 = D(parcel, i4);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        F(parcel, D3);
    }

    public static void C(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int D3 = D(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        F(parcel, D3);
    }

    public static int D(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static /* synthetic */ boolean E(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, N n, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(n, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(n) != obj && atomicReferenceFieldUpdater.get(n) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void F(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static void G(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i4, int i5) {
        for (Object obj2 : spannableStringBuilder.getSpans(i4, i5, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i4 && spannableStringBuilder.getSpanEnd(obj2) == i5 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i4, i5, 33);
    }

    public static Y.k b(e0.m mVar, String str, e0.j jVar, int i4) {
        Map map = Collections.EMPTY_MAP;
        Uri q4 = AbstractC0108a.q(str, jVar.f8389c);
        long j4 = jVar.f8387a;
        long j5 = jVar.f8388b;
        String b4 = mVar.b();
        if (b4 == null) {
            b4 = AbstractC0108a.q(((C0392b) mVar.f8395b.get(0)).f8342a, jVar.f8389c).toString();
        }
        String str2 = b4;
        AbstractC0124a.o(q4, "The uri must be set.");
        return new Y.k(q4, 1, null, f0.f15629g, j4, j5, str2, i4);
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(H3.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i4), str).toString());
            }
            i4 = i5;
        }
    }

    public static void d(String str, String str2) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.h(H3.b.o(str2) ? "" : kotlin.jvm.internal.i.h(str, ": "), H3.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i4), str2)).toString());
            }
            i4 = i5;
        }
    }

    public static long[] f(long[]... jArr) {
        long j4 = 0;
        for (long[] jArr2 : jArr) {
            j4 += jArr2.length;
        }
        int i4 = (int) j4;
        AbstractC0124a.i(j4 == ((long) i4), "the total number of elements (%s) in the arrays must fit in an int", j4);
        long[] jArr3 = new long[i4];
        int i5 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i5, jArr4.length);
            i5 += jArr4.length;
        }
        return jArr3;
    }

    public static final long g(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j4 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j4 += read;
            read = inputStream.read(bArr);
        }
        return j4;
    }

    public static final C0293e h(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new C0293e(exception);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress n(int i4, int i5, String str) {
        int i6;
        byte[] bArr = new byte[16];
        int i7 = i4;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i5) {
                break;
            }
            if (i8 == 16) {
                return null;
            }
            int i11 = i7 + 2;
            if (i11 <= i5 && o.Z(i7, str, "::", false)) {
                if (i9 != -1) {
                    return null;
                }
                i8 += 2;
                i9 = i8;
                if (i11 == i5) {
                    break;
                }
                i10 = i11;
                int i12 = 0;
                i7 = i10;
                while (i7 < i5) {
                }
                i6 = i7 - i10;
                return i6 == 0 ? null : null;
            }
            if (i8 != 0) {
                if (o.Z(i7, str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
                    i7++;
                } else {
                    if (!o.Z(i7, str, ".", false)) {
                        return null;
                    }
                    int i13 = i8 - 2;
                    int i14 = i13;
                    while (i10 < i5) {
                        if (i14 == 16) {
                            return null;
                        }
                        if (i14 != i13) {
                            if (str.charAt(i10) != '.') {
                                return null;
                            }
                            i10++;
                        }
                        int i15 = 0;
                        int i16 = i10;
                        while (i16 < i5) {
                            char charAt = str.charAt(i16);
                            if (kotlin.jvm.internal.i.f(charAt, 48) < 0 || kotlin.jvm.internal.i.f(charAt, 57) > 0) {
                                break;
                            }
                            if ((i15 == 0 && i10 != i16) || ((i15 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i16++;
                        }
                        if (i16 - i10 == 0) {
                            return null;
                        }
                        bArr[i14] = (byte) i15;
                        i14++;
                        i10 = i16;
                    }
                    if (i14 != i8 + 2) {
                        return null;
                    }
                    i8 += 2;
                }
            }
            i10 = i7;
            int i122 = 0;
            i7 = i10;
            while (i7 < i5) {
                int p2 = H3.b.p(str.charAt(i7));
                if (p2 == -1) {
                    break;
                }
                i122 = (i122 << 4) + p2;
                i7++;
            }
            i6 = i7 - i10;
            if (i6 == 0 && i6 <= 4) {
                int i17 = i8 + 1;
                bArr[i8] = (byte) (255 & (i122 >>> 8));
                i8 += 2;
                bArr[i17] = (byte) (i122 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        if (i8 != 16) {
            if (i9 == -1) {
                return null;
            }
            int i18 = i8 - i9;
            System.arraycopy(bArr, i9, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i9, (16 - i8) + i9, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static String o(C0174g c0174g) {
        StringBuilder sb = new StringBuilder(c0174g.size());
        for (int i4 = 0; i4 < c0174g.size(); i4++) {
            byte b4 = c0174g.b(i4);
            if (b4 == 34) {
                sb.append("\\\"");
            } else if (b4 == 39) {
                sb.append("\\'");
            } else if (b4 != 92) {
                switch (b4) {
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
                        if (b4 < 32 || b4 > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((b4 >>> 6) & 3) + 48));
                            sb.append((char) (((b4 >>> 3) & 7) + 48));
                            sb.append((char) ((b4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b4);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int p(boolean z) {
        List supportedPerformancePoints;
        boolean covers;
        try {
            C0096n c0096n = new C0096n();
            c0096n.f2831m = F.n("video/avc");
            C0097o c0097o = new C0097o(c0096n);
            String str = c0097o.n;
            if (str != null) {
                List e4 = w.e(str, z, false);
                String c4 = w.c(c0097o);
                Iterable e5 = c4 == null ? a0.f15605e : w.e(c4, z, false);
                v2.F j4 = I.j();
                j4.c(e4);
                j4.c(e5);
                a0 f4 = j4.f();
                for (int i4 = 0; i4 < f4.f15607d; i4++) {
                    if (((j0.o) f4.get(i4)).f13769d != null && (r2 = ((j0.o) f4.get(i4)).f13769d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        io.flutter.plugin.platform.e.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint d4 = io.flutter.plugin.platform.e.d();
                        for (int i5 = 0; i5 < supportedPerformancePoints.size(); i5++) {
                            covers = io.flutter.plugin.platform.e.f(supportedPerformancePoints.get(i5)).covers(d4);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (u unused) {
        }
        return 0;
    }

    public static int r(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static G3.n s(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            String str = strArr2[i5];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i5] = AbstractC1510g.r0(str).toString();
            i5 = i6;
        }
        int q4 = V3.b.q(0, strArr2.length - 1, 2);
        if (q4 >= 0) {
            while (true) {
                int i7 = i4 + 2;
                String str2 = strArr2[i4];
                String str3 = strArr2[i4 + 1];
                c(str2);
                d(str3, str2);
                if (i4 == q4) {
                    break;
                }
                i4 = i7;
            }
        }
        return new G3.n(strArr2);
    }

    public static final byte[] t(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        g(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.i.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static Uri u(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    public static void v(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f2078b) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f2078b = false;
            }
        }
    }

    public static final void w(Object obj) {
        if (obj instanceof C0293e) {
            throw ((C0293e) obj).f5726a;
        }
    }

    public static final String x(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int i4 = -1;
        int i5 = 0;
        if (!AbstractC1510g.c0(str, StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.i.d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + 1;
                    char charAt = lowerCase.charAt(i6);
                    if (kotlin.jvm.internal.i.f(charAt, 31) <= 0 || kotlin.jvm.internal.i.f(charAt, 127) >= 0 || AbstractC1510g.g0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                    i6 = i7;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress n = (o.a0(str, "[", false) && o.V(str, "]")) ? n(1, str.length() - 1, str) : n(0, str.length(), str);
        if (n == null) {
            return null;
        }
        byte[] address = n.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return n.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < address.length) {
            int i10 = i8;
            while (i10 < 16 && address[i10] == 0 && address[i10 + 1] == 0) {
                i10 += 2;
            }
            int i11 = i10 - i8;
            if (i11 > i9 && i11 >= 4) {
                i4 = i8;
                i9 = i11;
            }
            i8 = i10 + 2;
        }
        T3.g gVar = new T3.g();
        while (i5 < address.length) {
            if (i5 == i4) {
                gVar.x(58);
                i5 += i9;
                if (i5 == 16) {
                    gVar.x(58);
                }
            } else {
                if (i5 > 0) {
                    gVar.x(58);
                }
                byte b4 = address[i5];
                byte[] bArr = H3.b.f1103a;
                gVar.y(((b4 & 255) << 8) | (address[i5 + 1] & 255));
                i5 += 2;
            }
        }
        return gVar.n(gVar.f2975b, AbstractC1504a.f15936a);
    }

    public static void y(Parcel parcel, int i4, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int D3 = D(parcel, i4);
        parcel.writeStrongBinder(iBinder);
        F(parcel, D3);
    }

    public static void z(Parcel parcel, int i4, Parcelable parcelable, int i5) {
        if (parcelable == null) {
            return;
        }
        int D3 = D(parcel, i4);
        parcelable.writeToParcel(parcel, i5);
        F(parcel, D3);
    }

    public abstract List e(String str, List list);

    public abstract Typeface i(Context context, C1482b c1482b, Resources resources, int i4);

    public abstract Typeface j(Context context, B.l[] lVarArr, int i4);

    public Typeface k(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface l(Context context, InputStream inputStream) {
        File k4 = U.i.k(context);
        if (k4 == null) {
            return null;
        }
        try {
            if (U.i.f(k4, inputStream)) {
                return Typeface.createFromFile(k4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            k4.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i4, String str, int i5) {
        File k4 = U.i.k(context);
        if (k4 == null) {
            return null;
        }
        try {
            if (U.i.e(k4, resources, i4)) {
                return Typeface.createFromFile(k4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            k4.delete();
        }
    }

    public B.l q(B.l[] lVarArr, int i4) {
        new C1427b(4);
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z = (i4 & 2) != 0;
        B.l lVar = null;
        int i6 = Integer.MAX_VALUE;
        for (B.l lVar2 : lVarArr) {
            int abs = (Math.abs(lVar2.f180c - i5) * 2) + (lVar2.f181d == z ? 0 : 1);
            if (lVar == null || i6 > abs) {
                lVar = lVar2;
                i6 = abs;
            }
        }
        return lVar;
    }
}
