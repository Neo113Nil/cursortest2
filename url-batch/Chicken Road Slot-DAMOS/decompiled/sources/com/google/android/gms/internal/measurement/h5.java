package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h5 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2366d;

    /* renamed from: e, reason: collision with root package name */
    public int f2367e = 0;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2368i;

    public /* synthetic */ h5(int i3, Object obj) {
        this.f2366d = i3;
        this.f2368i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2366d) {
            case 0:
                if (this.f2367e < ((i5) this.f2368i).f2395d.length()) {
                }
                break;
            case 1:
                if (this.f2367e < ((i5) this.f2368i).f2395d.length()) {
                }
                break;
            default:
                if (this.f2367e < ((n1) this.f2368i).q()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f2366d) {
            case 0:
                String str = ((i5) this.f2368i).f2395d;
                int i3 = this.f2367e;
                if (i3 < str.length()) {
                    this.f2367e = i3 + 1;
                    return new i5(String.valueOf(i3));
                }
                kotlin.collections.i0.c();
                return null;
            case 1:
                i5 i5Var = (i5) this.f2368i;
                String str2 = i5Var.f2395d;
                int i10 = this.f2367e;
                if (i10 < str2.length()) {
                    this.f2367e = i10 + 1;
                    return new i5(String.valueOf(i5Var.f2395d.charAt(i10)));
                }
                kotlin.collections.i0.c();
                return null;
            default:
                n1 n1Var = (n1) this.f2368i;
                int i11 = this.f2367e;
                int q3 = n1Var.q();
                int i12 = this.f2367e;
                if (i11 >= q3) {
                    throw new NoSuchElementException(v4.a.n(new StringBuilder(String.valueOf(i12).length() + 21), "Out of bounds index: ", i12));
                }
                this.f2367e = i12 + 1;
                return n1Var.r(i12);
        }
    }
}
