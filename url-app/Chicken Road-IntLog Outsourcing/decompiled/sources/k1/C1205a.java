package k1;

import a.AbstractC0169a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205a extends AbstractC1380a {
    public static final Parcelable.Creator<C1205a> CREATOR = new C1207c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f10670a;

    public C1205a(Intent intent) {
        this.f10670a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.N(parcel, 1, this.f10670a, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
