package com.ironsource;

import com.ironsource.C1454e2;
import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ac implements InterfaceC1447d2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f15060a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1454e2 f15061b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC1447d2> f15062c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final li f15063d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final am f15064e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final bv f15065f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1548r4 f15066g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C1517n0 f15067h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final gv f15068i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final wo f15069j;

    public ac(@NotNull IronSource.AD_UNIT adFormat, @NotNull C1454e2.b level, @NotNull List<? extends InterfaceC1447d2> eventsInterfaces, @Nullable s7 s7Var) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.f15060a = adFormat;
        C1454e2 c1454e2 = new C1454e2(adFormat, level, this, s7Var);
        this.f15061b = c1454e2;
        this.f15062c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        li liVar = c1454e2.f15951f;
        Intrinsics.checkNotNullExpressionValue(liVar, "wrapper.init");
        this.f15063d = liVar;
        am amVar = c1454e2.f15952g;
        Intrinsics.checkNotNullExpressionValue(amVar, "wrapper.load");
        this.f15064e = amVar;
        bv bvVar = c1454e2.f15953h;
        Intrinsics.checkNotNullExpressionValue(bvVar, "wrapper.token");
        this.f15065f = bvVar;
        C1548r4 c1548r4 = c1454e2.f15954i;
        Intrinsics.checkNotNullExpressionValue(c1548r4, "wrapper.auction");
        this.f15066g = c1548r4;
        C1517n0 c1517n0 = c1454e2.f15955j;
        Intrinsics.checkNotNullExpressionValue(c1517n0, "wrapper.adInteraction");
        this.f15067h = c1517n0;
        gv gvVar = c1454e2.f15956k;
        Intrinsics.checkNotNullExpressionValue(gvVar, "wrapper.troubleshoot");
        this.f15068i = gvVar;
        wo woVar = c1454e2.f15957l;
        Intrinsics.checkNotNullExpressionValue(woVar, "wrapper.operational");
        this.f15069j = woVar;
    }

    @NotNull
    public final C1517n0 a() {
        return this.f15067h;
    }

    @NotNull
    public final C1548r4 b() {
        return this.f15066g;
    }

    @NotNull
    public final List<InterfaceC1447d2> c() {
        return this.f15062c;
    }

    @NotNull
    public final li d() {
        return this.f15063d;
    }

    @NotNull
    public final am e() {
        return this.f15064e;
    }

    @NotNull
    public final wo f() {
        return this.f15069j;
    }

    @NotNull
    public final bv g() {
        return this.f15065f;
    }

    @NotNull
    public final gv h() {
        return this.f15068i;
    }

    public /* synthetic */ ac(IronSource.AD_UNIT ad_unit, C1454e2.b bVar, List list, s7 s7Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, bVar, (i4 & 4) != 0 ? CollectionsKt.emptyList() : list, (i4 & 8) != 0 ? null : s7Var);
    }

    @Override // com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@NotNull EnumC1433b2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        Iterator<InterfaceC1447d2> it = this.f15062c.iterator();
        while (it.hasNext()) {
            Map<String, Object> a4 = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(a4, "it.getEventsAdditionalDataMap(event)");
            hashMap.putAll(a4);
        }
        return hashMap;
    }

    public final void a(@NotNull InterfaceC1447d2 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.f15062c.add(eventInterface);
    }

    public final void a(boolean z4) {
        if (z4) {
            this.f15064e.a(true);
        } else {
            if (z4) {
                throw new W1.m();
            }
            if (this.f15060a == IronSource.AD_UNIT.BANNER) {
                this.f15064e.a();
            } else {
                this.f15064e.a(false);
            }
        }
    }
}
