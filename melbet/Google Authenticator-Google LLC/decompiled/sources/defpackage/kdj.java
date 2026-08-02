package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdj implements jzt {
    private final Parcelable.Creator a;
    private final boolean b;

    public kdj(Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.jzt
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        boolean z = this.b;
        return new kdr(this.a, (Parcelable) obj, z);
    }

    @Override // defpackage.jzt
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (!(inputStream instanceof kdr)) {
            throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        kdr kdrVar = (kdr) inputStream;
        if (kdrVar.b) {
            return kdrVar.c;
        }
        if (kdrVar.e == null) {
            Parcelable parcelable = kdrVar.c;
            Parcelable.Creator creator = kdrVar.a;
            creator.getClass();
            Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            Parcelable parcelable2 = (Parcelable) creator.createFromParcel(obtain);
            obtain.recycle();
            kdrVar.e = parcelable2;
        }
        return kdrVar.e;
    }
}
