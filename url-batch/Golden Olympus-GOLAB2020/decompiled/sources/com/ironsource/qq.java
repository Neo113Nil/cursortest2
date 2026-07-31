package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class qq implements pv {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final dm f18874a;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18875a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f20181a.d("Load task config is null");
        }
    }

    public qq(@Nullable dm dmVar) {
        this.f18874a = dmVar;
    }

    @Override // com.ironsource.pv
    public void a() {
        a(this.f18874a != null, a.f18875a);
    }
}
