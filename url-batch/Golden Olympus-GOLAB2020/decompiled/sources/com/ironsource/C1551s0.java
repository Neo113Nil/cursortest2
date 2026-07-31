package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1551s0 implements pv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18930a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final vi f18931b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18932c;

    @Metadata
    /* renamed from: com.ironsource.s0$a */
    static final class a extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18933a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.r();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.s0$b */
    static final class b extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18934a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.o();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.s0$c */
    static final class c extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18935a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.n();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.s0$d */
    static final class d extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18936a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.q();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.s0$e */
    static final class e extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18937a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.o();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.s0$f */
    static final class f extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f18938a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.g();
        }
    }

    public C1551s0(@NotNull String adm, @Nullable vi viVar, boolean z4) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f18930a = adm;
        this.f18931b = viVar;
        this.f18932c = z4;
    }

    @Override // com.ironsource.pv
    public void a() {
        a(this.f18932c, a.f18933a);
        a(this.f18931b != null, b.f18934a);
        vi viVar = this.f18931b;
        if (viVar != null) {
            if (viVar.c() == xi.NonBidder) {
                a(this.f18930a.length() == 0, c.f18935a);
            }
            if (viVar.c() == xi.Bidder) {
                a(this.f18930a.length() > 0, d.f18936a);
            }
            a(viVar.c() != xi.NotSupported, e.f18937a);
            a(viVar.b().length() > 0, f.f18938a);
        }
    }
}
