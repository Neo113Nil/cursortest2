package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new H.h(13);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f8080a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f8081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8083d;

    public j(IntentSender intentSender, Intent intent, int i4, int i5) {
        kotlin.jvm.internal.i.e(intentSender, "intentSender");
        this.f8080a = intentSender;
        this.f8081b = intent;
        this.f8082c = i4;
        this.f8083d = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeParcelable(this.f8080a, i4);
        dest.writeParcelable(this.f8081b, i4);
        dest.writeInt(this.f8082c);
        dest.writeInt(this.f8083d);
    }
}
