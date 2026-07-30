package e0;

import a.AbstractC0169a;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import i.AbstractC0527n;
import i.AbstractC0528o;
import i.AbstractC0529p;
import i.LayoutInflaterFactory2C0500B;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u.C0930a;
import u.C0935f;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f4694e;

    public /* synthetic */ f(Context context, int i2) {
        this.f4693d = i2;
        this.f4694e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        E.f fVar;
        Object obj;
        Context context;
        switch (this.f4693d) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f(this.f4694e, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f4694e, 2));
                break;
            case 2:
                e.s(this.f4694e, new c(0), e.f4684a, false);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context2 = this.f4694e;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (!E.c.b()) {
                            fVar = AbstractC0529p.f5472i;
                            break;
                        } else {
                            C0935f c0935f = AbstractC0529p.f5476o;
                            c0935f.getClass();
                            C0930a c0930a = new C0930a(c0935f);
                            while (true) {
                                if (c0930a.hasNext()) {
                                    AbstractC0529p abstractC0529p = (AbstractC0529p) ((WeakReference) c0930a.next()).get();
                                    if (abstractC0529p != null && (context = ((LayoutInflaterFactory2C0500B) abstractC0529p).f5346s) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new E.f(new E.g(AbstractC0528o.a(obj)));
                                if (fVar.f654a.f655a.isEmpty()) {
                                    String z7 = AbstractC0169a.z(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC0528o.b(systemService, AbstractC0527n.a(z7));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = E.f.f653b;
                            if (fVar.f654a.f655a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0529p.f5475n = true;
                break;
        }
    }

    public /* synthetic */ f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4693d = 0;
        this.f4694e = context;
    }
}
