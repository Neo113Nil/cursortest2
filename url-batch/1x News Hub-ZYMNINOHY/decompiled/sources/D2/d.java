package D2;

import E2.p;
import P1.l;
import P1.m;
import P1.n;
import P1.o;
import android.content.Context;
import android.media.AudioManager;
import b2.C0190d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d implements L1.b {

    /* renamed from: a, reason: collision with root package name */
    public V0.e f233a;

    /* renamed from: b, reason: collision with root package name */
    public Context f234b;

    /* renamed from: c, reason: collision with root package name */
    public P1.f f235c;

    /* renamed from: d, reason: collision with root package name */
    public V0.e f236d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f237e = new ConcurrentHashMap();
    public a f = new a(false, false, 2, 1, 1, 0);

    public static void c(p player, boolean z) {
        j.e(player, "player");
        player.f460b.E("audio.onPrepared", c2.p.b0(new C0190d("value", Boolean.valueOf(z))));
    }

    public final AudioManager a() {
        Context context = this.f234b;
        if (context == null) {
            j.g("context");
            throw null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        j.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void b(String message) {
        j.e(message, "message");
        V0.e eVar = this.f233a;
        if (eVar != null) {
            eVar.E("audio.onLog", c2.p.b0(new C0190d("value", message)));
        } else {
            j.g("globalEvents");
            throw null;
        }
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a binding) {
        j.e(binding, "binding");
        this.f234b = binding.f887a;
        P1.f fVar = binding.f888b;
        this.f235c = fVar;
        this.f236d = new V0.e(this);
        final int i3 = 0;
        new o(fVar, "xyz.luan/audioplayers").b(new m(this) { // from class: D2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f231b;

            {
                this.f231b = this;
            }

            @Override // P1.m
            public final void onMethodCall(l call, n nVar) {
                switch (i3) {
                    case 0:
                        j.e(call, "call");
                        d dVar = this.f231b;
                        c cVar = new c(2, dVar, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0);
                        O1.j jVar = (O1.j) nVar;
                        dVar.getClass();
                        try {
                            cVar.invoke(call, jVar);
                            break;
                        } catch (Throwable th) {
                            jVar.b("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        j.e(call, "call");
                        d dVar2 = this.f231b;
                        c cVar2 = new c(2, dVar2, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                        O1.j jVar2 = (O1.j) nVar;
                        dVar2.getClass();
                        try {
                            cVar2.invoke(call, jVar2);
                            break;
                        } catch (Throwable th2) {
                            jVar2.b("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        final int i4 = 1;
        new o(fVar, "xyz.luan/audioplayers.global").b(new m(this) { // from class: D2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f231b;

            {
                this.f231b = this;
            }

            @Override // P1.m
            public final void onMethodCall(l call, n nVar) {
                switch (i4) {
                    case 0:
                        j.e(call, "call");
                        d dVar = this.f231b;
                        c cVar = new c(2, dVar, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0);
                        O1.j jVar = (O1.j) nVar;
                        dVar.getClass();
                        try {
                            cVar.invoke(call, jVar);
                            break;
                        } catch (Throwable th) {
                            jVar.b("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        j.e(call, "call");
                        d dVar2 = this.f231b;
                        c cVar2 = new c(2, dVar2, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                        O1.j jVar2 = (O1.j) nVar;
                        dVar2.getClass();
                        try {
                            cVar2.invoke(call, jVar2);
                            break;
                        } catch (Throwable th2) {
                            jVar2.b("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        this.f233a = new V0.e(new A0.f(fVar, "xyz.luan/audioplayers.global/events"));
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a binding) {
        j.e(binding, "binding");
        ConcurrentHashMap concurrentHashMap = this.f237e;
        Collection<p> values = concurrentHashMap.values();
        j.d(values, "<get-values>(...)");
        for (p pVar : values) {
            pVar.e();
            pVar.f460b.x();
        }
        concurrentHashMap.clear();
        V0.e eVar = this.f236d;
        if (eVar == null) {
            j.g("soundPoolManager");
            throw null;
        }
        HashMap hashMap = (HashMap) eVar.f1600c;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            E2.m mVar = (E2.m) ((Map.Entry) it.next()).getValue();
            mVar.f452a.release();
            mVar.f453b.clear();
            mVar.f454c.clear();
        }
        hashMap.clear();
        V0.e eVar2 = this.f233a;
        if (eVar2 == null) {
            j.g("globalEvents");
            throw null;
        }
        eVar2.x();
    }
}
