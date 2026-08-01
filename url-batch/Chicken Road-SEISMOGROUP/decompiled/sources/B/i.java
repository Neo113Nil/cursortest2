package B;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import m.AbstractC0076l;
import m.RunnableC0072h;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36d;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f34b = i2;
        this.f35c = obj;
        this.f36d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        switch (this.f34b) {
            case 0:
                j jVar = (j) this.f35c;
                jVar.getClass();
                h hVar = (h) this.f36d;
                hVar.f33b.run();
                jVar.f42f = hVar;
                jVar.f41e.run();
                return;
            case 1:
                m mVar = (m) this.f36d;
                j jVar2 = (j) this.f35c;
                synchronized (mVar) {
                    HashSet hashSet = new HashSet((HashSet) mVar.f49e);
                    ((HashSet) mVar.f50f).remove(jVar2);
                    ((HashSet) mVar.f49e).add(jVar2);
                    h hVar2 = jVar2.f42f;
                    if (hVar2 == null || (kVar = hVar2.f32a) == null || !((g) kVar.f44c).j()) {
                        h hVar3 = jVar2.f42f;
                        if ((hVar3 != null ? hVar3.a() : null) != null) {
                            HashMap hashMap = (HashMap) mVar.f51g;
                            h hVar4 = jVar2.f42f;
                            hashMap.remove(hVar4 != null ? hVar4.a() : null);
                        }
                    }
                    mVar.f(jVar2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        mVar.f((j) it.next());
                    }
                }
                return;
            default:
                ((ProfileInstallerInitializer) this.f35c).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0076l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0072h((Context) this.f36d, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }

    public /* synthetic */ i(m mVar, j jVar) {
        this.f34b = 1;
        this.f36d = mVar;
        this.f35c = jVar;
    }
}
