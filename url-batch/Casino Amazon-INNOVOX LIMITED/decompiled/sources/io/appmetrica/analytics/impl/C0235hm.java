package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0235hm implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0679ze f1294a = new C0679ze();
    public final C0197ga b = new C0197ga();
    public final Im c = new Im();
    public final C0190g3 d = new C0190g3();
    public final C0393o2 e = new C0393o2();
    public final C0621x6 f = new C0621x6();
    public final Em g = new Em();
    public final C0454qd h = new C0454qd();
    public final D9 i = new D9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0637xm fromModel(C0312km c0312km) {
        C0637xm c0637xm = new C0637xm();
        c0637xm.s = c0312km.u;
        c0637xm.t = c0312km.v;
        String str = c0312km.f1347a;
        if (str != null) {
            c0637xm.f1570a = str;
        }
        List list = c0312km.f;
        if (list != null) {
            c0637xm.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0312km.g;
        if (list2 != null) {
            c0637xm.g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0312km.b;
        if (list3 != null) {
            c0637xm.c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0312km.h;
        if (list4 != null) {
            c0637xm.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0312km.i;
        if (map != null) {
            c0637xm.h = this.f.fromModel(map);
        }
        C0654ye c0654ye = c0312km.s;
        if (c0654ye != null) {
            c0637xm.v = this.f1294a.fromModel(c0654ye);
        }
        String str2 = c0312km.j;
        if (str2 != null) {
            c0637xm.j = str2;
        }
        String str3 = c0312km.c;
        if (str3 != null) {
            c0637xm.d = str3;
        }
        String str4 = c0312km.d;
        if (str4 != null) {
            c0637xm.e = str4;
        }
        String str5 = c0312km.e;
        if (str5 != null) {
            c0637xm.r = str5;
        }
        c0637xm.i = this.b.fromModel(c0312km.m);
        String str6 = c0312km.k;
        if (str6 != null) {
            c0637xm.k = str6;
        }
        String str7 = c0312km.l;
        if (str7 != null) {
            c0637xm.l = str7;
        }
        c0637xm.m = c0312km.p;
        c0637xm.b = c0312km.n;
        c0637xm.q = c0312km.o;
        RetryPolicyConfig retryPolicyConfig = c0312km.t;
        c0637xm.w = retryPolicyConfig.maxIntervalSeconds;
        c0637xm.x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0312km.q;
        if (str8 != null) {
            c0637xm.n = str8;
        }
        Hm hm = c0312km.r;
        if (hm != null) {
            this.c.getClass();
            C0612wm c0612wm = new C0612wm();
            c0612wm.f1553a = hm.f879a;
            c0637xm.p = c0612wm;
        }
        c0637xm.u = c0312km.w;
        C0138e3 c0138e3 = c0312km.x;
        if (c0138e3 != null) {
            this.d.getClass();
            C0438pm c0438pm = new C0438pm();
            c0438pm.f1440a = c0138e3.f1229a;
            c0637xm.y = c0438pm;
        }
        C0368n2 c0368n2 = c0312km.y;
        if (c0368n2 != null) {
            c0637xm.z = this.e.fromModel(c0368n2);
        }
        c0637xm.A = this.g.fromModel(c0312km.z);
        c0637xm.B = this.h.fromModel(c0312km.A);
        c0637xm.C = this.i.fromModel(c0312km.B);
        return c0637xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0312km toModel(C0637xm c0637xm) {
        C0286jm c0286jm = new C0286jm(this.b.toModel(c0637xm.i));
        c0286jm.f1327a = c0637xm.f1570a;
        c0286jm.j = c0637xm.j;
        c0286jm.c = c0637xm.d;
        c0286jm.b = Arrays.asList(c0637xm.c);
        c0286jm.g = Arrays.asList(c0637xm.g);
        c0286jm.f = Arrays.asList(c0637xm.f);
        c0286jm.d = c0637xm.e;
        c0286jm.e = c0637xm.r;
        c0286jm.h = Arrays.asList(c0637xm.o);
        c0286jm.k = c0637xm.k;
        c0286jm.l = c0637xm.l;
        c0286jm.q = c0637xm.m;
        c0286jm.o = c0637xm.b;
        c0286jm.p = c0637xm.q;
        c0286jm.t = c0637xm.s;
        c0286jm.u = c0637xm.t;
        c0286jm.r = c0637xm.n;
        c0286jm.v = c0637xm.u;
        c0286jm.w = new RetryPolicyConfig(c0637xm.w, c0637xm.x);
        c0286jm.i = this.f.toModel(c0637xm.h);
        C0562um c0562um = c0637xm.v;
        if (c0562um != null) {
            this.f1294a.getClass();
            c0286jm.n = new C0654ye(c0562um.f1520a, c0562um.b);
        }
        C0612wm c0612wm = c0637xm.p;
        if (c0612wm != null) {
            this.c.getClass();
            c0286jm.s = new Hm(c0612wm.f1553a);
        }
        C0438pm c0438pm = c0637xm.y;
        if (c0438pm != null) {
            this.d.getClass();
            c0286jm.x = new C0138e3(c0438pm.f1440a);
        }
        C0413om c0413om = c0637xm.z;
        if (c0413om != null) {
            c0286jm.y = this.e.toModel(c0413om);
        }
        C0587vm c0587vm = c0637xm.A;
        if (c0587vm != null) {
            this.g.getClass();
            c0286jm.z = new Dm(c0587vm.f1540a);
        }
        c0286jm.A = this.h.toModel(c0637xm.B);
        C0487rm c0487rm = c0637xm.C;
        if (c0487rm != null) {
            this.i.getClass();
            c0286jm.B = new C9(c0487rm.f1472a);
        }
        return new C0312km(c0286jm);
    }
}
