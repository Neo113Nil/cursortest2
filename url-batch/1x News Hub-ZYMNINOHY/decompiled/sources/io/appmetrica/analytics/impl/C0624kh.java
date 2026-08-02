package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624kh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f7722a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7723b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7726e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7727g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7728h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f7729i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7730j;

    public C0624kh(C0896v4 c0896v4) {
        this(c0896v4.f8477a, c0896v4.f8478b, c0896v4.f8480d, c0896v4.f8481e, c0896v4.f, c0896v4.f8482g, c0896v4.f8483h, c0896v4.f8484i, c0896v4.f8485j, c0896v4.f8486k);
    }

    public static C0624kh a() {
        return new C0624kh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0624kh mergeFrom(C0896v4 c0896v4) {
        return new C0624kh((String) WrapUtils.getOrDefaultNullable(c0896v4.f8477a, this.f7722a), (Boolean) WrapUtils.getOrDefaultNullable(c0896v4.f8478b, Boolean.valueOf(this.f7723b)), (Boolean) WrapUtils.getOrDefaultNullable(c0896v4.f8480d, Boolean.valueOf(this.f7724c)), (Integer) WrapUtils.getOrDefaultNullable(c0896v4.f8481e, Integer.valueOf(this.f7725d)), (Integer) WrapUtils.getOrDefaultNullable(c0896v4.f, Integer.valueOf(this.f7726e)), (Integer) WrapUtils.getOrDefaultNullable(c0896v4.f8482g, Integer.valueOf(this.f)), (Boolean) WrapUtils.getOrDefaultNullable(c0896v4.f8483h, Boolean.valueOf(this.f7727g)), (Boolean) WrapUtils.getOrDefaultNullable(c0896v4.f8484i, Boolean.valueOf(this.f7728h)), (Map) WrapUtils.getOrDefaultNullable(c0896v4.f8485j, this.f7729i), (Integer) WrapUtils.getOrDefaultNullable(c0896v4.f8486k, Integer.valueOf(this.f7730j)));
    }

    public C0624kh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f7722a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f7723b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f7724c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f7725d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f7726e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f7727g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f7728h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f7729i = map;
        this.f7730j = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0896v4 c0896v4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0896v4.f8478b;
        if (bool != null && this.f7723b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0896v4.f8480d;
        if (bool2 != null && this.f7724c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0896v4.f8481e;
        if (num != null && this.f7725d != num.intValue()) {
            return false;
        }
        Integer num2 = c0896v4.f;
        if (num2 != null && this.f7726e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0896v4.f8482g;
        if (num3 != null && this.f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0896v4.f8483h;
        if (bool3 != null && this.f7727g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0896v4.f8484i;
        if (bool4 != null && this.f7728h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0896v4.f8477a;
        if (str2 != null && ((str = this.f7722a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0896v4.f8485j;
        if (map2 != null && ((map = this.f7729i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0896v4.f8486k;
        return num4 == null || this.f7730j == num4.intValue();
    }
}
