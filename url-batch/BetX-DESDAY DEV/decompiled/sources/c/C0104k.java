package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104k implements Parcelable {
    public static final Parcelable.Creator<C0104k> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f1667a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1668b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1669c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1670d;

    public C0104k(IntentSender intentSender, Intent intent, int i, int i2) {
        X0.f.e(intentSender, "intentSender");
        this.f1667a = intentSender;
        this.f1668b = intent;
        this.f1669c = i;
        this.f1670d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        X0.f.e(parcel, "dest");
        parcel.writeParcelable(this.f1667a, i);
        parcel.writeParcelable(this.f1668b, i);
        parcel.writeInt(this.f1669c);
        parcel.writeInt(this.f1670d);
    }
}
