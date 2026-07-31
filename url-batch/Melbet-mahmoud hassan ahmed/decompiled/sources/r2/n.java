package r2;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends a {

    /* renamed from: e, reason: collision with root package name */
    private final v f21167e;

    public n(int i7, @RecentlyNonNull String str, @RecentlyNonNull String str2, a aVar, v vVar) {
        super(i7, str, str2, aVar);
        this.f21167e = vVar;
    }

    @Override // r2.a
    @RecentlyNonNull
    public final JSONObject e() {
        JSONObject e7 = super.e();
        v f7 = f();
        e7.put("Response Info", f7 == null ? "null" : f7.f());
        return e7;
    }

    @RecentlyNullable
    public v f() {
        if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue()) {
            return this.f21167e;
        }
        return null;
    }

    @Override // r2.a
    @RecentlyNonNull
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
