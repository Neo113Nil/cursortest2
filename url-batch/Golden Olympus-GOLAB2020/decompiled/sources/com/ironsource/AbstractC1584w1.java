package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1584w1 {

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f20126r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f20127s = -1;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1460f1 f20128a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20129b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f20130c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<NetworkSettings> f20131d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final rk f20132e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1529o5 f20133f;

    /* renamed from: g, reason: collision with root package name */
    private int f20134g;

    /* renamed from: h, reason: collision with root package name */
    private final int f20135h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20136i;

    /* renamed from: j, reason: collision with root package name */
    private final int f20137j;

    /* renamed from: k, reason: collision with root package name */
    private final int f20138k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C1526o2 f20139l;

    /* renamed from: m, reason: collision with root package name */
    private final long f20140m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f20141n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f20142o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f20143p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20144q;

    @Metadata
    /* renamed from: com.ironsource.w1$a */
    public static final class a {
        private a() {
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(@NotNull C1460f1 adProperties, @Nullable fl flVar, @NotNull Function1<? super s8, ? extends AdFormatConfig> getAdFormatConfig, @NotNull Function2<? super C1578v1, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            List<ao> emptyList;
            ms d4;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            Object invoke = getAdFormatConfig.invoke((flVar == null || (d4 = flVar.d()) == null) ? null : d4.c());
            if (invoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (flVar == null || (emptyList = flVar.c(adProperties.d(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            List<ao> list = emptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ao) it.next()).f());
            }
            rk b4 = rk.b();
            Intrinsics.checkNotNullExpressionValue(b4, "getInstance()");
            return (AdUnitData) createAdUnitData.invoke(new C1578v1(userIdForNetworks, arrayList, b4), invoke);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1584w1(@NotNull C1460f1 adProperties, boolean z4, @Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull rk publisherDataHolder, @NotNull C1529o5 auctionSettings, int i4, int i5, boolean z5, int i6, int i7, @NotNull C1526o2 loadingData, long j4, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.f20128a = adProperties;
        this.f20129b = z4;
        this.f20130c = str;
        this.f20131d = providerList;
        this.f20132e = publisherDataHolder;
        this.f20133f = auctionSettings;
        this.f20134g = i4;
        this.f20135h = i5;
        this.f20136i = z5;
        this.f20137j = i6;
        this.f20138k = i7;
        this.f20139l = loadingData;
        this.f20140m = j4;
        this.f20141n = z6;
        this.f20142o = z7;
        this.f20143p = z8;
        this.f20144q = z9;
    }

    public final int a() {
        return this.f20138k;
    }

    @NotNull
    public C1460f1 b() {
        return this.f20128a;
    }

    @NotNull
    public abstract JSONObject b(@NotNull NetworkSettings networkSettings);

    @NotNull
    public abstract String c();

    public final boolean d() {
        return this.f20136i;
    }

    @NotNull
    public final C1529o5 e() {
        return this.f20133f;
    }

    public final long f() {
        return this.f20140m;
    }

    public final int g() {
        return this.f20137j;
    }

    public final int h() {
        return this.f20135h;
    }

    @NotNull
    public final C1526o2 i() {
        return this.f20139l;
    }

    @NotNull
    public abstract String j();

    public final int k() {
        return this.f20134g;
    }

    @NotNull
    public final String l() {
        String placementName;
        Placement e4 = b().e();
        return (e4 == null || (placementName = e4.getPlacementName()) == null) ? "" : placementName;
    }

    @NotNull
    public final List<NetworkSettings> m() {
        return this.f20131d;
    }

    public final boolean n() {
        return this.f20141n;
    }

    @NotNull
    public final rk o() {
        return this.f20132e;
    }

    public final boolean p() {
        return this.f20143p;
    }

    public final boolean q() {
        return this.f20144q;
    }

    @Nullable
    public final String r() {
        return this.f20130c;
    }

    public final boolean s() {
        return this.f20142o;
    }

    public final boolean t() {
        return this.f20133f.g() > 0;
    }

    public boolean u() {
        return this.f20129b;
    }

    @NotNull
    public final String v() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f17335x, Integer.valueOf(this.f20134g), com.ironsource.mediationsdk.d.f17336y, Boolean.valueOf(this.f20136i), com.ironsource.mediationsdk.d.f17337z, Boolean.valueOf(this.f20144q));
        Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public /* synthetic */ AbstractC1584w1(C1460f1 c1460f1, boolean z4, String str, List list, rk rkVar, C1529o5 c1529o5, int i4, int i5, boolean z5, int i6, int i7, C1526o2 c1526o2, long j4, boolean z6, boolean z7, boolean z8, boolean z9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1460f1, z4, str, list, rkVar, c1529o5, i4, i5, z5, i6, i7, c1526o2, j4, z6, z7, z8, (i8 & 65536) != 0 ? false : z9);
    }

    @NotNull
    public AdData a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.f20130c);
        Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return createAdDataForNetworkAdapter;
    }

    public final void b(boolean z4) {
        this.f20144q = z4;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String instanceName) {
        Object obj;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Iterator<T> it = this.f20131d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NetworkSettings) obj).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public final void a(int i4) {
        this.f20134g = i4;
    }

    public final void a(boolean z4) {
        this.f20136i = z4;
    }
}
