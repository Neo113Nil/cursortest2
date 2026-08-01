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
    public final int[] f1007a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1008b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1009c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1010e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1011f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1012g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1013j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1014k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1015l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1016m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1017n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f992a.size();
        this.f1007a = new int[size * 6];
        if (!c0032a.f997g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1008b = new ArrayList(size);
        this.f1009c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f992a.get(i2);
            int i3 = i + 1;
            this.f1007a[i] = p2.f972a;
            ArrayList arrayList = this.f1008b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f973b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1083e : null);
            int[] iArr = this.f1007a;
            iArr[i3] = p2.f974c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f975e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f976f;
            i += 6;
            iArr[i4] = p2.f977g;
            this.f1009c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1010e = c0032a.f996f;
        this.f1011f = c0032a.h;
        this.f1012g = c0032a.f1006r;
        this.h = c0032a.i;
        this.i = c0032a.f998j;
        this.f1013j = c0032a.f999k;
        this.f1014k = c0032a.f1000l;
        this.f1015l = c0032a.f1001m;
        this.f1016m = c0032a.f1002n;
        this.f1017n = c0032a.f1003o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1007a);
        parcel.writeStringList(this.f1008b);
        parcel.writeIntArray(this.f1009c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1010e);
        parcel.writeString(this.f1011f);
        parcel.writeInt(this.f1012g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1013j);
        TextUtils.writeToParcel(this.f1014k, parcel, 0);
        parcel.writeStringList(this.f1015l);
        parcel.writeStringList(this.f1016m);
        parcel.writeInt(this.f1017n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f1007a = parcel.createIntArray();
        this.f1008b = parcel.createStringArrayList();
        this.f1009c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1010e = parcel.readInt();
        this.f1011f = parcel.readString();
        this.f1012g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1013j = parcel.readInt();
        this.f1014k = (CharSequence) creator.createFromParcel(parcel);
        this.f1015l = parcel.createStringArrayList();
        this.f1016m = parcel.createStringArrayList();
        this.f1017n = parcel.readInt() != 0;
    }
}
