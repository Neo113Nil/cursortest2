package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class bq1 extends xk {
    public final aq1 lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq1(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.lS5Rgt96tfkO = new aq1(kSerializer.getDescriptor());
    }

    @Override // defpackage.xk
    public final void OPXfSBeufaJ8(int i, Object obj, Object obj2) {
        ((zp1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object PxuCJdSBwIXG() {
        return (zp1) RAsUl2FVSrh6(wdg6QnbFHrFF());
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Iterator TSizfFm2Yiuu(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.gPXPFXrUH4XX, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e9gEMXR7LXtO(decoder);
    }

    public abstract void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i);

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int lS5Rgt96tfkO(Object obj) {
        zp1 zp1Var = (zp1) obj;
        zp1Var.getClass();
        return zp1Var.Y1f8riQaR6yg();
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object rtx2ld2ELZv4(Object obj) {
        zp1 zp1Var = (zp1) obj;
        zp1Var.getClass();
        return zp1Var.PxuCJdSBwIXG();
    }

    @Override // defpackage.xk, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int Y1f8riQaR6yg = Y1f8riQaR6yg(obj);
        aq1 aq1Var = this.lS5Rgt96tfkO;
        fx1 cpQdD2nAriOS = encoder.cpQdD2nAriOS(aq1Var);
        dgRBjINgWbAK(cpQdD2nAriOS, obj, Y1f8riQaR6yg);
        cpQdD2nAriOS.gGoUzNp9JO5I(aq1Var);
    }

    public abstract Object wdg6QnbFHrFF();
}
