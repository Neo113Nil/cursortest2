package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033b implements Parcelable {
    public static final Parcelable.Creator<C0033b> CREATOR = new Q.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f895a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f896b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f897c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f898e;

    /* renamed from: f, reason: collision with root package name */
    public final String f899f;

    /* renamed from: g, reason: collision with root package name */
    public final int f900g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f901j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f902k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f903l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f904m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f905n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f880a.size();
        this.f895a = new int[size * 6];
        if (!c0032a.f885g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f896b = new ArrayList(size);
        this.f897c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f880a.get(i2);
            int i3 = i + 1;
            this.f895a[i] = p2.f860a;
            ArrayList arrayList = this.f896b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f861b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f971e : null);
            int[] iArr = this.f895a;
            iArr[i3] = p2.f862c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f863e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f864f;
            i += 6;
            iArr[i4] = p2.f865g;
            this.f897c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f898e = c0032a.f884f;
        this.f899f = c0032a.h;
        this.f900g = c0032a.f894r;
        this.h = c0032a.i;
        this.i = c0032a.f886j;
        this.f901j = c0032a.f887k;
        this.f902k = c0032a.f888l;
        this.f903l = c0032a.f889m;
        this.f904m = c0032a.f890n;
        this.f905n = c0032a.f891o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f895a);
        parcel.writeStringList(this.f896b);
        parcel.writeIntArray(this.f897c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f898e);
        parcel.writeString(this.f899f);
        parcel.writeInt(this.f900g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f901j);
        TextUtils.writeToParcel(this.f902k, parcel, 0);
        parcel.writeStringList(this.f903l);
        parcel.writeStringList(this.f904m);
        parcel.writeInt(this.f905n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f895a = parcel.createIntArray();
        this.f896b = parcel.createStringArrayList();
        this.f897c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f898e = parcel.readInt();
        this.f899f = parcel.readString();
        this.f900g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f901j = parcel.readInt();
        this.f902k = (CharSequence) creator.createFromParcel(parcel);
        this.f903l = parcel.createStringArrayList();
        this.f904m = parcel.createStringArrayList();
        this.f905n = parcel.readInt() != 0;
    }
}
