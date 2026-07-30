package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w30 implements KSerializer {
    public static final w30 PxuCJdSBwIXG = new w30();
    public static final dq1 lS5Rgt96tfkO = new dq1("kotlin.time.Duration", cq1.cpQdD2nAriOS);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        t30 t30Var = u30.Companion;
        String e6tOsSdd2EFb = decoder.e6tOsSdd2EFb();
        t30Var.getClass();
        e6tOsSdd2EFb.getClass();
        try {
            long IXK6ba3ucyzm = mm2.IXK6ba3ucyzm(e6tOsSdd2EFb);
            if (IXK6ba3ucyzm == u30.dgRBjINgWbAK) {
                throw new IllegalStateException("invariant failed");
            }
            return new u30(IXK6ba3ucyzm);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(o0.x50lh2ztY7Y5("Invalid ISO duration string format: '", e6tOsSdd2EFb, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((u30) obj).rtx2ld2ELZv4;
        t30 t30Var = u30.Companion;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long RAsUl2FVSrh6 = j < 0 ? u30.RAsUl2FVSrh6(j) : j;
        long a92UlCVFR9N8 = u30.a92UlCVFR9N8(RAsUl2FVSrh6, x30.HOURS);
        boolean z = false;
        int a92UlCVFR9N82 = u30.Y1f8riQaR6yg(RAsUl2FVSrh6) ? 0 : (int) (u30.a92UlCVFR9N8(RAsUl2FVSrh6, x30.MINUTES) % 60);
        int a92UlCVFR9N83 = u30.Y1f8riQaR6yg(RAsUl2FVSrh6) ? 0 : (int) (u30.a92UlCVFR9N8(RAsUl2FVSrh6, x30.SECONDS) % 60);
        int TSizfFm2Yiuu = u30.TSizfFm2Yiuu(RAsUl2FVSrh6);
        if (u30.Y1f8riQaR6yg(j)) {
            a92UlCVFR9N8 = 9999999999999L;
        }
        boolean z2 = a92UlCVFR9N8 != 0;
        boolean z3 = (a92UlCVFR9N83 == 0 && TSizfFm2Yiuu == 0) ? false : true;
        if (a92UlCVFR9N82 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(a92UlCVFR9N8);
            sb.append('H');
        }
        if (z) {
            sb.append(a92UlCVFR9N82);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            u30.lS5Rgt96tfkO(sb, a92UlCVFR9N83, TSizfFm2Yiuu, 9, "S", true);
        }
        encoder.gPXPFXrUH4XX(sb.toString());
    }
}
