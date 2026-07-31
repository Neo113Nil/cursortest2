package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0204gh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f1273a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Map<String, String> i;
    public final int j;

    public C0204gh(C0420p4 c0420p4) {
        this(c0420p4.f1425a, c0420p4.b, c0420p4.d, c0420p4.e, c0420p4.f, c0420p4.g, c0420p4.h, c0420p4.i, c0420p4.j, c0420p4.k);
    }

    public static C0204gh a() {
        return new C0204gh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0204gh mergeFrom(C0420p4 c0420p4) {
        return new C0204gh((String) WrapUtils.getOrDefaultNullable(c0420p4.f1425a, this.f1273a), (Boolean) WrapUtils.getOrDefaultNullable(c0420p4.b, Boolean.valueOf(this.b)), (Boolean) WrapUtils.getOrDefaultNullable(c0420p4.d, Boolean.valueOf(this.c)), (Integer) WrapUtils.getOrDefaultNullable(c0420p4.e, Integer.valueOf(this.d)), (Integer) WrapUtils.getOrDefaultNullable(c0420p4.f, Integer.valueOf(this.e)), (Integer) WrapUtils.getOrDefaultNullable(c0420p4.g, Integer.valueOf(this.f)), (Boolean) WrapUtils.getOrDefaultNullable(c0420p4.h, Boolean.valueOf(this.g)), (Boolean) WrapUtils.getOrDefaultNullable(c0420p4.i, Boolean.valueOf(this.h)), (Map) WrapUtils.getOrDefaultNullable(c0420p4.j, this.i), (Integer) WrapUtils.getOrDefaultNullable(c0420p4.k, Integer.valueOf(this.j)));
    }

    public C0204gh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f1273a = str;
        Boolean bool5 = Boolean.FALSE;
        this.b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.i = map;
        this.j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0420p4 c0420p4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0420p4.b;
        if (bool != null && this.b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0420p4.d;
        if (bool2 != null && this.c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0420p4.e;
        if (num != null && this.d != num.intValue()) {
            return false;
        }
        Integer num2 = c0420p4.f;
        if (num2 != null && this.e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0420p4.g;
        if (num3 != null && this.f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0420p4.h;
        if (bool3 != null && this.g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0420p4.i;
        if (bool4 != null && this.h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0420p4.f1425a;
        if (str2 != null && ((str = this.f1273a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0420p4.j;
        if (map2 != null && ((map = this.i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0420p4.k;
        return num4 == null || this.j == num4.intValue();
    }
}
