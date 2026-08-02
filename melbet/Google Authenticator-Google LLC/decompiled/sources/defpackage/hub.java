package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hub extends hud {
    final /* synthetic */ hue a;
    private final htq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hub(hue hueVar, htq htqVar, Executor executor) {
        super(hueVar, executor);
        this.a = hueVar;
        this.c = htqVar;
    }

    @Override // defpackage.hvg
    public final /* bridge */ /* synthetic */ Object a() {
        hvi a = this.c.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.hvg
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.hud
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.q((hvi) obj);
    }
}
