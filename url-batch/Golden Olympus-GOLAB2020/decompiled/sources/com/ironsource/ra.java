package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface ra {

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f18906a;

        public a(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.f18906a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        @NotNull
        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.f18906a);
        }

        public final void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f18906a.put(key, value);
        }
    }

    @Metadata
    public static final class b implements ra {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final sf f18907a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f18908b;

        public b(@NotNull sf eventManager, @NotNull a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f18907a = eventManager;
            this.f18908b = eventBaseData;
        }

        @Override // com.ironsource.ra
        public void a(int i4, @Nullable as asVar) {
            Map<String, Object> a4 = this.f18908b.a();
            if (asVar != null) {
                a4.put(IronSourceConstants.EVENTS_EXT1, asVar.toString());
            }
            this.f18907a.a(new zb(i4, new JSONObject(MapsKt.toMap(a4))));
        }

        @Override // com.ironsource.ra
        public void a(int i4, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> a4 = this.f18908b.a();
            a4.put("spId", instanceId);
            this.f18907a.a(new zb(i4, new JSONObject(MapsKt.toMap(a4))));
        }
    }

    void a(int i4, @Nullable as asVar);

    void a(int i4, @NotNull String str);
}
