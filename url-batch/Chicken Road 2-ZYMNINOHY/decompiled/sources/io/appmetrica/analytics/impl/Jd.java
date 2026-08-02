package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class Jd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1339l f10482a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f10483b = C0817na.k().w().d();

    /* renamed from: c, reason: collision with root package name */
    public final Md f10484c;

    public Jd(Context context, Sg sg, InterfaceC1339l interfaceC1339l, Rd rd, EnumC0508bb enumC0508bb, String str) {
        this.f10482a = interfaceC1339l;
        this.f10484c = new Md(context, sg, rd, enumC0508bb);
    }

    public static final void a(Jd jd, NativeCrash nativeCrash, File file) {
        jd.f10482a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        G0 g02;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 a3 = I0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.i.b(a3);
            g02 = new G0(source, handlerVersion, uuid, dumpFile, creationTime, a3);
        } catch (Throwable unused) {
            g02 = null;
        }
        if (g02 == null) {
            this.f10482a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g02.f10305f.f10348a).info("Detected native crash with uuid = " + g02.f10302c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f10483b;
        Md md = this.f10484c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Mo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Jd.a(Jd.this, nativeCrash, (File) obj);
            }
        };
        md.getClass();
        Fd fd = new Fd(new Hd(g02.f10300a, g02.f10301b), md.f10650f);
        Cd cd = new Cd(md.f10646b, g02.f10305f, new Ld(g02, md.f10648d));
        C0481aa c0481aa = md.f10649e;
        String str = g02.f10303d;
        c0481aa.getClass();
        File file = new File(str);
        Context context = md.f10645a;
        if (Z9.f11362c == null) {
            synchronized (kotlin.jvm.internal.q.a(Z9.class)) {
                if (Z9.f11362c == null) {
                    Z9.f11362c = new Z9(context);
                }
            }
        }
        Z9 z9 = Z9.f11362c;
        if (z9 != null) {
            iHandlerExecutor.execute(new Tf(file, fd, consumer, cd, z9, md.f10647c.a(g02)));
        } else {
            kotlin.jvm.internal.i.i("INSTANCE");
            throw null;
        }
    }
}
