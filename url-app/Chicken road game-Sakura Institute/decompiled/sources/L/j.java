package L;

import java.util.Iterator;
import java.util.Map;
import z2.AbstractC1431o;

/* loaded from: classes.dex */
public final class j extends AbstractC1431o implements J.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3479e;

    /* renamed from: i, reason: collision with root package name */
    public final c f3480i;

    public /* synthetic */ j(c cVar, int i2) {
        this.f3479e = i2;
        this.f3480i = cVar;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f3479e) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f3480i;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f3480i.containsKey(obj);
        }
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        switch (this.f3479e) {
        }
        return this.f3480i.d();
    }

    @Override // z2.AbstractC1431o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3479e) {
            case 0:
                m mVar = this.f3480i.f3460j;
                n[] nVarArr = new n[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    nVarArr[i2] = new o(0);
                }
                return new k(mVar, nVarArr);
            default:
                m mVar2 = this.f3480i.f3460j;
                n[] nVarArr2 = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr2[i4] = new o(1);
                }
                return new k(mVar2, nVarArr2);
        }
    }
}
