package o3;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4833b extends V.b {
    public static final Parcelable.Creator<C4833b> CREATOR = new g(8);

    /* renamed from: v, reason: collision with root package name */
    public boolean f39702v;

    public C4833b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C4833b.class.getClassLoader();
        }
        this.f39702v = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f39702v ? 1 : 0);
    }
}
