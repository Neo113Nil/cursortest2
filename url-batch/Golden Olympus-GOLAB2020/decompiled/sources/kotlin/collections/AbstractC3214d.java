package kotlin.collections;

import i2.InterfaceC2472b;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3214d extends AbstractCollection implements Collection, InterfaceC2472b {
    protected AbstractC3214d() {
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
