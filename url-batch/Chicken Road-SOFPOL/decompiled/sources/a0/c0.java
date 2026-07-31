package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f33e;

    public /* synthetic */ c0(m0.z0 z0Var, int i) {
        this.f32d = i;
        this.f33e = z0Var;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f32d) {
            case 0:
                return (z.h) ((p6.a) this.f33e.getValue()).b();
            case 1:
                this.f33e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f33e.setValue(null);
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f33e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                this.f33e.setValue(Integer.valueOf(((Number) r0.getValue()).intValue() - 1));
                return c6.m.f1757a;
            case 5:
                m0.z0 z0Var = this.f33e;
                z0Var.setValue(Integer.valueOf(((Number) z0Var.getValue()).intValue() + 1));
                return c6.m.f1757a;
            case 6:
                this.f33e.setValue(null);
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f33e.setValue(null);
                return c6.m.f1757a;
            default:
                return new z.f((p6.c) this.f33e.getValue());
        }
    }
}
