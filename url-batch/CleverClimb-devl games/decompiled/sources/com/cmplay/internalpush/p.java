package com.cmplay.internalpush;

import android.content.Context;
import com.cmplay.internalpush.i;

/* compiled from: ResultPage.java */
/* loaded from: classes.dex */
public class p implements i {

    /* renamed from: a, reason: collision with root package name */
    private int f4274a;

    /* renamed from: b, reason: collision with root package name */
    private i.a f4275b;

    /* compiled from: ResultPage.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static p f4276a = new p();
    }

    public static p a() {
        return a.f4276a;
    }

    public boolean a(Context context, int i, boolean z) {
        o.a().a(2, 19, "", 0L, "", 0, 0, 0L);
        this.f4274a = i;
        boolean a2 = com.cmplay.internalpush.data.o.a(context).a(z, true);
        if (!a2) {
            com.cmplay.internalpush.data.o.a(context).d();
        }
        return a2;
    }

    public String a(Context context) {
        return com.cmplay.internalpush.data.o.a(context).b(true);
    }

    public void a(Context context, com.cmplay.internalpush.data.d dVar) {
        if (dVar == null) {
            return;
        }
        com.cmplay.base.util.h.a("internal_push", "ResultPage.onClickAd()  proId:" + dVar.c());
        com.cmplay.internalpush.a.b.a(context, dVar, null);
        com.cmplay.internalpush.data.o.a(context).a(dVar.c(), 2);
        if (this.f4275b != null) {
            this.f4275b.a();
        }
        o.a().a(2, 2, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
    }

    public int b() {
        return this.f4274a;
    }
}
