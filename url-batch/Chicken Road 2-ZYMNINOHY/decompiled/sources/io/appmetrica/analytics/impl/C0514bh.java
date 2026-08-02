package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514bh extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C1054we f11539b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f11540c;

    /* renamed from: d, reason: collision with root package name */
    public final C1094y2 f11541d;

    /* renamed from: e, reason: collision with root package name */
    public final C0525c2 f11542e;

    /* renamed from: f, reason: collision with root package name */
    public final C0912r2 f11543f;

    public C0514bh(X4 x4, C1054we c1054we) {
        this(x4, c1054we, ((Rm) Pm.a(T1.class)).create(x4.getContext()), new C1094y2(x4.getContext()), new C0525c2(), new C0912r2(x4.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f10886a;
        x4.f11223b.toString();
        if (!x4.f11239t.c() || !x4.x()) {
            return false;
        }
        T1 t12 = (T1) this.f11540c.read();
        List list = t12.f10970a;
        C1068x2 c1068x2 = t12.f10971b;
        C1094y2 c1094y2 = this.f11541d;
        c1094y2.getClass();
        T1 t13 = null;
        C1068x2 a3 = AndroidUtils.isApiAchieved(28) ? C0990u2.a(c1094y2.f13050a, c1094y2.f13051b) : null;
        List list2 = t12.f10972c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f11543f.f12643a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0887q2());
        C1054we c1054we = this.f11539b;
        Context context = this.f10886a.f11222a;
        c1054we.getClass();
        ArrayList a4 = new Pi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a4, list)) {
            a4 = null;
        }
        if (a4 != null || !AbstractC0779lo.a(c1068x2, a3) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a4 != null) {
                list = a4;
            }
            t13 = new T1(list, a3, list3);
        }
        if (t13 != null) {
            C0738k9 c0738k9 = x4.n;
            P5 a5 = P5.a(p5, t13.f10970a, t13.f10971b, this.f11542e, t13.f10972c);
            c0738k9.a(a5, Rk.a(c0738k9.f12204c.b(a5), a5.f10802i));
            long currentTimeSeconds = c0738k9.f12210i.currentTimeSeconds();
            c0738k9.f12212k = currentTimeSeconds;
            c0738k9.f12202a.a(currentTimeSeconds).b();
            this.f11540c.save(t13);
            return false;
        }
        if (!x4.A()) {
            return false;
        }
        C0738k9 c0738k92 = x4.n;
        P5 a6 = P5.a(p5, t12.f10970a, t12.f10971b, this.f11542e, t12.f10972c);
        c0738k92.a(a6, Rk.a(c0738k92.f12204c.b(a6), a6.f10802i));
        long currentTimeSeconds2 = c0738k92.f12210i.currentTimeSeconds();
        c0738k92.f12212k = currentTimeSeconds2;
        c0738k92.f12202a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0514bh(X4 x4, C1054we c1054we, ProtobufStateStorage protobufStateStorage, C1094y2 c1094y2, C0525c2 c0525c2, C0912r2 c0912r2) {
        super(x4);
        this.f11539b = c1054we;
        this.f11540c = protobufStateStorage;
        this.f11541d = c1094y2;
        this.f11542e = c0525c2;
        this.f11543f = c0912r2;
    }
}
