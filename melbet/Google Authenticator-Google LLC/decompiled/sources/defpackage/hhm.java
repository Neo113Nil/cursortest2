package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hhm extends AbstractMap {
    public abstract Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        hnu.M(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new hhl(this);
    }
}
