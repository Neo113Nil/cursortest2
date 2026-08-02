package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class wb {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f7835f;

    /* renamed from: g, reason: collision with root package name */
    public static wb f7836g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7837a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7838b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7839c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7840d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final tb f7841e;

    static {
        int i4 = p0.f7428a;
        "startapp.".concat("wb");
        f7835f = new Object();
    }

    public wb(Context context) {
        this.f7837a = context;
        this.f7841e = new tb(this, context.getMainLooper());
    }

    public static wb a(Context context) {
        wb wbVar;
        synchronized (f7835f) {
            try {
                if (f7836g == null) {
                    Context a3 = w0.a(context);
                    if (a3 != null) {
                        context = a3;
                    }
                    f7836g = new wb(context);
                }
                wbVar = f7836g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wbVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f7838b) {
            try {
                vb vbVar = new vb(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f7838b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f7838b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList arrayList2 = (ArrayList) this.f7839c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f7839c.put(action, arrayList2);
                    }
                    arrayList2.add(vbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f7838b) {
            try {
                ArrayList arrayList = (ArrayList) this.f7838b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i4);
                    for (int i5 = 0; i5 < intentFilter.countActions(); i5++) {
                        String action = intentFilter.getAction(i5);
                        ArrayList arrayList2 = (ArrayList) this.f7839c.get(action);
                        if (arrayList2 != null) {
                            int i6 = 0;
                            while (i6 < arrayList2.size()) {
                                if (((vb) arrayList2.get(i6)).f7751b == broadcastReceiver) {
                                    arrayList2.remove(i6);
                                    i6--;
                                }
                                i6++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f7839c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Intent intent) {
        synchronized (this.f7838b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7837a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                ArrayList arrayList = (ArrayList) this.f7839c.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        vb vbVar = (vb) arrayList.get(i4);
                        if (!vbVar.f7752c && vbVar.f7750a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(vbVar);
                            vbVar.f7752c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            ((vb) arrayList2.get(i5)).f7752c = false;
                        }
                        this.f7840d.add(new ub(intent, arrayList2));
                        if (!this.f7841e.hasMessages(1)) {
                            this.f7841e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
