package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class rg extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f18910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f18910a = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f18910a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(rg.class, obj.getClass())) {
            return false;
        }
        rg rgVar = (rg) obj;
        if (this.f18910a.getErrorCode() != rgVar.f18910a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.f18910a.getErrorMessage(), rgVar.f18910a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18910a.getErrorCode()), this.f18910a.getErrorMessage());
    }
}
