package a;

import A.G;
import A.I;
import A.J;
import A.T;
import D0.C0042b;
import D0.C0044d;
import D0.C0047g;
import D0.C0050j;
import D0.O;
import E0.b;
import F.m;
import F0.f;
import G0.e;
import I.C0071f;
import I.C0073h;
import I.C0077l;
import I.C0079n;
import P.C0105o;
import P.E;
import P.v;
import P.w;
import P0.l;
import P0.p;
import Q0.h;
import Q0.o;
import Q0.r;
import Y0.AbstractC0127v;
import Y0.C0120n;
import a0.n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.http.SslCertificate;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import d1.u;
import e0.C0186a;
import i0.c;
import j.C0242s;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.g;
import t.d;
import w0.InterfaceC0316b;
import w0.InterfaceC0320f;
import w0.k;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0132a implements c {

    /* renamed from: f, reason: collision with root package name */
    public static Method f1248f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1249g;

    /* renamed from: h, reason: collision with root package name */
    public static Field f1250h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1251i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1252e;

    public /* synthetic */ AbstractC0132a(int i2) {
        this.f1252e = i2;
    }

    public static void F(C0242s c0242s, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.c(c0242s, z2);
            return;
        }
        if (!f1251i) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1250h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f1251i = true;
        }
        Field field = f1250h;
        if (field != null) {
            try {
                field.set(c0242s, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static void G(InterfaceC0320f interfaceC0320f, final C0044d c0044d) {
        h.e(interfaceC0320f, "binaryMessenger");
        f fVar = C0047g.f353b;
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (k) fVar.a(), obj);
        if (c0044d != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o2) {
                    List L2;
                    List L3;
                    switch (i2) {
                        case 0:
                            C0044d c0044d2 = c0044d;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l2 = (Long) obj3;
                            long longValue = l2.longValue();
                            try {
                                c0044d2.f();
                                Object e2 = c0044d2.e(longValue);
                                if (e2 instanceof l0) {
                                    ((l0) e2).destroy();
                                }
                                c0044d2.f329d.remove(l2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o2.b(L2);
                            break;
                        default:
                            C0044d c0044d3 = c0044d;
                            try {
                                c0044d3.f327b.clear();
                                c0044d3.f328c.clear();
                                c0044d3.f329d.clear();
                                c0044d3.f331f.clear();
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o2.b(L3);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (k) fVar.a(), obj);
        if (c0044d == null) {
            c0079n2.i(null);
        } else {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o2) {
                    List L2;
                    List L3;
                    switch (i3) {
                        case 0:
                            C0044d c0044d2 = c0044d;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l2 = (Long) obj3;
                            long longValue = l2.longValue();
                            try {
                                c0044d2.f();
                                Object e2 = c0044d2.e(longValue);
                                if (e2 instanceof l0) {
                                    ((l0) e2).destroy();
                                }
                                c0044d2.f329d.remove(l2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o2.b(L2);
                            break;
                        default:
                            C0044d c0044d3 = c0044d;
                            try {
                                c0044d3.f327b.clear();
                                c0044d3.f328c.clear();
                                c0044d3.f329d.clear();
                                c0044d3.f331f.clear();
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o2.b(L3);
                            break;
                    }
                }
            });
        }
    }

    public static void H(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.A
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0050j3.getClass();
                                cookieManager.setCookie(str, str2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b2 = new B(o3, 0);
                            c0050j.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0053m(b2, 0));
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0050j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.A
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0050j3.getClass();
                                cookieManager.setCookie(str, str2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b2 = new B(o3, 0);
                            c0050j.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0053m(b2, 0));
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0050j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.A
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0050j3.getClass();
                                cookieManager.setCookie(str, str2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b2 = new B(o3, 0);
                            c0050j.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0053m(b2, 0));
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0050j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", c0042b, obj);
        if (c0050j == null) {
            c0079n4.i(null);
        } else {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.A
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i5) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0050j3.getClass();
                                cookieManager.setCookie(str, str2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b2 = new B(o3, 0);
                            c0050j.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0053m(b2, 0));
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0050j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        }
    }

    public static void I(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.D
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0050j3.getClass();
                                httpAuthHandler2.cancel();
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0050j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.D
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0050j3.getClass();
                                httpAuthHandler2.cancel();
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0050j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c0042b, obj);
        if (c0050j == null) {
            c0079n3.i(null);
        } else {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.D
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0050j3.getClass();
                                httpAuthHandler2.cancel();
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0050j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                    }
                }
            });
        }
    }

    public static void J(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.F
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(dName.getCName());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(dName2.getDName());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(dName3.getOName());
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        default:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0050j5.getClass();
                                L5 = i1.a.u(dName4.getUName());
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.F
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(dName.getCName());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(dName2.getDName());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(dName3.getOName());
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        default:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0050j5.getClass();
                                L5 = i1.a.u(dName4.getUName());
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.F
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(dName.getCName());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(dName2.getDName());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(dName3.getOName());
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        default:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0050j5.getClass();
                                L5 = i1.a.u(dName4.getUName());
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c0042b, obj);
        if (c0050j == null) {
            c0079n4.i(null);
        } else {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.F
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    switch (i5) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(dName.getCName());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(dName2.getDName());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(dName3.getOName());
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        default:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0050j5.getClass();
                                L5 = i1.a.u(dName4.getUName());
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                    }
                }
            });
        }
    }

    public static void K(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.J
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), new X(c0050j2));
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x2 = (X) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0050j3.getClass();
                                x2.f291c = booleanValue;
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x3 = (X) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0050j4.getClass();
                                x3.f292d = booleanValue2;
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x4 = (X) obj8;
                            Object obj9 = list3.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                x4.f293e = booleanValue3;
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x5 = (X) obj10;
                            Object obj11 = list4.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                x5.f294f = booleanValue4;
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x6 = (X) obj12;
                            Object obj13 = list5.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                x6.f295g = booleanValue5;
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.J
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), new X(c0050j2));
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x2 = (X) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0050j3.getClass();
                                x2.f291c = booleanValue;
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x3 = (X) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0050j4.getClass();
                                x3.f292d = booleanValue2;
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x4 = (X) obj8;
                            Object obj9 = list3.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                x4.f293e = booleanValue3;
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x5 = (X) obj10;
                            Object obj11 = list4.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                x5.f294f = booleanValue4;
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x6 = (X) obj12;
                            Object obj13 = list5.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                x6.f295g = booleanValue5;
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.J
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), new X(c0050j2));
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x2 = (X) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0050j3.getClass();
                                x2.f291c = booleanValue;
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x3 = (X) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0050j4.getClass();
                                x3.f292d = booleanValue2;
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x4 = (X) obj8;
                            Object obj9 = list3.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                x4.f293e = booleanValue3;
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x5 = (X) obj10;
                            Object obj11 = list4.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                x5.f294f = booleanValue4;
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x6 = (X) obj12;
                            Object obj13 = list5.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                x6.f295g = booleanValue5;
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c0042b, obj);
        if (c0050j != null) {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.J
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    switch (i5) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), new X(c0050j2));
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x2 = (X) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0050j3.getClass();
                                x2.f291c = booleanValue;
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x3 = (X) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0050j4.getClass();
                                x3.f292d = booleanValue2;
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x4 = (X) obj8;
                            Object obj9 = list3.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                x4.f293e = booleanValue3;
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x5 = (X) obj10;
                            Object obj11 = list4.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                x5.f294f = booleanValue4;
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x6 = (X) obj12;
                            Object obj13 = list5.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                x6.f295g = booleanValue5;
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c0042b, obj);
        if (c0050j != null) {
            final int i6 = 4;
            c0079n5.i(new InterfaceC0316b() { // from class: D0.J
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    switch (i6) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), new X(c0050j2));
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x2 = (X) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0050j3.getClass();
                                x2.f291c = booleanValue;
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x3 = (X) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0050j4.getClass();
                                x3.f292d = booleanValue2;
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x4 = (X) obj8;
                            Object obj9 = list3.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                x4.f293e = booleanValue3;
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x5 = (X) obj10;
                            Object obj11 = list4.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                x5.f294f = booleanValue4;
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x6 = (X) obj12;
                            Object obj13 = list5.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                x6.f295g = booleanValue5;
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c0042b, obj);
        if (c0050j == null) {
            c0079n6.i(null);
        } else {
            final int i7 = 5;
            c0079n6.i(new InterfaceC0316b() { // from class: D0.J
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    switch (i7) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), new X(c0050j2));
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x2 = (X) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0050j3.getClass();
                                x2.f291c = booleanValue;
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x3 = (X) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0050j4.getClass();
                                x3.f292d = booleanValue2;
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x4 = (X) obj8;
                            Object obj9 = list3.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                x4.f293e = booleanValue3;
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x5 = (X) obj10;
                            Object obj11 = list4.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                x5.f294f = booleanValue4;
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            X x6 = (X) obj12;
                            Object obj13 = list5.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                x6.f295g = booleanValue5;
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                    }
                }
            });
        }
    }

    public static void L(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 2;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 6;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", c0042b, obj);
        if (c0050j != null) {
            final int i5 = 7;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i5) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", c0042b, obj);
        if (c0050j != null) {
            final int i6 = 8;
            c0079n5.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i6) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", c0042b, obj);
        if (c0050j != null) {
            final int i7 = 9;
            c0079n6.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i7) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n6.i(null);
        }
        C0079n c0079n7 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", c0042b, obj);
        if (c0050j != null) {
            final int i8 = 10;
            c0079n7.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i8) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n7.i(null);
        }
        C0079n c0079n8 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", c0042b, obj);
        if (c0050j != null) {
            final int i9 = 12;
            c0079n8.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i9) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n8.i(null);
        }
        C0079n c0079n9 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", c0042b, obj);
        if (c0050j != null) {
            final int i10 = 13;
            c0079n9.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i10) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n9.i(null);
        }
        C0079n c0079n10 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", c0042b, obj);
        if (c0050j != null) {
            final int i11 = 14;
            c0079n10.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i11) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n10.i(null);
        }
        C0079n c0079n11 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", c0042b, obj);
        if (c0050j != null) {
            final int i12 = 11;
            c0079n11.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i12) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n11.i(null);
        }
        C0079n c0079n12 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", c0042b, obj);
        if (c0050j != null) {
            final int i13 = 15;
            c0079n12.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i13) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n12.i(null);
        }
        C0079n c0079n13 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", c0042b, obj);
        if (c0050j != null) {
            final int i14 = 16;
            c0079n13.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i14) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n13.i(null);
        }
        C0079n c0079n14 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", c0042b, obj);
        if (c0050j != null) {
            final int i15 = 17;
            c0079n14.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i15) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n14.i(null);
        }
        C0079n c0079n15 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", c0042b, obj);
        if (c0050j != null) {
            final int i16 = 18;
            c0079n15.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i16) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n15.i(null);
        }
        C0079n c0079n16 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", c0042b, obj);
        if (c0050j != null) {
            final int i17 = 19;
            c0079n16.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i17) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n16.i(null);
        }
        C0079n c0079n17 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", c0042b, obj);
        if (c0050j != null) {
            final int i18 = 20;
            c0079n17.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i18) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n17.i(null);
        }
        C0079n c0079n18 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", c0042b, obj);
        if (c0050j != null) {
            final int i19 = 21;
            c0079n18.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i19) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n18.i(null);
        }
        C0079n c0079n19 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", c0042b, obj);
        if (c0050j != null) {
            final int i20 = 22;
            c0079n19.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i20) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n19.i(null);
        }
        C0079n c0079n20 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", c0042b, obj);
        if (c0050j != null) {
            final int i21 = 1;
            c0079n20.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i21) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n20.i(null);
        }
        C0079n c0079n21 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", c0042b, obj);
        if (c0050j != null) {
            final int i22 = 3;
            c0079n21.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i22) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n21.i(null);
        }
        C0079n c0079n22 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", c0042b, obj);
        if (c0050j != null) {
            final int i23 = 4;
            c0079n22.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i23) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        } else {
            c0079n22.i(null);
        }
        C0079n c0079n23 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", c0042b, obj);
        if (c0050j == null) {
            c0079n23.i(null);
        } else {
            final int i24 = 5;
            c0079n23.i(new InterfaceC0316b() { // from class: D0.L
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
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
                    List L23;
                    switch (i24) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), c0050j2.n());
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0050j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0044d) c0050j4.f366a.f261c).a(((Long) obj6).longValue(), webView2.getSettings());
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            X x2 = (X) list3.get(1);
                            try {
                                c0050j5.getClass();
                                webView3.setWebChromeClient(x2);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0050j6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0050j7.getClass();
                                webView5.destroy();
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0050j8.getClass();
                                webView6.loadData(str, str2, str3);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0050j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            Q0.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0050j10.getClass();
                                webView8.loadUrl(str9, map);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0050j11.getClass();
                                webView9.postUrl(str10, bArr);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            Q0.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0050j12.getClass();
                                L12 = i1.a.u(webView10.getUrl());
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0050j13.getClass();
                                webView11.goForward();
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0050j14.getClass();
                                L14 = i1.a.u(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            Q0.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0050j16.getClass();
                                webView14.goBack();
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0050j17.getClass();
                                webView15.reload();
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        case 16:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            Q0.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0050j18.getClass();
                                webView16.clearCache(booleanValue);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                        case 17:
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b2 = new B(o3, 1);
                            c0050j.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0053m(b2, 1));
                            break;
                        case 18:
                            C0050j c0050j19 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0050j19.getClass();
                                L19 = i1.a.u(webView17.getTitle());
                            } catch (Throwable th18) {
                                L19 = i1.a.L(th18);
                            }
                            o3.b(L19);
                            break;
                        case 19:
                            C0050j c0050j20 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                L20 = i1.a.u(null);
                            } catch (Throwable th19) {
                                L20 = i1.a.L(th19);
                            }
                            o3.b(L20);
                            break;
                        case 20:
                            C0050j c0050j21 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0050j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                L21 = i1.a.u(null);
                            } catch (Throwable th20) {
                                L21 = i1.a.L(th20);
                            }
                            o3.b(L21);
                            break;
                        case 21:
                            C0050j c0050j22 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            Q0.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            Q0.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0062w c0062w = (C0062w) obj35;
                            try {
                                c0050j22.getClass();
                                webView19.addJavascriptInterface(c0062w, c0062w.f414a);
                                L22 = i1.a.u(null);
                            } catch (Throwable th21) {
                                L22 = i1.a.L(th21);
                            }
                            o3.b(L22);
                            break;
                        default:
                            C0050j c0050j23 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            Q0.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0050j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                L23 = i1.a.u(null);
                            } catch (Throwable th22) {
                                L23 = i1.a.L(th22);
                            }
                            o3.b(L23);
                            break;
                    }
                }
            });
        }
    }

    public static final Object N(u uVar, u uVar2, p pVar) {
        Object c0120n;
        Object L2;
        try {
            r.a(2, pVar);
            c0120n = pVar.h(uVar2, uVar);
        } catch (Throwable th) {
            c0120n = new C0120n(th, false);
        }
        I0.a aVar = I0.a.f733e;
        if (c0120n == aVar || (L2 = uVar.L(c0120n)) == AbstractC0127v.f1234d) {
            return aVar;
        }
        if (L2 instanceof C0120n) {
            throw ((C0120n) L2).f1219a;
        }
        return AbstractC0127v.l(L2);
    }

    public static boolean P(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (P(viewGroup.getChildAt(i2), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList R(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            Field field = null;
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList2;
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        } catch (NoSuchFieldException e3) {
            e = e3;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        }
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
    public static final Object a(List list, C0077l c0077l, J0.b bVar) {
        C0071f c0071f;
        int i2;
        List list2;
        o oVar;
        Iterator it;
        Throwable th;
        if (bVar instanceof C0071f) {
            c0071f = (C0071f) bVar;
            int i3 = c0071f.f637k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0071f.f637k = i3 - Integer.MIN_VALUE;
                Object obj = c0071f.f636j;
                Object obj2 = I0.a.f733e;
                i2 = c0071f.f637k;
                if (i2 != 0) {
                    i1.a.G(obj);
                    ArrayList arrayList = new ArrayList();
                    C0073h c0073h = new C0073h(list, arrayList, null);
                    c0071f.f634h = arrayList;
                    c0071f.f637k = 1;
                    if (c0077l.a(c0073h, c0071f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0071f.f635i;
                        oVar = (o) c0071f.f634h;
                        try {
                            i1.a.G(obj);
                        } catch (Throwable th2) {
                            Object obj3 = oVar.f983e;
                            if (obj3 == null) {
                                oVar.f983e = th2;
                            } else {
                                c((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            c0071f.f634h = oVar;
                            c0071f.f635i = it;
                            c0071f.f637k = 2;
                            if (lVar.i(c0071f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) oVar.f983e;
                        if (th == null) {
                            return F0.h.f469a;
                        }
                        throw th;
                    }
                    list2 = (List) c0071f.f634h;
                    i1.a.G(obj);
                }
                oVar = new o();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) oVar.f983e;
                if (th == null) {
                }
            }
        }
        c0071f = new C0071f(bVar);
        Object obj4 = c0071f.f636j;
        Object obj22 = I0.a.f733e;
        i2 = c0071f.f637k;
        if (i2 != 0) {
        }
        oVar = new o();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) oVar.f983e;
        if (th == null) {
        }
    }

    public static final List b(Throwable th) {
        return e.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static void c(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = L0.a.f768a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = K0.a.f755a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void e(Context context, n0.c cVar) {
        Rect rect;
        T b2;
        Object systemService;
        WindowMetrics maximumWindowMetrics;
        Activity r2 = r(context);
        if (r2 != null) {
            int i2 = a0.m.f1285a;
            n.f1286a.getClass();
            int i3 = a0.o.f1287b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                systemService = r2.getSystemService((Class<Object>) WindowManager.class);
                maximumWindowMetrics = ((WindowManager) systemService).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService2 = r2.getSystemService("window");
                h.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService2).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                b2 = (i4 >= 30 ? new J() : i4 >= 29 ? new I() : new G()).b();
                h.d(b2, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i4 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b2 = C0186a.f2175a.a(r2);
            }
            int i5 = rect.left;
            int i6 = rect.top;
            int i7 = rect.right;
            int i8 = rect.bottom;
            if (i5 > i7) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i5 + ", right: " + i7).toString());
            }
            if (i6 <= i8) {
                h.e(b2, "_windowInsetsCompat");
                cVar.f3263a.updateDisplayMetrics(0, new Rect(i5, i6, i7, i8).width(), new Rect(i5, i6, i7, i8).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i6 + ", bottom: " + i8).toString());
            }
        }
    }

    public static boolean f(d[] dVarArr, d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            d dVar = dVarArr[i2];
            char c2 = dVar.f3441a;
            d dVar2 = dVarArr2[i2];
            if (c2 != dVar2.f3441a || dVar.f3442b.length != dVar2.f3442b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void k(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                c(th, th2);
            }
        }
    }

    public static int m(E e2, C0105o c0105o, View view, View view2, v vVar, boolean z2) {
        int s2;
        int t2;
        if (vVar.p() == 0 || e2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            ((w) view.getLayoutParams()).getClass();
            throw null;
        }
        int b2 = c0105o.b(view2) - c0105o.c(view);
        switch (c0105o.f941b) {
            case 0:
                v vVar2 = c0105o.f940a;
                s2 = vVar2.f953f - vVar2.s();
                t2 = vVar2.t();
                break;
            default:
                v vVar3 = c0105o.f940a;
                s2 = vVar3.f954g - vVar3.u();
                t2 = vVar3.r();
                break;
        }
        return Math.min(s2 - t2, b2);
    }

    public static int n(E e2, C0105o c0105o, View view, View view2, v vVar, boolean z2) {
        if (vVar.p() == 0 || e2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return e2.a();
        }
        c0105o.b(view2);
        c0105o.c(view);
        ((w) view.getLayoutParams()).getClass();
        throw null;
    }

    public static float[] o(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:35:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d[] p(String str) {
        int i2;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i5, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i3) == 'z' || trim.charAt(i3) == 'Z') {
                            fArr = new float[i3];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i6 = 1;
                                int i7 = 0;
                                while (i6 < length) {
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    for (int i8 = i6; i8 < trim.length(); i8++) {
                                        char charAt2 = trim.charAt(i8);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i8 != i6 && !z2) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                            break;
                                                        }
                                                        z2 = false;
                                                        break;
                                                    case '.':
                                                        if (!z3) {
                                                            z2 = false;
                                                            z3 = true;
                                                            break;
                                                        }
                                                        z2 = false;
                                                        z4 = true;
                                                        z5 = true;
                                                        break;
                                                    default:
                                                        z2 = false;
                                                        break;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            if (!z4) {
                                                if (i6 < i8) {
                                                    fArr2[i7] = Float.parseFloat(trim.substring(i6, i8));
                                                    i7++;
                                                }
                                                i6 = !z5 ? i8 : i8 + 1;
                                            }
                                        }
                                        z2 = false;
                                        z4 = true;
                                        if (!z4) {
                                        }
                                    }
                                    if (i6 < i8) {
                                    }
                                    if (!z5) {
                                    }
                                }
                                fArr = o(fArr2, i7);
                                i3 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new d(trim.charAt(i3), fArr));
                    }
                    i5 = i4;
                    i4++;
                    i3 = 0;
                }
                i4++;
            }
            trim = str.substring(i5, i4).trim();
            if (!trim.isEmpty()) {
            }
            i5 = i4;
            i4++;
            i3 = 0;
        }
        if (i4 - i5 != 1 || i5 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new d(str.charAt(i5), new float[0]));
        }
        return (d[]) arrayList.toArray(new d[i2]);
    }

    public static d[] q(d[] dVarArr) {
        d[] dVarArr2 = new d[dVarArr.length];
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2] = new d(dVarArr[i2]);
        }
        return dVarArr2;
    }

    public static Activity r(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return r(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean x(String str) {
        V.b bVar = V.l.f1106a;
        Set<V.e> unmodifiableSet = Collections.unmodifiableSet(V.c.f1097c);
        HashSet hashSet = new HashSet();
        for (V.e eVar : unmodifiableSet) {
            if (((V.c) eVar).f1098a.equals(str)) {
                hashSet.add(eVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            V.c cVar = (V.c) ((V.e) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(byte b2) {
        return b2 > -65;
    }

    public static int z(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public abstract void A(o.f fVar, o.f fVar2);

    public abstract void B(o.f fVar, Thread thread);

    public abstract void M();

    public abstract void O();

    public abstract void Q(byte[] bArr, int i2, int i3);

    @Override // i0.c
    public void d(String str, HashMap hashMap) {
        v().d(str, hashMap);
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h(g gVar, o.c cVar);

    public abstract boolean i(g gVar, Object obj, Object obj2);

    public abstract boolean j(g gVar, o.f fVar, o.f fVar2);

    @Override // i0.c
    public void l(Serializable serializable) {
        v().l(serializable);
    }

    public abstract Object s(String str);

    public abstract String t();

    public String toString() {
        switch (this.f1252e) {
            case 25:
                return t() + " " + ((String) s("sql")) + " " + ((List) s("arguments"));
            default:
                return super.toString();
        }
    }

    public boolean u() {
        return Boolean.TRUE.equals(s("noResult"));
    }

    public abstract c v();

    public abstract boolean w();

    public void C() {
    }

    public void D(boolean z2) {
    }

    public void E(boolean z2) {
    }
}
