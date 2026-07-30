package B2;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.Av;
import com.google.android.gms.internal.ads.C3802qe;
import com.google.android.gms.internal.ads.InterfaceC3909se;
import com.google.android.gms.internal.ads.LD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: B2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269c implements LD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f218n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3909se f219u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f220v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC0278l f221w;

    public C0269c(BinderC0278l binderC0278l, InterfaceC3909se interfaceC3909se, boolean z8, int i) {
        this.f218n = i;
        switch (i) {
            case 1:
                this.f219u = interfaceC3909se;
                this.f220v = z8;
                Objects.requireNonNull(binderC0278l);
                this.f221w = binderC0278l;
                break;
            default:
                this.f219u = interfaceC3909se;
                this.f220v = z8;
                Objects.requireNonNull(binderC0278l);
                this.f221w = binderC0278l;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public final void mo7l(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z8 = this.f220v;
        BinderC0278l binderC0278l = this.f221w;
        InterfaceC3909se interfaceC3909se = this.f219u;
        switch (this.f218n) {
            case 0:
                List<Uri> list = (List) obj;
                try {
                    binderC0278l.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = binderC0278l.f261R;
                        arrayList2 = binderC0278l.f260Q;
                        if (hasNext) {
                            if (BinderC0278l.K3((Uri) it.next(), arrayList2, arrayList)) {
                                binderC0278l.f256M.getAndIncrement();
                            }
                        }
                    }
                    C3802qe c3802qe = (C3802qe) interfaceC3909se;
                    Parcel A02 = c3802qe.A0();
                    A02.writeTypedList(list);
                    c3802qe.G0(A02, 1);
                    if (binderC0278l.f252H || z8) {
                        for (Uri uri : list) {
                            boolean K32 = BinderC0278l.K3(uri, arrayList2, arrayList);
                            Av av = binderC0278l.f250F;
                            if (K32) {
                                av.b(BinderC0278l.N3(uri, binderC0278l.f259P, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31796t8)).booleanValue()) {
                                    av.b(uri.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("", e6);
                    return;
                }
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                try {
                    C3802qe c3802qe2 = (C3802qe) interfaceC3909se;
                    Parcel A03 = c3802qe2.A0();
                    A03.writeTypedList(arrayList3);
                    c3802qe2.G0(A03, 1);
                    if (binderC0278l.f251G || z8) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Uri uri2 = (Uri) it2.next();
                            boolean K33 = BinderC0278l.K3(uri2, binderC0278l.f262S, binderC0278l.f263T);
                            Av av2 = binderC0278l.f250F;
                            if (K33) {
                                av2.b(BinderC0278l.N3(uri2, binderC0278l.f259P, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31796t8)).booleanValue()) {
                                    av2.b(uri2.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e9) {
                    int i4 = t2.C.f40822b;
                    u2.i.d("", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public final void q(Throwable th) {
        InterfaceC3909se interfaceC3909se = this.f219u;
        switch (this.f218n) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    String sb2 = sb.toString();
                    C3802qe c3802qe = (C3802qe) interfaceC3909se;
                    Parcel A02 = c3802qe.A0();
                    A02.writeString(sb2);
                    c3802qe.G0(A02, 2);
                    break;
                } catch (RemoteException e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("", e6);
                }
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb3.append("Internal error: ");
                    sb3.append(message2);
                    String sb4 = sb3.toString();
                    C3802qe c3802qe2 = (C3802qe) interfaceC3909se;
                    Parcel A03 = c3802qe2.A0();
                    A03.writeString(sb4);
                    c3802qe2.G0(A03, 2);
                    break;
                } catch (RemoteException e9) {
                    int i4 = t2.C.f40822b;
                    u2.i.d("", e9);
                    return;
                }
        }
    }
}
