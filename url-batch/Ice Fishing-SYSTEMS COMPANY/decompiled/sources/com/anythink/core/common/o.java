package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final String f16088b = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16089c = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16090d = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16091e = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16092f = "code";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16093g = "packageName";

    /* renamed from: j, reason: collision with root package name */
    private static volatile String f16094j;

    /* renamed from: n, reason: collision with root package name */
    private static volatile o f16095n;

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f16096a;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<com.anythink.core.common.h.w> f16097h = new CopyOnWriteArrayList<>();
    private final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private volatile Boolean f16098k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.h.w f16099l;

    /* renamed from: m, reason: collision with root package name */
    private Context f16100m;

    /* renamed from: com.anythink.core.common.o$1, reason: invalid class name */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        private com.anythink.core.common.h.w a(String str) {
            if (o.this.f16099l != null && TextUtils.equals(o.this.f16099l.I(), str)) {
                return o.this.f16099l;
            }
            if (o.this.f16097h == null || o.this.f16097h.size() <= 0) {
                return null;
            }
            Iterator it = o.this.f16097h.iterator();
            while (it.hasNext()) {
                com.anythink.core.common.h.w wVar = (com.anythink.core.common.h.w) it.next();
                if (wVar != null && TextUtils.equals(wVar.I(), str)) {
                    return wVar;
                }
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            com.anythink.core.common.h.w wVar;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(com.anythink.core.common.v.k.b(o.f16088b)) || action.equals(com.anythink.core.common.v.k.b(o.f16089c)) || !action.equals(com.anythink.core.common.v.k.b(o.f16090d)) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("code", -1);
            String string = extras.getString(o.f16093g, "");
            if (i == -1 || TextUtils.isEmpty(string)) {
                return;
            }
            if (o.this.f16099l == null || !TextUtils.equals(o.this.f16099l.I(), string)) {
                if (o.this.f16097h != null && o.this.f16097h.size() > 0) {
                    Iterator it = o.this.f16097h.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.h.w wVar2 = (com.anythink.core.common.h.w) it.next();
                        if (wVar2 != null && TextUtils.equals(wVar2.I(), string)) {
                            wVar = wVar2;
                            break;
                        }
                    }
                }
                wVar = null;
            } else {
                wVar = o.this.f16099l;
            }
            if (wVar == null) {
                return;
            }
            if (i == 4) {
                o.this.b(wVar);
            }
            com.anythink.core.common.u.e.a(wVar.q(), wVar.v(), "", i, "", 0L, 0L, wVar.ap(), wVar.aq());
        }
    }

    private o() {
    }

    private com.anythink.core.common.h.w d() {
        return this.f16099l;
    }

    private void e() {
        if (this.f16098k == null || !this.f16098k.booleanValue() || this.f16100m == null) {
            return;
        }
        try {
            this.f16096a = new AnonymousClass1();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.anythink.core.common.v.k.b(f16088b));
            intentFilter.addAction(com.anythink.core.common.v.k.b(f16089c));
            intentFilter.addAction(com.anythink.core.common.v.k.b(f16090d));
            this.f16100m.registerReceiver(this.f16096a, intentFilter);
        } catch (Throwable unused) {
        }
    }

    private static Boolean f() {
        Cursor cursor;
        Context g9 = com.anythink.core.common.d.t.b().g();
        Boolean bool = null;
        if (g9 != null && g9.getContentResolver() != null) {
            try {
                cursor = g9.getContentResolver().query(Uri.parse(com.anythink.core.common.v.k.b(f16091e)), null, null, null, null);
            } catch (Throwable unused) {
                cursor = null;
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                            bool = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        f16094j = cursor.getString(cursor.getColumnIndex("detailStyle"));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    cursor.close();
                } catch (Throwable unused4) {
                }
            }
        }
        return bool;
    }

    public final int c() {
        if (this.f16098k != null) {
            return this.f16098k.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static o a() {
        if (f16095n == null) {
            synchronized (o.class) {
                try {
                    if (f16095n == null) {
                        f16095n = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16095n;
    }

    public final void b(com.anythink.core.common.h.w wVar) {
        if (this.f16098k == null || wVar == null || !this.f16098k.booleanValue()) {
            return;
        }
        this.f16099l = null;
        try {
            this.f16097h.remove(wVar);
        } catch (Exception unused) {
        }
    }

    private void b(Context context) {
        BroadcastReceiver broadcastReceiver = this.f16096a;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.f16099l = null;
        this.f16097h.clear();
        this.f16097h = null;
        this.f16096a = null;
        this.f16100m = null;
    }

    public final void a(com.anythink.core.common.h.w wVar) {
        if (this.f16098k == null || wVar == null || !this.f16098k.booleanValue()) {
            return;
        }
        this.f16099l = wVar;
        this.f16097h.add(wVar);
    }

    public final void a(Context context) {
        this.f16100m = context;
        if (this.i.compareAndSet(false, true)) {
            try {
                this.f16098k = f();
                if (this.f16098k == null || !this.f16098k.booleanValue() || this.f16100m == null) {
                    return;
                }
                this.f16096a = new AnonymousClass1();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.anythink.core.common.v.k.b(f16088b));
                intentFilter.addAction(com.anythink.core.common.v.k.b(f16089c));
                intentFilter.addAction(com.anythink.core.common.v.k.b(f16090d));
                this.f16100m.registerReceiver(this.f16096a, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    public static String b() {
        try {
            if (f16094j == null) {
                return "";
            }
            return "[" + f16094j + "]";
        } catch (Throwable unused) {
            return "";
        }
    }
}
