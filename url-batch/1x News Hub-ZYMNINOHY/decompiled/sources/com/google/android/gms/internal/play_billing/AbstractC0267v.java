package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.play_billing.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0267v implements Comparable, Serializable {
    public abstract int a(AbstractC0267v abstractC0267v);

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0267v)) {
            return false;
        }
        try {
            return a((AbstractC0267v) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();
}
