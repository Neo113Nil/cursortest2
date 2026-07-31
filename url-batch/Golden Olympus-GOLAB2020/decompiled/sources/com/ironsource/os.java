package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class os implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private Long f18550a;

    @Nullable
    public final Long a() {
        return this.f18550a;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public final void a(@Nullable Long l4) {
        this.f18550a = l4;
    }
}
