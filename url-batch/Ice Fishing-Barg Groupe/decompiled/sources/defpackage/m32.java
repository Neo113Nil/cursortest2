package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m32 extends kv0 implements pe0 {
    public static final m32 dgRBjINgWbAK;
    public static final m32 wdg6QnbFHrFF;
    public final /* synthetic */ int OPXfSBeufaJ8;

    static {
        int i = 2;
        wdg6QnbFHrFF = new m32(i, 0);
        dgRBjINgWbAK = new m32(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m32(int i, int i2) {
        super(i);
        this.OPXfSBeufaJ8 = i2;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        switch (this.OPXfSBeufaJ8) {
            case 0:
                d32 d32Var = (d32) obj2;
                Object valueOf = Float.valueOf(0.0f);
                z22 z22Var = ((d32) obj).Y1f8riQaR6yg;
                k32 k32Var = h32.S9EYkSpbGuxq;
                Object RAsUl2FVSrh6 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(k32Var);
                if (RAsUl2FVSrh6 == null) {
                    RAsUl2FVSrh6 = valueOf;
                }
                float floatValue = ((Number) RAsUl2FVSrh6).floatValue();
                Object RAsUl2FVSrh62 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(k32Var);
                if (RAsUl2FVSrh62 != null) {
                    valueOf = RAsUl2FVSrh62;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
