package k7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.p5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends p5 {
    public final j7.a I(j7.b bVar, String str, int i3) {
        Parcel F = F();
        o7.h.b(F, bVar);
        F.writeString(str);
        F.writeInt(i3);
        Parcel D = D(F, 2);
        j7.a E = j7.b.E(D.readStrongBinder());
        D.recycle();
        return E;
    }

    public final j7.a J(j7.b bVar, String str, int i3) {
        Parcel F = F();
        o7.h.b(F, bVar);
        F.writeString(str);
        F.writeInt(i3);
        Parcel D = D(F, 4);
        j7.a E = j7.b.E(D.readStrongBinder());
        D.recycle();
        return E;
    }

    public final j7.a K(j7.b bVar, String str, boolean z10, long j) {
        Parcel F = F();
        o7.h.b(F, bVar);
        F.writeString(str);
        F.writeInt(z10 ? 1 : 0);
        F.writeLong(j);
        Parcel D = D(F, 7);
        j7.a E = j7.b.E(D.readStrongBinder());
        D.recycle();
        return E;
    }

    public final j7.a L(j7.b bVar, String str, int i3, j7.b bVar2) {
        Parcel F = F();
        o7.h.b(F, bVar);
        F.writeString(str);
        F.writeInt(i3);
        o7.h.b(F, bVar2);
        Parcel D = D(F, 8);
        j7.a E = j7.b.E(D.readStrongBinder());
        D.recycle();
        return E;
    }
}
