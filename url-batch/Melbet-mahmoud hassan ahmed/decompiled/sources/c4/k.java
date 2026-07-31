package c4;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements c2 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f2008a;

    /* renamed from: b, reason: collision with root package name */
    private final m f2009b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f2010c;

    public k(Application application, m mVar, Executor executor) {
        this.f2008a = application;
        this.f2009b = mVar;
        this.f2010c = executor;
    }

    @Override // c4.c2
    public final boolean a(String str, JSONObject jSONObject) {
        str.hashCode();
        if (str.equals("clear")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                String valueOf = String.valueOf(jSONObject.toString());
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Action[clear]: wrong args.".concat(valueOf) : new String("Action[clear]: wrong args."));
            } else {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    String optString = optJSONArray.optString(i7);
                    if (TextUtils.isEmpty(optString)) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Action[clear]: empty key at index: ");
                        sb.append(i7);
                        Log.d("UserMessagingPlatform", sb.toString());
                    } else {
                        hashSet.add(optString);
                    }
                }
                f1.b(this.f2008a, hashSet);
            }
            return true;
        }
        if (!str.equals("write")) {
            return false;
        }
        h1 h1Var = new h1(this.f2008a);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            String valueOf2 = String.valueOf(opt);
            StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 23 + valueOf2.length());
            sb2.append("Writing to storage: [");
            sb2.append(next);
            sb2.append("] ");
            sb2.append(valueOf2);
            Log.d("UserMessagingPlatform", sb2.toString());
            if (h1Var.d(next, opt)) {
                this.f2009b.f().add(next);
            } else {
                String valueOf3 = String.valueOf(next);
                Log.d("UserMessagingPlatform", valueOf3.length() != 0 ? "Failed writing key: ".concat(valueOf3) : new String("Failed writing key: "));
            }
        }
        this.f2009b.g();
        h1Var.c();
        return true;
    }

    @Override // c4.c2
    public final Executor zza() {
        return this.f2010c;
    }
}
