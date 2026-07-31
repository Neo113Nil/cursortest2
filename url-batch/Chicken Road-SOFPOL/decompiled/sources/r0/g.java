package r0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends d6.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6484d;

    /* renamed from: e, reason: collision with root package name */
    public final b f6485e;

    public /* synthetic */ g(b bVar, int i) {
        this.f6484d = i;
        this.f6485e = bVar;
    }

    @Override // d6.a
    public final int a() {
        switch (this.f6484d) {
            case 0:
                b bVar = this.f6485e;
                bVar.getClass();
                return bVar.f6475e;
            default:
                b bVar2 = this.f6485e;
                bVar2.getClass();
                return bVar2.f6475e;
        }
    }

    @Override // d6.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f6484d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                b bVar = this.f6485e;
                Object obj2 = bVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && bVar.containsKey(entry.getKey());
            default:
                return this.f6485e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6484d) {
            case 0:
                j jVar = this.f6485e.f6474d;
                k[] kVarArr = new k[8];
                for (int i = 0; i < 8; i++) {
                    kVarArr[i] = new l(0);
                }
                return new h(jVar, kVarArr);
            default:
                j jVar2 = this.f6485e.f6474d;
                k[] kVarArr2 = new k[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    kVarArr2[i8] = new l(1);
                }
                return new h(jVar2, kVarArr2);
        }
    }
}
