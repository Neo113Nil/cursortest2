package kotlin;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\u0080\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\u0080\u0004\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\u0080\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "mode", "Lkotlin/LazyThreadSafetyMode;", "lock", "", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes.dex */
public class LazyKt__LazyJVMKt {
    public static <T> Lazy<T> lazy(LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends T> function0) {
        lazyThreadSafetyMode.getClass();
        function0.getClass();
        int ordinal = lazyThreadSafetyMode.ordinal();
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 2;
        if (ordinal == 0) {
            return new SynchronizedLazyImpl(function0, defaultConstructorMarker, i, defaultConstructorMarker);
        }
        if (ordinal == 1) {
            function0.getClass();
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.initializer = function0;
            safePublicationLazyImpl._value = UNINITIALIZED_VALUE.INSTANCE;
            return safePublicationLazyImpl;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        function0.getClass();
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.initializer = function0;
        unsafeLazyImpl._value = UNINITIALIZED_VALUE.INSTANCE;
        return unsafeLazyImpl;
    }

    public static <T> Lazy<T> lazy(Function0<? extends T> function0) {
        function0.getClass();
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new SynchronizedLazyImpl(function0, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final <T> Lazy<T> lazy(Object obj, Function0<? extends T> function0) {
        function0.getClass();
        return new SynchronizedLazyImpl(obj, function0);
    }
}
