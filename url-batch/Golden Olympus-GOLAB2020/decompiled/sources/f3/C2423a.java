package f3;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o3.b;
import org.json.JSONObject;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2423a {

    /* renamed from: a, reason: collision with root package name */
    private final String f36658a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36659b;

    /* renamed from: c, reason: collision with root package name */
    private final b f36660c;

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    public static final class C0217a {

        /* renamed from: a, reason: collision with root package name */
        private String f36661a;

        /* renamed from: b, reason: collision with root package name */
        private String f36662b;

        /* renamed from: c, reason: collision with root package name */
        private b f36663c;

        public final C2423a a() {
            return new C2423a(this, null);
        }

        public final String b() {
            return this.f36661a;
        }

        public final b c() {
            return this.f36663c;
        }

        public final String d() {
            return this.f36662b;
        }

        public final C0217a e(String featureName) {
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            this.f36661a = featureName;
            return this;
        }

        public final C0217a f(b limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.f36663c = limits;
            return this;
        }
    }

    public /* synthetic */ C2423a(C0217a c0217a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0217a);
    }

    public final void a(String str, String str2) {
        if (str2 == null || StringsKt.z(str2)) {
            return;
        }
        try {
            b(new JSONObject(str2));
        } catch (Exception unused) {
            Log.w("Tracer", "Cannot parse content with Content-Type: " + str);
        }
    }

    public final void b(JSONObject responseObject) {
        Intrinsics.checkNotNullParameter(responseObject, "responseObject");
        JSONObject optJSONObject = responseObject.optJSONObject("commands");
        if (optJSONObject == null || this.f36660c == null) {
            return;
        }
        this.f36660c.a(Long.valueOf(optJSONObject.optLong("globalShutdownMs")), this.f36658a, this.f36658a != null ? Long.valueOf(optJSONObject.optLong("featureShutdownMs")) : null, this.f36659b, (this.f36658a == null || this.f36659b == null) ? null : Long.valueOf(optJSONObject.optLong("tagShutdownMs")));
    }

    private C2423a(C0217a c0217a) {
        this.f36658a = c0217a.b();
        this.f36659b = c0217a.d();
        this.f36660c = c0217a.c();
    }
}
