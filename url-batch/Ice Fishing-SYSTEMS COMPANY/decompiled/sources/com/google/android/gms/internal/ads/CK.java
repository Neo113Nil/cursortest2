package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CK extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24164n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EK f24165u;

    public /* synthetic */ CK(EK ek, int i) {
        this.f24164n = i;
        this.f24165u = ek;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f24164n) {
            case 0:
                this.f24165u.clear();
                break;
            default:
                this.f24165u.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        DK a9;
        switch (this.f24164n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                EK ek = this.f24165u;
                ek.getClass();
                Object key = entry.getKey();
                DK dk = null;
                if (key != null) {
                    try {
                        a9 = ek.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a9 != null && Objects.equals(a9.f24424z, entry.getValue())) {
                        dk = a9;
                    }
                    return dk == null;
                }
                a9 = null;
                if (a9 != null) {
                    dk = a9;
                }
                if (dk == null) {
                }
            default:
                return this.f24165u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f24164n) {
            case 0:
                return new BK(this.f24165u, 0);
            default:
                return new BK(this.f24165u, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        DK a9;
        switch (this.f24164n) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    EK ek = this.f24165u;
                    ek.getClass();
                    Object key = entry.getKey();
                    DK dk = null;
                    if (key != null) {
                        try {
                            a9 = ek.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a9 != null && Objects.equals(a9.f24424z, entry.getValue())) {
                            dk = a9;
                        }
                        if (dk == null) {
                            ek.b(dk, true);
                            break;
                        }
                    }
                    a9 = null;
                    if (a9 != null) {
                        dk = a9;
                    }
                    if (dk == null) {
                    }
                }
                break;
            default:
                EK ek2 = this.f24165u;
                ek2.getClass();
                DK dk2 = null;
                if (obj != null) {
                    try {
                        dk2 = ek2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (dk2 != null) {
                    ek2.b(dk2, true);
                }
                if (dk2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f24164n) {
        }
        return this.f24165u.f24703v;
    }
}
