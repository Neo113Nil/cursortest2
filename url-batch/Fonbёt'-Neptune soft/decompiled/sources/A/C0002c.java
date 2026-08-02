package A;

import D0.C0041a;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import w0.InterfaceC0316b;
import w0.InterfaceC0317c;

/* renamed from: A.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0002c implements InterfaceC0317c, InterfaceC0316b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32e;

    public /* synthetic */ C0002c(int i2) {
        this.f32e = i2;
    }

    @Override // w0.InterfaceC0317c
    public void b(Object obj) {
        switch (this.f32e) {
            case 2:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj2, (String) obj3, (String) list.get(2)));
                        break;
                    }
                }
                break;
            case 3:
            case K.k.STRING_FIELD_NUMBER /* 5 */:
            case 10:
            case 15:
            case 19:
            case 20:
            case 25:
            default:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj4 = list2.get(0);
                        Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj4, (String) obj5, (String) list2.get(2)));
                        break;
                    }
                }
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj6, (String) obj7, (String) list3.get(2)));
                        break;
                    }
                }
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj8 = list4.get(0);
                        Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj8, (String) obj9, (String) list4.get(2)));
                        break;
                    }
                }
                break;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj10 = list5.get(0);
                        Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj10, (String) obj11, (String) list5.get(2)));
                        break;
                    }
                }
                break;
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj12 = list6.get(0);
                        Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj12, (String) obj13, (String) list6.get(2)));
                        break;
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj14 = list7.get(0);
                        Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj14, (String) obj15, (String) list7.get(2)));
                        break;
                    }
                }
                break;
            case 11:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj16 = list8.get(0);
                        Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj16, (String) obj17, (String) list8.get(2)));
                        break;
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj18 = list9.get(0);
                        Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj18, (String) obj19, (String) list9.get(2)));
                        break;
                    }
                }
                break;
            case 13:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj20 = list10.get(0);
                        Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj20, (String) obj21, (String) list10.get(2)));
                        break;
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj22 = list11.get(0);
                        Q0.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj22, (String) obj23, (String) list11.get(2)));
                        break;
                    }
                }
                break;
            case 16:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj24 = list12.get(0);
                        Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj24, (String) obj25, (String) list12.get(2)));
                        break;
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj26 = list13.get(0);
                        Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj26, (String) obj27, (String) list13.get(2)));
                        break;
                    }
                }
                break;
            case 18:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj28 = list14.get(0);
                        Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj28, (String) obj29, (String) list14.get(2)));
                        break;
                    }
                }
                break;
            case 21:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj30 = list15.get(0);
                        Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        Q0.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj30, (String) obj31, (String) list15.get(2)));
                        break;
                    }
                }
                break;
            case 22:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj32 = list16.get(0);
                        Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj32, (String) obj33, (String) list16.get(2)));
                        break;
                    }
                }
                break;
            case 23:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() > 1) {
                        Object obj34 = list17.get(0);
                        Q0.h.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        Q0.h.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj34, (String) obj35, (String) list17.get(2)));
                        break;
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() > 1) {
                        Object obj36 = list18.get(0);
                        Q0.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj36, (String) obj37, (String) list18.get(2)));
                        break;
                    }
                }
                break;
            case 26:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() > 1) {
                        Object obj38 = list19.get(0);
                        Q0.h.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list19.get(1);
                        Q0.h.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj38, (String) obj39, (String) list19.get(2)));
                        break;
                    }
                }
                break;
        }
    }

    @Override // w0.InterfaceC0316b
    public void g(Object obj, P.O o2) {
        List L2;
        List L3;
        List L4;
        List L5;
        List L6;
        List L7;
        List L8;
        List L9;
        List L10;
        switch (this.f32e) {
            case 3:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Q0.h.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    L2 = i1.a.u(null);
                } catch (Throwable th) {
                    L2 = i1.a.L(th);
                }
                o2.b(L2);
                return;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                Q0.h.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        L3 = i1.a.u(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    L3 = i1.a.L(th2);
                }
                o2.b(L3);
                return;
            case 10:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    L4 = i1.a.u(null);
                } catch (Throwable th3) {
                    L4 = i1.a.L(th3);
                }
                o2.b(L4);
                return;
            case 15:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj5 = list.get(0);
                Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj5;
                Object obj6 = list.get(1);
                Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj6;
                Object obj7 = list.get(2);
                Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = list.get(3);
                Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, booleanValue, ((Boolean) obj8).booleanValue());
                    L5 = i1.a.u(null);
                } catch (Throwable th4) {
                    L5 = i1.a.L(th4);
                }
                o2.b(L5);
                return;
            case 19:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                Q0.h.c(obj9, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj9;
                Object obj10 = list2.get(1);
                Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj10).toArray(new String[0]));
                    L6 = i1.a.u(null);
                } catch (Throwable th5) {
                    L6 = i1.a.L(th5);
                }
                o2.b(L6);
                return;
            case 20:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj11 = ((List) obj).get(0);
                Q0.h.c(obj11, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj11).deny();
                    L7 = i1.a.u(null);
                } catch (Throwable th6) {
                    L7 = i1.a.L(th6);
                }
                o2.b(L7);
                return;
            case 25:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                Q0.h.c(obj12, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj12).getPrimaryError();
                    L8 = i1.a.u(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? D0.S.f277l : D0.S.f274i : D0.S.f271f : D0.S.f276k : D0.S.f273h : D0.S.f272g : D0.S.f275j);
                } catch (Throwable th7) {
                    L8 = i1.a.L(th7);
                }
                o2.b(L8);
                return;
            case 27:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                Q0.h.c(obj13, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj13).cancel();
                    L9 = i1.a.u(null);
                } catch (Throwable th8) {
                    L9 = i1.a.L(th8);
                }
                o2.b(L9);
                return;
            default:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                Q0.h.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).proceed();
                    L10 = i1.a.u(null);
                } catch (Throwable th9) {
                    L10 = i1.a.L(th9);
                }
                o2.b(L10);
                return;
        }
    }

    public /* synthetic */ C0002c(int i2, Object obj) {
        this.f32e = i2;
    }
}
