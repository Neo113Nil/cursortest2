package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igd extends jyd {
    final /* synthetic */ ige a;
    final /* synthetic */ jxr b;
    private final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igd(kbg kbgVar, ige igeVar, jxr jxrVar) {
        super(kbgVar);
        this.a = igeVar;
        this.b = jxrVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.kaw, defpackage.kbg
    public final void a(kbq kbqVar, kaa kaaVar) {
        kbqVar.getClass();
        kaaVar.getClass();
        if (this.c.get()) {
            ige igeVar = this.a;
            if (((AtomicReference) igeVar.a[0].c.a(this.b)).get() != null) {
                super.a(kbq.k.e("Parcelable response headers can be populated only before the first response."), kaaVar);
                return;
            }
        }
        this.a.b(kaaVar, this.b, false);
        super.a(kbqVar, kaaVar);
    }

    @Override // defpackage.kaw, defpackage.kbg
    public final void b(kaa kaaVar) {
        this.a.b(kaaVar, this.b, true);
        this.c.set(true);
        super.b(kaaVar);
    }
}
