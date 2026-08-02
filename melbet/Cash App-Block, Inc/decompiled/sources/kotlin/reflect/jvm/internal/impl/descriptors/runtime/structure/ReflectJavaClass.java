package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;
import okhttp3.Headers;

/* loaded from: classes9.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {
    public final Class klass;

    public ReflectJavaClass(Class<?> cls) {
        cls.getClass();
        this.klass = cls;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReflectJavaClass) {
            return Intrinsics.areEqual(this.klass, ((ReflectJavaClass) obj).klass);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        fqName.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? EmptyList.INSTANCE : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.klass.getDeclaredConstructors();
        declaredConstructors.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.klass.getDeclaredFields();
        declaredFields.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public FqName getFqName() {
        return ReflectClassUtilKt.getClassId(this.klass).asSingleFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<Name> getInnerClassNames() {
        Class<?>[] declaredClasses = this.klass.getDeclaredClasses();
        declaredClasses.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(declaredClasses), ReflectJavaClass$$Lambda$0.INSTANCE), ReflectJavaClass$$Lambda$0.INSTANCE$3));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.klass.getDeclaredMethods();
        declaredMethods.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(ArraysKt___ArraysKt.asSequence(declaredMethods), new TasksKt$awaitImpl$2$2(this, 3)), ReflectJavaClass$methods$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.klass.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Class cls = this.klass;
        if (cls.isAnonymousClass()) {
            Name identifier = Name.identifier(StringsKt.substringAfterLast$default(cls.getName(), "."));
            identifier.getClass();
            return identifier;
        }
        Name identifier2 = Name.identifier(cls.getSimpleName());
        identifier2.getClass();
        return identifier2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public ReflectJavaClass getOuterClass() {
        Class<?> declaringClass = this.klass.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaRecordComponent> getRecordComponents() {
        Object[] loadGetRecordComponents = Java16SealedRecordLoader.INSTANCE.loadGetRecordComponents(this.klass);
        if (loadGetRecordComponents == null) {
            loadGetRecordComponents = new Object[0];
        }
        ArrayList arrayList = new ArrayList(loadGetRecordComponents.length);
        for (Object obj : loadGetRecordComponents) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaClassifierType> getSupertypes() {
        Class cls;
        Class cls2 = this.klass;
        cls = Object.class;
        if (Intrinsics.areEqual(cls2, cls)) {
            return EmptyList.INSTANCE;
        }
        Headers.Builder builder = new Headers.Builder(2);
        Type genericSuperclass = cls2.getGenericSuperclass();
        builder.add(genericSuperclass != null ? genericSuperclass : Object.class);
        builder.addSpread(cls2.getGenericInterfaces());
        ArrayList arrayList = builder.namesAndValues;
        List listOf = CollectionsKt__CollectionsKt.listOf(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable[] typeParameters = this.klass.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? Visibilities.Public.INSTANCE : Modifier.isPrivate(modifiers) ? Visibilities.Private.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE : JavaVisibilities.PackageVisibility.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean hasDefaultConstructor() {
        return false;
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.klass.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.klass.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.klass.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isRecord() {
        Boolean loadIsRecord = Java16SealedRecordLoader.INSTANCE.loadIsRecord(this.klass);
        if (loadIsRecord != null) {
            return loadIsRecord.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isSealed() {
        Boolean loadIsSealed = Java16SealedRecordLoader.INSTANCE.loadIsSealed(this.klass);
        if (loadIsSealed != null) {
            return loadIsSealed.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boxes$$ExternalSyntheticOutline1.m(ReflectJavaClass.class, sb, ": ");
        sb.append(this.klass);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public Class<?> getElement() {
        return this.klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
