package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kf1 {
    public static final Object f = new Object();
    public static kf1 g;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final o5 e;

    public kf1(Context context) {
        this.a = context;
        this.e = new o5(this, context.getMainLooper());
    }

    public static kf1 a(Context context) {
        kf1 kf1Var;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new kf1(context.getApplicationContext());
                }
                kf1Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kf1Var;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                jf1 jf1Var = new jf1(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(jf1Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(jf1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList arrayList;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        jf1 jf1Var = (jf1) arrayList2.get(i);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + jf1Var.a);
                        }
                        if (jf1Var.c) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = jf1Var.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(jf1Var);
                                jf1Var.c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            ((jf1) arrayList3.get(i2)).c = false;
                        }
                        this.d.add(new t21(24, intent, arrayList3));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    jf1 jf1Var = (jf1) arrayList.get(size);
                    jf1Var.d = true;
                    for (int i = 0; i < jf1Var.a.countActions(); i++) {
                        String action = jf1Var.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                jf1 jf1Var2 = (jf1) arrayList2.get(size2);
                                if (jf1Var2.b == broadcastReceiver) {
                                    jf1Var2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
