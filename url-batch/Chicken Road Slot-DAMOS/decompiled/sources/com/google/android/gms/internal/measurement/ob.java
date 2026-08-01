package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ob implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f2641d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2642e;

    /* renamed from: i, reason: collision with root package name */
    public final int f2643i;

    /* renamed from: r, reason: collision with root package name */
    public final long f2644r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f2645s;

    /* renamed from: t, reason: collision with root package name */
    public final RuntimeException f2646t;

    public ob(long j, String str, int i3, long j3, Object obj) {
        i7.a.t(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f2641d = j;
        this.f2642e = str;
        this.f2643i = i3;
        this.f2644r = j3;
        this.f2645s = obj;
        if (i3 != 5) {
            this.f2646t = null;
            return;
        }
        if (obj == null) {
            this.f2646t = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof v0)) {
            this.f2646t = null;
        } else {
            this.f2646t = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i3 = this.f2643i;
        if (i3 == 0) {
            return Boolean.FALSE;
        }
        if (i3 == 1) {
            return Boolean.TRUE;
        }
        long j = this.f2644r;
        if (i3 == 2) {
            return Long.valueOf(j);
        }
        if (i3 == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.f2645s;
        if (i3 == 4) {
            obj.getClass();
            return obj;
        }
        if (i3 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((v0) obj).n();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f2646t;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ob obVar = (ob) obj;
        long j = obVar.f2641d;
        long j3 = this.f2641d;
        int compare = Long.compare(j3, j);
        if (compare != 0) {
            return compare;
        }
        if (j3 != 0) {
            return 0;
        }
        String str = this.f2642e;
        str.getClass();
        String str2 = obVar.f2642e;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return this.f2641d == obVar.f2641d && Objects.equals(this.f2642e, obVar.f2642e);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f2641d), this.f2642e);
    }

    public final String toString() {
        String str = this.f2642e;
        if (str == null) {
            str = Long.toString(this.f2641d);
        }
        String valueOf = String.valueOf(a());
        return v4.a.p(new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), str, ":", valueOf);
    }
}
