package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hfc extends hbs implements Serializable {
    private static final long serialVersionUID = 0;
    final transient her map;
    final transient int size;

    public hfc(her herVar, int i) {
        this.map = herVar;
        this.size = i;
    }

    @Override // defpackage.hhu
    public final int d() {
        throw null;
    }

    @Override // defpackage.hbo
    public final /* synthetic */ Collection e() {
        return new hfb(this);
    }

    @Override // defpackage.hbo
    public final /* bridge */ /* synthetic */ Iterator g() {
        throw null;
    }

    @Override // defpackage.hbo
    public final Map i() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.hbo
    public final Set j() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.hhu
    @Deprecated
    public final void k() {
        throw null;
    }

    @Override // defpackage.hhu
    public final boolean m(Object obj) {
        throw null;
    }

    @Override // defpackage.hbo, defpackage.hhu
    @Deprecated
    public final boolean n(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final /* bridge */ /* synthetic */ Collection o() {
        return (heb) super.o();
    }

    @Override // defpackage.hbo, defpackage.hhu
    public /* synthetic */ Map p() {
        return this.map;
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final /* bridge */ /* synthetic */ Set q() {
        return this.map.keySet();
    }

    @Override // defpackage.hbo, defpackage.hhu
    @Deprecated
    public final boolean s(Object obj, Object obj2) {
        throw null;
    }
}
