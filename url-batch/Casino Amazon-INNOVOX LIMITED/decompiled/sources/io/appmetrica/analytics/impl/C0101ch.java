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

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0101ch extends Sg {
    public final C0629xe b;
    public final ProtobufStateStorage c;
    public final C0667z2 d;
    public final C0112d2 e;
    public final C0492s2 f;

    public C0101ch(Y4 y4, C0629xe c0629xe) {
        this(y4, c0629xe, ((Sm) Qm.a(U1.class)).create(y4.getContext()), new C0667z2(y4.getContext()), new C0112d2(), new C0492s2(y4.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q5) {
        Y4 y4 = this.f1045a;
        y4.b.toString();
        if (!y4.t.c() || !y4.x()) {
            return false;
        }
        U1 u1 = (U1) this.c.read();
        List list = u1.f1068a;
        C0642y2 c0642y2 = u1.b;
        C0667z2 c0667z2 = this.d;
        c0667z2.getClass();
        U1 u12 = null;
        C0642y2 a2 = AndroidUtils.isApiAchieved(28) ? C0567v2.a(c0667z2.f1594a, c0667z2.b) : null;
        List list2 = u1.c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.f1476a, "getting available providers", "location manager", Collections.emptyList(), new C0467r2());
        C0629xe c0629xe = this.b;
        Context context = this.f1045a.f1126a;
        c0629xe.getClass();
        ArrayList a3 = new Qi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a3, list)) {
            a3 = null;
        }
        if (a3 != null || !mo.a(c0642y2, a2) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a3 != null) {
                list = a3;
            }
            u12 = new U1(list, a2, list3);
        }
        if (u12 != null) {
            C0325l9 c0325l9 = y4.n;
            Q5 a4 = Q5.a(q5, u12.f1068a, u12.b, this.e, u12.c);
            c0325l9.a(a4, Sk.a(c0325l9.c.b(a4), a4.i));
            long currentTimeSeconds = c0325l9.i.currentTimeSeconds();
            c0325l9.k = currentTimeSeconds;
            c0325l9.f1357a.a(currentTimeSeconds).b();
            this.c.save(u12);
            return false;
        }
        if (!y4.A()) {
            return false;
        }
        C0325l9 c0325l92 = y4.n;
        Q5 a5 = Q5.a(q5, u1.f1068a, u1.b, this.e, u1.c);
        c0325l92.a(a5, Sk.a(c0325l92.c.b(a5), a5.i));
        long currentTimeSeconds2 = c0325l92.i.currentTimeSeconds();
        c0325l92.k = currentTimeSeconds2;
        c0325l92.f1357a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0101ch(Y4 y4, C0629xe c0629xe, ProtobufStateStorage protobufStateStorage, C0667z2 c0667z2, C0112d2 c0112d2, C0492s2 c0492s2) {
        super(y4);
        this.b = c0629xe;
        this.c = protobufStateStorage;
        this.d = c0667z2;
        this.e = c0112d2;
        this.f = c0492s2;
    }
}
