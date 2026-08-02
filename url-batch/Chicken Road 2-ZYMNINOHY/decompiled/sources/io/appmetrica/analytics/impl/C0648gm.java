package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648gm implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1106ye f11943a = new C1106ye();

    /* renamed from: b, reason: collision with root package name */
    public final C0610fa f11944b = new C0610fa();

    /* renamed from: c, reason: collision with root package name */
    public final Hm f11945c = new Hm();

    /* renamed from: d, reason: collision with root package name */
    public final C0603f3 f11946d = new C0603f3();

    /* renamed from: e, reason: collision with root package name */
    public final C0809n2 f11947e = new C0809n2();

    /* renamed from: f, reason: collision with root package name */
    public final C1046w6 f11948f = new C1046w6();

    /* renamed from: g, reason: collision with root package name */
    public final Dm f11949g = new Dm();

    /* renamed from: h, reason: collision with root package name */
    public final C0872pd f11950h = new C0872pd();

    /* renamed from: i, reason: collision with root package name */
    public final C9 f11951i = new C9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1062wm fromModel(C0725jm c0725jm) {
        C1062wm c1062wm = new C1062wm();
        c1062wm.f12975s = c0725jm.f12174u;
        c1062wm.f12976t = c0725jm.v;
        String str = c0725jm.f12156a;
        if (str != null) {
            c1062wm.f12959a = str;
        }
        List list = c0725jm.f12161f;
        if (list != null) {
            c1062wm.f12964f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0725jm.f12162g;
        if (list2 != null) {
            c1062wm.f12965g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0725jm.f12157b;
        if (list3 != null) {
            c1062wm.f12961c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0725jm.f12163h;
        if (list4 != null) {
            c1062wm.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0725jm.f12164i;
        if (map != null) {
            c1062wm.f12966h = this.f11948f.fromModel(map);
        }
        C1080xe c1080xe = c0725jm.f12172s;
        if (c1080xe != null) {
            c1062wm.v = this.f11943a.fromModel(c1080xe);
        }
        String str2 = c0725jm.f12165j;
        if (str2 != null) {
            c1062wm.f12968j = str2;
        }
        String str3 = c0725jm.f12158c;
        if (str3 != null) {
            c1062wm.f12962d = str3;
        }
        String str4 = c0725jm.f12159d;
        if (str4 != null) {
            c1062wm.f12963e = str4;
        }
        String str5 = c0725jm.f12160e;
        if (str5 != null) {
            c1062wm.f12974r = str5;
        }
        c1062wm.f12967i = this.f11944b.fromModel(c0725jm.f12168m);
        String str6 = c0725jm.f12166k;
        if (str6 != null) {
            c1062wm.f12969k = str6;
        }
        String str7 = c0725jm.f12167l;
        if (str7 != null) {
            c1062wm.f12970l = str7;
        }
        c1062wm.f12971m = c0725jm.f12169p;
        c1062wm.f12960b = c0725jm.n;
        c1062wm.f12973q = c0725jm.o;
        RetryPolicyConfig retryPolicyConfig = c0725jm.f12173t;
        c1062wm.f12978w = retryPolicyConfig.maxIntervalSeconds;
        c1062wm.f12979x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0725jm.f12170q;
        if (str8 != null) {
            c1062wm.n = str8;
        }
        Gm gm = c0725jm.f12171r;
        if (gm != null) {
            this.f11945c.getClass();
            C1036vm c1036vm = new C1036vm();
            c1036vm.f12904a = gm.f10340a;
            c1062wm.f12972p = c1036vm;
        }
        c1062wm.f12977u = c0725jm.f12175w;
        C0552d3 c0552d3 = c0725jm.f12176x;
        if (c0552d3 != null) {
            this.f11946d.getClass();
            C0855om c0855om = new C0855om();
            c0855om.f12533a = c0552d3.f11648a;
            c1062wm.f12980y = c0855om;
        }
        C0783m2 c0783m2 = c0725jm.f12177y;
        if (c0783m2 != null) {
            c1062wm.z = this.f11947e.fromModel(c0783m2);
        }
        c1062wm.f12956A = this.f11949g.fromModel(c0725jm.z);
        c1062wm.f12957B = this.f11950h.fromModel(c0725jm.f12154A);
        c1062wm.f12958C = this.f11951i.fromModel(c0725jm.f12155B);
        return c1062wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0725jm toModel(C1062wm c1062wm) {
        C0699im c0699im = new C0699im(this.f11944b.toModel(c1062wm.f12967i));
        c0699im.f12056a = c1062wm.f12959a;
        c0699im.f12065j = c1062wm.f12968j;
        c0699im.f12058c = c1062wm.f12962d;
        c0699im.f12057b = Arrays.asList(c1062wm.f12961c);
        c0699im.f12062g = Arrays.asList(c1062wm.f12965g);
        c0699im.f12061f = Arrays.asList(c1062wm.f12964f);
        c0699im.f12059d = c1062wm.f12963e;
        c0699im.f12060e = c1062wm.f12974r;
        c0699im.f12063h = Arrays.asList(c1062wm.o);
        c0699im.f12066k = c1062wm.f12969k;
        c0699im.f12067l = c1062wm.f12970l;
        c0699im.f12070q = c1062wm.f12971m;
        c0699im.o = c1062wm.f12960b;
        c0699im.f12069p = c1062wm.f12973q;
        c0699im.f12073t = c1062wm.f12975s;
        c0699im.f12074u = c1062wm.f12976t;
        c0699im.f12071r = c1062wm.n;
        c0699im.v = c1062wm.f12977u;
        c0699im.f12075w = new RetryPolicyConfig(c1062wm.f12978w, c1062wm.f12979x);
        c0699im.f12064i = this.f11948f.toModel(c1062wm.f12966h);
        C0984tm c0984tm = c1062wm.v;
        if (c0984tm != null) {
            this.f11943a.getClass();
            c0699im.n = new C1080xe(c0984tm.f12790a, c0984tm.f12791b);
        }
        C1036vm c1036vm = c1062wm.f12972p;
        if (c1036vm != null) {
            this.f11945c.getClass();
            c0699im.f12072s = new Gm(c1036vm.f12904a);
        }
        C0855om c0855om = c1062wm.f12980y;
        if (c0855om != null) {
            this.f11946d.getClass();
            c0699im.f12076x = new C0552d3(c0855om.f12533a);
        }
        C0829nm c0829nm = c1062wm.z;
        if (c0829nm != null) {
            c0699im.f12077y = this.f11947e.toModel(c0829nm);
        }
        C1010um c1010um = c1062wm.f12956A;
        if (c1010um != null) {
            this.f11949g.getClass();
            c0699im.z = new Cm(c1010um.f12855a);
        }
        c0699im.f12054A = this.f11950h.toModel(c1062wm.f12957B);
        C0907qm c0907qm = c1062wm.f12958C;
        if (c0907qm != null) {
            this.f11951i.getClass();
            c0699im.f12055B = new B9(c0907qm.f12629a);
        }
        return new C0725jm(c0699im);
    }
}
