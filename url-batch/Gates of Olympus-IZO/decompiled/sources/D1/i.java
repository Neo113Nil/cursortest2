package D1;

import android.widget.Toast;
import com.gates.olympus.miruv.R;
import com.gates.olympus.miruv.tenon.TenonPageActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TenonPageActivity f556e;

    public /* synthetic */ i(TenonPageActivity tenonPageActivity, int i3) {
        this.f555d = i3;
        this.f556e = tenonPageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TenonPageActivity tenonPageActivity = this.f556e;
        switch (this.f555d) {
            case 0:
                m mVar = TenonPageActivity.Companion;
                tenonPageActivity.setRequestedOrientation(13);
                break;
            default:
                m mVar2 = TenonPageActivity.Companion;
                String string = tenonPageActivity.getString(R.string.web_download_failed);
                Z1.i.e(string, "getString(...)");
                Toast.makeText(tenonPageActivity, string, 0).show();
                break;
        }
    }
}
