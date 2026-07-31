package N;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends S1.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3518d;

    /* renamed from: e, reason: collision with root package name */
    public final c f3519e;

    public /* synthetic */ j(c cVar, int i3) {
        this.f3518d = i3;
        this.f3519e = cVar;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        switch (this.f3518d) {
            case 0:
                c cVar = this.f3519e;
                cVar.getClass();
                return cVar.f3504e;
            default:
                c cVar2 = this.f3519e;
                cVar2.getClass();
                return cVar2.f3504e;
        }
    }

    @Override // S1.AbstractC0222a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f3518d) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f3519e;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f3519e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3518d) {
            case 0:
                c cVar = this.f3519e;
                n[] nVarArr = new n[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    nVarArr[i3] = new o(0);
                }
                return new k(cVar.f3503d, nVarArr);
            default:
                c cVar2 = this.f3519e;
                n[] nVarArr2 = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr2[i4] = new o(1);
                }
                return new k(cVar2.f3503d, nVarArr2);
        }
    }
}
