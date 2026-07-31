package c0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f13332f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static C1376a f13333g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13334a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f13335b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f13336c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f13337d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f13338e;

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    class HandlerC0128a extends Handler {
        HandlerC0128a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C1376a.this.a();
            }
        }
    }

    /* renamed from: c0.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f13340a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f13341b;

        b(Intent intent, ArrayList arrayList) {
            this.f13340a = intent;
            this.f13341b = arrayList;
        }
    }

    /* renamed from: c0.a$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f13342a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f13343b;

        /* renamed from: c, reason: collision with root package name */
        boolean f13344c;

        /* renamed from: d, reason: collision with root package name */
        boolean f13345d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f13342a = intentFilter;
            this.f13343b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
            sb.append("Receiver{");
            sb.append(this.f13343b);
            sb.append(" filter=");
            sb.append(this.f13342a);
            if (this.f13345d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C1376a(Context context) {
        this.f13334a = context;
        this.f13338e = new HandlerC0128a(context.getMainLooper());
    }

    public static C1376a b(Context context) {
        C1376a c1376a;
        synchronized (f13332f) {
            try {
                if (f13333g == null) {
                    f13333g = new C1376a(context.getApplicationContext());
                }
                c1376a = f13333g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1376a;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f13335b) {
                try {
                    size = this.f13337d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f13337d.toArray(bVarArr);
                    this.f13337d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = bVarArr[i4];
                int size2 = bVar.f13341b.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    c cVar = (c) bVar.f13341b.get(i5);
                    if (!cVar.f13345d) {
                        cVar.f13343b.onReceive(this.f13334a, bVar.f13340a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f13335b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f13335b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f13335b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList arrayList2 = (ArrayList) this.f13336c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f13336c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        synchronized (this.f13335b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f13334a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z4 = (intent.getFlags() & 8) != 0;
                if (z4) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f13336c.get(intent.getAction());
                if (arrayList != null) {
                    if (z4) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        c cVar = (c) arrayList.get(i4);
                        if (z4) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f13342a);
                        }
                        if (cVar.f13344c) {
                            if (z4) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = cVar.f13342a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z4) {
                                    StringBuilder sb = new StringBuilder();
                                    str = action;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f13344c = true;
                            } else {
                                str = action;
                                if (z4) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i4++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            ((c) arrayList2.get(i5)).f13344c = false;
                        }
                        this.f13337d.add(new b(intent, arrayList2));
                        if (!this.f13338e.hasMessages(1)) {
                            this.f13338e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f13335b) {
            try {
                ArrayList arrayList = (ArrayList) this.f13335b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f13345d = true;
                    for (int i4 = 0; i4 < cVar.f13342a.countActions(); i4++) {
                        String action = cVar.f13342a.getAction(i4);
                        ArrayList arrayList2 = (ArrayList) this.f13336c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f13343b == broadcastReceiver) {
                                    cVar2.f13345d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f13336c.remove(action);
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
