package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes11.dex */
public final class wc extends uc implements ll {
    public final MediaEvents k;
    public final Integer l;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ bk c;
        public final /* synthetic */ wc d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bk bkVar, wc wcVar, Continuation continuation) {
            super(2, continuation);
            this.c = bkVar;
            this.d = wcVar;
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String a = this.c.a();
                switch (a.hashCode()) {
                    case -1638835128:
                        if (a.equals("midpoint")) {
                            this.d.k.midpoint();
                            break;
                        }
                        xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                        break;
                    case -1337830390:
                        if (!a.equals("thirdQuartile")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.thirdQuartile();
                            break;
                        }
                    case -934426579:
                        if (!a.equals("resume")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.resume();
                            break;
                        }
                    case -599445191:
                        if (!a.equals("complete")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.complete();
                            break;
                        }
                    case 3532159:
                        if (!a.equals("skip")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.skipped();
                            break;
                        }
                    case 94750088:
                        if (!a.equals("click")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.adUserInteraction(InteractionType.CLICK);
                            break;
                        }
                    case 106440182:
                        if (a.equals("pause")) {
                            this.d.k.pause();
                            break;
                        }
                        xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                        break;
                    case 120623625:
                        if (!a.equals("impression")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.c();
                            break;
                        }
                    case 560220243:
                        if (!a.equals("firstQuartile")) {
                            xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.firstQuartile();
                            break;
                        }
                    default:
                        xb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                        break;
                }
            } catch (Exception e) {
                xb.b("Viewability update for " + this.c.a() + " failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, Continuation continuation) {
            super(2, continuation);
            this.d = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wc.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                wc.this.k.volumeChange(this.d);
            } catch (Exception e) {
                xb.b("Viewability video player volume failed to update to " + this.d + ".", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, float f2, Continuation continuation) {
            super(2, continuation);
            this.d = f;
            this.e = f2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wc.this.new c(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                wc.this.k.start(this.d, this.e);
            } catch (Exception e) {
                xb.b("Start viewability media event failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(el manager, AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents, View videoView, Integer num) {
        super(manager, adSession, adEvents, videoView);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.k = mediaEvents;
        this.l = num;
    }

    @Override // com.chartboost.sdk.impl.ll
    public void a(bk videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (f()) {
            BuildersKt__Builders_commonKt.launch$default(d(), null, null, new a(videoEvent, this, null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.impl.uc, com.chartboost.sdk.impl.il
    public void b() {
        a(kl.d, this.l);
    }

    @Override // com.chartboost.sdk.impl.il
    public void a(float f) {
        BuildersKt__Builders_commonKt.launch$default(d(), null, null, new b(f, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.ll
    public void a(float f, float f2) {
        if (f()) {
            BuildersKt__Builders_commonKt.launch$default(d(), null, null, new c(Math.max(f, 0.0f), Math.min(Math.max(f2, 0.0f), 1.0f), null), 3, null);
        }
    }
}
