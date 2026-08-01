package k0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
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
import p.C0265c;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2805a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2806b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2807c;

    public static z1.e a() {
        z1.e eVar = z1.e.f4264l;
        b1.d.b(eVar);
        z1.e eVar2 = eVar.f4266f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            z1.e.i.await(z1.e.f4262j, TimeUnit.MILLISECONDS);
            z1.e eVar3 = z1.e.f4264l;
            b1.d.b(eVar3);
            if (eVar3.f4266f != null || System.nanoTime() - nanoTime < z1.e.f4263k) {
                return null;
            }
            return z1.e.f4264l;
        }
        long nanoTime2 = eVar2.f4267g - System.nanoTime();
        if (nanoTime2 > 0) {
            z1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        z1.e eVar4 = z1.e.f4264l;
        b1.d.b(eVar4);
        eVar4.f4266f = eVar2.f4266f;
        eVar2.f4266f = null;
        return eVar2;
    }

    public static void b(long j2, z1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        z1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((z1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        z1.i iVar = (z1.i) arrayList.get(i2);
        z1.i iVar2 = (z1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            z1.i iVar3 = (z1.i) arrayList.get(i11);
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
            long j4 = (fVar.f4269b / j3) + j2 + 2 + i12 + 1;
            fVar.w(-i12);
            fVar.w(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.w(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((z1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.w(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                z1.f fVar3 = new z1.f();
                fVar.w(((int) ((fVar3.f4269b / j3) + j4)) * (-1));
                b(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.t(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((z1.i) arrayList.get(i16 - 1)).d(i8) != ((z1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f4269b / j5) + j2 + 2 + (i15 * 2);
        fVar.w(i15);
        fVar.w(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d = ((z1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d != ((z1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.w(d & 255);
            }
        }
        z1.f fVar4 = new z1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d2 = ((z1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d2 != ((z1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((z1.i) arrayList.get(i18)).a()) {
                fVar.w(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.w(((int) ((fVar4.f4269b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                b(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.t(fVar4);
    }

    public static View g(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m1.j h(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = T0.q.f844a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        m1.f c2 = m1.f.f3172b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        m1.w h = w.h(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = n1.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = n1.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new m1.j(h, c2, list2, new androidx.lifecycle.I(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new m1.j(h, c2, list2, new androidx.lifecycle.I(1, list));
    }

    public static m1.o i(String str) {
        b1.d.e(str, "<this>");
        Matcher matcher = m1.o.f3222c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        b1.d.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        b1.d.d(locale, "US");
        b1.d.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        b1.d.d(group2, "typeSubtype.group(2)");
        b1.d.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = m1.o.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                b1.d.d(substring, "this as java.lang.String).substring(startIndex)");
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
                } else if (i1.l.w0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    b1.d.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new m1.o(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final boolean k(String str) {
        b1.d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String l(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        z1.i iVar = z1.i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        b1.d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        w.d(encoded.length, 0, length);
        byte[] t02 = T0.g.t0(0, length, encoded);
        z1.i iVar2 = new z1.i(t02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(t02, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        b1.d.b(digest);
        new z1.i(digest);
        byte[] bArr = z1.a.f4255a;
        b1.d.e(bArr, "map");
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
        sb.append(new String(bArr2, i1.a.f2499a));
        return sb.toString();
    }

    public abstract boolean c(p.g gVar, C0265c c0265c);

    public abstract boolean d(p.g gVar, Object obj, Object obj2);

    public abstract boolean e(p.g gVar, p.f fVar, p.f fVar2);

    public abstract List f(List list, String str);

    public float j(View view) {
        if (f2805a) {
            try {
                return y.a(view);
            } catch (NoSuchMethodError unused) {
                f2805a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void m(p.f fVar, p.f fVar2);

    public abstract void n(p.f fVar, Thread thread);

    public void o(View view, float f2) {
        if (f2805a) {
            try {
                y.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2805a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void p(View view, int i) {
        if (!f2807c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2806b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2807c = true;
        }
        Field field = f2806b;
        if (field != null) {
            try {
                f2806b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
