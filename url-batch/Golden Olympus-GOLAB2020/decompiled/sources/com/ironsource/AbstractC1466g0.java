package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1466g0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f16317c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f16318a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dw f16319b;

    @Metadata
    /* renamed from: com.ironsource.g0$a */
    public static final class a {

        @Metadata
        /* renamed from: com.ironsource.g0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0146a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16320a;

            static {
                int[] iArr = new int[hw.values().length];
                try {
                    iArr[hw.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hw.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16320a = iArr;
            }
        }

        private a() {
        }

        @NotNull
        public final AbstractC1466g0 a(@NotNull AbstractC1584w1 adUnitData, @NotNull dw waterfallInstances) {
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i4 = C0146a.f16320a[(adUnitData.d() ? hw.BIDDER_SENSITIVE : hw.DEFAULT).ordinal()];
            if (i4 == 1) {
                return new u7(adUnitData, waterfallInstances);
            }
            if (i4 == 2) {
                return adUnitData.q() ? new ot(adUnitData, waterfallInstances) : new ha(adUnitData, waterfallInstances);
            }
            throw new W1.m();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.g0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<AbstractC1424a0> f16321a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<AbstractC1424a0> f16322b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<AbstractC1424a0> f16323c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private boolean f16324d;

        @NotNull
        public final List<AbstractC1424a0> a() {
            return this.f16321a;
        }

        @NotNull
        public final List<AbstractC1424a0> b() {
            return this.f16322b;
        }

        @NotNull
        public final List<AbstractC1424a0> c() {
            return this.f16323c;
        }

        public final boolean d() {
            return this.f16324d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f16321a.isEmpty() && this.f16323c.isEmpty();
        }

        public final int g() {
            return this.f16321a.size() + this.f16322b.size() + this.f16323c.size();
        }

        public final void a(boolean z4) {
            this.f16324d = z4;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.g0$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final AbstractC1424a0 f16325a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<AbstractC1424a0> f16326b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Nullable AbstractC1424a0 abstractC1424a0, @NotNull List<? extends AbstractC1424a0> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.f16325a = abstractC1424a0;
            this.f16326b = orderedInstances;
        }

        @Nullable
        public final AbstractC1424a0 a() {
            return this.f16325a;
        }

        @NotNull
        public final List<AbstractC1424a0> b() {
            return this.f16326b;
        }

        @Nullable
        public final AbstractC1424a0 c() {
            return this.f16325a;
        }

        @NotNull
        public final List<AbstractC1424a0> d() {
            return this.f16326b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f16325a, cVar.f16325a) && Intrinsics.areEqual(this.f16326b, cVar.f16326b);
        }

        public int hashCode() {
            AbstractC1424a0 abstractC1424a0 = this.f16325a;
            return ((abstractC1424a0 == null ? 0 : abstractC1424a0.hashCode()) * 31) + this.f16326b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f16325a + ", orderedInstances=" + this.f16326b + ')';
        }

        @NotNull
        public final c a(@Nullable AbstractC1424a0 abstractC1424a0, @NotNull List<? extends AbstractC1424a0> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(abstractC1424a0, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, AbstractC1424a0 abstractC1424a0, List list, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                abstractC1424a0 = cVar.f16325a;
            }
            if ((i4 & 2) != 0) {
                list = cVar.f16326b;
            }
            return cVar.a(abstractC1424a0, list);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.g0$d */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return Z1.a.d(Integer.valueOf(((AbstractC1424a0) t4).h().l()), Integer.valueOf(((AbstractC1424a0) t5).h().l()));
        }
    }

    public AbstractC1466g0(@NotNull AbstractC1584w1 adUnitData, @NotNull dw waterfallInstances) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f16318a = adUnitData;
        this.f16319b = waterfallInstances;
    }

    private final List<AbstractC1424a0> b() {
        return CollectionsKt.sortedWith(this.f16319b.b(), new d());
    }

    public abstract void a(@NotNull AbstractC1424a0 abstractC1424a0, @NotNull b bVar);

    public final boolean a() {
        int i4;
        List<AbstractC1424a0> b4 = this.f16319b.b();
        if ((b4 instanceof Collection) && b4.isEmpty()) {
            i4 = 0;
        } else {
            Iterator<T> it = b4.iterator();
            i4 = 0;
            while (it.hasNext()) {
                if (((AbstractC1424a0) it.next()).v() && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i4 >= this.f16318a.k();
    }

    @NotNull
    public final c c() {
        Object obj;
        List<AbstractC1424a0> b4 = b();
        Iterator<T> it = b4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC1424a0) obj).v()) {
                break;
            }
        }
        return new c((AbstractC1424a0) obj, b4);
    }

    @NotNull
    public final b d() {
        IronLog.INTERNAL.verbose(this.f16318a.b().a().name() + " waterfall size: " + this.f16319b.b().size());
        b bVar = new b();
        Iterator<AbstractC1424a0> it = this.f16319b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }

    private final boolean b(AbstractC1424a0 abstractC1424a0, b bVar) {
        IronLog ironLog;
        StringBuilder sb;
        String str;
        List<AbstractC1424a0> c4;
        if (!abstractC1424a0.u()) {
            if (abstractC1424a0.v()) {
                IronLog.INTERNAL.verbose(abstractC1424a0.d().name() + " - Instance " + abstractC1424a0.p() + " is already loaded");
                c4 = bVar.b();
            } else if (abstractC1424a0.w()) {
                IronLog.INTERNAL.verbose(abstractC1424a0.d().name() + " - Instance " + abstractC1424a0.p() + " still loading");
                c4 = bVar.c();
            } else {
                if (!a(abstractC1424a0, this.f16319b)) {
                    a(abstractC1424a0, bVar);
                    return a(bVar);
                }
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(abstractC1424a0.d().name());
                sb.append(" - Instance ");
                sb.append(abstractC1424a0.p());
                str = " is not better than already loaded instances";
            }
            c4.add(abstractC1424a0);
            return a(bVar);
        }
        ironLog = IronLog.INTERNAL;
        sb = new StringBuilder();
        sb.append(abstractC1424a0.d().name());
        sb.append(" - Instance ");
        sb.append(abstractC1424a0.p());
        str = " is failed to load";
        sb.append(str);
        ironLog.verbose(sb.toString());
        return a(bVar);
    }

    public final boolean a(@NotNull AbstractC1424a0 instance) {
        Object obj;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((AbstractC1424a0) obj).u()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, instance);
    }

    protected boolean a(@NotNull AbstractC1424a0 instance, @NotNull dw waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public boolean a(@NotNull b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f16318a.k();
    }
}
