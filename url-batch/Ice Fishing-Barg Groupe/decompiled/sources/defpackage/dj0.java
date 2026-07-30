package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dj0 extends gPXPFXrUH4XX {
    public final KSerializer PxuCJdSBwIXG;
    public final /* synthetic */ int TSizfFm2Yiuu;
    public final cj0 Y1f8riQaR6yg;
    public final KSerializer lS5Rgt96tfkO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dj0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.TSizfFm2Yiuu = i;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.Y1f8riQaR6yg = new cj0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.Y1f8riQaR6yg = new cj0("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object PxuCJdSBwIXG() {
        switch (this.TSizfFm2Yiuu) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        switch (this.TSizfFm2Yiuu) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Iterator TSizfFm2Yiuu(Object obj) {
        switch (this.TSizfFm2Yiuu) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        switch (this.TSizfFm2Yiuu) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.PxuCJdSBwIXG;
        np npVar = op.Companion;
        Object EcgxDIVH5in8 = opVar.EcgxDIVH5in8(descriptor, i, kSerializer, null);
        int dgRBjINgWbAK = opVar.dgRBjINgWbAK(getDescriptor());
        if (dgRBjINgWbAK != i + 1) {
            u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i, dgRBjINgWbAK, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean containsKey = map.containsKey(EcgxDIVH5in8);
        KSerializer kSerializer2 = this.lS5Rgt96tfkO;
        map.put(EcgxDIVH5in8, (!containsKey || (kSerializer2.getDescriptor().TSizfFm2Yiuu() instanceof cq1)) ? opVar.EcgxDIVH5in8(getDescriptor(), dgRBjINgWbAK, kSerializer2, null) : opVar.EcgxDIVH5in8(getDescriptor(), dgRBjINgWbAK, kSerializer2, w41.POWyO8hTM6YC(EcgxDIVH5in8, map)));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.TSizfFm2Yiuu) {
        }
        return this.Y1f8riQaR6yg;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int lS5Rgt96tfkO(Object obj) {
        int size;
        switch (this.TSizfFm2Yiuu) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object rtx2ld2ELZv4(Object obj) {
        switch (this.TSizfFm2Yiuu) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Y1f8riQaR6yg(obj);
        SerialDescriptor descriptor = getDescriptor();
        fx1 cpQdD2nAriOS = encoder.cpQdD2nAriOS(descriptor);
        Iterator TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        int i = 0;
        while (TSizfFm2Yiuu.hasNext()) {
            Map.Entry entry = (Map.Entry) TSizfFm2Yiuu.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            cpQdD2nAriOS.ryVscX7ZL4Ux(getDescriptor(), i, this.PxuCJdSBwIXG, key);
            i += 2;
            cpQdD2nAriOS.ryVscX7ZL4Ux(getDescriptor(), i2, this.lS5Rgt96tfkO, value);
        }
        cpQdD2nAriOS.gGoUzNp9JO5I(descriptor);
    }

    public dj0(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.PxuCJdSBwIXG = kSerializer;
        this.lS5Rgt96tfkO = kSerializer2;
    }
}
