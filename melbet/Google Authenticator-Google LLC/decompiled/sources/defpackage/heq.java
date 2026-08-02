package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class heq implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public heq(her herVar) {
        Object[] objArr = new Object[herVar.size()];
        Object[] objArr2 = new Object[herVar.size()];
        hjr it = herVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public hen a(int i) {
        return new hen(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        boolean z = obj instanceof hfm;
        Object obj2 = this.b;
        if (z) {
            hfm hfmVar = (hfm) obj;
            hen a = a(hfmVar.size());
            hjr it = hfmVar.iterator();
            hjr it2 = ((heb) obj2).iterator();
            while (it.hasNext()) {
                a.g(it.next(), it2.next());
            }
            return a.b();
        }
        Object[] objArr = (Object[]) obj;
        hen a2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            a2.g(objArr[i], ((Object[]) obj2)[i]);
        }
        return a2.b();
    }
}
