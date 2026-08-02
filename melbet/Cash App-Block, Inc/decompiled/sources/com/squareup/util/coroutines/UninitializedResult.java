package com.squareup.util.coroutines;

/* loaded from: classes8.dex */
public final class UninitializedResult {
    public static final UninitializedResult INSTANCE = new UninitializedResult();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UninitializedResult);
    }

    public final int hashCode() {
        return 1052254440;
    }

    public final String toString() {
        return "UninitializedResult";
    }
}
