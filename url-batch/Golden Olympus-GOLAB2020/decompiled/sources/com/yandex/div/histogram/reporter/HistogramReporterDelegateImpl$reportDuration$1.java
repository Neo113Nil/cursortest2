package com.yandex.div.histogram.reporter;

import V1.a;
import com.yandex.div.histogram.HistogramRecorder;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlin.ranges.g;

@Metadata
/* loaded from: classes2.dex */
final class HistogramReporterDelegateImpl$reportDuration$1 extends s implements Function0<Unit> {
    final /* synthetic */ String $callType;
    final /* synthetic */ long $duration;
    final /* synthetic */ String $histogramName;
    final /* synthetic */ HistogramReporterDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistogramReporterDelegateImpl$reportDuration$1(HistogramReporterDelegateImpl histogramReporterDelegateImpl, String str, String str2, long j4) {
        super(0);
        this.this$0 = histogramReporterDelegateImpl;
        this.$histogramName = str;
        this.$callType = str2;
        this.$duration = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m229invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m229invoke() {
        a aVar;
        aVar = this.this$0.histogramRecorder;
        ((HistogramRecorder) aVar.get()).recordShortTimeHistogram(this.$histogramName + JwtParser.SEPARATOR_CHAR + this.$callType, g.e(this.$duration, 1L), TimeUnit.MILLISECONDS);
    }
}
