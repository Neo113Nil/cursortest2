package e;

import E1.l;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555f implements Parcelable {
    public static final Parcelable.Creator<C0555f> CREATOR = new l(11);

    /* renamed from: d, reason: collision with root package name */
    public final IntentSender f6147d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f6148e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6149i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6150j;

    public C0555f(IntentSender intentSender, Intent intent, int i2, int i4) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f6147d = intentSender;
        this.f6148e = intent;
        this.f6149i = i2;
        this.f6150j = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f6147d, i2);
        dest.writeParcelable(this.f6148e, i2);
        dest.writeInt(this.f6149i);
        dest.writeInt(this.f6150j);
    }
}
