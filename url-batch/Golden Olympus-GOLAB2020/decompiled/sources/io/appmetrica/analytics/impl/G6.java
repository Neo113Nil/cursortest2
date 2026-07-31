package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class G6 implements InterfaceC2488ab {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f37566a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC2488ab
    public final void a(@Nullable Throwable th, @NotNull U u4) {
        Iterator it = this.f37566a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2488ab) it.next()).a(th, u4);
        }
    }

    public final void a(@NotNull InterfaceC2488ab... interfaceC2488abArr) {
        CollectionsKt.addAll(this.f37566a, interfaceC2488abArr);
    }

    public final void a(@NotNull List<? extends InterfaceC2488ab> list) {
        this.f37566a.addAll(list);
    }

    public final void a() {
        this.f37566a.clear();
    }
}
