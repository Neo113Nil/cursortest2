package com.ironsource;

import com.ironsource.C1563t;
import com.ironsource.gf;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1572u1 implements k8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wl f19860a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C1563t> f19861b;

    public C1572u1(@NotNull wl tools, @NotNull Map<LevelPlay.AdFormat, C1563t> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f19860a = tools;
        this.f19861b = adFormatsConfigurations;
    }

    private final void b(gf.a aVar, String str, C1563t.d dVar) {
        dp e4 = dVar.e();
        if (e4 != null) {
            n8 n8Var = n8.Pacing;
            a(aVar.a(str, n8Var, new e8(e4.a(), e4.b(), e4.c())), str, n8Var);
        }
    }

    @Override // com.ironsource.k8
    public void a(@NotNull gf.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C1563t>> it = this.f19861b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C1563t.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C1563t.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(gf.a aVar, String str, C1563t.d dVar) {
        h8 b4 = dVar.b();
        if (b4 != null) {
            n8 n8Var = n8.ShowCount;
            a(aVar.a(str, n8Var, new e8(b4.a(), b4.b(), b4.c())), str, n8Var);
        }
    }

    private final void a(Object obj, String str, n8 n8Var) {
        Throwable d4 = Result.d(obj);
        if (d4 != null) {
            this.f19860a.a(str, new i8().a(n8Var), d4.getMessage());
        }
    }
}
