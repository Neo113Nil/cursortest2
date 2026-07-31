package com.yandex.div.core.view2.animations;

import java.util.Iterator;
import k0.AbstractC3204l;
import k0.C3208p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class TransitionsKt {
    public static final void plusAssign(@NotNull C3208p c3208p, @NotNull Iterable<? extends AbstractC3204l> transitions) {
        Intrinsics.checkNotNullParameter(c3208p, "<this>");
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Iterator<? extends AbstractC3204l> it = transitions.iterator();
        while (it.hasNext()) {
            c3208p.p(it.next());
        }
    }
}
