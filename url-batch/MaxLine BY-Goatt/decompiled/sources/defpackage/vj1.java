package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class vj1 extends j8 {
    public final MeasurementManager D;

    public vj1(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.D = measurementManager;
    }

    public static Object b0(vj1 vj1Var, y90 y90Var, o30 o30Var) {
        new fs(1, q41.b(o30Var)).u();
        MeasurementManager measurementManager = vj1Var.D;
        throw null;
    }

    public static Object c0(vj1 vj1Var, o30 o30Var) {
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        vj1Var.D.getMeasurementApiStatus(new th(1), new t30(fsVar));
        Object s = fsVar.s();
        b50 b50Var = b50.m;
        return s;
    }

    public static Object e0(vj1 vj1Var, sn2 sn2Var, o30 o30Var) {
        Object t = j8.t(new p50(4, null, vj1Var), o30Var);
        return t == b50.m ? t : Unit.a;
    }

    public static Object f0(vj1 vj1Var, Uri uri, InputEvent inputEvent, o30 o30Var) {
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        vj1Var.D.registerSource(uri, inputEvent, new th(1), new t30(fsVar));
        Object s = fsVar.s();
        return s == b50.m ? s : Unit.a;
    }

    public static Object g0(vj1 vj1Var, Uri uri, o30 o30Var) {
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        vj1Var.D.registerTrigger(uri, new th(1), new t30(fsVar));
        Object s = fsVar.s();
        return s == b50.m ? s : Unit.a;
    }

    public static Object i0(vj1 vj1Var, o63 o63Var, o30 o30Var) {
        new fs(1, q41.b(o30Var)).u();
        MeasurementManager measurementManager = vj1Var.D;
        throw null;
    }

    public static Object k0(vj1 vj1Var, p63 p63Var, o30 o30Var) {
        new fs(1, q41.b(o30Var)).u();
        MeasurementManager measurementManager = vj1Var.D;
        throw null;
    }

    @Override // defpackage.j8
    public Object H(o30 o30Var) {
        return c0(this, o30Var);
    }

    @Override // defpackage.j8
    public Object R(Uri uri, InputEvent inputEvent, o30 o30Var) {
        return f0(this, uri, inputEvent, o30Var);
    }

    @Override // defpackage.j8
    public Object S(Uri uri, o30 o30Var) {
        return g0(this, uri, o30Var);
    }

    public Object a0(y90 y90Var, o30 o30Var) {
        return b0(this, y90Var, o30Var);
    }

    public Object d0(sn2 sn2Var, o30 o30Var) {
        return e0(this, sn2Var, o30Var);
    }

    public Object h0(o63 o63Var, o30 o30Var) {
        return i0(this, o63Var, o30Var);
    }

    public Object j0(p63 p63Var, o30 o30Var) {
        return k0(this, p63Var, o30Var);
    }
}
