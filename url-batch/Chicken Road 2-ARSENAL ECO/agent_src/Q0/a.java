package Q0;

import a.AbstractC0219a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends V0.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: f, reason: collision with root package name */
    public final Intent f1962f;

    public a(Intent intent) {
        this.f1962f = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.I(parcel, 1, this.f1962f, i7);
        AbstractC0219a.Q(parcel, O6);
    }
}
