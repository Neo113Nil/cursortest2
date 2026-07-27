package g4;

import java.util.AbstractSet;
import java.util.Set;
import u4.InterfaceC1482b;

/* renamed from: g4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0461f extends AbstractSet implements Set, InterfaceC1482b {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
