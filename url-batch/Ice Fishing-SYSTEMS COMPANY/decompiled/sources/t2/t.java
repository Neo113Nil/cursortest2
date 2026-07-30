package t2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import r2.C4957a;

/* loaded from: classes.dex */
public final class t extends Z2.a implements u {
    @Override // t2.u
    public final boolean zze(V2.a aVar, String str, String str2) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        A02.writeString(str);
        A02.writeString(str2);
        Parcel D02 = D0(A02, 1);
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // t2.u
    public final void zzf(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 2);
    }

    @Override // t2.u
    public final boolean zzg(V2.a aVar, C4957a c4957a) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, c4957a);
        Parcel D02 = D0(A02, 3);
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }
}
