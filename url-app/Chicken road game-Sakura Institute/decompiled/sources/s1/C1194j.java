package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0475o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194j implements Parcelable {
    public static final Parcelable.Creator<C1194j> CREATOR = new E1.l(12);

    /* renamed from: d, reason: collision with root package name */
    public final String f10521d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10522e;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f10523i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f10524j;

    public C1194j(C1193i entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f10521d = entry.f10514l;
        this.f10522e = entry.f10510e.f10575l;
        this.f10523i = entry.g();
        Bundle outBundle = new Bundle();
        this.f10524j = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        entry.f10517o.g(outBundle);
    }

    public final C1193i a(Context context, v destination, EnumC0475o hostLifecycleState, p pVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f10523i;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        String id = this.f10521d;
        Intrinsics.checkNotNullParameter(id, "id");
        return new C1193i(context, destination, bundle2, hostLifecycleState, pVar, id, this.f10524j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f10521d);
        parcel.writeInt(this.f10522e);
        parcel.writeBundle(this.f10523i);
        parcel.writeBundle(this.f10524j);
    }

    public C1194j(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String readString = inParcel.readString();
        Intrinsics.c(readString);
        this.f10521d = readString;
        this.f10522e = inParcel.readInt();
        this.f10523i = inParcel.readBundle(C1194j.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(C1194j.class.getClassLoader());
        Intrinsics.c(readBundle);
        this.f10524j = readBundle;
    }
}
