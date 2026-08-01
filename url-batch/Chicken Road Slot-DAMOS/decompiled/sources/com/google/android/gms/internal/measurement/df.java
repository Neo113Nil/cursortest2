package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class df extends f8.r {

    /* renamed from: v, reason: collision with root package name */
    public ra f2239v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2240w;

    public df(ra raVar, int i3) {
        this.f2239v = raVar;
        this.f2240w = i3;
    }

    @Override // f8.r
    public final void c() {
        AtomicLong atomicLong;
        long j;
        int i3;
        int i10;
        boolean z10;
        ra raVar = this.f2239v;
        this.f2239v = null;
        if (raVar == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) raVar.f2739c;
        do {
            atomicLong = (AtomicLong) raVar.f2738b;
            j = atomicLong.get();
            i3 = (int) j;
            long j3 = j >>> 32;
            if (i3 == Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 13);
                sb2.append("Refcount is: ");
                sb2.append(j);
                throw new AssertionError(sb2.toString());
            }
            i10 = (int) j3;
            z10 = i3 == -2147483647;
            if (z10) {
                i10++;
            }
        } while (!atomicLong.compareAndSet(j, (i10 << 32) | (4294967295L & (i3 - 1))));
        if (z10) {
            while (true) {
                ef efVar = (ef) atomicReference.get();
                if (efVar != null) {
                    if (efVar.f2264v <= this.f2240w) {
                        efVar.cancel(true);
                        while (!atomicReference.compareAndSet(efVar, null)) {
                            if (atomicReference.get() != efVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // f8.r
    public final String j() {
        f8.y yVar;
        ra raVar = this.f2239v;
        if (raVar == null || (yVar = (f8.y) ((xc) raVar.f2737a).f2983e) == null) {
            return null;
        }
        String obj = yVar.toString();
        String p4 = v4.a.p(new StringBuilder(obj.length() + 11), "callable=[", obj, "]");
        ef efVar = (ef) ((AtomicReference) this.f2239v.f2739c).get();
        if (efVar == null) {
            return p4;
        }
        int length = p4.length();
        String rVar = efVar.toString();
        StringBuilder sb2 = new StringBuilder(rVar.length() + length + 9 + 1);
        sb2.append(p4);
        sb2.append(", trial=[");
        sb2.append(rVar);
        sb2.append("]");
        return sb2.toString();
    }
}
