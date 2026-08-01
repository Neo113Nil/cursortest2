package Y;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035b implements Parcelable {
    public static final Parcelable.Creator<C0035b> CREATOR = new F0.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1386a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1387b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1388c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1389e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1390f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1391g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1392j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1393k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1394l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1395m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1396n;

    public C0035b(C0034a c0034a) {
        int size = c0034a.f1371a.size();
        this.f1386a = new int[size * 6];
        if (!c0034a.f1376g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1387b = new ArrayList(size);
        this.f1388c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0034a.f1371a.get(i2);
            int i3 = i + 1;
            this.f1386a[i] = p2.f1351a;
            ArrayList arrayList = this.f1387b;
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = p2.f1352b;
            arrayList.add(abstractComponentCallbacksC0050q != null ? abstractComponentCallbacksC0050q.f1462e : null);
            int[] iArr = this.f1386a;
            iArr[i3] = p2.f1353c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1354e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1355f;
            i += 6;
            iArr[i4] = p2.f1356g;
            this.f1388c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1389e = c0034a.f1375f;
        this.f1390f = c0034a.h;
        this.f1391g = c0034a.f1385r;
        this.h = c0034a.i;
        this.i = c0034a.f1377j;
        this.f1392j = c0034a.f1378k;
        this.f1393k = c0034a.f1379l;
        this.f1394l = c0034a.f1380m;
        this.f1395m = c0034a.f1381n;
        this.f1396n = c0034a.f1382o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1386a);
        parcel.writeStringList(this.f1387b);
        parcel.writeIntArray(this.f1388c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1389e);
        parcel.writeString(this.f1390f);
        parcel.writeInt(this.f1391g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1392j);
        TextUtils.writeToParcel(this.f1393k, parcel, 0);
        parcel.writeStringList(this.f1394l);
        parcel.writeStringList(this.f1395m);
        parcel.writeInt(this.f1396n ? 1 : 0);
    }

    public C0035b(Parcel parcel) {
        this.f1386a = parcel.createIntArray();
        this.f1387b = parcel.createStringArrayList();
        this.f1388c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1389e = parcel.readInt();
        this.f1390f = parcel.readString();
        this.f1391g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1392j = parcel.readInt();
        this.f1393k = (CharSequence) creator.createFromParcel(parcel);
        this.f1394l = parcel.createStringArrayList();
        this.f1395m = parcel.createStringArrayList();
        this.f1396n = parcel.readInt() != 0;
    }
}
