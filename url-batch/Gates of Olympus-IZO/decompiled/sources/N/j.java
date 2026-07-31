package N;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends M1.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2836d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2837e;

    public /* synthetic */ j(c cVar, int i3) {
        this.f2836d = i3;
        this.f2837e = cVar;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        switch (this.f2836d) {
            case 0:
                c cVar = this.f2837e;
                cVar.getClass();
                return cVar.f2822e;
            default:
                c cVar2 = this.f2837e;
                cVar2.getClass();
                return cVar2.f2822e;
        }
    }

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f2836d) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f2837e;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f2837e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2836d) {
            case 0:
                c cVar = this.f2837e;
                n[] nVarArr = new n[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    nVarArr[i3] = new o(0);
                }
                return new k(cVar.f2821d, nVarArr);
            default:
                c cVar2 = this.f2837e;
                n[] nVarArr2 = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr2[i4] = new o(1);
                }
                return new k(cVar2.f2821d, nVarArr2);
        }
    }
}
