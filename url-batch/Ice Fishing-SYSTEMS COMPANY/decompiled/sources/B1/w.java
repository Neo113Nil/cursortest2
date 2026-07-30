package B1;

import B2.N;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements N1.i, D0.n, F3.F, N3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f126n;

    public /* synthetic */ w(int i) {
        this.f126n = i;
    }

    @Override // D0.n
    public void a(D0.m mVar, D0.o oVar) {
        switch (this.f126n) {
            case 1:
                mVar.f(oVar);
                break;
            case 2:
                mVar.d(oVar);
                break;
            case 3:
                mVar.c(oVar);
                break;
            case 4:
                mVar.b();
                break;
            default:
                mVar.e();
                break;
        }
    }

    @Override // N3.e
    public Object b(N n9) {
        W1.e lambda$getComponents$0;
        W1.e lambda$getComponents$1;
        W1.e lambda$getComponents$2;
        Z3.d lambda$getComponents$02;
        switch (this.f126n) {
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36345a.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36347c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36346b.get();
            case 17:
                N3.n nVar = ExecutorsRegistrar.f36345a;
                return O3.k.f2522n;
            case 18:
            default:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(n9);
                return lambda$getComponents$02;
            case 19:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(n9);
                return lambda$getComponents$0;
            case 20:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(n9);
                return lambda$getComponents$1;
            case 21:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(n9);
                return lambda$getComponents$2;
        }
    }

    @Override // N1.i
    public Object get() {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            config = Bitmap.Config.HARDWARE;
            Bitmap copy = createBitmap.copy(config, false);
            createBitmap.recycle();
            r2 = copy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + r2);
            }
            if (copy != null) {
                copy.recycle();
            }
        }
        return Boolean.valueOf(r2);
    }
}
