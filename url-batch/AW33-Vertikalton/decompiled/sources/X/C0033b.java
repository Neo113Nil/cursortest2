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
    public final int[] f889a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f890b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f891c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f892e;

    /* renamed from: f, reason: collision with root package name */
    public final String f893f;

    /* renamed from: g, reason: collision with root package name */
    public final int f894g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f895j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f896k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f897l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f898m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f899n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f874a.size();
        this.f889a = new int[size * 6];
        if (!c0032a.f879g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f890b = new ArrayList(size);
        this.f891c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f874a.get(i2);
            int i3 = i + 1;
            this.f889a[i] = p2.f854a;
            ArrayList arrayList = this.f890b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f855b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f965e : null);
            int[] iArr = this.f889a;
            iArr[i3] = p2.f856c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f857e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f858f;
            i += 6;
            iArr[i4] = p2.f859g;
            this.f891c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f892e = c0032a.f878f;
        this.f893f = c0032a.h;
        this.f894g = c0032a.f888r;
        this.h = c0032a.i;
        this.i = c0032a.f880j;
        this.f895j = c0032a.f881k;
        this.f896k = c0032a.f882l;
        this.f897l = c0032a.f883m;
        this.f898m = c0032a.f884n;
        this.f899n = c0032a.f885o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f889a);
        parcel.writeStringList(this.f890b);
        parcel.writeIntArray(this.f891c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f892e);
        parcel.writeString(this.f893f);
        parcel.writeInt(this.f894g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f895j);
        TextUtils.writeToParcel(this.f896k, parcel, 0);
        parcel.writeStringList(this.f897l);
        parcel.writeStringList(this.f898m);
        parcel.writeInt(this.f899n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f889a = parcel.createIntArray();
        this.f890b = parcel.createStringArrayList();
        this.f891c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f892e = parcel.readInt();
        this.f893f = parcel.readString();
        this.f894g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f895j = parcel.readInt();
        this.f896k = (CharSequence) creator.createFromParcel(parcel);
        this.f897l = parcel.createStringArrayList();
        this.f898m = parcel.createStringArrayList();
        this.f899n = parcel.readInt() != 0;
    }
}
