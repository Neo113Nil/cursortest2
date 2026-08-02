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
public final class C0809rl implements InterfaceC0863tn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f8253d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8254a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f8255b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f8256c;

    public C0809rl(Context context) {
        long j3 = f8253d;
        this.f8256c = new CachedDataProvider.CachedData(j3, j3, "sim-info");
        this.f8254a = context;
        this.f8255b = C0876ua.k().j();
    }

    public final C0680ml b() {
        return new C0680ml((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8254a, "phone", "getting SimMcc", "TelephonyManager", new C0706nl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8254a, "phone", "getting SimMnc", "TelephonyManager", new C0732ol()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f8254a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0784ql(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8254a, "phone", "getting SimOperatorName", "TelephonyManager", new C0758pl()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0863tn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C0680ml> a() {
        List<C0680ml> list;
        try {
            List<C0680ml> list2 = (List) this.f8256c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f8256c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C0876ua.f8420H.f8446u.b().f7675n.f8292d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f8255b.hasPermission(this.f8254a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C0835sl.a(this.f8254a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f8256c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
