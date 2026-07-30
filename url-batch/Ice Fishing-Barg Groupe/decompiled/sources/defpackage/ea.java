package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ea extends xk {
    public final b21 TSizfFm2Yiuu;
    public final /* synthetic */ int lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.lS5Rgt96tfkO = i;
        kSerializer.getClass();
        switch (i) {
            case 1:
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.TSizfFm2Yiuu = new ba(descriptor, 2);
                break;
            case 2:
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                descriptor2.getClass();
                this.TSizfFm2Yiuu = new ba(descriptor2, 3);
                break;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                descriptor3.getClass();
                this.TSizfFm2Yiuu = new ba(descriptor3, 1);
                break;
        }
    }

    @Override // defpackage.xk
    public final void OPXfSBeufaJ8(int i, Object obj, Object obj2) {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object PxuCJdSBwIXG() {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Iterator TSizfFm2Yiuu(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.lS5Rgt96tfkO) {
        }
        return (ba) this.TSizfFm2Yiuu;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int lS5Rgt96tfkO(Object obj) {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final Object rtx2ld2ELZv4(Object obj) {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }
}
