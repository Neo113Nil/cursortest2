package a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f118d;

    /* renamed from: e, reason: collision with root package name */
    private Context f119e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f117c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f116b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f115a = new m1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f116b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((BroadcastReceiver) arrayList.get(i7)).onReceive(context, intent);
        }
    }

    public final synchronized void b(Context context) {
        if (this.f117c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f119e = applicationContext;
        if (applicationContext == null) {
            this.f119e = context;
        }
        m10.c(this.f119e);
        this.f118d = ((Boolean) sw.c().b(m10.f8314u2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f119e.registerReceiver(this.f115a, intentFilter);
        this.f117c = true;
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f118d) {
            this.f116b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f118d) {
            this.f116b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
