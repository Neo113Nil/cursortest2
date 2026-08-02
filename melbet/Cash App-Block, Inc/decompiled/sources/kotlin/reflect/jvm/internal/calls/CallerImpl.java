package kotlin.reflect.jvm.internal.calls;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okhttp3.Headers;

/* loaded from: classes9.dex */
public abstract class CallerImpl implements Caller {
    public final Class instanceClass;
    public final Member member;
    public final List parameterTypes;
    public final Type returnType;

    public final class BoundConstructor extends CallerImpl implements BoundCaller {
        public final /* synthetic */ int $r8$classId;
        public final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BoundConstructor(java.lang.reflect.Constructor constructor, Object obj, int i) {
            super(constructor, r7, null, r1);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(1, genericParameterTypes.length - 1, genericParameterTypes)));
                    this.boundReceiver = obj;
                    break;
                default:
                    Class declaringClass2 = constructor.getDeclaringClass();
                    declaringClass2.getClass();
                    Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                    genericParameterTypes2.getClass();
                    this.boundReceiver = obj;
                    break;
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] objArr) {
            int i = this.$r8$classId;
            Object obj = this.boundReceiver;
            Member member = this.member;
            objArr.getClass();
            switch (i) {
                case 0:
                    checkArguments(objArr);
                    Headers.Builder builder = new Headers.Builder(2);
                    builder.add(obj);
                    builder.addSpread(objArr);
                    ArrayList arrayList = builder.namesAndValues;
                    return ((java.lang.reflect.Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
                default:
                    checkArguments(objArr);
                    Headers.Builder builder2 = new Headers.Builder(3);
                    builder2.add(obj);
                    builder2.addSpread(objArr);
                    builder2.add(null);
                    ArrayList arrayList2 = builder2.namesAndValues;
                    return ((java.lang.reflect.Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
            }
        }
    }

    public final class Constructor extends CallerImpl {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Constructor(java.lang.reflect.Constructor constructor, int i) {
            super(constructor, r7, r0, r1);
            this.$r8$classId = i;
            Class<?> cls = null;
            switch (i) {
                case 1:
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(0, genericParameterTypes.length - 1, genericParameterTypes)));
                    break;
                default:
                    Class declaringClass2 = constructor.getDeclaringClass();
                    declaringClass2.getClass();
                    Class declaringClass3 = constructor.getDeclaringClass();
                    Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
                    if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
                        cls = declaringClass4;
                    }
                    Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                    genericParameterTypes2.getClass();
                    break;
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] objArr) {
            int i = this.$r8$classId;
            Member member = this.member;
            objArr.getClass();
            switch (i) {
                case 0:
                    checkArguments(objArr);
                    return ((java.lang.reflect.Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
                default:
                    checkArguments(objArr);
                    Headers.Builder builder = new Headers.Builder(2);
                    builder.addSpread(objArr);
                    builder.add(null);
                    ArrayList arrayList = builder.namesAndValues;
                    return ((java.lang.reflect.Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CallerImpl(Member member, Type type2, Class cls, Type[] typeArr) {
        List list;
        this.member = member;
        this.returnType = type2;
        this.instanceClass = cls;
        if (cls != null) {
            Headers.Builder builder = new Headers.Builder(2);
            builder.add(cls);
            builder.addSpread(typeArr);
            ArrayList arrayList = builder.namesAndValues;
            list = CollectionsKt__CollectionsKt.listOf(arrayList.toArray(new Type[arrayList.size()]));
        }
        list = ArraysKt___ArraysKt.toList(typeArr);
        this.parameterTypes = list;
    }

    public void checkArguments(Object[] objArr) {
        objArr.getClass();
        List list = this.parameterTypes;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(list.size());
        sb.append(" arguments, but ");
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(objArr.length, " were provided.", sb));
    }

    public final void checkObjectInstance(Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            a$$ExternalSyntheticBUOutline0.m$3("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Member getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final List getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        return this.returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }

    public abstract class FieldGetter extends CallerImpl {

        public final class BoundInstance extends FieldGetter implements BoundCaller {
            public final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(Field field, Object obj) {
                super(field, false);
                field.getClass();
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] objArr) {
                objArr.getClass();
                checkArguments(objArr);
                return ((Field) this.member).get(this.boundReceiver);
            }
        }

        public final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FieldGetter(Field field, boolean z) {
            super(field, r0, z ? field.getDeclaringClass() : null, new Type[0]);
            Type genericType = field.getGenericType();
            genericType.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] objArr) {
            objArr.getClass();
            checkArguments(objArr);
            return ((Field) this.member).get(this.instanceClass != null ? ArraysKt___ArraysKt.first(objArr) : null);
        }

        public final class Static extends FieldGetter {
            public final /* synthetic */ int $r8$classId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(Field field) {
                super(field, true);
                this.$r8$classId = 1;
                field.getClass();
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(Object[] objArr) {
                switch (this.$r8$classId) {
                    case 2:
                        objArr.getClass();
                        super.checkArguments(objArr);
                        checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(objArr));
                        break;
                    default:
                        super.checkArguments(objArr);
                        break;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Static(Field field, boolean z, int i) {
                super(field, z);
                this.$r8$classId = i;
            }
        }
    }

    public abstract class Method extends CallerImpl {
        public final /* synthetic */ int $r8$classId = 1;
        public final boolean isVoidMethod;

        public final class BoundInstance extends Method implements BoundCaller {
            public final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Method method, Object obj) {
                super(method, false, 4);
                method.getClass();
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] objArr) {
                objArr.getClass();
                checkArguments(objArr);
                return callMethod(objArr, this.boundReceiver);
            }
        }

        public final class BoundJvmStaticInObject extends Method implements BoundCaller {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] objArr) {
                objArr.getClass();
                checkArguments(objArr);
                return callMethod(objArr, null);
            }
        }

        public final class BoundStatic extends Method implements BoundCaller {
            public final Object boundReceiver;
            public final boolean isCallByToValueClassMangledMethod;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BoundStatic(java.lang.reflect.Method method, boolean z, Object obj) {
                super(method, false, (Type[]) (r0.length <= 1 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(1, r0.length, r0)));
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                this.isCallByToValueClassMangledMethod = z;
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] objArr) {
                objArr.getClass();
                checkArguments(objArr);
                Headers.Builder builder = new Headers.Builder(2);
                builder.add(this.boundReceiver);
                builder.addSpread(objArr);
                ArrayList arrayList = builder.namesAndValues;
                return callMethod(arrayList.toArray(new Object[arrayList.size()]), null);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Method(Field field, boolean z, boolean z2) {
            super(field, r1, r7, new Type[]{r2});
            Class cls = Void.TYPE;
            cls.getClass();
            Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            genericType.getClass();
            this.isVoidMethod = z;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] objArr) {
            objArr.getClass();
            checkArguments(objArr);
            ((Field) this.member).set(this.instanceClass != null ? ArraysKt___ArraysKt.first(objArr) : null, ArraysKt___ArraysKt.last(objArr));
            return Unit.INSTANCE;
        }

        public Object callMethod(Object[] objArr, Object obj) {
            objArr.getClass();
            return this.isVoidMethod ? Unit.INSTANCE : ((java.lang.reflect.Method) this.member).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void checkArguments(Object[] objArr) {
            switch (this.$r8$classId) {
                case 1:
                    objArr.getClass();
                    super.checkArguments(objArr);
                    if (this.isVoidMethod && ArraysKt___ArraysKt.last(objArr) == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("null is not allowed as a value for this property.");
                        break;
                    }
                    break;
                default:
                    super.checkArguments(objArr);
                    break;
            }
        }

        public final class Static extends Method {
            public final /* synthetic */ int $r8$classId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Method method) {
                super(method, false, 6);
                this.$r8$classId = 1;
                method.getClass();
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] objArr) {
                int i = this.$r8$classId;
                objArr.getClass();
                switch (i) {
                    case 0:
                        checkArguments(objArr);
                        return callMethod(objArr, null);
                    case 1:
                        checkArguments(objArr);
                        return callMethod(objArr.length <= 1 ? new Object[0] : ArraysKt___ArraysJvmKt.copyOfRange(1, objArr.length, objArr), objArr[0]);
                    default:
                        checkArguments(objArr);
                        checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(objArr));
                        return callMethod(objArr.length <= 1 ? new Object[0] : ArraysKt___ArraysJvmKt.copyOfRange(1, objArr.length, objArr), null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Static(int i, int i2, java.lang.reflect.Method method, boolean z) {
                super(method, z, i);
                this.$r8$classId = i2;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Method(java.lang.reflect.Method method, boolean z, Type[] typeArr) {
            super(method, r0, z ? method.getDeclaringClass() : null, typeArr);
            Type genericReturnType = method.getGenericReturnType();
            genericReturnType.getClass();
            this.isVoidMethod = genericReturnType.equals(Void.TYPE);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z, int i) {
            this(method, z, r4);
            z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            genericParameterTypes.getClass();
        }
    }
}
