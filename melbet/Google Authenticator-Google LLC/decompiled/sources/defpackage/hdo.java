package defpackage;

import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hdo extends hds {
    final /* synthetic */ hdt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdo(hdt hdtVar) {
        super(hdtVar);
        this.a = hdtVar;
    }

    @Override // defpackage.hds
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new hdn(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            hdt hdtVar = this.a;
            int a = hdtVar.a(key);
            if (a != -1 && Objects.equals(value, hdtVar.b[a])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int ag = hnu.ag(key);
        hdt hdtVar = this.a;
        int b = hdtVar.b(key, ag);
        if (b == -1 || !Objects.equals(value, hdtVar.b[b])) {
            return false;
        }
        hdtVar.e(b, ag);
        return true;
    }
}
