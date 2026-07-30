package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class au1 extends xk {
    public final ba TSizfFm2Yiuu;
    public final eu0 lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au1(eu0 eu0Var, KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.lS5Rgt96tfkO = eu0Var;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.TSizfFm2Yiuu = new ba(descriptor, 0);
    }

    @Override // defpackage.xk
    public final void OPXfSBeufaJ8(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object PxuCJdSBwIXG() {
        return new ArrayList();
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        throw null;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Iterator TSizfFm2Yiuu(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new ZbWwgt3aGe7A(objArr);
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int lS5Rgt96tfkO(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object rtx2ld2ELZv4(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance((Class<?>) kj0.e6tOsSdd2EFb(this.lS5Rgt96tfkO), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }
}
