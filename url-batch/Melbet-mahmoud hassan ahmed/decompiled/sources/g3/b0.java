package g3;

import a3.g2;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.ym0;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class b0 implements nb3<j> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ym0 f16605a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f16606b;

    b0(f0 f0Var, ym0 ym0Var) {
        this.f16606b = f0Var;
        this.f16605a = ym0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(j jVar) {
        boolean z6;
        boolean z7;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        po0 po0Var;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        l lVar;
        j jVar2 = jVar;
        if (!((Boolean) sw.c().b(m10.E5)).booleanValue()) {
            try {
                this.f16605a.s("QueryInfo generation has been disabled.");
                return;
            } catch (RemoteException e7) {
                io0.d("QueryInfo generation has been disabled.".concat(e7.toString()));
                return;
            }
        }
        try {
            if (jVar2 == null) {
                this.f16605a.b3(null, null, null);
                f0.U6(this.f16606b, "sgs", "rid", "-1");
                return;
            }
            try {
                String optString = new JSONObject(jVar2.f16656b).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    io0.g("The request ID is empty in request JSON.");
                    this.f16605a.s("Internal error: request ID is empty in request JSON.");
                    f0.U6(this.f16606b, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) sw.c().b(m10.f8278p5)).booleanValue()) {
                    lVar = this.f16606b.f16628p;
                    lVar.c(optString, jVar2.f16656b);
                }
                Bundle bundle = jVar2.f16657c;
                z6 = this.f16606b.f16635w;
                if (z6 && bundle != null) {
                    str5 = this.f16606b.f16637y;
                    if (bundle.getInt(str5, -1) == -1) {
                        str6 = this.f16606b.f16637y;
                        atomicInteger = this.f16606b.f16638z;
                        bundle.putInt(str6, atomicInteger.get());
                    }
                }
                z7 = this.f16606b.f16634v;
                if (z7 && bundle != null) {
                    str = this.f16606b.f16636x;
                    if (TextUtils.isEmpty(bundle.getString(str))) {
                        str2 = this.f16606b.B;
                        if (TextUtils.isEmpty(str2)) {
                            f0 f0Var = this.f16606b;
                            g2 q7 = y2.t.q();
                            context = this.f16606b.f16619g;
                            po0Var = this.f16606b.A;
                            f0Var.B = q7.L(context, po0Var.f10301f);
                        }
                        str3 = this.f16606b.f16636x;
                        str4 = this.f16606b.B;
                        bundle.putString(str3, str4);
                    }
                }
                this.f16605a.b3(jVar2.f16655a, jVar2.f16656b, bundle);
                f0.U6(this.f16606b, "sgs", "rid", optString);
            } catch (JSONException e8) {
                io0.g("Failed to create JSON object from the request string.");
                ym0 ym0Var = this.f16605a;
                String obj = e8.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 33);
                sb.append("Internal error for request JSON: ");
                sb.append(obj);
                ym0Var.s(sb.toString());
                f0.U6(this.f16606b, "sgf", "sgf_reason", "request_invalid");
            }
        } catch (RemoteException e9) {
            io0.e("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        String message = th.getMessage();
        y2.t.p().s(th, "SignalGeneratorImpl.generateSignals");
        f0.U6(this.f16606b, "sgf", "sgf_reason", message);
        try {
            ym0 ym0Var = this.f16605a;
            String valueOf = String.valueOf(message);
            ym0Var.s(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
