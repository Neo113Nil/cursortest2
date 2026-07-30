package p1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818a extends AbstractC0943a {
    public static final Parcelable.Creator<C0818a> CREATOR = new I1.c(18);

    /* renamed from: d, reason: collision with root package name */
    public final Intent f7152d;

    public C0818a(Intent intent) {
        this.f7152d = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.J(parcel, 1, this.f7152d, i2);
        AbstractC1053a.S(parcel, Q);
    }
}
