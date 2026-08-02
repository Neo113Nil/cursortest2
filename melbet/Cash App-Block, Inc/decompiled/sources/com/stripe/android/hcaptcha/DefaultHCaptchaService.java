package com.stripe.android.hcaptcha;

import android.os.Handler;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.trace.api.Platform;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.n;
import com.google.common.base.Joiner;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.hcaptcha.HCaptchaService$Result;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.HCaptchaTokenResponse;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.config.HCaptchaOrientation;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.config.HCaptchaTheme;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnSuccessListener;
import com.stripe.hcaptcha.webview.HCaptchaHeadlessWebView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultHCaptchaService {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long TIMEOUT;
    public final StateFlowImpl cachedResult = FlowKt.MutableStateFlow(CachedResult.Idle.INSTANCE);
    public final n captchaEventsReporter;

    public interface CachedResult {

        public final class Failure implements CachedResult {
            public final Throwable error;

            public Failure(Throwable th) {
                th.getClass();
                this.error = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) obj).error);
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.error);
            }
        }

        public final class Idle implements CachedResult {
            public static final Idle INSTANCE = new Idle();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public final int hashCode() {
                return -295788896;
            }

            public final String toString() {
                return "Idle";
            }
        }

        public final class Loading implements CachedResult {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 98270960;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class Success implements CachedResult {
            public final long createdAt;
            public final String token;

            public Success(String str, long j) {
                str.getClass();
                this.token = str;
                this.createdAt = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.token, success.token) && this.createdAt == success.createdAt;
            }

            public final int hashCode() {
                return Long.hashCode(this.createdAt) + (this.token.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("Success(token=", this.token, ", createdAt=", this.createdAt);
                m.append(")");
                return m.toString();
            }
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        TIMEOUT = DurationKt.toDuration(6, DurationUnit.SECONDS);
    }

    public DefaultHCaptchaService(HCaptchaModule hCaptchaModule, n nVar) {
        this.captchaEventsReporter = nVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(4:17|18|19|20))(9:37|(1:61)(2:41|(1:47)(2:45|46))|48|49|50|51|52|(1:54)|29)|21|22|23|24|(1:26)|27))|62|6|7|(0)(0)|21|22|23|24|(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
    
        if (kotlin.Unit.INSTANCE != r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPassiveHCaptcha(FragmentActivity fragmentActivity, String str, String str2, Integer num, ContinuationImpl continuationImpl) {
        DefaultHCaptchaService$performPassiveHCaptcha$1 defaultHCaptchaService$performPassiveHCaptcha$1;
        int i;
        boolean z;
        boolean z2;
        Object obj;
        n nVar;
        DurationProvider durationProvider;
        String str3;
        boolean z3;
        String str4;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        HCaptchaService$Result hCaptchaService$Result;
        n nVar2 = this.captchaEventsReporter;
        DurationProvider durationProvider2 = (DurationProvider) nVar2.c;
        if (continuationImpl instanceof DefaultHCaptchaService$performPassiveHCaptcha$1) {
            defaultHCaptchaService$performPassiveHCaptcha$1 = (DefaultHCaptchaService$performPassiveHCaptcha$1) continuationImpl;
            int i2 = defaultHCaptchaService$performPassiveHCaptcha$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultHCaptchaService$performPassiveHCaptcha$1.label = i2 - PKIFailureInfo.systemUnavail;
                DefaultHCaptchaService$performPassiveHCaptcha$1 defaultHCaptchaService$performPassiveHCaptcha$12 = defaultHCaptchaService$performPassiveHCaptcha$1;
                Object obj2 = defaultHCaptchaService$performPassiveHCaptcha$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultHCaptchaService$performPassiveHCaptcha$12.label;
                CachedResult.Idle idle = CachedResult.Idle.INSTANCE;
                StateFlowImpl stateFlowImpl = this.cachedResult;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    DurationProvider.start$default(durationProvider2, DurationProvider.Key.CaptchaAttach);
                    CachedResult cachedResult = (CachedResult) stateFlowImpl.getValue();
                    if (cachedResult.equals(CachedResult.Loading.INSTANCE) || cachedResult.equals(idle)) {
                        z = false;
                    } else {
                        if (!(cachedResult instanceof CachedResult.Failure) && !(cachedResult instanceof CachedResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z = true;
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        long j = TIMEOUT;
                        z2 = z;
                        obj = null;
                        nVar = nVar2;
                        durationProvider = durationProvider2;
                        str3 = str;
                        try {
                            WorkflowLayout$start$1 workflowLayout$start$1 = new WorkflowLayout$start$1(this, fragmentActivity, str3, str2, num, null, 28);
                            defaultHCaptchaService$performPassiveHCaptcha$12.L$1 = str3;
                            defaultHCaptchaService$performPassiveHCaptcha$12.L$4 = null;
                            defaultHCaptchaService$performPassiveHCaptcha$12.Z$0 = z2;
                            defaultHCaptchaService$performPassiveHCaptcha$12.label = 1;
                            obj2 = JobKt.m4184withTimeoutKLykuaI(j, workflowLayout$start$1, defaultHCaptchaService$performPassiveHCaptcha$12);
                            if (obj2 != coroutineSingletons) {
                                str4 = str3;
                                z3 = z2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z3 = z2;
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                            }
                            hCaptchaService$Result = (HCaptchaService$Result) failure;
                            defaultHCaptchaService$performPassiveHCaptcha$12.L$1 = str3;
                            defaultHCaptchaService$performPassiveHCaptcha$12.L$4 = hCaptchaService$Result;
                            defaultHCaptchaService$performPassiveHCaptcha$12.Z$0 = z3;
                            defaultHCaptchaService$performPassiveHCaptcha$12.label = 2;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(obj, idle);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z;
                        obj = null;
                        nVar = nVar2;
                        durationProvider = durationProvider2;
                        str3 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = defaultHCaptchaService$performPassiveHCaptcha$12.Z$0;
                    hCaptchaService$Result = defaultHCaptchaService$performPassiveHCaptcha$12.L$4;
                    str3 = defaultHCaptchaService$performPassiveHCaptcha$12.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    nVar = nVar2;
                    durationProvider = durationProvider2;
                    str3.getClass();
                    nVar.fireEvent(new Lazy(z3, str3), n.m1943durationInMsFromStartBwNAW2A(((DefaultDurationProvider) durationProvider).m4011endLV8wdWc(DurationProvider.Key.CaptchaAttach)));
                    return hCaptchaService$Result;
                }
                z3 = defaultHCaptchaService$performPassiveHCaptcha$12.Z$0;
                str4 = defaultHCaptchaService$performPassiveHCaptcha$12.L$1;
                try {
                    SafeTrace.throwOnFailure(obj2);
                    obj = null;
                    nVar = nVar2;
                    durationProvider = durationProvider2;
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                    nVar = nVar2;
                    durationProvider = durationProvider2;
                    str3 = str4;
                    Result.Companion companion22 = Result.Companion;
                    failure = new Result.Failure(th);
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    hCaptchaService$Result = (HCaptchaService$Result) failure;
                    defaultHCaptchaService$performPassiveHCaptcha$12.L$1 = str3;
                    defaultHCaptchaService$performPassiveHCaptcha$12.L$4 = hCaptchaService$Result;
                    defaultHCaptchaService$performPassiveHCaptcha$12.Z$0 = z3;
                    defaultHCaptchaService$performPassiveHCaptcha$12.label = 2;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(obj, idle);
                }
                failure = (HCaptchaService$Result) obj2;
                Result.Companion companion3 = Result.Companion;
                str3 = str4;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    failure = new HCaptchaService$Result.Failure(m4120exceptionOrNullimpl);
                }
                hCaptchaService$Result = (HCaptchaService$Result) failure;
                defaultHCaptchaService$performPassiveHCaptcha$12.L$1 = str3;
                defaultHCaptchaService$performPassiveHCaptcha$12.L$4 = hCaptchaService$Result;
                defaultHCaptchaService$performPassiveHCaptcha$12.Z$0 = z3;
                defaultHCaptchaService$performPassiveHCaptcha$12.label = 2;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(obj, idle);
            }
        }
        defaultHCaptchaService$performPassiveHCaptcha$1 = new DefaultHCaptchaService$performPassiveHCaptcha$1(this, continuationImpl);
        DefaultHCaptchaService$performPassiveHCaptcha$1 defaultHCaptchaService$performPassiveHCaptcha$122 = defaultHCaptchaService$performPassiveHCaptcha$1;
        Object obj22 = defaultHCaptchaService$performPassiveHCaptcha$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultHCaptchaService$performPassiveHCaptcha$122.label;
        CachedResult.Idle idle2 = CachedResult.Idle.INSTANCE;
        StateFlowImpl stateFlowImpl2 = this.cachedResult;
        if (i != 0) {
        }
        failure = (HCaptchaService$Result) obj22;
        Result.Companion companion32 = Result.Companion;
        str3 = str4;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
        hCaptchaService$Result = (HCaptchaService$Result) failure;
        defaultHCaptchaService$performPassiveHCaptcha$122.L$1 = str3;
        defaultHCaptchaService$performPassiveHCaptcha$122.L$4 = hCaptchaService$Result;
        defaultHCaptchaService$performPassiveHCaptcha$122.Z$0 = z3;
        defaultHCaptchaService$performPassiveHCaptcha$122.label = 2;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(obj, idle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPassiveHCaptchaHelper(FragmentActivity fragmentActivity, String str, String str2, ContinuationImpl continuationImpl) {
        DefaultHCaptchaService$performPassiveHCaptchaHelper$1 defaultHCaptchaService$performPassiveHCaptchaHelper$1;
        int i;
        Throwable th;
        HCaptcha hCaptcha;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        HCaptchaService$Result hCaptchaService$Result;
        n nVar = this.captchaEventsReporter;
        DurationProvider durationProvider = (DurationProvider) nVar.c;
        if (continuationImpl instanceof DefaultHCaptchaService$performPassiveHCaptchaHelper$1) {
            defaultHCaptchaService$performPassiveHCaptchaHelper$1 = (DefaultHCaptchaService$performPassiveHCaptchaHelper$1) continuationImpl;
            int i2 = defaultHCaptchaService$performPassiveHCaptchaHelper$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultHCaptchaService$performPassiveHCaptchaHelper$1.label = i2 - PKIFailureInfo.systemUnavail;
                DefaultHCaptchaService$performPassiveHCaptchaHelper$1 defaultHCaptchaService$performPassiveHCaptchaHelper$12 = defaultHCaptchaService$performPassiveHCaptchaHelper$1;
                Object obj = defaultHCaptchaService$performPassiveHCaptchaHelper$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultHCaptchaService$performPassiveHCaptchaHelper$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    HCaptchaInternalConfig hCaptchaInternalConfig = new HCaptchaInternalConfig();
                    HCaptcha hCaptcha2 = new HCaptcha(0);
                    hCaptcha2.internalConfig = hCaptchaInternalConfig;
                    str.getClass();
                    DurationProvider.start$default(durationProvider, DurationProvider.Key.Captcha);
                    Platform.JvmRuntime jvmRuntime = new Platform.JvmRuntime(str);
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    nVar.fireEvent(jvmRuntime, emptyMap);
                    try {
                        Result.Companion companion = Result.Companion;
                        defaultHCaptchaService$performPassiveHCaptchaHelper$12.L$1 = str;
                        defaultHCaptchaService$performPassiveHCaptchaHelper$12.L$3 = hCaptcha2;
                        defaultHCaptchaService$performPassiveHCaptchaHelper$12.label = 1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        obj = startVerification(fragmentActivity, str, str2, hCaptcha2, defaultHCaptchaService$performPassiveHCaptchaHelper$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str;
                        hCaptcha = hCaptcha2;
                    } catch (Throwable th3) {
                        th = th3;
                        str = str;
                        hCaptcha = hCaptcha2;
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        hCaptchaService$Result = (HCaptchaService$Result) failure;
                        if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Failure)) {
                        }
                        hCaptcha.reset();
                        return hCaptchaService$Result;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hCaptcha = defaultHCaptchaService$performPassiveHCaptchaHelper$12.L$3;
                    str = defaultHCaptchaService$performPassiveHCaptchaHelper$12.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion22 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        hCaptchaService$Result = (HCaptchaService$Result) failure;
                        if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Failure)) {
                        }
                        hCaptcha.reset();
                        return hCaptchaService$Result;
                    }
                }
                failure = (HCaptchaService$Result) obj;
                Result.Companion companion3 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    failure = new HCaptchaService$Result.Failure(m4120exceptionOrNullimpl);
                }
                hCaptchaService$Result = (HCaptchaService$Result) failure;
                if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Failure)) {
                    Throwable th5 = ((HCaptchaService$Result.Failure) hCaptchaService$Result).error;
                    str.getClass();
                    Duration m4011endLV8wdWc = ((DefaultDurationProvider) durationProvider).m4011endLV8wdWc(DurationProvider.Key.Captcha);
                    boolean z = th5 instanceof HCaptchaException;
                    RealErrorReporter realErrorReporter = (RealErrorReporter) nVar.d;
                    if (z) {
                        RealErrorReporter.report$default(realErrorReporter, ErrorReporter$ExpectedErrorEvent.HCAPTCHA_FAILURE, null, null, 6);
                    } else {
                        RealErrorReporter.report$default(realErrorReporter, ErrorReporter$UnexpectedErrorEvent.HCAPTCHA_UNEXPECTED_FAILURE, null, null, 6);
                    }
                    ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
                    toolbarTuckTargets.startCornerCenterX$delegate = str;
                    toolbarTuckTargets.endCornerCenterX$delegate = Thread$State$EnumUnboxingLocalUtility.m("error_message", th5 != null ? th5.getMessage() : null);
                    nVar.fireEvent(toolbarTuckTargets, n.m1943durationInMsFromStartBwNAW2A(m4011endLV8wdWc));
                } else {
                    if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str.getClass();
                    nVar.fireEvent(new Joiner(str, false), n.m1943durationInMsFromStartBwNAW2A(((DefaultDurationProvider) durationProvider).m4011endLV8wdWc(DurationProvider.Key.Captcha)));
                }
                hCaptcha.reset();
                return hCaptchaService$Result;
            }
        }
        defaultHCaptchaService$performPassiveHCaptchaHelper$1 = new DefaultHCaptchaService$performPassiveHCaptchaHelper$1(this, continuationImpl);
        DefaultHCaptchaService$performPassiveHCaptchaHelper$1 defaultHCaptchaService$performPassiveHCaptchaHelper$122 = defaultHCaptchaService$performPassiveHCaptchaHelper$1;
        Object obj2 = defaultHCaptchaService$performPassiveHCaptchaHelper$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultHCaptchaService$performPassiveHCaptchaHelper$122.label;
        if (i != 0) {
        }
        failure = (HCaptchaService$Result) obj2;
        Result.Companion companion32 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
        hCaptchaService$Result = (HCaptchaService$Result) failure;
        if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Failure)) {
        }
        hCaptcha.reset();
        return hCaptchaService$Result;
    }

    public final Object startVerification(FragmentActivity fragmentActivity, String str, String str2, HCaptcha hCaptcha, DefaultHCaptchaService$performPassiveHCaptchaHelper$1 defaultHCaptchaService$performPassiveHCaptchaHelper$1) {
        HCaptchaSize hCaptchaSize = HCaptchaSize.INVISIBLE;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(defaultHCaptchaService$performPassiveHCaptchaHelper$1));
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new KClasses$$Lambda$2(hCaptcha, 22));
        ((ArrayList) hCaptcha.onSuccessListeners).add(new OnSuccessListener() { // from class: com.stripe.android.hcaptcha.DefaultHCaptchaService$startVerification$2$2
            @Override // com.stripe.hcaptcha.task.OnSuccessListener
            public final void onSuccess(Object obj) {
                HCaptchaTokenResponse hCaptchaTokenResponse = (HCaptchaTokenResponse) obj;
                hCaptchaTokenResponse.getClass();
                Result.Companion companion = Result.Companion;
                CancellableContinuationImpl.this.resumeWith(new HCaptchaService$Result.Success(hCaptchaTokenResponse.tokenResult));
            }
        });
        hCaptcha.tryCallbacks();
        ((ArrayList) hCaptcha.onFailureListeners).add(new OnFailureListener() { // from class: com.stripe.android.hcaptcha.DefaultHCaptchaService$startVerification$2$3
            @Override // com.stripe.hcaptcha.task.OnFailureListener
            public final void onFailure(HCaptchaException hCaptchaException) {
                hCaptchaException.getClass();
                Result.Companion companion = Result.Companion;
                CancellableContinuationImpl.this.resumeWith(new HCaptchaService$Result.Failure(hCaptchaException));
            }
        });
        hCaptcha.tryCallbacks();
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        HCaptchaOrientation hCaptchaOrientation = HCaptchaOrientation.PORTRAIT;
        HCaptchaTheme hCaptchaTheme = HCaptchaTheme.LIGHT;
        Duration.Companion companion = Duration.Companion;
        HCaptchaConfig hCaptchaConfig = new HCaptchaConfig(str, true, false, true, str2, "https://js.hcaptcha.com/1/api.js", (String) null, (String) null, (String) null, (String) null, language, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, "stripecdn.com", (String) null, (Function2) DefaultHCaptchaService$startVerification$2$config$1.INSTANCE, DurationKt.toDuration(120, DurationUnit.SECONDS), true);
        HCaptchaInternalConfig hCaptchaInternalConfig = (HCaptchaInternalConfig) hCaptcha.internalConfig;
        fragmentActivity.getClass();
        int i = 0;
        HCaptchaStateListener hCaptchaStateListener = new HCaptchaStateListener(new HCaptcha$$ExternalSyntheticLambda0(hCaptcha, i), new HCaptcha$$ExternalSyntheticLambda1(i, hCaptcha, hCaptchaConfig), new HCaptcha$$ExternalSyntheticLambda2(hCaptcha, i));
        try {
            hCaptcha.captchaVerifier = new HCaptchaHeadlessWebView(fragmentActivity, HCaptchaConfig.m4082copyZIzw2bI$default(hCaptchaConfig), hCaptchaInternalConfig, hCaptchaStateListener);
        } catch (AndroidRuntimeException unused) {
            hCaptchaStateListener.onFailure.invoke(new HCaptchaException(HCaptchaError.ERROR));
        }
        IHCaptchaVerifier iHCaptchaVerifier = (IHCaptchaVerifier) hCaptcha.captchaVerifier;
        if (iHCaptchaVerifier == null) {
            a$$ExternalSyntheticBUOutline0.m$1("verifyWithHCaptcha must not be called before setup.");
            return null;
        }
        ((Handler) hCaptcha.handler).removeCallbacksAndMessages(null);
        iHCaptchaVerifier.startVerification(fragmentActivity);
        Obfuscator obfuscator = new Obfuscator(str, 4);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.captchaEventsReporter.fireEvent(obfuscator, emptyMap);
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r13 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object warmUp(FragmentActivity fragmentActivity, String str, String str2, ContinuationImpl continuationImpl) {
        DefaultHCaptchaService$warmUp$1 defaultHCaptchaService$warmUp$1;
        int i;
        Object success;
        if (continuationImpl instanceof DefaultHCaptchaService$warmUp$1) {
            defaultHCaptchaService$warmUp$1 = (DefaultHCaptchaService$warmUp$1) continuationImpl;
            int i2 = defaultHCaptchaService$warmUp$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultHCaptchaService$warmUp$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultHCaptchaService$warmUp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultHCaptchaService$warmUp$1.label;
                StateFlowImpl stateFlowImpl = this.cachedResult;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CachedResult cachedResult = (CachedResult) stateFlowImpl.getValue();
                    boolean z = cachedResult instanceof CachedResult.Failure;
                    CachedResult.Loading loading = CachedResult.Loading.INSTANCE;
                    if (!z && !cachedResult.equals(CachedResult.Idle.INSTANCE)) {
                        if (cachedResult.equals(loading) || (cachedResult instanceof CachedResult.Success)) {
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    defaultHCaptchaService$warmUp$1.L$0 = fragmentActivity;
                    defaultHCaptchaService$warmUp$1.L$1 = str;
                    defaultHCaptchaService$warmUp$1.L$2 = str2;
                    defaultHCaptchaService$warmUp$1.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, loading);
                } else if (i == 1) {
                    str2 = defaultHCaptchaService$warmUp$1.L$2;
                    str = defaultHCaptchaService$warmUp$1.L$1;
                    fragmentActivity = defaultHCaptchaService$warmUp$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    HCaptchaService$Result hCaptchaService$Result = (HCaptchaService$Result) obj;
                    if (hCaptchaService$Result instanceof HCaptchaService$Result.Failure) {
                        success = new CachedResult.Failure(((HCaptchaService$Result.Failure) hCaptchaService$Result).error);
                    } else {
                        if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        success = new CachedResult.Success(((HCaptchaService$Result.Success) hCaptchaService$Result).token, SystemClock.elapsedRealtime());
                    }
                    defaultHCaptchaService$warmUp$1.L$0 = null;
                    defaultHCaptchaService$warmUp$1.L$1 = null;
                    defaultHCaptchaService$warmUp$1.L$2 = null;
                    defaultHCaptchaService$warmUp$1.label = 3;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, success);
                }
                defaultHCaptchaService$warmUp$1.L$0 = null;
                defaultHCaptchaService$warmUp$1.L$1 = null;
                defaultHCaptchaService$warmUp$1.L$2 = null;
                defaultHCaptchaService$warmUp$1.label = 2;
                obj = performPassiveHCaptchaHelper(fragmentActivity, str, str2, defaultHCaptchaService$warmUp$1);
            }
        }
        defaultHCaptchaService$warmUp$1 = new DefaultHCaptchaService$warmUp$1(this, continuationImpl);
        Object obj3 = defaultHCaptchaService$warmUp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultHCaptchaService$warmUp$1.label;
        StateFlowImpl stateFlowImpl2 = this.cachedResult;
        if (i != 0) {
        }
        defaultHCaptchaService$warmUp$1.L$0 = null;
        defaultHCaptchaService$warmUp$1.L$1 = null;
        defaultHCaptchaService$warmUp$1.L$2 = null;
        defaultHCaptchaService$warmUp$1.label = 2;
        obj3 = performPassiveHCaptchaHelper(fragmentActivity, str, str2, defaultHCaptchaService$warmUp$1);
    }
}
