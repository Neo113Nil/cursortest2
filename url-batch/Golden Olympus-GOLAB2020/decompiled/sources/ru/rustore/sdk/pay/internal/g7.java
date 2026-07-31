package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final bk f44162a;

    public g7(@NotNull bk sessionManager) {
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f44162a = sessionManager;
    }

    @Nullable
    public final Url a() {
        ak akVar = this.f44162a.f43878d.f44190a.get();
        ak.c cVar = akVar instanceof ak.c ? (ak.c) akVar : null;
        bk bkVar = this.f44162a;
        bkVar.f43880f.f44952a.set(null);
        bkVar.f43879e.f44670a.set(null);
        bkVar.f43878d.f44190a.set(null);
        if (cVar != null) {
            return cVar.f43834e;
        }
        return null;
    }
}
