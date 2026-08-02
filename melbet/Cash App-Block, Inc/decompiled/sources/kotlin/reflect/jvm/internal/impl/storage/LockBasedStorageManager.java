package kotlin.reflect.jvm.internal.impl.storage;

import androidx.media3.common.FlagSet;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes9.dex */
public class LockBasedStorageManager implements StorageManager {
    public static final StorageManager NO_LOCKS;
    public static final String PACKAGE_NAME;
    public final String debugText;
    public final ExceptionHandlingStrategy exceptionHandlingStrategy;
    public final SimpleLock lock;

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$1, reason: invalid class name */
    public final class AnonymousClass1 extends LockBasedStorageManager {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        public final FlagSet.Builder recursionDetectedDefault(Object obj, String str) {
            return new FlagSet.Builder((Object) null, true, 11);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$5, reason: invalid class name */
    public final class AnonymousClass5 extends LockBasedLazyValue implements NotNullLazyValue {
        public final /* synthetic */ Function1 val$onRecursiveCall;
        public final /* synthetic */ Function1 val$postCompute;
        public volatile RealWebSocket$connect$1 valuePostCompute;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(format2);
            }
        }

        public static /* synthetic */ void $$$reportNull$$$0$kotlin$reflect$jvm$internal$impl$storage$LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function12) {
            super(lockBasedStorageManager, function0);
            this.val$onRecursiveCall = function1;
            this.val$postCompute = function12;
            if (function0 == null) {
                $$$reportNull$$$0$kotlin$reflect$jvm$internal$impl$storage$LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute(1);
                throw null;
            }
            this.valuePostCompute = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object invoke;
            RealWebSocket$connect$1 realWebSocket$connect$1 = this.valuePostCompute;
            if (realWebSocket$connect$1 == null || ((Thread) realWebSocket$connect$1.$request) != Thread.currentThread()) {
                invoke = super.invoke();
            } else if (((Thread) realWebSocket$connect$1.$request) == Thread.currentThread()) {
                invoke = realWebSocket$connect$1.this$0;
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("No value in this thread (hasValue should be checked before)");
                invoke = null;
            }
            if (invoke != null) {
                return invoke;
            }
            $$$reportNull$$$0$kotlin$reflect$jvm$internal$impl$storage$LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final void postCompute(Object obj) {
            this.valuePostCompute = new RealWebSocket$connect$1(obj);
            try {
                if (obj != null) {
                    this.val$postCompute.invoke(obj);
                } else {
                    $$$reportNull$$$0(2);
                    throw null;
                }
            } finally {
                this.valuePostCompute = null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final FlagSet.Builder recursionDetected(boolean z) {
            Function1 function1 = this.val$onRecursiveCall;
            return function1 == null ? super.recursionDetected(z) : new FlagSet.Builder(function1.invoke(Boolean.valueOf(z)), false, 11);
        }
    }

    public final class CacheWithNotNullValuesBasedOnMemoizedFunction extends CacheWithNullableValuesBasedOnMemoizedFunction implements CacheWithNotNullValues {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public final Object computeIfAbsent(Object obj, Function0 function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
                throw null;
            }
            Object invoke = invoke(new KeyWithComputation(obj, function0));
            if (invoke != null) {
                return invoke;
            }
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    public class CacheWithNullableValuesBasedOnMemoizedFunction extends MapBasedMemoizedFunction implements CacheWithNullableValues {

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction$1, reason: invalid class name */
        public final class AnonymousClass1 implements Function1 {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((KeyWithComputation) obj).computation.invoke();
            }
        }

        public CacheWithNullableValuesBasedOnMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new AnonymousClass1());
        }
    }

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new AnonymousClass1();

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$1, reason: invalid class name */
        public final class AnonymousClass1 implements ExceptionHandlingStrategy {
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            public final RuntimeException handleException(Throwable th) {
                if (th == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'throwable' of kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1.handleException must not be null");
                }
                throw ExceptionUtilsKt.rethrow(th);
            }
        }

