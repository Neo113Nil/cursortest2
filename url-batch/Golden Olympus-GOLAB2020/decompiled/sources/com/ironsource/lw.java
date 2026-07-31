package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class lw<Smash extends q7<?>> {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f17119g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f17120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17121b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Smash> f17122c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Smash> f17123d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Smash> f17124e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Smash> f17125f;

    @Metadata
    public static final class a {

        @Metadata
        /* renamed from: com.ironsource.lw$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0152a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17126a;

            static {
                int[] iArr = new int[hw.values().length];
                try {
                    iArr[hw.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hw.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f17126a = iArr;
            }
        }

        private a() {
        }

        @NotNull
        public final <Smash extends q7<?>> lw<Smash> a(@NotNull hw loadingStrategy, int i4, boolean z4, @NotNull List<? extends Smash> waterfall) {
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i5 = C0152a.f17126a[loadingStrategy.ordinal()];
            if (i5 == 1) {
                return new ka(i4, z4, waterfall);
            }
            if (i5 != 2) {
                throw new W1.m();
            }
            return new v7(i4, z4, waterfall, false, 8, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lw(int i4, boolean z4, @NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f17120a = i4;
        this.f17121b = z4;
        this.f17122c = waterfall;
        this.f17123d = new ArrayList();
        this.f17124e = new ArrayList();
        this.f17125f = new ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b() {
        Integer num;
        List<Smash> list = this.f17122c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q7) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(a((q7) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(a((q7) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public final List<Smash> c() {
        return this.f17123d;
    }

    public abstract void c(@NotNull Smash smash);

    public final int d() {
        return this.f17123d.size() + this.f17124e.size() + this.f17125f.size();
    }

    public boolean e() {
        return d() >= this.f17120a;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    @NotNull
    public final List<Smash> a() {
        return this.f17125f;
    }

    public final void d(@NotNull Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.f17124e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f17125f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f17125f.add(smash);
            return;
        }
        if (!this.f17121b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }
}
