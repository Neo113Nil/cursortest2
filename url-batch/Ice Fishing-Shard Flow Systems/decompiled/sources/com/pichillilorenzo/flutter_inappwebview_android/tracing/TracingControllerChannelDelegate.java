package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s4.n;
import s4.p;
import s4.q;
import u0.d;
import u0.k;
import u0.m;
import v0.AbstractC0967k;
import v0.C0958b;
import v0.F;
import v0.H;
import v0.y;

/* loaded from: classes.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, q qVar) {
        super(qVar);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        m mVar;
        boolean isTracing;
        FileOutputStream fileOutputStream;
        boolean stop;
        TracingControllerManager.init();
        mVar = TracingControllerManager.tracingController;
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "isTracing":
                if (mVar == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                y yVar = (y) mVar;
                C0958b c0958b = F.f8175z;
                if (c0958b.a()) {
                    if (yVar.f8209a == null) {
                        yVar.f8209a = AbstractC0967k.a();
                    }
                    isTracing = AbstractC0967k.d(yVar.f8209a);
                } else {
                    if (!c0958b.b()) {
                        throw F.a();
                    }
                    if (yVar.f8210b == null) {
                        yVar.f8210b = H.f8177a.getTracingController();
                    }
                    isTracing = yVar.f8210b.isTracing();
                }
                pVar.success(Boolean.valueOf(isTracing));
                return;
            case "stop":
                if (mVar == null || !d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                String str2 = (String) nVar.a("filePath");
                if (str2 != null) {
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                    } catch (FileNotFoundException e7) {
                        e7.printStackTrace();
                        pVar.success(Boolean.FALSE);
                        return;
                    }
                } else {
                    fileOutputStream = null;
                }
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                y yVar2 = (y) mVar;
                C0958b c0958b2 = F.f8175z;
                if (c0958b2.a()) {
                    if (yVar2.f8209a == null) {
                        yVar2.f8209a = AbstractC0967k.a();
                    }
                    stop = AbstractC0967k.g(yVar2.f8209a, fileOutputStream, newSingleThreadExecutor);
                } else {
                    if (!c0958b2.b()) {
                        throw F.a();
                    }
                    if (yVar2.f8210b == null) {
                        yVar2.f8210b = H.f8177a.getTracingController();
                    }
                    stop = yVar2.f8210b.stop(fileOutputStream, newSingleThreadExecutor);
                }
                pVar.success(Boolean.valueOf(stop));
                return;
            case "start":
                if (mVar == null || !d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                Map<String, Object> map = (Map) nVar.a("settings");
                TracingSettings tracingSettings = new TracingSettings();
                tracingSettings.parse2(map);
                k buildTracingConfig = TracingControllerManager.buildTracingConfig(tracingSettings);
                y yVar3 = (y) mVar;
                if (buildTracingConfig == null) {
                    throw new IllegalArgumentException("Tracing config must be non null");
                }
                C0958b c0958b3 = F.f8175z;
                if (c0958b3.a()) {
                    if (yVar3.f8209a == null) {
                        yVar3.f8209a = AbstractC0967k.a();
                    }
                    AbstractC0967k.f(yVar3.f8209a, buildTracingConfig);
                } else {
                    if (!c0958b3.b()) {
                        throw F.a();
                    }
                    if (yVar3.f8210b == null) {
                        yVar3.f8210b = H.f8177a.getTracingController();
                    }
                    yVar3.f8210b.start(buildTracingConfig.f8053a, buildTracingConfig.f8054b, buildTracingConfig.f8055c);
                }
                pVar.success(Boolean.TRUE);
                return;
            default:
                pVar.notImplemented();
                return;
        }
    }
}
