package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617fh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f11841a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11842b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11844d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11845e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11846f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11847g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11848h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f11849i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11850j;

    public C0617fh(C0837o4 c0837o4) {
        this(c0837o4.f12484a, c0837o4.f12485b, c0837o4.f12487d, c0837o4.f12488e, c0837o4.f12489f, c0837o4.f12490g, c0837o4.f12491h, c0837o4.f12492i, c0837o4.f12493j, c0837o4.f12494k);
    }

    public static C0617fh a() {
        return new C0617fh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0617fh mergeFrom(C0837o4 c0837o4) {
        return new C0617fh((String) WrapUtils.getOrDefaultNullable(c0837o4.f12484a, this.f11841a), (Boolean) WrapUtils.getOrDefaultNullable(c0837o4.f12485b, Boolean.valueOf(this.f11842b)), (Boolean) WrapUtils.getOrDefaultNullable(c0837o4.f12487d, Boolean.valueOf(this.f11843c)), (Integer) WrapUtils.getOrDefaultNullable(c0837o4.f12488e, Integer.valueOf(this.f11844d)), (Integer) WrapUtils.getOrDefaultNullable(c0837o4.f12489f, Integer.valueOf(this.f11845e)), (Integer) WrapUtils.getOrDefaultNullable(c0837o4.f12490g, Integer.valueOf(this.f11846f)), (Boolean) WrapUtils.getOrDefaultNullable(c0837o4.f12491h, Boolean.valueOf(this.f11847g)), (Boolean) WrapUtils.getOrDefaultNullable(c0837o4.f12492i, Boolean.valueOf(this.f11848h)), (Map) WrapUtils.getOrDefaultNullable(c0837o4.f12493j, this.f11849i), (Integer) WrapUtils.getOrDefaultNullable(c0837o4.f12494k, Integer.valueOf(this.f11850j)));
    }

    public C0617fh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f11841a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f11842b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f11843c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f11844d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f11845e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f11846f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f11847g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f11848h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f11849i = map;
        this.f11850j = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0837o4 c0837o4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0837o4.f12485b;
        if (bool != null && this.f11842b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0837o4.f12487d;
        if (bool2 != null && this.f11843c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0837o4.f12488e;
        if (num != null && this.f11844d != num.intValue()) {
            return false;
        }
        Integer num2 = c0837o4.f12489f;
        if (num2 != null && this.f11845e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0837o4.f12490g;
        if (num3 != null && this.f11846f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0837o4.f12491h;
        if (bool3 != null && this.f11847g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0837o4.f12492i;
        if (bool4 != null && this.f11848h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0837o4.f12484a;
        if (str2 != null && ((str = this.f11841a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0837o4.f12493j;
        if (map2 != null && ((map = this.f11849i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0837o4.f12494k;
        return num4 == null || this.f11850j == num4.intValue();
    }
}
