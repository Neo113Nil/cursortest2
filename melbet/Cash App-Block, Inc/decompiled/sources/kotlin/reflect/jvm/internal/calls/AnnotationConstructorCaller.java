package kotlin.reflect.jvm.internal.calls;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.MapEffectKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class AnnotationConstructorCaller implements Caller {
    public final CallMode callMode;
    public final ArrayList defaultValues;
    public final ArrayList erasedParameterTypes;
    public final Class jClass;
    public final List methods;
    public final ArrayList parameterNames;
    public final ArrayList parameterTypes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CallMode {
        public static final /* synthetic */ CallMode[] $VALUES;
        public static final CallMode CALL_BY_NAME;
        public static final CallMode POSITIONAL_CALL;

        static {
            CallMode callMode = new CallMode("CALL_BY_NAME", 0);
            CALL_BY_NAME = callMode;
            CallMode callMode2 = new CallMode("POSITIONAL_CALL", 1);
            POSITIONAL_CALL = callMode2;
            $VALUES = new CallMode[]{callMode, callMode2};
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Origin {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Origin JAVA;
        public static final Origin KOTLIN;

        static {
            Origin origin = new Origin("JAVA", 0);
            JAVA = origin;
            Origin origin2 = new Origin("KOTLIN", 1);
            KOTLIN = origin2;
            $VALUES = new Origin[]{origin, origin2};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode, Origin origin, List list) {
        cls.getClass();
        list.getClass();
        this.jClass = cls;
        this.parameterNames = arrayList;
        this.callMode = callMode;
        this.methods = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList2;
        List list3 = this.methods;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(returnType);
            if (wrapperByPrimitive != null) {
                returnType = wrapperByPrimitive;
            }
            arrayList3.add(returnType);
        }
        this.erasedParameterTypes = arrayList3;
        List list4 = this.methods;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList4;
        if (this.callMode == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && !CollectionsKt.minus(this.parameterNames, "value").isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r12.isInstance(r9) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013c A[LOOP:0: B:4:0x001a->B:13:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] objArr) {
        Object obj;
        String qualifiedName;
        objArr.getClass();
        ArrayList arrayList = this.parameterTypes;
        if (arrayList.size() != objArr.length) {
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(arrayList.size());
            sb.append(" arguments, but ");
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(objArr.length, " were provided.", sb));
            return null;
        }
        ArrayList arrayList2 = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.parameterNames;
            if (i >= length) {
                return MapEffectKt.createAnnotationInstance(this.jClass, MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList3, arrayList2)), this.methods);
            }
            Object obj2 = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList4 = this.erasedParameterTypes;
            if (obj2 == null && this.callMode == CallMode.CALL_BY_NAME) {
                obj2 = this.defaultValues.get(i2);
            } else {
                Class cls = (Class) arrayList4.get(i2);
                if (obj2 instanceof Class) {
                    obj2 = null;
                } else {
                    if (obj2 instanceof KClass) {
                        obj2 = PapaEvent.getJavaClass((KClass) obj2);
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj2;
                        if (objArr2 instanceof Class[]) {
                            obj = null;
                            obj2 = obj;
                            if (obj2 != null) {
                                String str = (String) arrayList3.get(i2);
                                Class cls2 = (Class) arrayList4.get(i2);
                                KClass orCreateKotlinClass = Intrinsics.areEqual(cls2, Class.class) ? Reflection.factory.getOrCreateKotlinClass(KClass.class) : (cls2.isArray() && Intrinsics.areEqual(cls2.getComponentType(), Class.class)) ? Reflection.factory.getOrCreateKotlinClass(KClass[].class) : Reflection.factory.getOrCreateKotlinClass(cls2);
                                String qualifiedName2 = orCreateKotlinClass.getQualifiedName();
                                ReflectionFactory reflectionFactory = Reflection.factory;
                                if (Intrinsics.areEqual(qualifiedName2, reflectionFactory.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(orCreateKotlinClass.getQualifiedName());
                                    sb2.append('<');
                                    Class<?> componentType = PapaEvent.getJavaClass(orCreateKotlinClass).getComponentType();
                                    componentType.getClass();
                                    sb2.append(reflectionFactory.getOrCreateKotlinClass(componentType).getQualifiedName());
                                    sb2.append('>');
                                    qualifiedName = sb2.toString();
                                } else {
                                    qualifiedName = orCreateKotlinClass.getQualifiedName();
                                }
                                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + qualifiedName);
                            }
                            arrayList2.add(obj2);
                            i++;
                            i2 = i3;
                        } else if (objArr2 instanceof KClass[]) {
                            KClass[] kClassArr = (KClass[]) obj2;
                            ArrayList arrayList5 = new ArrayList(kClassArr.length);
                            for (KClass kClass : kClassArr) {
                                arrayList5.add(PapaEvent.getJavaClass(kClass));
                            }
                            obj = null;
                            obj2 = arrayList5.toArray(new Class[0]);
                        } else {
                            obj = null;
                            obj2 = objArr2;
                        }
                    }
                    obj = null;
                }
            }
            if (obj2 != null) {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final List getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode) {
        this(cls, arrayList, callMode, r4, r5);
        Origin origin = Origin.KOTLIN;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
    }
}
