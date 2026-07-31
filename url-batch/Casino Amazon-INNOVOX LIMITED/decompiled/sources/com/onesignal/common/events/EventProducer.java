package com.onesignal.common.events;

import android.R;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: EventProducer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J2\u0010\u0014\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0086@¢\u0006\u0002\u0010\u0018J2\u0010\u0019\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0086@¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onesignal/common/events/EventProducer;", "THandler", "Lcom/onesignal/common/events/IEventNotifier;", "()V", "hasSubscribers", "", "getHasSubscribers", "()Z", "subscribers", "", "fire", "", "callback", "Lkotlin/Function1;", "fireOnMain", "subscribe", "handler", "(Ljava/lang/Object;)V", "subscribeAll", Constants.MessagePayloadKeys.FROM, "suspendingFire", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendingFireOnMain", "unsubscribe", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class EventProducer<THandler> implements IEventNotifier<THandler> {
    private final List<THandler> subscribers;

    public EventProducer() {
        List<THandler> synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.subscribers = synchronizedList;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return CollectionsKt.any(this.subscribers);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(THandler handler) {
        synchronized (this.subscribers) {
            this.subscribers.add(handler);
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(THandler handler) {
        synchronized (this.subscribers) {
            this.subscribers.remove(handler);
        }
    }

    public final void subscribeAll(EventProducer<THandler> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        synchronized (this.subscribers) {
            Iterator<THandler> it = from.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void fire(Function1<? super THandler, Unit> callback) {
        List list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.subscribers) {
            list = CollectionsKt.toList(this.subscribers);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            callback.invoke((Object) it.next());
        }
    }

    public final void fireOnMain(Function1<? super THandler, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ThreadUtilsKt.suspendifyOnMain(new EventProducer$fireOnMain$1(this, callback, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(Function2<? super THandler, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        EventProducer$suspendingFire$1 eventProducer$suspendingFire$1;
        int i;
        List list;
        Function2<? super THandler, ? super Continuation<? super Unit>, ? extends Object> function22;
        Iterator it;
        if (continuation instanceof EventProducer$suspendingFire$1) {
            eventProducer$suspendingFire$1 = (EventProducer$suspendingFire$1) continuation;
            if ((eventProducer$suspendingFire$1.label & Integer.MIN_VALUE) != 0) {
                eventProducer$suspendingFire$1.label -= Integer.MIN_VALUE;
                Object obj = eventProducer$suspendingFire$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eventProducer$suspendingFire$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    synchronized (this.subscribers) {
                        list = CollectionsKt.toList(this.subscribers);
                    }
                    function22 = function2;
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) eventProducer$suspendingFire$1.L$1;
                    Function2<? super THandler, ? super Continuation<? super Unit>, ? extends Object> function23 = (Function2) eventProducer$suspendingFire$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function22 = function23;
                }
                while (it.hasNext()) {
                    R.anim animVar = (Object) it.next();
                    eventProducer$suspendingFire$1.L$0 = function22;
                    eventProducer$suspendingFire$1.L$1 = it;
                    eventProducer$suspendingFire$1.label = 1;
                    if (function22.invoke(animVar, eventProducer$suspendingFire$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        eventProducer$suspendingFire$1 = new EventProducer$suspendingFire$1(this, continuation);
        Object obj2 = eventProducer$suspendingFire$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eventProducer$suspendingFire$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public final Object suspendingFireOnMain(Function2<? super THandler, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new EventProducer$suspendingFireOnMain$2(this, function2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
