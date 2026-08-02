package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfc extends kft {
    final /* synthetic */ kbq a;
    final /* synthetic */ kaa b;
    final /* synthetic */ kfe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfc(kfe kfeVar, kbq kbqVar, kaa kaaVar) {
        super(kfeVar.b.e);
        this.a = kbqVar;
        this.b = kaaVar;
        this.c = kfeVar;
    }

    @Override // defpackage.kft
    public final void a() {
        int i = kob.a;
        kfe kfeVar = this.c;
        kfeVar.b.f.c();
        kbq kbqVar = this.a;
        kaa kaaVar = this.b;
        kbq kbqVar2 = kfeVar.a;
        if (kbqVar2 != null) {
            kaaVar = new kaa();
            kbqVar = kbqVar2;
        }
        try {
            kff.g(kfeVar.c, kbqVar, kaaVar);
        } finally {
            this.c.b.d.a(kbqVar.g());
        }
    }
}
