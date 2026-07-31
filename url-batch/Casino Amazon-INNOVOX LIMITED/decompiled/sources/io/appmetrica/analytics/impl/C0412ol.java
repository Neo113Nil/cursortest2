package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0412ol implements InterfaceC0513sn {
    public static final long d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f1420a;
    public final PermissionExtractor b;
    public final CachedDataProvider.CachedData c;

    public C0412ol(Context context) {
        long j = d;
        this.c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.f1420a = context;
        this.b = C0401oa.k().j();
    }

    public final C0285jl b() {
        return new C0285jl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f1420a, "phone", "getting SimMcc", "TelephonyManager", new C0311kl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f1420a, "phone", "getting SimMnc", "TelephonyManager", new C0337ll()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f1420a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0387nl(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f1420a, "phone", "getting SimOperatorName", "TelephonyManager", new C0362ml()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.c.shouldUpdateData() != false) goto L9;
     */
    @Override // io.appmetrica.analytics.impl.InterfaceC0513sn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<C0285jl> a() {
        List<C0285jl> list;
        List<C0285jl> list2 = (List) this.c.getData();
        if (list2 != null) {
            boolean isEmpty = list2.isEmpty();
            list = list2;
            if (isEmpty) {
                list = list2;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (C0401oa.I.u.b().n.d) {
            if (AndroidUtils.isApiAchieved(23)) {
                if (this.b.hasPermission(this.f1420a, "android.permission.READ_PHONE_STATE")) {
                    arrayList.addAll(C0437pl.a(this.f1420a));
                }
                if (arrayList.size() == 0) {
                    arrayList.add(b());
                }
            } else {
                arrayList.add(b());
            }
        }
        this.c.setData(arrayList);
        list = arrayList;
        return list;
    }
}
