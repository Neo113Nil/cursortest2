package G1;

import a.AbstractC0169a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import m1.l;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class b extends AbstractC1380a implements l {
    public static final Parcelable.Creator<b> CREATOR = new B1.c(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f919a;

    /* renamed from: b, reason: collision with root package name */
    public final int f920b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f921c;

    public b(int i2, int i3, Intent intent) {
        this.f919a = i2;
        this.f920b = i3;
        this.f921c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f919a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f920b);
        AbstractC0169a.N(parcel, 3, this.f921c, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
