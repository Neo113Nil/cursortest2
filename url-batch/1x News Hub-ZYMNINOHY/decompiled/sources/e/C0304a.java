package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304a implements Parcelable {
    public static final Parcelable.Creator<C0304a> CREATOR = new android.support.v4.media.session.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f4952a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4953b;

    public C0304a(Intent intent, int i3) {
        this.f4952a = i3;
        this.f4953b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f4952a;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f4953b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        j.e(dest, "dest");
        dest.writeInt(this.f4952a);
        Intent intent = this.f4953b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i3);
        }
    }
}
