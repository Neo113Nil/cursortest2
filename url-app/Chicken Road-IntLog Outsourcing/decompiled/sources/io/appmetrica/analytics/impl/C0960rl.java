package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960rl implements InterfaceC1014tn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f9188d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f9189a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f9190b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f9191c;

    public C0960rl(Context context) {
        long j2 = f9188d;
        this.f9191c = new CachedDataProvider.CachedData(j2, j2, "sim-info");
        this.f9189a = context;
        this.f9190b = C1027ua.k().j();
    }

    public final C0831ml b() {
        return new C0831ml((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9189a, "phone", "getting SimMcc", "TelephonyManager", new C0857nl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9189a, "phone", "getting SimMnc", "TelephonyManager", new C0883ol()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f9189a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0935ql(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9189a, "phone", "getting SimOperatorName", "TelephonyManager", new C0909pl()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1014tn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C0831ml> a() {
        List<C0831ml> list;
        try {
            List<C0831ml> list2 = (List) this.f9191c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f9191c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C1027ua.f9366H.f9394u.b().f8572n.f9231d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f9190b.hasPermission(this.f9189a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C0986sl.a(this.f9189a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f9191c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
