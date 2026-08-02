package Y1;

import E.InterfaceC0010k;
import E1.AbstractC0033i;
import a.AbstractC0129a;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import android.util.Log;
import android.view.View;
import android.webkit.WebViewClient;
import com.startapp.sdk.internal.e3;
import com.startapp.sdk.internal.ng;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.Bo;
import io.appmetrica.analytics.impl.C0604jn;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.impl.C0713o2;
import io.appmetrica.analytics.impl.C0835sl;
import io.appmetrica.analytics.impl.C0964xk;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.InterfaceC0473el;
import io.appmetrica.analytics.impl.InterfaceC0682mn;
import io.appmetrica.analytics.impl.InterfaceC0743p6;
import io.appmetrica.analytics.impl.Pd;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.Yd;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.impl.zo;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements P1.c, P1.b, InterfaceC0010k, Z1.c, e3, d1.c, FunctionWithThrowable, Yd, InterfaceC0743p6, InterfaceC0682mn, Bo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1768a;

    public /* synthetic */ M(int i3) {
        this.f1768a = i3;
    }

    @Override // com.startapp.sdk.internal.e3
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Boolean a3;
        List a4;
        switch (this.f1768a) {
            case 15:
                a3 = C2.a((ActivityManager) obj);
                return a3;
            case 16:
            case 17:
            default:
                a4 = C0835sl.a((SubscriptionManager) obj);
                return a4;
            case 18:
                return T7.a((UiModeManager) obj);
            case C0642l9.f7777C /* 19 */:
                return C0604jn.b((Activity) obj);
        }
    }

    @Override // Z1.c
    public boolean b(View view) {
        return view.hasFocus();
    }

    @Override // E.InterfaceC0010k
    public E.W c(E.W w3) {
        return w3;
    }

    @Override // P1.c
    public void n(Object obj) {
        switch (this.f1768a) {
            case 0:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                    int i3 = b0.f1823c;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i4 = b0.f1823c;
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i5 = b0.f1823c;
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                    int i6 = b0.f1823c;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i7 = b0.f1823c;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i8 = b0.f1823c;
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i9 = b0.f1823c;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i10 = b0.f1823c;
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i11 = b0.f1823c;
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                    int i12 = b0.f1823c;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i13 = b0.f1823c;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i14 = b0.f1823c;
                        break;
                    }
                }
            case 4:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                    int i15 = b0.f1823c;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i16 = b0.f1823c;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i17 = b0.f1823c;
                        break;
                    }
                }
            case 5:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                    int i18 = b0.f1823c;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i19 = b0.f1823c;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i20 = b0.f1823c;
                        break;
                    }
                }
            case 6:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                    int i21 = b0.f1823c;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i22 = b0.f1823c;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i23 = b0.f1823c;
                        break;
                    }
                }
            case 7:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                    int i24 = b0.f1823c;
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i25 = b0.f1823c;
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i26 = b0.f1823c;
                        break;
                    }
                }
            default:
                if (!(obj instanceof List)) {
                    AbstractC0033i.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                    int i27 = b0.f1823c;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i28 = b0.f1823c;
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i29 = b0.f1823c;
                        break;
                    }
                }
        }
    }

    @Override // d1.c
    public void onSuccess(Object obj) {
        ng.a((H0.a) obj);
    }

    public /* synthetic */ M(int i3, Object obj) {
        this.f1768a = i3;
    }

    @Override // io.appmetrica.analytics.impl.Yd
    public InterfaceC0473el a(E0 e02) {
        switch (this.f1768a) {
            case 16:
                return Pd.a(e02);
            default:
                return Pd.b(e02);
        }
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f1768a) {
            case 23:
                return yo.a(jSONObject, jSONObject2);
            default:
                return zo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0682mn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0964xk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0743p6
    public boolean a(Throwable th) {
        return C0713o2.a(th);
    }

    @Override // P1.b
    public void a(Object obj, V0.e eVar) {
        List L;
        List L2;
        switch (this.f1768a) {
            case 9:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
                WebViewClient webViewClient = (WebViewClient) obj2;
                Object obj3 = list.get(1);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                try {
                } catch (Throwable th) {
                    if (th instanceof C0104a) {
                        C0104a c0104a = th;
                        L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                    } else {
                        L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                if (webViewClient instanceof b0) {
                    ((b0) webViewClient).f1825b = booleanValue;
                    L = AbstractC0129a.r(null);
                    eVar.n(L);
                    return;
                }
                throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            default:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    L2 = AbstractC0129a.r(Boolean.valueOf(C2.b.y((String) obj4)));
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
        }
    }
}
