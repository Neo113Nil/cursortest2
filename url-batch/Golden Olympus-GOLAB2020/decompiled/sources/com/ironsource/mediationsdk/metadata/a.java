package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17675a = "do_not_sell";

    /* renamed from: b, reason: collision with root package name */
    public static final String f17676b = "is_child_directed";

    /* renamed from: c, reason: collision with root package name */
    public static final String f17677c = "is_deviceid_optout";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17678d = "google_family_self_certified_sdks";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17679e = "iiqf";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17680f = "is_test_suite";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17681g = "true";

    /* renamed from: h, reason: collision with root package name */
    protected static final String f17682h = "false";

    /* renamed from: i, reason: collision with root package name */
    public static final String f17683i = "google_water_mark";

    /* renamed from: j, reason: collision with root package name */
    public static final String f17684j = "enable";

    /* renamed from: k, reason: collision with root package name */
    static final Set<String> f17685k;

    /* renamed from: l, reason: collision with root package name */
    static final Set<String> f17686l;

    /* renamed from: m, reason: collision with root package name */
    static final Set<String> f17687m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17688n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f17676b, f17677c, f17680f, f17678d, f17679e));
        f17685k = hashSet;
        f17686l = new HashSet(Arrays.asList(f17677c, f17678d, f17680f, f17679e));
        HashSet hashSet2 = new HashSet(hashSet);
        f17687m = hashSet2;
        hashSet2.add(f17675a);
    }
}
