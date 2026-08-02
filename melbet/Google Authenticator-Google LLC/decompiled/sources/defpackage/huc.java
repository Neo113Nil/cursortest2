package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class huc extends hud {
    final /* synthetic */ hue a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huc(hue hueVar, Callable callable, Executor executor) {
        super(hueVar, executor);
        this.a = hueVar;
        this.c = callable;
    }

    @Override // defpackage.hvg
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.hvg
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.hud
    public final void c(Object obj) {
        this.a.o(obj);
    }
}
