package com.ironsource;

/* loaded from: classes2.dex */
public class mp {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18060a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18061b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18062c;

    /* renamed from: d, reason: collision with root package name */
    private qp f18063d;

    /* renamed from: e, reason: collision with root package name */
    private int f18064e;

    /* renamed from: f, reason: collision with root package name */
    private int f18065f;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f18066a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18067b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f18068c = false;

        /* renamed from: d, reason: collision with root package name */
        private qp f18069d = null;

        /* renamed from: e, reason: collision with root package name */
        private int f18070e = 0;

        /* renamed from: f, reason: collision with root package name */
        private int f18071f = 0;

        public b a(boolean z4) {
            this.f18066a = z4;
            return this;
        }

        public b a(boolean z4, int i4) {
            this.f18068c = z4;
            this.f18071f = i4;
            return this;
        }

        public b a(boolean z4, qp qpVar, int i4) {
            this.f18067b = z4;
            if (qpVar == null) {
                qpVar = qp.PER_DAY;
            }
            this.f18069d = qpVar;
            this.f18070e = i4;
            return this;
        }

        public mp a() {
            return new mp(this.f18066a, this.f18067b, this.f18068c, this.f18069d, this.f18070e, this.f18071f);
        }
    }

    private mp(boolean z4, boolean z5, boolean z6, qp qpVar, int i4, int i5) {
        this.f18060a = z4;
        this.f18061b = z5;
        this.f18062c = z6;
        this.f18063d = qpVar;
        this.f18064e = i4;
        this.f18065f = i5;
    }

    public qp a() {
        return this.f18063d;
    }

    public int b() {
        return this.f18064e;
    }

    public int c() {
        return this.f18065f;
    }

    public boolean d() {
        return this.f18061b;
    }

    public boolean e() {
        return this.f18060a;
    }

    public boolean f() {
        return this.f18062c;
    }
}
