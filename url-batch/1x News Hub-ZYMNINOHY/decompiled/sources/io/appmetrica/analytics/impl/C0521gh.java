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

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521gh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final Ce f7404b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f7405c;

    /* renamed from: d, reason: collision with root package name */
    public final G2 f7406d;

    /* renamed from: e, reason: collision with root package name */
    public final C0635l2 f7407e;
    public final C0996z2 f;

    public C0521gh(C0457e5 c0457e5, Ce ce) {
        this(c0457e5, ce, ((Vm) Tm.a(C0403c2.class)).create(c0457e5.getContext()), new G2(c0457e5.getContext()), new C0635l2(), new C0996z2(c0457e5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0457e5 c0457e5 = this.f6835a;
        c0457e5.f7226b.toString();
        if (!c0457e5.f7242t.c() || !c0457e5.x()) {
            return false;
        }
        C0403c2 c0403c2 = (C0403c2) this.f7405c.read();
        List list = c0403c2.f7114a;
        F2 f22 = c0403c2.f7115b;
        G2 g22 = this.f7406d;
        g22.getClass();
        C0403c2 c0403c22 = null;
        F2 a3 = AndroidUtils.isApiAchieved(28) ? C2.a(g22.f6027a, g22.f6028b) : null;
        List list2 = c0403c2.f7116c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.f8659a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0971y2());
        Ce ce = this.f7404b;
        Context context = this.f6835a.f7225a;
        ce.getClass();
        ArrayList a4 = new Ui(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a4, list)) {
            a4 = null;
        }
        if (a4 != null || !AbstractC0709no.a(f22, a3) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a4 != null) {
                list = a4;
            }
            c0403c22 = new C0403c2(list, a3, list3);
        }
        if (c0403c22 != null) {
            C0797r9 c0797r9 = c0457e5.f7237n;
            W5 a5 = W5.a(w5, c0403c22.f7114a, c0403c22.f7115b, this.f7407e, c0403c22.f7116c);
            c0797r9.a(a5, Wk.a(c0797r9.f8216c.b(a5), a5.f6822i));
            long currentTimeSeconds = c0797r9.f8222j.currentTimeSeconds();
            c0797r9.f8224l = currentTimeSeconds;
            c0797r9.f8214a.a(currentTimeSeconds).b();
            this.f7405c.save(c0403c22);
            return false;
        }
        if (!c0457e5.A()) {
            return false;
        }
        C0797r9 c0797r92 = c0457e5.f7237n;
        W5 a6 = W5.a(w5, c0403c2.f7114a, c0403c2.f7115b, this.f7407e, c0403c2.f7116c);
        c0797r92.a(a6, Wk.a(c0797r92.f8216c.b(a6), a6.f6822i));
        long currentTimeSeconds2 = c0797r92.f8222j.currentTimeSeconds();
        c0797r92.f8224l = currentTimeSeconds2;
        c0797r92.f8214a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0521gh(C0457e5 c0457e5, Ce ce, ProtobufStateStorage protobufStateStorage, G2 g22, C0635l2 c0635l2, C0996z2 c0996z2) {
        super(c0457e5);
        this.f7404b = ce;
        this.f7405c = protobufStateStorage;
        this.f7406d = g22;
        this.f7407e = c0635l2;
        this.f = c0996z2;
    }
}
