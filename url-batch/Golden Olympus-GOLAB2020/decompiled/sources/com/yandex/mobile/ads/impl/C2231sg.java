package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.pw0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2231sg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f31730a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private v61 f31731b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2231sg(@NotNull List<? extends C2276uf<?>> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f31730a = assets;
    }

    @NotNull
    public final HashMap a() {
        InterfaceC2299vf<?> a4;
        pw0.a f4;
        String a5;
        HashMap hashMap = new HashMap();
        Iterator<C2276uf<?>> it = this.f31730a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2276uf<?> next = it.next();
            String b4 = next.b();
            v61 v61Var = this.f31731b;
            if (v61Var != null && (a4 = v61Var.a(next)) != null && a4.b()) {
                HashMap hashMap2 = new HashMap();
                ah2 c4 = a4.c();
                if (c4 != null) {
                    hashMap2.put("width", Integer.valueOf(t72.a(c4.b())));
                    hashMap2.put("height", Integer.valueOf(t72.a(c4.a())));
                }
                hu0 hu0Var = a4 instanceof hu0 ? (hu0) a4 : null;
                if (hu0Var != null && (f4 = hu0Var.f()) != null && (a5 = f4.a()) != null) {
                    hashMap2.put("value_type", a5);
                }
                hashMap.put(b4, hashMap2);
            }
        }
        v61 v61Var2 = this.f31731b;
        View f5 = v61Var2 != null ? v61Var2.f() : null;
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (f5 != null) {
            createMapBuilder.put("width", Integer.valueOf(t72.a(f5.getWidth())));
            createMapBuilder.put("height", Integer.valueOf(t72.a(f5.getHeight())));
        }
        Map build = MapsKt.build(createMapBuilder);
        if (!build.isEmpty()) {
            hashMap.put("superview", build);
        }
        return hashMap;
    }

    public final void a(@Nullable v61 v61Var) {
        this.f31731b = v61Var;
    }
}
