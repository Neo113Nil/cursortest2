package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Qd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1441l f7331a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f7332b = C1027ua.k().x().e();

    /* renamed from: c, reason: collision with root package name */
    public final Td f7333c;

    public Qd(Context context, Xg xg, InterfaceC1441l interfaceC1441l, Yd yd, EnumC0718ib enumC0718ib, String str) {
        this.f7331a = interfaceC1441l;
        this.f7333c = new Td(context, xg, yd, enumC0718ib);
    }

    public static final void a(Qd qd, NativeCrash nativeCrash, File file) {
        qd.f7331a.invoke(nativeCrash.getUuid());
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
            F0 a6 = G0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.i.b(a6);
            e02 = new E0(source, handlerVersion, uuid, dumpFile, creationTime, a6);
        } catch (Throwable unused) {
            e02 = null;
        }
        if (e02 == null) {
            this.f7331a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(e02.f6707f.f6761a).info("Detected native crash with uuid = " + e02.f6704c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f7332b;
        Td td = this.f7333c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Lo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Qd.a(Qd.this, nativeCrash, (File) obj);
            }
        };
        td.getClass();
        Md md = new Md(new Od(e02.f6702a, e02.f6703b), td.f7536f);
        Jd jd = new Jd(td.f7532b, e02.f6707f, new Sd(e02, td.f7534d));
        C0691ha c0691ha = td.f7535e;
        String str = e02.f6705d;
        c0691ha.getClass();
        File file = new File(str);
        Context context = td.f7531a;
        if (C0665ga.f8264c == null) {
            synchronized (kotlin.jvm.internal.t.a(C0665ga.class)) {
                if (C0665ga.f8264c == null) {
                    C0665ga.f8264c = new C0665ga(context);
                }
            }
        }
        C0665ga c0665ga = C0665ga.f8264c;
        if (c0665ga != null) {
            iHandlerExecutor.execute(new Yf(file, md, consumer, jd, c0665ga, td.f7533c.a(e02)));
        } else {
            kotlin.jvm.internal.i.l("INSTANCE");
            throw null;
        }
    }
}
