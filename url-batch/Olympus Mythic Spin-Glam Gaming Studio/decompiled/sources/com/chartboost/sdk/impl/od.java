package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes11.dex */
public final class od extends vf implements zf {
    public final List d;
    public final a0 e;
    public final boolean f;
    public final CoroutineScope g;
    public final CoroutineScope h;
    public Job i;
    public final String j;
    public final List k;
    public final Set l;
    public int m;
    public m2 n;
    public float o;
    public boolean p;
    public boolean q;

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a = od.this.a((Context) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(m2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public static final d b = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(m2 renderable) {
            Intrinsics.checkNotNullParameter(renderable, "renderable");
            return renderable.getClass().getSimpleName() + "(optional=" + renderable.w().m() + ")";
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a = od.this.a(null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List d;
        public final /* synthetic */ od e;
        public final /* synthetic */ Context f;

        public static final class a extends SuspendLambda implements Function2 {
            public Object b;
            public int c;
            public final /* synthetic */ m2 d;
            public final /* synthetic */ od e;
            public final /* synthetic */ Context f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m2 m2Var, od odVar, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = m2Var;
                this.e = odVar;
                this.f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                m2 m2Var;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.d.a(this.e);
                    m2 m2Var2 = this.d;
                    Context context = this.f;
                    this.b = m2Var2;
                    this.c = 1;
                    Object a = m2Var2.a(context, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m2Var = m2Var2;
                    obj2 = a;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m2Var = (m2) this.b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).getValue();
                }
                return TuplesKt.to(m2Var, Result.m8022boximpl(obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, od odVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = odVar;
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.d, this.e, this.f, continuation);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List list = this.d;
                od odVar = this.e;
                Context context = this.f;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((m2) it.next(), odVar, context, null), 3, null);
                    arrayList.add(async$default);
                }
                this.b = 1;
                obj = AwaitKt.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ m2 c;
        public final /* synthetic */ od d;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m2 m2Var, od odVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.c = m2Var;
            this.d = odVar;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c.a(this.d);
                m2 m2Var = this.c;
                Context context = this.e;
                this.b = 1;
                a = m2Var.a(context, this);
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

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ List c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ od e;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ List d;
            public final /* synthetic */ Context e;
            public final /* synthetic */ od f;

            /* renamed from: com.chartboost.sdk.impl.od$h$a$a, reason: collision with other inner class name */
            public static final class C0228a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ m2 c;
                public final /* synthetic */ Context d;
                public final /* synthetic */ od e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0228a(m2 m2Var, Context context, od odVar, Continuation continuation) {
                    super(2, continuation);
                    this.c = m2Var;
                    this.d = context;
                    this.e = odVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0228a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0228a(this.c, this.d, this.e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            m2 m2Var = this.c;
                            Context context = this.d;
                            this.b = 1;
                            a = m2Var.a(context, this);
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
                        if (Result.m8028isFailureimpl(a)) {
                            xb.e(X3.j.d + this.e.j + "] Optional renderable background load failed: type=" + this.c.getClass().getSimpleName() + ", auctionId=" + this.e.q().c(), Result.m8026exceptionOrNullimpl(a));
                        } else {
                            this.e.v().add(this.c);
                            xb.a(X3.j.d + this.e.j + "] Optional renderable loaded in background: type=" + this.c.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
                            this.c.a(this.d);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        xb.b(X3.j.d + this.e.j + "] Optional renderable background load exception: type=" + this.c.getClass().getSimpleName() + ", auctionId=" + this.e.q().c(), e2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, Context context, od odVar, Continuation continuation) {
                super(2, continuation);
                this.d = list;
                this.e = context;
                this.f = odVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.d, this.e, this.f, continuation);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List list = this.d;
                Context context = this.e;
                od odVar = this.f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0228a((m2) it.next(), context, odVar, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, Context context, od odVar, Continuation continuation) {
            super(2, continuation);
            this.c = list;
            this.d = context;
            this.e = odVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.c, this.d, this.e, null);
                this.b = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object b = od.this.b(null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8022boximpl(b);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List d;
        public final /* synthetic */ Context e;

        public static final class a extends SuspendLambda implements Function2 {
            public Object b;
            public int c;
            public final /* synthetic */ m2 d;
            public final /* synthetic */ Context e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m2 m2Var, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = m2Var;
                this.e = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                m2 m2Var;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    m2 m2Var2 = this.d;
                    Context context = this.e;
                    this.b = m2Var2;
                    this.c = 1;
                    Object a = m2Var2.a(context, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m2Var = m2Var2;
                    obj2 = a;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m2Var = (m2) this.b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).getValue();
                }
                return TuplesKt.to(m2Var, Result.m8022boximpl(obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.d, this.e, continuation);
            jVar.c = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List list = this.d;
                Context context = this.e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((m2) it.next(), context, null), 3, null);
                    arrayList.add(async$default);
                }
                this.b = 1;
                obj = AwaitKt.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final class k extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a = od.this.a((Context) null, (List) null, (List) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List d;
        public final /* synthetic */ od e;
        public final /* synthetic */ Context f;

        public static final class a extends SuspendLambda implements Function2 {
            public Object b;
            public int c;
            public final /* synthetic */ m2 d;
            public final /* synthetic */ od e;
            public final /* synthetic */ Context f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m2 m2Var, od odVar, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = m2Var;
                this.e = odVar;
                this.f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                m2 m2Var;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.d.a(this.e);
                    m2 m2Var2 = this.d;
                    Context context = this.f;
                    this.b = m2Var2;
                    this.c = 1;
                    Object a = m2Var2.a(context, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m2Var = m2Var2;
                    obj2 = a;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m2Var = (m2) this.b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).getValue();
                }
                return TuplesKt.to(m2Var, Result.m8022boximpl(obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List list, od odVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = odVar;
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            l lVar = new l(this.d, this.e, this.f, continuation);
            lVar.c = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List list = this.d;
                od odVar = this.e;
                Context context = this.f;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((m2) it.next(), odVar, context, null), 3, null);
                    arrayList.add(async$default);
                }
                this.b = 1;
                obj = AwaitKt.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ List c;
        public final /* synthetic */ od d;
        public final /* synthetic */ Context e;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ List d;
            public final /* synthetic */ od e;
            public final /* synthetic */ Context f;

            /* renamed from: com.chartboost.sdk.impl.od$m$a$a, reason: collision with other inner class name */
            public static final class C0229a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ Deferred c;
                public final /* synthetic */ od d;
                public final /* synthetic */ m2 e;
                public final /* synthetic */ Context f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0229a(Deferred deferred, od odVar, m2 m2Var, Context context, Continuation continuation) {
                    super(2, continuation);
                    this.c = deferred;
                    this.d = odVar;
                    this.e = m2Var;
                    this.f = context;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0229a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0229a(this.c, this.d, this.e, this.f, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Deferred deferred = this.c;
                            this.b = 1;
                            obj = deferred.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Object value = ((Result) obj).getValue();
                        if (Result.m8028isFailureimpl(value)) {
                            xb.e(X3.j.d + this.d.j + "] Optional renderable concurrent load failed: type=" + this.e.getClass().getSimpleName() + ", auctionId=" + this.d.q().c(), Result.m8026exceptionOrNullimpl(value));
                        } else {
                            this.d.v().add(this.e);
                            xb.a(X3.j.d + this.d.j + "] Optional renderable loaded (concurrent): type=" + this.e.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
                            this.e.a(this.f);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        xb.b(X3.j.d + this.d.j + "] Optional renderable concurrent load exception: type=" + this.e.getClass().getSimpleName() + ", auctionId=" + this.d.q().c(), e2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, od odVar, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = list;
                this.e = odVar;
                this.f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.d, this.e, this.f, continuation);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List<Pair> list = this.d;
                od odVar = this.e;
                Context context = this.f;
                for (Pair pair : list) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0229a((Deferred) pair.component2(), odVar, (m2) pair.component1(), context, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List list, od odVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.c = list;
            this.d = odVar;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.c, this.d, this.e, null);
                this.b = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public od(List renderables, a0 adMarkupConfig, boolean z, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(renderables, "renderables");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.d = renderables;
        this.e = adMarkupConfig;
        this.f = z;
        this.g = coroutineScope;
        this.h = coroutineScope;
        this.j = Integer.toHexString(System.identityHashCode(this));
        this.k = Collections.synchronizedList(new ArrayList());
        this.l = Collections.synchronizedSet(new LinkedHashSet());
        this.m = -1;
        this.o = 1.0f;
        this.q = z;
    }

    public final List w() {
        return this.d;
    }

    public final a0 q() {
        return this.e;
    }

    public static final class a {
        public final m2 a;
        public final Deferred b;
        public final boolean c;

        public a(m2 renderable, Deferred job, boolean z) {
            Intrinsics.checkNotNullParameter(renderable, "renderable");
            Intrinsics.checkNotNullParameter(job, "job");
            this.a = renderable;
            this.b = job;
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            return "RenderableJob(renderable=" + this.a + ", job=" + this.b + ", isOptional=" + this.c + ")";
        }

        public final m2 b() {
            return this.a;
        }

        public final Deferred a() {
            return this.b;
        }
    }

    public final Set v() {
        return this.l;
    }

    public final int u() {
        return this.m;
    }

    public final m2 t() {
        return this.n;
    }

    public final boolean x() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.chartboost.sdk.impl.od, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.chartboost.sdk.impl.od] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.chartboost.sdk.impl.od] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.chartboost.sdk.impl.od$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // com.chartboost.sdk.impl.vf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        ?? r3;
        ?? r5;
        Result result;
        String message;
        Object a2;
        try {
            if (continuation instanceof b) {
                b bVar = (b) continuation;
                int i2 = bVar.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.g = i2 - Integer.MIN_VALUE;
                    r3 = bVar;
                    Object obj = r3.e;
                    ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = r3.g;
                    if (r5 == 0) {
                        try {
                            if (r5 == 1) {
                                List list = (List) r3.d;
                                List list2 = (List) r3.c;
                                od odVar = (od) r3.b;
                                ResultKt.throwOnFailure(obj);
                                result = (Result) obj;
                                r3 = odVar;
                                coroutine_suspended = list;
                                r5 = list2;
                            } else {
                                if (r5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                List list3 = (List) r3.d;
                                List list4 = (List) r3.c;
                                od odVar2 = (od) r3.b;
                                ResultKt.throwOnFailure(obj);
                                result = (Result) obj;
                                r3 = odVar2;
                                coroutine_suspended = list3;
                                r5 = list4;
                            }
                            return result.getValue();
                        } catch (ChartboostError.Load e2) {
                            e = e2;
                            xb.b(X3.j.d + r3.j + "] MultiRenderable load failed: auctionId=" + r3.e.c() + ", errorCode=" + e.getCode() + ", errorConstant=" + e.getConstant(), e);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e));
                        } catch (Exception e3) {
                            e = e3;
                            xb.b(X3.j.d + r3.j + "] MultiRenderable unexpected exception during load: auctionId=" + r3.e.c(), e);
                            String a3 = w7.a(e, 5);
                            String simpleName = e.getClass().getSimpleName();
                            message = e.getMessage();
                            if (message == null) {
                            }
                            if (r3.e.h() != sb.e) {
                            }
                            int size = r5.size();
                            int size2 = coroutine_suspended.size();
                            String joinToString$default = CollectionsKt.joinToString$default(r3.d, StringUtils.COMMA, null, null, 0, null, d.b, 30, null);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Unexpected exception during renderable loading: " + message + " ExceptionType=" + simpleName + " LoadingStrategy=" + r9 + " CriticalCount=" + size + " OptionalCount=" + size2 + " Renderables=[" + joinToString$default + "] Thread=" + Thread.currentThread().getName() + " StackTrace=[" + a3 + X3.j.e, e)));
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                    xb.a(X3.j.d + this.j + "] Load started: auctionId=" + this.e.c() + ", renderableCount=" + this.d.size() + ", loadMode=" + this.e.h(), (Throwable) null, 2, (Object) null);
                    this.l.clear();
                    if (this.d.isEmpty()) {
                        xb.b(X3.j.d + this.j + "] Load failed - no renderable units: auctionId=" + this.e.c(), (Throwable) null, 2, (Object) null);
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Internal("Ad markup contains no renderable units.", new IllegalStateException())));
                    }
                    List list5 = this.d;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list5) {
                        if (!((m2) obj2).w().m()) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    Pair pair = new Pair(arrayList, arrayList2);
                    List list6 = (List) pair.component1();
                    List list7 = (List) pair.component2();
                    xb.a(X3.j.d + this.j + "] Renderables partitioned: criticalCount=" + list6.size() + ", optionalCount=" + list7.size() + ", types=[" + CollectionsKt.joinToString$default(this.d, StringUtils.COMMA, null, null, 0, null, c.b, 30, null) + X3.j.e, (Throwable) null, 2, (Object) null);
                    try {
                        if (this.e.h() == sb.e) {
                            r3.b = this;
                            r3.c = list6;
                            r3.d = list7;
                            r3.g = 1;
                            a2 = a(context, list6, list7, r3);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            r3.b = this;
                            r3.c = list6;
                            r3.d = list7;
                            r3.g = 2;
                            a2 = a(context, list7, r3);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return a2;
                    } catch (ChartboostError.Load e4) {
                        e = e4;
                        r3 = this;
                        xb.b(X3.j.d + r3.j + "] MultiRenderable load failed: auctionId=" + r3.e.c() + ", errorCode=" + e.getCode() + ", errorConstant=" + e.getConstant(), e);
                        Result.Companion companion4 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(e));
                    } catch (Exception e5) {
                        e = e5;
                        r3 = this;
                        coroutine_suspended = list7;
                        r5 = list6;
                        xb.b(X3.j.d + r3.j + "] MultiRenderable unexpected exception during load: auctionId=" + r3.e.c(), e);
                        String a32 = w7.a(e, 5);
                        String simpleName2 = e.getClass().getSimpleName();
                        message = e.getMessage();
                        if (message == null) {
                            message = "<no_message>";
                        }
                        String str = r3.e.h() != sb.e ? "sequential" : "concurrent";
                        int size3 = r5.size();
                        int size22 = coroutine_suspended.size();
                        String joinToString$default2 = CollectionsKt.joinToString$default(r3.d, StringUtils.COMMA, null, null, 0, null, d.b, 30, null);
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Unexpected exception during renderable loading: " + message + " ExceptionType=" + simpleName2 + " LoadingStrategy=" + str + " CriticalCount=" + size3 + " OptionalCount=" + size22 + " Renderables=[" + joinToString$default2 + "] Thread=" + Thread.currentThread().getName() + " StackTrace=[" + a32 + X3.j.e, e)));
                    }
                }
            }
            if (r5 == 0) {
            }
        } catch (CancellationException e6) {
            throw e6;
        }
        r3 = new b(continuation);
        Object obj3 = r3.e;
        ?? coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = r3.g;
    }

    public /* synthetic */ od(List list, a0 a0Var, boolean z, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, a0Var, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null))) : coroutineScope);
    }

    @Override // com.chartboost.sdk.impl.vf
    public boolean i() {
        m2 m2Var = this.n;
        if (m2Var != null && m2Var.i()) {
            return true;
        }
        Iterable indices = CollectionsKt.getIndices(this.d);
        if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                if (nextInt > this.m && this.l.contains(this.d.get(nextInt))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.vf
    public View k() {
        m2 m2Var = this.n;
        if (m2Var != null && m2Var.i()) {
            m2 m2Var2 = this.n;
            if (m2Var2 != null) {
                return m2Var2.k();
            }
            return null;
        }
        int i2 = 0;
        for (int i3 = this.m + 1; i3 < this.d.size(); i3++) {
            m2 m2Var3 = (m2) this.d.get(i3);
            if (this.l.contains(m2Var3)) {
                if (i2 > 0) {
                    xb.a(X3.j.d + this.j + "] Skipped " + i2 + " unloaded renderable(s) before showing next ad", (Throwable) null, 2, (Object) null);
                }
                this.m = i3;
                m2Var3.a(this);
                this.n = m2Var3;
                return m2Var3.k();
            }
            xb.a(X3.j.d + this.j + "] Skipping renderable at index " + i3 + " (not yet loaded)", (Throwable) null, 2, (Object) null);
            i2++;
        }
        if (i2 > 0) {
            xb.a(X3.j.d + this.j + "] Reached end of sequence: " + i2 + " renderable(s) still loading in background. No more loaded renderables available at this time.", (Throwable) null, 2, (Object) null);
            return null;
        }
        xb.a(X3.j.d + this.j + "] No more renderables to show", (Throwable) null, 2, (Object) null);
        return null;
    }

    @Override // com.chartboost.sdk.impl.vf
    public long h() {
        m2 m2Var = this.n;
        if (m2Var != null) {
            return m2Var.h();
        }
        return 0L;
    }

    public void y() {
        String str = this.j;
        String c2 = this.e.c();
        int i2 = this.m;
        m2 m2Var = this.n;
        xb.a(X3.j.d + str + "] Starting renderable: auctionId=" + c2 + ", currentAdIndex=" + i2 + ", currentAdType=" + (m2Var != null ? m2Var.getClass().getSimpleName() : null), (Throwable) null, 2, (Object) null);
        m2 m2Var2 = this.n;
        if (m2Var2 != null) {
            m2Var2.y();
            if (this.q) {
                m2Var2.a(false);
            } else {
                m2Var2.a(p(), false);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void l() {
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.l();
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void m() {
        String str = this.j;
        String c2 = this.e.c();
        m2 m2Var = this.n;
        xb.a(X3.j.d + str + "] Pausing: auctionId=" + c2 + ", currentAdType=" + (m2Var != null ? m2Var.getClass().getSimpleName() : null), (Throwable) null, 2, (Object) null);
        m2 m2Var2 = this.n;
        if (m2Var2 != null) {
            m2Var2.m();
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void n() {
        String str = this.j;
        String c2 = this.e.c();
        m2 m2Var = this.n;
        String simpleName = m2Var != null ? m2Var.getClass().getSimpleName() : null;
        xb.a(X3.j.d + str + "] Resuming: auctionId=" + c2 + ", currentAdType=" + simpleName + ", isMuted=" + this.q + ", isDucked=" + this.p, (Throwable) null, 2, (Object) null);
        m2 m2Var2 = this.n;
        if (m2Var2 != null) {
            m2Var2.n();
            if (this.q) {
                m2Var2.a(false);
            } else {
                m2Var2.a(p(), false);
            }
        }
    }

    public final float p() {
        if (this.p) {
            return 0.2f;
        }
        float f2 = this.o;
        if (f2 > 0.0f) {
            return f2;
        }
        return 1.0f;
    }

    public final long s() {
        m2 m2Var = this.n;
        if (m2Var != null) {
            return m2Var.t();
        }
        return 0L;
    }

    public final long r() {
        m2 m2Var = this.n;
        if (m2Var != null) {
            return m2Var.s();
        }
        return 0L;
    }

    public void b(boolean z) {
        m2 m2Var;
        this.p = z;
        if (z) {
            if (this.q) {
                m2 m2Var2 = this.n;
                if (m2Var2 != null) {
                    vf.a((vf) m2Var2, false, 1, (Object) null);
                    return;
                }
                return;
            }
            this.o = 1.0f;
            m2 m2Var3 = this.n;
            if (m2Var3 != null) {
                vf.a((vf) m2Var3, 0.2f, false, 2, (Object) null);
                return;
            }
            return;
        }
        if (this.q || (m2Var = this.n) == null) {
            return;
        }
        vf.a((vf) m2Var, this.o, false, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.zf
    public void f() {
        zf j2 = j();
        if (j2 != null) {
            j2.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[LOOP:1: B:22:0x0096->B:24:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, List list, Continuation continuation) {
        i iVar;
        int i2;
        od odVar;
        List<Pair> list2;
        Iterator it;
        boolean z;
        Iterator it2;
        Pair pair;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.e = i3 - Integer.MIN_VALUE;
                Object obj = iVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((m2) it3.next()).a(this);
                    }
                    j jVar = new j(list, context, null);
                    iVar.b = this;
                    iVar.e = 1;
                    obj = SupervisorKt.supervisorScope(jVar, iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    odVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    odVar = (od) iVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (Result.m8029isSuccessimpl(((Result) ((Pair) obj2).component2()).getValue())) {
                        arrayList.add(obj2);
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    odVar.l.add((m2) ((Pair) it.next()).component1());
                }
                z = list2 instanceof Collection;
                if (z || !list2.isEmpty()) {
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (Result.m8029isSuccessimpl(((Result) ((Pair) it2.next()).component2()).getValue())) {
                            int i4 = 0;
                            if (!z || !list2.isEmpty()) {
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    if (Result.m8029isSuccessimpl(((Result) ((Pair) it4.next()).component2()).getValue()) && (i4 = i4 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            xb.a(X3.j.d + odVar.j + "] Optional renderables sync load complete: " + i4 + "/" + list2.size() + " succeeded, auctionId=" + odVar.e.c(), (Throwable) null, 2, (Object) null);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8023constructorimpl(Unit.INSTANCE);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Pair pair2 : list2) {
                    m2 m2Var = (m2) pair2.component1();
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(((Result) pair2.component2()).getValue());
                    String str = m8026exceptionOrNullimpl != null ? m2Var.getClass().getSimpleName() + ": " + m8026exceptionOrNullimpl.getMessage() : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                xb.b(X3.j.d + odVar.j + "] All " + list2.size() + " optional renderables failed: auctionId=" + odVar.e.c() + ", failures=[" + CollectionsKt.joinToString$default(arrayList2, "; ", null, null, 0, null, null, 62, null) + X3.j.e, (Throwable) null, 2, (Object) null);
                Result.Companion companion2 = Result.INSTANCE;
                pair = (Pair) CollectionsKt.firstOrNull(list2);
                if (pair != null || (r1 = Result.m8026exceptionOrNullimpl(((Result) pair.component2()).getValue())) == null) {
                    Throwable illegalStateException = new IllegalStateException("All optional renderables failed.");
                }
                return Result.m8023constructorimpl(ResultKt.createFailure(illegalStateException));
            }
        }
        iVar = new i(continuation);
        Object obj3 = iVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.e;
        if (i2 != 0) {
        }
        list2 = (List) obj3;
        ArrayList arrayList3 = new ArrayList();
        while (r5.hasNext()) {
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        z = list2 instanceof Collection;
        if (z) {
        }
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r2.hasNext()) {
        }
        xb.b(X3.j.d + odVar.j + "] All " + list2.size() + " optional renderables failed: auctionId=" + odVar.e.c() + ", failures=[" + CollectionsKt.joinToString$default(arrayList22, "; ", null, null, 0, null, null, 62, null) + X3.j.e, (Throwable) null, 2, (Object) null);
        Result.Companion companion22 = Result.INSTANCE;
        pair = (Pair) CollectionsKt.firstOrNull(list2);
        if (pair != null) {
        }
        Throwable illegalStateException2 = new IllegalStateException("All optional renderables failed.");
        return Result.m8023constructorimpl(ResultKt.createFailure(illegalStateException2));
    }

    public void c(boolean z) {
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.b(z);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void o() {
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, Continuation continuation) {
        e eVar;
        int i2;
        ArrayList<a> arrayList;
        od odVar;
        Object obj;
        List list2;
        Deferred async$default;
        Iterator it;
        Object obj2;
        Pair pair;
        Context context2 = context;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i3 = eVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.h = i3 - Integer.MIN_VALUE;
                Object obj3 = eVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eVar.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    List list3 = this.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (!((m2) obj4).w().m()) {
                            arrayList2.add(obj4);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            m2 m2Var = (m2) it2.next();
                            async$default = BuildersKt__Builders_commonKt.async$default(this.h, null, null, new g(m2Var, this, context2, null), 3, null);
                            arrayList.add(new a(m2Var, async$default, true));
                        }
                        f fVar = new f(arrayList2, this, context2, null);
                        eVar.b = this;
                        eVar.c = context2;
                        eVar.d = arrayList2;
                        eVar.e = arrayList;
                        eVar.h = 1;
                        Object supervisorScope = SupervisorKt.supervisorScope(fVar, eVar);
                        if (supervisorScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        odVar = this;
                        obj = supervisorScope;
                        list2 = arrayList2;
                    } else {
                        eVar.h = 2;
                        Object b2 = b(context2, list, eVar);
                        return b2 == coroutine_suspended ? coroutine_suspended : b2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return ((Result) obj3).getValue();
                    }
                    ?? r1 = (List) eVar.e;
                    list2 = (List) eVar.d;
                    Context context3 = (Context) eVar.c;
                    od odVar2 = (od) eVar.b;
                    ResultKt.throwOnFailure(obj3);
                    arrayList = r1;
                    context2 = context3;
                    odVar = odVar2;
                    obj = obj3;
                }
                List list4 = (List) obj;
                it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Result.m8028isFailureimpl(((Result) ((Pair) obj2).component2()).getValue())) {
                        break;
                    }
                }
                pair = (Pair) obj2;
                if (pair == null) {
                    m2 m2Var2 = (m2) pair.component1();
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(((Result) pair.component2()).getValue());
                    if (m8026exceptionOrNullimpl == null) {
                        m8026exceptionOrNullimpl = new IllegalStateException("Unknown critical load failure");
                    }
                    xb.b(X3.j.d + odVar.j + "] Critical renderable failed (concurrent): type=" + m2Var2.getClass().getSimpleName() + ", auctionId=" + odVar.e.c() + ", criticalCount=" + list2.size() + ", optionalCount=" + arrayList.size(), m8026exceptionOrNullimpl);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        JobKt__JobKt.cancel$default(((a) it3.next()).a(), "A critical renderable failed.", null, 2, null);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list4) {
                    if (Result.m8029isSuccessimpl(((Result) ((Pair) obj5).component2()).getValue())) {
                        arrayList3.add(obj5);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    odVar.l.add((m2) ((Pair) it4.next()).component1());
                }
                xb.a(X3.j.d + odVar.j + "] All " + list2.size() + " critical renderables loaded successfully (concurrent), auctionId=" + odVar.e.c(), (Throwable) null, 2, (Object) null);
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (a aVar : arrayList) {
                    arrayList4.add(TuplesKt.to(aVar.b(), aVar.a()));
                }
                odVar.b(context2, arrayList4);
                xb.a(X3.j.d + odVar.j + "] Reporting load success after required renderables ready, monitoring " + arrayList.size() + " optional renderables in background.", (Throwable) null, 2, (Object) null);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8023constructorimpl(Unit.INSTANCE);
            }
        }
        eVar = new e(continuation);
        Object obj32 = eVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar.h;
        if (i2 != 0) {
        }
        List list42 = (List) obj;
        it = list42.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        pair = (Pair) obj2;
        if (pair == null) {
        }
    }

    public final void b(Context context, List list) {
        Job launch$default;
        Job job = this.i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new m(list, this, context, null), 3, null);
        this.i = launch$default;
    }

    @Override // com.chartboost.sdk.impl.zf
    public void b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        zf j2 = j();
        if (j2 != null) {
            j2.b(error);
        }
    }

    public final void a(Context context, List list) {
        Job launch$default;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((m2) it.next()).a(this);
        }
        Job job = this.i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new h(list, context, this, null), 3, null);
        this.i = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, List list2, Continuation continuation) {
        k kVar;
        int i2;
        od odVar;
        Iterator it;
        Object obj;
        Pair pair;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i3 = kVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.g = i3 - Integer.MIN_VALUE;
                Object obj2 = kVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar.g;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!list.isEmpty()) {
                        l lVar = new l(list, this, context, null);
                        kVar.b = this;
                        kVar.c = list;
                        kVar.d = list2;
                        kVar.g = 1;
                        obj2 = SupervisorKt.supervisorScope(lVar, kVar);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        odVar = this;
                    } else {
                        if (!list2.isEmpty()) {
                            kVar.g = 2;
                            Object b2 = b(context, list2, kVar);
                            return b2 == coroutine_suspended ? coroutine_suspended : b2;
                        }
                        xb.a("No renderables to load.", (Throwable) null, 2, (Object) null);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8023constructorimpl(Unit.INSTANCE);
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return ((Result) obj2).getValue();
                    }
                    list2 = (List) kVar.d;
                    list = (List) kVar.c;
                    odVar = (od) kVar.b;
                    ResultKt.throwOnFailure(obj2);
                }
                List list3 = (List) obj2;
                it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Result.m8028isFailureimpl(((Result) ((Pair) obj).component2()).getValue())) {
                        break;
                    }
                }
                pair = (Pair) obj;
                if (pair == null) {
                    m2 m2Var = (m2) pair.component1();
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(((Result) pair.component2()).getValue());
                    if (m8026exceptionOrNullimpl == null) {
                        m8026exceptionOrNullimpl = new IllegalStateException("Unknown critical load failure");
                    }
                    xb.b(X3.j.d + odVar.j + "] Critical renderable failed: type=" + m2Var.getClass().getSimpleName() + ", auctionId=" + odVar.e.c() + ", criticalCount=" + list.size() + ", optionalCount=" + list2.size(), m8026exceptionOrNullimpl);
                    return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (Result.m8029isSuccessimpl(((Result) ((Pair) obj3).component2()).getValue())) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    odVar.l.add((m2) ((Pair) it2.next()).component1());
                }
                xb.a(X3.j.d + odVar.j + "] All " + list.size() + " critical renderables loaded successfully, auctionId=" + odVar.e.c(), (Throwable) null, 2, (Object) null);
                if (!list2.isEmpty()) {
                    odVar.k.addAll(list2);
                }
                xb.a(X3.j.d + odVar.j + "] Reporting load success after critical renderables ready.", (Throwable) null, 2, (Object) null);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8023constructorimpl(Unit.INSTANCE);
            }
        }
        kVar = new k(continuation);
        Object obj22 = kVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.g;
        if (i2 != 0) {
        }
        List list32 = (List) obj22;
        it = list32.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        pair = (Pair) obj;
        if (pair == null) {
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public float a(boolean z) {
        this.q = true;
        m2 m2Var = this.n;
        if (m2Var != null) {
            this.o = this.p ? 0.2f : this.o;
            m2Var.a(z);
        }
        return this.o;
    }

    @Override // com.chartboost.sdk.impl.zf
    public void a() {
        zf j2 = j();
        if (j2 != null) {
            j2.a();
        }
    }

    @Override // com.chartboost.sdk.impl.zf
    public void a(re request) {
        Intrinsics.checkNotNullParameter(request, "request");
        zf j2 = j();
        if (j2 != null) {
            j2.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(Context context) {
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((m2) it.next()).a(context);
        }
        List deferredOptionalRenderables = this.k;
        Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables, "deferredOptionalRenderables");
        synchronized (deferredOptionalRenderables) {
            try {
                List deferredOptionalRenderables2 = this.k;
                Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables2, "deferredOptionalRenderables");
                if (!deferredOptionalRenderables2.isEmpty()) {
                    List deferredOptionalRenderables3 = this.k;
                    Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables3, "deferredOptionalRenderables");
                    emptyList = CollectionsKt.toList(deferredOptionalRenderables3);
                    this.k.clear();
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        a(context, emptyList);
        xb.a(X3.j.d + this.j + "] Started deferred optional renderables (" + emptyList.size() + " renderables)", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(nh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        xb.a(X3.j.d + this.j + "] Stopping: auctionId=" + this.e.c() + ", reason=" + reason + ", loadedCount=" + this.l.size() + ", currentAdIndex=" + this.m, (Throwable) null, 2, (Object) null);
        Job job = this.i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.k.clear();
        this.l.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((m2) it.next()).a(reason);
        }
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.a((zf) null);
        }
        this.n = null;
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((m2) it2.next()).a((zf) null);
        }
        this.m = -1;
        CoroutineScopeKt.cancel$default(this.h, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(boolean z, Integer num, Integer num2, i4 i4Var) {
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.a(z, num, num2, i4Var);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(h7 type, v5 v5Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.a(type, v5Var);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(float f2, boolean z) {
        this.q = false;
        m2 m2Var = this.n;
        if (m2Var != null) {
            m2Var.a(p(), z);
        }
    }
}
