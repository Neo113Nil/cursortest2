package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class Be {

    /* renamed from: a, reason: collision with root package name */
    public final int f37237a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f37238b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f37239c = 1;

    public final int a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f37237a;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return this.f37238b;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return this.f37239c;
        }
        throw new W1.m();
    }

    @Nullable
    public final Boolean a(int i4) {
        if (i4 == this.f37238b) {
            return Boolean.FALSE;
        }
        if (i4 == this.f37239c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
