package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629km implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ee f7737a = new Ee();

    /* renamed from: b, reason: collision with root package name */
    public final C0669ma f7738b = new C0669ma();

    /* renamed from: c, reason: collision with root package name */
    public final Lm f7739c = new Lm();

    /* renamed from: d, reason: collision with root package name */
    public final C0688n3 f7740d = new C0688n3();

    /* renamed from: e, reason: collision with root package name */
    public final C0894v2 f7741e = new C0894v2();
    public final D6 f = new D6();

    /* renamed from: g, reason: collision with root package name */
    public final Hm f7742g = new Hm();

    /* renamed from: h, reason: collision with root package name */
    public final C0931wd f7743h = new C0931wd();

    /* renamed from: i, reason: collision with root package name */
    public final J9 f7744i = new J9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am fromModel(C0707nm c0707nm) {
        Am am = new Am();
        am.f5786s = c0707nm.f7975u;
        am.f5787t = c0707nm.v;
        String str = c0707nm.f7957a;
        if (str != null) {
            am.f5770a = str;
        }
        List list = c0707nm.f;
        if (list != null) {
            am.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0707nm.f7962g;
        if (list2 != null) {
            am.f5775g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0707nm.f7958b;
        if (list3 != null) {
            am.f5772c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0707nm.f7963h;
        if (list4 != null) {
            am.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0707nm.f7964i;
        if (map != null) {
            am.f5776h = this.f.fromModel(map);
        }
        De de = c0707nm.f7973s;
        if (de != null) {
            am.v = this.f7737a.fromModel(de);
        }
        String str2 = c0707nm.f7965j;
        if (str2 != null) {
            am.f5778j = str2;
        }
        String str3 = c0707nm.f7959c;
        if (str3 != null) {
            am.f5773d = str3;
        }
        String str4 = c0707nm.f7960d;
        if (str4 != null) {
            am.f5774e = str4;
        }
        String str5 = c0707nm.f7961e;
        if (str5 != null) {
            am.f5785r = str5;
        }
        am.f5777i = this.f7738b.fromModel(c0707nm.f7968m);
        String str6 = c0707nm.f7966k;
        if (str6 != null) {
            am.f5779k = str6;
        }
        String str7 = c0707nm.f7967l;
        if (str7 != null) {
            am.f5780l = str7;
        }
        am.f5781m = c0707nm.f7970p;
        am.f5771b = c0707nm.f7969n;
        am.f5784q = c0707nm.o;
        RetryPolicyConfig retryPolicyConfig = c0707nm.f7974t;
        am.f5789w = retryPolicyConfig.maxIntervalSeconds;
        am.f5790x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0707nm.f7971q;
        if (str8 != null) {
            am.f5782n = str8;
        }
        Km km = c0707nm.f7972r;
        if (km != null) {
            this.f7739c.getClass();
            C1016zm c1016zm = new C1016zm();
            c1016zm.f8714a = km.f6246a;
            am.f5783p = c1016zm;
        }
        am.f5788u = c0707nm.f7976w;
        C0636l3 c0636l3 = c0707nm.f7977x;
        if (c0636l3 != null) {
            this.f7740d.getClass();
            C0836sm c0836sm = new C0836sm();
            c0836sm.f8326a = c0636l3.f7751a;
            am.f5791y = c0836sm;
        }
        C0868u2 c0868u2 = c0707nm.f7978y;
        if (c0868u2 != null) {
            am.z = this.f7741e.fromModel(c0868u2);
        }
        am.f5767A = this.f7742g.fromModel(c0707nm.z);
        am.f5768B = this.f7743h.fromModel(c0707nm.f7955A);
        am.f5769C = this.f7744i.fromModel(c0707nm.f7956B);
        return am;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0707nm toModel(Am am) {
        C0681mm c0681mm = new C0681mm(this.f7738b.toModel(am.f5777i));
        c0681mm.f7890a = am.f5770a;
        c0681mm.f7898j = am.f5778j;
        c0681mm.f7892c = am.f5773d;
        c0681mm.f7891b = Arrays.asList(am.f5772c);
        c0681mm.f7895g = Arrays.asList(am.f5775g);
        c0681mm.f = Arrays.asList(am.f);
        c0681mm.f7893d = am.f5774e;
        c0681mm.f7894e = am.f5785r;
        c0681mm.f7896h = Arrays.asList(am.o);
        c0681mm.f7899k = am.f5779k;
        c0681mm.f7900l = am.f5780l;
        c0681mm.f7904q = am.f5781m;
        c0681mm.o = am.f5771b;
        c0681mm.f7903p = am.f5784q;
        c0681mm.f7907t = am.f5786s;
        c0681mm.f7908u = am.f5787t;
        c0681mm.f7905r = am.f5782n;
        c0681mm.v = am.f5788u;
        c0681mm.f7909w = new RetryPolicyConfig(am.f5789w, am.f5790x);
        c0681mm.f7897i = this.f.toModel(am.f5776h);
        C0966xm c0966xm = am.v;
        if (c0966xm != null) {
            this.f7737a.getClass();
            c0681mm.f7902n = new De(c0966xm.f8625a, c0966xm.f8626b);
        }
        C1016zm c1016zm = am.f5783p;
        if (c1016zm != null) {
            this.f7739c.getClass();
            c0681mm.f7906s = new Km(c1016zm.f8714a);
        }
        C0836sm c0836sm = am.f5791y;
        if (c0836sm != null) {
            this.f7740d.getClass();
            c0681mm.f7910x = new C0636l3(c0836sm.f8326a);
        }
        C0810rm c0810rm = am.z;
        if (c0810rm != null) {
            c0681mm.f7911y = this.f7741e.toModel(c0810rm);
        }
        C0991ym c0991ym = am.f5767A;
        if (c0991ym != null) {
            this.f7742g.getClass();
            c0681mm.z = new Gm(c0991ym.f8648a);
        }
        c0681mm.f7888A = this.f7743h.toModel(am.f5768B);
        C0888um c0888um = am.f5769C;
        if (c0888um != null) {
            this.f7744i.getClass();
            c0681mm.f7889B = new I9(c0888um.f8470a);
        }
        return new C0707nm(c0681mm);
    }
}
