package k0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.lifecycle.I;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2758a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2759b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2760c;

    public static final void a(n1.a aVar, n1.c cVar, String str) {
        n1.d.i.fine(cVar.f3287b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3281a);
    }

    public static x1.e b() {
        x1.e eVar = x1.e.f4231l;
        Z0.d.b(eVar);
        x1.e eVar2 = eVar.f4233f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            x1.e.i.await(x1.e.f4229j, TimeUnit.MILLISECONDS);
            x1.e eVar3 = x1.e.f4231l;
            Z0.d.b(eVar3);
            if (eVar3.f4233f != null || System.nanoTime() - nanoTime < x1.e.f4230k) {
                return null;
            }
            return x1.e.f4231l;
        }
        long nanoTime2 = eVar2.f4234g - System.nanoTime();
        if (nanoTime2 > 0) {
            x1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        x1.e eVar4 = x1.e.f4231l;
        Z0.d.b(eVar4);
        eVar4.f4233f = eVar2.f4233f;
        eVar2.f4233f = null;
        return eVar2;
    }

    public static void c(long j2, x1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        x1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((x1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        x1.i iVar = (x1.i) arrayList.get(i2);
        x1.i iVar2 = (x1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            x1.i iVar3 = (x1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j3 = 4;
            long j4 = (fVar.f4236b / j3) + j2 + 2 + i12 + 1;
            fVar.w(-i12);
            fVar.w(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.w(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((x1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.w(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                x1.f fVar3 = new x1.f();
                fVar.w(((int) ((fVar3.f4236b / j3) + j4)) * (-1));
                c(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.t(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((x1.i) arrayList.get(i16 - 1)).d(i8) != ((x1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f4236b / j5) + j2 + 2 + (i15 * 2);
        fVar.w(i15);
        fVar.w(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d = ((x1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d != ((x1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.w(d & 255);
            }
        }
        x1.f fVar4 = new x1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d2 = ((x1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d2 != ((x1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((x1.i) arrayList.get(i18)).a()) {
                fVar.w(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.w(((int) ((fVar4.f4236b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                c(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.t(fVar4);
    }

    public static final String e(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k1.k f(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = R0.q.f712a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        k1.g c2 = k1.g.f2785b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        k1.x k2 = k1.c.k(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = l1.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = l1.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new k1.k(k2, c2, list2, new I(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new k1.k(k2, c2, list2, new I(1, list));
    }

    public static k1.p g(String str) {
        Z0.d.e(str, "<this>");
        Matcher matcher = k1.p.f2837c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        Z0.d.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        Z0.d.d(locale, "US");
        Z0.d.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        Z0.d.d(group2, "typeSubtype.group(2)");
        Z0.d.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = k1.p.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                Z0.d.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (g1.l.s0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    Z0.d.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new k1.p(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static void i(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final boolean j(String str) {
        Z0.d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String k(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        x1.i iVar = x1.i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        Z0.d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        k1.c.f(encoded.length, 0, length);
        byte[] p02 = R0.g.p0(0, length, encoded);
        x1.i iVar2 = new x1.i(p02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(p02, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        Z0.d.b(digest);
        new x1.i(digest);
        byte[] bArr = x1.a.f4222a;
        Z0.d.e(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b2 = digest[i];
            int i3 = i + 2;
            byte b3 = digest[i + 1];
            i += 3;
            byte b4 = digest[i3];
            bArr2[i2] = bArr[(b2 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[1 + i2] = bArr[(b5 & 3) << 4];
            bArr2[2 + i2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b6 = digest[i];
            byte b7 = digest[i5];
            bArr2[i2] = bArr[(b6 & 255) >> 2];
            bArr2[1 + i2] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, g1.a.f2438a));
        return sb.toString();
    }

    public abstract List d(List list, String str);

    public float h(View view) {
        if (f2758a) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f2758a = false;
            }
        }
        return view.getAlpha();
    }

    public void l(View view, float f2) {
        if (f2758a) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2758a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void m(View view, int i) {
        if (!f2760c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2759b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2760c = true;
        }
        Field field = f2759b;
        if (field != null) {
            try {
                f2759b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
