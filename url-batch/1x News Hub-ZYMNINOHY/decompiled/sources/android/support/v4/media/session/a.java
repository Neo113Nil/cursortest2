package android.support.v4.media.session;

import A0.d;
import B0.p;
import E.A;
import E.AbstractC0003d;
import E.AbstractC0018t;
import E.C0024z;
import E.D;
import E.F;
import E.H;
import E.I;
import E.InterfaceC0010k;
import E.J;
import E.W;
import E1.AbstractC0033i;
import K.C0041e;
import K.C0043g;
import K.C0047k;
import P1.f;
import P1.k;
import U.u;
import U.v;
import Y1.C0105b;
import Y1.C0107d;
import Y1.C0109f;
import Y1.C0117n;
import a.AbstractC0129a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.TextView;
import b0.s;
import b2.C0191e;
import b2.C0193g;
import b2.C0195i;
import com.fc.barca.football.R;
import d2.InterfaceC0303f;
import d2.g;
import d2.h;
import d2.i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import g0.m;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k0.C1076a;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l.C1098u;
import l1.C1105b;
import l2.l;
import t2.AbstractC1191a;
import w.C1231b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1964a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1965b;

    public a() {
        new ConcurrentHashMap();
    }

    public static boolean A(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("ContentSizingFlag", "Could not get metadata", e3);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean B(byte b3) {
        return b3 > -65;
    }

    public static String C(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb.append(str2.charAt(i3));
            }
        }
        return sb.toString();
    }

    public static h D(InterfaceC0303f interfaceC0303f, g key) {
        j.e(key, "key");
        return j.a(interfaceC0303f.getKey(), key) ? i.f4951a : interfaceC0303f;
    }

    public static h E(InterfaceC0303f interfaceC0303f, h context) {
        j.e(context, "context");
        return context == i.f4951a ? interfaceC0303f : (h) context.l(interfaceC0303f, new com.startapp.sdk.components.c(2));
    }

    public static boolean H(Parcel parcel, int i3) {
        Y(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder I(Parcel parcel, int i3) {
        int L = L(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + L);
        return readStrongBinder;
    }

    public static int J(Parcel parcel, int i3) {
        Y(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long K(Parcel parcel, int i3) {
        Y(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int L(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static void M(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0003d.n(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void N(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    public static void O(f binaryMessenger, final C0107d c0107d) {
        j.e(binaryMessenger, "binaryMessenger");
        C0193g c0193g = C0109f.f1848b;
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (k) c0193g.a(), (K0.j) null);
        if (c0107d != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.e
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    switch (i3) {
                        case 0:
                            C0107d c0107d2 = c0107d;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long longValue = l3.longValue();
                            try {
                                c0107d2.f();
                                Object e3 = c0107d2.e(longValue);
                                if (e3 instanceof f0) {
                                    ((f0) e3).destroy();
                                }
                                c0107d2.f1832d.remove(l3);
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
                        default:
                            C0107d c0107d3 = c0107d;
                            try {
                                c0107d3.f1830b.clear();
                                c0107d3.f1831c.clear();
                                c0107d3.f1832d.clear();
                                c0107d3.f.clear();
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
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (k) c0193g.a(), (K0.j) null);
        if (c0107d == null) {
            pVar2.i(null);
        } else {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.e
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    switch (i4) {
                        case 0:
                            C0107d c0107d2 = c0107d;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long longValue = l3.longValue();
                            try {
                                c0107d2.f();
                                Object e3 = c0107d2.e(longValue);
                                if (e3 instanceof f0) {
                                    ((f0) e3).destroy();
                                }
                                c0107d2.f1832d.remove(l3);
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
                        default:
                            C0107d c0107d3 = c0107d;
                            try {
                                c0107d3.f1830b.clear();
                                c0107d3.f1831c.clear();
                                c0107d3.f1832d.clear();
                                c0107d3.f.clear();
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
                    }
                }
            });
        }
    }

    public static void P(f binaryMessenger, final C0117n c0117n) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0117n == null || (dVar = c0117n.f1873a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.C
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    switch (i3) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                A0.d dVar2 = c0117n2.f1873a;
                                ((C0107d) dVar2.f17b).a(longValue, (C0122t) dVar2.f20e);
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
                            return;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0122t c0122t = (C0122t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c0117n3.getClass();
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            try {
                                String[] list2 = c0122t.f1890a.list(str);
                                L2 = AbstractC0129a.r(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                eVar.n(L2);
                                return;
                            } catch (IOException e3) {
                                throw new RuntimeException(e3.getMessage());
                            }
                        default:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0122t c0122t2 = (C0122t) obj5;
                            Object obj6 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0117n4.getClass();
                                L3 = AbstractC0129a.r(((J1.d) c0122t2.f1891b.f2532b).f643e.f630b + File.separator + str2);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.C
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    switch (i4) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                A0.d dVar2 = c0117n2.f1873a;
                                ((C0107d) dVar2.f17b).a(longValue, (C0122t) dVar2.f20e);
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
                            return;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0122t c0122t = (C0122t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c0117n3.getClass();
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            try {
                                String[] list2 = c0122t.f1890a.list(str);
                                L2 = AbstractC0129a.r(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                eVar.n(L2);
                                return;
                            } catch (IOException e3) {
                                throw new RuntimeException(e3.getMessage());
                            }
                        default:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0122t c0122t2 = (C0122t) obj5;
                            Object obj6 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0117n4.getClass();
                                L3 = AbstractC0129a.r(((J1.d) c0122t2.f1891b.f2532b).f643e.f630b + File.separator + str2);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", c0105b, (K0.j) null);
        if (c0117n == null) {
            pVar3.i(null);
        } else {
            final int i5 = 2;
            pVar3.i(new P1.b() { // from class: Y1.C
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    switch (i5) {
                        case 0:
                            C0117n c0117n2 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                A0.d dVar2 = c0117n2.f1873a;
                                ((C0107d) dVar2.f17b).a(longValue, (C0122t) dVar2.f20e);
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
                            return;
                        case 1:
                            C0117n c0117n3 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0122t c0122t = (C0122t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c0117n3.getClass();
                            } catch (Throwable th2) {
                                if (th2 instanceof C0104a) {
                                    C0104a c0104a2 = th2;
                                    L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                                } else {
                                    L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            try {
                                String[] list2 = c0122t.f1890a.list(str);
                                L2 = AbstractC0129a.r(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                eVar.n(L2);
                                return;
                            } catch (IOException e3) {
                                throw new RuntimeException(e3.getMessage());
                            }
                        default:
                            C0117n c0117n4 = c0117n;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0122t c0122t2 = (C0122t) obj5;
                            Object obj6 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0117n4.getClass();
                                L3 = AbstractC0129a.r(((J1.d) c0122t2.f1891b.f2532b).f643e.f630b + File.separator + str2);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                    }
                }
            });
        }
    }

    public static void Q(f binaryMessenger, final C0117n c0117n) {
        d dVar;
        j.e(binaryMessenger, "binaryMessenger");
        k c0105b = (c0117n == null || (dVar = c0117n.f1873a) == null) ? new C0105b() : dVar.a();
        p pVar = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i3 = 0;
            pVar.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i4;
                    final int i5 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i3) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i4 = i5 | 519;
                                                break;
                                            case 1:
                                                i4 = i5 | 128;
                                                break;
                                            case 2:
                                                i4 = i5 | 4;
                                                break;
                                            case 3:
                                                i4 = i5 | 8;
                                                break;
                                            case 4:
                                                i4 = i5 | 32;
                                                break;
                                            case 5:
                                                i4 = i5 | 2;
                                                break;
                                            case 6:
                                                i4 = i5 | 1;
                                                break;
                                            case 7:
                                                i4 = i5 | 16;
                                                break;
                                            case 8:
                                                i4 = i5 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i5 = i4;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i6 = Build.VERSION.SDK_INT;
                                            E.K j3 = i6 >= 34 ? new E.J(w3) : i6 >= 31 ? new E.I(w3) : i6 >= 30 ? new E.H(w3) : i6 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i5, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i4 = 1;
            pVar2.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i42;
                    final int i5 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i4) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i42 = i5 | 519;
                                                break;
                                            case 1:
                                                i42 = i5 | 128;
                                                break;
                                            case 2:
                                                i42 = i5 | 4;
                                                break;
                                            case 3:
                                                i42 = i5 | 8;
                                                break;
                                            case 4:
                                                i42 = i5 | 32;
                                                break;
                                            case 5:
                                                i42 = i5 | 2;
                                                break;
                                            case 6:
                                                i42 = i5 | 1;
                                                break;
                                            case 7:
                                                i42 = i5 | 16;
                                                break;
                                            case 8:
                                                i42 = i5 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i5 = i42;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i6 = Build.VERSION.SDK_INT;
                                            E.K j3 = i6 >= 34 ? new E.J(w3) : i6 >= 31 ? new E.I(w3) : i6 >= 30 ? new E.H(w3) : i6 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i5, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i5 = 2;
            pVar3.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i42;
                    final int i52 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i5) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i42 = i52 | 519;
                                                break;
                                            case 1:
                                                i42 = i52 | 128;
                                                break;
                                            case 2:
                                                i42 = i52 | 4;
                                                break;
                                            case 3:
                                                i42 = i52 | 8;
                                                break;
                                            case 4:
                                                i42 = i52 | 32;
                                                break;
                                            case 5:
                                                i42 = i52 | 2;
                                                break;
                                            case 6:
                                                i42 = i52 | 1;
                                                break;
                                            case 7:
                                                i42 = i52 | 16;
                                                break;
                                            case 8:
                                                i42 = i52 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i52 = i42;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i6 = Build.VERSION.SDK_INT;
                                            E.K j3 = i6 >= 34 ? new E.J(w3) : i6 >= 31 ? new E.I(w3) : i6 >= 30 ? new E.H(w3) : i6 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i52, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i6 = 3;
            pVar4.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i42;
                    final int i52 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i6) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i42 = i52 | 519;
                                                break;
                                            case 1:
                                                i42 = i52 | 128;
                                                break;
                                            case 2:
                                                i42 = i52 | 4;
                                                break;
                                            case 3:
                                                i42 = i52 | 8;
                                                break;
                                            case 4:
                                                i42 = i52 | 32;
                                                break;
                                            case 5:
                                                i42 = i52 | 2;
                                                break;
                                            case 6:
                                                i42 = i52 | 1;
                                                break;
                                            case 7:
                                                i42 = i52 | 16;
                                                break;
                                            case 8:
                                                i42 = i52 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i52 = i42;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i62 = Build.VERSION.SDK_INT;
                                            E.K j3 = i62 >= 34 ? new E.J(w3) : i62 >= 31 ? new E.I(w3) : i62 >= 30 ? new E.H(w3) : i62 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i52, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i7 = 4;
            pVar5.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i42;
                    final int i52 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i7) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i42 = i52 | 519;
                                                break;
                                            case 1:
                                                i42 = i52 | 128;
                                                break;
                                            case 2:
                                                i42 = i52 | 4;
                                                break;
                                            case 3:
                                                i42 = i52 | 8;
                                                break;
                                            case 4:
                                                i42 = i52 | 32;
                                                break;
                                            case 5:
                                                i42 = i52 | 2;
                                                break;
                                            case 6:
                                                i42 = i52 | 1;
                                                break;
                                            case 7:
                                                i42 = i52 | 16;
                                                break;
                                            case 8:
                                                i42 = i52 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i52 = i42;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i62 = Build.VERSION.SDK_INT;
                                            E.K j3 = i62 >= 34 ? new E.J(w3) : i62 >= 31 ? new E.I(w3) : i62 >= 30 ? new E.H(w3) : i62 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i52, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        p pVar6 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", c0105b, (K0.j) null);
        if (c0117n != null) {
            final int i8 = 5;
            pVar6.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i42;
                    final int i52 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i8) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i42 = i52 | 519;
                                                break;
                                            case 1:
                                                i42 = i52 | 128;
                                                break;
                                            case 2:
                                                i42 = i52 | 4;
                                                break;
                                            case 3:
                                                i42 = i52 | 8;
                                                break;
                                            case 4:
                                                i42 = i52 | 32;
                                                break;
                                            case 5:
                                                i42 = i52 | 2;
                                                break;
                                            case 6:
                                                i42 = i52 | 1;
                                                break;
                                            case 7:
                                                i42 = i52 | 16;
                                                break;
                                            case 8:
                                                i42 = i52 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i52 = i42;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i62 = Build.VERSION.SDK_INT;
                                            E.K j3 = i62 >= 34 ? new E.J(w3) : i62 >= 31 ? new E.I(w3) : i62 >= 30 ? new E.H(w3) : i62 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i52, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        p pVar7 = new p(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setInsetListenerToSetInsetsToZero", c0105b, (K0.j) null);
        if (c0117n == null) {
            pVar7.i(null);
        } else {
            final int i9 = 6;
            pVar7.i(new P1.b() { // from class: Y1.H
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    int i42;
                    final int i52 = 0;
                    C0117n c0117n2 = c0117n;
                    switch (i9) {
                        case 0:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0117n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0117n2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0117n2.getClass();
                                L3 = AbstractC0129a.r(new d0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0104a) {
                                    C0104a c0104a3 = th3;
                                    L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                                } else {
                                    L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            eVar.n(L3);
                            return;
                        case 3:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0117n2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0117n2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0127y enumC0127y = (EnumC0127y) obj14;
                            try {
                                c0117n2.getClass();
                                int ordinal = enumC0127y.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC0127y enumC0127y2 = EnumC0127y.UNKNOWN;
                                    c0117n2.f1873a.getClass();
                                    throw new IllegalArgumentException(enumC0127y2 + " doesn't represent a native value.");
                                }
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
                            return;
                        default:
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0117n2.getClass();
                                if (list7.isEmpty()) {
                                    M m3 = new M(11);
                                    Field field = E.A.f243a;
                                    AbstractC0018t.f(view7, m3);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch (((g0) it.next()).ordinal()) {
                                            case 0:
                                                i42 = i52 | 519;
                                                break;
                                            case 1:
                                                i42 = i52 | 128;
                                                break;
                                            case 2:
                                                i42 = i52 | 4;
                                                break;
                                            case 3:
                                                i42 = i52 | 8;
                                                break;
                                            case 4:
                                                i42 = i52 | 32;
                                                break;
                                            case 5:
                                                i42 = i52 | 2;
                                                break;
                                            case 6:
                                                i42 = i52 | 1;
                                                break;
                                            case 7:
                                                i42 = i52 | 16;
                                                break;
                                            case 8:
                                                i42 = i52 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i52 = i42;
                                    }
                                    InterfaceC0010k interfaceC0010k = new InterfaceC0010k() { // from class: Y1.P
                                        @Override // E.InterfaceC0010k
                                        public final E.W c(E.W w3) {
                                            int i62 = Build.VERSION.SDK_INT;
                                            E.K j3 = i62 >= 34 ? new E.J(w3) : i62 >= 31 ? new E.I(w3) : i62 >= 30 ? new E.H(w3) : i62 >= 29 ? new E.F(w3) : new E.D(w3);
                                            j3.c(i52, x.b.f10693e);
                                            return j3.b();
                                        }
                                    };
                                    Field field2 = E.A.f243a;
                                    AbstractC0018t.f(view7, interfaceC0010k);
                                }
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
                            return;
                    }
                }
            });
        }
    }

    public static void R(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + L(parcel, i3));
    }

    public static void S(l2.p pVar, AbstractC1191a abstractC1191a, AbstractC1191a abstractC1191a2) {
        try {
            y2.a.g(C2.b.x(C2.b.j(pVar, abstractC1191a, abstractC1191a2)), C0195i.f2555a);
        } catch (Throwable th) {
            abstractC1191a2.f(k(th));
            throw th;
        }
    }

    public static final void T(Object obj) {
        if (obj instanceof C0191e) {
            throw ((C0191e) obj).f2549a;
        }
    }

    public static boolean U(View view, Z1.c cVar) {
        if (view != null) {
            if (cVar.b(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    if (U(viewGroup.getChildAt(i3), cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int V(Parcel parcel) {
        int readInt = parcel.readInt();
        int L = L(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new O0.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i3 = L + dataPosition;
        if (i3 < dataPosition || i3 > parcel.dataSize()) {
            throw new O0.b(AbstractC0033i.g(dataPosition, i3, "Size read is invalid start=", " end="), parcel);
        }
        return i3;
    }

    public static ActionMode.Callback W(ActionMode.Callback callback, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i3 > 27 || (callback instanceof H.j) || callback == null) ? callback : new H.j(callback, textView);
    }

    public static ArrayList X(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void Y(Parcel parcel, int i3, int i4) {
        int L = L(parcel, i3);
        if (L == i4) {
            return;
        }
        String hexString = Integer.toHexString(L);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(L);
        sb.append(" (0x");
        throw new O0.b(AbstractC0033i.m(sb, hexString, ")"), parcel);
    }

    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: Exception -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x0020, B:15:0x003a), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, String str, s sVar) {
        l1.c cVar;
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            C1105b.b(context).getClass();
            l1.d dVar = (l1.d) C1105b.f9934c.get(str);
            if (!(dVar != null ? dVar.b() : false)) {
                return;
            }
            if ("FireTVFOSDAT".equals(str)) {
                cVar = new l1.c(context);
                if (cVar == null) {
                    cVar.a(sVar);
                    return;
                }
                return;
            }
            cVar = null;
            if (cVar == null) {
            }
        } catch (Exception unused) {
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
    public static final Object c(List list, C0047k c0047k, AbstractC0326c abstractC0326c) {
        C0041e c0041e;
        int i3;
        List list2;
        q qVar;
        Iterator it;
        Throwable th;
        if (abstractC0326c instanceof C0041e) {
            c0041e = (C0041e) abstractC0326c;
            int i4 = c0041e.f756g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0041e.f756g = i4 - Integer.MIN_VALUE;
                Object obj = c0041e.f;
                Object obj2 = EnumC0317a.f4969a;
                i3 = c0041e.f756g;
                if (i3 != 0) {
                    T(obj);
                    ArrayList arrayList = new ArrayList();
                    C0043g c0043g = new C0043g(list, arrayList, null);
                    c0041e.f754d = arrayList;
                    c0041e.f756g = 1;
                    if (c0047k.a(c0043g, c0041e) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0041e.f755e;
                        qVar = (q) c0041e.f754d;
                        try {
                            T(obj);
                        } catch (Throwable th2) {
                            Object obj3 = qVar.f9692a;
                            if (obj3 == null) {
                                qVar.f9692a = th2;
                            } else {
                                AbstractC0129a.e((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            c0041e.f754d = qVar;
                            c0041e.f755e = it;
                            c0041e.f756g = 2;
                            if (lVar.invoke(c0041e) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) qVar.f9692a;
                        if (th == null) {
                            return C0195i.f2555a;
                        }
                        throw th;
                    }
                    list2 = (List) c0041e.f754d;
                    T(obj);
                }
                qVar = new q();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) qVar.f9692a;
                if (th == null) {
                }
            }
        }
        c0041e = new C0041e(abstractC0326c);
        Object obj4 = c0041e.f;
        Object obj22 = EnumC0317a.f4969a;
        i3 = c0041e.f756g;
        if (i3 != 0) {
        }
        qVar = new q();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) qVar.f9692a;
        if (th == null) {
        }
    }

    public static void d(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap hashMap = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
                try {
                    b(n1.h.f10158b.f10159a.getApplicationContext(), (String) hashMap.get("mechanism"), new s(hashMap));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            uri.toString();
        }
    }

    public static void e(Context context, Z1.b bVar) {
        Rect rect;
        W _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity y3 = y(context);
        if (y3 != null) {
            g0.l.f5035a.getClass();
            int i3 = m.f5036b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                maximumWindowMetrics = ((WindowManager) y3.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                j.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = y3.getSystemService("window");
                j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                j.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                _windowInsetsCompat = (i4 >= 34 ? new J() : i4 >= 31 ? new I() : i4 >= 30 ? new H() : i4 >= 29 ? new F() : new D()).b();
                j.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i4 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = C1076a.f9671a.a(y3);
            }
            int i5 = rect.left;
            int i6 = rect.top;
            int i7 = rect.right;
            int i8 = rect.bottom;
            if (i5 > i7) {
                throw new IllegalArgumentException(AbstractC0033i.g(i5, i7, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i6 > i8) {
                throw new IllegalArgumentException(AbstractC0033i.g(i6, i8, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            j.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((FlutterEngine) bVar).f9099a.updateDisplayMetrics(0, new Rect(i5, i6, i7, i8).width(), new Rect(i5, i6, i7, i8).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static int i(U.D d3, Q.b bVar, View view, View view2, u uVar, boolean z) {
        if (uVar.p() == 0 || d3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
        }
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int j(U.D d3, Q.b bVar, View view, View view2, u uVar, boolean z) {
        if (uVar.p() == 0 || d3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return d3.a();
        }
        bVar.b(view2);
        bVar.c(view);
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static final C0191e k(Throwable exception) {
        j.e(exception, "exception");
        return new C0191e(exception);
    }

    public static Parcelable q(Parcel parcel, int i3, Parcelable.Creator creator) {
        int L = L(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + L);
        return parcelable;
    }

    public static String r(Parcel parcel, int i3) {
        int L = L(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + L);
        return readString;
    }

    public static Object[] s(Parcel parcel, int i3, Parcelable.Creator creator) {
        int L = L(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + L);
        return createTypedArray;
    }

    public static ArrayList t(Parcel parcel, int i3, Parcelable.Creator creator) {
        int L = L(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + L);
        return createTypedArrayList;
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = A.f243a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0024z.f304d;
        C0024z c0024z = (C0024z) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0024z == null) {
            c0024z = new C0024z();
            c0024z.f305a = null;
            c0024z.f306b = null;
            c0024z.f307c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0024z);
        }
        WeakReference weakReference2 = c0024z.f307c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0024z.f307c = new WeakReference(keyEvent);
        if (c0024z.f306b == null) {
            c0024z.f306b = new SparseArray();
        }
        SparseArray sparseArray = c0024z.f306b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static void v(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new O0.b(AbstractC0033i.h(i3, "Overread allowed size end="), parcel);
        }
    }

    public static InterfaceC0303f x(InterfaceC0303f interfaceC0303f, g key) {
        j.e(key, "key");
        if (j.a(interfaceC0303f.getKey(), key)) {
            return interfaceC0303f;
        }
        return null;
    }

    public static Activity y(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return y(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static C.c z(C1098u c1098u) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C.c(AbstractC0003d.k(c1098u));
        }
        TextPaint textPaint = new TextPaint(c1098u.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1098u.getBreakStrategy();
        int hyphenationFrequency = c1098u.getHyphenationFrequency();
        if (c1098u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i3 < 28 || (c1098u.getInputType() & 15) != 3) {
                boolean z = c1098u.getLayoutDirection() == 1;
                switch (c1098u.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0003d.a(DecimalFormatSymbols.getInstance(c1098u.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public abstract void F(r.f fVar, r.f fVar2);

    public abstract void G(r.f fVar, Thread thread);

    public abstract boolean f(r.g gVar, r.c cVar);

    public abstract boolean g(r.g gVar, Object obj, Object obj2);

    public abstract boolean h(r.g gVar, r.f fVar, r.f fVar2);

    public abstract Typeface l(Context context, C1231b c1231b, Resources resources, int i3);

    public abstract Typeface m(Context context, B.k[] kVarArr, int i3);

    public Typeface n(Context context, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface o(Context context, InputStream inputStream) {
        File t3 = C2.b.t(context);
        if (t3 == null) {
            return null;
        }
        try {
            if (C2.b.h(t3, inputStream)) {
                return Typeface.createFromFile(t3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t3.delete();
        }
    }

    public Typeface p(Context context, Resources resources, int i3, String str, int i4) {
        File t3 = C2.b.t(context);
        if (t3 == null) {
            return null;
        }
        try {
            if (C2.b.g(t3, resources, i3)) {
                return Typeface.createFromFile(t3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t3.delete();
        }
    }

    public B.k w(B.k[] kVarArr, int i3) {
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z = (i3 & 2) != 0;
        B.k kVar = null;
        int i5 = Integer.MAX_VALUE;
        for (B.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f105c - i4) * 2) + (kVar2.f106d == z ? 0 : 1);
            if (kVar == null || i5 > abs) {
                kVar = kVar2;
                i5 = abs;
            }
        }
        return kVar;
    }
}
