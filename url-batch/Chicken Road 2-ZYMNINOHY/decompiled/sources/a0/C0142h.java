package a0;

import io.appmetrica.analytics.AppMetricaDefaultValues;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142h implements S {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f4157a;

    /* renamed from: b, reason: collision with root package name */
    public final M f4158b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0135a f4159c;

    /* renamed from: d, reason: collision with root package name */
    public S f4160d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4161e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4162f;

    public C0142h(M m4, W.D d4) {
        this.f4158b = m4;
        this.f4157a = new q0(d4);
    }

    @Override // a0.S
    public final long a() {
        if (this.f4161e) {
            return this.f4157a.a();
        }
        S s4 = this.f4160d;
        s4.getClass();
        return s4.a();
    }

    @Override // a0.S
    public final boolean b() {
        if (this.f4161e) {
            this.f4157a.getClass();
            return false;
        }
        S s4 = this.f4160d;
        s4.getClass();
        return s4.b();
    }

    public final void c(AbstractC0135a abstractC0135a) {
        S s4;
        S j4 = abstractC0135a.j();
        if (j4 == null || j4 == (s4 = this.f4160d)) {
            return;
        }
        if (s4 != null) {
            throw new C0146l(2, new IllegalStateException("Multiple renderer media clocks enabled."), AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        }
        this.f4160d = j4;
        this.f4159c = abstractC0135a;
        ((c0.K) j4).d(this.f4157a.f4237e);
    }

    @Override // a0.S
    public final void d(T.I i4) {
        S s4 = this.f4160d;
        if (s4 != null) {
            s4.d(i4);
            i4 = this.f4160d.e();
        }
        this.f4157a.d(i4);
    }

    @Override // a0.S
    public final T.I e() {
        S s4 = this.f4160d;
        return s4 != null ? s4.e() : this.f4157a.f4237e;
    }
}
