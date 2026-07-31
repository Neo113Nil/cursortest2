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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Yd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f38557a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f38558b = Ia.j().w().e();

    /* renamed from: c, reason: collision with root package name */
    public final C2518be f38559c;

    public Yd(@NotNull Context context, @NotNull C2628fh c2628fh, @NotNull Function1<? super String, Unit> function1, @NotNull InterfaceC2652ge interfaceC2652ge, @NotNull EnumC3063wb enumC3063wb, @NotNull String str) {
        this.f38557a = function1;
        this.f38559c = new C2518be(context, c2628fh, interfaceC2652ge, enumC3063wb);
    }

    public static final void a(Yd yd, NativeCrash nativeCrash, File file) {
        yd.f38557a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        B0 b02;
        C3010ua c3010ua;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C0 a4 = D0.a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(a4);
            b02 = new B0(source, handlerVersion, uuid, dumpFile, creationTime, a4);
        } catch (Throwable unused) {
            b02 = null;
        }
        if (b02 == null) {
            this.f38557a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(b02.f37202f.f37266a).info("Detected native crash with uuid = " + b02.f37199c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f38558b;
        C2518be c2518be = this.f38559c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.dp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Yd.a(Yd.this, nativeCrash, (File) obj);
            }
        };
        c2518be.getClass();
        Ud ud = new Ud(new Wd(b02.f37197a, b02.f37198b), c2518be.f38725f);
        Rd rd = new Rd(c2518be.f38721b, b02.f37202f, new C2491ae(b02, c2518be.f38723d));
        C3036va c3036va = c2518be.f38724e;
        String str = b02.f37200d;
        c3036va.getClass();
        File file = new File(str);
        Context context = c2518be.f38720a;
        if (C3010ua.f39931c == null) {
            synchronized (kotlin.jvm.internal.H.b(C3010ua.class)) {
                try {
                    if (C3010ua.f39931c == null) {
                        C3010ua.f39931c = new C3010ua(context);
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3010ua c3010ua2 = C3010ua.f39931c;
        if (c3010ua2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c3010ua = null;
        } else {
            c3010ua = c3010ua2;
        }
        iHandlerExecutor.execute(new RunnableC2654gg(file, ud, consumer, rd, c3010ua, c2518be.f38722c.a(b02)));
    }
}
