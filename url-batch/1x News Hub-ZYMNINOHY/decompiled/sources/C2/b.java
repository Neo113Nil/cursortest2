package C2;

import A0.d;
import B0.p;
import E.C;
import E1.AbstractC0033i;
import L0.g;
import M0.m;
import P1.f;
import P1.k;
import U1.C0082c;
import Y1.C0105b;
import Y1.C0113j;
import a.AbstractC0129a;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.HttpAuthHandler;
import b0.AbstractC0172c;
import b0.AbstractC0182m;
import b0.C0171b;
import b0.InterfaceC0173d;
import c2.c;
import c2.o;
import c2.q;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d2.C0301d;
import d2.InterfaceC0300c;
import d2.InterfaceC0302e;
import d2.h;
import d2.i;
import e.C0304a;
import e2.C0318b;
import e2.C0319c;
import e2.C0320d;
import e2.C0321e;
import e2.EnumC0317a;
import f2.AbstractC0324a;
import f2.AbstractC0326c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import l2.l;
import t2.AbstractC1191a;
import t2.AbstractC1208s;
import t2.AbstractC1212w;
import t2.C1204n;
import w0.AbstractC1234c;
import y2.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f223a;

    public static void A(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static MappedByteBuffer B(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void E(Window window, boolean z) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            C.d(window, z);
        } else {
            if (i3 >= 30) {
                C.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static Set F(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return o.f2639a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(q.Z(objArr.length));
            c.V(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        j.d(singleton, "singleton(...)");
        return singleton;
    }

    public static void G(f binaryMessenger, final C0113j c0113j) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0113j == null || (dVar = c0113j.f1861a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.D
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
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c0113j3.getClass();
                                httpAuthHandler2.cancel();
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
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0113j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
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
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.D
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
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c0113j3.getClass();
                                httpAuthHandler2.cancel();
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
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0113j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
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
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c0105b, (K0.j) null);
        if (c0113j == null) {
            pVar3.i(null);
        } else {
            final int i5 = 2;
            pVar3.i(new P1.b() { // from class: Y1.D
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
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c0113j2.getClass();
                                L = AbstractC0129a.r(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c0113j3.getClass();
                                httpAuthHandler2.cancel();
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
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0113j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
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

    public static void H(f binaryMessenger, final C0113j c0113j) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0113j == null || (dVar = c0113j.f1861a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.J
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    switch (i3) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), new V(c0113j2));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v = (V) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0113j3.getClass();
                                v.f1794c = booleanValue;
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
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v3 = (V) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0113j4.getClass();
                                v3.f1795d = booleanValue2;
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
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v4 = (V) obj7;
                            Object obj8 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0113j5.getClass();
                                v4.f1796e = booleanValue3;
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
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v5 = (V) obj9;
                            Object obj10 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0113j6.getClass();
                                v5.f = booleanValue4;
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
                        default:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v6 = (V) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0113j7.getClass();
                                v6.f1797g = booleanValue5;
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
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.J
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    switch (i4) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), new V(c0113j2));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v = (V) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0113j3.getClass();
                                v.f1794c = booleanValue;
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
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v3 = (V) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0113j4.getClass();
                                v3.f1795d = booleanValue2;
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
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v4 = (V) obj7;
                            Object obj8 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0113j5.getClass();
                                v4.f1796e = booleanValue3;
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
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v5 = (V) obj9;
                            Object obj10 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0113j6.getClass();
                                v5.f = booleanValue4;
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
                        default:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v6 = (V) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0113j7.getClass();
                                v6.f1797g = booleanValue5;
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
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i5 = 2;
            pVar3.i(new P1.b() { // from class: Y1.J
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    switch (i5) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), new V(c0113j2));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v = (V) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0113j3.getClass();
                                v.f1794c = booleanValue;
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
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v3 = (V) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0113j4.getClass();
                                v3.f1795d = booleanValue2;
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
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v4 = (V) obj7;
                            Object obj8 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0113j5.getClass();
                                v4.f1796e = booleanValue3;
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
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v5 = (V) obj9;
                            Object obj10 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0113j6.getClass();
                                v5.f = booleanValue4;
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
                        default:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v6 = (V) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0113j7.getClass();
                                v6.f1797g = booleanValue5;
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
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i6 = 3;
            pVar4.i(new P1.b() { // from class: Y1.J
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    switch (i6) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), new V(c0113j2));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v = (V) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0113j3.getClass();
                                v.f1794c = booleanValue;
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
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v3 = (V) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0113j4.getClass();
                                v3.f1795d = booleanValue2;
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
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v4 = (V) obj7;
                            Object obj8 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0113j5.getClass();
                                v4.f1796e = booleanValue3;
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
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v5 = (V) obj9;
                            Object obj10 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0113j6.getClass();
                                v5.f = booleanValue4;
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
                        default:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v6 = (V) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0113j7.getClass();
                                v6.f1797g = booleanValue5;
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
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c0105b, (K0.j) null);
        if (c0113j != null) {
            final int i7 = 4;
            pVar5.i(new P1.b() { // from class: Y1.J
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    switch (i7) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), new V(c0113j2));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v = (V) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0113j3.getClass();
                                v.f1794c = booleanValue;
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
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v3 = (V) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0113j4.getClass();
                                v3.f1795d = booleanValue2;
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
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v4 = (V) obj7;
                            Object obj8 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0113j5.getClass();
                                v4.f1796e = booleanValue3;
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
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v5 = (V) obj9;
                            Object obj10 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0113j6.getClass();
                                v5.f = booleanValue4;
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
                        default:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v6 = (V) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0113j7.getClass();
                                v6.f1797g = booleanValue5;
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
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        p pVar6 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c0105b, (K0.j) null);
        if (c0113j == null) {
            pVar6.i(null);
        } else {
            final int i8 = 5;
            pVar6.i(new P1.b() { // from class: Y1.J
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    switch (i8) {
                        case 0:
                            C0113j c0113j2 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj2).longValue(), new V(c0113j2));
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
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v = (V) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0113j3.getClass();
                                v.f1794c = booleanValue;
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
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v3 = (V) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0113j4.getClass();
                                v3.f1795d = booleanValue2;
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
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v4 = (V) obj7;
                            Object obj8 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0113j5.getClass();
                                v4.f1796e = booleanValue3;
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
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v5 = (V) obj9;
                            Object obj10 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0113j6.getClass();
                                v5.f = booleanValue4;
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
                        default:
                            C0113j c0113j7 = c0113j;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            V v6 = (V) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0113j7.getClass();
                                v6.f1797g = booleanValue5;
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
                    }
                }
            });
        }
    }

    public static final Object I(s sVar, s sVar2, l2.p pVar) {
        Object c1204n;
        Object K2;
        try {
            t.b(2, pVar);
            c1204n = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            c1204n = new C1204n(th, false);
        }
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        if (c1204n == enumC0317a || (K2 = sVar.K(c1204n)) == AbstractC1212w.f10448d) {
            return enumC0317a;
        }
        if (K2 instanceof C1204n) {
            throw ((C1204n) K2).f10431a;
        }
        return AbstractC1212w.m(K2);
    }

    public static ArrayList K(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0082c) {
            C0082c c0082c = (C0082c) th;
            arrayList.add(c0082c.f1498a);
            arrayList.add(c0082c.getMessage());
            arrayList.add(c0082c.f1499b);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static Object L(l2.p pVar, Object obj, InterfaceC0300c interfaceC0300c) {
        j.e(pVar, "<this>");
        h context = interfaceC0300c.getContext();
        Object c0320d = context == i.f4951a ? new C0320d(interfaceC0300c) : new C0321e(interfaceC0300c, context);
        t.b(2, pVar);
        return pVar.invoke(obj, c0320d);
    }

    public static void M(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int S2 = S(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        T(parcel, S2);
    }

    public static void N(Parcel parcel, int i3, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int S2 = S(parcel, i3);
        parcelable.writeToParcel(parcel, i4);
        T(parcel, S2);
    }

    public static void O(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int S2 = S(parcel, i3);
        parcel.writeString(str);
        T(parcel, S2);
    }

    public static void P(Parcel parcel, int i3, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int S2 = S(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        T(parcel, S2);
    }

    public static void Q(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int S2 = S(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        T(parcel, S2);
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
        } catch (IllegalAccessException | NoSuchFieldException e3) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e3);
            return new ArrayList();
        }
    }

    public static int S(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void T(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }

    public static void U(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }

    public static boolean a(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!"omid-native".equals(parse.getScheme())) {
                return false;
            }
            android.support.v4.media.session.a.d(parse);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i3) {
        if (bitmap != null) {
            switch (i3) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i3 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i3);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static Object e(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean g(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean h3 = h(file, inputStream);
                f(inputStream);
                return h3;
            } catch (Throwable th) {
                th = th;
                f(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    f(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            f(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            f(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static C0082c i(String str) {
        return new C0082c("channel-error", AbstractC1234c.a("Unable to establish connection on channel: ", str, "."), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0300c j(l2.p pVar, AbstractC1191a abstractC1191a, AbstractC1191a abstractC1191a2) {
        j.e(pVar, "<this>");
        if (pVar instanceof AbstractC0324a) {
            return ((AbstractC0324a) pVar).b(abstractC1191a2, abstractC1191a);
        }
        i iVar = i.f4951a;
        h hVar = abstractC1191a2.f10396c;
        return hVar == iVar ? new C0318b(pVar, abstractC1191a2, abstractC1191a) : new C0319c(abstractC1191a2, hVar, pVar, abstractC1191a);
    }

    public static boolean l(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable cVar = new p2.c(0, objArr.length - 1, 1);
                if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                    Iterator it = cVar.iterator();
                    while (((p2.b) it).f10223c) {
                        int a3 = ((p2.b) it).a();
                        if (!l(objArr[a3], objArr2[a3])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Collection collection = (Collection) obj;
                j.e(collection, "<this>");
                Iterable cVar2 = new p2.c(0, collection.size() - 1, 1);
                if (!(cVar2 instanceof Collection) || !((Collection) cVar2).isEmpty()) {
                    Iterator it2 = cVar2.iterator();
                    while (((p2.b) it2).f10223c) {
                        int a4 = ((p2.b) it2).a();
                        if (!l(list.get(a4), list2.get(a4))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return j.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (map2.containsKey(entry.getKey()) && l(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class o(q2.c cVar) {
        j.e(cVar, "<this>");
        Class a3 = ((kotlin.jvm.internal.d) cVar).a();
        if (a3.isPrimitive()) {
            String name = a3.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a3;
    }

    public static Object r(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return A.a.a(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0304a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static File t(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + TokenBuilder.TOKEN_DELIMITER + Process.myTid() + TokenBuilder.TOKEN_DELIMITER;
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static InterfaceC0300c x(InterfaceC0300c interfaceC0300c) {
        j.e(interfaceC0300c, "<this>");
        AbstractC0326c abstractC0326c = interfaceC0300c instanceof AbstractC0326c ? (AbstractC0326c) interfaceC0300c : null;
        if (abstractC0326c == null || (interfaceC0300c = abstractC0326c.f4982c) != null) {
            return interfaceC0300c;
        }
        InterfaceC0302e interfaceC0302e = (InterfaceC0302e) abstractC0326c.getContext().h(C0301d.f4950a);
        InterfaceC0300c hVar = interfaceC0302e != null ? new y2.h((AbstractC1208s) interfaceC0302e, abstractC0326c) : abstractC0326c;
        abstractC0326c.f4982c = hVar;
        return hVar;
    }

    public static boolean y(String str) {
        C0171b c0171b = AbstractC0182m.f2535a;
        Set<InterfaceC0173d> unmodifiableSet = Collections.unmodifiableSet(AbstractC0172c.f2523c);
        HashSet hashSet = new HashSet();
        for (InterfaceC0173d interfaceC0173d : unmodifiableSet) {
            if (((AbstractC0172c) interfaceC0173d).f2524a.equals(str)) {
                hashSet.add(interfaceC0173d);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC0172c abstractC0172c = (AbstractC0172c) ((InterfaceC0173d) it.next());
            if (abstractC0172c.a() || abstractC0172c.b()) {
                return true;
            }
        }
        return false;
    }

    public static void z(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public abstract void C();

    public abstract void D(D2.a aVar);

    public abstract void J();

    public L0.c c(Context context, Looper looper, F1.c cVar, Object obj, g gVar, L0.h hVar) {
        return d(context, looper, cVar, obj, (m) gVar, (m) hVar);
    }

    public L0.c d(Context context, Looper looper, F1.c cVar, Object obj, m mVar, m mVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract String k(byte[] bArr, int i3, int i4);

    public abstract int m(String str, byte[] bArr, int i3, int i4);

    public abstract D2.a n();

    public abstract l2.a p();

    public abstract l q();

    public abstract E2.p s();

    public void u(int i3) {
        if (i3 == -2) {
            q().invoke(Boolean.TRUE);
        } else if (i3 == -1) {
            q().invoke(Boolean.FALSE);
        } else {
            if (i3 != 1) {
                return;
            }
            p().invoke();
        }
    }

    public abstract void v();

    public abstract boolean w();
}
