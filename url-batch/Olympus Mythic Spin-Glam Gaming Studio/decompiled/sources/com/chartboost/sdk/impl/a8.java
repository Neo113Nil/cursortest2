package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.t3;
import com.chartboost.sdk.impl.ue;
import com.chartboost.sdk.impl.we;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes9.dex */
public final class a8 {
    public final z7 a;
    public final CoroutineScope b;
    public we c;
    public Job d;

    public a8(z7 actionConsumer, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(actionConsumer, "actionConsumer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = actionConsumer;
        this.b = coroutineScope;
        this.c = we.b.a;
    }

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ b7 d;
        public final /* synthetic */ URL e;
        public final /* synthetic */ a8 f;
        public final /* synthetic */ ExoPlayer g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b7 b7Var, URL url, a8 a8Var, ExoPlayer exoPlayer, Continuation continuation) {
            super(2, continuation);
            this.d = b7Var;
            this.e = url;
            this.f = a8Var;
            this.g = exoPlayer;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.d, this.e, this.f, this.g, continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
            } catch (ChartboostError.Load e) {
                xb.b("Cache observer error for " + this.e + ": errorCode=" + e.getCode() + ", errorConstant=" + e.getConstant(), e);
                this.f.a(new ue.d(e));
            } catch (CancellationException unused) {
                xb.a("Cache observer for " + this.e + " cancelled.", (Throwable) null, 2, (Object) null);
            } catch (Exception e2) {
                xb.b("Error in cache observer for " + this.e, e2);
                this.f.a(new ue.d(new ChartboostError.Load.AssetUnavailable(this.e.toString(), "Error in cache observer for " + this.e, e2)));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                b7 b7Var = this.d;
                URL url = this.e;
                this.c = coroutineScope;
                this.b = 1;
                a = b7Var.a(url, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                if (Result.m8029isSuccessimpl(a)) {
                    a8 a8Var = this.f;
                    ResultKt.throwOnFailure(a);
                    a8Var.a(new ue.b((File) a, this.g));
                } else {
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
                    if (m8026exceptionOrNullimpl == null) {
                        m8026exceptionOrNullimpl = new IOException("Failed to get video from cache for " + this.e);
                    }
                    xb.b("Video cache retrieval failed: url=" + this.e + ", errorType=" + m8026exceptionOrNullimpl.getClass().getSimpleName() + ", errorMessage=" + m8026exceptionOrNullimpl.getMessage(), (Throwable) null, 2, (Object) null);
                    ChartboostError chartboostError = m8026exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8026exceptionOrNullimpl : null;
                    if (chartboostError == null) {
                        chartboostError = new ChartboostError.Load.AssetUnavailable(this.e.toString(), "Failed to get video from cache for " + this.e, m8026exceptionOrNullimpl);
                    }
                    this.f.a(new ue.d(chartboostError));
                }
            }
            Flow a2 = this.d.a(this.e);
            C0214a c0214a = new C0214a(this.e, this.f);
            this.c = null;
            this.b = 2;
            if (a2.collect(c0214a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.chartboost.sdk.impl.a8$a$a, reason: collision with other inner class name */
        public static final class C0214a implements FlowCollector {
            public final /* synthetic */ URL a;
            public final /* synthetic */ a8 b;

            public C0214a(URL url, a8 a8Var) {
                this.a = url;
                this.b = a8Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(t3 t3Var, Continuation continuation) {
                if (t3Var instanceof t3.a) {
                    t3.a aVar = (t3.a) t3Var;
                    if (Intrinsics.areEqual(this.a, aVar.b())) {
                        we b = this.b.b();
                        ExoPlayer a = b.a();
                        long currentPosition = a != null ? a.getCurrentPosition() : 0L;
                        ExoPlayer a2 = b.a();
                        long duration = a2 != null ? a2.getDuration() : 0L;
                        String simpleName = Reflection.getOrCreateKotlinClass(b.getClass()).getSimpleName();
                        if (b instanceof we.e) {
                            xb.b("Video cache eviction during playback: url=" + this.a + ", state=" + simpleName + ", positionMs=" + currentPosition + ", durationMs=" + duration + ", reason=" + aVar.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            xb.e("Video cache eviction: url=" + this.a + ", state=" + simpleName + ", positionMs=" + currentPosition + ", durationMs=" + duration + ", reason=" + aVar.a(), null, 2, null);
                        }
                        this.b.a(ue.c.a);
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void d() {
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.d = null;
    }

    public final synchronized we b() {
        return this.c;
    }

    public final synchronized long c() {
        ExoPlayer a2;
        a2 = this.c.a();
        return a2 != null ? RangesKt.coerceAtLeast(a2.getDuration(), 0L) : 0L;
    }

    public final synchronized long a() {
        ExoPlayer a2;
        a2 = this.c.a();
        return a2 != null ? RangesKt.coerceAtLeast(a2.getCurrentPosition(), 0L) : 0L;
    }

    public final synchronized void a(ue event) {
        Intrinsics.checkNotNullParameter(event, "event");
        we weVar = this.c;
        we a2 = a(weVar, event);
        this.c = a2;
        xb.a("State Transition: " + Reflection.getOrCreateKotlinClass(weVar.getClass()).getSimpleName() + " -> " + Reflection.getOrCreateKotlinClass(a2.getClass()).getSimpleName() + " on Event " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
    }

    public final void a(URL url, b7 b7Var, ExoPlayer exoPlayer) {
        Job launch$default;
        d();
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new a(b7Var, url, this, exoPlayer, null), 3, null);
        this.d = launch$default;
    }

    public final we a(we weVar, ue ueVar) {
        we eVar;
        we fVar;
        if (weVar instanceof we.b) {
            if (!(ueVar instanceof ue.a)) {
                return ueVar instanceof ue.j ? we.g.a : weVar;
            }
            ue.a aVar = (ue.a) ueVar;
            ExoPlayer b = this.a.b(aVar.b());
            a(aVar.c(), aVar.a(), b);
            fVar = new we.c(aVar.c(), b);
        } else if (weVar instanceof we.c) {
            if (ueVar instanceof ue.b) {
                ue.b bVar = (ue.b) ueVar;
                this.a.a(bVar.b(), bVar.a());
                return weVar;
            }
            if (ueVar instanceof ue.g) {
                this.a.f();
                fVar = new we.f(((we.c) weVar).b(), ((ue.g) ueVar).a());
            } else {
                if (ueVar instanceof ue.f) {
                    ue.f fVar2 = (ue.f) ueVar;
                    this.a.a(fVar2.a());
                    return new we.a(fVar2.a());
                }
                if (ueVar instanceof ue.d) {
                    ue.d dVar = (ue.d) ueVar;
                    this.a.a(dVar.a());
                    return new we.a(dVar.a());
                }
                if (ueVar instanceof ue.c) {
                    we.c cVar = (we.c) weVar;
                    ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(cVar.b().toString(), "Video asset for " + cVar.b() + " was evicted during load.", null);
                    this.a.a(assetUnavailable);
                    return new we.a(assetUnavailable);
                }
                if (!(ueVar instanceof ue.j)) {
                    return weVar;
                }
                this.a.g();
                d();
                return we.g.a;
            }
        } else {
            if (weVar instanceof we.f) {
                if (ueVar instanceof ue.i) {
                    we.f fVar3 = (we.f) weVar;
                    this.a.b(fVar3.a());
                    eVar = new we.e(fVar3.b(), fVar3.a());
                } else {
                    if (ueVar instanceof ue.k) {
                        this.a.a(((we.f) weVar).a(), ((ue.k) ueVar).a());
                        return weVar;
                    }
                    if (ueVar instanceof ue.l) {
                        we.f fVar4 = (we.f) weVar;
                        this.a.d(fVar4.a());
                        eVar = new we.h(fVar4.b(), fVar4.a());
                    } else {
                        if (ueVar instanceof ue.j) {
                            this.a.g();
                            d();
                            return we.g.a;
                        }
                        if (ueVar instanceof ue.f) {
                            ue.f fVar5 = (ue.f) ueVar;
                            this.a.a(fVar5.a());
                            return new we.a(fVar5.a());
                        }
                        if (!(ueVar instanceof ue.c)) {
                            return weVar;
                        }
                        ChartboostError.Show.AdInvalidated adInvalidated = ChartboostError.Show.AdInvalidated.INSTANCE;
                        this.a.a(adInvalidated);
                        eVar = new we.a(adInvalidated);
                    }
                }
            } else if (weVar instanceof we.e) {
                if (ueVar instanceof ue.h) {
                    we.e eVar2 = (we.e) weVar;
                    this.a.a(eVar2.a());
                    eVar = new we.d(eVar2.b(), eVar2.a());
                } else if (ueVar instanceof ue.e) {
                    this.a.e();
                    we.e eVar3 = (we.e) weVar;
                    eVar = new we.f(eVar3.b(), eVar3.a());
                } else if (ueVar instanceof ue.l) {
                    we.e eVar4 = (we.e) weVar;
                    this.a.d(eVar4.a());
                    eVar = new we.h(eVar4.b(), eVar4.a());
                } else {
                    if (ueVar instanceof ue.k) {
                        this.a.a(((we.e) weVar).a(), ((ue.k) ueVar).a());
                        return weVar;
                    }
                    if (ueVar instanceof ue.j) {
                        this.a.g();
                        d();
                        return we.g.a;
                    }
                    if (ueVar instanceof ue.f) {
                        ue.f fVar6 = (ue.f) ueVar;
                        this.a.a(fVar6.a());
                        return new we.a(fVar6.a());
                    }
                    if (!(ueVar instanceof ue.c)) {
                        return weVar;
                    }
                    ChartboostError.Show.AdInvalidated adInvalidated2 = ChartboostError.Show.AdInvalidated.INSTANCE;
                    this.a.a(adInvalidated2);
                    eVar = new we.a(adInvalidated2);
                }
            } else if (weVar instanceof we.d) {
                if (ueVar instanceof ue.i) {
                    we.d dVar2 = (we.d) weVar;
                    this.a.b(dVar2.a());
                    eVar = new we.e(dVar2.b(), dVar2.a());
                } else if (ueVar instanceof ue.l) {
                    we.d dVar3 = (we.d) weVar;
                    this.a.d(dVar3.a());
                    eVar = new we.h(dVar3.b(), dVar3.a());
                } else {
                    if (ueVar instanceof ue.k) {
                        this.a.a(((we.d) weVar).a(), ((ue.k) ueVar).a());
                        return weVar;
                    }
                    if (ueVar instanceof ue.j) {
                        this.a.g();
                        d();
                        return we.g.a;
                    }
                    if (ueVar instanceof ue.f) {
                        ue.f fVar7 = (ue.f) ueVar;
                        this.a.a(fVar7.a());
                        return new we.a(fVar7.a());
                    }
                    if (!(ueVar instanceof ue.c)) {
                        return weVar;
                    }
                    ChartboostError.Show.AdInvalidated adInvalidated3 = ChartboostError.Show.AdInvalidated.INSTANCE;
                    this.a.a(adInvalidated3);
                    eVar = new we.a(adInvalidated3);
                }
            } else if (weVar instanceof we.h) {
                if (ueVar instanceof ue.i) {
                    we.h hVar = (we.h) weVar;
                    this.a.c(hVar.a());
                    this.a.b(hVar.a());
                    eVar = new we.e(hVar.b(), hVar.a());
                } else {
                    if (!(ueVar instanceof ue.j)) {
                        return weVar;
                    }
                    this.a.g();
                    d();
                    return we.g.a;
                }
            } else {
                if ((weVar instanceof we.a) || (weVar instanceof we.g)) {
                    if (!(ueVar instanceof ue.j)) {
                        return weVar;
                    }
                    this.a.g();
                    d();
                    return we.g.a;
                }
                throw new NoWhenBranchMatchedException();
            }
            return eVar;
        }
        return fVar;
    }
}
