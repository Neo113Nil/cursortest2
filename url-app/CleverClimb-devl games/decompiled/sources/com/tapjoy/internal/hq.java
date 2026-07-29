package com.tapjoy.internal;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.mopub.common.AdType;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hq {
    public static String a(fb fbVar) {
        bh b2 = new bh().c().a(TapjoyConstants.TJC_SDK_PLACEMENT).b(fbVar.t).a("os_name").b(fbVar.k).a("os_ver").b(fbVar.l).a("device_id").b(fbVar.h).a("device_maker").b(fbVar.i).a("device_model").b(fbVar.j).a(TapjoyConstants.TJC_PACKAGE_ID).b(fbVar.r).a(TapjoyConstants.TJC_PACKAGE_SIGN).b(fbVar.s).a("locale").b(fbVar.p).a("timezone").b(fbVar.q);
        if (fbVar.m != null) {
            b2.a(TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY).a((Number) fbVar.m);
        }
        if (fbVar.n != null) {
            b2.a(TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH).a((Number) fbVar.n);
        }
        if (fbVar.o != null) {
            b2.a(TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT).a((Number) fbVar.o);
        }
        if (fbVar.g != null) {
            b2.a("mac").b(fbVar.g);
        }
        if (fbVar.u != null) {
            b2.a(TapjoyConstants.TJC_DEVICE_COUNTRY_SIM).b(fbVar.u);
        }
        if (fbVar.v != null) {
            b2.a("country_net").b(fbVar.v);
        }
        if (fbVar.w != null) {
            b2.a("imei").b(fbVar.w);
        }
        if (fbVar.x != null) {
            b2.a(TapjoyConstants.TJC_ANDROID_ID).b(fbVar.x);
        }
        return b2.d().toString();
    }

    public static String a(ev evVar) {
        bh c2 = new bh().c();
        if (evVar.e != null) {
            c2.a(TapjoyConstants.TJC_PACKAGE_VERSION).b(evVar.e);
        }
        if (evVar.f != null) {
            c2.a(TapjoyConstants.TJC_PACKAGE_REVISION).a((Number) evVar.f);
        }
        if (evVar.g != null) {
            c2.a("data_ver").b(evVar.g);
        }
        if (evVar.h != null) {
            c2.a(TapjoyConstants.TJC_INSTALLER).b(evVar.h);
        }
        if (evVar.i != null) {
            c2.a(TapjoyConstants.TJC_STORE).b(evVar.i);
        }
        return c2.d().toString();
    }

    public static String a(fi fiVar) {
        return a(fiVar, null);
    }

    private static String a(fi fiVar, ew ewVar) {
        String b2;
        bh c2 = new bh().c();
        if (fiVar.s != null) {
            c2.a(TapjoyConstants.TJC_INSTALLED).a((Number) fiVar.s);
        }
        if (fiVar.t != null) {
            c2.a(TapjoyConstants.TJC_REFERRER).b(fiVar.t);
        }
        if (fiVar.G != null) {
            c2.a("idfa").b(fiVar.G);
            if (fiVar.H != null && fiVar.H.booleanValue()) {
                c2.a("idfa_optout").a(1L);
            }
        } else if (ewVar != null && ewVar.r != null && hd.f8259a.equals(ewVar.r) && (b2 = ho.b()) != null) {
            c2.a("idfa").b(b2);
            if (ho.c()) {
                c2.a("idfa_optout").a(1L);
            }
        }
        if (fiVar.u != null) {
            c2.a(TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY).a(Math.max(fiVar.u.intValue(), 1));
        }
        if (fiVar.v != null) {
            c2.a(TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY).a(Math.max(fiVar.v.intValue(), 1));
        }
        if (fiVar.w.size() > 0) {
            ArrayList arrayList = new ArrayList(fiVar.w.size());
            for (ff ffVar : fiVar.w) {
                if (ffVar.h != null) {
                    arrayList.add(ffVar.f);
                }
            }
            if (!arrayList.isEmpty()) {
                c2.a("push").a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c2.b((String) it.next());
                }
                c2.b();
            }
        }
        c2.a(com.umeng.analytics.pro.b.ac).c();
        if (fiVar.x != null) {
            c2.a("total_count").a((Number) fiVar.x);
        }
        if (fiVar.y != null) {
            c2.a("total_length").a((Number) fiVar.y);
        }
        if (fiVar.z != null) {
            c2.a("last_at").a((Number) fiVar.z);
        }
        if (fiVar.A != null) {
            c2.a("last_length").a((Number) fiVar.A);
        }
        c2.d();
        c2.a(ProductAction.ACTION_PURCHASE).c();
        if (fiVar.B != null) {
            c2.a("currency").b(fiVar.B);
        }
        if (fiVar.C != null) {
            c2.a("total_count").a((Number) fiVar.C);
        }
        if (fiVar.D != null) {
            c2.a("total_price").a((Number) fiVar.D);
        }
        if (fiVar.E != null) {
            c2.a("last_at").a((Number) fiVar.E);
        }
        if (fiVar.F != null) {
            c2.a("last_price").a((Number) fiVar.F);
        }
        c2.d();
        if (fiVar.I != null) {
            c2.a("user_id").b(fiVar.I);
        }
        if (fiVar.J != null) {
            c2.a(TapjoyConstants.TJC_USER_LEVEL).a((Number) fiVar.J);
        }
        if (fiVar.K != null) {
            c2.a(TapjoyConstants.TJC_USER_FRIEND_COUNT).a((Number) fiVar.K);
        }
        if (fiVar.L != null) {
            c2.a(TapjoyConstants.TJC_USER_VARIABLE_1).b(fiVar.L);
        }
        if (fiVar.M != null) {
            c2.a(TapjoyConstants.TJC_USER_VARIABLE_2).b(fiVar.M);
        }
        if (fiVar.N != null) {
            c2.a(TapjoyConstants.TJC_USER_VARIABLE_3).b(fiVar.N);
        }
        if (fiVar.O != null) {
            c2.a(TapjoyConstants.TJC_USER_VARIABLE_4).b(fiVar.O);
        }
        if (fiVar.P != null) {
            c2.a(TapjoyConstants.TJC_USER_VARIABLE_5).b(fiVar.P);
        }
        if (fiVar.Q.size() > 0) {
            c2.a("tags").a((Collection) fiVar.Q);
        }
        if (Boolean.TRUE.equals(fiVar.R)) {
            c2.a("push_optout").a(1L);
        }
        return c2.d().toString();
    }

    private static String a(ew ewVar, boolean z, boolean z2, boolean z3) {
        bh b2 = new bh().c().a("type").b(a(ewVar.n)).a("name").b(ewVar.o);
        b2.a("time");
        if (ewVar.q != null) {
            b2.a((Number) ewVar.p);
            b2.a("systime").a((Number) ewVar.q);
        } else if (v.c() && ewVar.r != null && ewVar.s != null && hd.f8259a.equals(ewVar.r)) {
            b2.a(v.a(ewVar.s.longValue()));
            b2.a("systime").a((Number) ewVar.p);
        } else {
            b2.a((Number) ewVar.p);
        }
        if (ewVar.t != null) {
            b2.a("duration").a((Number) ewVar.t);
        }
        if (!z && ewVar.u != null) {
            b2.a(TJAdUnitConstants.String.VIDEO_INFO).a((bl) new bm(a(ewVar.u)));
        }
        if (!z2 && ewVar.v != null) {
            b2.a(TapjoyConstants.TJC_APP_PLACEMENT).a((bl) new bm(a(ewVar.v)));
        }
        if (!z3 && ewVar.w != null) {
            b2.a("user").a((bl) new bm(a(ewVar.w, ewVar)));
        }
        if (ewVar.y != null) {
            b2.a("event_seq").a((Number) ewVar.y);
        }
        if (ewVar.z != null) {
            bh a2 = b2.a("event_prev");
            ey eyVar = ewVar.z;
            bh b3 = new bh().c().a("type").b(a(eyVar.e)).a("name").b(eyVar.f);
            if (eyVar.g != null) {
                b3.a("category").b(eyVar.g);
            }
            a2.a((bl) new bm(b3.d().toString()));
        }
        if (ewVar.A != null) {
            bh a3 = b2.a(ProductAction.ACTION_PURCHASE);
            fe feVar = ewVar.A;
            bh b4 = new bh().c().a("product_id").b(feVar.h);
            if (feVar.i != null) {
                b4.a("product_quantity").a((Number) feVar.i);
            }
            if (feVar.j != null) {
                b4.a("product_price").a((Number) feVar.j);
            }
            if (feVar.k != null) {
                b4.a("product_price_currency").b(feVar.k);
            }
            if (feVar.s != null) {
                b4.a("currency_price").b(feVar.s);
            }
            if (feVar.l != null) {
                b4.a("product_type").b(feVar.l);
            }
            if (feVar.m != null) {
                b4.a("product_title").b(feVar.m);
            }
            if (feVar.n != null) {
                b4.a("product_description").b(feVar.n);
            }
            if (feVar.o != null) {
                b4.a(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER).b(feVar.o);
            }
            if (feVar.p != null) {
                b4.a("transaction_state").a((Number) feVar.p);
            }
            if (feVar.q != null) {
                b4.a("transaction_date").a((Number) feVar.q);
            }
            if (feVar.r != null) {
                b4.a("campaign_id").b(feVar.r);
            }
            if (feVar.t != null) {
                b4.a("receipt").b(feVar.t);
            }
            if (feVar.u != null) {
                b4.a(InAppPurchaseMetaData.KEY_SIGNATURE).b(feVar.u);
            }
            a3.a((bl) new bm(b4.d().toString()));
        }
        if (ewVar.B != null) {
            b2.a(com.umeng.analytics.pro.b.ao).b(ewVar.B);
        }
        try {
            if (ewVar.D != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (ewVar.C != null) {
                    bn.b(ewVar.C).a(linkedHashMap);
                }
                fd fdVar = ewVar.D;
                if (fdVar.f8074d != null) {
                    linkedHashMap.put("fq7_change", fdVar.f8074d);
                }
                if (fdVar.e != null) {
                    linkedHashMap.put("fq30_change", fdVar.e);
                }
                if (fdVar.f != null) {
                    linkedHashMap.put(TJAdUnitConstants.PARAM_PUSH_ID, fdVar.f);
                }
                b2.a("meta").a((Map) linkedHashMap);
            } else if (ewVar.C != null) {
                b2.a("meta").a((bl) new bm(ewVar.C));
            }
        } catch (IOException unused) {
        }
        if (ewVar.I != null) {
            b2.a(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS).a((bl) new bm(ewVar.I));
        }
        if (ewVar.J != null) {
            b2.a("count").a((Number) ewVar.J);
        }
        if (ewVar.K != null) {
            b2.a("first_time").a((Number) ewVar.K);
        }
        if (ewVar.L != null) {
            b2.a("last_time").a((Number) ewVar.L);
        }
        if (ewVar.E != null) {
            b2.a("category").b(ewVar.E);
        }
        if (ewVar.F != null) {
            b2.a("p1").b(ewVar.F);
        }
        if (ewVar.G != null) {
            b2.a("p2").b(ewVar.G);
        }
        if (ewVar.H.size() > 0) {
            b2.a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES).c();
            for (fa faVar : ewVar.H) {
                b2.a(faVar.e).a((Number) faVar.f);
            }
            b2.d();
        }
        return b2.d().toString();
    }

    public static String a(ex exVar) {
        fb fbVar;
        boolean z;
        ev evVar;
        boolean z2;
        bh a2 = new bh().a();
        fb fbVar2 = null;
        ev evVar2 = null;
        fi fiVar = null;
        for (ew ewVar : exVar.f8049d) {
            boolean z3 = true;
            if (fbVar2 == null || !fbVar2.equals(ewVar.u)) {
                fbVar = ewVar.u;
                z = false;
            } else {
                fbVar = fbVar2;
                z = true;
            }
            if (evVar2 == null || !evVar2.equals(ewVar.v)) {
                evVar = ewVar.v;
                z2 = false;
            } else {
                evVar = evVar2;
                z2 = true;
            }
            if (fiVar == null || !fiVar.equals(ewVar.w)) {
                fiVar = ewVar.w;
                z3 = false;
            }
            a2.a((bl) new bm(a(ewVar, z, z2, z3)));
            fbVar2 = fbVar;
            evVar2 = evVar;
        }
        return a2.b().toString();
    }

    private static String a(ez ezVar) {
        switch (ezVar) {
            case APP:
                return TapjoyConstants.TJC_APP_PLACEMENT;
            case CAMPAIGN:
                return "campaign";
            case CUSTOM:
                return AdType.CUSTOM;
            case USAGES:
                return "usages";
            default:
                throw new RuntimeException();
        }
    }
}
