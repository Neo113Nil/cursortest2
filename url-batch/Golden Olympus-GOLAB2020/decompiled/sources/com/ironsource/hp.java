package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class hp {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private ip f16632a;

    /* renamed from: b, reason: collision with root package name */
    private long f16633b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16634c;

    public hp() {
        this(false, 1, null);
    }

    @Nullable
    public final ip a() {
        return this.f16632a;
    }

    @NotNull
    public abstract String b();

    public final long c() {
        return this.f16633b;
    }

    public final boolean d() {
        return this.f16634c;
    }

    public hp(boolean z4) {
        this.f16634c = z4;
    }

    public final void a(@Nullable ip ipVar) {
        this.f16632a = ipVar;
    }

    public /* synthetic */ hp(boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z4);
    }

    public final void a(boolean z4) {
        this.f16634c = z4;
        if (!z4) {
            ip ipVar = this.f16632a;
            if (ipVar != null) {
                ipVar.b(this);
                return;
            }
            return;
        }
        this.f16633b = System.currentTimeMillis();
        ip ipVar2 = this.f16632a;
        if (ipVar2 != null) {
            ipVar2.a(this);
        }
    }
}
