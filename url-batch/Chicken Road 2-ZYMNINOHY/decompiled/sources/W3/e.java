package W3;

import X3.l;
import X3.o;
import android.content.Context;
import android.media.AudioManager;
import c3.C0292d;
import d3.t;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    public f f3473a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3474b;

    /* renamed from: c, reason: collision with root package name */
    public BinaryMessenger f3475c;

    /* renamed from: d, reason: collision with root package name */
    public l2.e f3476d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f3477e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public a f3478f = new a(false, false, 2, 1, 1, 0);

    public static void c(o oVar, boolean z) {
        oVar.f3653b.a("audio.onPrepared", t.B(new C0292d("value", Boolean.valueOf(z))));
    }

    public final AudioManager a() {
        Context context = this.f3474b;
        if (context == null) {
            i.i("context");
            throw null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        i.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void b(String message) {
        i.e(message, "message");
        f fVar = this.f3473a;
        if (fVar != null) {
            fVar.a("audio.onLog", t.B(new C0292d("value", message)));
        } else {
            i.i("globalEvents");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        i.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        i.d(applicationContext, "getApplicationContext(...)");
        this.f3474b = applicationContext;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        this.f3475c = binaryMessenger;
        this.f3476d = new l2.e(this);
        final int i4 = 0;
        new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers").setMethodCallHandler(new MethodChannel.MethodCallHandler(this) { // from class: W3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3472b;

            {
                this.f3472b = this;
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall call, MethodChannel.Result response) {
                switch (i4) {
                    case 0:
                        i.e(call, "call");
                        i.e(response, "response");
                        try {
                            new c(2, this.f3472b, e.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0).invoke(call, response);
                            break;
                        } catch (Throwable th) {
                            response.error("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        i.e(call, "call");
                        i.e(response, "response");
                        try {
                            new d(2, this.f3472b, e.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0).invoke(call, response);
                            break;
                        } catch (Throwable th2) {
                            response.error("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        final int i5 = 1;
        new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global").setMethodCallHandler(new MethodChannel.MethodCallHandler(this) { // from class: W3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3472b;

            {
                this.f3472b = this;
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall call, MethodChannel.Result response) {
                switch (i5) {
                    case 0:
                        i.e(call, "call");
                        i.e(response, "response");
                        try {
                            new c(2, this.f3472b, e.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0).invoke(call, response);
                            break;
                        } catch (Throwable th) {
                            response.error("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        i.e(call, "call");
                        i.e(response, "response");
                        try {
                            new d(2, this.f3472b, e.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0).invoke(call, response);
                            break;
                        } catch (Throwable th2) {
                            response.error("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        this.f3473a = new f(new EventChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global/events"));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        i.e(binding, "binding");
        ConcurrentHashMap concurrentHashMap = this.f3477e;
        Collection<o> values = concurrentHashMap.values();
        i.d(values, "<get-values>(...)");
        for (o oVar : values) {
            oVar.e();
            f fVar = oVar.f3653b;
            EventChannel.EventSink eventSink = fVar.f3480b;
            if (eventSink != null) {
                eventSink.endOfStream();
                fVar.f3480b = null;
            }
            fVar.f3479a.setStreamHandler(null);
        }
        concurrentHashMap.clear();
        l2.e eVar = this.f3476d;
        if (eVar == null) {
            i.i("soundPoolManager");
            throw null;
        }
        HashMap hashMap = (HashMap) eVar.f14271c;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            l lVar = (l) ((Map.Entry) it.next()).getValue();
            lVar.f3645a.release();
            lVar.f3646b.clear();
            lVar.f3647c.clear();
        }
        hashMap.clear();
        f fVar2 = this.f3473a;
        if (fVar2 == null) {
            i.i("globalEvents");
            throw null;
        }
        EventChannel.EventSink eventSink2 = fVar2.f3480b;
        if (eventSink2 != null) {
            eventSink2.endOfStream();
            fVar2.f3480b = null;
        }
        fVar2.f3479a.setStreamHandler(null);
    }
}
