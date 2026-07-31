package com.ironsource;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public enum dt {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f15931a;

    dt(int i4) {
        this.f15931a = i4;
    }

    public final int b() {
        return this.f15931a;
    }
}
