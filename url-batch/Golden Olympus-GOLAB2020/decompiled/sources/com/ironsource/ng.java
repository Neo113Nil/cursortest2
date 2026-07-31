package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ng<T> {

    @Metadata
    public static final class a implements ng<ISDemandOnlyInterstitialListener> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private mg f18343a = new mg();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, mg> f18344b = new HashMap();

        @Override // com.ironsource.ng
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            mg mgVar = this.f18344b.get(instanceId);
            return mgVar != null ? mgVar : this.f18343a;
        }

        @Override // com.ironsource.ng
        public void a(@NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f18343a.a(listener);
            Iterator<String> it = this.f18344b.keySet().iterator();
            while (it.hasNext()) {
                mg mgVar = this.f18344b.get(it.next());
                if (mgVar != null) {
                    mgVar.a(listener);
                }
            }
        }

        @Override // com.ironsource.ng
        public void a(@NotNull String instanceId, @NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!this.f18344b.containsKey(instanceId)) {
                this.f18344b.put(instanceId, new mg(listener));
                return;
            }
            mg mgVar = this.f18344b.get(instanceId);
            if (mgVar != null) {
                mgVar.a(listener);
            }
        }
    }

    @Metadata
    public static final class b implements ng<ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private pg f18345a = new pg();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, pg> f18346b = new HashMap();

        @Override // com.ironsource.ng
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            pg pgVar = this.f18346b.get(instanceId);
            return pgVar != null ? pgVar : this.f18345a;
        }

        @Override // com.ironsource.ng
        public void a(@NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f18345a.a(listener);
            Iterator<String> it = this.f18346b.keySet().iterator();
            while (it.hasNext()) {
                pg pgVar = this.f18346b.get(it.next());
                if (pgVar != null) {
                    pgVar.a(listener);
                }
            }
        }

        @Override // com.ironsource.ng
        public void a(@NotNull String instanceId, @NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!this.f18346b.containsKey(instanceId)) {
                this.f18346b.put(instanceId, new pg(listener));
                return;
            }
            pg pgVar = this.f18346b.get(instanceId);
            if (pgVar != null) {
                pgVar.a(listener);
            }
        }
    }

    T a(@NotNull String str);

    void a(T t4);

    void a(@NotNull String str, T t4);
}
