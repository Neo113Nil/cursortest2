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
    public final int[] f896a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f897b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f898c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f899e;

    /* renamed from: f, reason: collision with root package name */
    public final String f900f;

    /* renamed from: g, reason: collision with root package name */
    public final int f901g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f902j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f903k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f904l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f905m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f906n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f881a.size();
        this.f896a = new int[size * 6];
        if (!c0032a.f886g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f897b = new ArrayList(size);
        this.f898c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f881a.get(i2);
            int i3 = i + 1;
            this.f896a[i] = p2.f861a;
            ArrayList arrayList = this.f897b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f862b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f972e : null);
            int[] iArr = this.f896a;
            iArr[i3] = p2.f863c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f864e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f865f;
            i += 6;
            iArr[i4] = p2.f866g;
            this.f898c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f899e = c0032a.f885f;
        this.f900f = c0032a.h;
        this.f901g = c0032a.f895r;
        this.h = c0032a.i;
        this.i = c0032a.f887j;
        this.f902j = c0032a.f888k;
        this.f903k = c0032a.f889l;
        this.f904l = c0032a.f890m;
        this.f905m = c0032a.f891n;
        this.f906n = c0032a.f892o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f896a);
        parcel.writeStringList(this.f897b);
        parcel.writeIntArray(this.f898c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f899e);
        parcel.writeString(this.f900f);
        parcel.writeInt(this.f901g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f902j);
        TextUtils.writeToParcel(this.f903k, parcel, 0);
        parcel.writeStringList(this.f904l);
        parcel.writeStringList(this.f905m);
        parcel.writeInt(this.f906n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f896a = parcel.createIntArray();
        this.f897b = parcel.createStringArrayList();
        this.f898c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f899e = parcel.readInt();
        this.f900f = parcel.readString();
        this.f901g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f902j = parcel.readInt();
        this.f903k = (CharSequence) creator.createFromParcel(parcel);
        this.f904l = parcel.createStringArrayList();
        this.f905m = parcel.createStringArrayList();
        this.f906n = parcel.readInt() != 0;
    }
}
