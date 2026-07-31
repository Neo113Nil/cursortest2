package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class db {
    public static final Object f;
    public static db g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f214a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final ab e;

    static {
        int i = m0.f327a;
        "startapp.".concat("db");
        f = new Object();
    }

    public db(Context context) {
        this.f214a = context;
        this.e = new ab(this, context.getMainLooper());
    }

    public static db a(Context context) {
        db dbVar;
        synchronized (f) {
            if (g == null) {
                Context a2 = t0.a(context);
                if (a2 != null) {
                    context = a2;
                }
                g = new db(context);
            }
            dbVar = g;
        }
        return dbVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            cb cbVar = new cb(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.c.put(action, arrayList2);
                }
                arrayList2.add(cbVar);
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.c.get(action);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (i3 < arrayList2.size()) {
                            if (((cb) arrayList2.get(i3)).b == broadcastReceiver) {
                                arrayList2.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                        if (arrayList2.size() <= 0) {
                            this.c.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void a(Intent intent) {
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f214a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList arrayList = (ArrayList) this.c.get(intent.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    cb cbVar = (cb) arrayList.get(i);
                    if (!cbVar.c && cbVar.f199a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(cbVar);
                        cbVar.c = true;
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((cb) arrayList2.get(i2)).c = false;
                    }
                    this.d.add(new bb(intent, arrayList2));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
