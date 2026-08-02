package D0;

import B0.C0023a;
import a.AbstractC0132a;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import java.util.List;
import w0.InterfaceC0316b;
import w0.InterfaceC0317c;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements InterfaceC0317c, InterfaceC0316b, E0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246e;

    public /* synthetic */ H(int i2) {
        this.f246e = i2;
    }

    @Override // E0.b
    public boolean a(View view) {
        return view.hasFocus();
    }

    @Override // w0.InterfaceC0317c
    public void b(Object obj) {
        switch (this.f246e) {
            case 0:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i2 = X.f289h;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i3 = X.f289h;
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i4 = X.f289h;
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i5 = X.f289h;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i6 = X.f289h;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i7 = X.f289h;
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i8 = X.f289h;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i9 = X.f289h;
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i10 = X.f289h;
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i11 = X.f289h;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i12 = X.f289h;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i13 = X.f289h;
                        break;
                    }
                }
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i14 = X.f289h;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i15 = X.f289h;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i16 = X.f289h;
                        break;
                    }
                }
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i17 = X.f289h;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i18 = X.f289h;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i19 = X.f289h;
                        break;
                    }
                }
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i20 = X.f289h;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i21 = X.f289h;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i22 = X.f289h;
                        break;
                    }
                }
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "");
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
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", "");
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
            case 9:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "");
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
            case 10:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "");
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
            case 11:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "");
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
            case 12:
            case 14:
            case 20:
            default:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "");
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
            case 13:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "");
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
            case 15:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "");
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
            case 16:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i23 = l0.f383h;
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        int i24 = l0.f383h;
                        break;
                    } else {
                        Object obj32 = list16.get(0);
                        Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i25 = l0.f383h;
                        break;
                    }
                }
            case 17:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "");
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
            case 18:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat'.", "");
                    int i26 = f0.f350d;
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        int i27 = f0.f350d;
                        break;
                    } else {
                        Object obj36 = list18.get(0);
                        Q0.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        Q0.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj36, (String) obj37, (String) list18.get(2)));
                        int i28 = f0.f350d;
                        break;
                    }
                }
            case 19:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i29 = h0.f360c;
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        int i30 = h0.f360c;
                        break;
                    } else {
                        Object obj38 = list19.get(0);
                        Q0.h.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list19.get(1);
                        Q0.h.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj38, (String) obj39, (String) list19.get(2)));
                        int i31 = h0.f360c;
                        break;
                    }
                }
            case 21:
                if (!(obj instanceof List)) {
                    A0.b.j("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "");
                    break;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() > 1) {
                        Object obj40 = list20.get(0);
                        Q0.h.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        Object obj41 = list20.get(1);
                        Q0.h.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj40, (String) obj41, (String) list20.get(2)));
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
        switch (this.f246e) {
            case 12:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Q0.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj2;
                Object obj3 = list.get(1);
                Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    C0023a.m(webSettings, ((Boolean) obj3).booleanValue());
                    L2 = i1.a.u(null);
                } catch (Throwable th) {
                    L2 = i1.a.L(th);
                }
                o2.b(L2);
                break;
            case 13:
            default:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    L4 = i1.a.u(Boolean.valueOf(AbstractC0132a.x((String) obj4)));
                } catch (Throwable th2) {
                    L4 = i1.a.L(th2);
                }
                o2.b(L4);
                break;
            case 14:
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                Q0.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj5).deleteAllData();
                    L3 = i1.a.u(null);
                } catch (Throwable th3) {
                    L3 = i1.a.L(th3);
                }
                o2.b(L3);
                break;
        }
    }

    public /* synthetic */ H(int i2, Object obj) {
        this.f246e = i2;
    }
}
