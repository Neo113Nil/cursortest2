package i1;

import D0.C0041a;
import D0.C0042b;
import D0.C0050j;
import D0.O;
import F.n;
import F.o;
import F.q;
import F0.d;
import G0.e;
import H0.f;
import H0.g;
import H0.i;
import H0.j;
import I.C0079n;
import J0.b;
import P0.p;
import Q0.h;
import Y0.AbstractC0107a;
import Y0.AbstractC0124s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.http.SslCertificate;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C0144g;
import d1.AbstractC0184a;
import j.C0245v;
import j.u0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import q0.C0287d;
import s.AbstractC0292c;
import s.AbstractC0299j;
import s.AbstractC0302m;
import s.C0295f;
import s.C0300k;
import s.C0301l;
import u0.AbstractC0310a;
import w0.InterfaceC0316b;
import w0.InterfaceC0320f;
import w0.k;
import x.C0329h;
import y.C0333a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    public static long f2493e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f2494f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f2495g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f2496h;

    public a() {
        new ConcurrentHashMap();
    }

    public static void A(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.z
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
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0050j2.getClass();
                                clientCertRequest.cancel();
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0050j3.getClass();
                                clientCertRequest2.ignore();
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
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0050j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.z
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
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0050j2.getClass();
                                clientCertRequest.cancel();
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0050j3.getClass();
                                clientCertRequest2.ignore();
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
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0050j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", c0042b, obj);
        if (c0050j == null) {
            c0079n3.i(null);
        } else {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.z
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
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0050j2.getClass();
                                clientCertRequest.cancel();
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0050j3.getClass();
                                clientCertRequest2.ignore();
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
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0050j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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

    public static void B(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.C
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
                            long longValue = ((Long) obj3).longValue();
                            try {
                                O o4 = c0050j2.f366a;
                                ((C0044d) o4.f261c).a(longValue, (C0058s) o4.f264f);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0058s c0058s = (C0058s) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0050j3.getClass();
                                try {
                                    String[] list2 = c0058s.f406a.list(str);
                                    L3 = i1.a.u(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2.getMessage());
                                }
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0058s c0058s2 = (C0058s) obj6;
                            Object obj7 = list3.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(((String) ((C0287d) c0058s2.f407b.f3284f).f3382d.f3330g) + File.separator + str2);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.C
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
                            long longValue = ((Long) obj3).longValue();
                            try {
                                O o4 = c0050j2.f366a;
                                ((C0044d) o4.f261c).a(longValue, (C0058s) o4.f264f);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0058s c0058s = (C0058s) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0050j3.getClass();
                                try {
                                    String[] list2 = c0058s.f406a.list(str);
                                    L3 = i1.a.u(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2.getMessage());
                                }
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0058s c0058s2 = (C0058s) obj6;
                            Object obj7 = list3.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(((String) ((C0287d) c0058s2.f407b.f3284f).f3382d.f3330g) + File.separator + str2);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", c0042b, obj);
        if (c0050j == null) {
            c0079n3.i(null);
        } else {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.C
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
                            long longValue = ((Long) obj3).longValue();
                            try {
                                O o4 = c0050j2.f366a;
                                ((C0044d) o4.f261c).a(longValue, (C0058s) o4.f264f);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0058s c0058s = (C0058s) obj4;
                            Object obj5 = list.get(1);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0050j3.getClass();
                                try {
                                    String[] list2 = c0058s.f406a.list(str);
                                    L3 = i1.a.u(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2.getMessage());
                                }
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        default:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0058s c0058s2 = (C0058s) obj6;
                            Object obj7 = list3.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(((String) ((C0287d) c0058s2.f407b.f3284f).f3382d.f3330g) + File.separator + str2);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                    }
                }
            });
        }
    }

    public static void C(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.E
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    X509Certificate x509Certificate;
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0050j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L4 = i1.a.u(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0050j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L5 = i1.a.u(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        default:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0050j6.f366a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L6 = i1.a.u(x509Certificate);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.E
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    X509Certificate x509Certificate;
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0050j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L4 = i1.a.u(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0050j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L5 = i1.a.u(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        default:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0050j6.f366a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L6 = i1.a.u(x509Certificate);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.E
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    X509Certificate x509Certificate;
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0050j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L4 = i1.a.u(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0050j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L5 = i1.a.u(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        default:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0050j6.f366a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L6 = i1.a.u(x509Certificate);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", c0042b, obj);
        if (c0050j != null) {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.E
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    X509Certificate x509Certificate;
                    switch (i5) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0050j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L4 = i1.a.u(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0050j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L5 = i1.a.u(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        default:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0050j6.f366a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L6 = i1.a.u(x509Certificate);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", c0042b, obj);
        if (c0050j == null) {
            c0079n5.i(null);
        } else {
            final int i6 = 4;
            c0079n5.i(new InterfaceC0316b() { // from class: D0.E
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, P.O o3) {
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    X509Certificate x509Certificate;
                    switch (i6) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0050j2.getClass();
                                L2 = i1.a.u(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Q0.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0050j3.getClass();
                                L3 = i1.a.u(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0050j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L4 = i1.a.u(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0050j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L5 = i1.a.u(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        default:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0050j6.f366a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L6 = i1.a.u(x509Certificate);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                    }
                }
            });
        }
    }

    public static void D(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.G
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
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0050j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0050j3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(new j0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            return;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            return;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0064y enumC0064y = (EnumC0064y) obj15;
                            try {
                                c0050j7.getClass();
                                int ordinal = enumC0064y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0064y enumC0064y2 = EnumC0064y.f418f;
                                    c0050j7.f366a.getClass();
                                    throw new IllegalArgumentException(enumC0064y2 + " doesn't represent a native value.");
                                }
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            return;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.G
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
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0050j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0050j3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(new j0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            return;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            return;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0064y enumC0064y = (EnumC0064y) obj15;
                            try {
                                c0050j7.getClass();
                                int ordinal = enumC0064y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0064y enumC0064y2 = EnumC0064y.f418f;
                                    c0050j7.f366a.getClass();
                                    throw new IllegalArgumentException(enumC0064y2 + " doesn't represent a native value.");
                                }
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            return;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.G
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
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0050j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0050j3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(new j0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            return;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            return;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0064y enumC0064y = (EnumC0064y) obj15;
                            try {
                                c0050j7.getClass();
                                int ordinal = enumC0064y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0064y enumC0064y2 = EnumC0064y.f418f;
                                    c0050j7.f366a.getClass();
                                    throw new IllegalArgumentException(enumC0064y2 + " doesn't represent a native value.");
                                }
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            return;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", c0042b, obj);
        if (c0050j != null) {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.G
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
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0050j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0050j3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(new j0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            return;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            return;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0064y enumC0064y = (EnumC0064y) obj15;
                            try {
                                c0050j7.getClass();
                                int ordinal = enumC0064y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0064y enumC0064y2 = EnumC0064y.f418f;
                                    c0050j7.f366a.getClass();
                                    throw new IllegalArgumentException(enumC0064y2 + " doesn't represent a native value.");
                                }
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            return;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", c0042b, obj);
        if (c0050j != null) {
            final int i6 = 4;
            c0079n5.i(new InterfaceC0316b() { // from class: D0.G
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
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0050j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0050j3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(new j0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            return;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            return;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0064y enumC0064y = (EnumC0064y) obj15;
                            try {
                                c0050j7.getClass();
                                int ordinal = enumC0064y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0064y enumC0064y2 = EnumC0064y.f418f;
                                    c0050j7.f366a.getClass();
                                    throw new IllegalArgumentException(enumC0064y2 + " doesn't represent a native value.");
                                }
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            return;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", c0042b, obj);
        if (c0050j == null) {
            c0079n6.i(null);
        } else {
            final int i7 = 5;
            c0079n6.i(new InterfaceC0316b() { // from class: D0.G
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
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0050j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            return;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0050j3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            return;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0050j4.getClass();
                                L4 = i1.a.u(new j0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            return;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            return;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            return;
                        default:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0064y enumC0064y = (EnumC0064y) obj15;
                            try {
                                c0050j7.getClass();
                                int ordinal = enumC0064y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0064y enumC0064y2 = EnumC0064y.f418f;
                                    c0050j7.f366a.getClass();
                                    throw new IllegalArgumentException(enumC0064y2 + " doesn't represent a native value.");
                                }
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            return;
                    }
                }
            });
        }
    }

    public static void E(InterfaceC0320f interfaceC0320f, final C0050j c0050j) {
        O o2;
        h.e(interfaceC0320f, "binaryMessenger");
        k c0042b = (c0050j == null || (o2 = c0050j.f366a) == null) ? new C0042b() : o2.a();
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", c0042b, obj);
        if (c0050j != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i2) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", c0042b, obj);
        if (c0050j != null) {
            final int i3 = 15;
            c0079n2.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i3) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", c0042b, obj);
        if (c0050j != null) {
            final int i4 = 16;
            c0079n3.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i4) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", c0042b, obj);
        if (c0050j != null) {
            final int i5 = 1;
            c0079n4.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i5) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", c0042b, obj);
        if (c0050j != null) {
            final int i6 = 2;
            c0079n5.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i6) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", c0042b, obj);
        if (c0050j != null) {
            final int i7 = 3;
            c0079n6.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i7) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n6.i(null);
        }
        C0079n c0079n7 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", c0042b, obj);
        if (c0050j != null) {
            final int i8 = 4;
            c0079n7.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i8) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n7.i(null);
        }
        C0079n c0079n8 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", c0042b, obj);
        if (c0050j != null) {
            final int i9 = 5;
            c0079n8.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i9) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n8.i(null);
        }
        C0079n c0079n9 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", c0042b, obj);
        if (c0050j != null) {
            final int i10 = 6;
            c0079n9.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i10) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n9.i(null);
        }
        C0079n c0079n10 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", c0042b, obj);
        if (c0050j != null) {
            final int i11 = 7;
            c0079n10.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i11) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n10.i(null);
        }
        C0079n c0079n11 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", c0042b, obj);
        if (c0050j != null) {
            final int i12 = 8;
            c0079n11.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i12) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n11.i(null);
        }
        C0079n c0079n12 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", c0042b, obj);
        if (c0050j != null) {
            final int i13 = 9;
            c0079n12.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i13) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n12.i(null);
        }
        C0079n c0079n13 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", c0042b, obj);
        if (c0050j != null) {
            final int i14 = 10;
            c0079n13.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i14) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n13.i(null);
        }
        C0079n c0079n14 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", c0042b, obj);
        if (c0050j != null) {
            final int i15 = 11;
            c0079n14.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i15) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n14.i(null);
        }
        C0079n c0079n15 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", c0042b, obj);
        if (c0050j != null) {
            final int i16 = 12;
            c0079n15.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i16) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n15.i(null);
        }
        C0079n c0079n16 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", c0042b, obj);
        if (c0050j != null) {
            final int i17 = 13;
            c0079n16.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i17) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        } else {
            c0079n16.i(null);
        }
        C0079n c0079n17 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", c0042b, obj);
        if (c0050j == null) {
            c0079n17.i(null);
        } else {
            final int i18 = 14;
            c0079n17.i(new InterfaceC0316b() { // from class: D0.K
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
                    switch (i18) {
                        case 0:
                            C0050j c0050j2 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Q0.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0050j2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                L2 = i1.a.u(null);
                            } catch (Throwable th) {
                                L2 = i1.a.L(th);
                            }
                            o3.b(L2);
                            break;
                        case 1:
                            C0050j c0050j3 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0050j3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                L3 = i1.a.u(null);
                            } catch (Throwable th2) {
                                L3 = i1.a.L(th2);
                            }
                            o3.b(L3);
                            break;
                        case 2:
                            C0050j c0050j4 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Q0.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0050j4.getClass();
                                webSettings3.setUserAgentString(str);
                                L4 = i1.a.u(null);
                            } catch (Throwable th3) {
                                L4 = i1.a.L(th3);
                            }
                            o3.b(L4);
                            break;
                        case 3:
                            C0050j c0050j5 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0050j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                L5 = i1.a.u(null);
                            } catch (Throwable th4) {
                                L5 = i1.a.L(th4);
                            }
                            o3.b(L5);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0050j c0050j6 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0050j6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                L6 = i1.a.u(null);
                            } catch (Throwable th5) {
                                L6 = i1.a.L(th5);
                            }
                            o3.b(L6);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0050j c0050j7 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0050j7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                L7 = i1.a.u(null);
                            } catch (Throwable th6) {
                                L7 = i1.a.L(th6);
                            }
                            o3.b(L7);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0050j c0050j8 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0050j8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                L8 = i1.a.u(null);
                            } catch (Throwable th7) {
                                L8 = i1.a.L(th7);
                            }
                            o3.b(L8);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0050j c0050j9 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0050j9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                L9 = i1.a.u(null);
                            } catch (Throwable th8) {
                                L9 = i1.a.L(th8);
                            }
                            o3.b(L9);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0050j c0050j10 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0050j10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                L10 = i1.a.u(null);
                            } catch (Throwable th9) {
                                L10 = i1.a.L(th9);
                            }
                            o3.b(L10);
                            break;
                        case 9:
                            C0050j c0050j11 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Q0.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0050j11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                L11 = i1.a.u(null);
                            } catch (Throwable th10) {
                                L11 = i1.a.L(th10);
                            }
                            o3.b(L11);
                            break;
                        case 10:
                            C0050j c0050j12 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Q0.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0050j12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L12 = i1.a.u(null);
                            } catch (Throwable th11) {
                                L12 = i1.a.L(th11);
                            }
                            o3.b(L12);
                            break;
                        case 11:
                            C0050j c0050j13 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Q0.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0050j13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                L13 = i1.a.u(null);
                            } catch (Throwable th12) {
                                L13 = i1.a.L(th12);
                            }
                            o3.b(L13);
                            break;
                        case 12:
                            C0050j c0050j14 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0050j14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L14 = i1.a.u(null);
                            } catch (Throwable th13) {
                                L14 = i1.a.L(th13);
                            }
                            o3.b(L14);
                            break;
                        case 13:
                            C0050j c0050j15 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Q0.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0050j15.getClass();
                                L15 = i1.a.u(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                L15 = i1.a.L(th14);
                            }
                            o3.b(L15);
                            break;
                        case 14:
                            C0050j c0050j16 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0063x enumC0063x = (EnumC0063x) obj30;
                            try {
                                c0050j16.getClass();
                                int ordinal = enumC0063x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                L16 = i1.a.u(null);
                            } catch (Throwable th15) {
                                L16 = i1.a.L(th15);
                            }
                            o3.b(L16);
                            break;
                        case 15:
                            C0050j c0050j17 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Q0.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0050j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                L17 = i1.a.u(null);
                            } catch (Throwable th16) {
                                L17 = i1.a.L(th16);
                            }
                            o3.b(L17);
                            break;
                        default:
                            C0050j c0050j18 = c0050j;
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Q0.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0050j18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                L18 = i1.a.u(null);
                            } catch (Throwable th17) {
                                L18 = i1.a.L(th17);
                            }
                            o3.b(L18);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F(p pVar, AbstractC0107a abstractC0107a, AbstractC0107a abstractC0107a2) {
        try {
            AbstractC0184a.h(t(((b) pVar).b(abstractC0107a2, abstractC0107a)), F0.h.f469a, null);
        } catch (Throwable th) {
            abstractC0107a2.j(b(th));
            throw th;
        }
    }

    public static final void G(Object obj) {
        if (obj instanceof d) {
            throw ((d) obj).f463e;
        }
    }

    public static String H(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean I(String str, P0.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.g()).booleanValue();
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

    public static ActionMode.Callback J(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static ArrayList K(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static List L(Throwable th) {
        if (th instanceof C0041a) {
            C0041a c0041a = (C0041a) th;
            return e.O(c0041a.f306e, ((C0041a) th).f307f, c0041a.f308g);
        }
        return e.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static ArrayList M(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static ArrayList N(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0.b) {
            C0.b bVar = (C0.b) th;
            arrayList.add(bVar.f219e);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final d b(Throwable th) {
        h.e(th, "exception");
        return new d(th);
    }

    public static boolean h(Method method, Q0.e eVar) {
        Class a2 = eVar.a();
        h.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static String j(C0144g c0144g) {
        StringBuilder sb = new StringBuilder(c0144g.size());
        for (int i2 = 0; i2 < c0144g.size(); i2++) {
            byte a2 = c0144g.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case K.k.BYTES_FIELD_NUMBER /* 8 */:
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
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
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

    public static InvocationHandler k() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static g m(g gVar, H0.h hVar) {
        h.e(hVar, "key");
        if (h.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0046, code lost:
    
        if (r5.f3418c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList n(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0300k c0300k;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0301l c0301l = new C0301l(resources, theme);
        synchronized (AbstractC0302m.f3423c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0302m.f3422b.get(c0301l);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c0300k = (C0300k) sparseArray.get(i2)) != null) {
                    if (c0300k.f3417b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (c0300k.f3418c != 0) {
                            }
                            colorStateList2 = c0300k.f3416a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = AbstractC0302m.f3421a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = AbstractC0292c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? AbstractC0299j.b(resources, i2, theme) : resources.getColorStateList(i2);
        }
        AbstractC0302m.a(c0301l, i2, colorStateList, theme);
        return colorStateList;
    }

    public static String o(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT < 24) {
            return context.getApplicationInfo().dataDir;
        }
        dataDir = context.getDataDir();
        return dataDir.getPath();
    }

    public static float p(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return F.e.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class q(V0.b bVar) {
        h.e(bVar, "<this>");
        Class a2 = ((Q0.d) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static C0333a r(C0245v c0245v) {
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new C0333a(F.p.c(c0245v));
        }
        TextPaint textPaint = new TextPaint(c0245v.getPaint());
        if (i4 >= 23) {
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 0;
            i3 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i4 >= 23) {
            i2 = n.a(c0245v);
            i3 = n.d(c0245v);
        }
        if (c0245v.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 < 28 || (c0245v.getInputType() & 15) != 3) {
            boolean z2 = c0245v.getLayoutDirection() == 1;
            switch (c0245v.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(F.p.b(o.a(c0245v.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C0333a(textPaint, textDirectionHeuristic, i2, i3);
    }

    public static void s(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static H0.d t(H0.d dVar) {
        h.e(dVar, "<this>");
        b bVar = dVar instanceof b ? (b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        H0.d dVar2 = bVar.f738g;
        if (dVar2 != null) {
            return dVar2;
        }
        f fVar = (f) bVar.f().k(H0.e.f502e);
        H0.d hVar = fVar != null ? new d1.h((AbstractC0124s) fVar, bVar) : bVar;
        bVar.f738g = hVar;
        return hVar;
    }

    public static List u(Object obj) {
        List singletonList = Collections.singletonList(obj);
        h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static i v(g gVar, H0.h hVar) {
        h.e(hVar, "key");
        return h.a(gVar.getKey(), hVar) ? j.f503e : gVar;
    }

    public static float w(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return F.e.c(edgeEffect, f2, f3);
        }
        F.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void x(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            F.p.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void y(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        u0 u0Var = u0.f3066j;
        if (u0Var != null && u0Var.f3068a == view) {
            u0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new u0(view, charSequence);
            return;
        }
        u0 u0Var2 = u0.f3067k;
        if (u0Var2 != null && u0Var2.f3068a == view) {
            u0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract Typeface c(Context context, C0295f c0295f, Resources resources, int i2);

    public abstract Typeface d(Context context, C0329h[] c0329hArr, int i2);

    public Typeface e(Context context, InputStream inputStream) {
        File d2 = AbstractC0310a.d(context);
        if (d2 == null) {
            return null;
        }
        try {
            if (AbstractC0310a.c(d2, inputStream)) {
                return Typeface.createFromFile(d2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d2.delete();
        }
    }

    public Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        File d2 = AbstractC0310a.d(context);
        if (d2 == null) {
            return null;
        }
        try {
            if (AbstractC0310a.b(d2, resources, i2)) {
                return Typeface.createFromFile(d2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d2.delete();
        }
    }

    public abstract String g(byte[] bArr, int i2, int i3);

    public abstract int i(String str, byte[] bArr, int i2, int i3);

    public C0329h l(C0329h[] c0329hArr, int i2) {
        new t.k(0);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        C0329h c0329h = null;
        int i4 = Integer.MAX_VALUE;
        for (C0329h c0329h2 : c0329hArr) {
            int abs = (Math.abs(c0329h2.f3585c - i3) * 2) + (c0329h2.f3586d == z2 ? 0 : 1);
            if (c0329h == null || i4 > abs) {
                c0329h = c0329h2;
                i4 = abs;
            }
        }
        return c0329h;
    }
}
