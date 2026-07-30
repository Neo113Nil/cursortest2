package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import com.appsflyer.attribution.RequestError;
import com.feathherdashh.dashgame.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class c51 implements tw, h61, c00, ir1, OnCompleteListener, en {
    public final /* synthetic */ int d;
    public final Object e;
    public Object g;

    public c51(int i) {
        this.d = i;
        switch (i) {
            case 9:
                this.e = new eo0(new Reference[16]);
                this.g = new ReferenceQueue();
                break;
            case 15:
                this.e = Collections.synchronizedMap(new WeakHashMap());
                this.g = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 16:
                c50 c50Var = c50.d;
                this.e = new SparseIntArray();
                this.g = c50Var;
                break;
            default:
                this.e = new sc1(2);
                this.g = new lj0(16);
                break;
        }
    }

    @Override // defpackage.kr1
    public Object a() {
        return new hr1(((o5) this.e).d, (ur1) ((gr1) this.g).a(), new me1(7));
    }

    @Override // defpackage.h61
    public Object b(Object obj) {
        return ((Function1) this.g).invoke(obj);
    }

    @Override // defpackage.h61
    public Object c(o51 o51Var, Object obj) {
        return ((Function2) this.e).b(o51Var, obj);
    }

    public Bundle d(String str) {
        d61 d61Var = (d61) this.e;
        if (!d61Var.g) {
            dd0.j("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = d61Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle s = bundle.containsKey(str) ? ka0.s(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            d61Var.f = null;
        }
        return s;
    }

    public c61 e() {
        c61 c61Var;
        d61 d61Var = (d61) this.e;
        synchronized (d61Var.c) {
            Iterator it = d61Var.d.entrySet().iterator();
            do {
                c61Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                c61 c61Var2 = (c61) entry.getValue();
                if (Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    c61Var = c61Var2;
                }
            } while (c61Var == null);
        }
        return c61Var;
    }

    @Override // defpackage.c00
    public Object f(d00 d00Var, dn dnVar) {
        Object f = ((c00) this.e).f(new m8(d00Var, (nd1) this.g), dnVar);
        return f == tn.d ? f : Unit.a;
    }

    public String g(String str) {
        String str2 = (String) this.g;
        Resources resources = (Resources) this.e;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // defpackage.o01
    public Object get() {
        me1 me1Var = new me1(5);
        me1 me1Var2 = new me1(3);
        Object obj = ((o01) this.e).get();
        o01 o01Var = (o01) this.g;
        return new b51(me1Var, me1Var2, lb.f, (w61) obj, o01Var);
    }

    public void h(Bundle bundle) {
        d61 d61Var = (d61) this.e;
        e61 e61Var = d61Var.a;
        if (!d61Var.e) {
            d61Var.a();
        }
        if (e61Var.f().c.compareTo(og0.h) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e61Var.f().c).toString());
        }
        if (d61Var.g) {
            dd0.j("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = ka0.s(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        d61Var.f = bundle2;
        d61Var.g = true;
    }

    public void j(Bundle bundle) {
        d61 d61Var = (d61) this.e;
        ov.d.getClass();
        Bundle D = yr1.D((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = d61Var.f;
        if (bundle2 != null) {
            D.putAll(bundle2);
        }
        synchronized (d61Var.c) {
            for (Map.Entry entry : d61Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((c61) entry.getValue()).a();
                str.getClass();
                D.putBundle(str, a);
            }
        }
        if (D.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", D);
    }

    public void k(String str, c61 c61Var) {
        c61Var.getClass();
        d61 d61Var = (d61) this.e;
        synchronized (d61Var.c) {
            if (d61Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            d61Var.d.put(str, c61Var);
        }
    }

    public void l() {
        if (!((d61) this.e).h) {
            dd0.j("Can not perform this action after onSaveInstanceState");
            return;
        }
        q11 q11Var = (q11) this.g;
        if (q11Var == null) {
            q11Var = new q11(this);
        }
        this.g = q11Var;
        try {
            gg0.class.getDeclaredConstructor(null);
            q11 q11Var2 = (q11) this.g;
            if (q11Var2 != null) {
                q11Var2.a.add(gg0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + gg0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void m(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.e)) {
            hashMap = new HashMap((Map) this.e);
        }
        synchronized (((Map) this.g)) {
            hashMap2 = new HashMap((Map) this.g);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                af.c();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((ng1) entry2.getKey()).b(new g8(status));
            }
        }
    }

    @Override // defpackage.en
    public Object n(Task task) {
        t41 t41Var = (t41) this.e;
        Bundle bundle = (Bundle) this.g;
        t41Var.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : t41Var.a(bundle).k(du1.g, j50.E);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.d) {
            case 13:
                br1 br1Var = (br1) this.e;
                ng1 ng1Var = (ng1) this.g;
                synchronized (br1Var.f) {
                    br1Var.e.remove(ng1Var);
                }
                return;
            default:
                ((Map) ((c51) this.g).g).remove((ng1) this.e);
                return;
        }
    }

    public String toString() {
        switch (this.d) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return "Bounds{lower=" + ((c90) this.e) + " upper=" + ((c90) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public c51(c51 c51Var, ng1 ng1Var) {
        this.d = 14;
        this.g = c51Var;
        this.e = ng1Var;
    }

    public /* synthetic */ c51(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    public c51(Context context) {
        this.d = 6;
        y90.i(context);
        Resources resources = context.getResources();
        this.e = resources;
        this.g = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public c51(IBinder iBinder) {
        this.d = 17;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.e = new Messenger(iBinder);
            this.g = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.g = new wt1(iBinder);
            this.e = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public c51(d61 d61Var, int i) {
        this.d = i;
        switch (i) {
            case 2:
                this.e = d61Var;
                this.g = new c51(d61Var, 1);
                break;
            default:
                this.e = d61Var;
                break;
        }
    }

    public c51(o5 o5Var, gr1 gr1Var, tc1 tc1Var) {
        this.d = 12;
        this.e = o5Var;
        this.g = gr1Var;
    }

    public c51(WindowInsetsAnimation.Bounds bounds) {
        this.d = 10;
        this.e = c90.b(bounds.getLowerBound());
        this.g = c90.b(bounds.getUpperBound());
    }

    public c51(Window window) {
        this.d = 11;
        this.e = window.getInsetsController();
        this.g = window;
    }
}
