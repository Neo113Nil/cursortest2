package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class oj {
    public static i3 b;
    public static ll c;
    public static final oj a = new oj();
    public static final CoroutineScope d = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ bk c;
        public final /* synthetic */ ck d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bk bkVar, ck ckVar, Continuation continuation) {
            super(2, continuation);
            this.c = bkVar;
            this.d = ckVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ck a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                bk bkVar = this.c;
                ck ckVar = this.d;
                ll m = ckVar.m();
                if (m == null) {
                    m = oj.c;
                }
                Context applicationContext = this.d.b().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                a = ckVar.a((r30 & 1) != 0 ? ckVar.a : m, (r30 & 2) != 0 ? ckVar.b : null, (r30 & 4) != 0 ? ckVar.c : applicationContext, (r30 & 8) != 0 ? ckVar.d : null, (r30 & 16) != 0 ? ckVar.e : null, (r30 & 32) != 0 ? ckVar.f : null, (r30 & 64) != 0 ? ckVar.g : null, (r30 & 128) != 0 ? ckVar.h : null, (r30 & 256) != 0 ? ckVar.i : null, (r30 & 512) != 0 ? ckVar.j : null, (r30 & 1024) != 0 ? ckVar.k : null, (r30 & 2048) != 0 ? ckVar.l : null, (r30 & 4096) != 0 ? ckVar.m : null, (r30 & 8192) != 0 ? ckVar.n : null);
                bkVar.b(a);
            } catch (Exception e) {
                xb.b("Error tracking VAST event " + this.c.a() + ": " + e.getMessage(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void a(i3 service) {
        Intrinsics.checkNotNullParameter(service, "service");
        b = service;
    }

    public final i3 b() {
        return b;
    }

    public final void a(ll llVar) {
        c = llVar;
    }

    public final void a(bk eventType, ck params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(d, null, null, new a(eventType, params, null), 3, null);
    }
}
