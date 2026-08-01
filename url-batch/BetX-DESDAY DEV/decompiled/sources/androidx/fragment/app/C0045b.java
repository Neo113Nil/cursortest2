package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045b implements Parcelable {
    public static final Parcelable.Creator<C0045b> CREATOR = new Q.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1318b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1319c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1321e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1322f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1323g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1324j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1325k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1326l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1327m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1328n;

    public C0045b(C0044a c0044a) {
        int size = c0044a.f1301a.size();
        this.f1317a = new int[size * 6];
        if (!c0044a.f1307g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1318b = new ArrayList(size);
        this.f1319c = new int[size];
        this.f1320d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = (T) c0044a.f1301a.get(i2);
            int i3 = i + 1;
            this.f1317a[i] = t2.f1278a;
            ArrayList arrayList = this.f1318b;
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = t2.f1279b;
            arrayList.add(abstractComponentCallbacksC0060q != null ? abstractComponentCallbacksC0060q.f1399e : null);
            int[] iArr = this.f1317a;
            iArr[i3] = t2.f1280c ? 1 : 0;
            iArr[i + 2] = t2.f1281d;
            iArr[i + 3] = t2.f1282e;
            int i4 = i + 5;
            iArr[i + 4] = t2.f1283f;
            i += 6;
            iArr[i4] = t2.f1284g;
            this.f1319c[i2] = t2.h.ordinal();
            this.f1320d[i2] = t2.i.ordinal();
        }
        this.f1321e = c0044a.f1306f;
        this.f1322f = c0044a.h;
        this.f1323g = c0044a.f1316r;
        this.h = c0044a.i;
        this.i = c0044a.f1308j;
        this.f1324j = c0044a.f1309k;
        this.f1325k = c0044a.f1310l;
        this.f1326l = c0044a.f1311m;
        this.f1327m = c0044a.f1312n;
        this.f1328n = c0044a.f1313o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1317a);
        parcel.writeStringList(this.f1318b);
        parcel.writeIntArray(this.f1319c);
        parcel.writeIntArray(this.f1320d);
        parcel.writeInt(this.f1321e);
        parcel.writeString(this.f1322f);
        parcel.writeInt(this.f1323g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1324j);
        TextUtils.writeToParcel(this.f1325k, parcel, 0);
        parcel.writeStringList(this.f1326l);
        parcel.writeStringList(this.f1327m);
        parcel.writeInt(this.f1328n ? 1 : 0);
    }

    public C0045b(Parcel parcel) {
        this.f1317a = parcel.createIntArray();
        this.f1318b = parcel.createStringArrayList();
        this.f1319c = parcel.createIntArray();
        this.f1320d = parcel.createIntArray();
        this.f1321e = parcel.readInt();
        this.f1322f = parcel.readString();
        this.f1323g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1324j = parcel.readInt();
        this.f1325k = (CharSequence) creator.createFromParcel(parcel);
        this.f1326l = parcel.createStringArrayList();
        this.f1327m = parcel.createStringArrayList();
        this.f1328n = parcel.readInt() != 0;
    }
}
