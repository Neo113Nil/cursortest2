package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aby extends abn {
    public static final Parcelable.Creator CREATOR = new lh(5);
    public int a;
    public int b;
    public int e;
    public int f;
    public int g;

    public aby(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = 0;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public aby(Parcelable parcelable) {
        super(parcelable);
        this.a = 0;
    }
}
