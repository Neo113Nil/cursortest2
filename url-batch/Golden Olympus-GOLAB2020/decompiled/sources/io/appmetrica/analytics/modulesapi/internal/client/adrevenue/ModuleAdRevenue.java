package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f40498a;

    /* renamed from: b, reason: collision with root package name */
    private final Currency f40499b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleAdType f40500c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40501d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40502e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40503f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40504g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40505h;

    /* renamed from: i, reason: collision with root package name */
    private final String f40506i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f40507j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f40508k;

    public ModuleAdRevenue(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @Nullable ModuleAdType moduleAdType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map, boolean z4) {
        this.f40498a = bigDecimal;
        this.f40499b = currency;
        this.f40500c = moduleAdType;
        this.f40501d = str;
        this.f40502e = str2;
        this.f40503f = str3;
        this.f40504g = str4;
        this.f40505h = str5;
        this.f40506i = str6;
        this.f40507j = map;
        this.f40508k = z4;
    }

    @Nullable
    public final String getAdNetwork() {
        return this.f40501d;
    }

    @Nullable
    public final String getAdPlacementId() {
        return this.f40504g;
    }

    @Nullable
    public final String getAdPlacementName() {
        return this.f40505h;
    }

    @NotNull
    public final BigDecimal getAdRevenue() {
        return this.f40498a;
    }

    @Nullable
    public final ModuleAdType getAdType() {
        return this.f40500c;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f40502e;
    }

    @Nullable
    public final String getAdUnitName() {
        return this.f40503f;
    }

    public final boolean getAutoCollected() {
        return this.f40508k;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.f40499b;
    }

    @Nullable
    public final Map<String, String> getPayload() {
        return this.f40507j;
    }

    @Nullable
    public final String getPrecision() {
        return this.f40506i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, currency, (i4 & 4) != 0 ? null : moduleAdType, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str6, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map, (i4 & 1024) != 0 ? true : z4);
    }
}
