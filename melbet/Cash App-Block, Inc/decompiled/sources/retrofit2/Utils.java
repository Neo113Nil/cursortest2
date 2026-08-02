package retrofit2;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.common.sdkinternal.zzb;
import com.squareup.cash.db.WireAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class Utils {
    public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
    public static boolean checkForKotlinUnit = true;

    /* loaded from: classes4.dex */
    public final class GenericArrayTypeImpl implements GenericArrayType {
        public final Type componentType;

        public GenericArrayTypeImpl(Type type2) {
            this.componentType = type2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Utils.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            return Utils.typeToString(this.componentType) + "[]";
        }
    }

    public final class ParameterizedTypeImpl implements ParameterizedType {
        public final Type ownerType;
        public final Type rawType;
        public final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type2, Type type3, Type... typeArr) {
            if (type3 instanceof Class) {
                if ((type2 == null) != (((Class) type3).getEnclosingClass() == null)) {
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    throw null;
                }
            }
            for (Type type4 : typeArr) {
                Objects.requireNonNull(type4, "typeArgument == null");
                Utils.checkNotPrimitive(type4);
            }
            this.ownerType = type2;
            this.rawType = type3;
            this.typeArguments = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Utils.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.rawType;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type type2 = this.ownerType;
            return (type2 != null ? type2.hashCode() : 0) ^ hashCode;
        }

        public final String toString() {
            Type[] typeArr = this.typeArguments;
            int length = typeArr.length;
            Type type2 = this.rawType;
            if (length == 0) {
                return Utils.typeToString(type2);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Utils.typeToString(type2));
            sb.append("<");
            sb.append(Utils.typeToString(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(Utils.typeToString(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes4.dex */
    public final class WildcardTypeImpl implements WildcardType {
        public final Type lowerBound;
        public final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                throw null;
            }
            if (typeArr.length != 1) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                throw null;
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Utils.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            Utils.checkNotPrimitive(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                throw null;
            }
            this.lowerBound = typeArr2[0];
            this.upperBound = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Utils.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type2 = this.lowerBound;
            return type2 != null ? new Type[]{type2} : Utils.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            Type type2 = this.lowerBound;
            return (this.upperBound.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
        }

        public final String toString() {
            Type type2 = this.lowerBound;
            if (type2 != null) {
                return "? super " + Utils.typeToString(type2);
            }
            Type type3 = this.upperBound;
            if (type3 == Object.class) {
                return "?";
            }
            return "? extends " + Utils.typeToString(type3);
        }
    }

    public static final Object await(Call call, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new KotlinExtensions$await$2$1(call, 0));
        call.enqueue(new WireAdapter(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object awaitNullable(Call call, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new KotlinExtensions$await$4$1(call, 0));
        call.enqueue(new KotlinExtensions$await$4$2(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static void checkNotPrimitive(Type type2) {
        if ((type2 instanceof Class) && ((Class) type2).isPrimitive()) {
            Path$$ExternalSyntheticBUOutline0.m$3();
        }
    }

    public static boolean equals(Type type2, Type type3) {
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            return type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            if (type3 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type2).getGenericComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return false;
        }
        if (type2 instanceof WildcardType) {
            if (!(type3 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type3;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type2 instanceof TypeVariable) || !(type3 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type2;
        TypeVariable typeVariable2 = (TypeVariable) type3;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type getGenericSupertype(Type type2, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type2;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type2 = actualTypeArguments[i];
            return type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds()[0] : type2;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index ", " not in range [0,");
        m2m.append(actualTypeArguments.length);
        m2m.append(") for ");
        m2m.append(parameterizedType);
        throw new IllegalArgumentException(m2m.toString());
    }

    public static Class getRawType(Type type2) {
        Objects.requireNonNull(type2, "type == null");
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type2).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) getRawType(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
        }
        if (type2 instanceof TypeVariable) {
            return Object.class;
        }
        if (type2 instanceof WildcardType) {
            return getRawType(((WildcardType) type2).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type2);
        Handlers$$ExternalSyntheticBUOutline0.m(sb, "> is of type ", type2.getClass().getName());
        return null;
    }

    public static Type getSupertype(Type type2, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return resolve(type2, cls, getGenericSupertype(type2, cls, Map.class));
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public static boolean hasUnresolvableType(Type type2) {
        if (type2 instanceof Class) {
            return false;
        }
        if (!(type2 instanceof ParameterizedType)) {
            if (type2 instanceof GenericArrayType) {
                return hasUnresolvableType(((GenericArrayType) type2).getGenericComponentType());
            }
            if ((type2 instanceof TypeVariable) || (type2 instanceof WildcardType)) {
                return true;
            }
            Handlers$$ExternalSyntheticBUOutline0.m$1("Expected a Class, ParameterizedType, or GenericArrayType, but <", type2, "> is of type ", type2 == null ? "null" : type2.getClass().getName());
            return false;
        }
        for (Type type3 : ((ParameterizedType) type2).getActualTypeArguments()) {
            if (hasUnresolvableType(type3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnnotationPresent(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException methodError(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(String.format(str, objArr), "\n    for method ");
        m108m.append(method.getDeclaringClass().getSimpleName());
        m108m.append(".");
        m108m.append(method.getName());
        return new IllegalArgumentException(m108m.toString(), exc);
    }

    public static IllegalArgumentException parameterError(Method method, int i, String str, Object... objArr) {
        return methodError(method, null, Boxes$$ExternalSyntheticOutline1.m(str, " (", Platform.reflection.describeMethodParameter(method, i), ")"), objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:1:0x0000->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type resolve(Type type2, Class cls, Type type3) {
        Type type4;
        Type type5 = type3;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type resolve = resolve(type2, cls, componentType);
                        return componentType == resolve ? cls2 : new GenericArrayTypeImpl(resolve);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type resolve2 = resolve(type2, cls, genericComponentType);
                    return genericComponentType == resolve2 ? genericArrayType : new GenericArrayTypeImpl(resolve2);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type resolve3 = resolve(type2, cls, ownerType);
                    boolean z = resolve3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type resolve4 = resolve(type2, cls, actualTypeArguments[i]);
                        if (resolve4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = resolve4;
                        }
                        i++;
                    }
                    return z ? new ParameterizedTypeImpl(resolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type5 instanceof WildcardType;
                Type type6 = type5;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type resolve5 = resolve(type2, cls, lowerBounds[0]);
                        type6 = wildcardType;
                        if (resolve5 != lowerBounds[0]) {
                            return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{resolve5});
                        }
                    } else {
                        type6 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type resolve6 = resolve(type2, cls, upperBounds[0]);
                            type6 = wildcardType;
                            if (resolve6 != upperBounds[0]) {
                                return new WildcardTypeImpl(new Type[]{resolve6}, EMPTY_TYPE_ARRAY);
                            }
                        }
                    }
                }
                return type6;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type genericSupertype = getGenericSupertype(type2, cls, cls3);
                if (genericSupertype instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) genericSupertype).getActualTypeArguments()[i];
                            if (type4 != typeVariable) {
                                return type4;
                            }
                            type5 = type4;
                        } else {
                            i++;
                        }
                    }
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
            }
            type4 = typeVariable;
            if (type4 != typeVariable) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void suspendAndThrow(Throwable th, Continuation continuation) {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        int i;
        if (continuation instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) continuation;
            int i2 = kotlinExtensions$suspendAndThrow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = kotlinExtensions$suspendAndThrow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kotlinExtensions$suspendAndThrow$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    kotlinExtensions$suspendAndThrow$1.label = 1;
                    Dispatchers.Default.dispatch(kotlinExtensions$suspendAndThrow$1.getContext(), new zzb(kotlinExtensions$suspendAndThrow$1, th, false, 23));
                    return;
                }
            }
        }
        kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(continuation);
        Object obj2 = kotlinExtensions$suspendAndThrow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kotlinExtensions$suspendAndThrow$1.label;
        if (i == 0) {
        }
    }

    public static void throwIfFatal(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String typeToString(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }

    public abstract void apply(RequestBuilder requestBuilder, Object obj);

    public static IllegalArgumentException parameterError(Method method, Exception exc, int i, String str, Object... objArr) {
        return methodError(method, exc, Boxes$$ExternalSyntheticOutline1.m(str, " (", Platform.reflection.describeMethodParameter(method, i), ")"), objArr);
    }
}
