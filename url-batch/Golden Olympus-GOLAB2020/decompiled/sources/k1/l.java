package k1;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f41004b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f41005a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41005a = context.getSharedPreferences("authsdk", 0);
    }

    public final String a() {
        return this.f41005a.getString("state_value", null);
    }

    public final void b(String stateValue) {
        Intrinsics.checkNotNullParameter(stateValue, "stateValue");
        this.f41005a.edit().putString("state_value", stateValue).apply();
    }
}
