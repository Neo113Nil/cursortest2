package com.chicken.road.kedbags.data.device;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: FrostSignalCollector.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\nH\u0083@¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\bJ,\u0010\r\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0082@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/chicken/road/kedbags/data/device/FrostSignalCollector;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "collect", "Lcom/chicken/road/kedbags/data/device/FrostSignals;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readHookRune", "", "readPerchWhisper", "readIceLantern", "guarded", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrostSignalCollector {
    public static final int $stable = 8;
    private final Context context;

    public FrostSignalCollector(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Object collect(Continuation<? super FrostSignals> continuation) {
        return CoroutineScopeKt.coroutineScope(new FrostSignalCollector$collect$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readHookRune(Continuation<? super String> continuation) {
        return guarded(new FrostSignalCollector$readHookRune$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readPerchWhisper(Continuation<? super String> continuation) {
        return guarded(new FrostSignalCollector$readPerchWhisper$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readIceLantern(Continuation<? super String> continuation) {
        return guarded(new FrostSignalCollector$readIceLantern$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object guarded(Function1<? super Continuation<? super String>, ? extends Object> function1, Continuation<? super String> continuation) {
        FrostSignalCollector$guarded$1 frostSignalCollector$guarded$1;
        int i;
        try {
            if (continuation instanceof FrostSignalCollector$guarded$1) {
                frostSignalCollector$guarded$1 = (FrostSignalCollector$guarded$1) continuation;
                if ((frostSignalCollector$guarded$1.label & Integer.MIN_VALUE) != 0) {
                    frostSignalCollector$guarded$1.label -= Integer.MIN_VALUE;
                    Object obj = frostSignalCollector$guarded$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = frostSignalCollector$guarded$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        frostSignalCollector$guarded$1.L$0 = SpillingKt.nullOutSpilledVariable(function1);
                        frostSignalCollector$guarded$1.label = 1;
                        obj = function1.invoke(frostSignalCollector$guarded$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (String) obj;
                }
            }
            if (i != 0) {
            }
            return (String) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
        frostSignalCollector$guarded$1 = new FrostSignalCollector$guarded$1(this, continuation);
        Object obj2 = frostSignalCollector$guarded$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = frostSignalCollector$guarded$1.label;
    }
}
