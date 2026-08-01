package R0;

import E.g;
import V.i;
import V.q;
import V.r;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.winfour.neondrop.MainActivity;
import com.winfour.neondrop.MainActivity2;
import java.util.concurrent.ThreadPoolExecutor;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f769a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f771c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(g gVar, d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f770b = gVar;
        this.f771c = dVar;
        this.d = threadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f769a) {
            case 0:
                int i = MainActivity.f2077C;
                MainActivity mainActivity = (MainActivity) this.d;
                mainActivity.getClass();
                String v2 = MainActivity.v(new byte[]{108, -122, -79, -52, 126, -101, -80, -119, Byte.MAX_VALUE, -116, -75});
                String str = (String) this.f770b;
                if (!n1.d.D(str, v2)) {
                    if (!n1.d.D((String) this.f771c, MainActivity.v(new byte[]{57, -102, -73, -58, 111, -100, -80, -123, 33, -53, -84, -52, 57}))) {
                        mainActivity.f2079B = str;
                        SharedPreferences sharedPreferences = (SharedPreferences) mainActivity.f2078A.a();
                        g1.d.d(sharedPreferences, "access$getPrefs(...)");
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(MainActivity.v(new byte[]{105, -100, -79, -53}), str);
                        edit.apply();
                        mainActivity.x(str);
                        return;
                    }
                }
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MainActivity2.class));
                return;
            default:
                g gVar = (g) this.f770b;
                d dVar = (d) this.f771c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                gVar.getClass();
                try {
                    r z2 = l.z((Context) gVar.f170b);
                    if (z2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) ((i) z2.f884b);
                    synchronized (qVar.d) {
                        qVar.f907f = threadPoolExecutor;
                    }
                    ((i) z2.f884b).p(new V.l(dVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    dVar.M(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }

    public /* synthetic */ c(String str, MainActivity mainActivity, String str2) {
        this.f770b = str;
        this.d = mainActivity;
        this.f771c = str2;
    }
}
