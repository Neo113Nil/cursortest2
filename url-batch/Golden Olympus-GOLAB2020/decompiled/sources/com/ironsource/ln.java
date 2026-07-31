package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ln {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f17101e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile ln f17102f;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private dq f17103a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f17104b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f17105c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private s8 f17106d;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final InterfaceC1455e3 a(@NotNull IronSource.AD_UNIT adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            ln lnVar = ln.f17102f;
            s8 b4 = lnVar != null ? lnVar.b() : null;
            ln lnVar2 = ln.f17102f;
            dq e4 = lnVar2 != null ? lnVar2.e() : null;
            return (b4 == null || e4 == null) ? new kb() : new r7(b4, e4, adFormat);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ln a() {
            ln lnVar;
            ln lnVar2 = ln.f17102f;
            if (lnVar2 != null) {
                return lnVar2;
            }
            synchronized (this) {
                lnVar = ln.f17102f;
                if (lnVar == null) {
                    lnVar = new ln(null);
                    ln.f17102f = lnVar;
                }
            }
            return lnVar;
        }
    }

    private ln() {
        this.f17104b = new AtomicBoolean(false);
        this.f17105c = "";
    }

    @NotNull
    public static final ln d() {
        return f17101e.a();
    }

    @Nullable
    public final s8 b() {
        return this.f17106d;
    }

    @NotNull
    public final AtomicBoolean c() {
        return this.f17104b;
    }

    @Nullable
    public final dq e() {
        return this.f17103a;
    }

    @NotNull
    public final String f() {
        return this.f17105c;
    }

    public final void g() {
        this.f17104b.set(true);
    }

    public /* synthetic */ ln(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void a(@Nullable dq dqVar) {
        this.f17103a = dqVar;
    }

    public final void a(@Nullable s8 s8Var) {
        this.f17106d = s8Var;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f17105c = str;
    }
}
