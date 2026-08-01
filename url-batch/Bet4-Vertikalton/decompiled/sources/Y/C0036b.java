package Y;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036b implements Parcelable {
    public static final Parcelable.Creator<C0036b> CREATOR = new Q.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1027a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1028b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1029c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1030e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1031f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1032g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1033j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1034k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1035l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1036m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1037n;

    public C0036b(C0035a c0035a) {
        int size = c0035a.f1012a.size();
        this.f1027a = new int[size * 6];
        if (!c0035a.f1017g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1028b = new ArrayList(size);
        this.f1029c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0035a.f1012a.get(i2);
            int i3 = i + 1;
            this.f1027a[i] = p2.f992a;
            ArrayList arrayList = this.f1028b;
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = p2.f993b;
            arrayList.add(abstractComponentCallbacksC0051q != null ? abstractComponentCallbacksC0051q.f1103e : null);
            int[] iArr = this.f1027a;
            iArr[i3] = p2.f994c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f995e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f996f;
            i += 6;
            iArr[i4] = p2.f997g;
            this.f1029c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1030e = c0035a.f1016f;
        this.f1031f = c0035a.h;
        this.f1032g = c0035a.f1026r;
        this.h = c0035a.i;
        this.i = c0035a.f1018j;
        this.f1033j = c0035a.f1019k;
        this.f1034k = c0035a.f1020l;
        this.f1035l = c0035a.f1021m;
        this.f1036m = c0035a.f1022n;
        this.f1037n = c0035a.f1023o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1027a);
        parcel.writeStringList(this.f1028b);
        parcel.writeIntArray(this.f1029c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1030e);
        parcel.writeString(this.f1031f);
        parcel.writeInt(this.f1032g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1033j);
        TextUtils.writeToParcel(this.f1034k, parcel, 0);
        parcel.writeStringList(this.f1035l);
        parcel.writeStringList(this.f1036m);
        parcel.writeInt(this.f1037n ? 1 : 0);
    }

    public C0036b(Parcel parcel) {
        this.f1027a = parcel.createIntArray();
        this.f1028b = parcel.createStringArrayList();
        this.f1029c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1030e = parcel.readInt();
        this.f1031f = parcel.readString();
        this.f1032g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1033j = parcel.readInt();
        this.f1034k = (CharSequence) creator.createFromParcel(parcel);
        this.f1035l = parcel.createStringArrayList();
        this.f1036m = parcel.createStringArrayList();
        this.f1037n = parcel.readInt() != 0;
    }
}
