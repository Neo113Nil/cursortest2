package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.vC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4052vC extends AbstractC3621nC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C3554m.f32629k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4052vC)) {
            return false;
        }
        KB kb = C3554m.f32629k;
        ((C4052vC) obj).getClass();
        return kb.equals(kb);
    }

    public final int hashCode() {
        return -C3554m.f32629k.hashCode();
    }

    public final String toString() {
        return C3554m.f32629k.toString().concat(".reverse()");
    }
}
