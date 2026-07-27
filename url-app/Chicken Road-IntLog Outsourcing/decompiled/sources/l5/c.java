package l5;

import B0.t;
import H2.f;
import H2.l;
import H2.m;
import H2.o;
import R4.j;
import android.content.Context;
import android.media.AudioManager;
import f4.C0430g;
import g4.AbstractC0476u;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import m5.n;

/* loaded from: classes.dex */
public final class c implements D2.b {

    /* renamed from: a, reason: collision with root package name */
    public t f11070a;

    /* renamed from: b, reason: collision with root package name */
    public Context f11071b;

    /* renamed from: c, reason: collision with root package name */
    public f f11072c;

    /* renamed from: d, reason: collision with root package name */
    public B0.c f11073d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f11074e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public a f11075f = new a(false, false, 2, 1, 1, 0);

    public static void c(n player, boolean z) {
        i.e(player, "player");
        player.f11247b.m("audio.onPrepared", AbstractC0476u.V(new C0430g("value", Boolean.valueOf(z))));
    }

    public final AudioManager a() {
        Context context = this.f11071b;
        if (context == null) {
            i.l("context");
            throw null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        i.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void b(String message) {
        i.e(message, "message");
        t tVar = this.f11070a;
        if (tVar != null) {
            tVar.m("audio.onLog", AbstractC0476u.V(new C0430g("value", message)));
        } else {
            i.l("globalEvents");
            throw null;
        }
    }

    @Override // D2.b
    public final void onAttachedToEngine(D2.a binding) {
        i.e(binding, "binding");
        this.f11071b = binding.f433a;
        f fVar = binding.f435c;
        this.f11072c = fVar;
        this.f11073d = new B0.c(this);
        final int i2 = 0;
        new o(fVar, "xyz.luan/audioplayers").b(new m(this) { // from class: l5.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f11069b;

            {
                this.f11069b = this;
            }

            @Override // H2.m
            public final void onMethodCall(l call, H2.n nVar) {
                switch (i2) {
                    case 0:
                        i.e(call, "call");
                        c cVar = this.f11069b;
                        j jVar = new j(2, cVar, c.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                        G2.i iVar = (G2.i) nVar;
                        cVar.getClass();
                        try {
                            jVar.invoke(call, iVar);
                            break;
                        } catch (Throwable th) {
                            iVar.b("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        i.e(call, "call");
                        c cVar2 = this.f11069b;
                        j jVar2 = new j(2, cVar2, c.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 2);
                        G2.i iVar2 = (G2.i) nVar;
                        cVar2.getClass();
                        try {
                            jVar2.invoke(call, iVar2);
                            break;
                        } catch (Throwable th2) {
                            iVar2.b("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        final int i3 = 1;
        new o(fVar, "xyz.luan/audioplayers.global").b(new m(this) { // from class: l5.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f11069b;

            {
                this.f11069b = this;
            }

            @Override // H2.m
            public final void onMethodCall(l call, H2.n nVar) {
                switch (i3) {
                    case 0:
                        i.e(call, "call");
                        c cVar = this.f11069b;
                        j jVar = new j(2, cVar, c.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                        G2.i iVar = (G2.i) nVar;
                        cVar.getClass();
                        try {
                            jVar.invoke(call, iVar);
                            break;
                        } catch (Throwable th) {
                            iVar.b("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        i.e(call, "call");
                        c cVar2 = this.f11069b;
                        j jVar2 = new j(2, cVar2, c.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 2);
                        G2.i iVar2 = (G2.i) nVar;
                        cVar2.getClass();
                        try {
                            jVar2.invoke(call, iVar2);
                            break;
                        } catch (Throwable th2) {
                            iVar2.b("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        this.f11070a = new t(new B4.i(fVar, "xyz.luan/audioplayers.global/events"));
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a binding) {
        i.e(binding, "binding");
        ConcurrentHashMap concurrentHashMap = this.f11074e;
        Collection<n> values = concurrentHashMap.values();
        i.d(values, "<get-values>(...)");
        for (n nVar : values) {
            nVar.e();
            nVar.f11247b.c();
        }
        concurrentHashMap.clear();
        B0.c cVar = this.f11073d;
        if (cVar == null) {
            i.l("soundPoolManager");
            throw null;
        }
        HashMap hashMap = (HashMap) cVar.f141c;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            m5.m mVar = (m5.m) ((Map.Entry) it.next()).getValue();
            mVar.f11243a.release();
            mVar.f11244b.clear();
            mVar.f11245c.clear();
        }
        hashMap.clear();
        t tVar = this.f11070a;
        if (tVar == null) {
            i.l("globalEvents");
            throw null;
        }
        tVar.c();
    }
}
