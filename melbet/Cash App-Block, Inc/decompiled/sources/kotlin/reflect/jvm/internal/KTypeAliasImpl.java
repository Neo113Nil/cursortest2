package kotlin.reflect.jvm.internal;

import kotlin.reflect.KClassifier;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* loaded from: classes9.dex */
public final class KTypeAliasImpl implements KClassifier, TypeConstructorMarker {
    public final FqName fqName;

    public KTypeAliasImpl(FqName fqName) {
        fqName.getClass();
        this.fqName = fqName;
    }
}
