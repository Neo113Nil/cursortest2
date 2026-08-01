package c1;

import Q.j;
import Y0.s;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import b1.g;
import b1.k;
import com.fortunequest.neontrack.R;
import d1.AbstractC0093a;
import d1.AbstractC0095c;
import j1.l;
import j1.p;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k1.e;
import l.L0;
import l0.C0276c;
import l0.C0277d;
import p.C0297c;
import p0.v;
import s1.AbstractC0332o;
import s1.AbstractC0335s;
import s1.C0327j;
import s1.I;
import s1.J;
import w1.q;
import z1.f;
import z1.i;
import z1.n;
import z1.u;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0091d implements j {

    /* renamed from: a, reason: collision with root package name */
    public static long f2066a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2067b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2068c = true;

    public static void a(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.g(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b1.d e(b1.d dVar, b1.d dVar2, p pVar) {
        e.e(pVar, "<this>");
        if (pVar instanceof AbstractC0093a) {
            return ((AbstractC0093a) pVar).a(dVar, dVar2);
        }
        b1.j h = dVar2.h();
        return h == k.f2050a ? new C0089b(dVar2, dVar, pVar) : new C0090c(dVar2, h, pVar, dVar);
    }

    public static void f(Canvas canvas, String str, float f2, float f3, float f4, int i, int i2, Paint.Align align) {
        e.e(canvas, "canvas");
        e.e(str, "text");
        e.e(align, "align");
        Paint paint = new Paint(1);
        paint.setTextSize(f4);
        paint.setColor(i);
        paint.setTextAlign(align);
        paint.setMaskFilter(new BlurMaskFilter(0.15f * f4, BlurMaskFilter.Blur.NORMAL));
        Paint paint2 = new Paint(1);
        paint2.setTextSize(f4);
        paint2.setColor(i2);
        paint2.setTextAlign(align);
        canvas.drawText(str, f2, f3, paint);
        canvas.drawText(str, f2, f3, paint2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i g(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = s.f1516a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        f c2 = f.f4650b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        u m2 = g.m(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = A1.c.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = A1.c.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new i(m2, c2, list2, new K(3, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new i(m2, c2, list2, new K(3, list));
    }

    public static n h(String str) {
        e.e(str, "<this>");
        Matcher matcher = n.f4699c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        e.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        e.d(locale, "US");
        e.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        e.d(group2, "typeSubtype.group(2)");
        e.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = n.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                e.d(substring, "this as java.lang.String).substring(startIndex)");
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
                } else if (r1.l.C(group4, "'", false) && r1.l.x(group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    e.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new n(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final int i(Cursor cursor, String str) {
        String str2;
        e.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            e.d(columnNames, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str3 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                a(sb, str3, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            e.d(str2, "toString(...)");
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static Drawable j(Context context, int i) {
        return L0.b().c(context, i);
    }

    public static final int k(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static C0276c l(C0277d c0277d, SQLiteDatabase sQLiteDatabase) {
        e.e(c0277d, "refHolder");
        e.e(sQLiteDatabase, "sqLiteDatabase");
        C0276c c0276c = c0277d.f3513a;
        if (c0276c != null && e.a(c0276c.f3512a, sQLiteDatabase)) {
            return c0276c;
        }
        C0276c c0276c2 = new C0276c(sQLiteDatabase);
        c0277d.f3513a = c0276c2;
        return c0276c2;
    }

    public static b1.d m(b1.d dVar) {
        e.e(dVar, "<this>");
        AbstractC0095c abstractC0095c = dVar instanceof AbstractC0095c ? (AbstractC0095c) dVar : null;
        if (abstractC0095c == null) {
            return dVar;
        }
        b1.d dVar2 = abstractC0095c.f2475c;
        if (dVar2 != null) {
            return dVar2;
        }
        b1.j jVar = abstractC0095c.f2474b;
        e.b(jVar);
        b1.f fVar = (b1.f) jVar.p(b1.e.f2046a);
        b1.d fVar2 = fVar != null ? new w1.f((AbstractC0332o) fVar, abstractC0095c) : abstractC0095c;
        abstractC0095c.f2475c = fVar2;
        return fVar2;
    }

    public static boolean n() {
        boolean isEnabled;
        try {
            if (f2067b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2067b == null) {
                f2066a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2067b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2067b.invoke(null, Long.valueOf(f2066a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static String o(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        M1.i iVar = M1.i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        e.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        H1.d.k(encoded.length, 0, length);
        H1.l.r(length, encoded.length);
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        e.d(copyOfRange, "copyOfRange(...)");
        M1.i iVar2 = new M1.i(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        e.b(digest);
        new M1.i(digest);
        byte[] bArr = M1.a.f785a;
        e.e(bArr, "map");
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
        sb.append(new String(bArr2, r1.a.f3833a));
        return sb.toString();
    }

    public static final List r(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        Z0.c cVar = new Z0.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            e.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            e.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new i0.c(i, i2, string, string2));
        }
        cVar.f();
        cVar.f1535c = true;
        if (cVar.f1534b <= 0) {
            cVar = Z0.c.d;
        }
        e.e(cVar, "<this>");
        if (cVar.a() <= 1) {
            return Y0.j.D0(cVar);
        }
        Object[] array = cVar.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Y0.i.i0(array);
    }

    public static final i0.d s(C0276c c0276c, String str, boolean z2) {
        Cursor t2 = c0276c.t("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = t2.getColumnIndex("seqno");
            int columnIndex2 = t2.getColumnIndex("cid");
            int columnIndex3 = t2.getColumnIndex("name");
            int columnIndex4 = t2.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (t2.moveToNext()) {
                    if (t2.getInt(columnIndex2) >= 0) {
                        int i = t2.getInt(columnIndex);
                        String string = t2.getString(columnIndex3);
                        String str2 = t2.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        e.d(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                e.d(values, "columnsMap.values");
                List D02 = Y0.j.D0(values);
                Collection values2 = treeMap2.values();
                e.d(values2, "ordersMap.values");
                i0.d dVar = new i0.d(str, z2, D02, Y0.j.D0(values2));
                g.d(t2, null);
                return dVar;
            }
            g.d(t2, null);
            return null;
        } finally {
        }
    }

    public static final void t(View view, j0.f fVar) {
        e.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final Object u(q qVar, q qVar2, h0.b bVar) {
        Object c0327j;
        Object C2;
        I i;
        try {
            k1.k.a(bVar);
            c0327j = bVar.d(qVar2, qVar);
        } catch (Throwable th) {
            c0327j = new C0327j(th, false);
        }
        EnumC0088a enumC0088a = EnumC0088a.f2060a;
        if (c0327j == enumC0088a || (C2 = qVar.C(c0327j)) == AbstractC0335s.f4064c) {
            return enumC0088a;
        }
        if (C2 instanceof C0327j) {
            throw ((C0327j) C2).f4051a;
        }
        J j2 = C2 instanceof J ? (J) C2 : null;
        return (j2 == null || (i = j2.f4016a) == null) ? C2 : i;
    }

    public static void v(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f2068c) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2068c = false;
            }
        }
    }

    public abstract boolean b(p.g gVar, C0297c c0297c);

    public abstract boolean c(p.g gVar, Object obj, Object obj2);

    public abstract boolean d(p.g gVar, p.f fVar, p.f fVar2);

    public abstract void p(p.f fVar, p.f fVar2);

    public abstract void q(p.f fVar, Thread thread);
}
