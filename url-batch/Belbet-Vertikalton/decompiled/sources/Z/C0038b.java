package Z;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038b implements Parcelable {
    public static final Parcelable.Creator<C0038b> CREATOR = new B0.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1534a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1535b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1536c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1537d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1538f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1539g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1540h;
    public final CharSequence i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1541k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1542l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1543m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1544n;

    public C0038b(C0037a c0037a) {
        int size = c0037a.f1519a.size();
        this.f1534a = new int[size * 6];
        if (!c0037a.f1524g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1535b = new ArrayList(size);
        this.f1536c = new int[size];
        this.f1537d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0037a.f1519a.get(i2);
            int i3 = i + 1;
            this.f1534a[i] = p2.f1496a;
            ArrayList arrayList = this.f1535b;
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = p2.f1497b;
            arrayList.add(abstractComponentCallbacksC0053q != null ? abstractComponentCallbacksC0053q.e : null);
            int[] iArr = this.f1534a;
            iArr[i3] = p2.f1498c ? 1 : 0;
            iArr[i + 2] = p2.f1499d;
            iArr[i + 3] = p2.e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1500f;
            i += 6;
            iArr[i4] = p2.f1501g;
            this.f1536c[i2] = p2.f1502h.ordinal();
            this.f1537d[i2] = p2.i.ordinal();
        }
        this.e = c0037a.f1523f;
        this.f1538f = c0037a.f1525h;
        this.f1539g = c0037a.f1533r;
        this.f1540h = c0037a.i;
        this.i = c0037a.j;
        this.j = c0037a.f1526k;
        this.f1541k = c0037a.f1527l;
        this.f1542l = c0037a.f1528m;
        this.f1543m = c0037a.f1529n;
        this.f1544n = c0037a.f1530o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1534a);
        parcel.writeStringList(this.f1535b);
        parcel.writeIntArray(this.f1536c);
        parcel.writeIntArray(this.f1537d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f1538f);
        parcel.writeInt(this.f1539g);
        parcel.writeInt(this.f1540h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.f1541k, parcel, 0);
        parcel.writeStringList(this.f1542l);
        parcel.writeStringList(this.f1543m);
        parcel.writeInt(this.f1544n ? 1 : 0);
    }

    public C0038b(Parcel parcel) {
        this.f1534a = parcel.createIntArray();
        this.f1535b = parcel.createStringArrayList();
        this.f1536c = parcel.createIntArray();
        this.f1537d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f1538f = parcel.readString();
        this.f1539g = parcel.readInt();
        this.f1540h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.f1541k = (CharSequence) creator.createFromParcel(parcel);
        this.f1542l = parcel.createStringArrayList();
        this.f1543m = parcel.createStringArrayList();
        this.f1544n = parcel.readInt() != 0;
    }
}
