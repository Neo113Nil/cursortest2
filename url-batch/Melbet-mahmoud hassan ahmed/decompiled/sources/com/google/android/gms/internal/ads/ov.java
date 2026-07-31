package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ov {

    /* renamed from: a, reason: collision with root package name */
    public static final ov f9836a = new ov();

    protected ov() {
    }

    public final kv a(Context context, kz kzVar) {
        Context context2;
        List list;
        String str;
        Date n7 = kzVar.n();
        long time = n7 != null ? n7.getTime() : -1L;
        String k7 = kzVar.k();
        int a7 = kzVar.a();
        Set<String> r7 = kzVar.r();
        if (r7.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(r7));
            context2 = context;
        }
        boolean t6 = kzVar.t(context2);
        Location d7 = kzVar.d();
        Bundle f7 = kzVar.f(AdMobAdapter.class);
        kzVar.h();
        String l7 = kzVar.l();
        kzVar.i();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            qw.b();
            str = bo0.l(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean s7 = kzVar.s();
        r2.u b7 = uz.e().b();
        return new kv(8, time, f7, a7, list, t6, Math.max(kzVar.c(), b7.b()), false, l7, null, d7, k7, kzVar.g(), kzVar.e(), Collections.unmodifiableList(new ArrayList(kzVar.q())), kzVar.m(), str, s7, null, Math.max(-1, b7.c()), (String) Collections.max(Arrays.asList(null, b7.a()), new Comparator() { // from class: com.google.android.gms.internal.ads.nv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List<String> list2 = r2.u.f21172e;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), kzVar.o(), kzVar.b(), kzVar.j());
    }
}
