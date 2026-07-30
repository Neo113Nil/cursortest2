package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tx1 extends fx1 {
    public final LinkedHashMap EcgxDIVH5in8;
    public final KSerializer RfyTYNmI9Srp;
    public int S2OOm9zPNm0h;
    public final g42 S9EYkSpbGuxq;
    public final LinkedHashMap VhhvGxCb8gfr;

    public tx1(KSerializer kSerializer, LinkedHashMap linkedHashMap) {
        kSerializer.getClass();
        this.RfyTYNmI9Srp = kSerializer;
        this.EcgxDIVH5in8 = linkedHashMap;
        this.S9EYkSpbGuxq = cs0.jJwa0q7P5wHq;
        this.VhhvGxCb8gfr = new LinkedHashMap();
        this.S2OOm9zPNm0h = -1;
    }

    @Override // defpackage.fx1
    public final void EpkonXwzFgDB(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        this.S2OOm9zPNm0h = i;
    }

    public final Map KZw9XyiywG4x(Object obj) {
        obj.getClass();
        super.dgRBjINgWbAK(this.RfyTYNmI9Srp, obj);
        return w41.wLFCmsViZrNT(this.VhhvGxCb8gfr);
    }

    @Override // defpackage.fx1
    public final void Pf0ThKz3j5YS(Object obj) {
        obj.getClass();
        Y2PHjkwWz56c(obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final k42 PxuCJdSBwIXG() {
        return this.S9EYkSpbGuxq;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void TSizfFm2Yiuu() {
        Y2PHjkwWz56c(null);
    }

    public final void Y2PHjkwWz56c(Object obj) {
        String e9gEMXR7LXtO = this.RfyTYNmI9Srp.getDescriptor().e9gEMXR7LXtO(this.S2OOm9zPNm0h);
        dc1 dc1Var = (dc1) this.EcgxDIVH5in8.get(e9gEMXR7LXtO);
        if (dc1Var != null) {
            this.VhhvGxCb8gfr.put(e9gEMXR7LXtO, dc1Var instanceof yk ? ((yk) dc1Var).rtx2ld2ELZv4(obj) : fx1.jJwa0q7P5wHq(dc1Var.a92UlCVFR9N8(obj)));
        } else {
            rc1.e9gEMXR7LXtO(o0.x50lh2ztY7Y5("Cannot find NavType for argument ", e9gEMXR7LXtO, ". Please provide NavType through typeMap."));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void dgRBjINgWbAK(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        Y2PHjkwWz56c(obj);
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final Encoder wdg6QnbFHrFF(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (ni0.kpCQ9veP6n3I(serialDescriptor)) {
            this.S2OOm9zPNm0h = 0;
        }
        return this;
    }
}
