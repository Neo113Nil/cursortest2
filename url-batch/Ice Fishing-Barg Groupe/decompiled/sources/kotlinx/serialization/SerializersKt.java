package kotlinx.serialization;

import defpackage.ae0;
import defpackage.al;
import defpackage.au1;
import defpackage.bu1;
import defpackage.dj0;
import defpackage.ea;
import defpackage.eq1;
import defpackage.eu0;
import defpackage.hm2;
import defpackage.im2;
import defpackage.ju0;
import defpackage.k42;
import defpackage.kj0;
import defpackage.ng0;
import defpackage.u41;
import defpackage.vi1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class SerializersKt {
    public static final KSerializer PxuCJdSBwIXG(eu0 eu0Var, List list, ae0 ae0Var) {
        KSerializer eaVar;
        KSerializer au1Var;
        KSerializer im2Var;
        eu0Var.getClass();
        if (eu0Var.equals(bu1.PxuCJdSBwIXG(Collection.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(List.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(List.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(ArrayList.class))) {
            eaVar = new ea((KSerializer) list.get(0), 0);
        } else if (eu0Var.equals(bu1.PxuCJdSBwIXG(HashSet.class))) {
            eaVar = new ea((KSerializer) list.get(0), 1);
        } else if (eu0Var.equals(bu1.PxuCJdSBwIXG(Set.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(Set.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(LinkedHashSet.class))) {
            eaVar = new ea((KSerializer) list.get(0), 2);
        } else if (eu0Var.equals(bu1.PxuCJdSBwIXG(HashMap.class))) {
            eaVar = new dj0((KSerializer) list.get(0), (KSerializer) list.get(1), 0);
        } else if (eu0Var.equals(bu1.PxuCJdSBwIXG(Map.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(Map.class)) || eu0Var.equals(bu1.PxuCJdSBwIXG(LinkedHashMap.class))) {
            eaVar = new dj0((KSerializer) list.get(0), (KSerializer) list.get(1), 1);
        } else {
            if (eu0Var.equals(bu1.PxuCJdSBwIXG(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) list.get(0);
                KSerializer kSerializer2 = (KSerializer) list.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                au1Var = new u41(kSerializer, kSerializer2, 0);
            } else {
                if (eu0Var.equals(bu1.PxuCJdSBwIXG(vi1.class))) {
                    KSerializer kSerializer3 = (KSerializer) list.get(0);
                    KSerializer kSerializer4 = (KSerializer) list.get(1);
                    kSerializer3.getClass();
                    kSerializer4.getClass();
                    im2Var = new u41(kSerializer3, kSerializer4, 1);
                } else if (eu0Var.equals(bu1.PxuCJdSBwIXG(hm2.class))) {
                    KSerializer kSerializer5 = (KSerializer) list.get(0);
                    KSerializer kSerializer6 = (KSerializer) list.get(1);
                    KSerializer kSerializer7 = (KSerializer) list.get(2);
                    kSerializer5.getClass();
                    kSerializer6.getClass();
                    kSerializer7.getClass();
                    im2Var = new im2(kSerializer5, kSerializer6, kSerializer7);
                } else if (kj0.e6tOsSdd2EFb(eu0Var).isArray()) {
                    Object PxuCJdSBwIXG = ae0Var.PxuCJdSBwIXG();
                    PxuCJdSBwIXG.getClass();
                    KSerializer kSerializer8 = (KSerializer) list.get(0);
                    kSerializer8.getClass();
                    au1Var = new au1((eu0) PxuCJdSBwIXG, kSerializer8);
                } else {
                    eaVar = null;
                }
                eaVar = im2Var;
            }
            eaVar = au1Var;
        }
        if (eaVar != null) {
            return eaVar;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return ng0.r3s1LDPKFs1S(kj0.e6tOsSdd2EFb(eu0Var), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    public static final KSerializer TSizfFm2Yiuu(k42 k42Var, ju0 ju0Var) {
        k42Var.getClass();
        ju0Var.getClass();
        return SerializersKt__SerializersKt.PxuCJdSBwIXG(k42Var, ju0Var, false);
    }

    public static final ArrayList Y1f8riQaR6yg(k42 k42Var, List list, boolean z) {
        k42Var.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(serializer(k42Var, (ju0) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            KSerializer TSizfFm2Yiuu = TSizfFm2Yiuu(k42Var, (ju0) it2.next());
            if (TSizfFm2Yiuu == null) {
                return null;
            }
            arrayList2.add(TSizfFm2Yiuu);
        }
        return arrayList2;
    }

    public static final KSerializer lS5Rgt96tfkO(eu0 eu0Var) {
        eu0Var.getClass();
        KSerializer r3s1LDPKFs1S = ng0.r3s1LDPKFs1S(kj0.e6tOsSdd2EFb(eu0Var), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return r3s1LDPKFs1S == null ? (KSerializer) eq1.PxuCJdSBwIXG.get(eu0Var) : r3s1LDPKFs1S;
    }

    public static final <T> KSerializer serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final KSerializer serializer(eu0 eu0Var, List<? extends KSerializer> list, boolean z) {
        return SerializersKt__SerializersKt.serializer(eu0Var, list, z);
    }

    public static final KSerializer serializer(ju0 ju0Var) {
        return SerializersKt__SerializersKt.serializer(ju0Var);
    }

    public static final KSerializer serializer(k42 k42Var, eu0 eu0Var, List<? extends KSerializer> list, boolean z) {
        return SerializersKt__SerializersKt.serializer(k42Var, eu0Var, list, z);
    }

    public static final KSerializer serializer(k42 k42Var, ju0 ju0Var) {
        return SerializersKt__SerializersKt.serializer(k42Var, ju0Var);
    }

    public static final KSerializer serializer(k42 k42Var, Type type) {
        return SerializersKt__SerializersJvmKt.serializer(k42Var, type);
    }

    public static final KSerializer serializer(Type type) {
        return SerializersKt__SerializersJvmKt.serializer(type);
    }

    public static final <T> KSerializer serializer(eu0 eu0Var) {
        return SerializersKt__SerializersKt.serializer(eu0Var);
    }

    public static final <T> KSerializer serializer(k42 k42Var) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
