package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hhj extends hbl {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ kee b;

    public hhj(Map.Entry entry, kee keeVar) {
        this.a = entry;
        this.b = keeVar;
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        entry.getKey();
        return this.b.b(entry.getValue());
    }
}
