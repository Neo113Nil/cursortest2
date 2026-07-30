package androidx.savedstate.serialization.serializers;

import defpackage.h42;
import defpackage.j21;
import defpackage.nx0;
import defpackage.pn1;
import defpackage.pz0;
import defpackage.th0;
import defpackage.vi0;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@h42
/* loaded from: classes.dex */
public final class SparseArraySerializer$SparseArraySurrogate<T> {
    public static final Companion Companion = new Companion();
    public static final nx0[] TSizfFm2Yiuu = {vi0.ryVscX7ZL4Ux(pz0.rtx2ld2ELZv4, new j21(16)), null};
    public static final pn1 Y1f8riQaR6yg;
    public final List PxuCJdSBwIXG;
    public final List lS5Rgt96tfkO;

    /* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
    public static final class Companion {
        public final <T> KSerializer serializer(KSerializer kSerializer) {
            kSerializer.getClass();
            return new SparseArraySerializer$SparseArraySurrogate$$serializer(kSerializer);
        }
    }

    static {
        pn1 pn1Var = new pn1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        pn1Var.x50lh2ztY7Y5("keys", false);
        pn1Var.x50lh2ztY7Y5("values", false);
        Y1f8riQaR6yg = pn1Var;
    }

    public /* synthetic */ SparseArraySerializer$SparseArraySurrogate(int i, List list, List list2) {
        if (3 != (i & 3)) {
            th0.ryVscX7ZL4Ux(i, 3, Y1f8riQaR6yg);
            throw null;
        }
        this.PxuCJdSBwIXG = list;
        this.lS5Rgt96tfkO = list2;
    }
}
