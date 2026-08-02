package W3;

import X3.o;
import c3.C0297i;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.FileNotFoundException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import o3.p;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.h implements p {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        X3.g gVar;
        X3.g gVar2;
        X3.g gVar3;
        X3.g gVar4;
        X3.g gVar5;
        X3.g gVar6;
        X3.g gVar7;
        MethodCall p02 = (MethodCall) obj;
        MethodChannel.Result p12 = (MethodChannel.Result) obj2;
        i.e(p02, "p0");
        i.e(p12, "p1");
        e eVar = (e) this.receiver;
        boolean z = true;
        ConcurrentHashMap concurrentHashMap = eVar.f3477e;
        String str = (String) p02.argument("playerId");
        if (str != null) {
            Object obj3 = null;
            h valueOf = null;
            r10 = null;
            Object obj4 = null;
            g valueOf2 = null;
            obj3 = null;
            if (i.a(p02.method, "create")) {
                BinaryMessenger binaryMessenger = eVar.f3475c;
                if (binaryMessenger == null) {
                    i.i("binaryMessenger");
                    throw null;
                }
                f fVar = new f(new EventChannel(binaryMessenger, "xyz.luan/audioplayers/events/".concat(str)));
                a b4 = a.b(eVar.f3478f);
                l2.e eVar2 = eVar.f3476d;
                if (eVar2 == null) {
                    i.i("soundPoolManager");
                    throw null;
                }
                concurrentHashMap.put(str, new o(eVar, fVar, b4, eVar2));
                p12.success(1);
            } else {
                o oVar = (o) concurrentHashMap.get(str);
                if (oVar == null) {
                    throw new IllegalStateException("Player has not yet been created or has already been disposed.");
                }
                try {
                    f fVar2 = oVar.f3653b;
                    String str2 = p02.method;
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case -1757019252:
                                if (!str2.equals("getCurrentPosition")) {
                                    break;
                                } else {
                                    if (oVar.f3664m && (gVar = oVar.f3656e) != null) {
                                        obj3 = gVar.getCurrentPosition();
                                    }
                                    p12.success(obj3);
                                    break;
                                }
                            case -1722943962:
                                if (!str2.equals("setPlayerMode")) {
                                    break;
                                } else {
                                    String str3 = (String) p02.argument("playerMode");
                                    if (str3 != null) {
                                        valueOf2 = g.valueOf(V3.b.z((String) d3.i.h0(AbstractC1510g.o0(str3, new char[]{'.'}))));
                                    }
                                    if (valueOf2 == null) {
                                        throw new IllegalStateException("playerMode is required");
                                    }
                                    oVar.g(valueOf2);
                                    p12.success(1);
                                    break;
                                }
                            case -1660487654:
                                if (!str2.equals("setBalance")) {
                                    break;
                                } else {
                                    Double d4 = (Double) p02.argument("balance");
                                    if (d4 == null) {
                                        throw new IllegalStateException("balance is required");
                                    }
                                    float doubleValue = (float) d4.doubleValue();
                                    if (oVar.f3659h != doubleValue) {
                                        oVar.f3659h = doubleValue;
                                        if (!oVar.f3663l && (gVar2 = oVar.f3656e) != null) {
                                            o.j(gVar2, oVar.f3658g, doubleValue);
                                        }
                                    }
                                    p12.success(1);
                                    break;
                                }
                                break;
                            case -1630329231:
                                if (!str2.equals("emitLog")) {
                                    break;
                                } else {
                                    String str4 = (String) p02.argument("message");
                                    if (str4 == null) {
                                        throw new IllegalStateException("message is required");
                                    }
                                    oVar.c(str4);
                                    p12.success(1);
                                    break;
                                }
                            case -934426579:
                                if (!str2.equals("resume")) {
                                    break;
                                } else {
                                    if (!oVar.n && !oVar.f3663l) {
                                        oVar.n = true;
                                        if (oVar.f3656e == null) {
                                            X3.g b5 = oVar.b();
                                            oVar.f3656e = b5;
                                            Y3.c cVar = oVar.f3657f;
                                            if (cVar != null) {
                                                b5.d(cVar);
                                                oVar.a(b5);
                                            }
                                        } else if (oVar.f3664m) {
                                            oVar.f();
                                        }
                                    }
                                    p12.success(1);
                                    break;
                                }
                                break;
                            case -402284771:
                                if (!str2.equals("setPlaybackRate")) {
                                    break;
                                } else {
                                    Double d5 = (Double) p02.argument("playbackRate");
                                    if (d5 == null) {
                                        throw new IllegalStateException("playbackRate is required");
                                    }
                                    float doubleValue2 = (float) d5.doubleValue();
                                    if (oVar.f3660i != doubleValue2) {
                                        oVar.f3660i = doubleValue2;
                                        if (oVar.n && (gVar3 = oVar.f3656e) != null) {
                                            gVar3.h(doubleValue2);
                                        }
                                    }
                                    p12.success(1);
                                    break;
                                }
                                break;
                            case -159032046:
                                if (!str2.equals("setSourceUrl")) {
                                    break;
                                } else {
                                    String str5 = (String) p02.argument("url");
                                    if (str5 == null) {
                                        throw new IllegalStateException("url is required");
                                    }
                                    Boolean bool = (Boolean) p02.argument("isLocal");
                                    try {
                                        oVar.i(new Y3.d(str5, bool != null ? bool.booleanValue() : false));
                                        p12.success(1);
                                        break;
                                    } catch (FileNotFoundException e4) {
                                        p12.error("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", e4);
                                        break;
                                    }
                                }
                            case 3526264:
                                if (!str2.equals("seek")) {
                                    break;
                                } else {
                                    Integer num = (Integer) p02.argument("position");
                                    if (num == null) {
                                        throw new IllegalStateException("position is required");
                                    }
                                    int intValue = num.intValue();
                                    if (oVar.f3664m && ((gVar4 = oVar.f3656e) == null || !gVar4.g())) {
                                        X3.g gVar8 = oVar.f3656e;
                                        if (gVar8 != null) {
                                            gVar8.seekTo(intValue);
                                        }
                                        intValue = -1;
                                    }
                                    oVar.o = intValue;
                                    p12.success(1);
                                    break;
                                }
                                break;
                            case 3540994:
                                if (!str2.equals("stop")) {
                                    break;
                                } else {
                                    oVar.k();
                                    p12.success(1);
                                    break;
                                }
                            case 85887754:
                                if (!str2.equals("getDuration")) {
                                    break;
                                } else {
                                    if (oVar.f3664m && (gVar5 = oVar.f3656e) != null) {
                                        obj4 = gVar5.getDuration();
                                    }
                                    p12.success(obj4);
                                    break;
                                }
                                break;
                            case 106440182:
                                if (!str2.equals("pause")) {
                                    break;
                                } else {
                                    oVar.d();
                                    p12.success(1);
                                    break;
                                }
                            case 670514716:
                                if (!str2.equals("setVolume")) {
                                    break;
                                } else {
                                    Double d6 = (Double) p02.argument("volume");
                                    if (d6 == null) {
                                        throw new IllegalStateException("volume is required");
                                    }
                                    float doubleValue3 = (float) d6.doubleValue();
                                    if (oVar.f3658g != doubleValue3) {
                                        oVar.f3658g = doubleValue3;
                                        if (!oVar.f3663l && (gVar6 = oVar.f3656e) != null) {
                                            o.j(gVar6, doubleValue3, oVar.f3659h);
                                        }
                                    }
                                    p12.success(1);
                                    break;
                                }
                                break;
                            case 910310901:
                                if (!str2.equals("emitError")) {
                                    break;
                                } else {
                                    String str6 = (String) p02.argument("code");
                                    if (str6 == null) {
                                        throw new IllegalStateException("code is required");
                                    }
                                    String str7 = (String) p02.argument("message");
                                    if (str7 == null) {
                                        throw new IllegalStateException("message is required");
                                    }
                                    oVar.f3652a.getClass();
                                    EventChannel.EventSink eventSink = fVar2.f3480b;
                                    if (eventSink != null) {
                                        eventSink.error(str6, str7, null);
                                    }
                                    p12.success(1);
                                    break;
                                }
                            case 1090594823:
                                if (!str2.equals("release")) {
                                    break;
                                } else {
                                    oVar.e();
                                    p12.success(1);
                                    break;
                                }
                            case 1671767583:
                                if (!str2.equals("dispose")) {
                                    break;
                                } else {
                                    oVar.e();
                                    EventChannel.EventSink eventSink2 = fVar2.f3480b;
                                    if (eventSink2 != null) {
                                        eventSink2.endOfStream();
                                        fVar2.f3480b = null;
                                    }
                                    fVar2.f3479a.setStreamHandler(null);
                                    concurrentHashMap.remove(str);
                                    p12.success(1);
                                    break;
                                }
                            case 1771699022:
                                if (!str2.equals("setSourceBytes")) {
                                    break;
                                } else {
                                    byte[] bArr = (byte[]) p02.argument("bytes");
                                    if (bArr == null) {
                                        throw new IllegalStateException("bytes are required");
                                    }
                                    oVar.i(new Y3.b(bArr));
                                    p12.success(1);
                                    break;
                                }
                            case 1902436987:
                                if (!str2.equals("setAudioContext")) {
                                    break;
                                } else {
                                    oVar.l(V3.b.d(p02));
                                    p12.success(1);
                                    break;
                                }
                            case 2096116872:
                                if (!str2.equals("setReleaseMode")) {
                                    break;
                                } else {
                                    String str8 = (String) p02.argument("releaseMode");
                                    if (str8 != null) {
                                        valueOf = h.valueOf(V3.b.z((String) d3.i.h0(AbstractC1510g.o0(str8, new char[]{'.'}))));
                                    }
                                    if (valueOf == null) {
                                        throw new IllegalStateException("releaseMode is required");
                                    }
                                    if (oVar.f3661j != valueOf) {
                                        oVar.f3661j = valueOf;
                                        if (!oVar.f3663l && (gVar7 = oVar.f3656e) != null) {
                                            if (valueOf != h.f3484b) {
                                                z = false;
                                            }
                                            gVar7.setLooping(z);
                                        }
                                    }
                                    p12.success(1);
                                    break;
                                }
                                break;
                        }
                    }
                    p12.notImplemented();
                } catch (Exception e5) {
                    p12.error("AndroidAudioError", e5.getMessage(), e5);
                }
            }
        }
        return C0297i.f5732a;
    }
}
