package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class fj implements pv {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final dm f16258a;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16259a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.b("Load task config is null");
        }
    }

    public fj(@Nullable dm dmVar) {
        this.f16258a = dmVar;
    }

    @Override // com.ironsource.pv
    public void a() {
        a(this.f16258a != null, a.f16259a);
    }
}
