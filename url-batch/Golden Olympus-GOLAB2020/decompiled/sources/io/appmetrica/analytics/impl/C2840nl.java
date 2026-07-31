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
/* loaded from: classes3.dex */
public final class C2840nl implements InterfaceC2868on {

    /* renamed from: d, reason: collision with root package name */
    public static final long f39521d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f39522a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f39523b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f39524c;

    public C2840nl(Context context) {
        long j4 = f39521d;
        this.f39524c = new CachedDataProvider.CachedData(j4, j4, "sim-info");
        this.f39522a = context;
        this.f39523b = Ia.j().i();
    }

    public final C2710il b() {
        return new C2710il((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f39522a, "phone", "getting SimMcc", "TelephonyManager", new C2736jl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f39522a, "phone", "getting SimMnc", "TelephonyManager", new C2762kl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f39522a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C2814ml(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f39522a, "phone", "getting SimOperatorName", "TelephonyManager", new C2788ll()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2868on
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C2710il> a() {
        List<C2710il> list;
        try {
            List<C2710il> list2 = (List) this.f39524c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f39524c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (Ia.f37730F.f37756u.b().f38992n.f37561d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f39523b.hasPermission(this.f39522a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C2866ol.a(this.f39522a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f39524c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
