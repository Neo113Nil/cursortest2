package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* loaded from: classes9.dex */
public final /* synthetic */ class KClasses$isSubclassOf$1 extends PropertyReference1Impl {
    public static final KClasses$isSubclassOf$1 INSTANCE = new KClasses$isSubclassOf$1(KClasses.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        KClass kClass = (KClass) obj;
        kClass.getClass();
        List supertypes = kClass.getSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            KClassifier classifier = ((KType) it.next()).getClassifier();
            KClass kClass2 = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }
}
