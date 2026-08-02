package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;

/* loaded from: classes9.dex */
public final class TypeAttributeTranslators {
    public final List translators;

    public TypeAttributeTranslators(List<? extends TypeAttributeTranslator> list) {
        list.getClass();
        this.translators = list;
    }

    public final List<TypeAttributeTranslator> getTranslators() {
        return this.translators;
    }
}
