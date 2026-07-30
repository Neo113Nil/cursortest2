package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzids implements Iterator {
    private final ArrayDeque zza;
    private zziak zzb;

    /* synthetic */ zzids(zzian zzianVar, byte[] bArr) {
        if (!(zzianVar instanceof zzidt)) {
            this.zza = null;
            this.zzb = (zziak) zzianVar;
            return;
        }
        zzidt zzidtVar = (zzidt) zzianVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzidtVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zzidtVar);
        this.zzb = zzb(zzidtVar.zzo());
    }

    private final zziak zzb(zzian zzianVar) {
        while (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            this.zza.push(zzidtVar);
            zzianVar = zzidtVar.zzo();
        }
        return (zziak) zzianVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zziak next() {
        zziak zziakVar;
        zziak zziakVar2 = this.zzb;
        if (zziakVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zziakVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zziakVar = zzb(((zzidt) arrayDeque.pop()).zzE());
        } while (zziakVar.zzc() == 0);
        this.zzb = zziakVar;
        return zziakVar2;
    }
}
