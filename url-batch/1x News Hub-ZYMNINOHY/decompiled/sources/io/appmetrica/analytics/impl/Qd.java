package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;

/* loaded from: classes.dex */
public final class Qd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final l2.l f6512a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6513b = C0876ua.k().x().e();

    /* renamed from: c, reason: collision with root package name */
    public final Td f6514c;

    public Qd(Context context, Xg xg, l2.l lVar, Yd yd, EnumC0567ib enumC0567ib, String str) {
        this.f6512a = lVar;
        this.f6514c = new Td(context, xg, yd, enumC0567ib);
    }

    public static final void a(Qd qd, NativeCrash nativeCrash, File file) {
        qd.f6512a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        E0 e02;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            F0 a3 = G0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.j.b(a3);
            e02 = new E0(source, handlerVersion, uuid, dumpFile, creationTime, a3);
        } catch (Throwable unused) {
            e02 = null;
        }
        if (e02 == null) {
            this.f6512a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(e02.f.f5972a).info("Detected native crash with uuid = " + e02.f5918c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f6513b;
        Td td = this.f6514c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Lo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Qd.a(Qd.this, nativeCrash, (File) obj);
            }
        };
        td.getClass();
        Md md = new Md(new Od(e02.f5916a, e02.f5917b), td.f);
        Jd jd = new Jd(td.f6704b, e02.f, new Sd(e02, td.f6706d));
        C0540ha c0540ha = td.f6707e;
        String str = e02.f5919d;
        c0540ha.getClass();
        File file = new File(str);
        Context context = td.f6703a;
        if (C0514ga.f7390c == null) {
            synchronized (kotlin.jvm.internal.r.a(C0514ga.class)) {
                if (C0514ga.f7390c == null) {
                    C0514ga.f7390c = new C0514ga(context);
                }
            }
        }
        C0514ga c0514ga = C0514ga.f7390c;
        if (c0514ga != null) {
            iHandlerExecutor.execute(new Yf(file, md, consumer, jd, c0514ga, td.f6705c.a(e02)));
        } else {
            kotlin.jvm.internal.j.g("INSTANCE");
            throw null;
        }
    }
}
