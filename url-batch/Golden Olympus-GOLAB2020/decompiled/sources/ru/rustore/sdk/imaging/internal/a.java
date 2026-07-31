package ru.rustore.sdk.imaging.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f43646a;

    public a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f43646a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f43646a, ((a) obj).f43646a);
    }

    public final int hashCode() {
        return this.f43646a.hashCode();
    }

    public final String toString() {
        return "BitmapKey(value=" + this.f43646a + ')';
    }
}
