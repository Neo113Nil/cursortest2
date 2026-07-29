package com.ironsource.b.e;

/* compiled from: PlacementAvailabilitySettings.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6807a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6808b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6809c;

    /* renamed from: d, reason: collision with root package name */
    private m f6810d;
    private int e;
    private int f;

    private l(boolean z, boolean z2, boolean z3, m mVar, int i, int i2) {
        this.f6807a = z;
        this.f6808b = z2;
        this.f6809c = z3;
        this.f6810d = mVar;
        this.e = i;
        this.f = i2;
    }

    public boolean a() {
        return this.f6807a;
    }

    public boolean b() {
        return this.f6808b;
    }

    public boolean c() {
        return this.f6809c;
    }

    public m d() {
        return this.f6810d;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    /* compiled from: PlacementAvailabilitySettings.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6811a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f6812b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6813c = false;

        /* renamed from: d, reason: collision with root package name */
        private m f6814d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.f6811a = z;
            return this;
        }

        public a a(boolean z, m mVar, int i) {
            this.f6812b = z;
            if (mVar == null) {
                mVar = m.PER_DAY;
            }
            this.f6814d = mVar;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.f6813c = z;
            this.f = i;
            return this;
        }

        public l a() {
            return new l(this.f6811a, this.f6812b, this.f6813c, this.f6814d, this.e, this.f);
        }
    }
}
