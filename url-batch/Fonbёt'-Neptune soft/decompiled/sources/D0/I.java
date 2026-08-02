package D0;

import java.util.List;
import w0.InterfaceC0317c;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC0317c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f248f;

    public /* synthetic */ I(P p2, int i2) {
        this.f247e = i2;
        this.f248f = p2;
    }

    @Override // w0.InterfaceC0317c
    public final void b(Object obj) {
        switch (this.f247e) {
            case 0:
                boolean z2 = obj instanceof List;
                P0.l lVar = (P0.l) this.f248f.f266g;
                if (!z2) {
                    lVar.i(new Q(A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", "")));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.i(new Q((String) list.get(0)));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.i(new Q(i1.a.b(new C0041a((String) obj2, (String) obj3, (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                boolean z3 = obj instanceof List;
                P0.l lVar2 = (P0.l) this.f248f.f266g;
                if (!z3) {
                    lVar2.i(new Q(A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", "")));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.i(new Q(F0.h.f469a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.i(new Q(i1.a.b(new C0041a((String) obj4, (String) obj5, (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                boolean z4 = obj instanceof List;
                P0.l lVar3 = (P0.l) this.f248f.f266g;
                if (!z4) {
                    lVar3.i(new Q(A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", "")));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        if (list3.get(0) != null) {
                            Object obj6 = list3.get(0);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            lVar3.i(new Q((List) obj6));
                            break;
                        } else {
                            lVar3.i(new Q(A0.b.e("null-error", "Flutter api returned null value for non-null return value.", "")));
                            break;
                        }
                    } else {
                        Object obj7 = list3.get(0);
                        Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        lVar3.i(new Q(i1.a.b(new C0041a((String) obj7, (String) obj8, (String) list3.get(2)))));
                        break;
                    }
                }
            default:
                boolean z5 = obj instanceof List;
                P0.l lVar4 = (P0.l) this.f248f.f266g;
                if (!z5) {
                    lVar4.i(new Q(A0.b.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", "")));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        if (list4.get(0) != null) {
                            Object obj9 = list4.get(0);
                            Q0.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            lVar4.i(new Q((Boolean) obj9));
                            break;
                        } else {
                            lVar4.i(new Q(A0.b.e("null-error", "Flutter api returned null value for non-null return value.", "")));
                            break;
                        }
                    } else {
                        Object obj10 = list4.get(0);
                        Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list4.get(1);
                        Q0.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        lVar4.i(new Q(i1.a.b(new C0041a((String) obj10, (String) obj11, (String) list4.get(2)))));
                        break;
                    }
                }
        }
    }
}
