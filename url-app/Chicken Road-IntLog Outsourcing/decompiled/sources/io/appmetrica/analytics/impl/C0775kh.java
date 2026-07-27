package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775kh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f8622a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8624c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8625d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8626e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8627f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8628g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8629h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f8630i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8631j;

    public C0775kh(C1047v4 c1047v4) {
        this(c1047v4.f9426a, c1047v4.f9427b, c1047v4.f9429d, c1047v4.f9430e, c1047v4.f9431f, c1047v4.f9432g, c1047v4.f9433h, c1047v4.f9434i, c1047v4.f9435j, c1047v4.f9436k);
    }

    public static C0775kh a() {
        return new C0775kh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0775kh mergeFrom(C1047v4 c1047v4) {
        return new C0775kh((String) WrapUtils.getOrDefaultNullable(c1047v4.f9426a, this.f8622a), (Boolean) WrapUtils.getOrDefaultNullable(c1047v4.f9427b, Boolean.valueOf(this.f8623b)), (Boolean) WrapUtils.getOrDefaultNullable(c1047v4.f9429d, Boolean.valueOf(this.f8624c)), (Integer) WrapUtils.getOrDefaultNullable(c1047v4.f9430e, Integer.valueOf(this.f8625d)), (Integer) WrapUtils.getOrDefaultNullable(c1047v4.f9431f, Integer.valueOf(this.f8626e)), (Integer) WrapUtils.getOrDefaultNullable(c1047v4.f9432g, Integer.valueOf(this.f8627f)), (Boolean) WrapUtils.getOrDefaultNullable(c1047v4.f9433h, Boolean.valueOf(this.f8628g)), (Boolean) WrapUtils.getOrDefaultNullable(c1047v4.f9434i, Boolean.valueOf(this.f8629h)), (Map) WrapUtils.getOrDefaultNullable(c1047v4.f9435j, this.f8630i), (Integer) WrapUtils.getOrDefaultNullable(c1047v4.f9436k, Integer.valueOf(this.f8631j)));
    }

    public C0775kh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f8622a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f8623b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f8624c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f8625d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f8626e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f8627f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f8628g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f8629h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f8630i = map;
        this.f8631j = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C1047v4 c1047v4) {
        Map<String, String> map;
        String str;
        Boolean bool = c1047v4.f9427b;
        if (bool != null && this.f8623b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c1047v4.f9429d;
        if (bool2 != null && this.f8624c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c1047v4.f9430e;
        if (num != null && this.f8625d != num.intValue()) {
            return false;
        }
        Integer num2 = c1047v4.f9431f;
        if (num2 != null && this.f8626e != num2.intValue()) {
            return false;
        }
        Integer num3 = c1047v4.f9432g;
        if (num3 != null && this.f8627f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c1047v4.f9433h;
        if (bool3 != null && this.f8628g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c1047v4.f9434i;
        if (bool4 != null && this.f8629h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c1047v4.f9426a;
        if (str2 != null && ((str = this.f8622a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c1047v4.f9435j;
        if (map2 != null && ((map = this.f8630i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c1047v4.f9436k;
        return num4 == null || this.f8631j == num4.intValue();
    }
}
