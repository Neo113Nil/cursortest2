package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrt extends hdi {
    final /* synthetic */ Map.Entry a;

    public hrt(Map.Entry entry) {
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
    public final Object setValue(Object obj) {
        getKey();
        obj.getClass();
        return this.a.setValue(obj);
    }
}
