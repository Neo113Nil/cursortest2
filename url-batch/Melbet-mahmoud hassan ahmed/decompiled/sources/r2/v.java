package r2;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final zy f21181a;

    /* renamed from: b, reason: collision with root package name */
    private final List<k> f21182b = new ArrayList();

    private v(zy zyVar) {
        this.f21181a = zyVar;
        if (!((Boolean) sw.c().b(m10.f8191e6)).booleanValue() || zyVar == null) {
            return;
        }
        try {
            List<tv> e7 = zyVar.e();
            if (e7 != null) {
                Iterator<tv> it = e7.iterator();
                while (it.hasNext()) {
                    k e8 = k.e(it.next());
                    if (e8 != null) {
                        this.f21182b.add(e8);
                    }
                }
            }
        } catch (RemoteException e9) {
            io0.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e9);
        }
    }

    public static v d(zy zyVar) {
        if (zyVar != null) {
            return new v(zyVar);
        }
        return null;
    }

    public static v e(zy zyVar) {
        return new v(zyVar);
    }

    public List<k> a() {
        return this.f21182b;
    }

    @RecentlyNullable
    public String b() {
        try {
            zy zyVar = this.f21181a;
            if (zyVar != null) {
                return zyVar.b();
            }
            return null;
        } catch (RemoteException e7) {
            io0.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
            return null;
        }
    }

    @RecentlyNullable
    public String c() {
        try {
            zy zyVar = this.f21181a;
            if (zyVar != null) {
                return zyVar.d();
            }
            return null;
        } catch (RemoteException e7) {
            io0.e("Could not forward getResponseId to ResponseInfo.", e7);
            return null;
        }
    }

    @RecentlyNonNull
    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        String c7 = c();
        if (c7 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", c7);
        }
        String b7 = b();
        if (b7 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", b7);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<k> it = this.f21182b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
