package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dw {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public gd h;
    fz i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public dw(int i) {
        this.a = i;
    }

    final void a(gd gdVar) {
        fz fzVar;
        gd gdVar2 = this.h;
        if (gdVar == gdVar2) {
            return;
        }
        if (gdVar2 != null) {
            gdVar2.m(this.i);
        }
        this.h = gdVar;
        if (gdVar == null || (fzVar = this.i) == null) {
            return;
        }
        gdVar.g(fzVar);
    }
}
