package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fa extends AbstractSet {
    public final /* synthetic */ ka rtx2ld2ELZv4;

    public fa(ka kaVar) {
        this.rtx2ld2ELZv4 = kaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ia(this.rtx2ld2ELZv4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.rtx2ld2ELZv4.wdg6QnbFHrFF;
    }
}
