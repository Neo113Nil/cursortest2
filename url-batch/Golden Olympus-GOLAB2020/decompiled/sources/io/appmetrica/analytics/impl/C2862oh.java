package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2862oh extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final Ke f39576b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f39577c;

    /* renamed from: d, reason: collision with root package name */
    public final K2 f39578d;

    /* renamed from: e, reason: collision with root package name */
    public final C2692i2 f39579e;

    /* renamed from: f, reason: collision with root package name */
    public final D2 f39580f;

    public C2862oh(C2953s5 c2953s5, Ke ke) {
        this(c2953s5, ke, Qm.a(Z1.class).a(c2953s5.getContext()), new K2(c2953s5.getContext()), new C2692i2(), new D2(c2953s5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        C2953s5 c2953s5 = this.f38930a;
        c2953s5.f39766b.toString();
        if (!c2953s5.f39784t.c() || !c2953s5.w()) {
            return false;
        }
        Z1 z12 = (Z1) this.f39577c.read();
        List list = z12.f38592a;
        J2 j22 = z12.f38593b;
        K2 k22 = this.f39578d;
        k22.getClass();
        Z1 z13 = null;
        J2 a4 = AndroidUtils.isApiAchieved(28) ? G2.a(k22.f37859a, k22.f37860b) : null;
        List list2 = z12.f38594c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f39580f.f37335a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C2());
        Ke ke = this.f39576b;
        Context context = this.f38930a.f39765a;
        ke.getClass();
        ArrayList a5 = new C2550cj(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a5, list)) {
            a5 = null;
        }
        if (a5 != null || !AbstractC2713io.a(j22, a4) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a5 != null) {
                list = a5;
            }
            z13 = new Z1(list, a4, list3);
        }
        if (z13 != null) {
            F9 f9 = c2953s5.f39778n;
            C2773l6 a6 = C2773l6.a(c2773l6, z13.f38592a, z13.f38593b, this.f39579e, z13.f38594c);
            f9.a(a6, Sk.a(f9.f37519c.b(a6), a6.f39384i));
            long currentTimeSeconds = f9.f37526j.currentTimeSeconds();
            f9.f37528l = currentTimeSeconds;
            f9.f37517a.a(currentTimeSeconds).b();
            this.f39577c.save(z13);
            return false;
        }
        if (!c2953s5.z()) {
            return false;
        }
        F9 f92 = c2953s5.f39778n;
        C2773l6 a7 = C2773l6.a(c2773l6, z12.f38592a, z12.f38593b, this.f39579e, z12.f38594c);
        f92.a(a7, Sk.a(f92.f37519c.b(a7), a7.f39384i));
        long currentTimeSeconds2 = f92.f37526j.currentTimeSeconds();
        f92.f37528l = currentTimeSeconds2;
        f92.f37517a.a(currentTimeSeconds2).b();
        return false;
    }

    public C2862oh(C2953s5 c2953s5, Ke ke, ProtobufStateStorage protobufStateStorage, K2 k22, C2692i2 c2692i2, D2 d22) {
        super(c2953s5);
        this.f39576b = ke;
        this.f39577c = protobufStateStorage;
        this.f39578d = k22;
        this.f39579e = c2692i2;
        this.f39580f = d22;
    }
}
