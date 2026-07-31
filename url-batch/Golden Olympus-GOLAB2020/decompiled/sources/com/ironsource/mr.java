package com.ironsource;

import com.ironsource.xh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class mr implements xh, xh.a {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private lr f18074a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18075b;

    @Override // com.ironsource.xh
    @Nullable
    public fl a() {
        lr lrVar = this.f18074a;
        if (lrVar != null) {
            return new fl(lrVar);
        }
        return null;
    }

    @Override // com.ironsource.xh
    @Nullable
    public uj b() {
        lr lrVar = this.f18074a;
        if (lrVar != null) {
            return new uj(lrVar);
        }
        return null;
    }

    @Override // com.ironsource.xh
    public boolean c() {
        return this.f18075b;
    }

    @Override // com.ironsource.xh.a
    public void d() {
        this.f18075b = true;
    }

    @Override // com.ironsource.xh.a
    public void a(@NotNull lr sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f18074a = sdkConfig;
    }
}
