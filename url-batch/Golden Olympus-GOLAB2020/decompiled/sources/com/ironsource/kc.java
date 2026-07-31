package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class kc {

    /* renamed from: e, reason: collision with root package name */
    private static final String f16923e = "EventsTracker";

    /* renamed from: a, reason: collision with root package name */
    private df f16924a;

    /* renamed from: b, reason: collision with root package name */
    private ec f16925b;

    /* renamed from: c, reason: collision with root package name */
    private wf f16926c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f16927d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16928a;

        a(String str) {
            this.f16928a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                gq gqVar = new gq();
                ArrayList<Pair<String, String>> d4 = kc.this.f16925b.d();
                if (jn.f16865b.equals(kc.this.f16925b.e())) {
                    gqVar = sg.b(kc.this.f16925b.b(), this.f16928a, d4);
                } else if (jn.f16864a.equals(kc.this.f16925b.e())) {
                    gqVar = sg.a(kc.this.f16925b.b(), this.f16928a, d4);
                }
                kc.this.a("response status code: " + gqVar.f16542a);
            } catch (Exception e4) {
                o9.d().a(e4);
            }
        }
    }

    public kc(ec ecVar, df dfVar) {
        if (ecVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (ecVar.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f16925b = ecVar;
        this.f16924a = dfVar;
        this.f16926c = ecVar.c();
        this.f16927d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.f16927d.submit(new a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f16925b.f()) {
            Log.d(f16923e, str);
        }
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f16925b.a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            a(hashMap, this.f16924a.a());
            a(hashMap, map);
            b(this.f16926c.a(hashMap));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }
}
