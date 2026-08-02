package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;

/* loaded from: classes9.dex */
public final class JvmClassExtension implements KmClassExtension {
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.factory.getOrCreateKotlinClass(JvmClassExtension.class));
    public String anonymousObjectOriginName;
    public int jvmFlags;
    public final ArrayList localDelegatedProperties = new ArrayList(0);
    public String moduleName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KmExtensionType getTYPE() {
            return JvmClassExtension.TYPE;
        }
    }

    public final String getAnonymousObjectOriginName() {
        return this.anonymousObjectOriginName;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
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

    public final void setAnonymousObjectOriginName(String str) {
        this.anonymousObjectOriginName = str;
    }

    public final void setJvmFlags(int i) {
        this.jvmFlags = i;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }
}
