package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class my1 implements cd1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final List<ux1> f29305c = CollectionsKt.listOf((Object[]) new ux1[]{ux1.f33442b, ux1.f33443c});

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<ux1, cd1> f29306a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29307b;

    static final class a extends kotlin.jvm.internal.s implements Function1<ux1, List<? extends id1>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29308b = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ux1 it = (ux1) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.emptyList();
        }
    }

    public my1(@NotNull h62 innerAdNoticeReportController, @NotNull h62 blockNoticeReportController) {
        Intrinsics.checkNotNullParameter(innerAdNoticeReportController, "innerAdNoticeReportController");
        Intrinsics.checkNotNullParameter(blockNoticeReportController, "blockNoticeReportController");
        this.f29306a = MapsKt.mapOf(TuplesKt.to(ux1.f33442b, innerAdNoticeReportController), TuplesKt.to(ux1.f33443c, blockNoticeReportController));
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull ux1 showNoticeType, @NotNull c92 validationResult) {
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        cd1 cd1Var = this.f29306a.get(showNoticeType);
        if (cd1Var != null) {
            cd1Var.a(showNoticeType, validationResult);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void invalidate() {
        Iterator<T> it = this.f29306a.values().iterator();
        while (it.hasNext()) {
            ((cd1) it.next()).invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull List<id1> forcedFailures) {
        Intrinsics.checkNotNullParameter(forcedFailures, "forcedFailures");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : forcedFailures) {
            ux1 c4 = ((id1) obj).a().c();
            Object obj2 = linkedHashMap.get(c4);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c4, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : MapsKt.withDefault(linkedHashMap, a.f29308b).entrySet()) {
            ux1 ux1Var = (ux1) entry.getKey();
            List<id1> list = (List) entry.getValue();
            cd1 cd1Var = this.f29306a.get(ux1Var);
            if (cd1Var != null) {
                cd1Var.a(list);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull ux1 showNoticeType, @NotNull List<? extends ux1> notTrackedShowNoticeTypes) {
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        Intrinsics.checkNotNullParameter(notTrackedShowNoticeTypes, "notTrackedShowNoticeTypes");
        if (!this.f29307b) {
            this.f29307b = true;
            List<? extends ux1> plus = CollectionsKt.plus((Collection<? extends ux1>) notTrackedShowNoticeTypes, showNoticeType);
            for (ux1 ux1Var : CollectionsKt.minus((Iterable) f29305c, (Iterable) CollectionsKt.toSet(plus))) {
                a(ux1Var);
                a(ux1Var, plus);
            }
        }
        if (!(notTrackedShowNoticeTypes instanceof Collection) || !notTrackedShowNoticeTypes.isEmpty()) {
            Iterator<T> it = notTrackedShowNoticeTypes.iterator();
            while (it.hasNext()) {
                if (((ux1) it.next()) == showNoticeType) {
                    return;
                }
            }
        }
        cd1 cd1Var = this.f29306a.get(showNoticeType);
        if (cd1Var != null) {
            cd1Var.a(showNoticeType, notTrackedShowNoticeTypes);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull ux1 showNoticeType) {
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        cd1 cd1Var = this.f29306a.get(showNoticeType);
        if (cd1Var != null) {
            cd1Var.a(showNoticeType);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Iterator<T> it = this.f29306a.values().iterator();
        while (it.hasNext()) {
            ((cd1) it.next()).a(adResponse);
        }
    }
}
