package u0;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9588e;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.collections.j f9589i;

    public /* synthetic */ g(kotlin.collections.j jVar, int i3) {
        this.f9588e = i3;
        this.f9589i = jVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.f9588e) {
            case 0:
                return ((b) this.f9589i).f9578s;
            case 1:
                return ((b) this.f9589i).f9578s;
            default:
                return this.f9589i.c();
        }
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9588e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    b bVar = (b) this.f9589i;
                    Object obj2 = bVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && bVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((b) this.f9589i).containsKey(obj);
            default:
                return this.f9589i.containsKey(obj);
        }
    }

    @Override // kotlin.collections.p, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9588e) {
            case 0:
                i iVar = ((b) this.f9589i).f9577r;
                j[] jVarArr = new j[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    jVarArr[i3] = new k(0);
                }
                return new h(iVar, jVarArr);
            case 1:
                i iVar2 = ((b) this.f9589i).f9577r;
                j[] jVarArr2 = new j[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    jVarArr2[i10] = new k(1);
                }
                return new h(iVar2, jVarArr2);
            default:
                return new kotlin.collections.h(((g) this.f9589i.a()).iterator(), 0);
        }
    }
}
