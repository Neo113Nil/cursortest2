package com.ironsource;

import com.ironsource.C1563t;
import com.ironsource.ag;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class op {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wl f18548a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C1563t> f18549b;

    public op(@NotNull wl tools, @NotNull Map<LevelPlay.AdFormat, C1563t> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f18548a = tools;
        this.f18549b = adFormatsConfigurations;
    }

    private final void b(ag.a aVar, String str, LevelPlay.AdFormat adFormat, C1563t.d dVar) {
        n8 n8Var = n8.Delivery;
        oa c4 = dVar.c();
        a(aVar.a(str, adFormat, n8Var, new e8(c4 != null ? Boolean.valueOf(c4.a()) : null, null, null, 6, null)), str, adFormat, n8Var);
    }

    private final void c(ag.a aVar, String str, LevelPlay.AdFormat adFormat, C1563t.d dVar) {
        dp e4 = dVar.e();
        if (e4 != null) {
            n8 n8Var = n8.Pacing;
            a(aVar.a(str, adFormat, n8Var, new e8(e4.a(), e4.b(), m8.Second)), str, adFormat, n8Var);
        }
    }

    public final void a(@NotNull ag.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C1563t> entry : this.f18549b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C1563t.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C1563t.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(ag.a aVar, String str, LevelPlay.AdFormat adFormat, C1563t.d dVar) {
        h8 b4 = dVar.b();
        if (b4 != null) {
            n8 n8Var = n8.ShowCount;
            a(aVar.a(str, adFormat, n8Var, new e8(b4.a(), b4.b(), b4.c())), str, adFormat, n8Var);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, n8 n8Var) {
        Throwable d4 = Result.d(obj);
        if (d4 != null) {
            this.f18548a.a(str, adFormat, new i8().a(n8Var), d4.getMessage());
        }
    }
}
