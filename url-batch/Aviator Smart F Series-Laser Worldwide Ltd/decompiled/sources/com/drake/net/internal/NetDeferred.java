package com.drake.net.internal;

import com.drake.net.exception.NetException;
import com.drake.net.exception.URLParseException;
import f6.l;
import f6.p;
import java.util.concurrent.CancellationException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.s;
import kotlin.sequences.m;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.selects.e;
import kotlinx.coroutines.t;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v;
import y5.g;

/* loaded from: classes3.dex */
public final class NetDeferred implements n0 {
    private final n0 deferred;

    public NetDeferred(n0 deferred) {
        s.checkNotNullParameter(deferred, "deferred");
        this.deferred = deferred;
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public t attachChild(v child) {
        s.checkNotNullParameter(child, "child");
        return this.deferred.attachChild(child);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object await(c cVar) {
        NetDeferred$await$1 netDeferred$await$1;
        Object coroutine_suspended;
        int i8;
        String str;
        String str2;
        Exception e8;
        if (cVar instanceof NetDeferred$await$1) {
            netDeferred$await$1 = (NetDeferred$await$1) cVar;
            int i9 = netDeferred$await$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                netDeferred$await$1.label = i9 - Integer.MIN_VALUE;
                Object obj = netDeferred$await$1.result;
                coroutine_suspended = b.getCOROUTINE_SUSPENDED();
                i8 = netDeferred$await$1.label;
                if (i8 != 0) {
                    g.throwOnFailure(obj);
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    s.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.getOrNull(stackTrace, 1);
                    if (stackTraceElement != null) {
                        str = " ...(" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
                    } else {
                        str = null;
                    }
                    try {
                        n0 n0Var = this.deferred;
                        netDeferred$await$1.L$0 = str;
                        netDeferred$await$1.label = 1;
                        obj = n0Var.await(netDeferred$await$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e9) {
                        str2 = str;
                        e8 = e9;
                        if (str2 == null) {
                        }
                        if (str2 != null) {
                            ((URLParseException) e8).setOccurred(str2);
                        }
                        throw e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) netDeferred$await$1.L$0;
                    try {
                        g.throwOnFailure(obj);
                    } catch (Exception e10) {
                        e8 = e10;
                        if (str2 == null && (e8 instanceof NetException)) {
                            ((NetException) e8).setOccurred(str2);
                        } else if (str2 != null && (e8 instanceof URLParseException)) {
                            ((URLParseException) e8).setOccurred(str2);
                        }
                        throw e8;
                    }
                }
                return obj;
            }
        }
        netDeferred$await$1 = new NetDeferred$await$1(this, cVar);
        Object obj2 = netDeferred$await$1.result;
        coroutine_suspended = b.getCOROUTINE_SUSPENDED();
        i8 = netDeferred$await$1.label;
        if (i8 != 0) {
        }
        return obj2;
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public /* synthetic */ void cancel() {
        this.deferred.cancel();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, p operation) {
        s.checkNotNullParameter(operation, "operation");
        return (R) this.deferred.fold(r8, operation);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b key) {
        s.checkNotNullParameter(key, "key");
        return (E) this.deferred.get(key);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public CancellationException getCancellationException() {
        return this.deferred.getCancellationException();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public m getChildren() {
        return this.deferred.getChildren();
    }

    @Override // kotlinx.coroutines.n0
    public Object getCompleted() {
        return this.deferred.getCompleted();
    }

    @Override // kotlinx.coroutines.n0
    public Throwable getCompletionExceptionOrNull() {
        return this.deferred.getCompletionExceptionOrNull();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return this.deferred.getKey();
    }

    @Override // kotlinx.coroutines.n0
    public e getOnAwait() {
        return this.deferred.getOnAwait();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public kotlinx.coroutines.selects.c getOnJoin() {
        return this.deferred.getOnJoin();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public abstract /* synthetic */ l1 getParent();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public u0 invokeOnCompletion(l handler) {
        s.checkNotNullParameter(handler, "handler");
        return this.deferred.invokeOnCompletion(handler);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public boolean isActive() {
        return this.deferred.isActive();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public boolean isCancelled() {
        return this.deferred.isCancelled();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public boolean isCompleted() {
        return this.deferred.isCompleted();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public Object join(c cVar) {
        return this.deferred.join(cVar);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b key) {
        s.checkNotNullParameter(key, "key");
        return this.deferred.minusKey(key);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        s.checkNotNullParameter(context, "context");
        return this.deferred.plus(context);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public boolean start() {
        return this.deferred.start();
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public void cancel(CancellationException cancellationException) {
        this.deferred.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public u0 invokeOnCompletion(boolean z7, boolean z8, l handler) {
        s.checkNotNullParameter(handler, "handler");
        return this.deferred.invokeOnCompletion(z7, z8, handler);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public l1 plus(l1 other) {
        s.checkNotNullParameter(other, "other");
        return this.deferred.plus(other);
    }

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    public /* synthetic */ boolean cancel(Throwable th) {
        return this.deferred.cancel(th);
    }
}
