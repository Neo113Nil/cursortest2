package N0;

import T.i;
import T.q;
import T.r;
import X0.d;
import android.content.Context;
import android.content.SharedPreferences;
import com.quicktoss.winflip.MainActivity;
import java.util.concurrent.ThreadPoolExecutor;
import q1.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f617c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f615a = i;
        this.f616b = obj;
        this.f617c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f615a) {
            case 0:
                String str = (String) this.f616b;
                String str2 = (String) this.f617c;
                boolean equals = str.equals(str2);
                MainActivity mainActivity = (MainActivity) this.d;
                if (equals) {
                    int i = MainActivity.f1865D;
                    mainActivity.w();
                    return;
                }
                int i2 = MainActivity.f1865D;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity.f1867B.a();
                d.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(mainActivity.f1866A, str2);
                edit.apply();
                mainActivity.f1868C = str2;
                mainActivity.x(str2);
                return;
            default:
                B0.d dVar = (B0.d) this.f616b;
                q1.d dVar2 = (q1.d) this.f617c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                dVar.getClass();
                try {
                    r o2 = l.o((Context) dVar.f59b);
                    if (o2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) ((i) o2.f721b);
                    synchronized (qVar.d) {
                        qVar.f744f = threadPoolExecutor;
                    }
                    ((i) o2.f721b).l(new T.l(dVar2, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    dVar2.c0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
