package s2;

import a2.C0162b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import d2.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15234a;

    public /* synthetic */ c(int i4) {
        this.f15234a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15234a) {
            case 0:
                int I4 = O3.d.I(parcel);
                Intent intent = null;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < I4) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 1) {
                        i4 = O3.d.w(parcel, readInt);
                    } else if (c4 == 2) {
                        i5 = O3.d.w(parcel, readInt);
                    } else if (c4 != 3) {
                        O3.d.C(parcel, readInt);
                    } else {
                        intent = (Intent) O3.d.h(parcel, readInt, Intent.CREATOR);
                    }
                }
                O3.d.l(parcel, I4);
                return new b(i4, i5, intent);
            case 1:
                int I5 = O3.d.I(parcel);
                ArrayList<String> arrayList = null;
                String str = null;
                while (parcel.dataPosition() < I5) {
                    int readInt2 = parcel.readInt();
                    char c5 = (char) readInt2;
                    if (c5 == 1) {
                        int y4 = O3.d.y(parcel, readInt2);
                        int dataPosition = parcel.dataPosition();
                        if (y4 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + y4);
                            arrayList = createStringArrayList;
                        }
                    } else if (c5 != 2) {
                        O3.d.C(parcel, readInt2);
                    } else {
                        str = O3.d.i(parcel, readInt2);
                    }
                }
                O3.d.l(parcel, I5);
                return new e(arrayList, str);
            default:
                int I6 = O3.d.I(parcel);
                C0162b c0162b = null;
                int i6 = 0;
                o oVar = null;
                while (parcel.dataPosition() < I6) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        i6 = O3.d.w(parcel, readInt3);
                    } else if (c6 == 2) {
                        c0162b = (C0162b) O3.d.h(parcel, readInt3, C0162b.CREATOR);
                    } else if (c6 != 3) {
                        O3.d.C(parcel, readInt3);
                    } else {
                        oVar = (o) O3.d.h(parcel, readInt3, o.CREATOR);
                    }
                }
                O3.d.l(parcel, I6);
                return new f(i6, c0162b, oVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f15234a) {
            case 0:
                return new b[i4];
            case 1:
                return new e[i4];
            default:
                return new f[i4];
        }
    }
}
