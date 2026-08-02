package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgb implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public fgb(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new fgc(parcel, (ClassLoader) null);
            case 1:
                return new ffa(parcel, null);
            case 2:
                return new fgh(parcel, null);
            case 3:
                return new fio(parcel, null);
            case 4:
                return new fjl(parcel, null);
            case 5:
                return new fkw(parcel, null);
            case 6:
                return new fpq(parcel, null);
            default:
                return new frg(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fgc[i];
            case 1:
                return new ffa[i];
            case 2:
                return new fgh[i];
            case 3:
                return new fio[i];
            case 4:
                return new fjl[i];
            case 5:
                return new fkw[i];
            case 6:
                return new fpq[i];
            default:
                return new frg[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new fgc(parcel, classLoader);
            case 1:
                return new ffa(parcel, classLoader);
            case 2:
                return new fgh(parcel, classLoader);
            case 3:
                return new fio(parcel, classLoader);
            case 4:
                return new fjl(parcel, classLoader);
            case 5:
                return new fkw(parcel, classLoader);
            case 6:
                return new fpq(parcel, classLoader);
            default:
                return new frg(parcel, classLoader);
        }
    }
}
