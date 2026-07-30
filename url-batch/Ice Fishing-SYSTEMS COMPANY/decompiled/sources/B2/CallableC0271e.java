package B2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2790Tf;
import com.google.android.gms.internal.ads.C3280gu;
import com.google.android.gms.internal.ads.C3400j7;
import com.google.android.gms.internal.ads.InterfaceC3240g7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import k2.C4636g;
import k2.EnumC4631b;
import org.json.JSONObject;

/* renamed from: B2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0271e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f226d;

    public /* synthetic */ CallableC0271e(Object obj, Object obj2, Object obj3, int i) {
        this.f223a = i;
        this.f224b = obj;
        this.f226d = obj2;
        this.f225c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C3280gu c3280gu;
        Object obj = this.f226d;
        Object obj2 = this.f224b;
        Object obj3 = this.f225c;
        switch (this.f223a) {
            case 0:
                BinderC0278l binderC0278l = (BinderC0278l) obj2;
                InterfaceC3240g7 interfaceC3240g7 = binderC0278l.f271w.f31319b;
                String i = interfaceC3240g7 != null ? interfaceC3240g7.i(binderC0278l.f270v, (View) V2.b.A0((V2.a) obj3), null) : "";
                if (TextUtils.isEmpty(i)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (ArrayList) obj) {
                    if (BinderC0278l.K3(uri, binderC0278l.f262S, binderC0278l.f263T)) {
                        arrayList.add(BinderC0278l.N3(uri, "ms", i));
                    } else {
                        String valueOf = String.valueOf(uri);
                        int i4 = t2.C.f40822b;
                        u2.i.f("Not a Google URL: ".concat(valueOf));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 1:
                Uri uri2 = (Uri) obj;
                BinderC0278l binderC0278l2 = (BinderC0278l) obj2;
                binderC0278l2.getClass();
                try {
                    V2.a aVar = (V2.a) obj3;
                    uri2 = (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vd)).booleanValue() || (c3280gu = binderC0278l2.f272x) == null) ? binderC0278l2.f271w.b(uri2, binderC0278l2.f270v, (View) V2.b.A0(aVar), null) : c3280gu.a(uri2, binderC0278l2.f270v, (View) V2.b.A0(aVar), null);
                } catch (C3400j7 e6) {
                    int i9 = t2.C.f40822b;
                    u2.i.g("", e6);
                }
                if (uri2.getQueryParameter("ms") != null) {
                    return uri2;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 2:
                BinderC0278l binderC0278l3 = (BinderC0278l) obj2;
                C2790Tf c2790Tf = (C2790Tf) obj;
                return binderC0278l3.L3(binderC0278l3.f270v, c2790Tf.f27793n, c2790Tf.f27794u, c2790Tf.f27795v, c2790Tf.f27796w, (Bundle) obj3);
            case 3:
                E2.a.a(((E) obj2).f158c, EnumC4631b.BANNER, (C4636g) obj, (F) obj3);
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((com.google.android.gms.internal.consent_sdk.D) obj2).b((String) obj, (JSONObject) obj3));
        }
    }
}
