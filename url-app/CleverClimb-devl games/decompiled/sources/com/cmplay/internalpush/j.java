package com.cmplay.internalpush;

import android.content.Context;
import com.cmplay.internalpush.i;

/* compiled from: InsertScreen.java */
/* loaded from: classes.dex */
public class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private int f4261a;

    /* renamed from: b, reason: collision with root package name */
    private i.a f4262b;

    /* compiled from: InsertScreen.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static j f4263a = new j();
    }

    public static j a() {
        return a.f4263a;
    }

    public void a(Context context, com.cmplay.internalpush.data.d dVar) {
        if (dVar == null) {
            return;
        }
        com.cmplay.internalpush.a.b.a(context, dVar, null);
        com.cmplay.internalpush.data.j.a(context).a(dVar.c(), 2);
        if (this.f4262b != null) {
            this.f4262b.a();
        }
        o.a().a(6, 2, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
    }

    public boolean b(Context context, com.cmplay.internalpush.data.d dVar) {
        if (this.f4262b != null) {
            this.f4262b.a();
        }
        o.a().a(6, 3, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
        return false;
    }

    public void c(Context context, com.cmplay.internalpush.data.d dVar) {
        if (this.f4262b != null) {
            this.f4262b.a();
        }
        o.a().a(6, 3, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
    }

    public int b() {
        return this.f4261a;
    }
}
