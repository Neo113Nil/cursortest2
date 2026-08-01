package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032b implements Parcelable {
    public static final Parcelable.Creator<C0032b> CREATOR = new A0.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f981a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f982b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f983c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f984e;

    /* renamed from: f, reason: collision with root package name */
    public final String f985f;

    /* renamed from: g, reason: collision with root package name */
    public final int f986g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f987j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f988k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f989l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f990m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f991n;

    public C0032b(C0031a c0031a) {
        int size = c0031a.f966a.size();
        this.f981a = new int[size * 6];
        if (!c0031a.f971g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f982b = new ArrayList(size);
        this.f983c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0031a.f966a.get(i2);
            int i3 = i + 1;
            this.f981a[i] = p2.f946a;
            ArrayList arrayList = this.f982b;
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = p2.f947b;
            arrayList.add(abstractComponentCallbacksC0047q != null ? abstractComponentCallbacksC0047q.f1057e : null);
            int[] iArr = this.f981a;
            iArr[i3] = p2.f948c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f949e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f950f;
            i += 6;
            iArr[i4] = p2.f951g;
            this.f983c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f984e = c0031a.f970f;
        this.f985f = c0031a.h;
        this.f986g = c0031a.f980r;
        this.h = c0031a.i;
        this.i = c0031a.f972j;
        this.f987j = c0031a.f973k;
        this.f988k = c0031a.f974l;
        this.f989l = c0031a.f975m;
        this.f990m = c0031a.f976n;
        this.f991n = c0031a.f977o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f981a);
        parcel.writeStringList(this.f982b);
        parcel.writeIntArray(this.f983c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f984e);
        parcel.writeString(this.f985f);
        parcel.writeInt(this.f986g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f987j);
        TextUtils.writeToParcel(this.f988k, parcel, 0);
        parcel.writeStringList(this.f989l);
        parcel.writeStringList(this.f990m);
        parcel.writeInt(this.f991n ? 1 : 0);
    }

    public C0032b(Parcel parcel) {
        this.f981a = parcel.createIntArray();
        this.f982b = parcel.createStringArrayList();
        this.f983c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f984e = parcel.readInt();
        this.f985f = parcel.readString();
        this.f986g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f987j = parcel.readInt();
        this.f988k = (CharSequence) creator.createFromParcel(parcel);
        this.f989l = parcel.createStringArrayList();
        this.f990m = parcel.createStringArrayList();
        this.f991n = parcel.readInt() != 0;
    }
}
