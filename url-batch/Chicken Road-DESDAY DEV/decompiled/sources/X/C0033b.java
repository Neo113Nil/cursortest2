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
    public final int[] f967a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f968b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f969c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f970e;

    /* renamed from: f, reason: collision with root package name */
    public final String f971f;

    /* renamed from: g, reason: collision with root package name */
    public final int f972g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f973j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f974k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f975l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f976m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f977n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f952a.size();
        this.f967a = new int[size * 6];
        if (!c0032a.f957g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f968b = new ArrayList(size);
        this.f969c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f952a.get(i2);
            int i3 = i + 1;
            this.f967a[i] = p2.f932a;
            ArrayList arrayList = this.f968b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f933b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1043e : null);
            int[] iArr = this.f967a;
            iArr[i3] = p2.f934c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f935e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f936f;
            i += 6;
            iArr[i4] = p2.f937g;
            this.f969c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f970e = c0032a.f956f;
        this.f971f = c0032a.h;
        this.f972g = c0032a.f966r;
        this.h = c0032a.i;
        this.i = c0032a.f958j;
        this.f973j = c0032a.f959k;
        this.f974k = c0032a.f960l;
        this.f975l = c0032a.f961m;
        this.f976m = c0032a.f962n;
        this.f977n = c0032a.f963o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f967a);
        parcel.writeStringList(this.f968b);
        parcel.writeIntArray(this.f969c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f970e);
        parcel.writeString(this.f971f);
        parcel.writeInt(this.f972g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f973j);
        TextUtils.writeToParcel(this.f974k, parcel, 0);
        parcel.writeStringList(this.f975l);
        parcel.writeStringList(this.f976m);
        parcel.writeInt(this.f977n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f967a = parcel.createIntArray();
        this.f968b = parcel.createStringArrayList();
        this.f969c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f970e = parcel.readInt();
        this.f971f = parcel.readString();
        this.f972g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f973j = parcel.readInt();
        this.f974k = (CharSequence) creator.createFromParcel(parcel);
        this.f975l = parcel.createStringArrayList();
        this.f976m = parcel.createStringArrayList();
        this.f977n = parcel.readInt() != 0;
    }
}
