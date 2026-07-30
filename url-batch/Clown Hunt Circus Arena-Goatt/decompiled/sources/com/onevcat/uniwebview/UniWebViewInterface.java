package com.onevcat.uniwebview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.A1;
import com.onevcat.uniwebview.internal.obfuscated.A2;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0045e;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0125x0;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.B1;
import com.onevcat.uniwebview.internal.obfuscated.B2;
import com.onevcat.uniwebview.internal.obfuscated.C0027a1;
import com.onevcat.uniwebview.internal.obfuscated.C0028a2;
import com.onevcat.uniwebview.internal.obfuscated.C0029a3;
import com.onevcat.uniwebview.internal.obfuscated.C0032b1;
import com.onevcat.uniwebview.internal.obfuscated.C0033b2;
import com.onevcat.uniwebview.internal.obfuscated.C0034b3;
import com.onevcat.uniwebview.internal.obfuscated.C0037c1;
import com.onevcat.uniwebview.internal.obfuscated.C0038c2;
import com.onevcat.uniwebview.internal.obfuscated.C0039c3;
import com.onevcat.uniwebview.internal.obfuscated.C0042d1;
import com.onevcat.uniwebview.internal.obfuscated.C0043d2;
import com.onevcat.uniwebview.internal.obfuscated.C0044d3;
import com.onevcat.uniwebview.internal.obfuscated.C0047e1;
import com.onevcat.uniwebview.internal.obfuscated.C0048e2;
import com.onevcat.uniwebview.internal.obfuscated.C0049e3;
import com.onevcat.uniwebview.internal.obfuscated.C0052f1;
import com.onevcat.uniwebview.internal.obfuscated.C0053f2;
import com.onevcat.uniwebview.internal.obfuscated.C0054f3;
import com.onevcat.uniwebview.internal.obfuscated.C0055g;
import com.onevcat.uniwebview.internal.obfuscated.C0056g0;
import com.onevcat.uniwebview.internal.obfuscated.C0057g1;
import com.onevcat.uniwebview.internal.obfuscated.C0058g2;
import com.onevcat.uniwebview.internal.obfuscated.C0059g3;
import com.onevcat.uniwebview.internal.obfuscated.C0062h1;
import com.onevcat.uniwebview.internal.obfuscated.C0063h2;
import com.onevcat.uniwebview.internal.obfuscated.C0064h3;
import com.onevcat.uniwebview.internal.obfuscated.C0067i1;
import com.onevcat.uniwebview.internal.obfuscated.C0068i2;
import com.onevcat.uniwebview.internal.obfuscated.C0071j1;
import com.onevcat.uniwebview.internal.obfuscated.C0072j2;
import com.onevcat.uniwebview.internal.obfuscated.C0075k1;
import com.onevcat.uniwebview.internal.obfuscated.C0076k2;
import com.onevcat.uniwebview.internal.obfuscated.C0079l1;
import com.onevcat.uniwebview.internal.obfuscated.C0080l2;
import com.onevcat.uniwebview.internal.obfuscated.C0083m1;
import com.onevcat.uniwebview.internal.obfuscated.C0084m2;
import com.onevcat.uniwebview.internal.obfuscated.C0087n1;
import com.onevcat.uniwebview.internal.obfuscated.C0088n2;
import com.onevcat.uniwebview.internal.obfuscated.C0091o1;
import com.onevcat.uniwebview.internal.obfuscated.C0092o2;
import com.onevcat.uniwebview.internal.obfuscated.C0096p2;
import com.onevcat.uniwebview.internal.obfuscated.C0099q1;
import com.onevcat.uniwebview.internal.obfuscated.C0100q2;
import com.onevcat.uniwebview.internal.obfuscated.C0102r1;
import com.onevcat.uniwebview.internal.obfuscated.C0103r2;
import com.onevcat.uniwebview.internal.obfuscated.C0106s1;
import com.onevcat.uniwebview.internal.obfuscated.C0107s2;
import com.onevcat.uniwebview.internal.obfuscated.C0110t1;
import com.onevcat.uniwebview.internal.obfuscated.C0111t2;
import com.onevcat.uniwebview.internal.obfuscated.C0115u2;
import com.onevcat.uniwebview.internal.obfuscated.C0118v1;
import com.onevcat.uniwebview.internal.obfuscated.C0119v2;
import com.onevcat.uniwebview.internal.obfuscated.C0122w1;
import com.onevcat.uniwebview.internal.obfuscated.C0123w2;
import com.onevcat.uniwebview.internal.obfuscated.C0126x1;
import com.onevcat.uniwebview.internal.obfuscated.C0127x2;
import com.onevcat.uniwebview.internal.obfuscated.C0130y1;
import com.onevcat.uniwebview.internal.obfuscated.C0131y2;
import com.onevcat.uniwebview.internal.obfuscated.C0134z1;
import com.onevcat.uniwebview.internal.obfuscated.C0135z2;
import com.onevcat.uniwebview.internal.obfuscated.C1;
import com.onevcat.uniwebview.internal.obfuscated.C2;
import com.onevcat.uniwebview.internal.obfuscated.D0;
import com.onevcat.uniwebview.internal.obfuscated.D1;
import com.onevcat.uniwebview.internal.obfuscated.D2;
import com.onevcat.uniwebview.internal.obfuscated.E0;
import com.onevcat.uniwebview.internal.obfuscated.E2;
import com.onevcat.uniwebview.internal.obfuscated.F0;
import com.onevcat.uniwebview.internal.obfuscated.F2;
import com.onevcat.uniwebview.internal.obfuscated.G0;
import com.onevcat.uniwebview.internal.obfuscated.G1;
import com.onevcat.uniwebview.internal.obfuscated.G2;
import com.onevcat.uniwebview.internal.obfuscated.H0;
import com.onevcat.uniwebview.internal.obfuscated.H1;
import com.onevcat.uniwebview.internal.obfuscated.H2;
import com.onevcat.uniwebview.internal.obfuscated.I0;
import com.onevcat.uniwebview.internal.obfuscated.I1;
import com.onevcat.uniwebview.internal.obfuscated.I2;
import com.onevcat.uniwebview.internal.obfuscated.J0;
import com.onevcat.uniwebview.internal.obfuscated.J1;
import com.onevcat.uniwebview.internal.obfuscated.J2;
import com.onevcat.uniwebview.internal.obfuscated.K0;
import com.onevcat.uniwebview.internal.obfuscated.K1;
import com.onevcat.uniwebview.internal.obfuscated.K2;
import com.onevcat.uniwebview.internal.obfuscated.L;
import com.onevcat.uniwebview.internal.obfuscated.L0;
import com.onevcat.uniwebview.internal.obfuscated.L1;
import com.onevcat.uniwebview.internal.obfuscated.L2;
import com.onevcat.uniwebview.internal.obfuscated.M0;
import com.onevcat.uniwebview.internal.obfuscated.M1;
import com.onevcat.uniwebview.internal.obfuscated.M2;
import com.onevcat.uniwebview.internal.obfuscated.N0;
import com.onevcat.uniwebview.internal.obfuscated.N1;
import com.onevcat.uniwebview.internal.obfuscated.N2;
import com.onevcat.uniwebview.internal.obfuscated.O0;
import com.onevcat.uniwebview.internal.obfuscated.O1;
import com.onevcat.uniwebview.internal.obfuscated.O2;
import com.onevcat.uniwebview.internal.obfuscated.P0;
import com.onevcat.uniwebview.internal.obfuscated.P1;
import com.onevcat.uniwebview.internal.obfuscated.P2;
import com.onevcat.uniwebview.internal.obfuscated.Q0;
import com.onevcat.uniwebview.internal.obfuscated.Q1;
import com.onevcat.uniwebview.internal.obfuscated.Q2;
import com.onevcat.uniwebview.internal.obfuscated.R0;
import com.onevcat.uniwebview.internal.obfuscated.R1;
import com.onevcat.uniwebview.internal.obfuscated.R2;
import com.onevcat.uniwebview.internal.obfuscated.S0;
import com.onevcat.uniwebview.internal.obfuscated.S1;
import com.onevcat.uniwebview.internal.obfuscated.S2;
import com.onevcat.uniwebview.internal.obfuscated.T0;
import com.onevcat.uniwebview.internal.obfuscated.T1;
import com.onevcat.uniwebview.internal.obfuscated.T2;
import com.onevcat.uniwebview.internal.obfuscated.U0;
import com.onevcat.uniwebview.internal.obfuscated.U1;
import com.onevcat.uniwebview.internal.obfuscated.U2;
import com.onevcat.uniwebview.internal.obfuscated.V0;
import com.onevcat.uniwebview.internal.obfuscated.V1;
import com.onevcat.uniwebview.internal.obfuscated.V2;
import com.onevcat.uniwebview.internal.obfuscated.W0;
import com.onevcat.uniwebview.internal.obfuscated.W1;
import com.onevcat.uniwebview.internal.obfuscated.W2;
import com.onevcat.uniwebview.internal.obfuscated.X0;
import com.onevcat.uniwebview.internal.obfuscated.X1;
import com.onevcat.uniwebview.internal.obfuscated.X2;
import com.onevcat.uniwebview.internal.obfuscated.Y0;
import com.onevcat.uniwebview.internal.obfuscated.Y1;
import com.onevcat.uniwebview.internal.obfuscated.Y2;
import com.onevcat.uniwebview.internal.obfuscated.Z0;
import com.onevcat.uniwebview.internal.obfuscated.Z1;
import com.onevcat.uniwebview.internal.obfuscated.Z2;
import com.onevcat.uniwebview.internal.obfuscated.i3;
import com.onevcat.uniwebview.internal.obfuscated.j3;
import com.onevcat.uniwebview.internal.obfuscated.k3;
import com.onevcat.uniwebview.internal.obfuscated.l3;
import com.onevcat.uniwebview.internal.obfuscated.m3;
import com.onevcat.uniwebview.internal.obfuscated.n3;
import com.onevcat.uniwebview.internal.obfuscated.o3;
import com.onevcat.uniwebview.internal.obfuscated.p3;
import com.onevcat.uniwebview.internal.obfuscated.v3;
import com.unity3d.player.UnityPlayer;
import java.io.ByteArrayOutputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewInterface;", "", "<init>", "()V", "Companion", "com/onevcat/uniwebview/internal/obfuscated/p3", "uniwebview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UniWebViewInterface {
    public static final p3 Companion = new p3();
    public static final long RUN_SYNC_WAIT_TIME_MS = 5000;
    private static UniWebViewNativeChannel channel;

    @JvmStatic
    public static final void addJavaScript(String str, String str2, String identifier) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface addJavaScript to: ", str, b, "message"));
        p3.a(str, new F0(str2, identifier));
    }

    @JvmStatic
    public static final void addPermissionTrustDomain(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "domain");
        B b = B.b;
        String message = L.a("Interface addPermissionTrustDomain: ", str, ", domain: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new G0(str2));
    }

    @Deprecated(message = "Use addSslPinnedFingerprint instead.")
    @JvmStatic
    public static final void addSslExceptionDomain(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "domain");
        B b = B.b;
        String message = L.a("Interface addSslExceptionDomain: ", str, ", domain: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new H0(str2));
    }

    @JvmStatic
    public static final void addSslPinnedFingerprint(String str, String str2, String fingerprint) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        B b = B.b;
        String message = L.a("Interface addSslPinnedFingerprint: ", str, ", domain: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new I0(str2, fingerprint));
    }

    @JvmStatic
    public static final void addUrlScheme(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "scheme");
        B b = B.b;
        String message = L.a("Interface addUrlScheme: ", str, ", scheme: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new J0(str2));
    }

    @JvmStatic
    public static final boolean animateTo(String str, int i, int i2, int i3, int i4, float f, float f2, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "identifier");
        B b = B.b;
        String message = "Interface animateTo: {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        Boolean bool = (Boolean) p3.c(str, new K0(i, i2, i3, i4, f, f2, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void authenticationInit(String str, String str2, String scheme) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, ImagesContract.URL);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        B b = B.b;
        String message = "Interface authenticationInit: " + str + ", url: " + str2 + ", scheme: " + scheme;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new L0(str, str2, scheme));
    }

    @JvmStatic
    public static final void authenticationSetPrivateMode(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface authenticationSetPrivateMode: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new M0(name, z));
    }

    @JvmStatic
    public static final void authenticationStart(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface authenticationStart: ", name, b, "message"));
        p3.a(new N0(name));
    }

    @JvmStatic
    public static final void bringContentToFront(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        p3.a(name, O0.a);
    }

    @JvmStatic
    public static final boolean canGoBack(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface canGoBack: ", name, b, "message"));
        Boolean bool = (Boolean) p3.c(name, P0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean canGoForward(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface canGoForward: ", name, b, "message"));
        Boolean bool = (Boolean) p3.c(name, Q0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void captureSnapshot(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = L.a("Interface captureSnapshot: ", name, ". File name: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new R0(str));
    }

    @JvmStatic
    public static final void cleanCache(String str, boolean z, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "identifier");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface cleanCache: ", str, b, "message"));
        p3.a(str, new S0(str2, z));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void clearCookies() {
        Companion.getClass();
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface clearCookies", "message");
        b.a(A.INFO, "Interface clearCookies");
        AbstractC0125x0.a();
    }

    @JvmStatic
    public static final void clearCookiesAsync(String str) {
        Companion.getClass();
        p3.a(str);
    }

    @JvmStatic
    public static final void clearHttpAuthUsernamePassword(String str, String str2) {
        D0.a(Companion, str, "host", str2, "realm");
        B b = B.b;
        String message = L.a("Interface clearHttpAuthUsernamePassword. Host: ", str, ", realm: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new T0(str, str2));
    }

    @JvmStatic
    public static final void closeAllPopupWindows(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface closeAllPopupWindows: ", name, b, "message"));
        p3.a(name, U0.a);
    }

    @JvmStatic
    public static final void closePopupWindow(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "popupId");
        B b = B.b;
        String message = L.a("Interface closePopupWindow: ", str, ", popup: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new V0(str2));
    }

    @JvmStatic
    public static final String copyBackForwardList(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface copyBackForwardList: ", name, b, "message"));
        String str = (String) p3.c(name, W0.a);
        return str == null ? "{}" : str;
    }

    @JvmStatic
    public static final void destroy(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface destroy web view: ", name, b, "message"));
        p3.a(name, X0.a);
    }

    @JvmStatic
    public static final void evaluateJavaScript(String str, String str2, String identifier) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface evaluateJavaScript in: ", str, b, "message"));
        p3.a(str, new Y0(str2, identifier));
    }

    @JvmStatic
    public static final void evaluateJavaScriptInPopupWindow(String str, String str2, String jsString, String identifier) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "popupId");
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        String message = L.a("Interface evaluateJavaScriptInPopupWindow: ", str, ", popup: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new Z0(str2, jsString, identifier, str));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final String getCookie(String str, String str2) {
        D0.a(Companion, str, ImagesContract.URL, str2, "key");
        B b = B.b;
        String message = L.a("Interface getCookie from: ", str, " | key: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        return AbstractC0125x0.a(str, str2);
    }

    @JvmStatic
    public static final void getCookieAsync(String str, String str2, String identifier) {
        D0.a(Companion, str, ImagesContract.URL, str2, "key");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        String message = "getCookieAsync: " + str + " | key: " + str2 + ", identifier: " + identifier;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new C0056g0(new v3(identifier, "0", AbstractC0125x0.a(str, str2), null)));
    }

    @JvmStatic
    public static final byte[] getRenderedData(String name, int i, int i2, int i3, int i4) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0055g c0055g = C0055g.b;
        c0055g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        d dVar = (d) c0055g.a.get(name);
        if (dVar != null && (byteArrayOutputStream = dVar.m) != null) {
            byteArrayOutputStream.reset();
            Bitmap bitmap = dVar.n;
            if (bitmap != null) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Exception e) {
                    B b = B.b;
                    String message = "Creating snapshot buffer exception: " + e;
                    b.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    b.a(A.CRITICAL, message);
                }
                p3.a(name, new C0027a1((i != -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2)));
                return bArr;
            }
        }
        bArr = null;
        p3.a(name, new C0027a1((i != -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2)));
        return bArr;
    }

    @JvmStatic
    public static final String getSafeBrowsingCustomTabsProviderPackageName() {
        Companion.getClass();
        return (String) p3.c(C0032b1.a);
    }

    @JvmStatic
    public static final int getStatusBarHeight() {
        Companion.getClass();
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface getStatusBarHeight", "message");
        b.a(A.INFO, "Interface getStatusBarHeight");
        Integer num = (Integer) p3.c(C0037c1.a);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @JvmStatic
    public static final String getUrl(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface getUrl: ", name, b, "message"));
        String str = (String) p3.c(name, C0042d1.a);
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final String getUserAgent(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface getUserAgent: ", name, b, "message"));
        String str = (String) p3.c(name, C0047e1.a);
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final float getWebViewAlpha(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface getWebViewAlpha: ", name, b, "message"));
        Float f = (Float) p3.c(name, C0052f1.a);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @JvmStatic
    public static final void goBack(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface goBack: ", name, b, "message"));
        p3.a(name, C0057g1.a);
    }

    @JvmStatic
    public static final void goBackPopupWindow(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "popupId");
        B b = B.b;
        String message = L.a("Interface goBackPopupWindow: ", str, ", popup: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C0062h1(str2));
    }

    @JvmStatic
    public static final void goForward(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface goForward: ", name, b, "message"));
        p3.a(name, C0067i1.a);
    }

    @JvmStatic
    public static final void goForwardPopupWindow(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "popupId");
        B b = B.b;
        String message = L.a("Interface goForwardPopupWindow: ", str, ", popup: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C0071j1(str2));
    }

    @JvmStatic
    public static final void goToIndexInBackForwardList(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface goToIndexInBackForwardList: " + name + ", index: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0075k1(i));
    }

    @JvmStatic
    public static final boolean hide(String str, boolean z, int i, float f, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "identifier");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface hide", "message");
        b.a(A.INFO, "Interface hide");
        Boolean bool = (Boolean) p3.c(str, new C0079l1(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void hideAsync(String str, boolean z, int i, float f, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "identifier");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface hideAsync", "message");
        b.a(A.INFO, "Interface hideAsync");
        p3.a(str, new C0083m1(z, i, f, str2));
    }

    @JvmStatic
    public static final void hideSpinner(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface hideSpinner: ", name, b, "message"));
        p3.a(name, C0087n1.a);
    }

    @JvmStatic
    public static final void init(String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface init: ", name, b, "message"));
        p3.a(new C0091o1(name, i, i2, i3, i4));
    }

    @JvmStatic
    public static final boolean isAuthenticationIsSupported() {
        Companion.getClass();
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface authenticationIsSupported.", "message");
        b.a(A.INFO, "Interface authenticationIsSupported.");
        Boolean bool = (Boolean) p3.c(C0099q1.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isSafeBrowsingSupported() {
        Companion.getClass();
        Boolean bool = (Boolean) p3.c(C0099q1.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isWebViewSupported() {
        Companion.getClass();
        Boolean bool = (Boolean) p3.c(C0102r1.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void load(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = L.a("Interface load: ", name, ", url: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0106s1(str));
    }

    @JvmStatic
    public static final void loadHTMLString(String name, String str, String str2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface loadHTMLString", "message");
        b.a(A.INFO, "Interface loadHTMLString");
        p3.a(name, new C0110t1(str, str2));
    }

    @JvmStatic
    public static final void prepare() {
        Companion.getClass();
        p3.c(C0118v1.a);
    }

    @JvmStatic
    public static final void print(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface print: ", name, b, "message"));
        p3.a(name, C0122w1.a);
    }

    @JvmStatic
    public static final void refreshTransparencyClickingThroughLayout(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface refreshTransparencyClickingThroughLayout: ", name, b, "message"));
        p3.a(name, C0126x1.a);
    }

    @JvmStatic
    public static final void registerChannel(UniWebViewNativeChannel channel2) {
        p3 p3Var = Companion;
        p3Var.getClass();
        Intrinsics.checkNotNullParameter(channel2, "channel");
        p3.a(new C0130y1(p3Var, channel2));
    }

    @JvmStatic
    public static final void reload(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface reload: ", name, b, "message"));
        p3.a(name, C0134z1.a);
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void removeCookie(String str, String str2) {
        D0.a(Companion, str, ImagesContract.URL, str2, "key");
        B b = B.b;
        String message = L.a("Interface removeCookie: ", str, ", key: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        AbstractC0125x0.b(str, str2);
    }

    @JvmStatic
    public static final void removeCookieAsync(String str, String str2, String identifier) {
        D0.a(Companion, str, ImagesContract.URL, str2, "key");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        String message = "Interface removeCookieAsync for " + str + ", key: " + str2 + ", identifier: " + identifier;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        AbstractC0125x0.b(str, str2);
        p3.a(new C0056g0(new v3(identifier, "0", "", null)));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void removeCookies(String url) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface remove cookies for: ", url, b, "message"));
        Intrinsics.checkNotNullParameter(url, "url");
        AbstractC0125x0.b(url, null);
    }

    @JvmStatic
    public static final void removeCookiesAsync(String url, String str) {
        D0.a(Companion, url, ImagesContract.URL, str, "identifier");
        B b = B.b;
        String message = L.a("Interface removeCookiesAsync for: ", url, ", identifier: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        Intrinsics.checkNotNullParameter(url, "url");
        AbstractC0125x0.b(url, null);
        p3.a(new C0056g0(new v3(str, "0", "", null)));
    }

    @JvmStatic
    public static final void removePermissionTrustDomain(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "domain");
        B b = B.b;
        String message = L.a("Interface removePermissionTrustDomain: ", str, ", domain: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new A1(str2));
    }

    @Deprecated(message = "Use removeSslPinnedFingerprint instead.")
    @JvmStatic
    public static final void removeSslExceptionDomain(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "domain");
        B b = B.b;
        String message = L.a("Interface removeSslExceptionDomain: ", str, ", domain: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new B1(str2));
    }

    @JvmStatic
    public static final void removeSslPinnedFingerprint(String str, String str2, String fingerprint) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        B b = B.b;
        String message = L.a("Interface removeSslPinnedFingerprint: ", str, ", domain: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C1(str2, fingerprint));
    }

    @JvmStatic
    public static final void removeUrlScheme(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "scheme");
        B b = B.b;
        String message = L.a("Interface removeUrlScheme: ", str, ", scheme: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new D1(str2));
    }

    @JvmStatic
    public static final void safeBrowsingChangeUrl(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = L.a("Interface safeBrowsingChangeUrl: ", name, ", url: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new G1(name, str));
    }

    @JvmStatic
    public static final void safeBrowsingInit(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = L.a("Interface safeBrowsingInit: ", name, ", url: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new H1(str, name));
    }

    @JvmStatic
    public static final void safeBrowsingInvalidate(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface safeBrowsingInvalidate: ", name, b, "message"));
        p3.a(new I1(name));
    }

    @JvmStatic
    public static final void safeBrowsingSetBackgroundInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetBackgroundInteractionEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new J1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetBookmarksButtonEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetBookmarksButtonEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new K1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetColorScheme(String name, int i) {
        int i2;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Ref.IntRef intRef = new Ref.IntRef();
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    B b = B.b;
                    String message = "safeBrowsingSetColorScheme invalid " + i;
                    b.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    b.a(A.CRITICAL, message);
                }
            }
            intRef.element = i2;
            B b2 = B.b;
            String message2 = "Interface safeBrowsingSetColorScheme: " + name + ", color scheme " + i + " converted to " + intRef.element;
            b2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            b2.a(A.INFO, message2);
            p3.a(new L1(name, intRef));
        }
        i2 = 0;
        intRef.element = i2;
        B b22 = B.b;
        String message22 = "Interface safeBrowsingSetColorScheme: " + name + ", color scheme " + i + " converted to " + intRef.element;
        b22.getClass();
        Intrinsics.checkNotNullParameter(message22, "message");
        b22.a(A.INFO, message22);
        p3.a(new L1(name, intRef));
    }

    @JvmStatic
    public static final void safeBrowsingSetDownloadButtonEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetDownloadButtonEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new M1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetInitialHeightPx(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetInitialHeightPx: " + name + ", initialHeightPx: " + i + ", resizeBehavior: " + i2;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new N1(name, i, i2));
    }

    @JvmStatic
    public static final void safeBrowsingSetInitialWidthPx(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetInitialWidthPx: " + name + ", initialWidthPx: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new O1(name, i));
    }

    @JvmStatic
    public static final void safeBrowsingSetMaximizationEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetMaximizationEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new P1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetNavigationBarColor(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetNavigationBarColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new Q1(name, f, f2, f3));
    }

    @JvmStatic
    public static final void safeBrowsingSetNavigationBarDividerColor(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetNavigationBarDividerColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new R1(name, f, f2, f3));
    }

    @JvmStatic
    public static final void safeBrowsingSetPrefetch(String name, boolean z, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetPrefetch: " + name + ", enabled: " + z + " with " + str;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new S1(name, z, str));
    }

    @JvmStatic
    public static final void safeBrowsingSetSecondaryToolbarColor(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetSecondaryToolbarColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new T1(name, f, f2, f3));
    }

    @JvmStatic
    public static final void safeBrowsingSetSendToExternalDefaultHandlerEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetSendToExternalDefaultHandlerEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new U1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetShareMenuItemEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetShareMenuItemEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new V1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetToolbarColor(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface safeBrowsingSetToolbarColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new W1(name, f, f2, f3));
    }

    @JvmStatic
    public static final void safeBrowsingSetToolbarCornerRadiusDp(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setToolbarCornerRadiusDp: " + name + ", cornerRadiusDp: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new X1(name, i));
    }

    @JvmStatic
    public static final void safeBrowsingSetUrlBarHidingEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetUrlBarHidingEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new Y1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingSetWarmup(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface safeBrowsingSetWarmup: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new Z1(name, z));
    }

    @JvmStatic
    public static final void safeBrowsingShow(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface safeBrowsingShow: ", name, b, "message"));
        p3.a(new C0028a2(name));
    }

    @JvmStatic
    public static final float screenHeight() {
        Companion.getClass();
        return UnityPlayer.currentActivity.findViewById(android.R.id.content).getHeight();
    }

    @JvmStatic
    public static final float screenWidth() {
        Companion.getClass();
        return UnityPlayer.currentActivity.findViewById(android.R.id.content).getWidth();
    }

    @JvmStatic
    public static final void scrollTo(String name, int i, int i2, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface scrollTo: " + name + ", {" + i + ", " + i2 + "}, animated: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0033b2(i, i2, z));
    }

    @JvmStatic
    public static final void setAcceptThirdPartyCookies(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAcceptThirdPartyCookies: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0038c2(z));
    }

    @JvmStatic
    public static final void setAllowAutoPlay(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setAllowAutoPlay: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new C0043d2(z));
    }

    @JvmStatic
    public static final void setAllowFileAccess(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAllowFileAccess: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0048e2(z));
    }

    @JvmStatic
    public static final void setAllowFileAccessFromFileURLs(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAllowFileAccessFromFileURLs: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0053f2(z));
    }

    @JvmStatic
    public static final void setAllowHTTPAuthPopUpWindow(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAllowHTTPAuthPopUpWindow: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0058g2(z));
    }

    @JvmStatic
    public static final void setAllowJavaScriptOpenWindow(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setAllowJavaScriptOpenWindow: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new C0063h2(z));
    }

    @JvmStatic
    public static final void setAllowUniversalAccessFromFileURLs(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setAllowUniversalAccessFromFileURLs: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new C0068i2(z));
    }

    @JvmStatic
    public static final void setAllowUserDismissSpinnerByGesture(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAllowUserDismissSpinnerByGesture: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0072j2(z));
    }

    @JvmStatic
    public static final void setAllowUserEditFileNameBeforeDownloading(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAllowUserEditFileNameBeforeDownloading: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0076k2(z));
    }

    @JvmStatic
    public static final void setAutoDownloadEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setAutoDownloadEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0080l2(z));
    }

    @JvmStatic
    public static final void setBackgroundColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setBackgroundColor rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0084m2(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setBouncesEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setBouncesEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0088n2(z));
    }

    @JvmStatic
    public static final void setCacheMode(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setCacheMode: " + name + ", mode: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0092o2(i));
    }

    @JvmStatic
    public static final void setCalloutEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setCalloutEnabled: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0096p2(z));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void setCookie(String str, String str2) {
        D0.a(Companion, str, ImagesContract.URL, str2, "cookie");
        B b = B.b;
        String message = L.a("Interface setCookie: ", str2, " | to url: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        AbstractC0125x0.c(str, str2);
    }

    @JvmStatic
    public static final void setCookieAsync(String str, String str2, String str3) {
        Companion.getClass();
        p3.a(str, str2, str3);
    }

    @JvmStatic
    public static final void setCornerRadius(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setCornerRadius: " + name + ", [" + f + ", " + f2 + ", " + f3 + ", " + f4 + ']';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0100q2(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setDefaultFontSize(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setDefaultFontSize: " + name + ", size: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0103r2(i));
    }

    @JvmStatic
    public static final void setDownloadEventForContextMenuEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface SetDownloadEventForContextMenuEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0107s2(z));
    }

    @JvmStatic
    public static final void setDragInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setDragInteractionEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0111t2(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarBackgroundColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setEmbeddedToolbarBackgroundColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0115u2(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarButtonTextColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setEmbeddedToolbarButtonTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0119v2(f, f2, f3, f4));
    }

    @JvmStatic
    public static final boolean setEmbeddedToolbarConfig(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "json");
        B b = B.b;
        String message = "Interface setEmbeddedToolbarConfig: " + str + ", jsonLength: " + str2.length() + '.';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        Boolean bool = (Boolean) p3.c(str, new C0123w2(str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void setEmbeddedToolbarDoneButtonText(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "text");
        B b = B.b;
        String message = L.a("Interface setEmbeddedToolbarDoneButtonText: ", str, ", text: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C0127x2(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarGoBackButtonText(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "text");
        B b = B.b;
        String message = L.a("Interface setEmbeddedToolbarGoBackButtonText: ", str, ", text: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C0131y2(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarGoForwardButtonText(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "text");
        B b = B.b;
        String message = L.a("Interface setEmbeddedToolbarGoForwardButtonText: ", str, ", text: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C0135z2(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarMaxHeight(String name, float f) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setEmbeddedToolbarMaxHeight: " + name + ", maxHeight: " + f;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new A2(f));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarNavigationButtonsShow(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setEmbeddedToolbarNavigationButtonsShow: ", name, ", show: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new B2(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarOnTop(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setEmbeddedToolbarOnTop: ", name, ", top: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C2(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarTitleText(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "text");
        B b = B.b;
        String message = L.a("Interface setEmbeddedToolbarTitleText: ", str, ", text: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new D2(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarTitleTextColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setEmbeddedToolbarTitleTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new E2(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEnableKeyboardAvoidance(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setEnableKeyboardAvoidance: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new F2(z));
    }

    @JvmStatic
    public static final void setForwardWebConsoleToNativeOutput(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setForwardWebConsoleToNativeOutput: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new G2(z));
    }

    @JvmStatic
    public static final void setFrame(String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setFrame: " + name + ", {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new H2(i, i2, i3, i4));
    }

    @JvmStatic
    public static final void setHeaderField(String str, String str2, String str3) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "key");
        B b = B.b;
        String message = "Interface setHeaderField: " + str + ". {key: " + str2 + ", value: " + str3 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new I2(str2, str3));
    }

    @JvmStatic
    public static final void setHorizontalScrollBarEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setHorizontalScrollBarEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new J2(z));
    }

    @JvmStatic
    public static final void setJavaScriptEnabled(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setJavaScriptEnabled: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new K2(z));
    }

    @JvmStatic
    public static final void setLoadWithOverviewMode(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setLoadWithOverviewMode: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new L2(z));
    }

    @JvmStatic
    public static final void setLogLevel(int i) {
        Companion.getClass();
        B.b.a = i;
    }

    @JvmStatic
    public static final void setOpenLinksInExternalBrowser(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setOpenLinksInExternalBrowser: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new M2(z));
    }

    @JvmStatic
    public static final void setPopupPageEventEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setPopupPageEventEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new N2(z));
    }

    @JvmStatic
    public static final void setPosition(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setPosition: " + name + ", {" + i + ", " + i2 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new O2(i, i2));
    }

    @JvmStatic
    public static final void setPreferredCustomTabsBrowsers(String[] packages) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(packages, "packages");
        B b = B.b;
        String message = "Interface setPreferredCustomTabsBrowsers: " + packages;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new P2(packages));
    }

    @JvmStatic
    public static final void setShadow(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setShadow: " + name + ", color=(" + f + ", " + f2 + ", " + f3 + ", " + f4 + "), opacity=" + f5 + ", radius=" + f6 + ", offset=(" + f7 + ", " + f8 + "), spread=" + f9;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new Q2(f, f2, f3, f4, f5, f6, f7, f8, f9));
    }

    @JvmStatic
    public static final void setShowEmbeddedToolbar(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setShowEmbeddedToolbar: ", name, ", show: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new R2(z));
    }

    @JvmStatic
    public static final void setShowSpinnerWhileLoading(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setShowSpinnerWhileLoading: ", name, ", show: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new S2(z));
    }

    @JvmStatic
    public static final void setSize(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setSize: " + name + ", {" + i + ", " + i2 + '}';
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new T2(i, i2));
    }

    @JvmStatic
    public static final void setSpinnerText(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "text");
        B b = B.b;
        String message = L.a("Interface setSpinnerText: ", str, ", text: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new U2(str2));
    }

    @JvmStatic
    public static final void setSupportMultipleWindows(String name, boolean z, boolean z2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setSupportMultipleWindows: " + name + ", flag: " + z + ", allowJS: " + z2;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new V2(z2));
    }

    @JvmStatic
    public static final void setTextZoom(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setTextZoom: " + name + ", textZoom: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new W2(i));
    }

    @JvmStatic
    public static final void setTransform(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setTransform: " + name + ", rotation: " + f + ", scaleX: " + f2 + ", scaleY: " + f3;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new X2(f, f2, f3));
    }

    @JvmStatic
    public static final void setTransparencyClickingThroughEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setTransparencyClickingThroughEnabled: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new Y2(z));
    }

    @JvmStatic
    public static final void setUseWideViewPort(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setUseWideViewPort: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new Z2(z));
    }

    @JvmStatic
    public static final void setUserAgent(String str, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "userAgent");
        B b = B.b;
        String message = L.a("Interface setUserAgent: ", str, ", UA: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(str, new C0029a3(str2));
    }

    @JvmStatic
    public static final void setUserInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setUserInteractionEnabled: ", name, ", flag: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0034b3(z));
    }

    @JvmStatic
    public static final void setVerticalScrollBarEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setVerticalScrollBarEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0039c3(z));
    }

    @JvmStatic
    public static final void setWebContentsDebuggingEnabled(boolean z) {
        Companion.getClass();
        B b = B.b;
        String message = "Interface setWebContentsDebuggingEnabled: " + z;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(new C0044d3(z));
    }

    @JvmStatic
    public static final void setWebViewAlpha(String name, float f) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface setWebViewAlpha: " + name + ", alpha: " + f;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0049e3(f));
    }

    @JvmStatic
    public static final void setZoomEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = E0.a("Interface setZoomEnabled: ", name, ", enabled: ", z, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new C0054f3(z));
    }

    @JvmStatic
    public static final boolean show(String str, boolean z, int i, float f, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "identifier");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface show", "message");
        b.a(A.INFO, "Interface show");
        Boolean bool = (Boolean) p3.c(str, new C0059g3(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void showAsync(String str, boolean z, int i, float f, String str2) {
        D0.a(Companion, str, AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "identifier");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface showAsync", "message");
        b.a(A.INFO, "Interface showAsync");
        p3.a(str, new C0064h3(z, i, f, str2));
    }

    @JvmStatic
    public static final void showSpinner(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface showSpinner: ", name, b, "message"));
        p3.a(name, i3.a);
    }

    @JvmStatic
    public static final void startSnapshotForRendering(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface startSnapshotForRendering: ", name, b, "message"));
        p3.a(name, new j3(str));
    }

    @JvmStatic
    public static final boolean startSnapshotTextureStream(String name, long j, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface startSnapshotTextureStream: " + name + ", streamId: " + j;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        Boolean bool = (Boolean) p3.c(name, new k3(j, i, i2, i3, i4));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void stop(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface stop: ", name, b, "message"));
        p3.a(name, l3.a);
    }

    @JvmStatic
    public static final void stopSnapshotForRendering(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Interface stopSnapshotForRendering: ", name, b, "message"));
        p3.a(name, m3.a);
    }

    @JvmStatic
    public static final void stopSnapshotTextureStream(String name, long j) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        String message = "Interface stopSnapshotTextureStream: " + name + ", streamId: " + j;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        p3.a(name, new n3(j));
    }

    @JvmStatic
    public static final void tickSnapshotTextureStream(String name, long j) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        p3.a(name, new o3(j));
    }
}
