package u0;

import D.I;
import D3.M;
import H1.C0130d;
import H5.AbstractC0141a;
import X5.A;
import X5.C0218b;
import X5.t;
import a.AbstractC0219a;
import a4.C0228a;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d4.AbstractC0319a;
import d4.C0320b;
import d4.C0323e;
import f5.C0387a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k.u0;
import k5.C0478h;
import k5.v;
import l5.AbstractC0505i;
import l5.C0512p;
import m1.AbstractC0521b;
import m5.C0526c;
import o4.C0560a;
import o5.InterfaceC0564d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q5.AbstractC0605a;
import q5.AbstractC0607c;
import s.AbstractC0622a;
import v.AbstractC0696a;
import v.C0698c;
import v.C0699d;
import v.C0700e;
import v.InterfaceC0697b;
import w4.C0722b;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;
import y4.C0763b;
import y4.C0765d;
import z4.C0774b;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0676f {
    public static final void a(Logger logger, a6.a aVar, a6.c cVar, String str) {
        logger.fine(cVar.f3167b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3160a);
    }

    public static void b(StringBuilder sb, Object obj, InterfaceC0743l interfaceC0743l) {
        if (interfaceC0743l != null) {
            sb.append((CharSequence) interfaceC0743l.invoke(obj));
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

    public static C0526c c(C0526c c0526c) {
        c0526c.f();
        c0526c.f5459h = true;
        return c0526c.f5458g > 0 ? c0526c : C0526c.f5456i;
    }

    public static final R5.f d(String str, A3.c cVar, R5.e[] eVarArr, InterfaceC0743l interfaceC0743l) {
        if (F5.j.T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (cVar.equals(R5.i.f2172b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        R5.a aVar = new R5.a(str);
        interfaceC0743l.invoke(aVar);
        return new R5.f(str, cVar, aVar.f2142b.size(), AbstractC0505i.M(eVarArr), aVar);
    }

    public static byte[] e(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final C0478h f(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new C0478h(exception);
    }

    public static final String g(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static ArrayList h(C0722b c0722b) {
        C0228a c0228a;
        ArrayList arrayList = new ArrayList();
        Iterator it = c0722b.f6197h.iterator();
        while (it.hasNext()) {
            C0765d c0765d = (C0765d) it.next();
            C0774b c0774b = c0765d.f6249h;
            String str = c0765d.f6251j;
            if (str.isEmpty()) {
                str = null;
            }
            C0387a c0387a = C0387a.f4248c;
            M m4 = new M(27);
            if (str == null) {
                str = null;
            }
            m4.w(AbstractC0521b.A(c0774b.f6341h));
            C0387a a7 = C0387a.a(m4.t(), str);
            Iterator it2 = c0765d.f6250i.iterator();
            while (it2.hasNext()) {
                y4.f fVar = (y4.f) it2.next();
                x4.h hVar = fVar.f6253h;
                String str2 = fVar.f6255j;
                String str3 = hVar.f6214h;
                int i7 = O4.a.f1777e;
                V3.a A6 = AbstractC0521b.A(hVar.f6216j);
                String str4 = hVar.f6215i;
                if (str4.isEmpty()) {
                    str4 = null;
                }
                if (str2 == null) {
                    str2 = null;
                }
                O4.a a8 = O4.a.a(str3, str4, str2, A6);
                for (C0763b c0763b : fVar.f6254i) {
                    long j4 = c0763b.f6237h;
                    long j7 = c0763b.f6238i;
                    byte b7 = (byte) (((byte) 1) | 2);
                    y4.h hVar2 = c0763b.f6239j;
                    b4.i[] values = b4.i.values();
                    int length = values.length;
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = length;
                        b4.i iVar = values[i8];
                        Iterator it3 = it;
                        Iterator it4 = it2;
                        if (iVar.f3619f == hVar2.f6282f) {
                            String str5 = c0763b.f6240k;
                            x4.b bVar = c0763b.f6241l;
                            V3.g b8 = bVar != null ? AbstractC0219a.b(bVar) : null;
                            V3.a A7 = AbstractC0521b.A(c0763b.f6242m);
                            String b9 = c0763b.f6245p.b();
                            String b10 = c0763b.f6246q.b();
                            C0323e c0323e = C0323e.f3952c[((byte) (c0763b.f6244o & 255)) & 255];
                            C0320b c0320b = AbstractC0319a.f3949a;
                            if (b10 != null) {
                                C0228a c0228a2 = C0228a.f3128f;
                                if (b10.length() == 16 && !"0000000000000000".contentEquals(b10)) {
                                    char[] cArr = a4.f.f3143a;
                                    int length2 = b10.length();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length2) {
                                            if (!a4.f.f3145c[b10.charAt(i10)]) {
                                                break;
                                            }
                                            i10++;
                                        } else if (b9 != null && b9.length() == 32 && !"00000000000000000000000000000000".contentEquals(b9)) {
                                            int length3 = b9.length();
                                            for (int i11 = 0; i11 < length3; i11++) {
                                                if (a4.f.f3145c[b9.charAt(i11)]) {
                                                }
                                            }
                                            c0228a = new C0228a(b9, b10, c0323e, c0320b, true);
                                        }
                                    }
                                }
                            }
                            c0228a = new C0228a("00000000000000000000000000000000", "0000000000000000", c0323e, c0320b, false);
                            C0228a c0228a3 = c0228a;
                            int size = A7.size() + c0763b.f6243n;
                            byte b11 = (byte) (b7 | 4);
                            String str6 = c0763b.f6247r;
                            if (b11 != 7) {
                                StringBuilder sb = new StringBuilder();
                                if ((b11 & 1) == 0) {
                                    sb.append(" timestampEpochNanos");
                                }
                                if ((b11 & 2) == 0) {
                                    sb.append(" observedTimestampEpochNanos");
                                }
                                if ((b11 & 4) == 0) {
                                    sb.append(" totalAttributeCount");
                                }
                                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
                            }
                            arrayList.add(new C0560a(a7, a8, j4, j7, c0228a3, iVar, str5, size, A7, b8, str6));
                            it = it3;
                            it2 = it4;
                        } else {
                            i8++;
                            length = i9;
                            it = it3;
                            it2 = it4;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return arrayList;
    }

    public static X5.m i(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        X5.f b7 = X5.f.f2908b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        A.f2869g.getClass();
        A c7 = C0218b.c(protocol);
        try {
            obj = Y5.e.j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = C0512p.f5303f;
        }
        return new X5.m(c7, b7, Y5.e.j(sSLSession.getLocalCertificates()), new X5.l(1, obj));
    }

    public static float j(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return I.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static String k(int i7) {
        switch (i7) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 9:
            case 11:
            case 12:
            default:
                return W4.o.c("unknown status code: ", i7);
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static V.c l(J1.c refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.i.e(refHolder, "refHolder");
        V.c cVar = (V.c) refHolder.f1289g;
        if (cVar != null && cVar.f2682f.equals(sQLiteDatabase)) {
            return cVar;
        }
        V.c cVar2 = new V.c(sQLiteDatabase);
        refHolder.f1289g = cVar2;
        return cVar2;
    }

    public static InterfaceC0564d m(InterfaceC0564d interfaceC0564d) {
        InterfaceC0564d intercepted;
        kotlin.jvm.internal.i.e(interfaceC0564d, "<this>");
        AbstractC0607c abstractC0607c = interfaceC0564d instanceof AbstractC0607c ? (AbstractC0607c) interfaceC0564d : null;
        return (abstractC0607c == null || (intercepted = abstractC0607c.intercepted()) == null) ? interfaceC0564d : intercepted;
    }

    public static List n(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static float o(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return I.d.c(edgeEffect, f7, f8);
        }
        I.c.a(edgeEffect, f7, f8);
        return f7;
    }

    public static D1.b p(String statusLine) {
        t tVar;
        int i7;
        String str;
        kotlin.jvm.internal.i.e(statusLine, "statusLine");
        if (F5.q.I(statusLine, "HTTP/1.")) {
            i7 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                tVar = t.f3037h;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                tVar = t.f3038i;
            }
        } else if (F5.q.I(statusLine, "ICY ")) {
            tVar = t.f3037h;
            i7 = 4;
        } else {
            if (!F5.q.I(statusLine, "SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            tVar = t.f3038i;
            i7 = 12;
        }
        int i8 = i7 + 3;
        if (statusLine.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i7, i8);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        Integer J3 = F5.q.J(substring);
        if (J3 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = J3.intValue();
        if (statusLine.length() <= i8) {
            str = "";
        } else {
            if (statusLine.charAt(i8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i7 + 4);
            kotlin.jvm.internal.i.d(str, "substring(...)");
        }
        return new D1.b(tVar, intValue, str);
    }

    public static InterfaceC0697b q(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            u(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0622a.f5862a);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                u(xmlResourceParser);
            }
            return new C0700e(new A.e(string, string2, string3, r(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0622a.f5863b);
                    int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z5 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i9 = obtainAttributes2.getInt(i8, 0);
                    int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                    String string6 = obtainAttributes2.getString(i10);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        u(xmlResourceParser);
                    }
                    arrayList.add(new C0699d(i7, i9, resourceId2, string6, string5, z5));
                } else {
                    u(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0698c((C0699d[]) arrayList.toArray(new C0699d[0]));
    }

    public static List r(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0696a.a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void s(Window window, boolean z5) {
        if (Build.VERSION.SDK_INT >= 30) {
            I.a(window, z5);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void t(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        u0 u0Var = u0.f5120j;
        if (u0Var != null && u0Var.f5122a == view) {
            u0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new u0(view, charSequence);
            return;
        }
        u0 u0Var2 = u0.f5121k;
        if (u0Var2 != null && u0Var2.f5122a == view) {
            u0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void u(XmlPullParser xmlPullParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(InterfaceC0747p interfaceC0747p, AbstractC0141a abstractC0141a, AbstractC0141a abstractC0141a2) {
        try {
            M5.a.h(v.f5219a, m(((AbstractC0605a) interfaceC0747p).create(abstractC0141a, abstractC0141a2)));
        } catch (Throwable th) {
            abstractC0141a2.resumeWith(f(th));
            throw th;
        }
    }

    public static final void w(Object obj) {
        if (obj instanceof C0478h) {
            throw ((C0478h) obj).f5200f;
        }
    }

    public static byte[] x(C0130d c0130d) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i7 = 0;
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i8 = 0;
            while (i8 < min2) {
                int read = c0130d.read(bArr, i8, min2 - i8);
                if (read == -1) {
                    return e(arrayDeque, i7);
                }
                i8 += read;
                i7 += read;
            }
            long j4 = min * (min < 4096 ? 4 : 2);
            min = j4 > 2147483647L ? Integer.MAX_VALUE : j4 < -2147483648L ? Integer.MIN_VALUE : (int) j4;
        }
        if (c0130d.read() == -1) {
            return e(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
