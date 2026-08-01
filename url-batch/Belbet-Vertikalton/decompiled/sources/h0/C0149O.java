package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149O extends T.b {
    public static final Parcelable.Creator<C0149O> CREATOR = new H0.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2933c;

    public C0149O(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2933c = parcel.readParcelable(classLoader == null ? AbstractC0141G.class.getClassLoader() : classLoader);
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2933c, 0);
    }
}
