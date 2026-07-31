package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gs {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f26279c;

    /* renamed from: d, reason: collision with root package name */
    public static final gs f26280d;

    /* renamed from: e, reason: collision with root package name */
    public static final gs f26281e;

    /* renamed from: f, reason: collision with root package name */
    public static final gs f26282f;

    /* renamed from: g, reason: collision with root package name */
    public static final gs f26283g;

    /* renamed from: h, reason: collision with root package name */
    public static final gs f26284h;

    /* renamed from: i, reason: collision with root package name */
    public static final gs f26285i;

    /* renamed from: j, reason: collision with root package name */
    public static final gs f26286j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ gs[] f26287k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f26288l;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26289b;

    public static final class a {
        private a() {
        }

        @Nullable
        public static gs a(@NotNull String value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it = gs.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((gs) obj).b(), value)) {
                    break;
                }
            }
            return (gs) obj;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        gs gsVar = new gs(0, com.ironsource.mediationsdk.l.f17627a, "banner");
        f26280d = gsVar;
        gs gsVar2 = new gs(1, "INTERSTITIAL", "interstitial");
        f26281e = gsVar2;
        gs gsVar3 = new gs(2, "REWARDED", "rewarded");
        f26282f = gsVar3;
        gs gsVar4 = new gs(3, "NATIVE", "native");
        f26283g = gsVar4;
        gs gsVar5 = new gs(4, "INSTREAM", "instream");
        f26284h = gsVar5;
        gs gsVar6 = new gs(5, "APPOPENAD", "appopenad");
        f26285i = gsVar6;
        gs gsVar7 = new gs(6, "RETAIL_MEDIA", "retail");
        gs gsVar8 = new gs(7, "FEED", "feed");
        f26286j = gsVar8;
        gs[] gsVarArr = {gsVar, gsVar2, gsVar3, gsVar4, gsVar5, gsVar6, gsVar7, gsVar8};
        f26287k = gsVarArr;
        f26288l = AbstractC1372b.a(gsVarArr);
        f26279c = new a(0);
    }

    private gs(int i4, String str, String str2) {
        this.f26289b = str2;
    }

    @NotNull
    public static InterfaceC1371a a() {
        return f26288l;
    }

    public static gs valueOf(String str) {
        return (gs) Enum.valueOf(gs.class, str);
    }

    public static gs[] values() {
        return (gs[]) f26287k.clone();
    }

    @NotNull
    public final String b() {
        return this.f26289b;
    }
}
