package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ih extends jt {
    final /* synthetic */ il a;
    final /* synthetic */ io b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(io ioVar, View view, il ilVar) {
        super(view);
        this.b = ioVar;
        this.a = ilVar;
    }

    @Override // defpackage.jt
    public final gt a() {
        return this.a;
    }

    @Override // defpackage.jt
    public final boolean b() {
        io ioVar = this.b;
        if (ioVar.b.x()) {
            return true;
        }
        ioVar.b();
        return true;
    }
}
