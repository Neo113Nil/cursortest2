package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: f, reason: collision with root package name */
    public final int[] f398f;
    public final ArrayList g;
    public final int[] h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f399i;

    /* renamed from: j, reason: collision with root package name */
    public final int f400j;

    /* renamed from: k, reason: collision with root package name */
    public final String f401k;

    /* renamed from: l, reason: collision with root package name */
    public final int f402l;

    /* renamed from: m, reason: collision with root package name */
    public final int f403m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f404n;

    /* renamed from: o, reason: collision with root package name */
    public final int f405o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f406p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f407q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f408r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f409s;

    public c(a aVar) {
        int size = aVar.f378a.size();
        this.f398f = new int[size * 6];
        if (!aVar.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.f399i = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            r0 r0Var = (r0) aVar.f378a.get(i5);
            int i6 = i4 + 1;
            this.f398f[i4] = r0Var.f503a;
            ArrayList arrayList = this.g;
            u uVar = r0Var.f504b;
            arrayList.add(uVar != null ? uVar.f522j : null);
            int[] iArr = this.f398f;
            iArr[i6] = r0Var.c ? 1 : 0;
            iArr[i4 + 2] = r0Var.f505d;
            iArr[i4 + 3] = r0Var.f506e;
            int i7 = i4 + 5;
            iArr[i4 + 4] = r0Var.f507f;
            i4 += 6;
            iArr[i7] = r0Var.g;
            this.h[i5] = r0Var.h.ordinal();
            this.f399i[i5] = r0Var.f508i.ordinal();
        }
        this.f400j = aVar.f382f;
        this.f401k = aVar.h;
        this.f402l = aVar.f392r;
        this.f403m = aVar.f383i;
        this.f404n = aVar.f384j;
        this.f405o = aVar.f385k;
        this.f406p = aVar.f386l;
        this.f407q = aVar.f387m;
        this.f408r = aVar.f388n;
        this.f409s = aVar.f389o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f398f);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.f399i);
        parcel.writeInt(this.f400j);
        parcel.writeString(this.f401k);
        parcel.writeInt(this.f402l);
        parcel.writeInt(this.f403m);
        TextUtils.writeToParcel(this.f404n, parcel, 0);
        parcel.writeInt(this.f405o);
        TextUtils.writeToParcel(this.f406p, parcel, 0);
        parcel.writeStringList(this.f407q);
        parcel.writeStringList(this.f408r);
        parcel.writeInt(this.f409s ? 1 : 0);
    }

    public c(Parcel parcel) {
        this.f398f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.f399i = parcel.createIntArray();
        this.f400j = parcel.readInt();
        this.f401k = parcel.readString();
        this.f402l = parcel.readInt();
        this.f403m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f404n = (CharSequence) creator.createFromParcel(parcel);
        this.f405o = parcel.readInt();
        this.f406p = (CharSequence) creator.createFromParcel(parcel);
        this.f407q = parcel.createStringArrayList();
        this.f408r = parcel.createStringArrayList();
        this.f409s = parcel.readInt() != 0;
    }
}
