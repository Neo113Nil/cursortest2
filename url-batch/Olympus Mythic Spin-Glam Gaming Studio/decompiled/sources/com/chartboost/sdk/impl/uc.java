package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public class uc implements il {
    public static final a i = new a(null);
    public static final AtomicInteger j = new AtomicInteger(0);
    public final el a;
    public final AdSession b;
    public final AdEvents c;
    public boolean d;
    public boolean e;
    public kl f;
    public int g;
    public final CoroutineScope h;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kl.values().length];
            try {
                iArr[kl.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kl.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kl.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uc.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                uc.this.c.loaded();
            } catch (Exception e) {
                xb.b("Signaling ad loaded for viewability failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ VastProperties d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VastProperties vastProperties, Continuation continuation) {
            super(2, continuation);
            this.d = vastProperties;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uc.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                uc.this.c.loaded(this.d);
            } catch (Exception e) {
                xb.b("Signaling video loaded for viewability failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Ref$BooleanRef d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
            super(2, continuation);
            this.d = ref$BooleanRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uc.this.new e(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                uc.this.c.impressionOccurred();
                uc.this.d = true;
                this.d.element = true;
            } catch (Exception e) {
                xb.b("Counting the viewability impression failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uc.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                uc.this.b.finish();
                xb.a("Viewability ad session finished (session=" + uc.this.e() + ")", (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                xb.b("Finishing the viewability ad session failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public uc(el manager, AdSession adSession, AdEvents adEvents, View adView) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.a = manager;
        this.b = adSession;
        this.c = adEvents;
        this.f = kl.b;
        this.h = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate());
        this.g = j.incrementAndGet();
        a(adView);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final void a(kl newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        a(newState, (Integer) null);
    }

    public final int e() {
        return this.g;
    }

    public final CoroutineScope d() {
        return this.h;
    }

    @Override // com.chartboost.sdk.impl.il
    public void c() {
        a(kl.e);
    }

    @Override // com.chartboost.sdk.impl.il
    public void b() {
        a(kl.c);
    }

    public final void a(kl newState, Integer num) {
        VastProperties createVastPropertiesForNonSkippableMedia;
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.a.isActive()) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            int i2 = b.a[newState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        kl klVar = this.f;
                        if (klVar != kl.b && klVar != kl.f) {
                            BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new f(null), 3, null);
                            this.e = false;
                            ref$BooleanRef.element = true;
                        }
                    } else {
                        if (this.d) {
                            return;
                        }
                        kl klVar2 = this.f;
                        if (klVar2 == kl.c || klVar2 == kl.d) {
                            BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new e(ref$BooleanRef, null), 3, null);
                        }
                    }
                } else if (this.f == kl.b) {
                    try {
                        this.b.start();
                        xb.a("Viewability video ad session started (session=" + this.g + ")", (Throwable) null, 2, (Object) null);
                        if (num != null && num.intValue() > 0) {
                            createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num.intValue(), true, Position.STANDALONE);
                            Intrinsics.checkNotNull(createVastPropertiesForNonSkippableMedia);
                        } else {
                            createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                            Intrinsics.checkNotNull(createVastPropertiesForNonSkippableMedia);
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new d(createVastPropertiesForNonSkippableMedia, null), 3, null);
                        this.e = true;
                        ref$BooleanRef.element = true;
                    } catch (Exception e2) {
                        xb.b("Ad session start for viewability failed.", e2);
                    }
                }
            } else if (this.f == kl.b) {
                try {
                    this.b.start();
                    xb.a("Viewability ad session started (session=" + this.g + ")", (Throwable) null, 2, (Object) null);
                    BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new c(null), 3, null);
                    this.e = true;
                    ref$BooleanRef.element = true;
                } catch (Exception e3) {
                    xb.b("Ad session start for viewability failed.", e3);
                }
            }
            if (ref$BooleanRef.element) {
                this.f = newState;
            }
        }
    }

    @Override // com.chartboost.sdk.impl.il
    public void a(View view, gl purpose) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        try {
            this.b.addFriendlyObstruction(view, purpose.c(), purpose.b());
        } catch (Exception e2) {
            xb.b("Adding a friendly obstruction failed.", e2);
        }
    }

    public final void a(View adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        try {
            this.b.registerAdView(adView);
        } catch (Exception e2) {
            xb.b("Unable to register ad view.", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.il
    public void a() {
        a(kl.f);
    }
}
