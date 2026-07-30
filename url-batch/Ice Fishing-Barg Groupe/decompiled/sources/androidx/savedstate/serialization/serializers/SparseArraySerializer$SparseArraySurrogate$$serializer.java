package androidx.savedstate.serialization.serializers;

import defpackage.ea;
import defpackage.fx1;
import defpackage.kg0;
import defpackage.nx0;
import defpackage.ny;
import defpackage.op;
import defpackage.pn1;
import defpackage.po2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@ny
/* loaded from: classes.dex */
public final /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements kg0 {
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        pn1 pn1Var = new pn1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        pn1Var.x50lh2ztY7Y5("keys", false);
        pn1Var.x50lh2ztY7Y5("values", false);
        this.descriptor = pn1Var;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kg0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SparseArraySerializer$SparseArraySurrogate.TSizfFm2Yiuu[0].getValue(), new ea(this.typeSerial0, 0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SparseArraySerializer$SparseArraySurrogate<T> deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(serialDescriptor);
        nx0[] nx0VarArr = SparseArraySerializer$SparseArraySurrogate.TSizfFm2Yiuu;
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        while (z) {
            int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(serialDescriptor);
            if (dgRBjINgWbAK == -1) {
                z = false;
            } else if (dgRBjINgWbAK == 0) {
                list = (List) lS5Rgt96tfkO.EcgxDIVH5in8(serialDescriptor, 0, (KSerializer) nx0VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (dgRBjINgWbAK != 1) {
                    throw new po2(dgRBjINgWbAK);
                }
                list2 = (List) lS5Rgt96tfkO.EcgxDIVH5in8(serialDescriptor, 1, new ea(this.typeSerial0, 0), list2);
                i |= 2;
            }
        }
        lS5Rgt96tfkO.cpQdD2nAriOS(serialDescriptor);
        return new SparseArraySerializer$SparseArraySurrogate<>(i, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SparseArraySerializer$SparseArraySurrogate<T> sparseArraySerializer$SparseArraySurrogate) {
        encoder.getClass();
        sparseArraySerializer$SparseArraySurrogate.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
        fx1 lS5Rgt96tfkO = encoder.lS5Rgt96tfkO(serialDescriptor);
        KSerializer kSerializer = this.typeSerial0;
        lS5Rgt96tfkO.ryVscX7ZL4Ux(serialDescriptor, 0, (KSerializer) SparseArraySerializer$SparseArraySurrogate.TSizfFm2Yiuu[0].getValue(), sparseArraySerializer$SparseArraySurrogate.PxuCJdSBwIXG);
        lS5Rgt96tfkO.ryVscX7ZL4Ux(serialDescriptor, 1, new ea(kSerializer, 0), sparseArraySerializer$SparseArraySurrogate.lS5Rgt96tfkO);
        lS5Rgt96tfkO.gGoUzNp9JO5I(serialDescriptor);
    }

    @Override // defpackage.kg0
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(KSerializer kSerializer) {
        this();
        kSerializer.getClass();
        this.typeSerial0 = kSerializer;
    }
}
