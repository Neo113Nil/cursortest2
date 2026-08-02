package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ary {
    public static final ary a = new ary();
    public final ayk b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public ary(ary aryVar) {
        aryVar.getClass();
        this.c = aryVar.c;
        this.d = aryVar.d;
        this.b = aryVar.b;
        this.j = aryVar.j;
        this.e = aryVar.e;
        this.f = aryVar.f;
        this.i = aryVar.i;
        this.g = aryVar.g;
        this.h = aryVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ksp.b(getClass(), obj.getClass())) {
            return false;
        }
        ary aryVar = (ary) obj;
        if (this.c == aryVar.c && this.d == aryVar.d && this.e == aryVar.e && this.f == aryVar.f && this.g == aryVar.g && this.h == aryVar.h && ksp.b(a(), aryVar.a()) && this.j == aryVar.j) {
            return ksp.b(this.i, aryVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.j * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        long j = this.h;
        long j2 = this.g;
        int hashCode = ((((((((i + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        NetworkRequest a2 = a();
        return (hashCode * 31) + (a2 != null ? a2.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) yo.e(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public ary() {
        kpm kpmVar = kpm.a;
        this.b = new ayk(null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = kpmVar;
    }

    public ary(ayk aykVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        aykVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = aykVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
