package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yt implements ktu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public yt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ktu
    public final Iterator a() {
        int i = this.b;
        if (i == 0) {
            return new xx(new yt(this.a, 1).a(), kxl.b);
        }
        if (i == 1) {
            return new hmm((ViewGroup) this.a, 1);
        }
        if (i != 2) {
            return i != 3 ? new kub(this.a) : this.a;
        }
        ktv ktvVar = new ktv();
        ktvVar.a = ixe.c(this.a, ktvVar, ktvVar);
        return ktvVar;
    }
}
