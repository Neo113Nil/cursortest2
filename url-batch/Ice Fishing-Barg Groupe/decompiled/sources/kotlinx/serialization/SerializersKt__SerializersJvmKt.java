package kotlinx.serialization;

import defpackage.bu1;
import defpackage.ck;
import defpackage.cs0;
import defpackage.eq1;
import defpackage.fx1;
import defpackage.i42;
import defpackage.k42;
import defpackage.ko1;
import defpackage.na;
import defpackage.ng0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final Class PxuCJdSBwIXG(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return PxuCJdSBwIXG(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object iSxsmagYqzHM = na.iSxsmagYqzHM(upperBounds);
            iSxsmagYqzHM.getClass();
            return PxuCJdSBwIXG((Type) iSxsmagYqzHM);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return PxuCJdSBwIXG(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(type.getClass());
        sb.append(" has type ");
        sb.append(PxuCJdSBwIXG);
        throw new IllegalArgumentException(sb.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v20 kotlinx.serialization.KSerializer, still in use, count: 2, list:
          (r7v20 kotlinx.serialization.KSerializer) from 0x002d: IF  (r7v20 kotlinx.serialization.KSerializer) == (null kotlinx.serialization.KSerializer)  -> B:22:0x00eb A[HIDDEN] (LINE:46)
          (r7v20 kotlinx.serialization.KSerializer) from 0x0031: PHI (r7v21 kotlinx.serialization.KSerializer) = (r7v20 kotlinx.serialization.KSerializer) binds: [B:21:0x002d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final kotlinx.serialization.KSerializer TSizfFm2Yiuu(defpackage.k42 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersJvmKt.TSizfFm2Yiuu(k42, java.lang.reflect.Type, boolean):kotlinx.serialization.KSerializer");
    }

    public static final KSerializer lS5Rgt96tfkO(k42 k42Var, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer r3s1LDPKFs1S = ng0.r3s1LDPKFs1S(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (r3s1LDPKFs1S != null) {
            return r3s1LDPKFs1S;
        }
        KSerializer kSerializer = (KSerializer) eq1.PxuCJdSBwIXG.get(bu1.PxuCJdSBwIXG(cls));
        if (kSerializer != null) {
            return kSerializer;
        }
        if (cls.isInterface()) {
            return new ko1(bu1.PxuCJdSBwIXG(cls));
        }
        return null;
    }

    public static final KSerializer serializer(k42 k42Var, Type type) {
        k42Var.getClass();
        type.getClass();
        KSerializer TSizfFm2Yiuu = TSizfFm2Yiuu(k42Var, type, true);
        if (TSizfFm2Yiuu != null) {
            return TSizfFm2Yiuu;
        }
        Class PxuCJdSBwIXG = PxuCJdSBwIXG(type);
        PxuCJdSBwIXG.getClass();
        throw new i42(fx1.JTxCbbCwomzt(bu1.PxuCJdSBwIXG(PxuCJdSBwIXG)));
    }

    public static final KSerializer serializer(Type type) {
        type.getClass();
        return SerializersKt.serializer(cs0.jJwa0q7P5wHq, type);
    }
}
