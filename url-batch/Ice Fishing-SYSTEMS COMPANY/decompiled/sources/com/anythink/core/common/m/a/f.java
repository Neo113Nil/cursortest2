package com.anythink.core.common.m.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    private static final long f14597k = 30000;

    /* renamed from: l, reason: collision with root package name */
    private static final long f14598l = 30000;

    /* renamed from: m, reason: collision with root package name */
    private static final long f14599m = 30000;

    /* renamed from: n, reason: collision with root package name */
    private static final TimeUnit f14600n = TimeUnit.MILLISECONDS;

    /* renamed from: a, reason: collision with root package name */
    public long f14601a;

    /* renamed from: b, reason: collision with root package name */
    public TimeUnit f14602b;

    /* renamed from: c, reason: collision with root package name */
    public long f14603c;

    /* renamed from: d, reason: collision with root package name */
    public TimeUnit f14604d;

    /* renamed from: e, reason: collision with root package name */
    public long f14605e;

    /* renamed from: f, reason: collision with root package name */
    public TimeUnit f14606f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f14607g;

    /* renamed from: h, reason: collision with root package name */
    public final List<e> f14608h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public int f14609j;

    public static class a {

        /* renamed from: h, reason: collision with root package name */
        private ExecutorService f14617h;
        private d i;

        /* renamed from: j, reason: collision with root package name */
        private int f14618j;

        /* renamed from: b, reason: collision with root package name */
        private long f14611b = 30000;

        /* renamed from: c, reason: collision with root package name */
        private TimeUnit f14612c = f.f14600n;

        /* renamed from: d, reason: collision with root package name */
        private long f14613d = 30000;

        /* renamed from: e, reason: collision with root package name */
        private TimeUnit f14614e = f.f14600n;

        /* renamed from: f, reason: collision with root package name */
        private long f14615f = 30000;

        /* renamed from: g, reason: collision with root package name */
        private TimeUnit f14616g = f.f14600n;

        /* renamed from: a, reason: collision with root package name */
        final List<e> f14610a = new ArrayList();

        public final a a(ExecutorService executorService) {
            this.f14617h = executorService;
            return this;
        }

        public final a b(TimeUnit timeUnit) {
            this.f14613d = 60000L;
            this.f14614e = timeUnit;
            return this;
        }

        public final a c(TimeUnit timeUnit) {
            this.f14615f = 60000L;
            this.f14616g = timeUnit;
            return this;
        }

        public final a a(TimeUnit timeUnit) {
            this.f14611b = 60000L;
            this.f14612c = timeUnit;
            return this;
        }

        public final a a(d dVar) {
            this.i = dVar;
            return this;
        }

        public final a a(int i) {
            this.f14618j = i;
            return this;
        }

        public final f a() {
            f fVar = new f((byte) 0);
            fVar.f14605e = this.f14615f;
            fVar.f14606f = this.f14616g;
            fVar.f14603c = this.f14613d;
            fVar.f14604d = this.f14614e;
            fVar.f14601a = this.f14611b;
            fVar.f14602b = this.f14612c;
            fVar.f14607g = this.f14617h;
            fVar.i = this.i;
            fVar.f14609j = this.f14618j;
            if (!this.f14610a.isEmpty()) {
                fVar.f14608h.addAll(new ArrayList(this.f14610a));
            }
            return fVar;
        }
    }

    public /* synthetic */ f(byte b9) {
        this();
    }

    private f() {
        this.f14608h = new ArrayList();
    }
}
