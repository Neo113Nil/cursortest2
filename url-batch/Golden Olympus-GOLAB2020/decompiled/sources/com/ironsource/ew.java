package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C1526o2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class ew<Smash extends q7<?>> {

    /* renamed from: d, reason: collision with root package name */
    q7<?> f16178d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f16179e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16180f;

    /* renamed from: h, reason: collision with root package name */
    fw f16182h;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f16175a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private String f16176b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f16177c = "";

    /* renamed from: g, reason: collision with root package name */
    private final Timer f16181g = new Timer();

    /* renamed from: i, reason: collision with root package name */
    private final int f16183i = 5;

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16184a;

        a(String str) {
            this.f16184a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f16184a + " from memory");
                ew.this.f16175a.remove(this.f16184a);
                ironLog.verbose("waterfall size is currently " + ew.this.f16175a.size());
            } finally {
                cancel();
            }
        }
    }

    public ew(List<String> list, int i4, fw fwVar) {
        this.f16179e = list;
        this.f16180f = i4;
        this.f16182h = fwVar;
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.f16178d)) {
                smash.M();
            }
        }
    }

    private synchronized boolean e() {
        boolean z4;
        q7<?> q7Var = this.f16178d;
        if (q7Var != null && q7Var.C()) {
            z4 = this.f16178d.h().equals(this.f16177c);
        }
        return z4;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f16175a.get(this.f16176b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public String c() {
        return this.f16176b;
    }

    public q7<?> d() {
        return this.f16178d;
    }

    public void a(C1526o2.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == C1526o2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == C1526o2.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f16175a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f16177c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.f16177c + " is still showing - the current waterfall " + this.f16176b + " will be deleted instead");
                    String str2 = this.f16176b;
                    this.f16176b = this.f16177c;
                    this.f16177c = str2;
                }
                this.f16181g.schedule(new a(this.f16177c), this.f16180f);
            }
        } else {
            this.f16175a.clear();
            this.f16175a.put(str, copyOnWriteArrayList);
        }
        this.f16177c = this.f16176b;
        this.f16176b = str;
        if (this.f16175a.size() > 5) {
            this.f16182h.a(this.f16175a.size());
        }
    }

    public synchronized void b(q7<?> q7Var) {
        IronLog.INTERNAL.verbose();
        this.f16178d = q7Var;
    }

    public synchronized void a(q7<?> q7Var) {
        IronLog.INTERNAL.verbose();
        q7<?> q7Var2 = this.f16178d;
        if (q7Var2 != null && !q7Var2.equals(q7Var)) {
            this.f16178d.M();
        }
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r0.f16179e.contains(r3) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r0.f16178d.n().equals(r3) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:8:0x004b, B:13:0x0008, B:15:0x000d, B:18:0x0014, B:20:0x0018, B:23:0x001f, B:25:0x0023, B:28:0x0030, B:30:0x0034, B:32:0x003c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(C1526o2.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit) {
        boolean z4;
        try {
            if (!a(adapterBaseInterface, ad_unit, str)) {
                z4 = true;
                if (aVar != C1526o2.a.AUTOMATIC_LOAD_WHILE_SHOW) {
                    if (aVar != C1526o2.a.MANUAL_WITH_LOAD_ON_SHOW) {
                        if (!z4) {
                            IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                        }
                    }
                }
                q7<?> q7Var = this.f16178d;
                if (q7Var != null) {
                    if (q7Var.C()) {
                        if (loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK) {
                            if (this.f16178d.c().equals(str)) {
                            }
                        }
                        if (loadWhileShowSupportState != LoadWhileShowSupportState.NONE) {
                        }
                    }
                }
                if (!z4) {
                }
            }
            z4 = false;
            if (!z4) {
            }
        } finally {
        }
        return z4;
    }
}
