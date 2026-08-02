package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f13196a;

    /* renamed from: b, reason: collision with root package name */
    private final Currency f13197b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleAdType f13198c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13199d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13200e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13201f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13202g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13203h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13204i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f13205j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f13206k;

    public ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, boolean z) {
        this.f13196a = bigDecimal;
        this.f13197b = currency;
        this.f13198c = moduleAdType;
        this.f13199d = str;
        this.f13200e = str2;
        this.f13201f = str3;
        this.f13202g = str4;
        this.f13203h = str5;
        this.f13204i = str6;
        this.f13205j = map;
        this.f13206k = z;
    }

    public final String getAdNetwork() {
        return this.f13199d;
    }

    public final String getAdPlacementId() {
        return this.f13202g;
    }

    public final String getAdPlacementName() {
        return this.f13203h;
    }

    public final BigDecimal getAdRevenue() {
        return this.f13196a;
    }

    public final ModuleAdType getAdType() {
        return this.f13198c;
    }

    public final String getAdUnitId() {
        return this.f13200e;
    }

    public final String getAdUnitName() {
        return this.f13201f;
    }

    public final boolean getAutoCollected() {
        return this.f13206k;
    }

    public final Currency getCurrency() {
        return this.f13197b;
    }

    public final Map<String, String> getPayload() {
        return this.f13205j;
    }

    public final String getPrecision() {
        return this.f13204i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i4, e eVar) {
        this(bigDecimal, currency, (i4 & 4) != 0 ? null : moduleAdType, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4, (i4 & 128) != 0 ? null : str5, (i4 & 256) != 0 ? null : str6, (i4 & 512) != 0 ? null : map, (i4 & 1024) != 0 ? true : z);
    }
}
