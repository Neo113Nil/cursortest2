package w3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.b;
import t3.c;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0285a f46674d = new C0285a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f46675a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46676b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46677c;

    /* renamed from: w3.a$a, reason: collision with other inner class name */
    public static final class C0285a {
        public /* synthetic */ C0285a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(c tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            return tracer.j();
        }

        private C0285a() {
        }
    }

    public a(Context context, String libraryPackageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        this.f46675a = context;
        this.f46676b = libraryPackageName;
    }

    private final SharedPreferences b() {
        this.f46677c = true;
        SharedPreferences sharedPreferences = this.f46675a.getSharedPreferences("tracer-" + this.f46676b, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @Override // o3.b
    public void a(Long l4, String str, Long l5, String str2, Long l6) {
        boolean z4;
        SharedPreferences.Editor edit = b().edit();
        boolean z5 = true;
        if (l4 == null || l4.longValue() <= 0) {
            z4 = false;
        } else {
            edit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + l4.longValue());
            z4 = true;
        }
        if (str == null || l5 == null || l5.longValue() <= 0) {
            z5 = z4;
        } else {
            edit.putLong("system." + str + ".shutdown.until.ts", System.currentTimeMillis() + l5.longValue());
        }
        if (z5) {
            edit.apply();
        }
    }

    public boolean c(String str, String str2) {
        if (!this.f46677c && Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < b().getLong("system.shutdown.until.ts", Long.MIN_VALUE)) {
            return true;
        }
        if (str != null) {
            if (currentTimeMillis < b().getLong("system." + str + ".shutdown.until.ts", Long.MIN_VALUE)) {
                return true;
            }
        }
        return false;
    }
}
