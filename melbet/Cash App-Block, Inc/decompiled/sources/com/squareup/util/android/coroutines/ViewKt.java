package com.squareup.util.android.coroutines;

import android.view.View;
import android.view.ViewGroup;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.MarshalledEventSource;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.FlaggedClientSyncTransactorKt$plus$1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes4.dex */
public abstract class ViewKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.cash.clientsync.persistence.FlaggedClientSyncTransactorKt$plus$1] */
    public static final FlaggedClientSyncTransactorKt$plus$1 access$plus(final ClientSyncTransactor clientSyncTransactor, final ClientSyncTransactor clientSyncTransactor2) {
        clientSyncTransactor.getClass();
        return new ClientSyncTransactor() { // from class: com.squareup.cash.clientsync.persistence.FlaggedClientSyncTransactorKt$plus$1
            @Override // com.squareup.cash.clientsync.persistence.ClientSyncTransactor
            public final void transaction(Function1 function1) {
                ClientSyncTransactor.this.transaction(new FlaggedClientSyncTransactorKt$plus$1$$ExternalSyntheticLambda0(clientSyncTransactor2, function1, 1));
            }

            @Override // com.squareup.cash.clientsync.persistence.ClientSyncTransactor
            public final Object transactionWithResult(Function1 function1) {
                return ClientSyncTransactor.this.transactionWithResult(new FlaggedClientSyncTransactorKt$plus$1$$ExternalSyntheticLambda0(clientSyncTransactor2, function1, 0));
            }
        };
    }

    public static ViewEvent.Frustration fromJsonObject(JsonObject jsonObject) {
        try {
            return new ViewEvent.Frustration(jsonObject.get("count").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Frustration", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Frustration", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Frustration", e3);
            return null;
        }
    }

    public static JobImpl whileAttachedOnce$default(final ViewGroup viewGroup, Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        viewGroup.getClass();
        emptyCoroutineContext.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        HandlerContext handlerContext = MainDispatcherLoader.dispatcher.immediate;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final JobImpl Job$default = JobKt.Job$default();
        final MarshalledEventSource marshalledEventSource = new MarshalledEventSource(ref$ObjectRef, handlerContext, emptyCoroutineContext, new ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1(Job$default, function2, null, 0), 3);
        viewGroup.addOnAttachStateChangeListener(new OnAttachStateChangeListener() { // from class: com.squareup.util.android.coroutines.ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$2
            @Override // com.squareup.util.android.coroutines.OnAttachStateChangeListener
            public final void onAttached() {
                if (Job$default.isActive()) {
                    marshalledEventSource.invoke();
                }
            }

            @Override // com.squareup.util.android.coroutines.OnAttachStateChangeListener
            public final void onDetached() {
                viewGroup.removeOnAttachStateChangeListener(this);
                CoroutineScope coroutineScope = (CoroutineScope) Ref$ObjectRef.this.element;
                if (Job$default.isActive() && coroutineScope == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("job is active but scope is null");
                } else if (coroutineScope != null) {
                    JobKt.cancel(coroutineScope, (CancellationException) null);
                }
            }
        });
        if (viewGroup.isAttachedToWindow()) {
            marshalledEventSource.invoke();
        }
        return Job$default;
    }

    public static final Job whileEachAttached(View view, CoroutineContext coroutineContext, Function2 function2) {
        view.getClass();
        coroutineContext.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        HandlerContext handlerContext = MainDispatcherLoader.dispatcher.immediate;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final JobImpl Job$default = JobKt.Job$default();
        final MarshalledEventSource marshalledEventSource = new MarshalledEventSource(ref$ObjectRef, handlerContext, coroutineContext, new ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1(Job$default, function2, null, 1), 3);
        view.addOnAttachStateChangeListener(new OnAttachStateChangeListener() { // from class: com.squareup.util.android.coroutines.ViewKt$whileEachAttached$$inlined$whileAttachedOnce$2
            @Override // com.squareup.util.android.coroutines.OnAttachStateChangeListener
            public final void onAttached() {
                if (Job$default.isActive()) {
                    marshalledEventSource.invoke();
                }
            }

            @Override // com.squareup.util.android.coroutines.OnAttachStateChangeListener
            public final void onDetached() {
                CoroutineScope coroutineScope = (CoroutineScope) Ref$ObjectRef.this.element;
                if (Job$default.isActive() && coroutineScope == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("job is active but scope is null");
                } else if (coroutineScope != null) {
                    JobKt.cancel(coroutineScope, (CancellationException) null);
                }
            }
        });
        if (view.isAttachedToWindow()) {
            marshalledEventSource.invoke();
        }
        return Job$default;
    }
}
