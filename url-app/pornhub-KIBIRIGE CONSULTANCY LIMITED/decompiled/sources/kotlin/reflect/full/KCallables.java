package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;

/* compiled from: KCallables.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a6\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00022\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0015\"\u0004\u0018\u00010\u0016H\u0087@¢\u0006\u0002\u0010\u0017\u001a4\u0010\u0018\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00022\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019H\u0087@¢\u0006\u0002\u0010\u001a\"$\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"$\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"instanceParameter", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KCallable;", "getInstanceParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "getInstanceParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "extensionReceiverParameter", "getExtensionReceiverParameter$annotations", "getExtensionReceiverParameter", "valueParameters", "", "getValueParameters$annotations", "getValueParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "findParameterByName", "name", "", "callSuspend", "R", "args", "", "", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callSuspendBy", "", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KCallables {
    public static /* synthetic */ void getExtensionReceiverParameter$annotations(KCallable kCallable) {
    }

    public static /* synthetic */ void getInstanceParameter$annotations(KCallable kCallable) {
    }

    public static /* synthetic */ void getValueParameters$annotations(KCallable kCallable) {
    }

    public static final KParameter getInstanceParameter(KCallable<?> kCallable) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.INSTANCE) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    public static final KParameter getExtensionReceiverParameter(KCallable<?> kCallable) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    public static final List<KParameter> getValueParameters(KCallable<?> kCallable) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        List<KParameter> parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final KParameter findParameterByName(KCallable<?> kCallable, String name) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.areEqual(((KParameter) next).getName(), name)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object callSuspend(KCallable<? extends R> kCallable, Object[] objArr, Continuation<? super R> continuation) {
        KCallables$callSuspend$1 kCallables$callSuspend$1;
        int i;
        if (continuation instanceof KCallables$callSuspend$1) {
            kCallables$callSuspend$1 = (KCallables$callSuspend$1) continuation;
            if ((kCallables$callSuspend$1.label & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspend$1.label -= Integer.MIN_VALUE;
                Object obj = kCallables$callSuspend$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kCallables$callSuspend$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!kCallable.isSuspend()) {
                        return kCallable.call(Arrays.copyOf(objArr, objArr.length));
                    }
                    if (!(kCallable instanceof KFunction)) {
                        throw new IllegalArgumentException("Cannot callSuspend on a property " + kCallable + ": suspend properties are not supported yet");
                    }
                    kCallables$callSuspend$1.L$0 = kCallable;
                    kCallables$callSuspend$1.L$1 = objArr;
                    kCallables$callSuspend$1.label = 1;
                    KCallables$callSuspend$1 kCallables$callSuspend$12 = kCallables$callSuspend$1;
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.addSpread(objArr);
                    spreadBuilder.add(kCallables$callSuspend$12);
                    obj = kCallable.call(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(kCallables$callSuspend$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kCallable = (KCallable) kCallables$callSuspend$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                KFunction kFunction = (KFunction) kCallable;
                return (Intrinsics.areEqual(kFunction.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class)) || kFunction.getReturnType().getIsMarkedNullable()) ? obj : Unit.INSTANCE;
            }
        }
        kCallables$callSuspend$1 = new KCallables$callSuspend$1(continuation);
        Object obj2 = kCallables$callSuspend$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kCallables$callSuspend$1.label;
        if (i != 0) {
        }
        KFunction kFunction2 = (KFunction) kCallable;
        if (Intrinsics.areEqual(kFunction2.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class))) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object callSuspendBy(KCallable<? extends R> kCallable, Map<KParameter, ? extends Object> map, Continuation<? super R> continuation) {
        KCallables$callSuspendBy$1 kCallables$callSuspendBy$1;
        int i;
        if (continuation instanceof KCallables$callSuspendBy$1) {
            kCallables$callSuspendBy$1 = (KCallables$callSuspendBy$1) continuation;
            if ((kCallables$callSuspendBy$1.label & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspendBy$1.label -= Integer.MIN_VALUE;
                Object obj = kCallables$callSuspendBy$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kCallables$callSuspendBy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!kCallable.isSuspend()) {
                        return kCallable.callBy(map);
                    }
                    if (!(kCallable instanceof KFunction)) {
                        throw new IllegalArgumentException("Cannot callSuspendBy on a property " + kCallable + ": suspend properties are not supported yet");
                    }
                    KCallableImpl<?> asKCallableImpl = UtilKt.asKCallableImpl(kCallable);
                    if (asKCallableImpl == null) {
                        throw new KotlinReflectionInternalError("This callable does not support a default call: " + kCallable);
                    }
                    kCallables$callSuspendBy$1.L$0 = kCallable;
                    kCallables$callSuspendBy$1.L$1 = map;
                    kCallables$callSuspendBy$1.L$2 = asKCallableImpl;
                    kCallables$callSuspendBy$1.label = 1;
                    KCallables$callSuspendBy$1 kCallables$callSuspendBy$12 = kCallables$callSuspendBy$1;
                    obj = asKCallableImpl.callDefaultMethod$kotlin_reflection(map, kCallables$callSuspendBy$12);
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(kCallables$callSuspendBy$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kCallable = (KCallable) kCallables$callSuspendBy$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                KFunction kFunction = (KFunction) kCallable;
                return (Intrinsics.areEqual(kFunction.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class)) || kFunction.getReturnType().getIsMarkedNullable()) ? obj : Unit.INSTANCE;
            }
        }
        kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(continuation);
        Object obj2 = kCallables$callSuspendBy$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kCallables$callSuspendBy$1.label;
        if (i != 0) {
        }
        KFunction kFunction2 = (KFunction) kCallable;
        if (Intrinsics.areEqual(kFunction2.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class))) {
        }
    }
}
