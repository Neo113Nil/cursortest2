package a1;

import E.C0028c;
import V0.h;
import V0.i;
import W0.g;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.logging.Logger;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0177a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3837e;

    public /* synthetic */ RunnableC0177a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f3833a = i2;
        this.f3834b = obj;
        this.f3835c = obj2;
        this.f3836d = obj3;
        this.f3837e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3833a) {
            case 0:
                i iVar = (i) this.f3835c;
                C0028c c0028c = (C0028c) this.f3836d;
                h hVar = (h) this.f3837e;
                C0179c c0179c = (C0179c) this.f3834b;
                c0179c.getClass();
                Logger logger = C0179c.f3842f;
                try {
                    g a6 = c0179c.f3845c.a(iVar.f3208a);
                    if (a6 == null) {
                        String str = "Transport backend '" + iVar.f3208a + "' is not registered";
                        logger.warning(str);
                        new IllegalArgumentException(str);
                        c0028c.getClass();
                    } else {
                        ((c1.i) c0179c.f3847e).p(new C0178b(c0179c, iVar, ((T0.d) a6).a(hVar), 0));
                        c0028c.getClass();
                    }
                    break;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    c0028c.getClass();
                    return;
                }
            case 1:
                D0.a((D0) this.f3834b, (String) this.f3835c, (String) this.f3836d, (String) this.f3837e);
                break;
            default:
                J0.a((J0) this.f3834b, (String) this.f3835c, (String) this.f3836d, (PluginErrorDetails) this.f3837e);
                break;
        }
    }
}
