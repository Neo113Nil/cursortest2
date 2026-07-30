package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class xk extends gPXPFXrUH4XX {
    public final KSerializer PxuCJdSBwIXG;

    public xk(KSerializer kSerializer) {
        this.PxuCJdSBwIXG = kSerializer;
    }

    public abstract void OPXfSBeufaJ8(int i, Object obj, Object obj2);

    @Override // defpackage.gPXPFXrUH4XX
    public void a92UlCVFR9N8(op opVar, int i, Object obj) {
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.PxuCJdSBwIXG;
        np npVar = op.Companion;
        OPXfSBeufaJ8(i, obj, opVar.EcgxDIVH5in8(descriptor, i, kSerializer, null));
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int Y1f8riQaR6yg = Y1f8riQaR6yg(obj);
        SerialDescriptor descriptor = getDescriptor();
        fx1 cpQdD2nAriOS = encoder.cpQdD2nAriOS(descriptor);
        Iterator TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        for (int i = 0; i < Y1f8riQaR6yg; i++) {
            cpQdD2nAriOS.ryVscX7ZL4Ux(getDescriptor(), i, this.PxuCJdSBwIXG, TSizfFm2Yiuu.next());
        }
        cpQdD2nAriOS.gGoUzNp9JO5I(descriptor);
    }
}
