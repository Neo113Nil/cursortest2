package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2886pf implements Yn {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39620a;

    public C2886pf(@NotNull C2937rf c2937rf) {
        boolean z4;
        List<C2912qf> list = c2937rf.f39729b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C2912qf) it.next()).f39661c == EnumC2775l8.f39393c) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        this.f39620a = z4;
    }

    @Override // io.appmetrica.analytics.impl.Yn, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C2912qf> invoke(@NotNull List<? extends C2912qf> list, @NotNull Ef ef) {
        C2912qf c2912qf = new C2912qf(ef.f37445a, ef.f37446b, ef.f37449e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C2912qf) it.next()).f39661c == ef.f37449e) {
                    if (c2912qf.f39661c == EnumC2775l8.f39393c && this.f39620a) {
                        return CollectionsKt.plus((Collection<? extends C2912qf>) list, c2912qf);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.plus((Collection<? extends C2912qf>) list, c2912qf);
    }
}
