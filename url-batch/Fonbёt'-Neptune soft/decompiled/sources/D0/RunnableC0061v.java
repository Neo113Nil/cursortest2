package D0;

import A.C0002c;
import I.C0079n;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import h0.C0197e;
import h0.C0198f;
import h0.C0199g;
import h0.C0201i;
import j.C0243t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import w0.InterfaceC0320f;

/* renamed from: D0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0061v implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f413g;

    public /* synthetic */ RunnableC0061v(int i2, Object obj, Object obj2) {
        this.f411e = i2;
        this.f412f = obj;
        this.f413g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.m mVar;
        int i2 = 0;
        switch (this.f411e) {
            case 0:
                C0056p c0056p = new C0056p(0);
                C0062w c0062w = (C0062w) this.f412f;
                C0050j c0050j = c0062w.f415b;
                String str = (String) this.f413g;
                Q0.h.e(str, "messageArg");
                O o2 = c0050j.f366a;
                o2.getClass();
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", o2.a(), r1).h(G0.e.O(c0062w, str), new C0002c(17, c0056p));
                return;
            case 1:
                ((ProfileInstallerInitializer) this.f412f).getClass();
                (Build.VERSION.SDK_INT >= 28 ? N.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new N.g((Context) this.f413g, i2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                C0199g c0199g = (C0199g) this.f412f;
                c0199g.getClass();
                C0198f c0198f = (C0198f) this.f413g;
                c0198f.f2304b.run();
                c0199g.f2310f = c0198f;
                c0199g.f2309e.run();
                return;
            case 3:
                C0201i c0201i = (C0201i) this.f412f;
                C0199g c0199g2 = (C0199g) this.f413g;
                synchronized (c0201i) {
                    HashSet hashSet = new HashSet((HashSet) c0201i.f2315e);
                    ((HashSet) c0201i.f2316f).remove(c0199g2);
                    ((HashSet) c0201i.f2315e).add(c0199g2);
                    C0198f c0198f2 = c0199g2.f2310f;
                    if (c0198f2 == null || (mVar = c0198f2.f2303a) == null || !((C0197e) mVar.f78f).j()) {
                        C0198f c0198f3 = c0199g2.f2310f;
                        if ((c0198f3 != null ? c0198f3.a() : null) != null) {
                            HashMap hashMap = (HashMap) c0201i.f2317g;
                            C0198f c0198f4 = c0199g2.f2310f;
                            hashMap.remove(c0198f4 != null ? c0198f4.a() : null);
                        }
                    }
                    c0201i.d(c0199g2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        c0201i.d((C0199g) it.next());
                    }
                }
                return;
            default:
                ((C0243t) this.f412f).b((Typeface) this.f413g);
                return;
        }
    }
}
