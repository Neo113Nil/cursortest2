package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import f3.d;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new androidx.fragment.app.b(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f738f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f739g;

    public a(Intent intent, int i) {
        this.f738f = i;
        this.f739g = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f738f;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f739g);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.e(parcel, "dest");
        parcel.writeInt(this.f738f);
        Intent intent = this.f739g;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
