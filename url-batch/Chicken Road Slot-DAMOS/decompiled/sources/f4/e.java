package f4;

import android.content.DialogInterface;
import android.util.Log;
import androidx.lifecycle.p;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class e extends f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final boolean A;
    public int B;
    public boolean C;
    public boolean D;

    /* renamed from: z, reason: collision with root package name */
    public final d f4075z;

    public e() {
        new b7.k(5, this);
        new c(this);
        this.f4075z = new d(this);
        this.A = true;
        this.B = -1;
        new d9.c(20, this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.C) {
            return;
        }
        if (j.j(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.D) {
            return;
        }
        this.D = true;
        this.C = true;
        if (this.B >= 0) {
            j h10 = h();
            int i3 = this.B;
            if (i3 < 0) {
                a1.e(v4.a.j(i3, "Bad id: "));
                return;
            }
            synchronized (h10.f4089a) {
            }
            this.B = -1;
            return;
        }
        a aVar = new a(h());
        l lVar = new l();
        lVar.f4096a = 3;
        lVar.f4097b = this;
        lVar.f4098c = false;
        p pVar = p.f711s;
        aVar.f4065a.add(lVar);
        lVar.f4099d = 0;
        lVar.f4100e = 0;
        lVar.f4101f = 0;
        lVar.g = 0;
        aVar.a(true);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
