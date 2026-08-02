package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import com.google.crypto.tink.subtle.X25519;
import com.google.maps.android.compose.InputHandlerKt;
import com.google.maps.android.compose.MapComposeViewRenderKt;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class KotlinKProperty$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final KotlinKProperty arg$0;

    public /* synthetic */ KotlinKProperty$$Lambda$0(KotlinKProperty kotlinKProperty, int i) {
        this.$r8$classId = i;
        this.arg$0 = kotlinKProperty;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        JvmFieldSignature fieldSignature;
        int i = this.$r8$classId;
        KotlinKProperty kotlinKProperty = this.arg$0;
        switch (i) {
            case 0:
                KotlinKProperty kotlinKProperty2 = this.arg$0;
                KmProperty kmProperty = kotlinKProperty2.kmProperty;
                return X25519.computeParameters(kotlinKProperty2, kmProperty.getContextParameters(), kmProperty.getReceiverParameterType(), EmptyList.INSTANCE, (TypeParameterTable) kotlinKProperty2.typeParameterTable.getValue(), true);
            case 1:
                KotlinKProperty kotlinKProperty3 = this.arg$0;
                boolean isBound = Room.isBound(kotlinKProperty3);
                KmProperty kmProperty2 = kotlinKProperty3.kmProperty;
                return isBound ? X25519.computeParameters(kotlinKProperty3, kmProperty2.getContextParameters(), kmProperty2.getReceiverParameterType(), EmptyList.INSTANCE, (TypeParameterTable) kotlinKProperty3.typeParameterTable.getValue(), false) : kotlinKProperty3.getAllParameters();
            case 2:
                KmType returnType = kotlinKProperty.kmProperty.getReturnType();
                ClassLoader classLoader = kotlinKProperty.container.getJClass().getClassLoader();
                classLoader.getClass();
                return ConvertFromMetadataKt.toKType(returnType, classLoader, (TypeParameterTable) kotlinKProperty.typeParameterTable.getValue(), InputHandlerKt.isLocalDelegated(kotlinKProperty) ? null : new KotlinKProperty$$Lambda$0(kotlinKProperty, 5));
            case 3:
                KDeclarationContainerImpl kDeclarationContainerImpl = kotlinKProperty.container;
                KClassImpl kClassImpl = kDeclarationContainerImpl instanceof KClassImpl ? (KClassImpl) kDeclarationContainerImpl : null;
                TypeParameterTable typeParameterTable$kotlin_reflection = kClassImpl != null ? ((KClassImpl.Data) kClassImpl.data.getValue()).getTypeParameterTable$kotlin_reflection() : null;
                TypeParameterTable typeParameterTable = TypeParameterTable.EMPTY;
                List<KmTypeParameter> typeParameters = kotlinKProperty.kmProperty.getTypeParameters();
                ClassLoader classLoader2 = kDeclarationContainerImpl.getJClass().getClassLoader();
                classLoader2.getClass();
                return MapComposeViewRenderKt.create(typeParameters, typeParameterTable$kotlin_reflection, kotlinKProperty, classLoader2);
            case 4:
                if (InputHandlerKt.isLocalDelegated(kotlinKProperty) || (fieldSignature = JvmExtensionsKt.getFieldSignature(kotlinKProperty.kmProperty)) == null) {
                    return null;
                }
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kotlinKProperty.container;
                if (kDeclarationContainerImpl2 instanceof KPackageImpl) {
                    try {
                        return ((KPackageImpl) kDeclarationContainerImpl2).jClass.getDeclaredField(fieldSignature.getName());
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                Path$$ExternalSyntheticBUOutline0.m$3(kotlinKProperty, "javaField is only supported for top-level properties for now: ");
                return null;
            default:
                return kotlinKProperty.getCaller().getReturnType();
        }
    }
}
