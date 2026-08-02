package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aru {
    public Executor a;
    public kqn b;
    public atf c;
    public Executor d;
    public asz e;
    public wo f;
    public wo g;
    public wo h;
    public String i;
    public int j = 4;
    public int k = 20;
    public boolean l = true;

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, rm rmVar, kri kriVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            rmVar.c(kriVar.a());
        } catch (Throwable th) {
            rmVar.d(th);
        }
    }
}
