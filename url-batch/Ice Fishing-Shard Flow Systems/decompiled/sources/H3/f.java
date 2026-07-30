package H3;

import E3.m;
import X5.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import v5.C0977c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f976a;

    /* renamed from: b, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.c f977b;

    /* renamed from: c, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.a f978c;

    public f(m openTelemetryRemote, com.onesignal.debug.internal.logging.otel.android.c platformProvider, com.onesignal.debug.internal.logging.otel.android.a logger) {
        Intrinsics.checkNotNullParameter(openTelemetryRemote, "openTelemetryRemote");
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f976a = openTelemetryRemote;
        this.f977b = platformProvider;
        this.f978c = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(X5.c cVar) {
        e eVar;
        int i2;
        f fVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i5 = eVar.f975l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.f975l = i5 - Integer.MIN_VALUE;
                Object obj = eVar.f973e;
                W5.a aVar = W5.a.f2787d;
                i2 = eVar.f975l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.otel.android.c cVar2 = this.f977b;
                    Iterator it = P0.f.r(cVar2.getCrashStoragePath(), cVar2.getMinFileAgeForReadMillis()).f4160d.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    b(it);
                    long minFileAgeForReadMillis = cVar2.getMinFileAgeForReadMillis();
                    eVar.f972d = this;
                    eVar.f975l = 1;
                    if (AbstractC0792z.d(minFileAgeForReadMillis, eVar) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f972d;
                    V6.b.P(obj);
                }
                com.onesignal.debug.internal.logging.otel.android.c cVar3 = fVar.f977b;
                Iterator it2 = P0.f.r(cVar3.getCrashStoragePath(), cVar3.getMinFileAgeForReadMillis()).f4160d.iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                fVar.b(it2);
                return Unit.f6114a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f973e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = eVar.f975l;
        if (i2 != 0) {
        }
        com.onesignal.debug.internal.logging.otel.android.c cVar32 = fVar.f977b;
        Iterator it22 = P0.f.r(cVar32.getCrashStoragePath(), cVar32.getMinFileAgeForReadMillis()).f4160d.iterator();
        Intrinsics.checkNotNullExpressionValue(it22, "iterator(...)");
        fVar.b(it22);
        return Unit.f6114a;
    }

    public final void b(Iterator it) {
        B5.f fVar = (B5.f) this.f976a.f692g.getValue();
        boolean z7 = false;
        while (it.hasNext() && !z7) {
            C0977c p7 = fVar.p((Collection) it.next());
            com.onesignal.debug.internal.logging.otel.android.a aVar = this.f978c;
            aVar.debug("Sending OneSignal crash report");
            p7.c(30L, TimeUnit.SECONDS);
            z7 = !p7.b();
            aVar.debug("Done OneSignal crash report, failed: " + z7);
        }
    }

    public final Object c(j jVar) {
        String remoteLogLevel = this.f977b.getRemoteLogLevel();
        com.onesignal.debug.internal.logging.otel.android.a aVar = this.f978c;
        if (remoteLogLevel != null && !remoteLogLevel.equals("NONE")) {
            aVar.info("OtelCrashUploader: starting");
            Object a7 = a(jVar);
            return a7 == W5.a.f2787d ? a7 : Unit.f6114a;
        }
        aVar.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
        return Unit.f6114a;
    }
}
