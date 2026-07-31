package D1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b.C0246f;
import com.gates.olympus.miruv.R;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import h1.C0438i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f559f;

    public /* synthetic */ j(Object obj, int i3, Object obj2) {
        this.f557d = i3;
        this.f558e = obj;
        this.f559f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f559f;
        Object obj2 = this.f558e;
        switch (this.f557d) {
            case 0:
                m mVar = TenonPageActivity.Companion;
                TenonPageActivity tenonPageActivity = (TenonPageActivity) obj2;
                String string = tenonPageActivity.getString(R.string.web_download_saved, ((Z1.t) obj).f3480d);
                Z1.i.e(string, "getString(...)");
                Toast.makeText(tenonPageActivity, string, 0).show();
                return;
            case 1:
                W.a.a((W.c) obj2, (LongSparseArray) obj);
                return;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Runnable runnable = (Runnable) obj2;
                Z1.i.f(runnable, "$command");
                androidx.room.z zVar = (androidx.room.z) obj;
                Z1.i.f(zVar, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    zVar.a();
                }
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                b.o oVar = (b.o) obj2;
                Z1.i.f(oVar, "this$0");
                int i3 = b.o.f4177w;
                oVar.f3274d.a(new C0246f((b.F) obj, oVar));
                return;
            default:
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? s1.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new s1.e((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
