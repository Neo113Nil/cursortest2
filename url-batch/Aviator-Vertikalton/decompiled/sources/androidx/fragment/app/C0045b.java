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
    public final int[] f1316a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1317b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1318c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1319d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1320e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1321f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1322g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1323j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1324k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1325l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1326m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1327n;

    public C0045b(C0044a c0044a) {
        int size = c0044a.f1300a.size();
        this.f1316a = new int[size * 6];
        if (!c0044a.f1306g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1317b = new ArrayList(size);
        this.f1318c = new int[size];
        this.f1319d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = (T) c0044a.f1300a.get(i2);
            int i3 = i + 1;
            this.f1316a[i] = t2.f1277a;
            ArrayList arrayList = this.f1317b;
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = t2.f1278b;
            arrayList.add(abstractComponentCallbacksC0060q != null ? abstractComponentCallbacksC0060q.f1398e : null);
            int[] iArr = this.f1316a;
            iArr[i3] = t2.f1279c ? 1 : 0;
            iArr[i + 2] = t2.f1280d;
            iArr[i + 3] = t2.f1281e;
            int i4 = i + 5;
            iArr[i + 4] = t2.f1282f;
            i += 6;
            iArr[i4] = t2.f1283g;
            this.f1318c[i2] = t2.h.ordinal();
            this.f1319d[i2] = t2.i.ordinal();
        }
        this.f1320e = c0044a.f1305f;
        this.f1321f = c0044a.h;
        this.f1322g = c0044a.f1315r;
        this.h = c0044a.i;
        this.i = c0044a.f1307j;
        this.f1323j = c0044a.f1308k;
        this.f1324k = c0044a.f1309l;
        this.f1325l = c0044a.f1310m;
        this.f1326m = c0044a.f1311n;
        this.f1327n = c0044a.f1312o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1316a);
        parcel.writeStringList(this.f1317b);
        parcel.writeIntArray(this.f1318c);
        parcel.writeIntArray(this.f1319d);
        parcel.writeInt(this.f1320e);
        parcel.writeString(this.f1321f);
        parcel.writeInt(this.f1322g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1323j);
        TextUtils.writeToParcel(this.f1324k, parcel, 0);
        parcel.writeStringList(this.f1325l);
        parcel.writeStringList(this.f1326m);
        parcel.writeInt(this.f1327n ? 1 : 0);
    }

    public C0045b(Parcel parcel) {
        this.f1316a = parcel.createIntArray();
        this.f1317b = parcel.createStringArrayList();
        this.f1318c = parcel.createIntArray();
        this.f1319d = parcel.createIntArray();
        this.f1320e = parcel.readInt();
        this.f1321f = parcel.readString();
        this.f1322g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1323j = parcel.readInt();
        this.f1324k = (CharSequence) creator.createFromParcel(parcel);
        this.f1325l = parcel.createStringArrayList();
        this.f1326m = parcel.createStringArrayList();
        this.f1327n = parcel.readInt() != 0;
    }
}
