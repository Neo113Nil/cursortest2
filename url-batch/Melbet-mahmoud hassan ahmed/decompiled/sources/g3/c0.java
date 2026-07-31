package g3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cy2;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.ph0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class c0 implements nb3<ArrayList<Uri>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ph0 f16608a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f16609b;

    c0(f0 f0Var, ph0 ph0Var) {
        this.f16609b = f0Var;
        this.f16608a = ph0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(ArrayList<Uri> arrayList) {
        boolean z6;
        String str;
        Uri D6;
        cy2 cy2Var;
        ArrayList<Uri> arrayList2 = arrayList;
        try {
            this.f16608a.N2(arrayList2);
            z6 = this.f16609b.f16632t;
            if (z6) {
                Iterator<Uri> it = arrayList2.iterator();
                while (it.hasNext()) {
                    Uri next = it.next();
                    if (f0.x6(next)) {
                        str = this.f16609b.C;
                        D6 = f0.D6(next, str, "1");
                        cy2Var = this.f16609b.f16631s;
                        cy2Var.b(D6.toString());
                    }
                }
            }
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        try {
            ph0 ph0Var = this.f16608a;
            String valueOf = String.valueOf(th.getMessage());
            ph0Var.u(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
