package androidx.compose.runtime;

import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: MonotonicFrameClock.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"!\u0010\u0007\u001a\u00020\u00008FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "DefaultMonotonicFrameClock$delegate", "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/ActualAndroid_androidKt")
/* loaded from: classes15.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {
    private static final Lazy DefaultMonotonicFrameClock$delegate = LazyKt.lazy(new Function0() { // from class: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            MonotonicFrameClock DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt;
            DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt = ActualAndroid_androidKt__MonotonicFrameClock_androidKt.DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt();
            return DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MonotonicFrameClock DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
    }
}
