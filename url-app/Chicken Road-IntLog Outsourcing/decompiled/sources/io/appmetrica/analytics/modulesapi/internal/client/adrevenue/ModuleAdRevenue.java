package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f9765a;

    /* renamed from: b, reason: collision with root package name */
    private final Currency f9766b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleAdType f9767c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9768d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9769e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9770f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9771g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9772h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9773i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f9774j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f9775k;

    public ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, boolean z) {
        this.f9765a = bigDecimal;
        this.f9766b = currency;
        this.f9767c = moduleAdType;
        this.f9768d = str;
        this.f9769e = str2;
        this.f9770f = str3;
        this.f9771g = str4;
        this.f9772h = str5;
        this.f9773i = str6;
        this.f9774j = map;
        this.f9775k = z;
    }

    public final String getAdNetwork() {
        return this.f9768d;
    }

    public final String getAdPlacementId() {
        return this.f9771g;
    }

    public final String getAdPlacementName() {
        return this.f9772h;
    }

    public final BigDecimal getAdRevenue() {
        return this.f9765a;
    }

    public final ModuleAdType getAdType() {
        return this.f9767c;
    }

    public final String getAdUnitId() {
        return this.f9769e;
    }

    public final String getAdUnitName() {
        return this.f9770f;
    }

    public final boolean getAutoCollected() {
        return this.f9775k;
    }

    public final Currency getCurrency() {
        return this.f9766b;
    }

    public final Map<String, String> getPayload() {
        return this.f9774j;
    }

    public final String getPrecision() {
        return this.f9773i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i2, e eVar) {
        this(bigDecimal, currency, (i2 & 4) != 0 ? null : moduleAdType, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : map, (i2 & 1024) != 0 ? true : z);
    }
}
