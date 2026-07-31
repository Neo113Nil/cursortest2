package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mm;
import com.ironsource.ob;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface o extends ob<String> {

    @Metadata
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17540a;

        public a(@NotNull String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.f17540a = rowAdm;
        }

        @Override // com.ironsource.ob
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f17540a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@NotNull mm<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.f17540a);
        }
    }

    <T> T a(@NotNull mm<String, T> mmVar);
}
