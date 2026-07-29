package com.cmplay.internalpush.video;

import android.content.Context;
import com.cmplay.base.util.z;

/* compiled from: InnerPushAgent.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f4351a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4352b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4353c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4354d;
    private boolean e = false;
    private String f;

    public void a(boolean z) {
        if (!z) {
            this.e = true;
        }
        this.f4351a = 0;
        this.f4352b = false;
        this.f4354d = false;
        this.f4353c = false;
    }

    public int a() {
        return this.f4351a;
    }

    public void a(int i) {
        this.f4351a = i;
    }

    public boolean b() {
        return this.f4354d;
    }

    public void b(boolean z) {
        this.f4354d = z;
    }

    public void c(boolean z) {
        this.f4353c = z;
    }

    public String c() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public boolean d() {
        return this.f4352b && !this.f4354d;
    }

    public void a(boolean z, int i, boolean z2) {
        if (this.f4352b) {
            return;
        }
        this.f4352b = z;
    }

    public boolean e() {
        return this.e;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public void a(Context context, com.cmplay.internalpush.data.d dVar, z zVar) {
        com.cmplay.internalpush.a.b.a(context, dVar, zVar);
    }
}
