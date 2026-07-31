package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jw<Smash extends q7<?>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1571u0 f16882a;

    @Metadata
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return Z1.a.d(Integer.valueOf(((q7) t4).i().l()), Integer.valueOf(((q7) t5).i().l()));
        }
    }

    public jw(@NotNull C1571u0 managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.f16882a = managerData;
    }

    public final boolean a(@NotNull q7<?> smash, @NotNull List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((q7) obj).x()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, smash);
    }

    @NotNull
    public final List<Smash> b(@NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    @Nullable
    public final Smash c(@NotNull List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((q7) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    @NotNull
    public final kw<Smash> d(@NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f16882a.b().name() + " waterfall size: " + waterfall.size());
        lw a4 = lw.f17119g.a(this.f16882a.c() ? hw.BIDDER_SENSITIVE : hw.DEFAULT, this.f16882a.i(), this.f16882a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            a4.d(it.next());
            if (a4.e()) {
                return new kw<>(a4);
            }
        }
        return new kw<>(a4);
    }

    public final boolean a(@NotNull List<? extends Smash> waterfall) {
        int i4;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i4 = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i4 = 0;
            while (it.hasNext()) {
                if (((q7) it.next()).y() && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i4 >= this.f16882a.i();
    }
}
