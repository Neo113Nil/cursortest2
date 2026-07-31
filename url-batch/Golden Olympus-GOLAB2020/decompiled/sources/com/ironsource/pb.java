package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.qf;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class pb implements qf, qf.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private JSONObject f18617a = new JSONObject();

    private final JSONObject h() {
        JSONObject optJSONObject = this.f18617a.optJSONObject(qb.f18817a);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    @Override // com.ironsource.qf.a
    public void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f18617a;
        }
        this.f18617a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + this.f18617a);
    }

    @Override // com.ironsource.rb
    public long b() {
        String optString = h().optString(sb.f19046d);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long n4 = StringsKt.n(optString);
        if (n4 != null) {
            return n4.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.rb
    public int c() {
        String optString = h().optString(sb.f19044b);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.qf
    @NotNull
    public JSONObject config() {
        return this.f18617a;
    }

    @Override // com.ironsource.rb
    public boolean d() {
        return h().optBoolean(sb.f19047e, true);
    }

    @Override // com.ironsource.rb
    public long e() {
        String optString = h().optString(sb.f19045c);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long n4 = StringsKt.n(optString);
        if (n4 != null) {
            return n4.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.rb
    public boolean f() {
        return h().optBoolean(sb.f19049g, true);
    }

    @Override // com.ironsource.rb
    public boolean g() {
        String optString = h().optString(sb.f19043a);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = optString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, com.ironsource.mediationsdk.metadata.a.f17681g);
    }

    @Override // com.ironsource.rb
    public boolean a() {
        return h().optBoolean(sb.f19048f, true);
    }
}
