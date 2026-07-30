package e6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.d;

/* loaded from: classes4.dex */
public abstract class a {
    public static final <T extends Annotation> d getAnnotationClass(T t7) {
        s.checkNotNullParameter(t7, "<this>");
        Class<? extends Annotation> annotationType = t7.annotationType();
        s.checkNotNullExpressionValue(annotationType, "this as java.lang.annota…otation).annotationType()");
        d kotlinClass = getKotlinClass(annotationType);
        s.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kotlinClass;
    }

    private static final <E extends Enum<E>> Class<E> getDeclaringJavaClass(Enum<E> r12) {
        s.checkNotNullParameter(r12, "<this>");
        Class<E> declaringClass = r12.getDeclaringClass();
        s.checkNotNullExpressionValue(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    public static /* synthetic */ void getDeclaringJavaClass$annotations(Enum r02) {
    }

    public static final <T> Class<T> getJavaClass(d dVar) {
        s.checkNotNullParameter(dVar, "<this>");
        Class<T> cls = (Class<T>) ((l) dVar).getJClass();
        s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void getJavaClass$annotations(d dVar) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final <T> Class<T> getJavaObjectType(d dVar) {
        s.checkNotNullParameter(dVar, "<this>");
        Class<T> cls = (Class<T>) ((l) dVar).getJClass();
        if (!cls.isPrimitive()) {
            s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final <T> Class<T> getJavaPrimitiveType(d dVar) {
        s.checkNotNullParameter(dVar, "<this>");
        Class<T> cls = (Class<T>) ((l) dVar).getJClass();
        if (cls.isPrimitive()) {
            s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final <T> d getKotlinClass(Class<T> cls) {
        s.checkNotNullParameter(cls, "<this>");
        return u.getOrCreateKotlinClass(cls);
    }

    public static final <T> Class<d> getRuntimeClassOfKClassInstance(d dVar) {
        s.checkNotNullParameter(dVar, "<this>");
        Class cls = dVar.getClass();
        s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(d dVar) {
    }

    public static final /* synthetic */ boolean isArrayOf(Object[] objArr) {
        s.checkNotNullParameter(objArr, "<this>");
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    public static final <T> Class<T> getJavaClass(T t7) {
        s.checkNotNullParameter(t7, "<this>");
        Class<T> cls = (Class<T>) t7.getClass();
        s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }
}
