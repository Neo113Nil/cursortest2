package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dtk(10);
    public final frv a;
    public final ful b;
    public final fue c;
    public final Intent d;
    public final frx e;

    public fry(Parcel parcel) {
        this.a = (frv) parcel.readParcelable(frv.class.getClassLoader());
        try {
            this.b = (ful) imi.a((ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR), ful.a, jkd.a());
            this.c = (fue) parcel.readParcelable(fue.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(fue.class.getClassLoader());
            this.e = (frx) parcel.readParcelable(fue.class.getClassLoader());
        } catch (jld e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, this.b), 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public fry(frv frvVar, ful fulVar, fue fueVar, Intent intent, frx frxVar) {
        this.a = frvVar;
        fulVar.getClass();
        this.b = fulVar;
        this.c = fueVar;
        this.d = intent;
        this.e = frxVar;
    }
}
