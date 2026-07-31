package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.hj;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes10.dex */
public final class ij {
    public final hj a;
    public final List b;
    public final CoroutineDispatcher c;
    public final AtomicBoolean d;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ej ejVar, Continuation continuation) {
            return ((a) create(ejVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ej ejVar = (ej) this.c;
                this.b = 1;
                c = com.chartboost.sdk.internal.clickthrough.b.c(ejVar, null, null, null, null, this, 30, null);
                if (c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(c);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ej ejVar, Continuation continuation) {
            return ((b) create(ejVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ej ejVar = (ej) this.c;
                this.b = 1;
                a = com.chartboost.sdk.internal.clickthrough.b.a(ejVar, null, null, null, null, null, this, 62, null);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(a);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ej ejVar, Continuation continuation) {
            return ((c) create(ejVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ej ejVar = (ej) this.c;
                this.b = 1;
                a = com.chartboost.sdk.internal.clickthrough.b.a(ejVar, null, null, null, null, this, 30, null);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(a);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ej ejVar, Continuation continuation) {
            return ((d) create(ejVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ej ejVar = (ej) this.c;
                this.b = 1;
                b = com.chartboost.sdk.internal.clickthrough.b.b(ejVar, null, null, null, null, this, 30, null);
                if (b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                b = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(b);
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a = ij.this.a((Function2) null, (ej) null, (q4) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return ij.this.a((ej) null, (q4) null, this);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ q4 e;
        public final /* synthetic */ m4 f;
        public final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, q4 q4Var, m4 m4Var, boolean z, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = q4Var;
            this.f = m4Var;
            this.g = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ij.this.new g(this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ij ijVar = ij.this;
                    Object a = ijVar.a(hj.a(ijVar.a, this.d, 0, 2, null), this.d, this.e);
                    String str2 = this.d;
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
                    if (m8026exceptionOrNullimpl == null) {
                        str = (String) a;
                    } else {
                        if (m8026exceptionOrNullimpl instanceof hj.b.e) {
                            str2 = ((hj.b.e) m8026exceptionOrNullimpl).a();
                        }
                        str = str2;
                    }
                    ej ejVar = new ej(str, this.f, this.g);
                    ij ijVar2 = ij.this;
                    q4 q4Var = this.e;
                    this.b = 1;
                    if (ijVar2.a(ejVar, q4Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ij.this.d.set(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ij.this.d.set(false);
                throw th;
            }
        }
    }

    public ij(hj urlRedirect, List actions, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(urlRedirect, "urlRedirect");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = urlRedirect;
        this.b = actions;
        this.c = ioDispatcher;
        this.d = new AtomicBoolean(false);
    }

    public /* synthetic */ ij(hj hjVar, List list, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hjVar, (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new Function2[]{new a(null), new b(null), new c(null), new d(null)}) : list, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, ej ejVar, q4 q4Var, Continuation continuation) {
        e eVar;
        int i;
        Object value;
        Throwable m8026exceptionOrNullimpl;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f = i2 - Integer.MIN_VALUE;
                Object obj = eVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    eVar.b = ejVar;
                    eVar.c = q4Var;
                    eVar.f = 1;
                    obj = function2.invoke(ejVar, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q4Var = (q4) eVar.c;
                    ejVar = (ej) eVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.m8029isSuccessimpl(value)) {
                    dj djVar = (dj) value;
                    if (q4Var != null) {
                        q4Var.a("Url " + ejVar.b() + " opened with action " + djVar.a());
                    }
                    xb.a("Url " + ejVar.b() + " opened with action " + djVar.a(), (Throwable) null, 2, (Object) null);
                }
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
                if (m8026exceptionOrNullimpl != null && !(m8026exceptionOrNullimpl instanceof com.chartboost.sdk.internal.clickthrough.a)) {
                    if (q4Var != null) {
                        q4Var.b("Url " + ejVar.b() + " opening failed with error " + m8026exceptionOrNullimpl);
                    }
                    xb.b("Url " + ejVar.b() + " opening failed with error " + m8026exceptionOrNullimpl, (Throwable) null, 2, (Object) null);
                }
                return value;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.f;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (Result.m8029isSuccessimpl(value)) {
        }
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
        if (m8026exceptionOrNullimpl != null) {
            if (q4Var != null) {
            }
            xb.b("Url " + ejVar.b() + " opening failed with error " + m8026exceptionOrNullimpl, (Throwable) null, 2, (Object) null);
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008b -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ej ejVar, q4 q4Var, Continuation continuation) {
        f fVar;
        int i;
        Object m8023constructorimpl;
        ij ijVar;
        ej ejVar2;
        Iterator it;
        q4 q4Var2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.h = i2 - Integer.MIN_VALUE;
                Object obj = fVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fVar.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = this.b;
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(new Exception()));
                    ijVar = this;
                    ejVar2 = ejVar;
                    it = list.iterator();
                    q4Var2 = q4Var;
                    while (it.hasNext()) {
                    }
                    if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) fVar.e;
                q4 q4Var3 = (q4) fVar.d;
                ej ejVar3 = (ej) fVar.c;
                ijVar = (ij) fVar.b;
                ResultKt.throwOnFailure(obj);
                Object obj2 = ((Result) obj).getValue();
                Object obj3 = obj2;
                q4Var2 = q4Var3;
                ejVar2 = ejVar3;
                m8023constructorimpl = obj3;
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) == null) {
                    } else {
                        fVar.b = ijVar;
                        fVar.c = ejVar2;
                        fVar.d = q4Var2;
                        fVar.e = it;
                        fVar.h = 1;
                        Object a2 = ijVar.a(function2, ejVar2, q4Var2, fVar);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ejVar3 = ejVar2;
                        q4Var3 = q4Var2;
                        obj2 = a2;
                        Object obj32 = obj2;
                        q4Var2 = q4Var3;
                        ejVar2 = ejVar3;
                        m8023constructorimpl = obj32;
                        while (it.hasNext()) {
                        }
                    }
                }
                if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                    if (q4Var2 != null) {
                        q4Var2.b("None of the actions was able to process URL " + ejVar2.b());
                    }
                    xb.b("None of the actions was able to process URL " + ejVar2.b(), (Throwable) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }
        fVar = new f(continuation);
        Object obj4 = fVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fVar.h;
        if (i != 0) {
        }
    }

    public final CBError.Click a(String str, m4 clkp, q4 q4Var, boolean z) {
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        if (str != null && str.length() != 0) {
            if (!this.d.compareAndSet(false, true)) {
                xb.a("Clickthrough already in-flight; dropping " + str, (Throwable) null, 2, (Object) null);
                return null;
            }
            xb.a("Resolving url: " + str + ", clickPreference: " + clkp + ", userGesture: " + z, (Throwable) null, 2, (Object) null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.c), null, null, new g(str, q4Var, clkp, z, null), 3, null);
            return null;
        }
        xb.e("Url is null or empty.", null, 2, null);
        return CBError.Click.URI_INVALID;
    }

    public final Object a(Object obj, String str, q4 q4Var) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        if (m8026exceptionOrNullimpl == null) {
            String str2 = (String) obj;
            if (q4Var != null) {
                q4Var.a("Redirection successful from " + str + " to " + str2);
            }
            xb.a("Redirection successful from " + str + " to " + str2, (Throwable) null, 2, (Object) null);
        } else {
            if (q4Var != null) {
                q4Var.b("Redirection failed for " + str + ": " + m8026exceptionOrNullimpl);
            }
            xb.e("Redirection failed for " + str + ": " + m8026exceptionOrNullimpl, null, 2, null);
        }
        return obj;
    }
}
