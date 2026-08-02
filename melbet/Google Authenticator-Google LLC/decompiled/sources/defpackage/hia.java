package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hia extends hib implements hgv {
    private static final long serialVersionUID = 0;

    public hia(hgv hgvVar) {
        super(hgvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hib, defpackage.hdj
    /* renamed from: b */
    public final /* synthetic */ hhu f() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hgv, hhu] */
    @Override // defpackage.hgv
    public final List c(Object obj) {
        return DesugarCollections.unmodifiableList(this.a.c(obj));
    }

    @Override // defpackage.hib, defpackage.hdj, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }
}
