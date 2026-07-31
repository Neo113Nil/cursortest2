package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1511m3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1511m3 f17139a = new C1511m3();

    @Metadata
    /* renamed from: com.ironsource.m3$a */
    public static final class a implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IronSource.AD_UNIT f17140a;

        public a(@NotNull IronSource.AD_UNIT value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17140a = value;
        }

        public static /* synthetic */ a a(a aVar, IronSource.AD_UNIT ad_unit, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                ad_unit = aVar.f17140a;
            }
            return aVar.a(ad_unit);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f17140a == ((a) obj).f17140a;
        }

        public int hashCode() {
            return this.f17140a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdFormatEntity(value=" + this.f17140a + ')';
        }

        @NotNull
        public final a a(@NotNull IronSource.AD_UNIT value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new a(value);
        }

        private final IronSource.AD_UNIT a() {
            return this.f17140a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(wt.b(this.f17140a)));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$b */
    public static final class b implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17141a;

        public b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17141a = value;
        }

        public static /* synthetic */ b a(b bVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = bVar.f17141a;
            }
            return bVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f17141a, ((b) obj).f17141a);
        }

        public int hashCode() {
            return this.f17141a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdIdentifier(value=" + this.f17141a + ')';
        }

        @NotNull
        public final b a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(value);
        }

        private final String a() {
            return this.f17141a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f17141a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$c */
    public static final class c implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AdSize f17142a;

        public c(@NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.f17142a = size;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            int i4;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String sizeDescription = this.f17142a.getSizeDescription();
            int hashCode = sizeDescription.hashCode();
            if (hashCode == -96588539) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.l.f17633g)) {
                    i4 = 3;
                }
                i4 = 0;
            } else if (hashCode == 72205083) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.l.f17628b)) {
                    i4 = 2;
                }
                i4 = 0;
            } else if (hashCode != 446888797) {
                if (hashCode == 1951953708 && sizeDescription.equals(com.ironsource.mediationsdk.l.f17627a)) {
                    i4 = 1;
                }
                i4 = 0;
            } else {
                if (sizeDescription.equals(com.ironsource.mediationsdk.l.f17630d)) {
                    i4 = 4;
                }
                i4 = 0;
            }
            bundle.put(com.ironsource.mediationsdk.l.f17634h, Integer.valueOf(i4));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$d */
    public static final class d implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17143a;

        public d(@NotNull String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f17143a = auctionId;
        }

        public static /* synthetic */ d a(d dVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = dVar.f17143a;
            }
            return dVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f17143a, ((d) obj).f17143a);
        }

        public int hashCode() {
            return this.f17143a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AuctionId(auctionId=" + this.f17143a + ')';
        }

        @NotNull
        public final d a(@NotNull String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new d(auctionId);
        }

        private final String a() {
            return this.f17143a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f17143a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$e */
    public static final class e implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17144a;

        public e(int i4) {
            this.f17144a = i4;
        }

        private final int a() {
            return this.f17144a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f17144a == ((e) obj).f17144a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17144a);
        }

        @NotNull
        public String toString() {
            return "DemandOnly(value=" + this.f17144a + ')';
        }

        @NotNull
        public final e a(int i4) {
            return new e(i4);
        }

        public static /* synthetic */ e a(e eVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = eVar.f17144a;
            }
            return eVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f17144a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$f */
    public static final class f implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final long f17145a;

        public f(long j4) {
            this.f17145a = j4;
        }

        private final long a() {
            return this.f17145a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f17145a == ((f) obj).f17145a;
        }

        public int hashCode() {
            return Long.hashCode(this.f17145a);
        }

        @NotNull
        public String toString() {
            return "Duration(duration=" + this.f17145a + ')';
        }

        @NotNull
        public final f a(long j4) {
            return new f(j4);
        }

        public static /* synthetic */ f a(f fVar, long j4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j4 = fVar.f17145a;
            }
            return fVar.a(j4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f17145a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$g */
    public static final class g implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17146a;

        public g(@NotNull String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f17146a = dynamicSourceId;
        }

        public static /* synthetic */ g a(g gVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = gVar.f17146a;
            }
            return gVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f17146a, ((g) obj).f17146a);
        }

        public int hashCode() {
            return this.f17146a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f17146a + ')';
        }

        @NotNull
        public final g a(@NotNull String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        private final String a() {
            return this.f17146a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f17146a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$h */
    public static final class h implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17147a;

        public h(@NotNull String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.f17147a = sourceId;
        }

        public static /* synthetic */ h a(h hVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = hVar.f17147a;
            }
            return hVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f17147a, ((h) obj).f17147a);
        }

        public int hashCode() {
            return this.f17147a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f17147a + ')';
        }

        @NotNull
        public final h a(@NotNull String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new h(sourceId);
        }

        private final String a() {
            return this.f17147a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f17147a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$i */
    public static final class i implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f17148a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$j */
    public static final class j implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17149a;

        public j(int i4) {
            this.f17149a = i4;
        }

        private final int a() {
            return this.f17149a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f17149a == ((j) obj).f17149a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17149a);
        }

        @NotNull
        public String toString() {
            return "ErrorCode(code=" + this.f17149a + ')';
        }

        @NotNull
        public final j a(int i4) {
            return new j(i4);
        }

        public static /* synthetic */ j a(j jVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = jVar.f17149a;
            }
            return jVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("errorCode", Integer.valueOf(this.f17149a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$k */
    public static final class k implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f17150a;

        public k(@Nullable String str) {
            this.f17150a = str;
        }

        public static /* synthetic */ k a(k kVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = kVar.f17150a;
            }
            return kVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f17150a, ((k) obj).f17150a);
        }

        public int hashCode() {
            String str = this.f17150a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ErrorReason(reason=" + this.f17150a + ')';
        }

        @NotNull
        public final k a(@Nullable String str) {
            return new k(str);
        }

        private final String a() {
            return this.f17150a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = this.f17150a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f17150a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$l */
    public static final class l implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17151a;

        public l(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17151a = value;
        }

        public static /* synthetic */ l a(l lVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = lVar.f17151a;
            }
            return lVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.areEqual(this.f17151a, ((l) obj).f17151a);
        }

        public int hashCode() {
            return this.f17151a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ext1(value=" + this.f17151a + ')';
        }

        @NotNull
        public final l a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new l(value);
        }

        private final String a() {
            return this.f17151a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f17151a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$m */
    public static final class m implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f17152a;

        public m(@Nullable JSONObject jSONObject) {
            this.f17152a = jSONObject;
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                jSONObject = mVar.f17152a;
            }
            return mVar.a(jSONObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.areEqual(this.f17152a, ((m) obj).f17152a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f17152a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "GenericParams(genericParams=" + this.f17152a + ')';
        }

        @NotNull
        public final m a(@Nullable JSONObject jSONObject) {
            return new m(jSONObject);
        }

        private final JSONObject a() {
            return this.f17152a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            JSONObject jSONObject = this.f17152a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$n */
    public static final class n implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17153a;

        public n(int i4) {
            this.f17153a = i4;
        }

        private final int a() {
            return this.f17153a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f17153a == ((n) obj).f17153a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17153a);
        }

        @NotNull
        public String toString() {
            return "InstanceType(instanceType=" + this.f17153a + ')';
        }

        @NotNull
        public final n a(int i4) {
            return new n(i4);
        }

        public static /* synthetic */ n a(n nVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = nVar.f17153a;
            }
            return nVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f17153a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$o */
    public static final class o implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17154a;

        public o(int i4) {
            this.f17154a = i4;
        }

        private final int a() {
            return this.f17154a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f17154a == ((o) obj).f17154a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17154a);
        }

        @NotNull
        public String toString() {
            return "MultipleAdObjects(value=" + this.f17154a + ')';
        }

        @NotNull
        public final o a(int i4) {
            return new o(i4);
        }

        public static /* synthetic */ o a(o oVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = oVar.f17154a;
            }
            return oVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f17154a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$p */
    public static final class p implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17155a;

        public p(int i4) {
            this.f17155a = i4;
        }

        private final int a() {
            return this.f17155a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f17155a == ((p) obj).f17155a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17155a);
        }

        @NotNull
        public String toString() {
            return "OneFlow(value=" + this.f17155a + ')';
        }

        @NotNull
        public final p a(int i4) {
            return new p(i4);
        }

        public static /* synthetic */ p a(p pVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = pVar.f17155a;
            }
            return pVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f17155a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$q */
    public static final class q implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17156a;

        public q(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17156a = value;
        }

        public static /* synthetic */ q a(q qVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = qVar.f17156a;
            }
            return qVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.areEqual(this.f17156a, ((q) obj).f17156a);
        }

        public int hashCode() {
            return this.f17156a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Placement(value=" + this.f17156a + ')';
        }

        @NotNull
        public final q a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new q(value);
        }

        private final String a() {
            return this.f17156a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f17156a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$r */
    public static final class r implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17157a;

        public r(int i4) {
            this.f17157a = i4;
        }

        private final int a() {
            return this.f17157a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f17157a == ((r) obj).f17157a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17157a);
        }

        @NotNull
        public String toString() {
            return "Programmatic(programmatic=" + this.f17157a + ')';
        }

        @NotNull
        public final r a(int i4) {
            return new r(i4);
        }

        public static /* synthetic */ r a(r rVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = rVar.f17157a;
            }
            return rVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f17157a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$s */
    public static final class s implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17158a;

        public s(@NotNull String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.f17158a = sourceName;
        }

        public static /* synthetic */ s a(s sVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = sVar.f17158a;
            }
            return sVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.areEqual(this.f17158a, ((s) obj).f17158a);
        }

        public int hashCode() {
            return this.f17158a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Provider(sourceName=" + this.f17158a + ')';
        }

        @NotNull
        public final s a(@NotNull String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new s(sourceName);
        }

        private final String a() {
            return this.f17158a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f17158a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$t */
    public static final class t implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17159a;

        public t(int i4) {
            this.f17159a = i4;
        }

        private final int a() {
            return this.f17159a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f17159a == ((t) obj).f17159a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17159a);
        }

        @NotNull
        public String toString() {
            return "RewardAmount(value=" + this.f17159a + ')';
        }

        @NotNull
        public final t a(int i4) {
            return new t(i4);
        }

        public static /* synthetic */ t a(t tVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = tVar.f17159a;
            }
            return tVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f17159a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$u */
    public static final class u implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17160a;

        public u(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17160a = value;
        }

        public static /* synthetic */ u a(u uVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = uVar.f17160a;
            }
            return uVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && Intrinsics.areEqual(this.f17160a, ((u) obj).f17160a);
        }

        public int hashCode() {
            return this.f17160a.hashCode();
        }

        @NotNull
        public String toString() {
            return "RewardName(value=" + this.f17160a + ')';
        }

        @NotNull
        public final u a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new u(value);
        }

        private final String a() {
            return this.f17160a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f17160a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$v */
    public static final class v implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17161a;

        public v(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.f17161a = version;
        }

        public static /* synthetic */ v a(v vVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = vVar.f17161a;
            }
            return vVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && Intrinsics.areEqual(this.f17161a, ((v) obj).f17161a);
        }

        public int hashCode() {
            return this.f17161a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SdkVersion(version=" + this.f17161a + ')';
        }

        @NotNull
        public final v a(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new v(version);
        }

        private final String a() {
            return this.f17161a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f17161a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$w */
    public static final class w implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f17162a;

        public w(int i4) {
            this.f17162a = i4;
        }

        private final int a() {
            return this.f17162a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f17162a == ((w) obj).f17162a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f17162a);
        }

        @NotNull
        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f17162a + ')';
        }

        @NotNull
        public final w a(int i4) {
            return new w(i4);
        }

        public static /* synthetic */ w a(w wVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = wVar.f17162a;
            }
            return wVar.a(i4);
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f17162a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$x */
    public static final class x implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17163a;

        public x(@NotNull String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.f17163a = subProviderId;
        }

        public static /* synthetic */ x a(x xVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = xVar.f17163a;
            }
            return xVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && Intrinsics.areEqual(this.f17163a, ((x) obj).f17163a);
        }

        public int hashCode() {
            return this.f17163a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SubProviderId(subProviderId=" + this.f17163a + ')';
        }

        @NotNull
        public final x a(@NotNull String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        private final String a() {
            return this.f17163a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f17163a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m3$y */
    public static final class y implements InterfaceC1520n3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17164a;

        public y(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17164a = value;
        }

        public static /* synthetic */ y a(y yVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = yVar.f17164a;
            }
            return yVar.a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && Intrinsics.areEqual(this.f17164a, ((y) obj).f17164a);
        }

        public int hashCode() {
            return this.f17164a.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransId(value=" + this.f17164a + ')';
        }

        @NotNull
        public final y a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new y(value);
        }

        private final String a() {
            return this.f17164a;
        }

        @Override // com.ironsource.InterfaceC1520n3
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("transId", this.f17164a);
        }
    }

    private C1511m3() {
    }
}
