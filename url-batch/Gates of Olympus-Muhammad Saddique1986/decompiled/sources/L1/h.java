package L1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b.AbstractActivityC0319o;
import b.C0301E;
import b.C0310f;
import com.gatesof.olympus.martu.marku.R;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import i.C0510b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import v1.AbstractC1165g;
import v1.RunnableC1163e;
import w1.ExecutorC1177D;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3375f;

    public /* synthetic */ h(Object obj, int i3, Object obj2) {
        this.f3373d = i3;
        this.f3374e = obj;
        this.f3375f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3373d) {
            case 0:
                k kVar = SalonPageActivity.Companion;
                Object[] objArr = {((f2.u) this.f3375f).f5832d};
                SalonPageActivity salonPageActivity = (SalonPageActivity) this.f3374e;
                String string = salonPageActivity.getString(R.string.web_download_saved, objArr);
                f2.j.e(string, "getString(...)");
                Toast.makeText(salonPageActivity, string, 0).show();
                return;
            case 1:
                W.a.a((W.c) this.f3374e, (LongSparseArray) this.f3375f);
                return;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractActivityC0319o abstractActivityC0319o = (AbstractActivityC0319o) this.f3374e;
                f2.j.f(abstractActivityC0319o, "this$0");
                C0301E c0301e = (C0301E) this.f3375f;
                int i3 = AbstractActivityC0319o.f5313w;
                abstractActivityC0319o.f4509d.a(new C0310f(c0301e, abstractActivityC0319o));
                return;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((ProfileInstallerInitializer) this.f3374e).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC1165g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1163e((Context) this.f3375f, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                w1.v vVar = (w1.v) this.f3374e;
                String[] strArr = (String[]) this.f3375f;
                f2.j.f(vVar, "this$0");
                f2.j.f(strArr, "$tables");
                w1.q qVar = vVar.f9907a;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                qVar.getClass();
                f2.j.f(strArr2, "tables");
                synchronized (qVar.f9898j) {
                    Iterator it = qVar.f9898j.iterator();
                    while (true) {
                        C0510b c0510b = (C0510b) it;
                        if (c0510b.hasNext()) {
                            Map.Entry entry = (Map.Entry) c0510b.next();
                            f2.j.e(entry, "(observer, wrapper)");
                            w1.o oVar = (w1.o) entry.getKey();
                            w1.p pVar = (w1.p) entry.getValue();
                            oVar.getClass();
                            if (!(oVar instanceof w1.s)) {
                                pVar.b(strArr2);
                            }
                        }
                    }
                }
                return;
            default:
                Runnable runnable = (Runnable) this.f3374e;
                f2.j.f(runnable, "$command");
                ExecutorC1177D executorC1177D = (ExecutorC1177D) this.f3375f;
                f2.j.f(executorC1177D, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC1177D.a();
                }
        }
    }
}
