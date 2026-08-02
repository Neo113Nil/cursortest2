package a2;

import E.AbstractC0005f;
import E.InterfaceC0019u;
import G3.t;
import L1.q;
import T.C0097o;
import a.AbstractC0124a;
import a1.C0160a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebView;
import b1.C0260e;
import c1.C0283a;
import e1.C0397a;
import e1.C0406j;
import io.flutter.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONObject;
import s1.AbstractC1410a;
import t1.C1438b;
import v2.I;
import w3.AbstractC1504a;
import y0.y;

/* loaded from: classes.dex */
public final class i implements InterfaceC0019u, N1.b, T0.g, V0.j {

    /* renamed from: b, reason: collision with root package name */
    public static i f4281b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4282a;

    public /* synthetic */ i(int i4) {
        this.f4282a = i4;
    }

    public static void g(WebView webView) {
        l2.e eVar = new l2.e(webView, new i(8));
        WebView webView2 = (WebView) eVar.f14270b;
        i iVar = (i) eVar.f14271c;
        if (!AbstractC0124a.G("WEB_MESSAGE_LISTENER")) {
            iVar.getClass();
            return;
        }
        try {
            iVar.getClass();
            WeakHashMap weakHashMap = AbstractC1410a.f15227a;
            C1438b c1438b = t1.k.f15403c;
            if (!c1438b.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            AbstractC1410a.b(webView2).f15406a.removeWebMessageListener("omidJsAttestationListener");
            t1.h hVar = new t1.h(10, eVar);
            HashSet hashSet = new HashSet(Arrays.asList("*"));
            if (!c1438b.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            t1.m b4 = AbstractC1410a.b(webView2);
            b4.f15406a.addWebMessageListener("omidJsAttestationListener", (String[]) hashSet.toArray(new String[0]), new V3.a(new t1.h(0, hVar)));
        } catch (Exception unused) {
            iVar.getClass();
        }
    }

    public static final String h(byte[] bArr, byte[][] bArr2, int i4) {
        int i5;
        boolean z;
        int i6;
        int i7;
        byte[] bArr3 = PublicSuffixDatabase.f14626e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > -1 && bArr[i9] != 10) {
                i9--;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i5 = i10 + i11;
                if (bArr[i5] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i5 - i10;
            int i13 = i4;
            boolean z4 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z4) {
                    i6 = 46;
                    z = false;
                } else {
                    byte b4 = bArr2[i13][i14];
                    byte[] bArr4 = H3.b.f1103a;
                    int i16 = b4 & 255;
                    z = z4;
                    i6 = i16;
                }
                byte b5 = bArr[i10 + i15];
                byte[] bArr5 = H3.b.f1103a;
                i7 = i6 - (b5 & 255);
                if (i7 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z4 = z;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    i14 = -1;
                    z4 = true;
                }
            }
            if (i7 >= 0) {
                if (i7 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            kotlin.jvm.internal.i.d(UTF_8, "UTF_8");
                            return new String(bArr, i10, i12, UTF_8);
                        }
                    }
                }
                i8 = i5 + 1;
            }
            length = i9;
        }
        return null;
    }

    public static ArrayList i(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(d3.k.Y(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((t) obj2).f1006a);
        }
        return arrayList2;
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] k(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        T3.g gVar = new T3.g();
        ArrayList i4 = i(protocols);
        int size = i4.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = i4.get(i5);
            i5++;
            String str = (String) obj;
            gVar.x(str.length());
            gVar.C(str);
        }
        return gVar.k(gVar.f2975b);
    }

    public static T3.j l(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) (U3.b.a(str.charAt(i5 + 1)) + (U3.b.a(str.charAt(i5)) << 4));
        }
        return new T3.j(bArr);
    }

    public static byte[] m(long j4, I i4) {
        D0.d dVar = new D0.d(15);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i4.size());
        int size = i4.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = i4.get(i5);
            i5++;
            arrayList.add((Bundle) dVar.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j4);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static T3.j n(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC1504a.f15936a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        T3.j jVar = new T3.j(bytes);
        jVar.f2979c = str;
        return jVar;
    }

    public static l2.e o(Context context, String[] strArr, String str, G1.c cVar) {
        String[] t4 = t(context);
        int length = t4.length;
        int i4 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i4 >= length) {
                return null;
            }
            String str2 = t4[i4];
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i5 = i6;
                }
            }
            if (zipFile != null) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c4 = File.separatorChar;
                            sb.append(c4);
                            sb.append(str3);
                            sb.append(c4);
                            sb.append(str);
                            String sb2 = sb.toString();
                            cVar.h("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                l2.e eVar = new l2.e(6, false);
                                eVar.f14270b = zipFile;
                                eVar.f14271c = entry;
                                return eVar;
                            }
                        }
                        i7 = i8;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i4++;
        }
    }

    public static String[] p(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c4 = File.separatorChar;
        sb.append(c4);
        sb.append("([^\\");
        sb.append(c4);
        sb.append("]*)");
        sb.append(c4);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : t(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static boolean r() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static void s(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap d4 = N2.b.d(jSONObject.getJSONObject("attestationArgs"));
                d4.put("version", string2);
                O3.d.a(J2.h.f1183b.f1184a.getApplicationContext(), string, new t1.h(d4));
            } catch (Exception unused) {
            }
        }
    }

    public static String[] t(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static final m u(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < mVarArr.length; i4++) {
                if (mVarArr[i4].equals(nVar)) {
                    return mVarArr[i4];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean v(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? u(packageInfo2, o.f4292a) : u(packageInfo2, o.f4292a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z = true;
        if (packageInfo != null) {
            if ((!z ? u(packageInfo2, o.f4292a) : u(packageInfo2, o.f4292a[0])) == null) {
            }
        }
        return false;
    }

    @Override // V0.j
    public V0.l a(C0097o c0097o) {
        V0.l hVar;
        switch (this.f4282a) {
            case Build.API_LEVELS.API_28 /* 28 */:
                String str = c0097o.n;
                List list = c0097o.f2870q;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                            hVar = new X0.h(list);
                            break;
                        case "application/pgs":
                            return new G1.c(7);
                        case "application/x-mp4-vtt":
                            return new C0397a(0);
                        case "text/vtt":
                            return new C0406j();
                        case "application/x-quicktime-tx3g":
                            hVar = new C0283a(list);
                            break;
                        case "text/x-ssa":
                            hVar = new Z0.a(list);
                            break;
                        case "application/vobsub":
                            hVar = new G1.c(list);
                            break;
                        case "application/x-subrip":
                            return new C0160a();
                        case "application/ttml+xml":
                            return new C0260e();
                    }
                    return hVar;
                }
                throw new IllegalArgumentException(AbstractC0005f.n("Unsupported MIME type: ", str));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // T0.g
    public long b(y0.o oVar) {
        return -1L;
    }

    @Override // V0.j
    public int c(C0097o c0097o) {
        switch (this.f4282a) {
            case Build.API_LEVELS.API_28 /* 28 */:
                String str = c0097o.n;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                        case "application/pgs":
                        case "application/x-mp4-vtt":
                        case "application/x-quicktime-tx3g":
                        case "application/vobsub":
                            return 2;
                        case "text/vtt":
                        case "text/x-ssa":
                        case "application/x-subrip":
                        case "application/ttml+xml":
                            return 1;
                    }
                }
                throw new IllegalArgumentException(AbstractC0005f.n("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    @Override // T0.g
    public y d() {
        return new A0.b(-9223372036854775807L);
    }

    @Override // V0.j
    public boolean f(C0097o c0097o) {
        switch (this.f4282a) {
            case Build.API_LEVELS.API_28 /* 28 */:
                String str = c0097o.n;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        switch (this.f4282a) {
            case 14:
                return new q(Executors.newSingleThreadExecutor());
            default:
                i iVar = new i(25);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(I1.c.f1126a, new R1.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(I1.c.f1128c, new R1.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(R1.f.f2339b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(I1.c.f1127b, new R1.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < I1.c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new R1.b(iVar, hashMap);
        }
    }

    public long q() {
        switch (this.f4282a) {
            case 24:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    @Override // T0.g
    public void e(long j4) {
    }

    @Override // E.InterfaceC0019u
    public void onScrollLimit(int i4, int i5, int i6, boolean z) {
    }

    @Override // E.InterfaceC0019u
    public void onScrollProgress(int i4, int i5, int i6, int i7) {
    }
}
