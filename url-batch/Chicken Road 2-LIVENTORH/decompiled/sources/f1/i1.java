package f1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new androidx.fragment.app.b(11);

    /* renamed from: f, reason: collision with root package name */
    public int f1378f;

    /* renamed from: g, reason: collision with root package name */
    public int f1379g;

    /* renamed from: h, reason: collision with root package name */
    public int f1380h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int f1381j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f1382k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1383l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1384m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1385n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1386o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1378f);
        parcel.writeInt(this.f1379g);
        parcel.writeInt(this.f1380h);
        if (this.f1380h > 0) {
            parcel.writeIntArray(this.i);
        }
        parcel.writeInt(this.f1381j);
        if (this.f1381j > 0) {
            parcel.writeIntArray(this.f1382k);
        }
        parcel.writeInt(this.f1384m ? 1 : 0);
        parcel.writeInt(this.f1385n ? 1 : 0);
        parcel.writeInt(this.f1386o ? 1 : 0);
        parcel.writeList(this.f1383l);
    }
}
