package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class GO {

    /* renamed from: b, reason: collision with root package name */
    public static final GO f25152b = new GO(new Mt((byte) 0, 12));

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2917aC f25153a;

    public GO(Mt mt) {
        this.f25153a = (AbstractC2917aC) mt.f26393u;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GO) && this.f25153a.equals(((GO) obj).f25153a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f25153a, null, null, bool, bool, bool, bool, bool);
    }
}
