package com.ironsource;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1531p0 {

    @Metadata
    /* renamed from: com.ironsource.p0$a */
    public interface a {
        void a(@NotNull EnumC1518n1 enumC1518n1, @NotNull String str);

        void a(@NotNull C1524o0 c1524o0);

        void a(@NotNull JSONObject jSONObject, @NotNull EnumC1518n1 enumC1518n1, @NotNull String str);
    }

    @Nullable
    C1524o0 a(@NotNull String str);

    @NotNull
    List<C1524o0> a();
}
