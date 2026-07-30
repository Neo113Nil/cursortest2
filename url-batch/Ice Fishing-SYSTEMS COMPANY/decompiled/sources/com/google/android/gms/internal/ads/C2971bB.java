package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2971bB implements Serializable, InterfaceC2916aB {

    /* renamed from: n, reason: collision with root package name */
    public final List f29428n;

    @Override // com.google.android.gms.internal.ads.InterfaceC2916aB
    public final boolean b(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f29428n;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC2916aB) list.get(i)).b(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2971bB) {
            return this.f29428n.equals(((C2971bB) obj).f29428n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29428n.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z8 = true;
        for (Object obj : this.f29428n) {
            if (!z8) {
                sb.append(',');
            }
            sb.append(obj);
            z8 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
