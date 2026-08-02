package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension;

/* loaded from: classes9.dex */
public final class JvmPackageExtension implements KmPackageExtension {
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.factory.getOrCreateKotlinClass(JvmPackageExtension.class));
    public final ArrayList localDelegatedProperties = new ArrayList(0);
    public String moduleName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final List<KmProperty> getLocalDelegatedProperties() {
        return this.localDelegatedProperties;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }
}
