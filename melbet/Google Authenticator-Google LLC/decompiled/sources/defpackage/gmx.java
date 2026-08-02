package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmx extends agd implements aec {
    public final Map a = new qi(2);
    public boolean b = false;
    public aer c = null;
    private final Map d = new qi();
    private boolean e = false;

    private final void h(aer aerVar) {
        hoq.H(Looper.getMainLooper().getThread() == Thread.currentThread());
        Set set = (Set) this.a.remove(aerVar);
        hoq.I(set != null, "A LifecycleOwner was destroyed that was never observed, or was destroyed twice.");
        this.e = true;
        if (aerVar == this.c) {
            this.c = null;
        }
        Set keySet = this.d.keySet();
        keySet.getClass();
        set.getClass();
        hjk hjkVar = new hjk(keySet, set);
        hoq.K(hjkVar.isEmpty(), "This lifecycle didn't call getOrCreate() for the following IDs: %s Each value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", hjkVar);
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        h(aerVar);
        aerVar.L().c(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gmv, java.lang.Object] */
    @Override // defpackage.agd
    public final void c() {
        for (ikj ikjVar : this.d.values()) {
            ikjVar.b.a(ikjVar.a);
        }
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        h(aerVar);
        aerVar.L().c(this);
    }

    public final Object g(int i, aer aerVar, gmw gmwVar, gmv gmvVar) {
        hoq.H(Looper.getMainLooper().getThread() == Thread.currentThread());
        aek aekVar = aerVar.L().c;
        hoq.K(aekVar == aek.b, "Values may only be accessed during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call getOrCreate() for each and only each value that the first LifecycleOwner instance called getOrCreate() for, exactly once. The current lifecycle state is %s", aekVar);
        if (this.e) {
            Set set = (Set) this.a.get(aerVar);
            Integer valueOf = Integer.valueOf(i);
            hoq.J(set.add(valueOf), "A value for idRes %s has already been gotten. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
            Map map = this.d;
            hoq.J(map.containsKey(valueOf), "The first lifecycle didn't create a value for idRes %s. Is the LifecycleOwner accessing this value inside a conditional?", i);
            return ((ikj) map.get(valueOf)).a;
        }
        hoq.I(aerVar == this.c, "A second Lifecycle started before the first lifecycle either started or was destroyed. This breaks a boundary condition assumption in TikTok. Please report it as a bug and include reproduction steps and a stack trace.");
        Object a = gmwVar.a();
        Map map2 = this.d;
        Integer valueOf2 = Integer.valueOf(i);
        hoq.J(map2.put(valueOf2, new ikj(a, gmvVar)) == null, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        hoq.J(((Set) this.a.get(aerVar)).add(valueOf2), "A value was previously created for idRes %s. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
        return a;
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
