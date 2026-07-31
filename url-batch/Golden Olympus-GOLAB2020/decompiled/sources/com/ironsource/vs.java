package com.ironsource;

import com.ironsource.ci;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class vs implements ci, ci.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Map<String, C1588x> f20116a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qn f20117b = new qn();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReadWriteLock f20118c = new ReentrantReadWriteLock();

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20119a;

        static {
            int[] iArr = new int[us.values().length];
            try {
                iArr[us.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20119a = iArr;
        }
    }

    private final void b() {
        ts configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        qn qnVar = this.f20117b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        qnVar.a(a(configuration));
        this.f20117b.a(a());
    }

    @Override // com.ironsource.ci
    public int a(@NotNull IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f20118c.readLock().lock();
        try {
            C1588x c1588x = this.f20116a.get(adFormat.toString());
            return c1588x != null ? c1588x.a() : 0;
        } finally {
            this.f20118c.readLock().unlock();
        }
    }

    @Override // com.ironsource.ci
    @NotNull
    public List<String> a() {
        this.f20118c.readLock().lock();
        try {
            Map<String, C1588x> map = this.f20116a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C1588x> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> list = CollectionsKt.toList(linkedHashMap.keySet());
            this.f20118c.readLock().unlock();
            return list;
        } catch (Throwable th) {
            this.f20118c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.ci
    @NotNull
    public Map<String, JSONObject> a(@NotNull ts configuration) {
        Map<String, JSONObject> mutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f20118c.readLock().lock();
        try {
            int i4 = a.f20119a[configuration.a().ordinal()];
            if (i4 == 1) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(ge.f16507w1, a(ft.FullHistory)), TuplesKt.to(ge.f16510x1, a(ft.CurrentlyLoadedAds)));
            } else if (i4 == 2) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(ge.f16510x1, a(ft.CurrentlyLoadedAds)));
            } else {
                if (i4 != 3) {
                    throw new W1.m();
                }
                mutableMapOf = MapsKt.emptyMap();
            }
            this.f20118c.readLock().unlock();
            return mutableMapOf;
        } catch (Throwable th) {
            this.f20118c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.ci
    @NotNull
    public JSONObject a(@NotNull ft mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f20118c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C1588x> entry : this.f20116a.entrySet()) {
                String key = entry.getKey();
                JSONObject a4 = entry.getValue().a(mode);
                if (a4.length() > 0) {
                    jSONObject.put(key, a4);
                }
            }
            return jSONObject;
        } finally {
            this.f20118c.readLock().unlock();
        }
    }

    @Override // com.ironsource.ci.a
    public void a(@NotNull ws historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.f20118c.writeLock().lock();
        try {
            C1524o0 a4 = historyRecord.a();
            String valueOf = String.valueOf(a4 != null ? a4.b() : null);
            Map<String, C1588x> map = this.f20116a;
            C1588x c1588x = map.get(valueOf);
            if (c1588x == null) {
                c1588x = new C1588x();
                map.put(valueOf, c1588x);
            }
            c1588x.a(historyRecord.a(new ct()));
            this.f20118c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.f20118c.writeLock().unlock();
            throw th;
        }
    }
}
