package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import v.c1;
import v.e1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements e1 {

    /* renamed from: s, reason: collision with root package name */
    public static v f3174s;

    /* renamed from: d, reason: collision with root package name */
    public Object f3175d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3176e;

    /* renamed from: i, reason: collision with root package name */
    public Object f3177i;

    /* renamed from: r, reason: collision with root package name */
    public Object f3178r;

    public v(pe.a aVar) {
        this.f3177i = "";
        this.f3178r = "";
        this.f3176e = aVar;
        this.f3175d = aVar.d().a();
    }

    public static synchronized v c() {
        v vVar;
        synchronized (v.class) {
            try {
                if (f3174s == null) {
                    v vVar2 = new v();
                    vVar2.f3175d = null;
                    vVar2.f3176e = null;
                    vVar2.f3177i = null;
                    vVar2.f3178r = new ArrayDeque();
                    f3174s = vVar2;
                }
                vVar = f3174s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public void b(String str, String str2) {
        this.f3178r = ((String) this.f3178r) + (((String) this.f3178r).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public boolean d(Context context) {
        if (((Boolean) this.f3177i) == null) {
            this.f3177i = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f3176e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f3177i).booleanValue();
    }

    public boolean e(Context context) {
        if (((Boolean) this.f3176e) == null) {
            this.f3176e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f3176e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f3176e).booleanValue();
    }

    @Override // v.b1
    public v.l i(long j, v.l lVar, v.l lVar2, v.l lVar3) {
        if (((v.l) this.f3176e) == null) {
            this.f3176e = lVar.c();
        }
        v.l lVar4 = (v.l) this.f3176e;
        if (lVar4 == null) {
            Intrinsics.f("valueVector");
            throw null;
        }
        int b10 = lVar4.b();
        int i3 = 0;
        while (true) {
            v.l lVar5 = (v.l) this.f3176e;
            if (i3 >= b10) {
                if (lVar5 != null) {
                    return lVar5;
                }
                Intrinsics.f("valueVector");
                throw null;
            }
            if (lVar5 == null) {
                Intrinsics.f("valueVector");
                throw null;
            }
            lVar5.e(i3, ((c1) this.f3175d).d(i3).b(j, lVar.a(i3), lVar2.a(i3), lVar3.a(i3)));
            i3++;
        }
    }

    @Override // v.b1
    public long j(v.l lVar, v.l lVar2, v.l lVar3) {
        int b10 = lVar.b();
        long j = 0;
        for (int i3 = 0; i3 < b10; i3++) {
            j = Math.max(j, ((c1) this.f3175d).d(i3).d(lVar.a(i3), lVar2.a(i3), lVar3.a(i3)));
        }
        return j;
    }

    @Override // v.b1
    public v.l k(v.l lVar, v.l lVar2, v.l lVar3) {
        if (((v.l) this.f3178r) == null) {
            this.f3178r = lVar3.c();
        }
        v.l lVar4 = (v.l) this.f3178r;
        if (lVar4 == null) {
            Intrinsics.f("endVelocityVector");
            throw null;
        }
        int b10 = lVar4.b();
        int i3 = 0;
        while (true) {
            v.l lVar5 = (v.l) this.f3178r;
            if (i3 >= b10) {
                if (lVar5 != null) {
                    return lVar5;
                }
                Intrinsics.f("endVelocityVector");
                throw null;
            }
            if (lVar5 == null) {
                Intrinsics.f("endVelocityVector");
                throw null;
            }
            lVar5.e(i3, ((c1) this.f3175d).d(i3).e(lVar.a(i3), lVar2.a(i3), lVar3.a(i3)));
            i3++;
        }
    }

    @Override // v.b1
    public v.l n(long j, v.l lVar, v.l lVar2, v.l lVar3) {
        if (((v.l) this.f3177i) == null) {
            this.f3177i = lVar3.c();
        }
        v.l lVar4 = (v.l) this.f3177i;
        if (lVar4 == null) {
            Intrinsics.f("velocityVector");
            throw null;
        }
        int b10 = lVar4.b();
        int i3 = 0;
        while (true) {
            v.l lVar5 = (v.l) this.f3177i;
            if (i3 >= b10) {
                if (lVar5 != null) {
                    return lVar5;
                }
                Intrinsics.f("velocityVector");
                throw null;
            }
            if (lVar5 == null) {
                Intrinsics.f("velocityVector");
                throw null;
            }
            lVar5.e(i3, ((c1) this.f3175d).d(i3).c(j, lVar.a(i3), lVar2.a(i3), lVar3.a(i3)));
            i3++;
        }
    }

    public v(u8.d dVar, lf.a aVar, wd.h hVar, gf.a aVar2) {
        dVar.getClass();
        aVar.getClass();
        this.f3175d = dVar;
        this.f3176e = aVar;
        this.f3177i = hVar;
        this.f3178r = aVar2;
        mf.a.a(hVar);
    }

    public v(c1 c1Var) {
        this.f3175d = c1Var;
    }

    public v(v.q qVar) {
        this(new c1(2, qVar));
    }
}
