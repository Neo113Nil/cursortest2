package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import o2.InterfaceC3320b0;
import o2.InterfaceC3354t;
import o2.InterfaceC3358v;
import o2.InterfaceC3359v0;
import o2.InterfaceC3360w;
import o2.Q;
import w2.InterfaceC3507a;
import w2.InterfaceC3509c;

/* loaded from: classes.dex */
public final class zzbw implements Q {
    private final /* synthetic */ InterfaceC3360w zza;

    zzbw(InterfaceC3360w interfaceC3360w) {
        this.zza = interfaceC3360w;
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3354t attachChild(InterfaceC3358v interfaceC3358v) {
        return this.zza.attachChild(interfaceC3358v);
    }

    @Override // o2.Q
    public final Object await(d dVar) {
        return this.zza.await(dVar);
    }

    @Override // o2.InterfaceC3359v0
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.b bVar) {
        return this.zza.get(bVar);
    }

    @Override // o2.InterfaceC3359v0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // o2.InterfaceC3359v0
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // o2.Q
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // o2.Q
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.b getKey() {
        return this.zza.getKey();
    }

    @Override // o2.Q
    public final InterfaceC3509c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3507a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3359v0 getParent() {
        return this.zza.getParent();
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3320b0 invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // o2.InterfaceC3359v0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // o2.InterfaceC3359v0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // o2.InterfaceC3359v0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // o2.InterfaceC3359v0
    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.zza.minusKey(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // o2.InterfaceC3359v0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // o2.InterfaceC3359v0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3320b0 invokeOnCompletion(boolean z4, boolean z5, Function1 function1) {
        return this.zza.invokeOnCompletion(z4, z5, function1);
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3359v0 plus(InterfaceC3359v0 interfaceC3359v0) {
        return this.zza.plus(interfaceC3359v0);
    }

    @Override // o2.InterfaceC3359v0
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
