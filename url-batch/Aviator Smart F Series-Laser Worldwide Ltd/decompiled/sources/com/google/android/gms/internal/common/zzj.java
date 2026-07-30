package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
abstract class zzj implements Iterator {

    @CheckForNull
    private Object zza;
    private int zzb = 2;

    protected zzj() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8 = this.zzb;
        if (i8 == 4) {
            throw new IllegalStateException();
        }
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    protected abstract Object zza();

    @CanIgnoreReturnValue
    @CheckForNull
    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
