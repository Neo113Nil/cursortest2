package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class B5 implements InterfaceC3128yo {

    /* renamed from: a, reason: collision with root package name */
    public final List f37209a;

    public B5(@NotNull List<? extends Pair<String, ? extends InterfaceC3128yo>> list) {
        this.f37209a = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    @Nullable
    public final String a() {
        Iterator it = this.f37209a.iterator();
        while (it.hasNext()) {
            String a4 = ((InterfaceC3128yo) ((Pair) it.next()).getSecond()).a();
            if (a4 != null && a4.length() > 0) {
                return a4;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    public final void a(@NotNull String str) {
        Iterator it = this.f37209a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3128yo) ((Pair) it.next()).getSecond()).a(str);
        }
    }
}
