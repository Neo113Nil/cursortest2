package kotlin.reflect.full;

import com.nimbusds.jose.util.X509CertChainUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.types.AbstractKType;

/* loaded from: classes9.dex */
public abstract class KClasses {
    public static final AbstractKType createDefaultType(KClass kClass) {
        kClass.getClass();
        List<KTypeParameterBase> allTypeParameters = X509CertChainUtils.allTypeParameters(kClass);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allTypeParameters, 10));
        for (KTypeParameterBase kTypeParameterBase : allTypeParameters) {
            arrayList.add(new KTypeProjection(KClassifiers.createType$default(kTypeParameterBase, null, 7), KVariance.INVARIANT));
        }
        return KClassifiers.createType$default(kClass, arrayList, 6);
    }

    public static final boolean isSubclassOf(KClass kClass, KClass kClass2) {
        kClass2.getClass();
        if (kClass.equals(kClass2)) {
            return true;
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(kClass);
        KClasses$isSubclassOf$1 kClasses$isSubclassOf$1 = KClasses$isSubclassOf$1.INSTANCE;
        int i = 0;
        return DFS.ifAny(listOf, new KClasses$$Lambda$1(i), new KClasses$$Lambda$2(kClass2, i)).booleanValue();
    }
}
