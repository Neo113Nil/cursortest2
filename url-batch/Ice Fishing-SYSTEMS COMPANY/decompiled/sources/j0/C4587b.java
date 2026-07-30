package j0;

import S0.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.RP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4587b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f38472f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C4587b f38473g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38474a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38475b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f38476c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f38477d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final RP f38478e;

    public C4587b(Context context) {
        this.f38474a = context;
        this.f38478e = new RP(this, context.getMainLooper());
    }

    public static C4587b a(Context context) {
        C4587b c4587b;
        synchronized (f38472f) {
            try {
                if (f38473g == null) {
                    f38473g = new C4587b(context.getApplicationContext());
                }
                c4587b = f38473g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4587b;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f38475b) {
            try {
                C4586a c4586a = new C4586a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f38475b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f38475b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c4586a);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f38476c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f38476c.put(action, arrayList2);
                    }
                    arrayList2.add(c4586a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList arrayList;
        synchronized (this.f38475b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f38474a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z8 = (intent.getFlags() & 8) != 0;
                if (z8) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f38476c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z8) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        C4586a c4586a = (C4586a) arrayList2.get(i);
                        if (z8) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c4586a.f38468a);
                        }
                        if (c4586a.f38470c) {
                            if (z8) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = c4586a.f38468a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z8) {
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
                                arrayList3.add(c4586a);
                                c4586a.f38470c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z8) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : NativeAdvancedJsUtils.f18064p : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            ((C4586a) arrayList3.get(i4)).f38470c = false;
                        }
                        this.f38477d.add(new e(13, intent, arrayList3));
                        if (!this.f38478e.hasMessages(1)) {
                            this.f38478e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f38475b) {
            try {
                ArrayList arrayList = (ArrayList) this.f38475b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C4586a c4586a = (C4586a) arrayList.get(size);
                    c4586a.f38471d = true;
                    for (int i = 0; i < c4586a.f38468a.countActions(); i++) {
                        String action = c4586a.f38468a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f38476c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C4586a c4586a2 = (C4586a) arrayList2.get(size2);
                                if (c4586a2.f38469b == broadcastReceiver) {
                                    c4586a2.f38471d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f38476c.remove(action);
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
