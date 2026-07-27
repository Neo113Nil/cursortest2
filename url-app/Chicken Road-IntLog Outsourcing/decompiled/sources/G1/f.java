package G1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import m1.l;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class f extends AbstractC1380a implements l {
    public static final Parcelable.Creator<f> CREATOR = new B1.c(7);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f923b;

    public f(String str, ArrayList arrayList) {
        this.f922a = arrayList;
        this.f923b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        ArrayList arrayList = this.f922a;
        if (arrayList != null) {
            int R6 = AbstractC0169a.R(parcel, 1);
            parcel.writeStringList(arrayList);
            AbstractC0169a.S(parcel, R6);
        }
        AbstractC0169a.O(parcel, 2, this.f923b);
        AbstractC0169a.S(parcel, R5);
    }
}
