package l5;

import java.util.AbstractSet;
import java.util.Set;
import y5.InterfaceC0767b;

/* renamed from: l5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0502f extends AbstractSet implements Set, InterfaceC0767b {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
