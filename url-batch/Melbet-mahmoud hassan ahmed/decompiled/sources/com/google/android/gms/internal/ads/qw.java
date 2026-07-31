package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes.dex */
public final class qw {

    /* renamed from: f, reason: collision with root package name */
    private static final qw f10850f = new qw();

    /* renamed from: a, reason: collision with root package name */
    private final bo0 f10851a;

    /* renamed from: b, reason: collision with root package name */
    private final ow f10852b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10853c;

    /* renamed from: d, reason: collision with root package name */
    private final po0 f10854d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f10855e;

    protected qw() {
        bo0 bo0Var = new bo0();
        ow owVar = new ow(new jv(), new hv(), new zz(), new j60(), new sk0(), new wg0(), new k60());
        String d7 = bo0.d();
        po0 po0Var = new po0(0, 214106000, true, false, false);
        Random random = new Random();
        this.f10851a = bo0Var;
        this.f10852b = owVar;
        this.f10853c = d7;
        this.f10854d = po0Var;
        this.f10855e = random;
    }

    public static ow a() {
        return f10850f.f10852b;
    }

    public static bo0 b() {
        return f10850f.f10851a;
    }

    public static po0 c() {
        return f10850f.f10854d;
    }

    public static String d() {
        return f10850f.f10853c;
    }

    public static Random e() {
        return f10850f.f10855e;
    }
}
