package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.ak;

/* loaded from: classes3.dex */
public final class jn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final bk f44400a;

    public jn(@NotNull bk sessionManager) {
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f44400a = sessionManager;
    }

    @Nullable
    public final dn a() {
        ak akVar = this.f44400a.f43878d.f44190a.get();
        ak.c cVar = akVar instanceof ak.c ? (ak.c) akVar : null;
        if (cVar != null) {
            return cVar.f43833d;
        }
        return null;
    }
}
