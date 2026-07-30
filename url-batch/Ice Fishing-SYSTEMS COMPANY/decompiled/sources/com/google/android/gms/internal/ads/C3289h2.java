package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3289h2 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31135a;

    public C3289h2(ArrayList arrayList) {
        this.f31135a = arrayList;
        boolean z8 = false;
        if (!arrayList.isEmpty()) {
            long j9 = ((C3180f2) arrayList.get(0)).f30579b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C3180f2) arrayList.get(i)).f30578a < j9) {
                    z8 = true;
                    break;
                } else {
                    j9 = ((C3180f2) arrayList.get(i)).f30579b;
                    i++;
                }
            }
        }
        PA.n(!z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3289h2.class != obj.getClass()) {
            return false;
        }
        return this.f31135a.equals(((C3289h2) obj).f31135a);
    }

    public final int hashCode() {
        return this.f31135a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f31135a.toString());
    }
}
