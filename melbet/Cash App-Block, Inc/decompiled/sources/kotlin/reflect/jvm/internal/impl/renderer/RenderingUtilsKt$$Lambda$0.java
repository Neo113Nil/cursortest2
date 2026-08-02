package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;

/* loaded from: classes9.dex */
public final class RenderingUtilsKt$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$1 = new RenderingUtilsKt$$Lambda$0(1);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$2 = new RenderingUtilsKt$$Lambda$0(2);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$3 = new RenderingUtilsKt$$Lambda$0(3);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$4 = new RenderingUtilsKt$$Lambda$0(4);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$5 = new RenderingUtilsKt$$Lambda$0(5);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$6 = new RenderingUtilsKt$$Lambda$0(6);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$7 = new RenderingUtilsKt$$Lambda$0(7);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$8 = new RenderingUtilsKt$$Lambda$0(8);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$9 = new RenderingUtilsKt$$Lambda$0(9);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$10 = new RenderingUtilsKt$$Lambda$0(10);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$11 = new RenderingUtilsKt$$Lambda$0(11);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$12 = new RenderingUtilsKt$$Lambda$0(12);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$13 = new RenderingUtilsKt$$Lambda$0(13);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$14 = new RenderingUtilsKt$$Lambda$0(14);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$15 = new RenderingUtilsKt$$Lambda$0(15);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE$16 = new RenderingUtilsKt$$Lambda$0(16);
    public static final RenderingUtilsKt$$Lambda$0 INSTANCE = new RenderingUtilsKt$$Lambda$0(0);

    public /* synthetic */ RenderingUtilsKt$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return str;
            case 1:
                DescriptorRendererOptions descriptorRendererOptions = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion = DescriptorRenderer.Companion;
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setModifiers(EmptySet.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                DescriptorRendererOptions descriptorRendererOptions2 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion2 = DescriptorRenderer.Companion;
                descriptorRendererOptions2.getClass();
                descriptorRendererOptions2.setTextFormat(RenderingFormat.HTML);
                descriptorRendererOptions2.setModifiers(DescriptorRendererModifier.ALL);
                return Unit.INSTANCE;
            case 3:
                DescriptorRendererOptions descriptorRendererOptions3 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion3 = DescriptorRenderer.Companion;
                descriptorRendererOptions3.getClass();
                descriptorRendererOptions3.setWithDefinedIn(false);
                return Unit.INSTANCE;
            case 4:
                DescriptorRendererOptions descriptorRendererOptions4 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion4 = DescriptorRenderer.Companion;
                descriptorRendererOptions4.getClass();
                descriptorRendererOptions4.setWithDefinedIn(false);
                descriptorRendererOptions4.setModifiers(EmptySet.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                DescriptorRendererOptions descriptorRendererOptions5 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion5 = DescriptorRenderer.Companion;
                descriptorRendererOptions5.getClass();
                descriptorRendererOptions5.setWithDefinedIn(false);
                descriptorRendererOptions5.setModifiers(EmptySet.INSTANCE);
                descriptorRendererOptions5.setWithoutSuperTypes(true);
                return Unit.INSTANCE;
            case 6:
                DescriptorRendererOptions descriptorRendererOptions6 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion6 = DescriptorRenderer.Companion;
                descriptorRendererOptions6.getClass();
                descriptorRendererOptions6.setModifiers(EmptySet.INSTANCE);
                descriptorRendererOptions6.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                descriptorRendererOptions6.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return Unit.INSTANCE;
            case 7:
                DescriptorRendererOptions descriptorRendererOptions7 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion7 = DescriptorRenderer.Companion;
                descriptorRendererOptions7.getClass();
                descriptorRendererOptions7.setWithDefinedIn(false);
                descriptorRendererOptions7.setModifiers(EmptySet.INSTANCE);
                descriptorRendererOptions7.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                descriptorRendererOptions7.setWithoutTypeParameters(true);
                descriptorRendererOptions7.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
                descriptorRendererOptions7.setReceiverAfterName(true);
                descriptorRendererOptions7.setRenderCompanionObjectName(true);
                descriptorRendererOptions7.setWithoutSuperTypes(true);
                descriptorRendererOptions7.setStartFromName(true);
                return Unit.INSTANCE;
            case 8:
                DescriptorRendererOptions descriptorRendererOptions8 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion8 = DescriptorRenderer.Companion;
                descriptorRendererOptions8.getClass();
                descriptorRendererOptions8.setModifiers(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
                return Unit.INSTANCE;
            case 9:
                DescriptorRendererOptions descriptorRendererOptions9 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion9 = DescriptorRenderer.Companion;
                descriptorRendererOptions9.getClass();
                descriptorRendererOptions9.setModifiers(DescriptorRendererModifier.ALL);
                return Unit.INSTANCE;
            case 10:
                DescriptorRendererOptions descriptorRendererOptions10 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion10 = DescriptorRenderer.Companion;
                descriptorRendererOptions10.getClass();
                descriptorRendererOptions10.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                descriptorRendererOptions10.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return Unit.INSTANCE;
            case 11:
                DescriptorRendererOptions descriptorRendererOptions11 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion11 = DescriptorRenderer.Companion;
                descriptorRendererOptions11.getClass();
                descriptorRendererOptions11.setDebugMode(true);
                descriptorRendererOptions11.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
                descriptorRendererOptions11.setModifiers(DescriptorRendererModifier.ALL);
                return Unit.INSTANCE;
            case 12:
                KotlinType kotlinType = (KotlinType) obj;
                int i = DescriptorRendererImpl.$r8$clinit;
                kotlinType.getClass();
                return kotlinType instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable() : kotlinType;
            case 13:
                int i2 = DescriptorRendererImpl.$r8$clinit;
                return "";
            case 14:
                DescriptorRendererOptions descriptorRendererOptions12 = (DescriptorRendererOptions) obj;
                int i3 = DescriptorRendererImpl.$r8$clinit;
                descriptorRendererOptions12.getClass();
                descriptorRendererOptions12.setExcludedTypeAnnotationClasses(SetsKt___SetsKt.plus((Set) descriptorRendererOptions12.getExcludedTypeAnnotationClasses(), (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams})));
                return Unit.INSTANCE;
            case 15:
                KotlinType kotlinType2 = (KotlinType) obj;
                KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.$$delegatedProperties;
                kotlinType2.getClass();
                return kotlinType2;
            default:
                KProperty[] kPropertyArr2 = DescriptorRendererOptionsImpl.$$delegatedProperties;
                ((ValueParameterDescriptor) obj).getClass();
                return "...";
        }
    }
}
