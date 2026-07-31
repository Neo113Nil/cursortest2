package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class Kd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f919a;
    public final IHandlerExecutor b = C0401oa.k().w().d();
    public final Nd c;

    public Kd(Context context, Tg tg, Function1<? super String, Unit> function1, Sd sd, EnumC0095cb enumC0095cb, String str) {
        this.f919a = function1;
        this.c = new Nd(context, tg, sd, enumC0095cb);
    }

    public static final void a(Kd kd, NativeCrash nativeCrash, File file) {
        kd.f919a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        G0 g0;
        C0042aa c0042aa;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 a2 = I0.a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(a2);
            g0 = new G0(source, handlerVersion, str, dumpFile, creationTime, a2);
        } catch (Throwable unused) {
            g0 = null;
        }
        if (g0 == null) {
            this.f919a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g0.f.f865a).info("Detected native crash with uuid = " + g0.c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.b;
        Nd nd = this.c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Kd$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Kd.a(Kd.this, nativeCrash, (File) obj);
            }
        };
        nd.getClass();
        Gd gd = new Gd(new Id(g0.f853a, g0.b), nd.f);
        Dd dd = new Dd(nd.b, g0.f, new Md(g0, nd.d));
        C0068ba c0068ba = nd.e;
        String str2 = g0.d;
        c0068ba.getClass();
        File file = new File(str2);
        Context context = nd.f971a;
        if (C0042aa.c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C0042aa.class)) {
                if (C0042aa.c == null) {
                    C0042aa.c = new C0042aa(context);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        C0042aa c0042aa2 = C0042aa.c;
        if (c0042aa2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c0042aa = null;
        } else {
            c0042aa = c0042aa2;
        }
        iHandlerExecutor.execute(new Uf(file, gd, consumer, dd, c0042aa, nd.c.a(g0)));
    }
}
