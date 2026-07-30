package com.crrepa.e;

import com.crrepa.f.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private List<Integer> f12412a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f12413a = new d();

        private b() {
        }
    }

    private d() {
        this.f12412a = new ArrayList();
    }

    public static d b() {
        return b.f12413a;
    }

    public List<Integer> a() {
        return this.f12412a;
    }

    public void c() {
        com.crrepa.p.c.d().a(new com.crrepa.p.a(0, o.a()));
    }

    public void a(byte b8) {
        com.crrepa.p.c.d().a(new com.crrepa.p.a(8, o.a(b8), true));
    }

    public void a(int i8) {
        this.f12412a.clear();
        a((byte) 0);
    }

    public void a(List<Integer> list) {
        this.f12412a.addAll(list);
        com.crrepa.g1.g.a().a(list);
    }
}
