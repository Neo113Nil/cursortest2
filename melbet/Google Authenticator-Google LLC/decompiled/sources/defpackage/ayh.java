package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayh implements ayf {
    public final ajw a;
    public final ajf b = new ayg();

    public ayh(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // defpackage.ayf
    public final List a(String str) {
        return (List) abf.e(this.a, true, false, new aya(str, 6, (boolean[]) null));
    }

    @Override // defpackage.ayf
    public final void b(String str) {
        abf.e(this.a, false, true, new aya(str, 5, (int[]) null));
    }

    @Override // defpackage.ayf
    public final /* synthetic */ void c(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abf.e(this.a, false, true, new aya(this, new brr((String) it.next(), str), 7));
        }
    }
}
