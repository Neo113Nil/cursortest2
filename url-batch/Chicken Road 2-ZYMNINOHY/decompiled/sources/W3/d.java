package W3;

import X3.o;
import android.media.AudioManager;
import c3.C0297i;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import o3.p;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.h implements p {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        MethodCall p02 = (MethodCall) obj;
        MethodChannel.Result p12 = (MethodChannel.Result) obj2;
        i.e(p02, "p0");
        i.e(p12, "p1");
        e eVar = (e) this.receiver;
        ConcurrentHashMap concurrentHashMap = eVar.f3477e;
        String str = p02.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1630329231:
                    if (str.equals("emitLog")) {
                        String str2 = (String) p02.argument("message");
                        if (str2 == null) {
                            throw new IllegalStateException("message is required");
                        }
                        eVar.b(str2);
                        p12.success(1);
                        return C0297i.f5732a;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
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
                        p12.success(1);
                        return C0297i.f5732a;
                    }
                    break;
                case 910310901:
                    if (str.equals("emitError")) {
                        String str3 = (String) p02.argument("code");
                        if (str3 == null) {
                            throw new IllegalStateException("code is required");
                        }
                        String str4 = (String) p02.argument("message");
                        if (str4 == null) {
                            throw new IllegalStateException("message is required");
                        }
                        f fVar2 = eVar.f3473a;
                        if (fVar2 == null) {
                            i.i("globalEvents");
                            throw null;
                        }
                        EventChannel.EventSink eventSink2 = fVar2.f3480b;
                        if (eventSink2 != null) {
                            eventSink2.error(str3, str4, null);
                        }
                        p12.success(1);
                        return C0297i.f5732a;
                    }
                    break;
                case 1902436987:
                    if (str.equals("setAudioContext")) {
                        AudioManager a3 = eVar.a();
                        a3.setMode(eVar.f3478f.f3470f);
                        a3.setSpeakerphoneOn(eVar.f3478f.f3465a);
                        eVar.f3478f = V3.b.d(p02);
                        p12.success(1);
                        return C0297i.f5732a;
                    }
                    break;
            }
        }
        p12.notImplemented();
        return C0297i.f5732a;
    }
}
