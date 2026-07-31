package com.ironsource;

import com.ironsource.ai;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class rs implements ai, ai.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f18922a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f18923b = new HashMap();

    @Override // com.ironsource.ai.a
    public void a(@NotNull ai.b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            try {
                String c4 = smash.c();
                if (this.f18922a.containsKey(c4)) {
                    Map<String, Integer> map = this.f18922a;
                    Integer num = map.get(c4);
                    Intrinsics.checkNotNull(num);
                    map.put(c4, Integer.valueOf(num.intValue() + 1));
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.ai
    public boolean b(@NotNull ai.b smash) {
        boolean z4;
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String c4 = smash.c();
            if (this.f18922a.containsKey(c4)) {
                Integer num = this.f18922a.get(c4);
                Intrinsics.checkNotNull(num);
                z4 = num.intValue() >= smash.b();
            }
        }
        return z4;
    }

    @Override // com.ironsource.ai.a
    public void a(@NotNull List<? extends ai.b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (ai.b bVar : smashes) {
            this.f18922a.put(bVar.c(), 0);
            this.f18923b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.ai
    public boolean a() {
        for (String str : this.f18923b.keySet()) {
            Integer num = this.f18922a.get(str);
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Integer num2 = this.f18923b.get(str);
            Intrinsics.checkNotNull(num2);
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
