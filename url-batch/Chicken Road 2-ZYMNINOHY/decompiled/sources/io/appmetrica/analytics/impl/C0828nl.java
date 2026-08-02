package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828nl implements InterfaceC0933rn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f12471d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f12472a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f12473b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f12474c;

    public C0828nl(Context context) {
        long j4 = f12471d;
        this.f12474c = new CachedDataProvider.CachedData(j4, j4, "sim-info");
        this.f12472a = context;
        this.f12473b = C0817na.k().j();
    }

    public final C0698il b() {
        return new C0698il((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f12472a, "phone", "getting SimMcc", "TelephonyManager", new C0724jl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f12472a, "phone", "getting SimMnc", "TelephonyManager", new C0750kl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f12472a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0802ml(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f12472a, "phone", "getting SimOperatorName", "TelephonyManager", new C0776ll()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0933rn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C0698il> a() {
        List<C0698il> list;
        try {
            List<C0698il> list2 = (List) this.f12474c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f12474c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C0817na.f12417I.f12444u.b().n.f12262d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f12473b.hasPermission(this.f12472a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C0854ol.a(this.f12472a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f12474c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
