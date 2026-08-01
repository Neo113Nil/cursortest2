package com.pgl.ssdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: SDKBatteryCollector.java */
/* loaded from: classes3.dex */
public class C {
    private static C c;
    private Context a;
    private List<Integer> b = new ArrayList();

    private C(Context context) {
        this.a = null;
        this.a = context;
    }

    public static C a(Context context) {
        if (c == null) {
            synchronized (C.class) {
                if (c == null) {
                    c = new C(context);
                }
            }
        }
        return c;
    }

    public synchronized String b() {
        if (this.b.size() <= 0) {
            return "-1";
        }
        return String.valueOf(this.b.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String c() {
        return new JSONArray((Collection) this.b).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r1 = (r1 * 10000) + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        int i;
        int i2 = 0;
        try {
            synchronized (this) {
                try {
                    Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    i = registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0);
                    try {
                        if (this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                            i2 = Math.round(((r2.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0) / r2.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            }
            try {
                throw th;
            } catch (Exception unused) {
                int i3 = (i * 10000) + 0;
                if (i3 == -1) {
                    return;
                }
                this.b.add(Integer.valueOf(i3));
                try {
                    int size = this.b.size();
                    if (size > 20) {
                        ArrayList arrayList = new ArrayList(this.b.subList(size - 10, size));
                        this.b.clear();
                        this.b = arrayList;
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Exception unused3) {
            i = 0;
        }
    }
}
