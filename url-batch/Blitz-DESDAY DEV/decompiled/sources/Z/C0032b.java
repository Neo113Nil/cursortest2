package Z;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032b implements Parcelable {
    public static final Parcelable.Creator<C0032b> CREATOR = new S.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1117b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1118c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1119e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1120f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1121g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1122j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1123k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1124l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1125m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1126n;

    public C0032b(C0031a c0031a) {
        int size = c0031a.f1101a.size();
        this.f1116a = new int[size * 6];
        if (!c0031a.f1106g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1117b = new ArrayList(size);
        this.f1118c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0031a.f1101a.get(i2);
            int i3 = i + 1;
            this.f1116a[i] = p2.f1081a;
            ArrayList arrayList = this.f1117b;
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = p2.f1082b;
            arrayList.add(abstractComponentCallbacksC0047q != null ? abstractComponentCallbacksC0047q.f1192e : null);
            int[] iArr = this.f1116a;
            iArr[i3] = p2.f1083c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1084e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1085f;
            i += 6;
            iArr[i4] = p2.f1086g;
            this.f1118c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1119e = c0031a.f1105f;
        this.f1120f = c0031a.h;
        this.f1121g = c0031a.f1115r;
        this.h = c0031a.i;
        this.i = c0031a.f1107j;
        this.f1122j = c0031a.f1108k;
        this.f1123k = c0031a.f1109l;
        this.f1124l = c0031a.f1110m;
        this.f1125m = c0031a.f1111n;
        this.f1126n = c0031a.f1112o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1116a);
        parcel.writeStringList(this.f1117b);
        parcel.writeIntArray(this.f1118c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1119e);
        parcel.writeString(this.f1120f);
        parcel.writeInt(this.f1121g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1122j);
        TextUtils.writeToParcel(this.f1123k, parcel, 0);
        parcel.writeStringList(this.f1124l);
        parcel.writeStringList(this.f1125m);
        parcel.writeInt(this.f1126n ? 1 : 0);
    }

    public C0032b(Parcel parcel) {
        this.f1116a = parcel.createIntArray();
        this.f1117b = parcel.createStringArrayList();
        this.f1118c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1119e = parcel.readInt();
        this.f1120f = parcel.readString();
        this.f1121g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1122j = parcel.readInt();
        this.f1123k = (CharSequence) creator.createFromParcel(parcel);
        this.f1124l = parcel.createStringArrayList();
        this.f1125m = parcel.createStringArrayList();
        this.f1126n = parcel.readInt() != 0;
    }
}
