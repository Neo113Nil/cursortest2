package C0;

import D0.C0041a;
import D0.C0044d;
import D0.C0049i;
import D0.C0050j;
import D0.C0057q;
import D0.C0062w;
import D0.S;
import P.O;
import android.net.http.SslError;
import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import java.util.List;
import m0.x;
import org.json.JSONException;
import org.json.JSONObject;
import w0.InterfaceC0316b;
import w0.InterfaceC0317c;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0317c, InterfaceC0316b, E0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f227f;

    public /* synthetic */ f(int i2, Object obj) {
        this.f226e = i2;
        this.f227f = obj;
    }

    @Override // E0.b
    public boolean a(View view) {
        int i2 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f227f;
            if (i2 >= clsArr.length) {
                return false;
            }
            if (clsArr[i2].isInstance(view)) {
                return true;
            }
            i2++;
        }
    }

    @Override // w0.InterfaceC0317c
    public void b(Object obj) {
        switch (this.f226e) {
            case 1:
                boolean z2 = obj instanceof List;
                long j2 = ((C0049i) this.f227f).f363f;
                if (!z2) {
                    i1.a.b(new C0041a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j2);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        i1.a.b(new C0041a((String) obj2, (String) obj3, (String) list.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j2);
                        break;
                    }
                }
                break;
            default:
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((x) ((f) this.f227f).f227f).a(z3);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // w0.InterfaceC0316b
    public void g(Object obj, O o2) {
        List L2;
        List L3;
        List L4;
        List L5;
        switch (this.f226e) {
            case 2:
                C0050j c0050j = (C0050j) this.f227f;
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0044d) c0050j.f366a.f261c).a(((Long) obj2).longValue(), new C0057q(c0050j));
                    L2 = i1.a.u(null);
                } catch (Throwable th) {
                    L2 = i1.a.L(th);
                }
                o2.b(L2);
                return;
            case 3:
                C0050j c0050j2 = (C0050j) this.f227f;
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj3).longValue();
                Object obj4 = list.get(1);
                Q0.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0044d) c0050j2.f366a.f261c).a(longValue, new C0062w((String) obj4, c0050j2));
                    L3 = i1.a.u(null);
                } catch (Throwable th2) {
                    L3 = i1.a.L(th2);
                }
                o2.b(L3);
                return;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                C0050j c0050j3 = (C0050j) this.f227f;
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i2 = 0;
                Object obj5 = list2.get(0);
                Q0.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj5;
                Object obj6 = list2.get(1);
                Q0.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                S s2 = (S) obj6;
                try {
                } catch (Throwable th3) {
                    L4 = i1.a.L(th3);
                }
                switch (s2.ordinal()) {
                    case 0:
                        i2 = 4;
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                    case 1:
                        i2 = 1;
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                    case 2:
                        i2 = 2;
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                    case 3:
                        i2 = 5;
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                    case K.k.LONG_FIELD_NUMBER /* 4 */:
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                    case K.k.STRING_FIELD_NUMBER /* 5 */:
                        i2 = 3;
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                    case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        c0050j3.f366a.getClass();
                        throw new IllegalArgumentException(s2 + " doesn't represent a native value.");
                    default:
                        i2 = -1;
                        L4 = i1.a.u(Boolean.valueOf(sslError.hasError(i2)));
                        o2.b(L4);
                        return;
                }
            default:
                C0050j c0050j4 = (C0050j) this.f227f;
                Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj7 = ((List) obj).get(0);
                Q0.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0044d) c0050j4.f366a.f261c).a(((Long) obj7).longValue(), WebStorage.getInstance());
                    L5 = i1.a.u(null);
                } catch (Throwable th4) {
                    L5 = i1.a.L(th4);
                }
                o2.b(L5);
                return;
        }
    }
}
