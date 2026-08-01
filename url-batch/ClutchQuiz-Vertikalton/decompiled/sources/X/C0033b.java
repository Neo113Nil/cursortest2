package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033b implements Parcelable {
    public static final Parcelable.Creator<C0033b> CREATOR = new C0.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1035c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1036e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1037f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1038g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1039j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1040k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1041l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1042m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1043n;

    public C0033b(C0032a c0032a) {
        int size = c0032a.f1018a.size();
        this.f1033a = new int[size * 6];
        if (!c0032a.f1023g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1034b = new ArrayList(size);
        this.f1035c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0032a.f1018a.get(i2);
            int i3 = i + 1;
            this.f1033a[i] = p2.f998a;
            ArrayList arrayList = this.f1034b;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f999b;
            arrayList.add(abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1109e : null);
            int[] iArr = this.f1033a;
            iArr[i3] = p2.f1000c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1001e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1002f;
            i += 6;
            iArr[i4] = p2.f1003g;
            this.f1035c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1036e = c0032a.f1022f;
        this.f1037f = c0032a.h;
        this.f1038g = c0032a.f1032r;
        this.h = c0032a.i;
        this.i = c0032a.f1024j;
        this.f1039j = c0032a.f1025k;
        this.f1040k = c0032a.f1026l;
        this.f1041l = c0032a.f1027m;
        this.f1042m = c0032a.f1028n;
        this.f1043n = c0032a.f1029o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1033a);
        parcel.writeStringList(this.f1034b);
        parcel.writeIntArray(this.f1035c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1036e);
        parcel.writeString(this.f1037f);
        parcel.writeInt(this.f1038g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1039j);
        TextUtils.writeToParcel(this.f1040k, parcel, 0);
        parcel.writeStringList(this.f1041l);
        parcel.writeStringList(this.f1042m);
        parcel.writeInt(this.f1043n ? 1 : 0);
    }

    public C0033b(Parcel parcel) {
        this.f1033a = parcel.createIntArray();
        this.f1034b = parcel.createStringArrayList();
        this.f1035c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1036e = parcel.readInt();
        this.f1037f = parcel.readString();
        this.f1038g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1039j = parcel.readInt();
        this.f1040k = (CharSequence) creator.createFromParcel(parcel);
        this.f1041l = parcel.createStringArrayList();
        this.f1042m = parcel.createStringArrayList();
        this.f1043n = parcel.readInt() != 0;
    }
}
