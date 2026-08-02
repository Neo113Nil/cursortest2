package S0;

import A0.d;
import B0.p;
import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import P1.f;
import P1.k;
import U1.B;
import U1.C0082c;
import U1.C0086g;
import U1.m;
import U1.n;
import U1.q;
import U1.v;
import U1.w;
import U1.z;
import Y1.C0105b;
import Y1.C0113j;
import Y1.C0117n;
import a.AbstractC0129a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Environment;
import android.os.Trace;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b0.s;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.impl.C0642l9;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import l.s0;
import l2.l;
import m0.EnumC1112e;
import n0.C1139a;
import n0.C1147i;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC1183a;
import w.C1231b;
import w.InterfaceC1230a;
import y1.InterfaceC1255c;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC1255c {

    /* renamed from: b, reason: collision with root package name */
    public static Context f1327b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f1328c = null;

    /* renamed from: d, reason: collision with root package name */
    public static long f1329d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1330e = null;
    public static Method f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f1331g = null;

    /* renamed from: h, reason: collision with root package name */
    public static int f1332h = 2;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1333a;

    public /* synthetic */ a(int i3) {
        this.f1333a = i3;
    }

    public static void A(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e3) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }

    public static void C(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        s0 s0Var = s0.f9887j;
        if (s0Var != null && s0Var.f9889a == view) {
            s0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new s0(charSequence, view);
            return;
        }
        s0 s0Var2 = s0.f9888k;
        if (s0Var2 != null && s0Var2.f9889a == view) {
            s0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void D(f binaryMessenger, final C0113j c0113j) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0113j == null || (dVar = c0113j.f1861a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.z
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    switch (i3) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c0113j2.getClass();
                                clientCertRequest.cancel();
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c0113j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c0113j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.z
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    switch (i4) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c0113j2.getClass();
                                clientCertRequest.cancel();
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c0113j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c0113j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", c0105b, (K0.j) null);
        if (c0113j == null) {
            pVar3.i(null);
        } else {
            final int i5 = 2;
            pVar3.i(new P1.b() { // from class: Y1.z
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    switch (i5) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c0113j2.getClass();
                                clientCertRequest.cancel();
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c0113j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C0113j c0113j4 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c0113j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
                    }
                }
            });
        }
    }

    public static void E(f binaryMessenger, final C0117n c0117n) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0117n == null || (dVar = c0117n.f1873a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.F
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    X509Certificate x509Certificate;
                    switch (i3) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0117n2.getClass();
                                L = AbstractC0129a.r(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0117n3.getClass();
                                L2 = AbstractC0129a.r(sslCertificate2.getIssuedTo());
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0117n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L3 = AbstractC0129a.r(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0117n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L4 = AbstractC0129a.r(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0117n6.f1873a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L5 = AbstractC0129a.r(x509Certificate);
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
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.F
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    X509Certificate x509Certificate;
                    switch (i4) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0117n2.getClass();
                                L = AbstractC0129a.r(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0117n3.getClass();
                                L2 = AbstractC0129a.r(sslCertificate2.getIssuedTo());
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0117n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L3 = AbstractC0129a.r(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0117n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L4 = AbstractC0129a.r(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0117n6.f1873a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L5 = AbstractC0129a.r(x509Certificate);
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
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i5 = 2;
            pVar3.i(new P1.b() { // from class: Y1.F
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    X509Certificate x509Certificate;
                    switch (i5) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0117n2.getClass();
                                L = AbstractC0129a.r(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0117n3.getClass();
                                L2 = AbstractC0129a.r(sslCertificate2.getIssuedTo());
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0117n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L3 = AbstractC0129a.r(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0117n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L4 = AbstractC0129a.r(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0117n6.f1873a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L5 = AbstractC0129a.r(x509Certificate);
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
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i6 = 3;
            pVar4.i(new P1.b() { // from class: Y1.F
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    X509Certificate x509Certificate;
                    switch (i6) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0117n2.getClass();
                                L = AbstractC0129a.r(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0117n3.getClass();
                                L2 = AbstractC0129a.r(sslCertificate2.getIssuedTo());
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0117n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L3 = AbstractC0129a.r(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0117n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L4 = AbstractC0129a.r(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0117n6.f1873a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L5 = AbstractC0129a.r(x509Certificate);
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
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", c0105b, (K0.j) null);
        if (c0117n == null) {
            pVar5.i(null);
        } else {
            final int i7 = 4;
            pVar5.i(new P1.b() { // from class: Y1.F
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    X509Certificate x509Certificate;
                    switch (i7) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0117n2.getClass();
                                L = AbstractC0129a.r(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0117n3.getClass();
                                L2 = AbstractC0129a.r(sslCertificate2.getIssuedTo());
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0117n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                L3 = AbstractC0129a.r(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0117n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                L4 = AbstractC0129a.r(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0117n6.f1873a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                L5 = AbstractC0129a.r(x509Certificate);
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
                    }
                }
            });
        }
    }

    public static void F(f binaryMessenger, final C0117n c0117n) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0117n == null || (dVar = c0117n.f1873a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.K
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
                    switch (i3) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i4 = 15;
            pVar2.i(new P1.b() { // from class: Y1.K
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
                    switch (i4) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i5 = 16;
            pVar3.i(new P1.b() { // from class: Y1.K
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
                    switch (i5) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i6 = 1;
            pVar4.i(new P1.b() { // from class: Y1.K
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
                    switch (i6) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i7 = 2;
            pVar5.i(new P1.b() { // from class: Y1.K
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
                    switch (i7) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        p pVar6 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i8 = 3;
            pVar6.i(new P1.b() { // from class: Y1.K
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
                    switch (i8) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        p pVar7 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i9 = 4;
            pVar7.i(new P1.b() { // from class: Y1.K
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
                    switch (i9) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar7.i(null);
        }
        p pVar8 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i10 = 5;
            pVar8.i(new P1.b() { // from class: Y1.K
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
                    switch (i10) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar8.i(null);
        }
        p pVar9 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i11 = 6;
            pVar9.i(new P1.b() { // from class: Y1.K
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
                    switch (i11) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar9.i(null);
        }
        p pVar10 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i12 = 7;
            pVar10.i(new P1.b() { // from class: Y1.K
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
                    switch (i12) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar10.i(null);
        }
        p pVar11 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i13 = 8;
            pVar11.i(new P1.b() { // from class: Y1.K
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
                    switch (i13) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar11.i(null);
        }
        p pVar12 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i14 = 9;
            pVar12.i(new P1.b() { // from class: Y1.K
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
                    switch (i14) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar12.i(null);
        }
        p pVar13 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i15 = 10;
            pVar13.i(new P1.b() { // from class: Y1.K
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
                    switch (i15) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar13.i(null);
        }
        p pVar14 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i16 = 11;
            pVar14.i(new P1.b() { // from class: Y1.K
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
                    switch (i16) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar14.i(null);
        }
        p pVar15 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i17 = 12;
            pVar15.i(new P1.b() { // from class: Y1.K
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
                    switch (i17) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar15.i(null);
        }
        p pVar16 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i18 = 13;
            pVar16.i(new P1.b() { // from class: Y1.K
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
                    switch (i18) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        } else {
            pVar16.i(null);
        }
        p pVar17 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", c0105b, (K0.j) null);
        if (c0117n == null) {
            pVar17.i(null);
        } else {
            final int i19 = 14;
            pVar17.i(new P1.b() { // from class: Y1.K
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
                    switch (i19) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0117n2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0117n3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0117n4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            C0117n c0117n5 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0117n5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            C0117n c0117n6 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                            C0117n c0117n7 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                            C0117n c0117n8 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0117n8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                            C0117n c0117n9 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0117n9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
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
                            C0117n c0117n10 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0117n10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
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
                            C0117n c0117n11 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0117n11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
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
                            C0117n c0117n12 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0117n12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                L11 = AbstractC0129a.r(null);
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
                            C0117n c0117n13 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0117n13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
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
                            C0117n c0117n14 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                c0117n14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                L13 = AbstractC0129a.r(null);
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
                            C0117n c0117n15 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0117n15.getClass();
                                L14 = AbstractC0129a.r(webSettings14.getUserAgentString());
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
                            C0117n c0117n16 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0126x enumC0126x = (EnumC0126x) obj29;
                            try {
                                c0117n16.getClass();
                                int ordinal = enumC0126x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            C0117n c0117n17 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0117n17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
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
                        default:
                            C0117n c0117n18 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0117n18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
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
                    }
                }
            });
        }
    }

    public static void G(XmlResourceParser xmlResourceParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static void H(ContentResolver contentResolver, Bitmap bitmap, long j3) {
        Matrix matrix = new Matrix();
        matrix.setScale(50.0f / bitmap.getWidth(), 50.0f / bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        ContentValues contentValues = new ContentValues();
        contentValues.put("kind", (Integer) 3);
        contentValues.put("image_id", Integer.valueOf((int) j3));
        contentValues.put("height", Integer.valueOf(createBitmap.getHeight()));
        contentValues.put("width", Integer.valueOf(createBitmap.getWidth()));
        Uri insert = contentResolver.insert(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, contentValues);
        if (insert != null) {
            try {
                contentResolver.openOutputStream(insert);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public static Integer I(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static int J(AbstractActivityC0029e abstractActivityC0029e, String str, int i3) {
        if (i3 == -1) {
            return h(abstractActivityC0029e, str);
        }
        return 1;
    }

    public static v K(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3541555) {
            if (hashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return v.SUBS;
        }
        return v.INAPP;
    }

    public static ArrayList L(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B b3 = (B) it.next();
            C1139a c1139a = new C1139a();
            c1139a.f10052a = b3.f1466a;
            c1139a.f10053b = M(b3.f1467b);
            arrayList.add(c1139a.a());
        }
        return arrayList;
    }

    public static String M(v vVar) {
        int ordinal = vVar.ordinal();
        if (ordinal == 0) {
            return "inapp";
        }
        if (ordinal == 1) {
            return "subs";
        }
        throw new C0082c("UNKNOWN_TYPE", "Unknown product type: " + vVar, null);
    }

    public static String N(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static Object O(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(O(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                jSONArray2.put(O(Array.get(obj, i3)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), O(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static void a(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
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

    public static final long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j3 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j3 += read;
            read = inputStream.read(bArr);
        }
        return j3;
    }

    public static String d(Object value, String str) {
        j.e(value, "value");
        return str + " value: " + value;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String g(Context context, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && t(context, str, null)) {
            return str;
        }
        if (i3 < 29) {
            if (!t(context, "android.permission.ACCESS_FINE_LOCATION", null)) {
                if (t(context, "android.permission.ACCESS_COARSE_LOCATION", null)) {
                    return "android.permission.ACCESS_COARSE_LOCATION";
                }
                return null;
            }
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (t(context, "android.permission.ACCESS_FINE_LOCATION", null)) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    public static int h(AbstractActivityC0029e abstractActivityC0029e, String str) {
        if (abstractActivityC0029e != null) {
            boolean z = abstractActivityC0029e.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
            boolean C3 = AbstractC0129a.C(abstractActivityC0029e, str);
            if (z) {
                C3 = !C3;
            }
            if (!z && C3) {
                abstractActivityC0029e.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
            }
            if (z && C3) {
                return 4;
            }
        }
        return 0;
    }

    public static InvocationHandler i() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static n j(C1147i c1147i) {
        m mVar;
        int i3 = c1147i.f10092a;
        if (i3 != 12) {
            mVar = m.ERROR;
            switch (i3) {
                case -2:
                    mVar = m.FEATURE_NOT_SUPPORTED;
                    break;
                case -1:
                    mVar = m.SERVICE_DISCONNECTED;
                    break;
                case 0:
                    mVar = m.OK;
                    break;
                case 1:
                    mVar = m.USER_CANCELED;
                    break;
                case 2:
                    mVar = m.SERVICE_UNAVAILABLE;
                    break;
                case 3:
                    mVar = m.BILLING_UNAVAILABLE;
                    break;
                case 4:
                    mVar = m.ITEM_UNAVAILABLE;
                    break;
                case 5:
                    mVar = m.DEVELOPER_ERROR;
                    break;
                case 7:
                    mVar = m.ITEM_ALREADY_OWNED;
                    break;
                case 8:
                    mVar = m.ITEM_NOT_OWNED;
                    break;
            }
        } else {
            mVar = m.NETWORK_ERROR;
        }
        String str = c1147i.f10093b;
        n nVar = new n();
        nVar.f1535a = mVar;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
        }
        nVar.f1536b = str;
        return nVar;
    }

    public static List k(List list) {
        Iterator it;
        C1139a c1139a;
        C0086g c0086g;
        ArrayList arrayList;
        C0086g c0086g2;
        z zVar;
        q qVar;
        JSONArray optJSONArray;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            String optString = purchase.f2650c.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                optString = null;
            }
            JSONObject jSONObject = purchase.f2650c;
            String optString2 = jSONObject.optString("packageName");
            Long valueOf = Long.valueOf(jSONObject.optLong("purchaseTime"));
            String b3 = purchase.b();
            ArrayList a3 = purchase.a();
            Boolean valueOf2 = Boolean.valueOf(jSONObject.optBoolean("autoRenewing"));
            String optString3 = jSONObject.optString("developerPayload");
            Boolean valueOf3 = Boolean.valueOf(jSONObject.optBoolean("acknowledged", true));
            char c3 = jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2;
            z zVar2 = z.UNSPECIFIED;
            if (c3 != 0) {
                if (c3 == 1) {
                    zVar2 = z.PURCHASED;
                } else if (c3 == 2) {
                    zVar2 = z.PENDING;
                }
            }
            Long valueOf4 = Long.valueOf(jSONObject.optInt("quantity", 1));
            String optString4 = jSONObject.optString("obfuscatedAccountId");
            String optString5 = jSONObject.optString("obfuscatedProfileId");
            if (optString4 == null && optString5 == null) {
                it = it2;
                c1139a = null;
            } else {
                it = it2;
                c1139a = new C1139a();
                c1139a.f10052a = optString4;
                c1139a.f10053b = optString5;
            }
            if (c1139a != null) {
                c0086g = new C0086g();
                c0086g.f1506a = c1139a.f10052a;
                c0086g.f1507b = c1139a.f10053b;
            } else {
                c0086g = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("pendingPurchaseUpdate");
            s sVar = optJSONObject == null ? null : new s(optJSONObject);
            if (sVar != null) {
                JSONObject jSONObject2 = (JSONObject) sVar.f2544a;
                String optString6 = jSONObject2.optString("purchaseToken");
                arrayList = arrayList2;
                ArrayList arrayList3 = new ArrayList();
                c0086g2 = c0086g;
                if (!jSONObject2.has("productIds") || (optJSONArray = jSONObject2.optJSONArray("productIds")) == null) {
                    zVar = zVar2;
                } else {
                    zVar = zVar2;
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        arrayList3.add(optJSONArray.optString(i3));
                    }
                }
                qVar = new q();
                qVar.f1542a = arrayList3;
                if (optString6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                qVar.f1543b = optString6;
            } else {
                arrayList = arrayList2;
                c0086g2 = c0086g;
                zVar = zVar2;
                qVar = null;
            }
            w wVar = new w();
            wVar.f1562a = optString;
            if (optString2 == null) {
                throw new IllegalStateException("Nonnull field \"packageName\" is null.");
            }
            wVar.f1563b = optString2;
            wVar.f1564c = valueOf;
            if (b3 == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            wVar.f1565d = b3;
            String str = purchase.f2649b;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signature\" is null.");
            }
            wVar.f1566e = str;
            wVar.f = a3;
            wVar.f1567g = valueOf2;
            String str2 = purchase.f2648a;
            if (str2 == null) {
                throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
            }
            wVar.f1568h = str2;
            if (optString3 == null) {
                throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
            }
            wVar.f1569i = optString3;
            wVar.f1570j = valueOf3;
            wVar.f1571k = valueOf4;
            wVar.f1572l = zVar;
            wVar.f1573m = c0086g2;
            wVar.f1574n = qVar;
            ArrayList arrayList4 = arrayList;
            arrayList4.add(wVar);
            arrayList2 = arrayList4;
            it2 = it;
        }
        return arrayList2;
    }

    public static String l(String str, EnumC1112e enumC1112e, boolean z) {
        String path = Environment.getExternalStorageDirectory().getPath();
        j.d(path, "getPath(...)");
        if (z && Build.VERSION.SDK_INT < 29) {
            path = AbstractC0033i.k(path, File.separator, Environment.DIRECTORY_DCIM);
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            String str3 = enumC1112e == EnumC1112e.f9958a ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES;
            if (z) {
                str3 = Environment.DIRECTORY_DCIM;
            }
            String path2 = Environment.getExternalStoragePublicDirectory(str3).getPath();
            j.d(path2, "getPath(...)");
            File file = new File(path2);
            if (file.exists()) {
                str2 = file.getPath();
            } else if (file.mkdirs()) {
                str2 = file.getPath();
            }
            if (str2 != null) {
                return str2;
            }
        } else {
            File file2 = new File(AbstractC0033i.k(path, File.separator, str));
            if (file2.exists()) {
                str2 = file2.getPath();
            } else if (file2.mkdirs()) {
                str2 = file2.getPath();
            }
            if (str2 != null) {
                return str2;
            }
        }
        return path;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012f, code lost:
    
        if (r6 != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList n(Context context, int i3) {
        boolean isExternalStorageLegacy;
        String g3;
        String g4;
        String g5;
        ArrayList arrayList = new ArrayList();
        switch (i3) {
            case 0:
            case 37:
                if (t(context, "android.permission.WRITE_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (t(context, "android.permission.READ_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (t(context, "android.permission.CAMERA", arrayList)) {
                    arrayList.add("android.permission.CAMERA");
                    return arrayList;
                }
                return arrayList;
            case 2:
                if (t(context, "android.permission.READ_CONTACTS", arrayList)) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (t(context, "android.permission.WRITE_CONTACTS", arrayList)) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (t(context, "android.permission.GET_ACCOUNTS", arrayList)) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    return arrayList;
                }
                return arrayList;
            case 3:
            case 4:
            case 5:
                if (i3 != 4 || Build.VERSION.SDK_INT < 29) {
                    if (t(context, "android.permission.ACCESS_COARSE_LOCATION", arrayList)) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (t(context, "android.permission.ACCESS_FINE_LOCATION", arrayList)) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        return arrayList;
                    }
                } else if (t(context, "android.permission.ACCESS_BACKGROUND_LOCATION", arrayList)) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 6:
            case 11:
            case C0642l9.f7778D /* 20 */:
                return null;
            case 7:
            case 14:
                if (t(context, "android.permission.RECORD_AUDIO", arrayList)) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 8:
                if (t(context, "android.permission.READ_PHONE_STATE", arrayList)) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 > 29 && t(context, "android.permission.READ_PHONE_NUMBERS", arrayList)) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (t(context, "android.permission.CALL_PHONE", arrayList)) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (t(context, "android.permission.READ_CALL_LOG", arrayList)) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (t(context, "android.permission.WRITE_CALL_LOG", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (t(context, "com.android.voicemail.permission.ADD_VOICEMAIL", arrayList)) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (t(context, "android.permission.USE_SIP", arrayList)) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i4 >= 26 && t(context, "android.permission.ANSWER_PHONE_CALLS", arrayList)) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    return arrayList;
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && t(context, "android.permission.READ_MEDIA_IMAGES", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    return arrayList;
                }
                return arrayList;
            case 10:
            case C0642l9.f7780F /* 25 */:
            case C0642l9.f7781G /* 26 */:
            default:
                return arrayList;
            case 12:
                if (t(context, "android.permission.BODY_SENSORS", arrayList)) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    return arrayList;
                }
                return arrayList;
            case 13:
                if (t(context, "android.permission.SEND_SMS", arrayList)) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (t(context, "android.permission.RECEIVE_SMS", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (t(context, "android.permission.READ_SMS", arrayList)) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (t(context, "android.permission.RECEIVE_WAP_PUSH", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (t(context, "android.permission.RECEIVE_MMS", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    return arrayList;
                }
                return arrayList;
            case 15:
                if (t(context, "android.permission.READ_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 29) {
                    if (i5 == 29) {
                        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
                        break;
                    }
                    return arrayList;
                }
                if (t(context, "android.permission.WRITE_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 16:
                if (t(context, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", arrayList)) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    return arrayList;
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && t(context, "android.permission.POST_NOTIFICATIONS", arrayList)) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    return arrayList;
                }
                return arrayList;
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (t(context, "android.permission.ACCESS_MEDIA_LOCATION", arrayList)) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case C0642l9.f7777C /* 19 */:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (t(context, "android.permission.ACTIVITY_RECOGNITION", arrayList)) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                    return arrayList;
                }
                return arrayList;
            case C0642l9.f7779E /* 21 */:
                if (t(context, "android.permission.BLUETOOTH", arrayList)) {
                    arrayList.add("android.permission.BLUETOOTH");
                    return arrayList;
                }
                return arrayList;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && t(context, "android.permission.MANAGE_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 23:
                if (t(context, "android.permission.SYSTEM_ALERT_WINDOW", arrayList)) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    return arrayList;
                }
                return arrayList;
            case 24:
                if (t(context, "android.permission.REQUEST_INSTALL_PACKAGES", arrayList)) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    return arrayList;
                }
                return arrayList;
            case C0642l9.f7782H /* 27 */:
                if (t(context, "android.permission.ACCESS_NOTIFICATION_POLICY", arrayList)) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    return arrayList;
                }
                return arrayList;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (g3 = g(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(g3);
                    return arrayList;
                }
                return arrayList;
            case C0642l9.f7783I /* 29 */:
                if (Build.VERSION.SDK_INT >= 31 && (g4 = g(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(g4);
                    return arrayList;
                }
                return arrayList;
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (g5 = g(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(g5);
                    return arrayList;
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && t(context, "android.permission.NEARBY_WIFI_DEVICES", arrayList)) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    return arrayList;
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && t(context, "android.permission.READ_MEDIA_VIDEO", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    return arrayList;
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && t(context, "android.permission.READ_MEDIA_AUDIO", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 34:
                if (t(context, "android.permission.SCHEDULE_EXACT_ALARM", arrayList)) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    return arrayList;
                }
                return arrayList;
            case C0642l9.f7784J /* 35 */:
                if (Build.VERSION.SDK_INT >= 33 && t(context, "android.permission.BODY_SENSORS_BACKGROUND", arrayList)) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                    return arrayList;
                }
                return arrayList;
            case 36:
                if (t(context, "android.permission.WRITE_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    return arrayList;
                }
                return arrayList;
        }
    }

    public static void r(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean t(Context context, String str, ArrayList arrayList) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e3) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e3);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        }
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int u(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        if (i3 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC0033i.h(i3, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean v() {
        if (Build.VERSION.SDK_INT >= 29) {
            return X.a.c();
        }
        try {
            if (f1330e == null) {
                f1329d = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1330e = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1330e.invoke(null, Long.valueOf(f1329d))).booleanValue();
        } catch (Exception e3) {
            r("isTagEnabled", e3);
            return false;
        }
    }

    public static InterfaceC1230a w(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i3;
        int i4;
        int i5;
        do {
            next = xmlResourceParser.next();
            i3 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            G(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1183a.f10285a);
        int i6 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i7 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1183a.f10286b);
                        int i8 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i9 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i10 = obtainAttributes2.getInt(i9, 0);
                        int i11 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                        String string7 = obtainAttributes2.getString(i11);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            G(xmlResourceParser);
                        }
                        arrayList.add(new w.c(string7, i8, z, string6, i10, resourceId2));
                    } else {
                        G(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1231b((w.c[]) arrayList.toArray(new w.c[0]));
        }
        List z2 = z(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i7) {
            if (xmlResourceParser.getEventType() == i3) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1183a.f10287c);
                    try {
                        String string8 = obtainAttributes3.getString(i6);
                        String string9 = obtainAttributes3.getString(1);
                        i5 = integer;
                        String string10 = obtainAttributes3.getString(i3);
                        if (string8 == null) {
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i7) {
                            G(xmlResourceParser);
                        }
                        i4 = integer2;
                        B.f fVar = new B.f(string, string2, string8, z2, string9, string10);
                        obtainAttributes3.recycle();
                        arrayList2.add(fVar);
                    } finally {
                    }
                } else {
                    i4 = integer2;
                    i5 = integer;
                    G(xmlResourceParser);
                }
                integer2 = i4;
                integer = i5;
                i3 = 2;
                i6 = 0;
                i7 = 3;
            }
        }
        int i12 = integer2;
        int i13 = integer;
        if (!arrayList2.isEmpty()) {
            return new w.d(arrayList2, i13, i12, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new B.f(string, string2, string3, z2, null, null));
        if (string4 != null) {
            arrayList2.add(new B.f(string, string2, string4, z2, null, null));
        }
        return new w.d(arrayList2, i13, i12, string5);
    }

    public static void x(I1.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i3 = 0; i3 < trackCount; i3++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i4 = dVar.f621g;
                    int i5 = dVar.f;
                    if (integer != 90 && integer != 270) {
                        i5 = i4;
                        i4 = i5;
                    }
                    dVar.f617b = i4;
                    dVar.f616a = i5;
                    dVar.f618c = integer;
                    return;
                }
            }
        } catch (Exception e3) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
        }
    }

    public static final byte[] y(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        c(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static List z(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
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
                String[] stringArray2 = resources.getStringArray(i3);
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

    public abstract a B(String str, l lVar);

    public abstract void P(byte[] bArr, int i3, int i4);

    public abstract Object b();

    @Override // y1.InterfaceC1255c
    public void e(Serializable serializable) {
        q().e(serializable);
    }

    @Override // y1.InterfaceC1255c
    public void f(String str, HashMap hashMap) {
        q().f(str, hashMap);
    }

    public abstract Object m(String str);

    public abstract String o();

    public boolean p() {
        return Boolean.TRUE.equals(m("noResult"));
    }

    public abstract InterfaceC1255c q();

    public abstract boolean s();

    public String toString() {
        switch (this.f1333a) {
            case 23:
                return o() + " " + ((String) m("sql")) + " " + ((List) m("arguments"));
            default:
                return super.toString();
        }
    }
}
