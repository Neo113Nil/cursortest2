package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hdm extends hdc implements Set {
    protected hdm() {
    }

    @Override // defpackage.hdc
    protected /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    protected abstract Set b();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return b().hashCode();
    }
}
