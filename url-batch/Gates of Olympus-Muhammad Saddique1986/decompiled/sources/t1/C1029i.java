package t1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0286o;

/* renamed from: t1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029i implements Parcelable {
    public static final Parcelable.Creator<C1029i> CREATOR = new E1.a(3);

    /* renamed from: d, reason: collision with root package name */
    public final String f8885d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8886e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f8887f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8888g;

    public C1029i(C1028h c1028h) {
        f2.j.f(c1028h, "entry");
        this.f8885d = c1028h.f8878i;
        this.f8886e = c1028h.f8874e.f8936i;
        this.f8887f = c1028h.g();
        Bundle bundle = new Bundle();
        this.f8888g = bundle;
        c1028h.f8881l.g(bundle);
    }

    public final C1028h a(Context context, u uVar, EnumC0286o enumC0286o, n nVar) {
        f2.j.f(context, "context");
        f2.j.f(enumC0286o, "hostLifecycleState");
        Bundle bundle = this.f8887f;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f8885d;
        f2.j.f(str, "id");
        return new C1028h(context, uVar, bundle2, enumC0286o, nVar, str, this.f8888g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        f2.j.f(parcel, "parcel");
        parcel.writeString(this.f8885d);
        parcel.writeInt(this.f8886e);
        parcel.writeBundle(this.f8887f);
        parcel.writeBundle(this.f8888g);
    }

    public C1029i(Parcel parcel) {
        f2.j.f(parcel, "inParcel");
        String readString = parcel.readString();
        f2.j.c(readString);
        this.f8885d = readString;
        this.f8886e = parcel.readInt();
        this.f8887f = parcel.readBundle(C1029i.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C1029i.class.getClassLoader());
        f2.j.c(readBundle);
        this.f8888g = readBundle;
    }
}
