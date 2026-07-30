package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import androidx.lifecycle.CoroutineLiveDataKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: RoostReferrer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostReferrer;", "", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "read", "", "timeoutMs", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostReferrer {
    public static final int $stable = 8;
    private final Context appContext;

    public RoostReferrer(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    public static /* synthetic */ Object read$default(RoostReferrer roostReferrer, long j, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        }
        return roostReferrer.read(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(long j, Continuation<? super String> continuation) {
        RoostReferrer$read$1 roostReferrer$read$1;
        int i;
        if (continuation instanceof RoostReferrer$read$1) {
            roostReferrer$read$1 = (RoostReferrer$read$1) continuation;
            if ((roostReferrer$read$1.label & Integer.MIN_VALUE) != 0) {
                roostReferrer$read$1.label -= Integer.MIN_VALUE;
                Object obj = roostReferrer$read$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roostReferrer$read$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RoostReferrer$read$2 roostReferrer$read$2 = new RoostReferrer$read$2(this, null);
                    roostReferrer$read$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(j, roostReferrer$read$2, roostReferrer$read$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                return str != null ? "" : str;
            }
        }
        roostReferrer$read$1 = new RoostReferrer$read$1(this, continuation);
        Object obj2 = roostReferrer$read$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roostReferrer$read$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }
}
