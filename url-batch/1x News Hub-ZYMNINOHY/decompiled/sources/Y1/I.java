package Y1;

import b2.C0195i;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements P1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E2.o f1761b;

    public /* synthetic */ I(E2.o oVar, int i3) {
        this.f1760a = i3;
        this.f1761b = oVar;
    }

    @Override // P1.c
    public final void n(Object obj) {
        switch (this.f1760a) {
            case 0:
                boolean z = obj instanceof List;
                l2.l lVar = (l2.l) this.f1761b.f458b;
                if (!z) {
                    lVar.invoke(new N(android.support.v4.media.session.a.k(new C0104a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", ""))));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.invoke(new N((String) list.get(0)));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.invoke(new N(android.support.v4.media.session.a.k(new C0104a((String) obj2, (String) obj3, (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                boolean z2 = obj instanceof List;
                l2.l lVar2 = (l2.l) this.f1761b.f458b;
                if (!z2) {
                    lVar2.invoke(new N(android.support.v4.media.session.a.k(new C0104a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", ""))));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.invoke(new N(C0195i.f2555a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.invoke(new N(android.support.v4.media.session.a.k(new C0104a((String) obj4, (String) obj5, (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                boolean z3 = obj instanceof List;
                l2.l lVar3 = (l2.l) this.f1761b.f458b;
                if (!z3) {
                    lVar3.invoke(new N(android.support.v4.media.session.a.k(new C0104a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", ""))));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        if (list3.get(0) != null) {
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            lVar3.invoke(new N((List) obj6));
                            break;
                        } else {
                            lVar3.invoke(new N(android.support.v4.media.session.a.k(new C0104a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                            break;
                        }
                    } else {
                        Object obj7 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        lVar3.invoke(new N(android.support.v4.media.session.a.k(new C0104a((String) obj7, (String) obj8, (String) list3.get(2)))));
                        break;
                    }
                }
            default:
                boolean z4 = obj instanceof List;
                l2.l lVar4 = (l2.l) this.f1761b.f458b;
                if (!z4) {
                    lVar4.invoke(new N(android.support.v4.media.session.a.k(new C0104a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", ""))));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        if (list4.get(0) != null) {
                            Object obj9 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            lVar4.invoke(new N((Boolean) obj9));
                            break;
                        } else {
                            lVar4.invoke(new N(android.support.v4.media.session.a.k(new C0104a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                            break;
                        }
                    } else {
                        Object obj10 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        lVar4.invoke(new N(android.support.v4.media.session.a.k(new C0104a((String) obj10, (String) obj11, (String) list4.get(2)))));
                        break;
                    }
                }
        }
    }
}
