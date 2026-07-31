package com.ironsource;

import com.ironsource.C1563t;
import com.ironsource.aq;
import com.ironsource.i7;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.t6;
import com.ironsource.td;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class fl extends lr {

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16261a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16261a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(@NotNull lr sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r4.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r4 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean d(LevelPlay.AdFormat adFormat, String str) {
        Boolean a4;
        C1563t.d b4;
        Map<String, C1563t.d> a5;
        C1563t.d dVar;
        boolean z4 = adFormat == LevelPlay.AdFormat.REWARDED;
        C1563t c1563t = g().a().a().get(adFormat);
        xp xpVar = null;
        xp g4 = (c1563t == null || (a5 = c1563t.a()) == null || (dVar = a5.get(str)) == null) ? null : dVar.g();
        if (g4 == null) {
            if (c1563t != null && (b4 = c1563t.b()) != null) {
                xpVar = b4.g();
            }
            if (xpVar != null) {
                a4 = xpVar.a();
            }
            return z4;
        }
        a4 = g4.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i7.b a(@NotNull String adUnitId) {
        Boolean e4;
        boolean z4;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        t6 c4 = g().a().c();
        t6.b bVar = c4.a().get(adUnitId);
        if (bVar == null) {
            bVar = c4.b();
        }
        int b4 = bVar.b();
        t6.b bVar2 = c4.a().get(adUnitId);
        if (bVar2 == null) {
            bVar2 = c4.b();
        }
        boolean d4 = bVar2.d();
        t6.b bVar3 = c4.a().get(adUnitId);
        if ((bVar3 == null || (e4 = bVar3.e()) == null) && (e4 = c4.b().e()) == null) {
            C1537q c1537q = g().a().b().a().a().get(LevelPlay.AdFormat.BANNER);
            e4 = c1537q != null ? c1537q.a() : null;
            if (e4 == null) {
                z4 = false;
                return new i7.b(!z4 ? i7.c.TIMED_SHOW : i7.c.TIMED_LOAD, b4 * 1000, d4);
            }
        }
        z4 = e4.booleanValue();
        return new i7.b(!z4 ? i7.c.TIMED_SHOW : i7.c.TIMED_LOAD, b4 * 1000, d4);
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        C1563t.d b4;
        Long d4;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C1563t c1563t = g().a().a().get(adFormat);
        long longValue = (c1563t == null || (b4 = c1563t.b()) == null || (d4 = b4.d()) == null) ? 60L : d4.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    @NotNull
    public final jq c(@NotNull wl tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C1563t c1563t = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new jq(tools, c1563t != null ? c1563t.a() : null, c1563t != null ? c1563t.c() : null);
    }

    @NotNull
    public final List<LevelPlayAdSize> h() {
        List<String> a4 = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
        Iterator<T> it = a4.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float i() {
        return g().a().c().b().c();
    }

    public final boolean j() {
        C1467g1 a4 = d().c().a();
        return a4 != null && a4.a();
    }

    public final boolean k() {
        return g().a().b().d();
    }

    @NotNull
    public final td.a a(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new td.a(d(adFormat, adUnitId) ? td.c.PROGRESSIVE_ON_SHOW : td.c.MANUAL);
    }

    @Nullable
    public final Placement b(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        Placement a4;
        InterstitialPlacement a5;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i4 = a.f16261a[adFormat.ordinal()];
        if (i4 == 1) {
            zq f4 = d().c().f();
            if (f4 == null || (a4 = f4.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a4, "getRewardedVideoPlacement(placementName)");
            return new Placement(a4.getPlacementId(), a4.getPlacementName(), a4.isDefault(), a4.getRewardName(), a4.getRewardAmount(), a4.getPlacementAvailabilitySettings());
        }
        if (i4 == 2) {
            nj d4 = d().c().d();
            if (d4 == null || (a5 = d4.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a5, "getInterstitialPlacement(placementName)");
            return new Placement(a5);
        }
        if (i4 == 3) {
            u6 c4 = d().c().c();
            if (c4 == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            h7 a6 = c4.a(str);
            if (a6 == null) {
                a6 = c4.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            Intrinsics.checkNotNullExpressionValue(a6, str2);
            return new Placement(a6);
        }
        if (i4 != 4) {
            throw new W1.m();
        }
        sm e4 = d().c().e();
        if (e4 != null && str != null) {
            dn a7 = e4.a(str);
            if (a7 == null) {
                a7 = e4.e();
            }
            if (a7 != null) {
                return new Placement(a7);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    @NotNull
    public final List<ao> c(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, aq.b> a4;
        Set<String> keySet;
        List<ao> distinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        aq.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (a4 = aVar.a()) != null && (keySet = a4.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(c(adFormat, (String) it.next()));
            }
            List flatten = CollectionsKt.flatten(arrayList);
            if (flatten != null && (distinct = CollectionsKt.distinct(flatten)) != null) {
                return distinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final C1572u1 a(@NotNull wl tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C1572u1(tools, g().a().a());
    }

    @NotNull
    public final op b(@NotNull wl tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new op(tools, g().a().a());
    }

    @NotNull
    public final List<ao> c(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Map<String, aq.b> a4;
        aq.b bVar;
        List<String> a5;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        aq.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (a4 = aVar.a()) == null || (bVar = a4.get(adUnitId)) == null || (a5 = bVar.a()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a5.iterator();
        while (it.hasNext()) {
            ao aoVar = g().e().a().get((String) it.next());
            if (aoVar != null) {
                arrayList.add(aoVar);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<String> a(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, aq.b> a4;
        Set<String> keySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        aq.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (a4 = aVar.a()) == null || (keySet = a4.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final boolean a(@NotNull String adUnitId, @NotNull LevelPlay.AdFormat adFormat) {
        Map<String, aq.b> a4;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        aq.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (a4 = aVar.a()) == null || !a4.containsKey(adUnitId)) ? false : true;
    }
}
