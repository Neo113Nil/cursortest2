package com.tapjoy.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class de {

    @SuppressLint({"StaticFieldLeak"})
    private static de f = new de();

    /* renamed from: a, reason: collision with root package name */
    public Context f7931a;

    /* renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f7932b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7933c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7934d;
    public a e;

    public interface a {
        void a(boolean z);
    }

    private de() {
    }

    public static de a() {
        return f;
    }

    public final boolean b() {
        return !this.f7934d;
    }

    public final void c() {
        boolean z = !this.f7934d;
        Iterator it = Collections.unmodifiableCollection(dd.a().f7929a).iterator();
        while (it.hasNext()) {
            dt dtVar = ((cz) it.next()).f7917c;
            if (dtVar.f7954a.get() != null) {
                dg.a().a(dtVar.c(), "setState", z ? "foregrounded" : "backgrounded");
            }
        }
    }

    static /* synthetic */ void a(de deVar, boolean z) {
        if (deVar.f7934d != z) {
            deVar.f7934d = z;
            if (deVar.f7933c) {
                deVar.c();
                if (deVar.e != null) {
                    deVar.e.a(deVar.b());
                }
            }
        }
    }
}
