package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0350v extends AbstractC0341q implements Set {

    /* renamed from: b, reason: collision with root package name */
    public transient AbstractC0346t f6022b;

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public AbstractC0346t e() {
        AbstractC0346t abstractC0346t = this.f6022b;
        if (abstractC0346t != null) {
            return abstractC0346t;
        }
        AbstractC0346t h2 = h();
        this.f6022b = h2;
        return h2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public AbstractC0346t h() {
        Object[] array = toArray(AbstractC0341q.f5995a);
        r rVar = AbstractC0346t.f6014b;
        return AbstractC0346t.i(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 += next != null ? next.hashCode() : 0;
        }
        return i4;
    }
}
