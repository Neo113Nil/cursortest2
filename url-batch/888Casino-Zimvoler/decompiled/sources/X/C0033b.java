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
    public final int[] f890a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f891b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f892c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f893e;

    /* renamed from: f, reason: collision with root package name */
    public final String f894f;

    /* renamed from: g, reason: collision with root package name */
    public final int f895g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f896j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f897k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f898l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f899m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f900n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f875a.size();
        this.f890a = new int[size * 6];
        if (!c0032a.f880g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f891b = new ArrayList(size);
        this.f892c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f875a.get(i2);
            int i3 = i + 1;
            this.f890a[i] = p2.f855a;
            ArrayList arrayList = this.f891b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f856b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f966e : null);
            int[] iArr = this.f890a;
            iArr[i3] = p2.f857c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f858e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f859f;
            i += 6;
            iArr[i4] = p2.f860g;
            this.f892c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f893e = c0032a.f879f;
        this.f894f = c0032a.h;
        this.f895g = c0032a.f889r;
        this.h = c0032a.i;
        this.i = c0032a.f881j;
        this.f896j = c0032a.f882k;
        this.f897k = c0032a.f883l;
        this.f898l = c0032a.f884m;
        this.f899m = c0032a.f885n;
        this.f900n = c0032a.f886o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f890a);
        parcel.writeStringList(this.f891b);
        parcel.writeIntArray(this.f892c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f893e);
        parcel.writeString(this.f894f);
        parcel.writeInt(this.f895g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f896j);
        TextUtils.writeToParcel(this.f897k, parcel, 0);
        parcel.writeStringList(this.f898l);
        parcel.writeStringList(this.f899m);
        parcel.writeInt(this.f900n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f890a = parcel.createIntArray();
        this.f891b = parcel.createStringArrayList();
        this.f892c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f893e = parcel.readInt();
        this.f894f = parcel.readString();
        this.f895g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f896j = parcel.readInt();
        this.f897k = (CharSequence) creator.createFromParcel(parcel);
        this.f898l = parcel.createStringArrayList();
        this.f899m = parcel.createStringArrayList();
        this.f900n = parcel.readInt() != 0;
    }
}
