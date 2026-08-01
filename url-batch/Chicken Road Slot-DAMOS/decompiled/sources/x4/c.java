package x4;

import a4.l;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import ge.a0;
import ge.h;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f10507a;

    public c(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.f10507a = measurementManager;
    }

    public static Object b(c cVar, a aVar, ld.a aVar2) {
        new h(1, md.f.b(aVar2)).s();
        MeasurementManager measurementManager = cVar.f10507a;
        throw null;
    }

    public static Object d(c cVar, ld.a aVar) {
        h hVar = new h(1, md.f.b(aVar));
        hVar.s();
        cVar.f10507a.getMeasurementApiStatus(new n.a(1), new k3.e(hVar));
        Object r9 = hVar.r();
        md.a aVar2 = md.a.f6622d;
        return r9;
    }

    public static Object g(c cVar, Uri uri, InputEvent inputEvent, ld.a aVar) {
        h hVar = new h(1, md.f.b(aVar));
        hVar.s();
        cVar.f10507a.registerSource(uri, inputEvent, new n.a(1), new k3.e(hVar));
        Object r9 = hVar.r();
        return r9 == md.a.f6622d ? r9 : Unit.f5554a;
    }

    public static Object h(c cVar, d dVar, ld.a aVar) {
        Object h10 = a0.h(new l(cVar, (ld.a) null, 5), aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }

    public static Object j(c cVar, Uri uri, ld.a aVar) {
        h hVar = new h(1, md.f.b(aVar));
        hVar.s();
        cVar.f10507a.registerTrigger(uri, new n.a(1), new k3.e(hVar));
        Object r9 = hVar.r();
        return r9 == md.a.f6622d ? r9 : Unit.f5554a;
    }

    public static Object l(c cVar, e eVar, ld.a aVar) {
        new h(1, md.f.b(aVar)).s();
        MeasurementManager measurementManager = cVar.f10507a;
        throw null;
    }

    public static Object n(c cVar, f fVar, ld.a aVar) {
        new h(1, md.f.b(aVar)).s();
        MeasurementManager measurementManager = cVar.f10507a;
        throw null;
    }

    public Object a(a aVar, ld.a aVar2) {
        return b(this, aVar, aVar2);
    }

    public Object c(ld.a aVar) {
        return d(this, aVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, ld.a aVar) {
        return g(this, uri, inputEvent, aVar);
    }

    public Object f(d dVar, ld.a aVar) {
        return h(this, dVar, aVar);
    }

    public Object i(Uri uri, ld.a aVar) {
        return j(this, uri, aVar);
    }

    public Object k(e eVar, ld.a aVar) {
        return l(this, eVar, aVar);
    }

    public Object m(f fVar, ld.a aVar) {
        return n(this, fVar, aVar);
    }
}
