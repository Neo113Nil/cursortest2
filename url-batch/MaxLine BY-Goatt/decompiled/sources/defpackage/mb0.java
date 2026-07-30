package defpackage;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mb0 implements Closeable {
    public final lb0 m;
    public boolean n;
    public final /* synthetic */ ob0 o;

    public mb0(ob0 ob0Var, lb0 lb0Var) {
        this.o = ob0Var;
        this.m = lb0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        ob0 ob0Var = this.o;
        synchronized (ob0Var) {
            try {
                lb0 lb0Var = this.m;
                int i = lb0Var.h - 1;
                lb0Var.h = i;
                if (i == 0 && lb0Var.f) {
                    Regex regex = ob0.C;
                    ob0Var.y(lb0Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
