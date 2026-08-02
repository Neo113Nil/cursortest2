package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awv implements avx, atm {
    public static final String a = asq.b("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final auy b;
    public final Object c = new Object();
    axl d;
    final Map e;
    public final Map f;
    public final Map g;
    public awu h;
    public final ldt i;
    public final brn j;
    private final Context l;

    public awv(Context context) {
        this.l = context;
        auy i = auy.i(context);
        this.b = i;
        this.i = i.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.j = new brn(i.j);
        i.f.c(this);
    }

    @Override // defpackage.atm
    public final void a(axl axlVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            kwu kwuVar = ((axt) this.f.remove(axlVar)) != null ? (kwu) this.g.remove(axlVar) : null;
            if (kwuVar != null) {
                kwuVar.s(null);
            }
        }
        Map map = this.e;
        asg asgVar = (asg) map.remove(axlVar);
        if (axlVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (axl) entry.getKey();
                if (this.h != null) {
                    asg asgVar2 = (asg) entry.getValue();
                    awu awuVar = this.h;
                    int i = asgVar2.a;
                    awuVar.c(i, asgVar2.b, asgVar2.c);
                    this.h.a(i);
                }
            } else {
                this.d = null;
            }
        }
        awu awuVar2 = this.h;
        if (asgVar == null || awuVar2 == null) {
            return;
        }
        asq.a();
        int i2 = asgVar.a;
        Objects.toString(axlVar);
        int i3 = asgVar.b;
        awuVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.h == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        axl axlVar = new axl(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        asq.a();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        asg asgVar = new asg(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(axlVar, asgVar);
        asg asgVar2 = (asg) map.get(this.d);
        if (asgVar2 == null) {
            this.d = axlVar;
        } else {
            this.h.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((asg) ((Map.Entry) it.next()).getValue()).b;
                }
                asgVar = new asg(asgVar2.a, asgVar2.c, i);
            } else {
                asgVar = asgVar2;
            }
        }
        this.h.c(asgVar.a, asgVar.b, asgVar.c);
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((kwu) it.next()).s(null);
            }
        }
        this.b.f.d(this);
    }

    public final void d(int i, int i2) {
        asq.a();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((asg) entry.getValue()).b == i2) {
                this.b.m((axl) entry.getKey(), -128);
            }
        }
        awu awuVar = this.h;
        if (awuVar != null) {
            awuVar.d(i);
        }
    }

    @Override // defpackage.avx
    public final void e(axt axtVar, zy zyVar) {
        if (zyVar instanceof avu) {
            asq.a();
            this.b.m(abf.u(axtVar), ((avu) zyVar).a);
        }
    }
}
