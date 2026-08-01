package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class ng {

    /* renamed from: f, reason: collision with root package name */
    public static final mg f2590f;

    /* renamed from: h, reason: collision with root package name */
    public static final mg f2591h;

    /* renamed from: a, reason: collision with root package name */
    public static final vg f2585a = new vg("cause", Throwable.class, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final vg f2586b = new vg("ratelimit_count", Integer.class, false, false);

    /* renamed from: c, reason: collision with root package name */
    public static final vg f2587c = new vg("sampling_count", Integer.class, false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final vg f2588d = new vg("ratelimit_period", hg.class, false, false);

    /* renamed from: e, reason: collision with root package name */
    public static final vg f2589e = new vg("skipped", Integer.class, false, false);
    public static final vg g = new vg("forced", Boolean.class, false, false);

    /* renamed from: i, reason: collision with root package name */
    public static final vg f2592i = new vg("stack_size", ch.class, false, false);

    static {
        boolean z10 = true;
        f2590f = new mg("group_by", Object.class, z10, z10, 0);
        f2591h = new mg("tags", x.class, false, z10, 1);
    }
}
