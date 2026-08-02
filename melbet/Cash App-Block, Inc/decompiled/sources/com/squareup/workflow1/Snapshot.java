package com.squareup.workflow1;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Snapshot {
    public final Lazy bytes$delegate = LazyKt.lazy(new Snapshot$bytes$2(this, 0));
    public final Function0 toByteString;

    public Snapshot(Function0 function0) {
        this.toByteString = function0;
    }

    public final ByteString bytes() {
        return (ByteString) this.bytes$delegate.getValue();
    }

    public final boolean equals(Object obj) {
        Snapshot snapshot = obj instanceof Snapshot ? (Snapshot) obj : null;
        if (snapshot == null) {
            return false;
        }
        return Intrinsics.areEqual(bytes(), snapshot.bytes());
    }

    public final int hashCode() {
        return bytes().hashCode();
    }

    public final String toString() {
        return "Snapshot(" + bytes() + ')';
    }
}