        RuntimeException handleException(Throwable th);
    }

    public final class KeyWithComputation {
        public final Function0 computation;
        public final Object key;

        public KeyWithComputation(Object obj, Function0 function0) {
            this.key = obj;
            this.computation = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && KeyWithComputation.class == obj.getClass() && this.key.equals(((KeyWithComputation) obj).key);
        }

        public final int hashCode() {
            return this.key.hashCode();
        }
    }

    public class LockBasedLazyValue implements NullableLazyValue {
        public final Function0 computable;
        public final LockBasedStorageManager storageManager;
        public volatile Object value;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }

        public LockBasedLazyValue(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            if (function0 == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            this.value = NotValue.NOT_COMPUTED;
            this.storageManager = lockBasedStorageManager;
            this.computable = function0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke;
            NotValue notValue = NotValue.RECURSION_WAS_DETECTED;
            NotValue notValue2 = NotValue.COMPUTING;
            Object obj = this.value;
            if (!(obj instanceof NotValue)) {
                return WrappedValues.unescapeThrowable(obj);
            }
            this.storageManager.lock.lock();
            try {
                Object obj2 = this.value;
                if (obj2 instanceof NotValue) {
                    if (obj2 == notValue2) {
                        this.value = notValue;
                        FlagSet.Builder recursionDetected = recursionDetected(true);
                        if (!recursionDetected.buildCalled) {
                            invoke = recursionDetected.flags;
                        }
                    }
                    if (obj2 == notValue) {
                        FlagSet.Builder recursionDetected2 = recursionDetected(false);
                        if (!recursionDetected2.buildCalled) {
                            invoke = recursionDetected2.flags;
                        }
                    }
                    this.value = notValue2;
                    try {
                        invoke = this.computable.invoke();
                        postCompute(invoke);
                        this.value = invoke;
                    } catch (Throwable th) {
                        if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                            this.value = NotValue.NOT_COMPUTED;
                            throw th;
                        }
                        if (this.value == notValue2) {
                            this.value = WrappedValues.escapeThrowable(th);
                        }
                        throw this.storageManager.exceptionHandlingStrategy.handleException(th);
                    }
                } else {
                    invoke = WrappedValues.unescapeThrowable(obj2);
                }
                return invoke;
            } finally {
                this.storageManager.lock.unlock();
            }
        }

        public final boolean isComputed() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        public void postCompute(Object obj) {
        }

        public FlagSet.Builder recursionDetected(boolean z) {
            FlagSet.Builder recursionDetectedDefault = this.storageManager.recursionDetectedDefault(null, "in a lazy value");
            if (recursionDetectedDefault != null) {
                return recursionDetectedDefault;
            }
            $$$reportNull$$$0(2);
            throw null;
        }
    }

    public class LockBasedNotNullLazyValue extends LockBasedLazyValue implements NotNullLazyValue {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValue(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            super(lockBasedStorageManager, function0);
            if (function0 != null) {
            } else {
                $$$reportNull$$$0(1);
                throw null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            $$$reportNull$$$0(2);
            throw null;
        }
    }

    public class MapBasedMemoizedFunction implements MemoizedFunctionToNullable {
        public final ConcurrentMap cache;
        public final Function1 compute;
        public final LockBasedStorageManager storageManager;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }

        public MapBasedMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, Function1 function1) {
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
                throw null;
            }
            this.storageManager = lockBasedStorageManager;
            this.cache = concurrentMap;
            this.compute = function1;
        }

        public final AssertionError inconsistentComputingKey(Object obj, Object obj2) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + NotValue.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.storageManager);
            LockBasedStorageManager.sanitizeStackTrace(assertionError);
            return assertionError;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            AssertionError unableToRemoveKey;
            LockBasedStorageManager lockBasedStorageManager = this.storageManager;
            ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.exceptionHandlingStrategy;
            SimpleLock simpleLock = lockBasedStorageManager.lock;
            ConcurrentMap concurrentMap = this.cache;
            Object obj2 = concurrentMap.get(obj);
            NotValue notValue = NotValue.COMPUTING;
            if (obj2 != null && obj2 != notValue) {
                return WrappedValues.unescapeExceptionOrNull(obj2);
            }
            simpleLock.lock();
            try {
                Object obj3 = concurrentMap.get(obj);
                AssertionError assertionError = null;
                NotValue notValue2 = NotValue.RECURSION_WAS_DETECTED;
                if (obj3 == notValue) {
                    FlagSet.Builder recursionDetectedDefault = lockBasedStorageManager.recursionDetectedDefault(obj, "");
                    if (recursionDetectedDefault == null) {
                        $$$reportNull$$$0(3);
                        throw null;
                    }
                    if (!recursionDetectedDefault.buildCalled) {
                        return recursionDetectedDefault.flags;
                    }
                    obj3 = notValue2;
                }
                if (obj3 == notValue2) {
                    FlagSet.Builder recursionDetectedDefault2 = lockBasedStorageManager.recursionDetectedDefault(obj, "");
                    if (recursionDetectedDefault2 == null) {
                        $$$reportNull$$$0(3);
                        throw null;
                    }
                    if (!recursionDetectedDefault2.buildCalled) {
                        return recursionDetectedDefault2.flags;
                    }
                }
                if (obj3 != null) {
                    return WrappedValues.unescapeExceptionOrNull(obj3);
                }
                try {
                    concurrentMap.put(obj, notValue);
                    Object invoke = this.compute.invoke(obj);
                    Object put = concurrentMap.put(obj, WrappedValues.escapeNull(invoke));
                    if (put == notValue) {
                        return invoke;
                    }
                    assertionError = raceCondition(obj, put);
                    throw assertionError;
                } catch (Throwable th) {
                    if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                        try {
                            Object remove = concurrentMap.remove(obj);
                            if (remove != notValue) {
                                throw inconsistentComputingKey(obj, remove);
                            }
                            throw th;
                        } finally {
                        }
                    }
                    if (th == assertionError) {
                        try {
                            concurrentMap.remove(obj);
                            throw exceptionHandlingStrategy.handleException(th);
                        } finally {
                        }
                    }
                    Object put2 = concurrentMap.put(obj, WrappedValues.escapeThrowable(th));
                    if (put2 != notValue) {
                        throw raceCondition(obj, put2);
                    }
                    throw exceptionHandlingStrategy.handleException(th);
                }
            } finally {
                simpleLock.unlock();
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public final boolean isComputed(Object obj) {
            Object obj2 = this.cache.get(obj);
            return (obj2 == null || obj2 == NotValue.COMPUTING) ? false : true;
        }

        public final AssertionError raceCondition(Object obj, Object obj2) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.storageManager);
            LockBasedStorageManager.sanitizeStackTrace(assertionError);
            return assertionError;
        }

        public final AssertionError unableToRemoveKey(Object obj, Throwable th) {
            AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.storageManager, th);
            LockBasedStorageManager.sanitizeStackTrace(assertionError);
            return assertionError;
        }
    }

    public final class MapBasedMemoizedFunctionToNotNull extends MapBasedMemoizedFunction implements MemoizedFunctionToNotNull {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object invoke = super.invoke(obj);
            if (invoke != null) {
                return invoke;
            }
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NotValue {
        public static final /* synthetic */ NotValue[] $VALUES;
        public static final NotValue COMPUTING;
        public static final NotValue NOT_COMPUTED;
        public static final NotValue RECURSION_WAS_DETECTED;

        static {
            NotValue notValue = new NotValue("NOT_COMPUTED", 0);
            NOT_COMPUTED = notValue;
            NotValue notValue2 = new NotValue("COMPUTING", 1);
            COMPUTING = notValue2;
            NotValue notValue3 = new NotValue("RECURSION_WAS_DETECTED", 2);
            RECURSION_WAS_DETECTED = notValue3;
            $VALUES = new NotValue[]{notValue, notValue2, notValue3};
        }

        public static NotValue valueOf(String str) {
            return (NotValue) Enum.valueOf(NotValue.class, str);
        }

        public static NotValue[] values() {
            return (NotValue[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String format2;
        String str = (i == 10 || i == 13 || i == 20 || i == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 10 || i == 13 || i == 20 || i == 37) ? 2 : 3];
        if (i != 1 && i != 3 && i != 5) {
            if (i != 6) {
                switch (i) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21:
                        objArr[0] = "compute";
                        break;
                    case 10:
                    case 13:
                    case 20:
                    case 37:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case 15:
                    case 18:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case 33:
                        objArr[0] = "postCompute";
                        break;
                    case 35:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i != 10 || i == 13) {
                objArr[1] = "createMemoizedFunction";
            } else if (i == 20) {
                objArr[1] = "createMemoizedFunctionWithNullableValues";
            } else if (i != 37) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
            } else {
                objArr[1] = "sanitizeStackTrace";
            }
            switch (i) {
                case 4:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case 7:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    break;
                case 19:
                case 21:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case 30:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case 31:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case 33:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case 35:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format2 = String.format(str, objArr);
            if (i == 10 && i != 13 && i != 20 && i != 37) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i != 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i) {
        }
        format2 = String.format(str, objArr);
        if (i == 10) {
        }
        throw new IllegalStateException(format2);
    }

    static {
        String canonicalName = LockBasedStorageManager.class.getCanonicalName();
        canonicalName.getClass();
        int lastIndexOf$default = StringsKt.lastIndexOf$default(canonicalName, ".", 0, 6);
        PACKAGE_NAME = lastIndexOf$default == -1 ? "" : canonicalName.substring(0, lastIndexOf$default);
        NO_LOCKS = new AnonymousClass1("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);
    }

    public LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
        if (str == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (exceptionHandlingStrategy == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (simpleLock == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        this.lock = simpleLock;
        this.exceptionHandlingStrategy = exceptionHandlingStrategy;
        this.debugText = str;
    }

    public static void sanitizeStackTrace(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(PACKAGE_NAME)) {
                break;
            } else {
                i++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(34);
            throw null;
        }
        this.lock.lock();
        try {
            return (T) function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createLazyValue(Function0<? extends T> function0) {
        if (function0 != null) {
            return new LockBasedNotNullLazyValue(this, function0);
        }
        $$$reportNull$$$0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, Unit> function12) {
        if (function0 == null) {
            $$$reportNull$$$0(28);
            throw null;
        }
        if (function12 != null) {
            return new AnonymousClass5(this, function0, function1, function12);
        }
        $$$reportNull$$$0(29);
        throw null;
    }

    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(14);
            throw null;
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(15);
            throw null;
        }
        if (concurrentMap == null) {
            MapBasedMemoizedFunctionToNotNull.$$$reportNull$$$0(1);
            throw null;
        }
        if (function1 != null) {
            return new MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
        }
        MapBasedMemoizedFunctionToNotNull.$$$reportNull$$$0(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(19);
            throw null;
        }
        MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, new ConcurrentHashMap(3, 1.0f, 2));
        if (createMemoizedFunctionWithNullableValues != null) {
            return createMemoizedFunctionWithNullableValues;
        }
        $$$reportNull$$$0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NullableLazyValue<T> createNullableLazyValue(Function0<? extends T> function0) {
        if (function0 != null) {
            return new LockBasedLazyValue(this, function0);
        }
        $$$reportNull$$$0(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(Function0<? extends T> function0, final T t) {
        if (function0 == null) {
            $$$reportNull$$$0(26);
            throw null;
        }
        if (t != null) {
            return new LockBasedNotNullLazyValue(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.4
                @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
                public final FlagSet.Builder recursionDetected(boolean z) {
                    return new FlagSet.Builder(t, false, 11);
                }
            };
        }
        $$$reportNull$$$0(27);
        throw null;
    }

    public FlagSet.Builder recursionDetectedDefault(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : Boxes$$ExternalSyntheticOutline1.m("on input: ", obj));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        sanitizeStackTrace(assertionError);
        throw assertionError;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.debugText, ")");
    }

    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(21);
            throw null;
        }
        if (concurrentMap != null) {
            return new MapBasedMemoizedFunction(this, concurrentMap, function1);
        }
        $$$reportNull$$$0(22);
        throw null;
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(Function1<? super K, ? extends V> function1) {
        if (function1 != null) {
            MemoizedFunctionToNotNull<K, V> createMemoizedFunction = createMemoizedFunction(function1, new ConcurrentHashMap(3, 1.0f, 2));
            if (createMemoizedFunction != null) {
                return createMemoizedFunction;
            }
            $$$reportNull$$$0(10);
            throw null;
        }
        $$$reportNull$$$0(9);
        throw null;
    }
}
