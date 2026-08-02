package a;

import A0.d;
import B0.p;
import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import P1.b;
import P1.f;
import P1.k;
import P1.l;
import Y1.C0105b;
import Y1.C0113j;
import Y1.C0117n;
import a.AbstractC0129a;
import a0.C0130a;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.C0140g;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import d0.h;
import io.appmetrica.analytics.impl.C0642l9;
import j1.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import n0.AbstractC1135O;
import n0.C1125E;
import n0.C1147i;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import p2.c;
import s2.n;
import t.g;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0129a {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f1915a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1916b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f1917c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f1918d;

    public static void A(f binaryMessenger, final C0117n c0117n) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0117n == null || (dVar = c0117n.f1873a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i3 = 0;
            pVar.i(new b() { // from class: Y1.A
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i3) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0117n2.f1873a.f17b).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0117n3.getClass();
                                cookieManager.setCookie(str, str2);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b3 = new B(eVar, 0);
                            c0117n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0116m(b3, 0));
                            break;
                        case 3:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0117n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0117n5.getClass();
                                L4 = AbstractC0129a.r(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i4 = 1;
            pVar2.i(new b() { // from class: Y1.A
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i4) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0117n2.f1873a.f17b).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0117n3.getClass();
                                cookieManager.setCookie(str, str2);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b3 = new B(eVar, 0);
                            c0117n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0116m(b3, 0));
                            break;
                        case 3:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0117n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0117n5.getClass();
                                L4 = AbstractC0129a.r(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i5 = 2;
            pVar3.i(new b() { // from class: Y1.A
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i5) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0117n2.f1873a.f17b).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0117n3.getClass();
                                cookieManager.setCookie(str, str2);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b3 = new B(eVar, 0);
                            c0117n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0116m(b3, 0));
                            break;
                        case 3:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0117n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0117n5.getClass();
                                L4 = AbstractC0129a.r(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i6 = 3;
            pVar4.i(new b() { // from class: Y1.A
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i6) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0117n2.f1873a.f17b).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0117n3.getClass();
                                cookieManager.setCookie(str, str2);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b3 = new B(eVar, 0);
                            c0117n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0116m(b3, 0));
                            break;
                        case 3:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0117n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0117n5.getClass();
                                L4 = AbstractC0129a.r(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.getCookies", c0105b, (K0.j) null);
        if (c0117n == null) {
            pVar5.i(null);
        } else {
            final int i7 = 4;
            pVar5.i(new b() { // from class: Y1.A
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i7) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0117n2.f1873a.f17b).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0117n3.getClass();
                                cookieManager.setCookie(str, str2);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b3 = new B(eVar, 0);
                            c0117n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0116m(b3, 0));
                            break;
                        case 3:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0117n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0117n5.getClass();
                                L4 = AbstractC0129a.r(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        }
    }

    public static void B(f binaryMessenger, final C0113j c0113j) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0113j == null || (dVar = c0113j.f1861a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i3 = 0;
            pVar.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i3) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i4 = 2;
            pVar2.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i4) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i5 = 6;
            pVar3.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i5) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i6 = 7;
            pVar4.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i6) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i7 = 8;
            pVar5.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i7) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        p pVar6 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i8 = 9;
            pVar6.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i8) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        p pVar7 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i9 = 10;
            pVar7.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i9) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar7.i(null);
        }
        p pVar8 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i10 = 12;
            pVar8.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i10) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar8.i(null);
        }
        p pVar9 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i11 = 13;
            pVar9.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i11) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar9.i(null);
        }
        p pVar10 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i12 = 14;
            pVar10.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i12) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar10.i(null);
        }
        p pVar11 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i13 = 11;
            pVar11.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i13) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar11.i(null);
        }
        p pVar12 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i14 = 15;
            pVar12.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i14) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar12.i(null);
        }
        p pVar13 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i15 = 16;
            pVar13.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i15) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar13.i(null);
        }
        p pVar14 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i16 = 17;
            pVar14.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i16) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar14.i(null);
        }
        p pVar15 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i17 = 18;
            pVar15.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i17) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar15.i(null);
        }
        p pVar16 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i18 = 19;
            pVar16.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i18) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar16.i(null);
        }
        p pVar17 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i19 = 20;
            pVar17.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i19) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar17.i(null);
        }
        p pVar18 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i20 = 21;
            pVar18.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i20) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar18.i(null);
        }
        p pVar19 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i21 = 22;
            pVar19.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i21) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar19.i(null);
        }
        p pVar20 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i22 = 1;
            pVar20.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i22) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar20.i(null);
        }
        p pVar21 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i23 = 3;
            pVar21.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i23) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar21.i(null);
        }
        p pVar22 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i24 = 4;
            pVar22.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i24) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        } else {
            pVar22.i(null);
        }
        p pVar23 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", c0105b, (K0.j) null);
        if (c0113j == null) {
            pVar23.i(null);
        } else {
            final int i25 = 5;
            pVar23.i(new b() { // from class: Y1.L
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    List L16;
                    List L17;
                    List L18;
                    List L19;
                    List L20;
                    List L21;
                    List L22;
                    switch (i25) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), c0113j2.a());
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0113j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j4.f1861a.f17b).a(((Long) obj5).longValue(), webView2.getSettings());
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            V v = (V) list3.get(1);
                            try {
                                c0113j5.getClass();
                                webView3.setWebChromeClient(v);
                                L4 = AbstractC0129a.r(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            C0113j c0113j6 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0113j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L5 = AbstractC0129a.r(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0104a) {
                                    C0104a c0104a5 = th5;
                                    L5 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                                } else {
                                    L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0113j7.getClass();
                                webView5.destroy();
                                L6 = AbstractC0129a.r(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0104a) {
                                    C0104a c0104a6 = th6;
                                    L6 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                                } else {
                                    L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            C0113j c0113j8 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0113j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L7 = AbstractC0129a.r(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0104a) {
                                    C0104a c0104a7 = th7;
                                    L7 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                                } else {
                                    L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            C0113j c0113j9 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0113j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0104a) {
                                    C0104a c0104a8 = th8;
                                    L8 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                                } else {
                                    L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            C0113j c0113j10 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0113j10.getClass();
                                webView8.loadUrl(str9, map);
                                L9 = AbstractC0129a.r(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0104a) {
                                    C0104a c0104a9 = th9;
                                    L9 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                                } else {
                                    L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            C0113j c0113j11 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0113j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L10 = AbstractC0129a.r(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0104a) {
                                    C0104a c0104a10 = th10;
                                    L10 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                                } else {
                                    L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            C0113j c0113j12 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0113j12.getClass();
                                L11 = AbstractC0129a.r(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0104a) {
                                    C0104a c0104a11 = th11;
                                    L11 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                                } else {
                                    L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            C0113j c0113j13 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0113j13.getClass();
                                webView11.goForward();
                                L12 = AbstractC0129a.r(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0104a) {
                                    C0104a c0104a12 = th12;
                                    L12 = c2.f.L(c0104a12.f1816a, c0104a12.f1817b, c0104a12.f1818c);
                                } else {
                                    L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            C0113j c0113j14 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0113j14.getClass();
                                L13 = AbstractC0129a.r(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0104a) {
                                    C0104a c0104a13 = th13;
                                    L13 = c2.f.L(c0104a13.f1816a, c0104a13.f1817b, c0104a13.f1818c);
                                } else {
                                    L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            C0113j c0113j15 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0113j15.getClass();
                                L14 = AbstractC0129a.r(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0104a) {
                                    C0104a c0104a14 = th14;
                                    L14 = c2.f.L(c0104a14.f1816a, c0104a14.f1817b, c0104a14.f1818c);
                                } else {
                                    L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            eVar.n(L14);
                            break;
                        case 14:
                            C0113j c0113j16 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0113j16.getClass();
                                webView14.goBack();
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0104a) {
                                    C0104a c0104a15 = th15;
                                    L15 = c2.f.L(c0104a15.f1816a, c0104a15.f1817b, c0104a15.f1818c);
                                } else {
                                    L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            eVar.n(L15);
                            break;
                        case 15:
                            C0113j c0113j17 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0113j17.getClass();
                                webView15.reload();
                                L16 = AbstractC0129a.r(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0104a) {
                                    C0104a c0104a16 = th16;
                                    L16 = c2.f.L(c0104a16.f1816a, c0104a16.f1817b, c0104a16.f1818c);
                                } else {
                                    L16 = c2.f.L(th16.getClass().getSimpleName(), th16.toString(), AbstractC0033i.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            eVar.n(L16);
                            break;
                        case 16:
                            C0113j c0113j18 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0113j18.getClass();
                                webView16.clearCache(booleanValue);
                                L17 = AbstractC0129a.r(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0104a) {
                                    C0104a c0104a17 = th17;
                                    L17 = c2.f.L(c0104a17.f1816a, c0104a17.f1817b, c0104a17.f1818c);
                                } else {
                                    L17 = c2.f.L(th17.getClass().getSimpleName(), th17.toString(), AbstractC0033i.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            eVar.n(L17);
                            break;
                        case 17:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            B b3 = new B(eVar, 1);
                            c0113j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0116m(b3, 1));
                            break;
                        case 18:
                            C0113j c0113j19 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0113j19.getClass();
                                L18 = AbstractC0129a.r(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0104a) {
                                    C0104a c0104a18 = th18;
                                    L18 = c2.f.L(c0104a18.f1816a, c0104a18.f1817b, c0104a18.f1818c);
                                } else {
                                    L18 = c2.f.L(th18.getClass().getSimpleName(), th18.toString(), AbstractC0033i.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            eVar.n(L18);
                            break;
                        case C0642l9.f7777C /* 19 */:
                            C0113j c0113j20 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0113j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L19 = AbstractC0129a.r(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0104a) {
                                    C0104a c0104a19 = th19;
                                    L19 = c2.f.L(c0104a19.f1816a, c0104a19.f1817b, c0104a19.f1818c);
                                } else {
                                    L19 = c2.f.L(th19.getClass().getSimpleName(), th19.toString(), AbstractC0033i.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            eVar.n(L19);
                            break;
                        case C0642l9.f7778D /* 20 */:
                            C0113j c0113j21 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0113j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L20 = AbstractC0129a.r(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0104a) {
                                    C0104a c0104a20 = th20;
                                    L20 = c2.f.L(c0104a20.f1816a, c0104a20.f1817b, c0104a20.f1818c);
                                } else {
                                    L20 = c2.f.L(th20.getClass().getSimpleName(), th20.toString(), AbstractC0033i.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            eVar.n(L20);
                            break;
                        case C0642l9.f7779E /* 21 */:
                            C0113j c0113j22 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0125w c0125w = (C0125w) obj34;
                            try {
                                c0113j22.getClass();
                                webView19.addJavascriptInterface(c0125w, c0125w.f1894a);
                                L21 = AbstractC0129a.r(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0104a) {
                                    C0104a c0104a21 = th21;
                                    L21 = c2.f.L(c0104a21.f1816a, c0104a21.f1817b, c0104a21.f1818c);
                                } else {
                                    L21 = c2.f.L(th21.getClass().getSimpleName(), th21.toString(), AbstractC0033i.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            eVar.n(L21);
                            break;
                        default:
                            C0113j c0113j23 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0113j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L22 = AbstractC0129a.r(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0104a) {
                                    C0104a c0104a22 = th22;
                                    L22 = c2.f.L(c0104a22.f1816a, c0104a22.f1817b, c0104a22.f1818c);
                                } else {
                                    L22 = c2.f.L(th22.getClass().getSimpleName(), th22.toString(), AbstractC0033i.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            eVar.n(L22);
                            break;
                    }
                }
            });
        }
    }

    public static boolean C(AbstractActivityC0029e abstractActivityC0029e, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i3 >= 32) {
            return abstractActivityC0029e.shouldShowRequestPermissionRationale(str);
        }
        if (i3 != 31) {
            return abstractActivityC0029e.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(abstractActivityC0029e.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return abstractActivityC0029e.shouldShowRequestPermissionRationale(str);
        }
    }

    public static String D(Throwable th) {
        j.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        j.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static boolean E(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] == bArr2[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String F(String str) {
        j.e(str, "<this>");
        Pattern compile = Pattern.compile("(.)(\\p{Upper})");
        j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("$1_$2");
        j.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(.) (.)");
        j.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("$1_$2");
        j.d(replaceAll2, "replaceAll(...)");
        String upperCase = replaceAll2.toUpperCase(Locale.ROOT);
        j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static c G(int i3, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new c(i3, i4 - 1, 1);
        }
        c cVar = c.f10225d;
        return c.f10225d;
    }

    public static final boolean H(String str, l2.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static ArrayList I(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static ArrayList J(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof X1.b) {
            X1.b bVar = (X1.b) th;
            arrayList.add(bVar.f1730a);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static C1125E K(Bundle bundle, String str) {
        C1147i c1147i = AbstractC1135O.f10024i;
        if (bundle == null) {
            AbstractC0248o0.g("BillingClient", str.concat(" got null owned items list"));
            return new C1125E(54, c1147i);
        }
        int a3 = AbstractC0248o0.a(bundle, "BillingClient");
        String e3 = AbstractC0248o0.e(bundle, "BillingClient");
        C0130a a4 = C1147i.a();
        a4.f1920b = a3;
        a4.f1919a = e3;
        C1147i a5 = a4.a();
        if (a3 != 0) {
            AbstractC0248o0.g("BillingClient", str + " failed. Response code: " + a3);
            return new C1125E(23, a5);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            AbstractC0248o0.g("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new C1125E(55, c1147i);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            AbstractC0248o0.g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new C1125E(56, c1147i);
        }
        if (stringArrayList2 == null) {
            AbstractC0248o0.g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new C1125E(57, c1147i);
        }
        if (stringArrayList3 != null) {
            return new C1125E(1, AbstractC1135O.f10025j);
        }
        AbstractC0248o0.g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new C1125E(58, c1147i);
    }

    public static void a(i iVar) {
        if (!iVar.f) {
            throw new IllegalStateException("AdSession is not started");
        }
        f(iVar);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static final D2.a d(l lVar) {
        Boolean bool = (Boolean) lVar.a("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required");
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) lVar.a("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required");
        }
        boolean booleanValue2 = bool2.booleanValue();
        Integer num = (Integer) lVar.a("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required");
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) lVar.a("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required");
        }
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) lVar.a("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required");
        }
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) lVar.a("audioMode");
        if (num4 != null) {
            return new D2.a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required");
    }

    public static void e(Throwable th, Throwable exception) {
        j.e(th, "<this>");
        j.e(exception, "exception");
        if (th != exception) {
            Integer num = h2.a.f5071a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = g2.a.f5052a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static void f(i iVar) {
        if (iVar.f9545g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static int g(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new g(context).f10354a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                e(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    public static void j(String str, String str2, Object obj) {
        String p3 = p(str);
        if (Log.isLoggable(p3, 3)) {
            Log.d(p3, String.format(str2, obj));
        }
    }

    public static boolean k(Method method, e eVar) {
        Class a3 = eVar.a();
        j.c(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a3);
    }

    public static void l(String str, String str2, Exception exc) {
        String p3 = p(str);
        if (Log.isLoggable(p3, 6)) {
            Log.e(p3, str2, exc);
        }
    }

    public static String m(C0140g c0140g) {
        StringBuilder sb = new StringBuilder(c0140g.size());
        for (int i3 = 0; i3 < c0140g.size(); i3++) {
            byte b3 = c0140g.b(i3);
            if (b3 == 34) {
                sb.append("\\\"");
            } else if (b3 == 39) {
                sb.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
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
                        if (b3 < 32 || b3 > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((b3 >>> 6) & 3) + 48));
                            sb.append((char) (((b3 >>> 3) & 7) + 48));
                            sb.append((char) ((b3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b3);
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

    public static int n(Context context, int i3, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? i3 : i4;
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return H.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static String p(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static boolean q(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1915a == null) {
            f1915a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f1915a.booleanValue();
        if (f1916b == null) {
            f1916b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f1916b.booleanValue()) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        return i3 < 26 || i3 >= 30;
    }

    public static List r(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static J1.a s(Context context) {
        String str;
        String str2;
        int i3;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str3 = F1.f.f501a.f499b;
            String str4 = F1.f.f502b.f499b;
            String str5 = null;
            if (bundle == null) {
                str = null;
            } else {
                String string = bundle.getString(str3, null);
                if (string == null) {
                    string = bundle.getString(str4);
                }
                str = string;
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str6 = F1.f.f.f499b;
            if (bundle2 != null) {
                bundle2.getString(str6, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str7 = F1.f.f506g.f499b;
            if (bundle3 != null) {
                bundle3.getString(str7, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str8 = F1.f.f503c.f499b;
            String str9 = F1.f.f504d.f499b;
            if (bundle4 == null) {
                str2 = null;
            } else {
                String string2 = bundle4.getString(str8, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str9);
                }
                str2 = string2;
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i3 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i3);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                v(xml, jSONArray, false);
                            }
                        }
                    }
                    str5 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str10 = str5;
            String str11 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new J1.a(str, str2, str10, str11, bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static float t(EdgeEffect edgeEffect, float f, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return H.d.c(edgeEffect, f, f3);
        }
        H.c.a(edgeEffect, f, f3);
        return f;
    }

    public static h u(String str) {
        String group;
        if (str == null || n.U(str)) {
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
        j.d(description, "description");
        return new h(description, parseInt, parseInt2, parseInt3);
    }

    public static void v(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    v(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static void w(Activity activity, String[] strArr, int i3) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException(AbstractC0033i.m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr2[i5] = strArr[i6];
                    i5++;
                }
            }
        }
        activity.requestPermissions(strArr, i3);
    }

    public static void z(f binaryMessenger, final C0113j c0113j) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0113j == null || (dVar = c0113j.f1861a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i3 = 0;
            pVar.i(new b() { // from class: Y1.G
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i3) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0113j3.getClass();
                                L2 = AbstractC0129a.r(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0113j4.getClass();
                                L3 = AbstractC0129a.r(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0113j5.getClass();
                                L4 = AbstractC0129a.r(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i4 = 1;
            pVar2.i(new b() { // from class: Y1.G
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i4) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0113j3.getClass();
                                L2 = AbstractC0129a.r(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0113j4.getClass();
                                L3 = AbstractC0129a.r(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0113j5.getClass();
                                L4 = AbstractC0129a.r(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i5 = 2;
            pVar3.i(new b() { // from class: Y1.G
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i5) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0113j3.getClass();
                                L2 = AbstractC0129a.r(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0113j4.getClass();
                                L3 = AbstractC0129a.r(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0113j5.getClass();
                                L4 = AbstractC0129a.r(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c0105b, (K0.j) null);
        if (c0113j == null) {
            pVar4.i(null);
        } else {
            final int i6 = 3;
            pVar4.i(new b() { // from class: Y1.G
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    switch (i6) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0104a) {
                                    C0104a c0104a = th;
                                    L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                                } else {
                                    L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            C0113j c0113j3 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0113j3.getClass();
                                L2 = AbstractC0129a.r(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0113j4.getClass();
                                L3 = AbstractC0129a.r(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            break;
                        default:
                            C0113j c0113j5 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0113j5.getClass();
                                L4 = AbstractC0129a.r(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0104a) {
                                    C0104a c0104a4 = th4;
                                    L4 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                                } else {
                                    L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            eVar.n(L4);
                            break;
                    }
                }
            });
        }
    }

    public abstract void y(boolean z);

    public void x(boolean z) {
    }
}
