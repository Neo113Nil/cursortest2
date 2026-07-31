package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.yandex.mobile.ads.impl.EnumC1941g6;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1917f6 implements InterfaceC2382z6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AdQualityVerifierAdapter f25635a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdQualityVerifierAdapterConfiguration f25636b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25637c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2336x6 f25638d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2130o6 f25639e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2153p6 f25640f;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.quality.policy.AdQualitySdkVerifierWithPolicy", f = "AdQualitySdkVerifierWithPolicy.kt", l = {IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT}, m = "verifyAdWithPolicy")
    /* renamed from: com.yandex.mobile.ads.impl.f6$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25641b;

        /* renamed from: d, reason: collision with root package name */
        int f25643d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25641b = obj;
            this.f25643d |= Integer.MIN_VALUE;
            return C1917f6.a(C1917f6.this, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.quality.policy.AdQualitySdkVerifierWithPolicy", f = "AdQualitySdkVerifierWithPolicy.kt", l = {97}, m = "verifyAdWithTimeout")
    /* renamed from: com.yandex.mobile.ads.impl.f6$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        C1917f6 f25644b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25645c;

        /* renamed from: e, reason: collision with root package name */
        int f25647e;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25645c = obj;
            this.f25647e |= Integer.MIN_VALUE;
            return C1917f6.b(C1917f6.this, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.quality.policy.AdQualitySdkVerifierWithPolicy$verifyAdWithTimeout$2", f = "AdQualitySdkVerifierWithPolicy.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.f6$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        C2130o6 f25648b;

        /* renamed from: c, reason: collision with root package name */
        int f25649c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f25651e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AdQualityVerificationAdConfiguration f25652f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f25651e = context;
            this.f25652f = adQualityVerificationAdConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C1917f6.this.new c(this.f25651e, this.f25652f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C2130o6 c2130o6;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f25649c;
            if (i4 == 0) {
                ResultKt.a(obj);
                C2130o6 c2130o62 = C1917f6.this.f25639e;
                AdQualityVerifierAdapter adQualityVerifierAdapter = C1917f6.this.f25635a;
                Context context = this.f25651e;
                AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = C1917f6.this.f25636b;
                AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = this.f25652f;
                this.f25648b = c2130o62;
                this.f25649c = 1;
                Object verifyAd = adQualityVerifierAdapter.verifyAd(context, adQualityVerifierAdapterConfiguration, adQualityVerificationAdConfiguration, this);
                if (verifyAd == f4) {
                    return f4;
                }
                c2130o6 = c2130o62;
                obj = verifyAd;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2130o6 = this.f25648b;
                ResultKt.a(obj);
            }
            return c2130o6.a((AdQualityVerificationResult) obj);
        }
    }

    public /* synthetic */ C1917f6(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j4, C2336x6 c2336x6, C2130o6 c2130o6) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, j4, c2336x6, c2130o6, new C2153p6());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onAdClicked() {
        try {
            Result.Companion companion = Result.Companion;
            this.f25635a.onAdClicked();
            Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m243constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onAdClosed() {
        try {
            Result.Companion companion = Result.Companion;
            this.f25635a.onAdClosed();
            Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m243constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onAdWillDisplay() {
        try {
            Result.Companion companion = Result.Companion;
            this.f25635a.onAdWillDisplay();
            Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m243constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onInvalidated() {
        try {
            Result.Companion companion = Result.Companion;
            this.f25635a.onInvalidated();
            Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m243constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final /* synthetic */ Object a(C1917f6 c1917f6, kotlin.coroutines.d dVar) {
        return c1917f6.a(null, null, dVar);
    }

    public static final /* synthetic */ Object b(C1917f6 c1917f6, kotlin.coroutines.d dVar) {
        return c1917f6.b(null, null, dVar);
    }

    public C1917f6(@NotNull AdQualityVerifierAdapter verifierAdapter, @NotNull AdQualityVerifierAdapterConfiguration verifierAdapterConfiguration, long j4, @NotNull C2336x6 policyAcceptor, @NotNull C2130o6 statusHandler, @NotNull C2153p6 verifierAdConfigurationCreator) {
        Intrinsics.checkNotNullParameter(verifierAdapter, "verifierAdapter");
        Intrinsics.checkNotNullParameter(verifierAdapterConfiguration, "verifierAdapterConfiguration");
        Intrinsics.checkNotNullParameter(policyAcceptor, "policyAcceptor");
        Intrinsics.checkNotNullParameter(statusHandler, "statusHandler");
        Intrinsics.checkNotNullParameter(verifierAdConfigurationCreator, "verifierAdConfigurationCreator");
        this.f25635a = verifierAdapter;
        this.f25636b = verifierAdapterConfiguration;
        this.f25637c = j4;
        this.f25638d = policyAcceptor;
        this.f25639e = statusHandler;
        this.f25640f = verifierAdConfigurationCreator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(7:24|25|(2:27|(1:29))|12|13|(3:15|(1:17)|18)|19)|11|12|13|(0)|19))|32|6|7|(0)(0)|11|12|13|(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m243constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        Throwable d4;
        Object a4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f25643d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f25643d = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f25641b;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f25643d;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    Result.Companion companion = Result.Companion;
                    a4 = this.f25638d.a(adQualityVerificationAdConfiguration);
                    if (a4 == null) {
                        aVar.f25643d = 1;
                        obj = b(context, adQualityVerificationAdConfiguration, aVar);
                        if (obj == f4) {
                            return f4;
                        }
                    }
                    Object m243constructorimpl = Result.m243constructorimpl(a4);
                    d4 = Result.d(m243constructorimpl);
                    if (d4 != null) {
                        String message = d4.getMessage();
                        if (message == null) {
                            message = "Unknown error with empty description";
                        }
                        m243constructorimpl = new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.UnknownError(message));
                    }
                    return m243constructorimpl;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                a4 = (AdQualityVerificationResult) obj;
                Object m243constructorimpl2 = Result.m243constructorimpl(a4);
                d4 = Result.d(m243constructorimpl2);
                if (d4 != null) {
                }
                return m243constructorimpl2;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f25641b;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f25643d;
        if (i4 != 0) {
        }
        a4 = (AdQualityVerificationResult) obj2;
        Object m243constructorimpl22 = Result.m243constructorimpl(a4);
        d4 = Result.d(m243constructorimpl22);
        if (d4 != null) {
        }
        return m243constructorimpl22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, kotlin.coroutines.d dVar) {
        b bVar;
        int i4;
        C1917f6 c1917f6;
        AdQualityVerificationResult adQualityVerificationResult;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i5 = bVar.f25647e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f25647e = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f25645c;
                Object f4 = AbstractC1241b.f();
                i4 = bVar.f25647e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    long millis = TimeUnit.SECONDS.toMillis(this.f25637c);
                    c cVar = new c(context, adQualityVerificationAdConfiguration, null);
                    bVar.f25644b = this;
                    bVar.f25647e = 1;
                    obj = o2.W0.d(millis, cVar, bVar);
                    if (obj == f4) {
                        return f4;
                    }
                    c1917f6 = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1917f6 = bVar.f25644b;
                    ResultKt.a(obj);
                }
                adQualityVerificationResult = (AdQualityVerificationResult) obj;
                if (adQualityVerificationResult == null) {
                    return adQualityVerificationResult;
                }
                c1917f6.getClass();
                return new AdQualityVerificationResult.Verified(new C2107n6(AdQualityVerificationMode.LONG_VERIFICATION, new AdQualityVerificationError.TimeoutError(c1917f6.f25637c)));
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f25645c;
        Object f42 = AbstractC1241b.f();
        i4 = bVar.f25647e;
        if (i4 != 0) {
        }
        adQualityVerificationResult = (AdQualityVerificationResult) obj2;
        if (adQualityVerificationResult == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0012, B:12:0x0038, B:15:0x0044, B:16:0x0056, B:18:0x005c, B:22:0x006f, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x0091, B:34:0x009a, B:36:0x00a3, B:38:0x00ac, B:55:0x0029, B:57:0x002f, B:58:0x0032, B:59:0x0035), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0012, B:12:0x0038, B:15:0x0044, B:16:0x0056, B:18:0x005c, B:22:0x006f, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x0091, B:34:0x009a, B:36:0x00a3, B:38:0x00ac, B:55:0x0029, B:57:0x002f, B:58:0x0032, B:59:0x0035), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0012, B:12:0x0038, B:15:0x0044, B:16:0x0056, B:18:0x005c, B:22:0x006f, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x0091, B:34:0x009a, B:36:0x00a3, B:38:0x00ac, B:55:0x0029, B:57:0x002f, B:58:0x0032, B:59:0x0035), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0012, B:12:0x0038, B:15:0x0044, B:16:0x0056, B:18:0x005c, B:22:0x006f, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x0091, B:34:0x009a, B:36:0x00a3, B:38:0x00ac, B:55:0x0029, B:57:0x002f, B:58:0x0032, B:59:0x0035), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0012, B:12:0x0038, B:15:0x0044, B:16:0x0056, B:18:0x005c, B:22:0x006f, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x0091, B:34:0x009a, B:36:0x00a3, B:38:0x00ac, B:55:0x0029, B:57:0x002f, B:58:0x0032, B:59:0x0035), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0012, B:12:0x0038, B:15:0x0044, B:16:0x0056, B:18:0x005c, B:22:0x006f, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x0091, B:34:0x009a, B:36:0x00a3, B:38:0x00ac, B:55:0x0029, B:57:0x002f, B:58:0x0032, B:59:0x0035), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006e A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull Object adObject, @Nullable C2360y7<?> c2360y7, @NotNull C2286v2 adConfiguration, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull kotlin.coroutines.d dVar) {
        int ordinal;
        AdQualityVerifierAdType adQualityVerifierAdType;
        AdQualityVerifierAdType adQualityVerifierAdType2;
        String c4;
        String value;
        Iterator<E> it;
        Object obj;
        AdQualityVerifiableNetwork a4;
        this.f25640f.getClass();
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        try {
            Result.Companion companion = Result.Companion;
            ordinal = adConfiguration.b().ordinal();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            r11 = Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl;
        }
        if (ordinal == 0) {
            adQualityVerifierAdType = AdQualityVerifierAdType.BANNER;
        } else if (ordinal == 1) {
            adQualityVerifierAdType = AdQualityVerifierAdType.INTERSTITIAL;
        } else if (ordinal == 2) {
            adQualityVerifierAdType = AdQualityVerifierAdType.REWARDED;
        } else if (ordinal == 3) {
            adQualityVerifierAdType = AdQualityVerifierAdType.NATIVE;
        } else {
            adQualityVerifierAdType2 = null;
            c4 = adConfiguration.c();
            value = adConfiguration.i();
            if (value == null) {
                value = "yandex";
            }
            EnumC1941g6.f26009c.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            it = EnumC1941g6.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((EnumC1941g6) obj).b(), value)) {
                    break;
                }
            }
            a4 = EnumC1941g6.a.a((EnumC1941g6) obj);
            if (adQualityVerifierAdType2 != null && c4 != null && a4 != null) {
                r11 = new AdQualityVerificationAdConfiguration(a4, c4, adObject, adQualityVerifierAdType2, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdContent() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdUnitId() : null, c2360y7 == null ? c2360y7.d() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdId() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getExtraData() : null);
            }
            if (r11 == null) {
                return a(context, r11, dVar);
            }
            return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.InternalError("Failed to create ad configuration for verification"));
        }
        adQualityVerifierAdType2 = adQualityVerifierAdType;
        c4 = adConfiguration.c();
        value = adConfiguration.i();
        if (value == null) {
        }
        EnumC1941g6.f26009c.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        it = EnumC1941g6.a().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        a4 = EnumC1941g6.a.a((EnumC1941g6) obj);
        if (adQualityVerifierAdType2 != null) {
            r11 = new AdQualityVerificationAdConfiguration(a4, c4, adObject, adQualityVerifierAdType2, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdContent() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdUnitId() : null, c2360y7 == null ? c2360y7.d() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdId() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getExtraData() : null);
        }
        if (r11 == null) {
        }
    }
}
