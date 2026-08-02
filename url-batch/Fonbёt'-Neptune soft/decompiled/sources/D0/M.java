package D0;

import java.util.List;
import w0.InterfaceC0317c;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements InterfaceC0317c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P0.l f256f;

    public /* synthetic */ M(int i2, P0.l lVar) {
        this.f255e = i2;
        this.f256f = lVar;
    }

    @Override // w0.InterfaceC0317c
    public final void b(Object obj) {
        F0.d e2;
        F0.d e3;
        F0.d e4;
        F0.d e5;
        F0.d e6;
        F0.d e7;
        F0.d e8;
        F0.d e9;
        F0.d e10;
        F0.d e11;
        F0.d e12;
        F0.d e13;
        F0.d e14;
        F0.d e15;
        F0.d e16;
        switch (this.f255e) {
            case 0:
                P0.l lVar = this.f256f;
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        e2 = i1.a.b(new C0041a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                } else {
                    e2 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                }
                A0.b.g(e2, lVar);
                break;
            case 1:
                P0.l lVar2 = this.f256f;
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        e3 = i1.a.b(new C0041a((String) obj4, (String) obj5, (String) list2.get(2)));
                    }
                } else {
                    e3 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading'.", "");
                }
                A0.b.g(e3, lVar2);
                break;
            case 2:
                P0.l lVar3 = this.f256f;
                if (obj instanceof List) {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        lVar3.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        e4 = i1.a.b(new C0041a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                } else {
                    e4 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                }
                A0.b.g(e4, lVar3);
                break;
            case 3:
                P0.l lVar4 = this.f256f;
                if (obj instanceof List) {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        lVar4.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        e5 = i1.a.b(new C0041a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                } else {
                    e5 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                }
                A0.b.g(e5, lVar4);
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                P0.l lVar5 = this.f256f;
                if (obj instanceof List) {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        lVar5.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        e6 = i1.a.b(new C0041a((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                } else {
                    e6 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                }
                A0.b.g(e6, lVar5);
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                P0.l lVar6 = this.f256f;
                if (obj instanceof List) {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        lVar6.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        Q0.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        e7 = i1.a.b(new C0041a((String) obj12, (String) obj13, (String) list6.get(2)));
                    }
                } else {
                    e7 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                }
                A0.b.g(e7, lVar6);
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                P0.l lVar7 = this.f256f;
                if (obj instanceof List) {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        lVar7.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        Q0.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        e8 = i1.a.b(new C0041a((String) obj14, (String) obj15, (String) list7.get(2)));
                    }
                } else {
                    e8 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                }
                A0.b.g(e8, lVar7);
                break;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                P0.l lVar8 = this.f256f;
                if (obj instanceof List) {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        lVar8.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        Q0.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        e9 = i1.a.b(new C0041a((String) obj16, (String) obj17, (String) list8.get(2)));
                    }
                } else {
                    e9 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                }
                A0.b.g(e9, lVar8);
                break;
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                P0.l lVar9 = this.f256f;
                if (obj instanceof List) {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        lVar9.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        Q0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        e10 = i1.a.b(new C0041a((String) obj18, (String) obj19, (String) list9.get(2)));
                    }
                } else {
                    e10 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                }
                A0.b.g(e10, lVar9);
                break;
            case 9:
                P0.l lVar10 = this.f256f;
                if (obj instanceof List) {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        lVar10.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        Q0.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        Q0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        e11 = i1.a.b(new C0041a((String) obj20, (String) obj21, (String) list10.get(2)));
                    }
                } else {
                    e11 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                }
                A0.b.g(e11, lVar10);
                break;
            case 10:
                P0.l lVar11 = this.f256f;
                if (obj instanceof List) {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        lVar11.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        Q0.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        e12 = i1.a.b(new C0041a((String) obj22, (String) obj23, (String) list11.get(2)));
                    }
                } else {
                    e12 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                }
                A0.b.g(e12, lVar11);
                break;
            case 11:
                P0.l lVar12 = this.f256f;
                if (obj instanceof List) {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        lVar12.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        Q0.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        e13 = i1.a.b(new C0041a((String) obj24, (String) obj25, (String) list12.get(2)));
                    }
                } else {
                    e13 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError'.", "");
                }
                A0.b.g(e13, lVar12);
                break;
            case 12:
                P0.l lVar13 = this.f256f;
                if (obj instanceof List) {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        lVar13.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj26 = list13.get(0);
                        Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        e14 = i1.a.b(new C0041a((String) obj26, (String) obj27, (String) list13.get(2)));
                    }
                } else {
                    e14 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                }
                A0.b.g(e14, lVar13);
                break;
            case 13:
                P0.l lVar14 = this.f256f;
                if (obj instanceof List) {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        lVar14.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        Q0.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        e15 = i1.a.b(new C0041a((String) obj28, (String) obj29, (String) list14.get(2)));
                    }
                } else {
                    e15 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                }
                A0.b.g(e15, lVar14);
                break;
            default:
                P0.l lVar15 = this.f256f;
                if (obj instanceof List) {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        lVar15.i(new F0.e(F0.h.f469a));
                        break;
                    } else {
                        Object obj30 = list15.get(0);
                        Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        Q0.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        e16 = i1.a.b(new C0041a((String) obj30, (String) obj31, (String) list15.get(2)));
                    }
                } else {
                    e16 = A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                }
                A0.b.g(e16, lVar15);
                break;
        }
    }
}
