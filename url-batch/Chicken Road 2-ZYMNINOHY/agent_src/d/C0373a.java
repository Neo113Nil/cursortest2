package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373a implements Parcelable {
    public static final Parcelable.Creator<C0373a> CREATOR = new H.h(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f8059a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f8060b;

    public C0373a(Intent intent, int i4) {
        this.f8059a = i4;
        this.f8060b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.f8059a;
        sb.append(i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f8060b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeInt(this.f8059a);
        Intent intent = this.f8060b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i4);
        }
    }
}
