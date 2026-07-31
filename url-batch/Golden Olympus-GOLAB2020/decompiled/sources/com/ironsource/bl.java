package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class bl {

    /* renamed from: i, reason: collision with root package name */
    private static final String f15616i = "WaterfallLifeCycleHolder";

    /* renamed from: d, reason: collision with root package name */
    private com.ironsource.mediationsdk.r f15620d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f15621e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15622f;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<com.ironsource.mediationsdk.r>> f15617a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private String f15618b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f15619c = "";

    /* renamed from: g, reason: collision with root package name */
    private final Timer f15623g = new Timer();

    /* renamed from: h, reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f15624h = new ConcurrentHashMap<>();

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15625a;

        a(String str) {
            this.f15625a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f15625a + " from memory");
                bl.this.f15617a.remove(this.f15625a);
                ironLog.verbose("waterfall size is currently " + bl.this.f15617a.size());
                ironLog.verbose("removing adInfo with id " + this.f15625a + " from memory");
                bl.this.f15624h.remove(this.f15625a);
                ironLog.verbose("adInfo size is currently " + bl.this.f15624h.size());
            } finally {
                cancel();
            }
        }
    }

    public bl(List<String> list, int i4) {
        this.f15621e = list;
        this.f15622f = i4;
    }

    private void b() {
        Iterator<com.ironsource.mediationsdk.r> it = c().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.r next = it.next();
            if (!next.equals(this.f15620d)) {
                next.q();
            }
        }
    }

    public AdInfo a(String str) {
        if (this.f15624h.containsKey(str)) {
            return this.f15624h.get(str);
        }
        return null;
    }

    public CopyOnWriteArrayList<com.ironsource.mediationsdk.r> c() {
        CopyOnWriteArrayList<com.ironsource.mediationsdk.r> copyOnWriteArrayList = this.f15617a.get(this.f15618b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f15618b;
    }

    public int e() {
        return this.f15617a.size();
    }

    public com.ironsource.mediationsdk.r f() {
        return this.f15620d;
    }

    public synchronized boolean g() {
        boolean z4;
        com.ironsource.mediationsdk.r rVar = this.f15620d;
        if (rVar != null) {
            z4 = rVar.u().equals(this.f15619c);
        }
        return z4;
    }

    public synchronized void a(com.ironsource.mediationsdk.r rVar) {
        try {
            IronLog.INTERNAL.verbose();
            com.ironsource.mediationsdk.r rVar2 = this.f15620d;
            if (rVar2 != null && !rVar2.equals(rVar)) {
                this.f15620d.q();
            }
            this.f15620d = rVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r5.f15621e.contains(r6.j()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r5.f15620d.j().equals(r6.j()) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean b(com.ironsource.mediationsdk.r rVar) {
        boolean z4;
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose();
            if (rVar != null && !rVar.o()) {
                z4 = false;
                if (this.f15620d != null) {
                    if (rVar.w() == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK) {
                        if (this.f15620d.c().equals(rVar.c())) {
                        }
                    }
                    if (rVar.w() != LoadWhileShowSupportState.NONE) {
                    }
                }
                if (z4 && rVar != null) {
                    ironLog.verbose(rVar.c() + " will not be added to the auction request");
                }
            }
            z4 = true;
            if (z4) {
                ironLog.verbose(rVar.c() + " will not be added to the auction request");
            }
        } finally {
        }
        return !z4;
    }

    public void a(String str, ImpressionData impressionData, bm bmVar) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f15624h.put(str, new AdInfo(impressionData, bmVar));
    }

    public void a(CopyOnWriteArrayList<com.ironsource.mediationsdk.r> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f15617a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f15619c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.f15619c + " is still showing - the current waterfall " + this.f15618b + " will be deleted instead");
                String str2 = this.f15618b;
                this.f15618b = this.f15619c;
                this.f15619c = str2;
            }
            this.f15623g.schedule(new a(this.f15619c), this.f15622f);
        }
        this.f15619c = this.f15618b;
        this.f15618b = str;
    }

    public boolean a() {
        return this.f15617a.size() > 5;
    }
}
