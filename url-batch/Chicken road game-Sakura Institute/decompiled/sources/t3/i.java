package t3;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new d4.a(13);

    /* renamed from: f, reason: collision with root package name */
    public final String f8805f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8806g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f8807h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f8808i;

    public i(h hVar) {
        r6.k.f(hVar, "entry");
        this.f8805f = hVar.f8796k;
        this.f8806g = hVar.f8792g.f8862k;
        this.f8807h = hVar.g();
        Bundle bundle = new Bundle();
        this.f8808i = bundle;
        hVar.f8799n.h(bundle);
    }

    public final h a(Context context, v vVar, androidx.lifecycle.o oVar, o oVar2) {
        r6.k.f(context, "context");
        r6.k.f(oVar, "hostLifecycleState");
        Bundle bundle = this.f8807h;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f8805f;
        r6.k.f(str, "id");
        return new h(context, vVar, bundle2, oVar, oVar2, str, this.f8808i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        r6.k.f(parcel, "parcel");
        parcel.writeString(this.f8805f);
        parcel.writeInt(this.f8806g);
        parcel.writeBundle(this.f8807h);
        parcel.writeBundle(this.f8808i);
    }

    public i(Parcel parcel) {
        String readString = parcel.readString();
        r6.k.c(readString);
        this.f8805f = readString;
        this.f8806g = parcel.readInt();
        this.f8807h = parcel.readBundle(i.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(i.class.getClassLoader());
        r6.k.c(readBundle);
        this.f8808i = readBundle;
    }
}
