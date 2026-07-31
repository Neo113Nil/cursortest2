package com.ironsource;

import com.ironsource.InterfaceC1531p0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1544r0 implements InterfaceC1531p0, InterfaceC1531p0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReadWriteLock f18892a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, C1524o0> f18893b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1544r0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC1531p0
    @Nullable
    public C1524o0 a(@NotNull String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f18892a.readLock().lock();
        try {
            return this.f18893b.get(adId);
        } finally {
            this.f18892a.readLock().unlock();
        }
    }

    public C1544r0(@NotNull ReadWriteLock readWriteLock) {
        Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f18892a = readWriteLock;
        this.f18893b = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC1531p0
    @NotNull
    public List<C1524o0> a() {
        this.f18892a.readLock().lock();
        List<C1524o0> list = CollectionsKt.toList(this.f18893b.values());
        this.f18892a.readLock().unlock();
        return list;
    }

    public /* synthetic */ C1544r0(ReadWriteLock readWriteLock, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.InterfaceC1531p0.a
    public void a(@NotNull EnumC1518n1 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f18892a.writeLock().lock();
        try {
            C1524o0 c1524o0 = this.f18893b.get(adId);
            if (c1524o0 != null) {
                c1524o0.a(adStatus);
                c1524o0.a(System.currentTimeMillis() / 1000.0d);
            }
        } finally {
            this.f18892a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC1531p0.a
    public void a(@NotNull C1524o0 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f18892a.writeLock().lock();
        try {
            if (this.f18893b.get(adInfo.c()) == null) {
                this.f18893b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f18892a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC1531p0.a
    public void a(@NotNull JSONObject json, @NotNull EnumC1518n1 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f18892a.writeLock().lock();
        try {
            C1524o0 c1524o0 = this.f18893b.get(adId);
            if (c1524o0 != null) {
                String bundleId = json.optString("bundleId");
                Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
                if (bundleId.length() > 0) {
                    c1524o0.a(bundleId);
                }
                String dynamicDemandSourceId = json.optString("dynamicDemandSource");
                Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
                if (dynamicDemandSourceId.length() > 0) {
                    c1524o0.a(jg.f16844b.a(dynamicDemandSourceId));
                }
                c1524o0.a(adStatus);
            }
            this.f18892a.writeLock().unlock();
        } catch (Throwable th) {
            this.f18892a.writeLock().unlock();
            throw th;
        }
    }
}
