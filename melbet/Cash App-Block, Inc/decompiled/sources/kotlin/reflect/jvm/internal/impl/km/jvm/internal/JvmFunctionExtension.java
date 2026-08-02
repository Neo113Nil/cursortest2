package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;

/* loaded from: classes9.dex */
public final class JvmFunctionExtension implements KmFunctionExtension {
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.factory.getOrCreateKotlinClass(JvmFunctionExtension.class));
    public String lambdaClassOriginName;
    public JvmMethodSignature signature;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String getLambdaClassOriginName() {
        return this.lambdaClassOriginName;
    }

    public final JvmMethodSignature getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setLambdaClassOriginName(String str) {
        this.lambdaClassOriginName = str;
    }

    public final void setSignature(JvmMethodSignature jvmMethodSignature) {
        this.signature = jvmMethodSignature;
    }
}
