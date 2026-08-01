package k5;

import a2.r;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.p;
import c4.o;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.s3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.zf;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import l.n;
import n4.l;
import n4.s;
import o3.m;
import p2.w;
import s7.c0;
import s7.e0;
import s7.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements j5.c, m6.b, k7.b, n, m, w, s1.a, s7.f, v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5405d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c f5394e = new c(18);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c f5395i = new c(19);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c f5396r = new c(20);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ c f5397s = new c(21);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c f5398t = new c(22);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ c f5399u = new c(23);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c f5400v = new c(24);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c f5401w = new c(25);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c f5402x = new c(26);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c f5403y = new c(27);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ c f5404z = new c(28);
    public static final /* synthetic */ c A = new c(29);

    public /* synthetic */ c(int i3) {
        this.f5405d = i3;
    }

    public static n4.h h(o oVar, s sVar, Bundle bundle, p pVar, l lVar) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        sVar.getClass();
        pVar.getClass();
        return new n4.h(oVar, sVar, bundle, pVar, lVar, uuid, null);
    }

    public static Typeface i(String str, p2.s sVar, int i3) {
        Typeface create;
        if (i3 == 0 && Intrinsics.a(sVar, p2.s.f7645s) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), sVar.f7648d, i3 == 1);
        return create;
    }

    public static Typeface j(String str, p2.s sVar, int i3) {
        if (i3 == 0 && Intrinsics.a(sVar, p2.s.f7645s) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int u2 = cf.c.u(sVar, i3);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(u2) : Typeface.create(str, u2);
    }

    public static final boolean l() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // s7.v
    public Object a() {
        switch (this.f5405d) {
            case 19:
                return new Boolean(((Boolean) m3.f2527a.get()).booleanValue());
            case 20:
                return new Boolean(((Boolean) m3.f2528b.get()).booleanValue());
            case 21:
                return new Boolean(((Boolean) o3.f2596a.get()).booleanValue());
            case 22:
                return new Boolean(((Boolean) s3.f2771a.get()).booleanValue());
            case 23:
                return new Boolean(((Boolean) y3.f3004a.get()).booleanValue());
            case 24:
                List list = e0.f8605a;
                g3.f2322e.get();
                return (Long) h3.f2364a.g(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 25:
                List list2 = e0.f8605a;
                g3.f2322e.get();
                return (String) h3.f2364a.i(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 26:
                List list3 = e0.f8605a;
                g3.f2322e.get();
                return (String) h3.f2364a.i(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 27:
                List list4 = e0.f8605a;
                return (String) q3.f2699a.get();
            case 28:
                List list5 = e0.f8605a;
                return (String) q3.f2700b.get();
            default:
                List list6 = e0.f8605a;
                return (String) q3.f2701c.get();
        }
    }

    @Override // s7.f
    public /* synthetic */ String c(String str, String str2) {
        return null;
    }

    @Override // k7.b
    public int d(Context context, String str) {
        return k7.c.a(context, str);
    }

    @Override // j5.c
    public j5.d e(j5.b bVar) {
        return new i(bVar.f5031a, bVar.f5032b, bVar.f5033c, bVar.f5034d, bVar.f5035e);
    }

    @Override // l.n
    public boolean f(l.i iVar) {
        return false;
    }

    @Override // k7.b
    public int g(String str, boolean z10, Context context) {
        return k7.c.d(str, z10, context);
    }

    @Override // gd.a
    public Object get() {
        switch (this.f5405d) {
            case 2:
                return new f6.b(2, Executors.newSingleThreadExecutor());
            default:
                c0 c0Var = new c0(20);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(h6.d.f4479d, new q6.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(h6.d.f4481i, new q6.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(q6.c.f8033e)));
                            if (unmodifiableSet != null) {
                                hashMap.put(h6.d.f4480e, new q6.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= h6.d.values().length) {
                                    new HashMap();
                                    return new q6.a(c0Var, hashMap);
                                }
                                i0.l("Not all priorities have been configured");
                            } else {
                                r.j("Null flags");
                            }
                        } else {
                            r.j("Null flags");
                        }
                    } else {
                        r.j("Null flags");
                    }
                } else {
                    r.j("Null flags");
                }
                return null;
        }
    }

    public zf k(Context context, String str, k7.b bVar) {
        int g;
        switch (this.f5405d) {
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                zf zfVar = new zf();
                int d10 = bVar.d(context, str);
                zfVar.f3051a = d10;
                if (d10 != 0) {
                    zfVar.f3053c = -1;
                } else {
                    int g2 = bVar.g(str, true, context);
                    zfVar.f3052b = g2;
                    if (g2 != 0) {
                        zfVar.f3053c = 1;
                    }
                }
                return zfVar;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                zf zfVar2 = new zf();
                zfVar2.f3051a = bVar.d(context, str);
                int i3 = 1;
                int g10 = bVar.g(str, true, context);
                zfVar2.f3052b = g10;
                int i10 = zfVar2.f3051a;
                if (i10 == 0) {
                    i10 = 0;
                    if (g10 == 0) {
                        i3 = 0;
                        zfVar2.f3053c = i3;
                        return zfVar2;
                    }
                }
                if (i10 >= g10) {
                    i3 = -1;
                }
                zfVar2.f3053c = i3;
                return zfVar2;
            default:
                zf zfVar3 = new zf();
                int d11 = bVar.d(context, str);
                zfVar3.f3051a = d11;
                int i11 = 1;
                int i12 = 0;
                if (d11 != 0) {
                    g = bVar.g(str, false, context);
                    zfVar3.f3052b = g;
                } else {
                    g = bVar.g(str, true, context);
                    zfVar3.f3052b = g;
                }
                int i13 = zfVar3.f3051a;
                if (i13 != 0) {
                    i12 = i13;
                } else if (g == 0) {
                    i11 = 0;
                    zfVar3.f3053c = i11;
                    return zfVar3;
                }
                if (i12 >= g) {
                    i11 = -1;
                }
                zfVar3.f3053c = i11;
                return zfVar3;
        }
    }

    @Override // l.n
    public void b(l.i iVar, boolean z10) {
    }

    @Override // o3.m
    public void onScrollLimit(int i3, int i10, int i11, boolean z10) {
    }

    @Override // o3.m
    public void onScrollProgress(int i3, int i10, int i11, int i12) {
    }
}
