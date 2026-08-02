package kotlin.reflect.jvm.internal;

import com.google.maps.android.compose.MapComposeViewRenderKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;

/* loaded from: classes9.dex */
public final class KotlinKNamedFunction$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final KDeclarationContainerImpl arg$0;
    public final KotlinKNamedFunction arg$1;

    public KotlinKNamedFunction$$Lambda$0(KDeclarationContainerImpl kDeclarationContainerImpl, KotlinKNamedFunction kotlinKNamedFunction) {
        this.arg$0 = kDeclarationContainerImpl;
        this.arg$1 = kotlinKNamedFunction;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        KDeclarationContainerImpl kDeclarationContainerImpl = this.arg$0;
        KotlinKNamedFunction kotlinKNamedFunction = this.arg$1;
        switch (i) {
            case 0:
                KClassImpl kClassImpl = kDeclarationContainerImpl instanceof KClassImpl ? (KClassImpl) kDeclarationContainerImpl : null;
                TypeParameterTable typeParameterTable$kotlin_reflection = kClassImpl != null ? ((KClassImpl.Data) kClassImpl.data.getValue()).getTypeParameterTable$kotlin_reflection() : null;
                TypeParameterTable typeParameterTable = TypeParameterTable.EMPTY;
                List<KmTypeParameter> typeParameters = kotlinKNamedFunction.kmFunction.getTypeParameters();
                ClassLoader classLoader = kDeclarationContainerImpl.getJClass().getClassLoader();
                classLoader.getClass();
                return MapComposeViewRenderKt.create(typeParameters, typeParameterTable$kotlin_reflection, kotlinKNamedFunction, classLoader);
            default:
                KmType returnType = kotlinKNamedFunction.kmFunction.getReturnType();
                ClassLoader classLoader2 = kDeclarationContainerImpl.getJClass().getClassLoader();
                classLoader2.getClass();
                return ConvertFromMetadataKt.toKType(returnType, classLoader2, kotlinKNamedFunction.getTypeParameterTable(), new ConvertFromJavaKt$$Lambda$4(kotlinKNamedFunction, 28));
        }
    }

    public KotlinKNamedFunction$$Lambda$0(KotlinKNamedFunction kotlinKNamedFunction, KDeclarationContainerImpl kDeclarationContainerImpl) {
        this.arg$1 = kotlinKNamedFunction;
        this.arg$0 = kDeclarationContainerImpl;
    }
}
