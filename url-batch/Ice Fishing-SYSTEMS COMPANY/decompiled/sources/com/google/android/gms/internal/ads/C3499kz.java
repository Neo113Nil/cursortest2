package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.kz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3499kz extends AbstractC3984tz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32491f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final Object f32492g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f32493h;

    public C3499kz(C3830r6 c3830r6, C3391iz c3391iz, DisplayMetrics displayMetrics, View view, C4158xA c4158xA) {
        super("jfdrT3YDVcDOM9UB5LzDpqcbuDp5keVZHqGcg+MV5UCB23uYRRp2NQL5QwO7s7yD", "z81VgQq8DV/RpboX+za4HXvceA1wD9mZ3Lv8nuAqQVE=", c3830r6, c3391iz, c4158xA.a(124));
        this.f32492g = displayMetrics;
        this.f32493h = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3984tz
    public final void a(Method method, C3830r6 c3830r6) {
        switch (this.f32491f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.f32493h, (Activity) this.f32492g);
                objArr.getClass();
                synchronized (c3830r6) {
                    long longValue = ((Long) objArr[0]).longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).d0(longValue);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).e0(longValue2);
                    String str = (String) objArr[2];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).f0(str);
                }
                return;
            case 1:
                Long l9 = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l10 = (Long) method.invoke("", (Context) this.f32492g);
                        if (l10 == null) {
                            throw null;
                        }
                        l9 = l10;
                    } else {
                        J3.a aVar = (J3.a) ((Map) this.f32493h).get("gs");
                        if (aVar != null && aVar.isDone()) {
                            l9 = Long.valueOf(((D6) aVar.get()).y0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (c3830r6) {
                    long longValue3 = l9.longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).c0(longValue3);
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.f32492g;
                Long l11 = (Long) map.get("tcq");
                if (l11 == null) {
                    l11 = -1L;
                }
                lArr[0] = l11;
                Long l12 = (Long) map.get("tpq");
                if (l12 == null) {
                    l12 = -1L;
                }
                lArr[1] = l12;
                Long l13 = (Long) map.get("tcv");
                if (l13 == null) {
                    l13 = -1L;
                }
                lArr[2] = l13;
                Long l14 = (Long) map.get("tpv");
                if (l14 == null) {
                    l14 = -1L;
                }
                lArr[3] = l14;
                Long l15 = (Long) map.get("tchv");
                if (l15 == null) {
                    l15 = -1L;
                }
                lArr[4] = l15;
                Long l16 = (Long) map.get("tphv");
                if (l16 == null) {
                    l16 = -1L;
                }
                lArr[5] = l16;
                Long l17 = (Long) map.get("tcc");
                if (l17 == null) {
                    l17 = -1L;
                }
                lArr[6] = l17;
                Long l18 = (Long) map.get("tpc");
                if (l18 == null) {
                    l18 = -1L;
                }
                lArr[7] = l18;
                Long l19 = (Long) map.get("tst");
                if (l19 == null) {
                    l19 = -1L;
                }
                lArr[8] = l19;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((EnumC3714oy) this.f32493h).ordinal()));
                lArr2.getClass();
                synchronized (c3830r6) {
                    long longValue4 = lArr2[0].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).n0(longValue4);
                    long longValue5 = lArr2[1].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).D(longValue5);
                    long longValue6 = lArr2[2].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).R0(longValue6);
                    long longValue7 = lArr2[3].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).O0(longValue7);
                    long longValue8 = lArr2[4].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).j0(longValue8);
                    long longValue9 = lArr2[5].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).k0(longValue9);
                    long longValue10 = lArr2[6].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).Q(longValue10);
                    long longValue11 = lArr2[7].longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).R(longValue11);
                }
                return;
            default:
                View view = (View) this.f32493h;
                if (view == null) {
                    return;
                }
                Object invoke = method.invoke("", (DisplayMetrics) this.f32492g, view);
                invoke.getClass();
                Long[] lArr3 = (Long[]) invoke;
                B6 A8 = C6.A();
                long longValue12 = lArr3[2].longValue();
                A8.h();
                ((C6) A8.f30000u).C(longValue12);
                long longValue13 = lArr3[1].longValue();
                A8.h();
                ((C6) A8.f30000u).D(longValue13);
                long longValue14 = lArr3[0].longValue();
                A8.h();
                ((C6) A8.f30000u).E(longValue14);
                long longValue15 = lArr3[3].longValue();
                A8.h();
                ((C6) A8.f30000u).B(longValue15);
                long longValue16 = lArr3[4].longValue();
                A8.h();
                ((C6) A8.f30000u).F(longValue16);
                C6 c62 = (C6) A8.j();
                c3830r6.h();
                ((D6) c3830r6.f30000u).W(c62);
                return;
        }
    }

    public C3499kz(C3830r6 c3830r6, C3391iz c3391iz, View view, Activity activity, C4158xA c4158xA) {
        super("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", c3830r6, c3391iz, c4158xA.a(111));
        this.f32493h = view;
        this.f32492g = activity;
    }

    public C3499kz(C3830r6 c3830r6, C3391iz c3391iz, EnumC3714oy enumC3714oy, Map map, C4158xA c4158xA) {
        super("0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE", "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ=", c3830r6, c3391iz, c4158xA.a(122));
        this.f32492g = map;
        this.f32493h = enumC3714oy;
    }

    public C3499kz(C3830r6 c3830r6, C3391iz c3391iz, Map map, Context context, C4158xA c4158xA) {
        super("I4xYlccqZe8KvMWrizW1s/OekBI2YfU7UNZwq9dr0dp7B5I0B1zvHWlOnn7y8ubq", "k7BIphhpl3j5W4f9W8N9gMUD+i5xBlP2tWz8eVUQlQQ=", c3830r6, c3391iz, c4158xA.a(120));
        this.f32492g = context;
        this.f32493h = map;
    }
}
