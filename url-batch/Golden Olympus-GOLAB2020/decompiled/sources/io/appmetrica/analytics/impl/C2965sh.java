package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2965sh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f39797a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39798b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39799c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39801e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39802f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39803g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f39804h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f39805i;

    /* renamed from: j, reason: collision with root package name */
    public final int f39806j;

    public C2965sh(@NonNull J4 j4) {
        this(j4.f37789a, j4.f37790b, j4.f37792d, j4.f37793e, j4.f37794f, j4.f37795g, j4.f37796h, j4.f37797i, j4.f37798j, j4.f37799k);
    }

    public static C2965sh a() {
        return new C2965sh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2965sh mergeFrom(@NonNull J4 j4) {
        return new C2965sh((String) WrapUtils.getOrDefaultNullable(j4.f37789a, this.f39797a), (Boolean) WrapUtils.getOrDefaultNullable(j4.f37790b, Boolean.valueOf(this.f39798b)), (Boolean) WrapUtils.getOrDefaultNullable(j4.f37792d, Boolean.valueOf(this.f39799c)), (Integer) WrapUtils.getOrDefaultNullable(j4.f37793e, Integer.valueOf(this.f39800d)), (Integer) WrapUtils.getOrDefaultNullable(j4.f37794f, Integer.valueOf(this.f39801e)), (Integer) WrapUtils.getOrDefaultNullable(j4.f37795g, Integer.valueOf(this.f39802f)), (Boolean) WrapUtils.getOrDefaultNullable(j4.f37796h, Boolean.valueOf(this.f39803g)), (Boolean) WrapUtils.getOrDefaultNullable(j4.f37797i, Boolean.valueOf(this.f39804h)), (Map) WrapUtils.getOrDefaultNullable(j4.f37798j, this.f39805i), (Integer) WrapUtils.getOrDefaultNullable(j4.f37799k, Integer.valueOf(this.f39806j)));
    }

    public C2965sh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f39797a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f39798b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f39799c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f39800d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f39801e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f39802f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f39803g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f39804h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f39805i = map;
        this.f39806j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull J4 j4) {
        Map<String, String> map;
        String str;
        Boolean bool = j4.f37790b;
        if (bool != null && this.f39798b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = j4.f37792d;
        if (bool2 != null && this.f39799c != bool2.booleanValue()) {
            return false;
        }
        Integer num = j4.f37793e;
        if (num != null && this.f39800d != num.intValue()) {
            return false;
        }
        Integer num2 = j4.f37794f;
        if (num2 != null && this.f39801e != num2.intValue()) {
            return false;
        }
        Integer num3 = j4.f37795g;
        if (num3 != null && this.f39802f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = j4.f37796h;
        if (bool3 != null && this.f39803g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = j4.f37797i;
        if (bool4 != null && this.f39804h != bool4.booleanValue()) {
            return false;
        }
        String str2 = j4.f37789a;
        if (str2 != null && ((str = this.f39797a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = j4.f37798j;
        if (map2 != null && ((map = this.f39805i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = j4.f37799k;
        return num4 == null || this.f39806j == num4.intValue();
    }
}
