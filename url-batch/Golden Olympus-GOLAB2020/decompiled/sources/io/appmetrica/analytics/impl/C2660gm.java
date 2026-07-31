package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2660gm implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Me f39102a = new Me();

    /* renamed from: b, reason: collision with root package name */
    public final Aa f39103b = new Aa();

    /* renamed from: c, reason: collision with root package name */
    public final Im f39104c = new Im();

    /* renamed from: d, reason: collision with root package name */
    public final C3002u2 f39105d = new C3002u2();

    /* renamed from: e, reason: collision with root package name */
    public final B3 f39106e = new B3();

    /* renamed from: f, reason: collision with root package name */
    public final C2950s2 f39107f = new C2950s2();

    /* renamed from: g, reason: collision with root package name */
    public final R6 f39108g = new R6();

    /* renamed from: h, reason: collision with root package name */
    public final Em f39109h = new Em();

    /* renamed from: i, reason: collision with root package name */
    public final Fd f39110i = new Fd();

    /* renamed from: j, reason: collision with root package name */
    public final X9 f39111j = new X9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3100xm fromModel(@NonNull C2737jm c2737jm) {
        C3100xm c3100xm = new C3100xm();
        c3100xm.f40230s = c2737jm.f39314u;
        c3100xm.f40231t = c2737jm.f39315v;
        String str = c2737jm.f39294a;
        if (str != null) {
            c3100xm.f40212a = str;
        }
        List list = c2737jm.f39299f;
        if (list != null) {
            c3100xm.f40217f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c2737jm.f39300g;
        if (list2 != null) {
            c3100xm.f40218g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c2737jm.f39295b;
        if (list3 != null) {
            c3100xm.f40214c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c2737jm.f39301h;
        if (list4 != null) {
            c3100xm.f40226o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c2737jm.f39302i;
        if (map != null) {
            c3100xm.f40219h = this.f39108g.fromModel(map);
        }
        Le le = c2737jm.f39312s;
        if (le != null) {
            c3100xm.f40233v = this.f39102a.fromModel(le);
        }
        String str2 = c2737jm.f39303j;
        if (str2 != null) {
            c3100xm.f40221j = str2;
        }
        String str3 = c2737jm.f39296c;
        if (str3 != null) {
            c3100xm.f40215d = str3;
        }
        String str4 = c2737jm.f39297d;
        if (str4 != null) {
            c3100xm.f40216e = str4;
        }
        String str5 = c2737jm.f39298e;
        if (str5 != null) {
            c3100xm.f40229r = str5;
        }
        c3100xm.f40220i = this.f39103b.fromModel(c2737jm.f39306m);
        String str6 = c2737jm.f39304k;
        if (str6 != null) {
            c3100xm.f40222k = str6;
        }
        String str7 = c2737jm.f39305l;
        if (str7 != null) {
            c3100xm.f40223l = str7;
        }
        c3100xm.f40224m = c2737jm.f39309p;
        c3100xm.f40213b = c2737jm.f39307n;
        c3100xm.f40228q = c2737jm.f39308o;
        RetryPolicyConfig retryPolicyConfig = c2737jm.f39313t;
        c3100xm.f40234w = retryPolicyConfig.maxIntervalSeconds;
        c3100xm.f40235x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c2737jm.f39310q;
        if (str8 != null) {
            c3100xm.f40225n = str8;
        }
        Hm hm = c2737jm.f39311r;
        if (hm != null) {
            this.f39104c.getClass();
            C3074wm c3074wm = new C3074wm();
            c3074wm.f40099a = hm.f37674a;
            c3100xm.f40227p = c3074wm;
        }
        c3100xm.f40232u = c2737jm.f39316w;
        BillingConfig billingConfig = c2737jm.f39317x;
        if (billingConfig != null) {
            c3100xm.f40237z = this.f39105d.fromModel(billingConfig);
        }
        C3133z3 c3133z3 = c2737jm.f39318y;
        if (c3133z3 != null) {
            this.f39106e.getClass();
            C2893pm c2893pm = new C2893pm();
            c2893pm.f39632a = c3133z3.f40301a;
            c3100xm.f40236y = c2893pm;
        }
        C2924r2 c2924r2 = c2737jm.f39319z;
        if (c2924r2 != null) {
            c3100xm.f40208A = this.f39107f.fromModel(c2924r2);
        }
        c3100xm.f40209B = this.f39109h.fromModel(c2737jm.f39291A);
        c3100xm.f40210C = this.f39110i.fromModel(c2737jm.f39292B);
        c3100xm.f40211D = this.f39111j.fromModel(c2737jm.f39293C);
        return c3100xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2737jm toModel(@NonNull C3100xm c3100xm) {
        C2711im c2711im = new C2711im(this.f39103b.toModel(c3100xm.f40220i));
        c2711im.f39218a = c3100xm.f40212a;
        c2711im.f39227j = c3100xm.f40221j;
        c2711im.f39220c = c3100xm.f40215d;
        c2711im.f39219b = Arrays.asList(c3100xm.f40214c);
        c2711im.f39224g = Arrays.asList(c3100xm.f40218g);
        c2711im.f39223f = Arrays.asList(c3100xm.f40217f);
        c2711im.f39221d = c3100xm.f40216e;
        c2711im.f39222e = c3100xm.f40229r;
        c2711im.f39225h = Arrays.asList(c3100xm.f40226o);
        c2711im.f39228k = c3100xm.f40222k;
        c2711im.f39229l = c3100xm.f40223l;
        c2711im.f39234q = c3100xm.f40224m;
        c2711im.f39232o = c3100xm.f40213b;
        c2711im.f39233p = c3100xm.f40228q;
        c2711im.f39237t = c3100xm.f40230s;
        c2711im.f39238u = c3100xm.f40231t;
        c2711im.f39235r = c3100xm.f40225n;
        c2711im.f39239v = c3100xm.f40232u;
        c2711im.f39240w = new RetryPolicyConfig(c3100xm.f40234w, c3100xm.f40235x);
        c2711im.f39226i = this.f39108g.toModel(c3100xm.f40219h);
        C3022um c3022um = c3100xm.f40233v;
        if (c3022um != null) {
            this.f39102a.getClass();
            c2711im.f39231n = new Le(c3022um.f39948a, c3022um.f39949b);
        }
        C3074wm c3074wm = c3100xm.f40227p;
        if (c3074wm != null) {
            this.f39104c.getClass();
            c2711im.f39236s = new Hm(c3074wm.f40099a);
        }
        C2867om c2867om = c3100xm.f40237z;
        if (c2867om != null) {
            this.f39105d.getClass();
            c2711im.f39241x = new BillingConfig(c2867om.f39590a, c2867om.f39591b);
        }
        C2893pm c2893pm = c3100xm.f40236y;
        if (c2893pm != null) {
            this.f39106e.getClass();
            c2711im.f39242y = new C3133z3(c2893pm.f39632a);
        }
        C2841nm c2841nm = c3100xm.f40208A;
        if (c2841nm != null) {
            c2711im.f39243z = this.f39107f.toModel(c2841nm);
        }
        C3048vm c3048vm = c3100xm.f40209B;
        if (c3048vm != null) {
            this.f39109h.getClass();
            c2711im.f39215A = new Dm(c3048vm.f39987a);
        }
        c2711im.f39216B = this.f39110i.toModel(c3100xm.f40210C);
        C2944rm c2944rm = c3100xm.f40211D;
        if (c2944rm != null) {
            this.f39111j.getClass();
            c2711im.f39217C = new W9(c2944rm.f39755a);
        }
        return new C2737jm(c2711im);
    }
}
