package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309f implements Parcelable {
    public static final Parcelable.Creator<C0309f> CREATOR = new android.support.v4.media.session.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f4961a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4963c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4964d;

    public C0309f(IntentSender intentSender, Intent intent, int i3, int i4) {
        j.e(intentSender, "intentSender");
        this.f4961a = intentSender;
        this.f4962b = intent;
        this.f4963c = i3;
        this.f4964d = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        j.e(dest, "dest");
        dest.writeParcelable(this.f4961a, i3);
        dest.writeParcelable(this.f4962b, i3);
        dest.writeInt(this.f4963c);
        dest.writeInt(this.f4964d);
    }
}
