package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class d7 implements pv {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final dm f15825a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final AdSize f15826b;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15827a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.a("Load task config is null");
        }
    }

    @Metadata
    static final class b extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15828a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.l();
        }
    }

    public d7(@Nullable dm dmVar, @Nullable AdSize adSize) {
        this.f15825a = dmVar;
        this.f15826b = adSize;
    }

    @Override // com.ironsource.pv
    public void a() {
        a(this.f15825a != null, a.f15827a);
        a(this.f15826b != null, b.f15828a);
    }
}
