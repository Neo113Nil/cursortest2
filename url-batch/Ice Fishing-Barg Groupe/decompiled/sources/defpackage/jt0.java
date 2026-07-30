package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jt0 implements KSerializer {
    public static final jt0 PxuCJdSBwIXG = new jt0();
    public static final it0 lS5Rgt96tfkO = it0.lS5Rgt96tfkO;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ni0.RAsUl2FVSrh6(decoder);
        return new PxuCJdSBwIXG((List) new ea(qt0.PxuCJdSBwIXG, 0).e9gEMXR7LXtO(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PxuCJdSBwIXG pxuCJdSBwIXG = (PxuCJdSBwIXG) obj;
        pxuCJdSBwIXG.getClass();
        ni0.a92UlCVFR9N8(encoder);
        qt0 qt0Var = qt0.PxuCJdSBwIXG;
        d42 d42Var = qt0.lS5Rgt96tfkO;
        d42Var.getClass();
        ba baVar = new ba(d42Var, 1);
        List list = pxuCJdSBwIXG.rtx2ld2ELZv4;
        int size = list.size();
        fx1 cpQdD2nAriOS = encoder.cpQdD2nAriOS(baVar);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            cpQdD2nAriOS.ryVscX7ZL4Ux(baVar, i, qt0Var, it.next());
        }
        cpQdD2nAriOS.gGoUzNp9JO5I(baVar);
    }
}
