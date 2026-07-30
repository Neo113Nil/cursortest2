package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RoostBeacon.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostBeacon;", "", "<init>", "()V", "initialized", "", "activate", "", "context", "Landroid/content/Context;", "key", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostBeacon {
    private static volatile boolean initialized;
    public static final RoostBeacon INSTANCE = new RoostBeacon();
    public static final int $stable = 8;

    private RoostBeacon() {
    }

    public final Object activate(Context context, String str, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new RoostBeacon$activate$2(context, str, null), continuation);
    }
}
