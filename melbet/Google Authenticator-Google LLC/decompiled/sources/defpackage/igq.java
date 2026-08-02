package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class igq implements koe {
    final /* synthetic */ Context a;
    final /* synthetic */ koe b;
    final /* synthetic */ koe c;
    private ign d = null;

    public igq(Context context, koe koeVar, koe koeVar2) {
        this.a = context;
        this.b = koeVar;
        this.c = koeVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ign b() {
        ign ignVar = this.d;
        if (ignVar != null) {
            return ignVar;
        }
        Context context = this.a;
        koe koeVar = this.b;
        String packageName = context.getPackageName();
        String str = (String) koeVar.b();
        this.c.b();
        ign ignVar2 = new ign(packageName, str);
        this.d = ignVar2;
        return ignVar2;
    }
}
