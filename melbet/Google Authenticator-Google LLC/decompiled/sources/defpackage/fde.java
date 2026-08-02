package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fde {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public fde(fdf fdfVar, Object[] objArr, String str) {
        this.a = objArr;
        this.b = str;
        this.c = fdfVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [hvl, java.lang.Object] */
    public final car a(frv frvVar) {
        return new car(frvVar, (fug) this.b, (Context) this.c, this.a);
    }

    public /* synthetic */ fde(fug fugVar, Context context, hvl hvlVar) {
        this.b = fugVar;
        this.c = context;
        this.a = hvlVar;
    }
}
