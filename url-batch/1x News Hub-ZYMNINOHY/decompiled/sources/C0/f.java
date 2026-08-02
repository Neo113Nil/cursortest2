package C0;

import E1.AbstractC0033i;
import U1.C0080a;
import Y1.C0104a;
import Y1.O;
import Y1.V;
import Y1.b0;
import Y1.f0;
import a.AbstractC0129a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.http.SslError;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import io.appmetrica.analytics.impl.C0642l9;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements i, P1.b, P1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202a;

    public /* synthetic */ f(int i3) {
        this.f202a = i3;
    }

    @Override // P1.b
    public void a(Object obj, V0.e eVar) {
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
        switch (this.f202a) {
            case 4:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
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
            case 5:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        L2 = AbstractC0129a.r(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e3) {
                        throw new RuntimeException(e3);
                    }
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
            case 6:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
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
                return;
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case C0642l9.f7777C /* 19 */:
            case C0642l9.f7778D /* 20 */:
            case C0642l9.f7779E /* 21 */:
            default:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj5).deleteAllData();
                    L11 = AbstractC0129a.r(null);
                } catch (Throwable th4) {
                    if (th4 instanceof C0104a) {
                        C0104a c0104a4 = th4;
                        L11 = c2.f.L(c0104a4.f1816a, c0104a4.f1817b, c0104a4.f1818c);
                    } else {
                        L11 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                    }
                }
                eVar.n(L11);
                return;
            case 8:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj6 = list.get(0);
                kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj6;
                Object obj7 = list.get(1);
                kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj7;
                Object obj8 = list.get(2);
                kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj8).booleanValue();
                Object obj9 = list.get(3);
                kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, booleanValue, ((Boolean) obj9).booleanValue());
                    L4 = AbstractC0129a.r(null);
                } catch (Throwable th5) {
                    if (th5 instanceof C0104a) {
                        C0104a c0104a5 = th5;
                        L4 = c2.f.L(c0104a5.f1816a, c0104a5.f1817b, c0104a5.f1818c);
                    } else {
                        L4 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                    }
                }
                eVar.n(L4);
                return;
            case 10:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj10 = list2.get(0);
                kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj10;
                Object obj11 = list2.get(1);
                kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj11).toArray(new String[0]));
                    L5 = AbstractC0129a.r(null);
                } catch (Throwable th6) {
                    if (th6 instanceof C0104a) {
                        C0104a c0104a6 = th6;
                        L5 = c2.f.L(c0104a6.f1816a, c0104a6.f1817b, c0104a6.f1818c);
                    } else {
                        L5 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                    }
                }
                eVar.n(L5);
                return;
            case 11:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj12).deny();
                    L6 = AbstractC0129a.r(null);
                } catch (Throwable th7) {
                    if (th7 instanceof C0104a) {
                        C0104a c0104a7 = th7;
                        L6 = c2.f.L(c0104a7.f1816a, c0104a7.f1817b, c0104a7.f1818c);
                    } else {
                        L6 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                    }
                }
                eVar.n(L6);
                return;
            case 12:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj13).getPrimaryError();
                    L7 = AbstractC0129a.r(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? O.UNKNOWN : O.INVALID : O.DATE_INVALID : O.UNTRUSTED : O.ID_MISMATCH : O.EXPIRED : O.NOT_YET_VALID);
                } catch (Throwable th8) {
                    if (th8 instanceof C0104a) {
                        C0104a c0104a8 = th8;
                        L7 = c2.f.L(c0104a8.f1816a, c0104a8.f1817b, c0104a8.f1818c);
                    } else {
                        L7 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                    }
                }
                eVar.n(L7);
                return;
            case 13:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).cancel();
                    L8 = AbstractC0129a.r(null);
                } catch (Throwable th9) {
                    if (th9 instanceof C0104a) {
                        C0104a c0104a9 = th9;
                        L8 = c2.f.L(c0104a9.f1816a, c0104a9.f1817b, c0104a9.f1818c);
                    } else {
                        L8 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                    }
                }
                eVar.n(L8);
                return;
            case 14:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj15 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj15).proceed();
                    L9 = AbstractC0129a.r(null);
                } catch (Throwable th10) {
                    if (th10 instanceof C0104a) {
                        C0104a c0104a10 = th10;
                        L9 = c2.f.L(c0104a10.f1816a, c0104a10.f1817b, c0104a10.f1818c);
                    } else {
                        L9 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                    }
                }
                eVar.n(L9);
                return;
            case 22:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj16 = list3.get(0);
                kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj16;
                Object obj17 = list3.get(1);
                kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    C0080a.h(webSettings, ((Boolean) obj17).booleanValue());
                    L10 = AbstractC0129a.r(null);
                } catch (Throwable th11) {
                    if (th11 instanceof C0104a) {
                        C0104a c0104a11 = th11;
                        L10 = c2.f.L(c0104a11.f1816a, c0104a11.f1817b, c0104a11.f1818c);
                    } else {
                        L10 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                    }
                }
                eVar.n(L10);
                return;
        }
    }

    @Override // C0.i, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            Cursor cursor = rawQuery;
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                A0.f a3 = v0.i.a();
                a3.R(cursor.getString(1));
                a3.f25d = F0.a.b(cursor.getInt(2));
                String string = cursor.getString(3);
                a3.f24c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a3.t());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // P1.c
    public void n(Object obj) {
        switch (this.f202a) {
            case 7:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj2, (String) obj3, (String) list.get(2)));
                        break;
                    }
                }
                break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 22:
            case 23:
            default:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                    int i3 = b0.f1823c;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i4 = b0.f1823c;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i5 = b0.f1823c;
                        break;
                    }
                }
            case 9:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj6, (String) obj7, (String) list3.get(2)));
                        break;
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i6 = V.f1792h;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i7 = V.f1792h;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i8 = V.f1792h;
                        break;
                    }
                }
            case 16:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i9 = V.f1792h;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i10 = V.f1792h;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i11 = V.f1792h;
                        break;
                    }
                }
            case 17:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i12 = V.f1792h;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i13 = V.f1792h;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i14 = V.f1792h;
                        break;
                    }
                }
            case 18:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i15 = V.f1792h;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i16 = V.f1792h;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i17 = V.f1792h;
                        break;
                    }
                }
            case C0642l9.f7777C /* 19 */:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i18 = V.f1792h;
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i19 = V.f1792h;
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i20 = V.f1792h;
                        break;
                    }
                }
            case C0642l9.f7778D /* 20 */:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i21 = V.f1792h;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i22 = V.f1792h;
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i23 = V.f1792h;
                        break;
                    }
                }
            case C0642l9.f7779E /* 21 */:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i24 = V.f1792h;
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i25 = V.f1792h;
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i26 = V.f1792h;
                        break;
                    }
                }
            case 24:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i27 = f0.f1850d;
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i28 = f0.f1850d;
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i29 = f0.f1850d;
                        break;
                    }
                }
            case C0642l9.f7780F /* 25 */:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                    int i30 = b0.f1823c;
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i31 = b0.f1823c;
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i32 = b0.f1823c;
                        break;
                    }
                }
            case C0642l9.f7781G /* 26 */:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                    int i33 = b0.f1823c;
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        int i34 = b0.f1823c;
                        break;
                    } else {
                        Object obj26 = list13.get(0);
                        kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i35 = b0.f1823c;
                        break;
                    }
                }
            case C0642l9.f7782H /* 27 */:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                    int i36 = b0.f1823c;
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i37 = b0.f1823c;
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i38 = b0.f1823c;
                        break;
                    }
                }
            case 28:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                    int i39 = b0.f1823c;
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        int i40 = b0.f1823c;
                        break;
                    } else {
                        Object obj30 = list15.get(0);
                        kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i41 = b0.f1823c;
                        break;
                    }
                }
        }
    }

    public /* synthetic */ f(int i3, Object obj) {
        this.f202a = i3;
    }
}
