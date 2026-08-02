package kotlin.reflect.jvm.internal.calls;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class InternalUnderlyingValOfInlineClass implements Caller {
    public final List parameterTypes;
    public final Class returnType;
    public final Method unboxMethod;

    public final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {
        public final Object boundReceiver;

        public Bound(Method method, Object obj) {
            super(method, EmptyList.INSTANCE);
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] objArr) {
            objArr.getClass();
            checkArguments(objArr);
            return this.unboxMethod.invoke(this.boundReceiver, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public final class Unbound extends InternalUnderlyingValOfInlineClass {
        public Unbound(Method method) {
            super(method, CollectionsKt__CollectionsJVMKt.listOf(method.getDeclaringClass()));
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] objArr) {
            objArr.getClass();
            checkArguments(objArr);
            Object obj = objArr[0];
            Object[] copyOfRange = objArr.length <= 1 ? new Object[0] : ArraysKt___ArraysJvmKt.copyOfRange(1, objArr.length, objArr);
            copyOfRange.getClass();
            return this.unboxMethod.invoke(obj, Arrays.copyOf(copyOfRange, copyOfRange.length));
        }
    }

    public InternalUnderlyingValOfInlineClass(Method method, List list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.returnType = returnType;
    }

    public final void checkArguments(Object[] objArr) {
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
        return this.returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }
}
