package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1571u0 {

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f19842q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f19843r = -1;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f19844a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f19845b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f19846c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1529o5 f19847d;

    /* renamed from: e, reason: collision with root package name */
    private int f19848e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19849f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19850g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19851h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19852i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C1526o2 f19853j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C1482i2 f19854k;

    /* renamed from: l, reason: collision with root package name */
    private final long f19855l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f19856m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f19857n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f19858o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19859p;

    @Metadata
    /* renamed from: com.ironsource.u0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1571u0(@NotNull IronSource.AD_UNIT adUnit, @Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C1529o5 auctionSettings, int i4, int i5, boolean z4, int i6, int i7, @NotNull C1526o2 loadingData, @NotNull C1482i2 interactionData, long j4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f19844a = adUnit;
        this.f19845b = str;
        this.f19846c = list;
        this.f19847d = auctionSettings;
        this.f19848e = i4;
        this.f19849f = i5;
        this.f19850g = z4;
        this.f19851h = i6;
        this.f19852i = i7;
        this.f19853j = loadingData;
        this.f19854k = interactionData;
        this.f19855l = j4;
        this.f19856m = z5;
        this.f19857n = z6;
        this.f19858o = z7;
        this.f19859p = z8;
    }

    public final int a() {
        return this.f19852i;
    }

    @NotNull
    public final IronSource.AD_UNIT b() {
        return this.f19844a;
    }

    public final boolean c() {
        return this.f19850g;
    }

    @NotNull
    public final C1529o5 d() {
        return this.f19847d;
    }

    public final long e() {
        return this.f19855l;
    }

    public final int f() {
        return this.f19851h;
    }

    @NotNull
    public final C1482i2 g() {
        return this.f19854k;
    }

    @NotNull
    public final C1526o2 h() {
        return this.f19853j;
    }

    public final int i() {
        return this.f19848e;
    }

    @Nullable
    public List<NetworkSettings> j() {
        return this.f19846c;
    }

    public final boolean k() {
        return this.f19856m;
    }

    public final boolean l() {
        return this.f19858o;
    }

    public final boolean m() {
        return this.f19859p;
    }

    public final int n() {
        return this.f19849f;
    }

    @Nullable
    public String o() {
        return this.f19845b;
    }

    public final boolean p() {
        return this.f19857n;
    }

    public final boolean q() {
        return this.f19847d.g() > 0;
    }

    @NotNull
    public final String r() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f17335x, Integer.valueOf(this.f19848e), com.ironsource.mediationsdk.d.f17336y, Boolean.valueOf(this.f19850g), com.ironsource.mediationsdk.d.f17337z, Boolean.valueOf(this.f19859p));
        Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public /* synthetic */ C1571u0(IronSource.AD_UNIT ad_unit, String str, List list, C1529o5 c1529o5, int i4, int i5, boolean z4, int i6, int i7, C1526o2 c1526o2, C1482i2 c1482i2, long j4, boolean z5, boolean z6, boolean z7, boolean z8, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, str, list, c1529o5, i4, i5, z4, i6, i7, c1526o2, c1482i2, j4, z5, z6, z7, (i8 & 32768) != 0 ? false : z8);
    }

    @Nullable
    public final NetworkSettings a(@NotNull String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> j4 = j();
        Object obj = null;
        if (j4 == null) {
            return null;
        }
        Iterator<T> it = j4.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public final void b(boolean z4) {
        this.f19859p = z4;
    }

    public final void a(int i4) {
        this.f19848e = i4;
    }

    public final void a(boolean z4) {
        this.f19850g = z4;
    }
}
