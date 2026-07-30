package com.drake.net.scope;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.drake.net.utils.f;
import f6.l;
import f6.p;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.t0;
import y5.w;

/* loaded from: classes3.dex */
public class AndroidScope implements i0, Closeable {

    /* renamed from: catch, reason: not valid java name */
    private p f2catch;
    private final CoroutineContext coroutineContext;
    private final CoroutineDispatcher dispatcher;
    private final g0 exceptionHandler;

    /* renamed from: finally, reason: not valid java name */
    private p f3finally;
    private final g0 scopeGroup;

    public static final class a extends kotlin.coroutines.a implements g0 {
        final /* synthetic */ AndroidScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0.a aVar, AndroidScope androidScope) {
            super(aVar);
            this.this$0 = androidScope;
        }

        @Override // kotlinx.coroutines.g0
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            this.this$0.mo147catch(th);
        }
    }

    public AndroidScope() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ void cancel$default(AndroidScope androidScope, CancellationException cancellationException, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        androidScope.cancel(cancellationException);
    }

    public static /* synthetic */ AndroidScope catch$default(AndroidScope androidScope, p pVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: catch");
        }
        if ((i8 & 1) != 0) {
            pVar = new p() { // from class: com.drake.net.scope.AndroidScope$catch$1
                public final void invoke(AndroidScope androidScope2, Throwable it) {
                    s.checkNotNullParameter(androidScope2, "$this$null");
                    s.checkNotNullParameter(it, "it");
                }

                @Override // f6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((AndroidScope) obj2, (Throwable) obj3);
                    return w.INSTANCE;
                }
            };
        }
        return androidScope.m146catch(pVar);
    }

    public static /* synthetic */ AndroidScope finally$default(AndroidScope androidScope, p pVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finally");
        }
        if ((i8 & 1) != 0) {
            pVar = new p() { // from class: com.drake.net.scope.AndroidScope$finally$1
                public final void invoke(AndroidScope androidScope2, Throwable th) {
                    s.checkNotNullParameter(androidScope2, "$this$null");
                }

                @Override // f6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((AndroidScope) obj2, (Throwable) obj3);
                    return w.INSTANCE;
                }
            };
        }
        return androidScope.m148finally(pVar);
    }

    public void cancel(CancellationException cancellationException) {
        l1 l1Var = (l1) getCoroutineContext().get(l1.Key);
        if (l1Var != null) {
            l1Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
    }

    /* renamed from: catch, reason: not valid java name */
    public AndroidScope m146catch(p block) {
        s.checkNotNullParameter(block, "block");
        this.f2catch = block;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cancel$default(this, null, 1, null);
    }

    /* renamed from: finally, reason: not valid java name */
    public AndroidScope m148finally(p block) {
        s.checkNotNullParameter(block, "block");
        this.f3finally = block;
        return this;
    }

    protected final p getCatch() {
        return this.f2catch;
    }

    @Override // kotlinx.coroutines.i0
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    protected final p getFinally() {
        return this.f3finally;
    }

    public final g0 getScopeGroup() {
        return this.scopeGroup;
    }

    public void handleError(Throwable e8) {
        s.checkNotNullParameter(e8, "e");
        com.drake.net.a.debug(e8);
    }

    public AndroidScope launch(p block) {
        l1 launch$default;
        s.checkNotNullParameter(block, "block");
        launch$default = i.launch$default(this, EmptyCoroutineContext.INSTANCE, null, new AndroidScope$launch$1(block, null), 2, null);
        launch$default.invokeOnCompletion(new l() { // from class: com.drake.net.scope.AndroidScope$launch$2
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                AndroidScope.this.mo149finally(th);
            }
        });
        return this;
    }

    protected final void setCatch(p pVar) {
        this.f2catch = pVar;
    }

    protected final void setFinally(p pVar) {
        this.f3finally = pVar;
    }

    public AndroidScope(final LifecycleOwner lifecycleOwner, final Lifecycle.Event lifeEvent, CoroutineDispatcher dispatcher) {
        s.checkNotNullParameter(lifeEvent, "lifeEvent");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        f.runMain(new f6.a() { // from class: com.drake.net.scope.AndroidScope.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m150invoke();
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m150invoke() {
                Lifecycle lifecycle;
                LifecycleOwner lifecycleOwner2 = LifecycleOwner.this;
                if (lifecycleOwner2 == null || (lifecycle = lifecycleOwner2.getLifecycle()) == null) {
                    return;
                }
                final Lifecycle.Event event = lifeEvent;
                final AndroidScope androidScope = this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.scope.AndroidScope.1.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event2) {
                        s.checkNotNullParameter(source, "source");
                        s.checkNotNullParameter(event2, "event");
                        if (Lifecycle.Event.this == event2) {
                            AndroidScope.cancel$default(androidScope, null, 1, null);
                        }
                    }
                });
            }
        });
        a aVar = new a(g0.Key, this);
        this.exceptionHandler = aVar;
        this.scopeGroup = aVar;
        this.coroutineContext = dispatcher.plus(aVar).plus(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null));
    }

    public static /* synthetic */ void cancel$default(AndroidScope androidScope, String str, Throwable th, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i8 & 2) != 0) {
            th = null;
        }
        androidScope.cancel(str, th);
    }

    /* renamed from: catch, reason: not valid java name */
    protected void mo147catch(Throwable e8) {
        w wVar;
        s.checkNotNullParameter(e8, "e");
        p pVar = this.f2catch;
        if (pVar != null) {
            pVar.invoke(this, e8);
            wVar = w.INSTANCE;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            handleError(e8);
        }
    }

    /* renamed from: finally, reason: not valid java name */
    protected void mo149finally(Throwable th) {
        p pVar = this.f3finally;
        if (pVar != null) {
            pVar.invoke(this, th);
        }
    }

    public void cancel(String message, Throwable th) {
        s.checkNotNullParameter(message, "message");
        cancel(d1.CancellationException(message, th));
    }

    public /* synthetic */ AndroidScope(LifecycleOwner lifecycleOwner, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : lifecycleOwner, (i8 & 2) != 0 ? Lifecycle.Event.ON_DESTROY : event, (i8 & 4) != 0 ? t0.getMain() : coroutineDispatcher);
    }
}
