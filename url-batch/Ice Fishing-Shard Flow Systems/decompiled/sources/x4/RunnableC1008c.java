package x4;

import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j2.C0569a;
import java.util.HashMap;
import java.util.Map;
import z1.AbstractC1053a;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1008c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8337d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1.g f8338e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K1.h f8339i;

    public /* synthetic */ RunnableC1008c(P1.g gVar, K1.h hVar) {
        this.f8338e = gVar;
        this.f8339i = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f8337d) {
            case 0:
                P1.g gVar = this.f8338e;
                K1.h hVar = this.f8339i;
                HashMap hashMap = C1009d.f8340i;
                try {
                    gVar.a();
                    String str = gVar.f2271b;
                    gVar.a();
                    C1010e c7 = C1009d.c(gVar.f2272c);
                    gVar.a();
                    C0569a c0569a = (C0569a) gVar.f2276g.get();
                    synchronized (c0569a) {
                        z7 = c0569a.f5951d;
                    }
                    Boolean valueOf = Boolean.valueOf(z7);
                    Map map = (Map) AbstractC1053a.e(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar));
                    f fVar = new f();
                    if (str == null) {
                        throw new IllegalStateException("Nonnull field \"name\" is null.");
                    }
                    fVar.f8357a = str;
                    fVar.f8358b = c7;
                    fVar.f8359c = valueOf;
                    if (map == null) {
                        throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                    }
                    fVar.f8360d = map;
                    hVar.b(fVar);
                    return;
                } catch (Exception e7) {
                    hVar.a(e7);
                    return;
                }
            default:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f8338e, this.f8339i);
                return;
        }
    }

    public /* synthetic */ RunnableC1008c(C1009d c1009d, P1.g gVar, K1.h hVar) {
        this.f8338e = gVar;
        this.f8339i = hVar;
    }
}
