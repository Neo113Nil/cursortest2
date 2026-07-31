package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.l82;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.th, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2255th {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qf0 f32436a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final of0 f32437b;

    public /* synthetic */ C2255th() {
        this(new qf0(), new of0());
    }

    @NotNull
    public final String a(@NotNull Context context) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> a4 = this.f32436a.a(context);
        if (a4.size() > 1) {
            Iterator it = CollectionsKt.dropLast(a4, 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                l82.f28461a.getClass();
                String a5 = l82.a.a((String) obj);
                if (a5 != null && (!StringsKt.z(a5))) {
                    of0 of0Var = this.f32437b;
                    int i4 = of0.f30018c;
                    if (of0Var.a(1000, a5)) {
                        break;
                    }
                }
            }
            str = (String) obj;
            if (str == null) {
                str = (String) CollectionsKt.last((List) a4);
            }
        } else {
            str = (String) CollectionsKt.firstOrNull((List) a4);
        }
        return str == null ? "yandex.ru/ads" : str;
    }

    public C2255th(@NotNull qf0 hostsProvider, @NotNull of0 hostReachabilityRepository) {
        Intrinsics.checkNotNullParameter(hostsProvider, "hostsProvider");
        Intrinsics.checkNotNullParameter(hostReachabilityRepository, "hostReachabilityRepository");
        this.f32436a = hostsProvider;
        this.f32437b = hostReachabilityRepository;
    }
}
