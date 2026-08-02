package kotlin.reflect.jvm.internal.types;

import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public abstract class MutableCollectionKClassKt {
    public static final MutableCollectionKClass getMutableCollectionKClass(KClass kClass, FqName fqName) {
        fqName.getClass();
        kClass.getClass();
        return new MutableCollectionKClass(kClass, fqName.asString(), new MutableCollectionKClassKt$$Lambda$0(kClass, fqName), new MutableCollectionKClassKt$$Lambda$0(fqName, kClass));
    }
}
