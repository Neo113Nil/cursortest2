package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jkz implements Map.Entry {
    public final Map.Entry a;

    public jkz(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        jlb jlbVar = (jlb) this.a.getValue();
        if (jlbVar == null) {
            return null;
        }
        return jlbVar.b();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof jll)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.a;
        jll jllVar = ((jlb) entry.getValue()).b;
        entry.setValue(new jlb((jll) obj));
        return jllVar;
    }
}
