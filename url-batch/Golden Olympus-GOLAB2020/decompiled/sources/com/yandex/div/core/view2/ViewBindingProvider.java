package com.yandex.div.core.view2;

import O1.C1165z4;
import com.yandex.div.DivDataTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ViewBindingProvider {

    @NotNull
    private Binding current;

    @NotNull
    private final List<Function1<Binding, Unit>> observers;

    public ViewBindingProvider() {
        DivDataTag INVALID = DivDataTag.INVALID;
        Intrinsics.checkNotNullExpressionValue(INVALID, "INVALID");
        this.current = new Binding(INVALID, null);
        this.observers = new ArrayList();
    }

    public final void observeAndGet(@NotNull Function1<? super Binding, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        observer.invoke(this.current);
        this.observers.add(observer);
    }

    public final void update(@NotNull DivDataTag tag, @Nullable C1165z4 c1165z4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(tag, this.current.getTag()) && this.current.getData() == c1165z4) {
            return;
        }
        this.current = new Binding(tag, c1165z4);
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.current);
        }
    }
}
