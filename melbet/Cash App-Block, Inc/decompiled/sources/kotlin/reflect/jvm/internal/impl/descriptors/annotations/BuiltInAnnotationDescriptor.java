package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {
    public final Map allValueArguments;
    public final KotlinBuiltIns builtIns;
    public final FqName fqName;
    public final Lazy type$delegate;

    public BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map<Name, ? extends ConstantValue<?>> map, boolean z) {
        kotlinBuiltIns.getClass();
        fqName.getClass();
        map.getClass();
        this.builtIns = kotlinBuiltIns;
        this.fqName = fqName;
        this.allValueArguments = map;
        this.type$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KotlinKPropertyN$$Lambda$0(this, 7));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.allValueArguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        Object value = this.type$delegate.getValue();
        value.getClass();
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i & 8) != 0 ? false : z);
    }
}
