package defpackage;

import android.content.Context;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cev implements Closeable {
    final jsb a;
    final jsb b;
    final jsb c;
    final jsb d;
    final jsb e;
    final jsb f;
    final jsb g;
    final jsb h;
    final jsb i;
    final jsb j;
    final jsb k;
    final jsb l;

    public cev(Context context) {
        jsb c = jrv.c(cep.a);
        this.a = c;
        jrw a = jrx.a(context);
        this.b = a;
        cfa cfaVar = new cfa(a);
        this.c = cfaVar;
        jsb c2 = jrv.c(new bpy(a, cfaVar, 9, null));
        this.d = c2;
        cgt cgtVar = new cgt(a);
        this.e = cgtVar;
        jsb c3 = jrv.c(new bpu(a, 12));
        this.f = c3;
        jsb c4 = jrv.c(new bpy(cgtVar, c3, 10));
        this.g = c4;
        cfn cfnVar = new cfn(a, c4);
        this.h = cfnVar;
        cfl cflVar = new cfl(c, c2, cfnVar, c4, c4);
        this.i = cflVar;
        cfy cfyVar = new cfy(a, c2, c4, cfnVar, c, c4, c4);
        this.j = cfyVar;
        cga cgaVar = new cga(c, c4, cfnVar, c4);
        this.k = cgaVar;
        this.l = jrv.c(new dfo((jsb) cflVar, (jsb) cfyVar, (jsb) cgaVar, 1, (byte[]) null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((cgp) this.g.b()).close();
    }
}
