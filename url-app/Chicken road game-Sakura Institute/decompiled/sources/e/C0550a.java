package e;

import E1.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550a implements Parcelable {
    public static final Parcelable.Creator<C0550a> CREATOR = new l(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f6136d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f6137e;

    public C0550a(Intent intent, int i2) {
        this.f6136d = i2;
        this.f6137e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f6136d;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f6137e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f6136d);
        Intent intent = this.f6137e;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i2);
        }
    }
}
