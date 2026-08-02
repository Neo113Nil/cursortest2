package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f8800a;

    /* renamed from: b, reason: collision with root package name */
    private final Currency f8801b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleAdType f8802c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8803d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8804e;
    private final String f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8805g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8806h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8807i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f8808j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f8809k;

    public ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, boolean z) {
        this.f8800a = bigDecimal;
        this.f8801b = currency;
        this.f8802c = moduleAdType;
        this.f8803d = str;
        this.f8804e = str2;
        this.f = str3;
        this.f8805g = str4;
        this.f8806h = str5;
        this.f8807i = str6;
        this.f8808j = map;
        this.f8809k = z;
    }

    public final String getAdNetwork() {
        return this.f8803d;
    }

    public final String getAdPlacementId() {
        return this.f8805g;
    }

    public final String getAdPlacementName() {
        return this.f8806h;
    }

    public final BigDecimal getAdRevenue() {
        return this.f8800a;
    }

    public final ModuleAdType getAdType() {
        return this.f8802c;
    }

    public final String getAdUnitId() {
        return this.f8804e;
    }

    public final String getAdUnitName() {
        return this.f;
    }

    public final boolean getAutoCollected() {
        return this.f8809k;
    }

    public final Currency getCurrency() {
        return this.f8801b;
    }

    public final Map<String, String> getPayload() {
        return this.f8808j;
    }

    public final String getPrecision() {
        return this.f8807i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i3, f fVar) {
        this(bigDecimal, currency, (i3 & 4) != 0 ? null : moduleAdType, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : str6, (i3 & 512) != 0 ? null : map, (i3 & 1024) != 0 ? true : z);
    }
}
