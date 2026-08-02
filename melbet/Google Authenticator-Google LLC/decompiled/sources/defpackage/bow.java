package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bow implements bov {
    public final Context a;
    private final hvl b;
    private final boy c;

    public bow(Context context, boy boyVar, hvl hvlVar) {
        this.a = context;
        this.c = boyVar;
        this.b = hvlVar;
    }

    @Override // defpackage.bov
    public final void a(hqs hqsVar) {
        boy boyVar = this.c;
        cji cjiVar = boyVar.f;
        hoq.at(cjiVar != null ? hnu.aJ(cjiVar) : hoq.at(boyVar.b.b(boyVar.c), new bpf(boyVar, 1), boyVar.d), new bso(this, hqsVar, 1), this.b);
    }
}
