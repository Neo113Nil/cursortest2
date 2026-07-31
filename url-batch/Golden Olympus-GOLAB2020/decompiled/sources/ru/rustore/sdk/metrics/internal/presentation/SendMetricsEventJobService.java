package ru.rustore.sdk.metrics.internal.presentation;

import W1.h;
import W1.i;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.metrics.MetricsTimeoutListener;
import ru.rustore.sdk.metrics.internal.w0;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDoOnDisposeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata
/* loaded from: classes3.dex */
public final class SendMetricsEventJobService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public final h f43740a = i.b(new a());

    /* renamed from: b, reason: collision with root package name */
    public Disposable f43741b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f43742c;

    public static final class a extends s implements Function0<w0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w0.f43775c.a(SendMetricsEventJobService.this);
        }
    }

    public static final class b extends s implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ((w0) SendMetricsEventJobService.this.f43740a.getValue()).f43777a.a();
            return Unit.f41027a;
        }
    }

    public static final class c extends s implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JobParameters f43746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JobParameters jobParameters) {
            super(0);
            this.f43746b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SendMetricsEventJobService.a(SendMetricsEventJobService.this, this.f43746b);
            return Unit.f41027a;
        }
    }

    public static final class d extends s implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JobParameters f43748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JobParameters jobParameters) {
            super(1);
            this.f43748b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            SendMetricsEventJobService.a(SendMetricsEventJobService.this, this.f43748b);
            return Unit.f41027a;
        }
    }

    public static final class e extends s implements Function1<Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JobParameters f43750b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JobParameters jobParameters) {
            super(1);
            this.f43750b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit it = (Unit) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMetricsEventJobService.a(SendMetricsEventJobService.this, this.f43750b);
            return Unit.f41027a;
        }
    }

    public static final void a(SendMetricsEventJobService sendMetricsEventJobService, JobParameters jobParameters) {
        if (sendMetricsEventJobService.f43742c) {
            return;
        }
        sendMetricsEventJobService.jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f43741b = SingleSubscribeKt.subscribe(SingleDoOnDisposeKt.doOnDispose(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new b()), Dispatchers.INSTANCE.getIo()), new c(params)), new d(params), new e(params));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        int stopReason;
        this.f43742c = true;
        Disposable disposable = this.f43741b;
        if (disposable != null) {
            disposable.dispose();
        }
        if (Build.VERSION.SDK_INT >= 31 && jobParameters != null) {
            stopReason = jobParameters.getStopReason();
            Integer valueOf = Integer.valueOf(stopReason);
            if (stopReason != 3) {
                valueOf = null;
            }
            if (valueOf != null) {
                MetricsTimeoutListener.INSTANCE.onHandleTimeout$sdk_public_metrics_release(valueOf.intValue(), jobParameters.getExtras().getInt("pending_jobs_count"));
            }
        }
        return true;
    }
}
