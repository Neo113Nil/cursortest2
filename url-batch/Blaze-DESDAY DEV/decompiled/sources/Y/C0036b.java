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
    public final int[] f1054a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1055b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1056c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1057e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1058f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1059g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1060j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1061k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1062l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1063m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1064n;

    public C0036b(C0035a c0035a) {
        int size = c0035a.f1039a.size();
        this.f1054a = new int[size * 6];
        if (!c0035a.f1044g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1055b = new ArrayList(size);
        this.f1056c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0035a.f1039a.get(i2);
            int i3 = i + 1;
            this.f1054a[i] = p2.f1019a;
            ArrayList arrayList = this.f1055b;
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = p2.f1020b;
            arrayList.add(abstractComponentCallbacksC0051q != null ? abstractComponentCallbacksC0051q.f1130e : null);
            int[] iArr = this.f1054a;
            iArr[i3] = p2.f1021c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1022e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1023f;
            i += 6;
            iArr[i4] = p2.f1024g;
            this.f1056c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1057e = c0035a.f1043f;
        this.f1058f = c0035a.h;
        this.f1059g = c0035a.f1053r;
        this.h = c0035a.i;
        this.i = c0035a.f1045j;
        this.f1060j = c0035a.f1046k;
        this.f1061k = c0035a.f1047l;
        this.f1062l = c0035a.f1048m;
        this.f1063m = c0035a.f1049n;
        this.f1064n = c0035a.f1050o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1054a);
        parcel.writeStringList(this.f1055b);
        parcel.writeIntArray(this.f1056c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1057e);
        parcel.writeString(this.f1058f);
        parcel.writeInt(this.f1059g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1060j);
        TextUtils.writeToParcel(this.f1061k, parcel, 0);
        parcel.writeStringList(this.f1062l);
        parcel.writeStringList(this.f1063m);
        parcel.writeInt(this.f1064n ? 1 : 0);
    }

    public C0036b(Parcel parcel) {
        this.f1054a = parcel.createIntArray();
        this.f1055b = parcel.createStringArrayList();
        this.f1056c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1057e = parcel.readInt();
        this.f1058f = parcel.readString();
        this.f1059g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1060j = parcel.readInt();
        this.f1061k = (CharSequence) creator.createFromParcel(parcel);
        this.f1062l = parcel.createStringArrayList();
        this.f1063m = parcel.createStringArrayList();
        this.f1064n = parcel.readInt() != 0;
    }
}
