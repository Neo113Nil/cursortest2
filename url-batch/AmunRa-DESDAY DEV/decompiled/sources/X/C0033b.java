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
    public final int[] f938a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f939b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f940c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f941e;

    /* renamed from: f, reason: collision with root package name */
    public final String f942f;

    /* renamed from: g, reason: collision with root package name */
    public final int f943g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f944j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f945k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f946l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f947m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f948n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f923a.size();
        this.f938a = new int[size * 6];
        if (!c0032a.f928g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f939b = new ArrayList(size);
        this.f940c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f923a.get(i2);
            int i3 = i + 1;
            this.f938a[i] = p2.f903a;
            ArrayList arrayList = this.f939b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f904b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1011e : null);
            int[] iArr = this.f938a;
            iArr[i3] = p2.f905c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f906e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f907f;
            i += 6;
            iArr[i4] = p2.f908g;
            this.f940c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f941e = c0032a.f927f;
        this.f942f = c0032a.h;
        this.f943g = c0032a.f937r;
        this.h = c0032a.i;
        this.i = c0032a.f929j;
        this.f944j = c0032a.f930k;
        this.f945k = c0032a.f931l;
        this.f946l = c0032a.f932m;
        this.f947m = c0032a.f933n;
        this.f948n = c0032a.f934o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f938a);
        parcel.writeStringList(this.f939b);
        parcel.writeIntArray(this.f940c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f941e);
        parcel.writeString(this.f942f);
        parcel.writeInt(this.f943g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f944j);
        TextUtils.writeToParcel(this.f945k, parcel, 0);
        parcel.writeStringList(this.f946l);
        parcel.writeStringList(this.f947m);
        parcel.writeInt(this.f948n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f938a = parcel.createIntArray();
        this.f939b = parcel.createStringArrayList();
        this.f940c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f941e = parcel.readInt();
        this.f942f = parcel.readString();
        this.f943g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f944j = parcel.readInt();
        this.f945k = (CharSequence) creator.createFromParcel(parcel);
        this.f946l = parcel.createStringArrayList();
        this.f947m = parcel.createStringArrayList();
        this.f948n = parcel.readInt() != 0;
    }
}
