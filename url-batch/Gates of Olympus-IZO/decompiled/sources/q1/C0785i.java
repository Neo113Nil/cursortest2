package q1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0230o;

/* renamed from: q1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785i implements Parcelable {
    public static final Parcelable.Creator<C0785i> CREATOR = new A1.a(3);

    /* renamed from: d, reason: collision with root package name */
    public final String f6906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6907e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6908f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f6909g;

    public C0785i(C0784h c0784h) {
        Z1.i.f(c0784h, "entry");
        this.f6906d = c0784h.f6899i;
        this.f6907e = c0784h.f6895e.f6967i;
        this.f6908f = c0784h.g();
        Bundle bundle = new Bundle();
        this.f6909g = bundle;
        c0784h.f6902l.f(bundle);
    }

    public final C0784h a(Context context, w wVar, EnumC0230o enumC0230o, p pVar) {
        Z1.i.f(context, "context");
        Z1.i.f(enumC0230o, "hostLifecycleState");
        Bundle bundle = this.f6908f;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f6906d;
        Z1.i.f(str, "id");
        return new C0784h(context, wVar, bundle2, enumC0230o, pVar, str, this.f6909g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Z1.i.f(parcel, "parcel");
        parcel.writeString(this.f6906d);
        parcel.writeInt(this.f6907e);
        parcel.writeBundle(this.f6908f);
        parcel.writeBundle(this.f6909g);
    }

    public C0785i(Parcel parcel) {
        Z1.i.f(parcel, "inParcel");
        String readString = parcel.readString();
        Z1.i.c(readString);
        this.f6906d = readString;
        this.f6907e = parcel.readInt();
        this.f6908f = parcel.readBundle(C0785i.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C0785i.class.getClassLoader());
        Z1.i.c(readBundle);
        this.f6909g = readBundle;
    }
}
