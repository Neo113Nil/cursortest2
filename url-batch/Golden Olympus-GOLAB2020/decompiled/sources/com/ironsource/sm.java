package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class sm {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f19618m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final int f19619n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19620a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C1477h4 f19621b;

    /* renamed from: c, reason: collision with root package name */
    private int f19622c;

    /* renamed from: d, reason: collision with root package name */
    private long f19623d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19624e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<dn> f19625f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private dn f19626g;

    /* renamed from: h, reason: collision with root package name */
    private int f19627h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private C1529o5 f19628i;

    /* renamed from: j, reason: collision with root package name */
    private long f19629j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19630k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19631l;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sm(int i4, long j4, boolean z4, @NotNull C1477h4 events, @NotNull C1529o5 auctionSettings, int i5, long j5, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f19620a = z7;
        this.f19625f = new ArrayList<>();
        this.f19622c = i4;
        this.f19623d = j4;
        this.f19624e = z4;
        this.f19621b = events;
        this.f19627h = i5;
        this.f19628i = auctionSettings;
        this.f19629j = j5;
        this.f19630k = z5;
        this.f19631l = z6;
    }

    @Nullable
    public final dn a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        ArrayList<dn> arrayList = this.f19625f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            dn dnVar = arrayList.get(i4);
            i4++;
            dn dnVar2 = dnVar;
            if (Intrinsics.areEqual(dnVar2.getPlacementName(), placementName)) {
                return dnVar2;
            }
        }
        return null;
    }

    public final int b() {
        return this.f19622c;
    }

    public final long c() {
        return this.f19623d;
    }

    @NotNull
    public final C1529o5 d() {
        return this.f19628i;
    }

    @Nullable
    public final dn e() {
        ArrayList<dn> arrayList = this.f19625f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            dn dnVar = arrayList.get(i4);
            i4++;
            dn dnVar2 = dnVar;
            if (dnVar2.isDefault()) {
                return dnVar2;
            }
        }
        return this.f19626g;
    }

    public final int f() {
        return this.f19627h;
    }

    @NotNull
    public final C1477h4 g() {
        return this.f19621b;
    }

    public final long h() {
        return this.f19629j;
    }

    public final boolean i() {
        return this.f19630k;
    }

    public final boolean j() {
        return this.f19620a;
    }

    public final boolean k() {
        return this.f19631l;
    }

    @NotNull
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f19622c + ", bidderExclusive=" + this.f19624e + '}';
    }

    public final void a(int i4) {
        this.f19622c = i4;
    }

    public final void b(int i4) {
        this.f19627h = i4;
    }

    public final void c(boolean z4) {
        this.f19631l = z4;
    }

    public final void a(long j4) {
        this.f19623d = j4;
    }

    public final void b(long j4) {
        this.f19629j = j4;
    }

    public final void a(@Nullable dn dnVar) {
        if (dnVar != null) {
            this.f19625f.add(dnVar);
            if (this.f19626g == null || dnVar.getPlacementId() == 0) {
                this.f19626g = dnVar;
            }
        }
    }

    public final void b(boolean z4) {
        this.f19630k = z4;
    }

    public final void a(@NotNull C1477h4 c1477h4) {
        Intrinsics.checkNotNullParameter(c1477h4, "<set-?>");
        this.f19621b = c1477h4;
    }

    public final void a(@NotNull C1529o5 c1529o5) {
        Intrinsics.checkNotNullParameter(c1529o5, "<set-?>");
        this.f19628i = c1529o5;
    }

    public final void a(boolean z4) {
        this.f19624e = z4;
    }

    public final boolean a() {
        return this.f19624e;
    }
}
