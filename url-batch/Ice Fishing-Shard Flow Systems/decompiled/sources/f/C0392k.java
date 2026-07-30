package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392k implements Parcelable {
    public static final Parcelable.Creator<C0392k> CREATOR = new I1.c(12);

    /* renamed from: d, reason: collision with root package name */
    public final IntentSender f4758d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f4759e;

    /* renamed from: i, reason: collision with root package name */
    public final int f4760i;

    /* renamed from: l, reason: collision with root package name */
    public final int f4761l;

    public C0392k(IntentSender intentSender, Intent intent, int i2, int i5) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f4758d = intentSender;
        this.f4759e = intent;
        this.f4760i = i2;
        this.f4761l = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f4758d, i2);
        dest.writeParcelable(this.f4759e, i2);
        dest.writeInt(this.f4760i);
        dest.writeInt(this.f4761l);
    }
}
