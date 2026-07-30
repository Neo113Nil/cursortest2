package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4462a implements Parcelable {
    public static final Parcelable.Creator<C4462a> CREATOR = new F0.a(26);

    /* renamed from: n, reason: collision with root package name */
    public final int f37209n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37210u;

    public C4462a(int i, Intent intent) {
        this.f37209n = i;
        this.f37210u = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f37209n;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f37210u);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeInt(this.f37209n);
        Intent intent = this.f37210u;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
