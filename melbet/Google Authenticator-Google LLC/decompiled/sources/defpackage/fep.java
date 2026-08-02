package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fep implements acp {
    final /* synthetic */ gam a;

    public fep(gam gamVar) {
        this.a = gamVar;
    }

    @Override // defpackage.acp
    public final void a(acr acrVar) {
        ArrayList arrayList = acrVar.r;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        this.a.e();
    }
}
