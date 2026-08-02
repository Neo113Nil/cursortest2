package kotlin.reflect.jvm.internal.impl.km;

import java.util.List;

/* loaded from: classes9.dex */
public interface KmDeclarationContainer {
    List<KmFunction> getFunctions();

    List<KmProperty> getProperties();

    List<KmTypeAlias> getTypeAliases();
}
