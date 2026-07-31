package com.onesignal.otel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IOtelCrashReporter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/onesignal/otel/IOtelCrashReporter;", "", "saveCrash", "", "thread", "Ljava/lang/Thread;", "throwable", "", "(Ljava/lang/Thread;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNonFatal", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IOtelCrashReporter {
    Object saveCrash(Thread thread, Throwable th, Continuation<? super Unit> continuation);

    Object saveNonFatal(Thread thread, Throwable th, Continuation<? super Unit> continuation);
}
