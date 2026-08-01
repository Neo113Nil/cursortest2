package Z;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035b implements Parcelable {
    public static final Parcelable.Creator<C0035b> CREATOR = new R.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1104a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1105b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1106c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1107e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1108f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1109g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1110h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1111j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1112k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1113l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1114m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1115n;

    public C0035b(C0034a c0034a) {
        int size = c0034a.f1088a.size();
        this.f1104a = new int[size * 6];
        if (!c0034a.f1093g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1105b = new ArrayList(size);
        this.f1106c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0034a.f1088a.get(i2);
            int i3 = i + 1;
            this.f1104a[i] = p2.f1066a;
            ArrayList arrayList = this.f1105b;
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = p2.f1067b;
            arrayList.add(abstractComponentCallbacksC0050q != null ? abstractComponentCallbacksC0050q.f1182e : null);
            int[] iArr = this.f1104a;
            iArr[i3] = p2.f1068c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1069e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1070f;
            i += 6;
            iArr[i4] = p2.f1071g;
            this.f1106c[i2] = p2.f1072h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1107e = c0034a.f1092f;
        this.f1108f = c0034a.f1094h;
        this.f1109g = c0034a.f1103r;
        this.f1110h = c0034a.i;
        this.i = c0034a.f1095j;
        this.f1111j = c0034a.f1096k;
        this.f1112k = c0034a.f1097l;
        this.f1113l = c0034a.f1098m;
        this.f1114m = c0034a.f1099n;
        this.f1115n = c0034a.f1100o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1104a);
        parcel.writeStringList(this.f1105b);
        parcel.writeIntArray(this.f1106c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1107e);
        parcel.writeString(this.f1108f);
        parcel.writeInt(this.f1109g);
        parcel.writeInt(this.f1110h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1111j);
        TextUtils.writeToParcel(this.f1112k, parcel, 0);
        parcel.writeStringList(this.f1113l);
        parcel.writeStringList(this.f1114m);
        parcel.writeInt(this.f1115n ? 1 : 0);
    }

    public C0035b(Parcel parcel) {
        this.f1104a = parcel.createIntArray();
        this.f1105b = parcel.createStringArrayList();
        this.f1106c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1107e = parcel.readInt();
        this.f1108f = parcel.readString();
        this.f1109g = parcel.readInt();
        this.f1110h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1111j = parcel.readInt();
        this.f1112k = (CharSequence) creator.createFromParcel(parcel);
        this.f1113l = parcel.createStringArrayList();
        this.f1114m = parcel.createStringArrayList();
        this.f1115n = parcel.readInt() != 0;
    }
}
