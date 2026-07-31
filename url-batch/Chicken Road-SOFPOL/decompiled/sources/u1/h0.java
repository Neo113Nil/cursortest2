package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 implements y0 {

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f7220e = new h0(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7221d;

    public /* synthetic */ h0(int i) {
        this.f7221d = i;
    }

    public long a(long j7, long j8) {
        float min = Math.min(Float.intBitsToFloat((int) (j8 >> 32)) / Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)) / Float.intBitsToFloat((int) (j7 & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & 4294967295L);
        int i = q0.f7258a;
        return floatToRawIntBits;
    }

    @Override // u1.y0
    public void g(o.w0 w0Var) {
        w0Var.clear();
    }

    @Override // u1.y0
    public boolean h(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f7221d) {
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
