package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;

/* loaded from: classes9.dex */
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.areEqual(getMember(), ((ReflectJavaMember) obj).getMember());
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    public ReflectJavaClass getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        declaringClass.getClass();
        return new ReflectJavaClass(declaringClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public AnnotatedElement getElement() {
        Member member = getMember();
        member.getClass();
        return (AnnotatedElement) member;
    }

    public abstract Member getMember();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Name identifier;
        String name = getMember().getName();
        return (name == null || (identifier = Name.identifier(name)) == null) ? SpecialNames.NO_NAME_PROVIDED : identifier;
    }

    public final ArrayList getValueParameters(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        Method getName;
        ArrayList arrayList;
        String str;
        boolean z2;
        Java8ParameterNamesLoader.Cache cache;
        typeArr.getClass();
        annotationArr.getClass();
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        Java8ParameterNamesLoader java8ParameterNamesLoader = Java8ParameterNamesLoader.INSTANCE;
        Member member = getMember();
        member.getClass();
        Java8ParameterNamesLoader.Cache cache2 = Java8ParameterNamesLoader.cache;
        if (cache2 == null) {
            synchronized (java8ParameterNamesLoader) {
                cache2 = Java8ParameterNamesLoader.cache;
                if (cache2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        cache = new Java8ParameterNamesLoader.Cache(cls.getMethod("getParameters", null), ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        cache = new Java8ParameterNamesLoader.Cache(null, null);
                    }
                    Java8ParameterNamesLoader.cache = cache;
                    cache2 = cache;
                }
            }
        }
        Method getParameters = cache2.getGetParameters();
        if (getParameters == null || (getName = cache2.getGetName()) == null) {
            arrayList = null;
        } else {
            Object invoke = getParameters.invoke(member, null);
            invoke.getClass();
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = getName.invoke(obj, null);
                invoke2.getClass();
                arrayList.add((String) invoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            ReflectJavaType create = ReflectJavaType.Factory.create(typeArr[i]);
            if (arrayList != null) {
                str = (String) CollectionsKt.getOrNull(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + create + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i == typeArr.length - 1) {
                    arrayList2.add(new ReflectJavaValueParameter(create, annotationArr[i], str, z2));
                }
            }
            z2 = false;
            arrayList2.add(new ReflectJavaValueParameter(create, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? Visibilities.Public.INSTANCE : Modifier.isPrivate(modifiers) ? Visibilities.Private.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE : JavaVisibilities.PackageVisibility.INSTANCE;
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + getMember();
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
