package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrp extends hdi {
    final /* synthetic */ Map.Entry a;

    public hrp(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.hdi
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.hdi, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdi, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new hrv((List) this.a.getValue());
    }
}
