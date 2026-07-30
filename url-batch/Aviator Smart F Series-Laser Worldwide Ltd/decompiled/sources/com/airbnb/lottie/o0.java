package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 {

    @Nullable
    private final Throwable exception;

    @Nullable
    private final Object value;

    public o0(Object obj) {
        this.value = obj;
        this.exception = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (getValue() != null && getValue().equals(o0Var.getValue())) {
            return true;
        }
        if (getException() == null || o0Var.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    @Nullable
    public Throwable getException() {
        return this.exception;
    }

    @Nullable
    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public o0(Throwable th) {
        this.exception = th;
        this.value = null;
    }
}
