package kotlin.collections;

import i2.InterfaceC2472b;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3216f extends AbstractSet implements Set, InterfaceC2472b {
    protected AbstractC3216f() {
    }

    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
