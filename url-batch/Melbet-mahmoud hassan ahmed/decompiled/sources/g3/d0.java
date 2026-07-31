package g3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cy2;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.ph0;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class d0 implements nb3<Uri> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ph0 f16611a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f16612b;

    d0(f0 f0Var, ph0 ph0Var) {
        this.f16612b = f0Var;
        this.f16611a = ph0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(Uri uri) {
        AtomicInteger atomicInteger;
        boolean z6;
        String str;
        Uri D6;
        cy2 cy2Var;
        Uri uri2 = uri;
        try {
            atomicInteger = this.f16612b.f16638z;
            atomicInteger.getAndIncrement();
            this.f16611a.N2(Collections.singletonList(uri2));
            z6 = this.f16612b.f16633u;
            if (z6) {
                str = this.f16612b.C;
                D6 = f0.D6(uri2, str, "1");
                cy2Var = this.f16612b.f16631s;
                cy2Var.b(D6.toString());
            }
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        try {
            ph0 ph0Var = this.f16611a;
            String valueOf = String.valueOf(th.getMessage());
            ph0Var.u(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
