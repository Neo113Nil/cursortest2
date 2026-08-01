package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034b implements Parcelable {
    public static final Parcelable.Creator<C0034b> CREATOR = new Q.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f898a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f899b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f900c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f901e;

    /* renamed from: f, reason: collision with root package name */
    public final String f902f;

    /* renamed from: g, reason: collision with root package name */
    public final int f903g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f904j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f905k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f906l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f907m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f908n;

    public C0034b(C0033a c0033a) {
        int size = c0033a.f883a.size();
        this.f898a = new int[size * 6];
        if (!c0033a.f888g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f899b = new ArrayList(size);
        this.f900c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0033a.f883a.get(i2);
            int i3 = i + 1;
            this.f898a[i] = p2.f863a;
            ArrayList arrayList = this.f899b;
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = p2.f864b;
            arrayList.add(abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f974e : null);
            int[] iArr = this.f898a;
            iArr[i3] = p2.f865c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f866e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f867f;
            i += 6;
            iArr[i4] = p2.f868g;
            this.f900c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f901e = c0033a.f887f;
        this.f902f = c0033a.h;
        this.f903g = c0033a.f897r;
        this.h = c0033a.i;
        this.i = c0033a.f889j;
        this.f904j = c0033a.f890k;
        this.f905k = c0033a.f891l;
        this.f906l = c0033a.f892m;
        this.f907m = c0033a.f893n;
        this.f908n = c0033a.f894o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f898a);
        parcel.writeStringList(this.f899b);
        parcel.writeIntArray(this.f900c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f901e);
        parcel.writeString(this.f902f);
        parcel.writeInt(this.f903g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f904j);
        TextUtils.writeToParcel(this.f905k, parcel, 0);
        parcel.writeStringList(this.f906l);
        parcel.writeStringList(this.f907m);
        parcel.writeInt(this.f908n ? 1 : 0);
    }

    public C0034b(Parcel parcel) {
        this.f898a = parcel.createIntArray();
        this.f899b = parcel.createStringArrayList();
        this.f900c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f901e = parcel.readInt();
        this.f902f = parcel.readString();
        this.f903g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f904j = parcel.readInt();
        this.f905k = (CharSequence) creator.createFromParcel(parcel);
        this.f906l = parcel.createStringArrayList();
        this.f907m = parcel.createStringArrayList();
        this.f908n = parcel.readInt() != 0;
    }
}
