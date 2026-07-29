package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

/* compiled from: AppCall.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f6046a;

    /* renamed from: b, reason: collision with root package name */
    private UUID f6047b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f6048c;

    /* renamed from: d, reason: collision with root package name */
    private int f6049d;

    public static a a() {
        return f6046a;
    }

    public static synchronized a a(UUID uuid, int i) {
        synchronized (a.class) {
            a a2 = a();
            if (a2 != null && a2.c().equals(uuid) && a2.d() == i) {
                a((a) null);
                return a2;
            }
            return null;
        }
    }

    private static synchronized boolean a(a aVar) {
        boolean z;
        synchronized (a.class) {
            a a2 = a();
            f6046a = aVar;
            z = a2 != null;
        }
        return z;
    }

    public a(int i) {
        this(i, UUID.randomUUID());
    }

    public a(int i, UUID uuid) {
        this.f6047b = uuid;
        this.f6049d = i;
    }

    public Intent b() {
        return this.f6048c;
    }

    public UUID c() {
        return this.f6047b;
    }

    public int d() {
        return this.f6049d;
    }

    public void a(Intent intent) {
        this.f6048c = intent;
    }

    public boolean e() {
        return a(this);
    }
}
