package p0;

import B1.u;
import O7.C0382g;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.h;
import n.ExecutorC4797a;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4854c {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f39756a;

    public C4854c(Context context) {
        Object systemService = context.getSystemService((Class<Object>) u.u());
        h.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f39756a = u.d(systemService);
    }

    public Object a(AbstractC4852a abstractC4852a, InterfaceC5133d interfaceC5133d) {
        new C0382g(1, w8.a.f(interfaceC5133d)).r();
        AbstractC4853b.l();
        throw null;
    }

    public Object b(InterfaceC5133d interfaceC5133d) {
        C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
        c0382g.r();
        this.f39756a.getMeasurementApiStatus(new ExecutorC4797a(1), new K.h(c0382g));
        Object q6 = c0382g.q();
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        return q6;
    }

    public Object c(Uri uri, InputEvent inputEvent, InterfaceC5133d interfaceC5133d) {
        C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
        c0382g.r();
        this.f39756a.registerSource(uri, inputEvent, new ExecutorC4797a(1), new K.h(c0382g));
        Object q6 = c0382g.q();
        return q6 == EnumC5179a.f41704n ? q6 : v.f40183a;
    }

    public Object d(Uri uri, InterfaceC5133d interfaceC5133d) {
        C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
        c0382g.r();
        this.f39756a.registerTrigger(uri, new ExecutorC4797a(1), new K.h(c0382g));
        Object q6 = c0382g.q();
        return q6 == EnumC5179a.f41704n ? q6 : v.f40183a;
    }

    public Object e(AbstractC4855d abstractC4855d, InterfaceC5133d interfaceC5133d) {
        new C0382g(1, w8.a.f(interfaceC5133d)).r();
        AbstractC4853b.p();
        throw null;
    }

    public Object f(e eVar, InterfaceC5133d interfaceC5133d) {
        new C0382g(1, w8.a.f(interfaceC5133d)).r();
        AbstractC4853b.q();
        throw null;
    }
}
