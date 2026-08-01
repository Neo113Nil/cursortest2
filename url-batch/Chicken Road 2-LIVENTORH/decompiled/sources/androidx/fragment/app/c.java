package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: f, reason: collision with root package name */
    public final int[] f398f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f399g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f400h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int f401j;

    /* renamed from: k, reason: collision with root package name */
    public final String f402k;

    /* renamed from: l, reason: collision with root package name */
    public final int f403l;

    /* renamed from: m, reason: collision with root package name */
    public final int f404m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f405n;

    /* renamed from: o, reason: collision with root package name */
    public final int f406o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f407p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f408q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f409r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f410s;

    public c(a aVar) {
        int size = aVar.f377a.size();
        this.f398f = new int[size * 6];
        if (!aVar.f382g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f399g = new ArrayList(size);
        this.f400h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            r0 r0Var = (r0) aVar.f377a.get(i4);
            int i5 = i + 1;
            this.f398f[i] = r0Var.f514a;
            ArrayList arrayList = this.f399g;
            u uVar = r0Var.f515b;
            arrayList.add(uVar != null ? uVar.f538j : null);
            int[] iArr = this.f398f;
            iArr[i5] = r0Var.f516c ? 1 : 0;
            iArr[i + 2] = r0Var.d;
            iArr[i + 3] = r0Var.f517e;
            int i6 = i + 5;
            iArr[i + 4] = r0Var.f518f;
            i += 6;
            iArr[i6] = r0Var.f519g;
            this.f400h[i4] = r0Var.f520h.ordinal();
            this.i[i4] = r0Var.i.ordinal();
        }
        this.f401j = aVar.f381f;
        this.f402k = aVar.f383h;
        this.f403l = aVar.f392r;
        this.f404m = aVar.i;
        this.f405n = aVar.f384j;
        this.f406o = aVar.f385k;
        this.f407p = aVar.f386l;
        this.f408q = aVar.f387m;
        this.f409r = aVar.f388n;
        this.f410s = aVar.f389o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f398f);
        parcel.writeStringList(this.f399g);
        parcel.writeIntArray(this.f400h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.f401j);
        parcel.writeString(this.f402k);
        parcel.writeInt(this.f403l);
        parcel.writeInt(this.f404m);
        TextUtils.writeToParcel(this.f405n, parcel, 0);
        parcel.writeInt(this.f406o);
        TextUtils.writeToParcel(this.f407p, parcel, 0);
        parcel.writeStringList(this.f408q);
        parcel.writeStringList(this.f409r);
        parcel.writeInt(this.f410s ? 1 : 0);
    }

    public c(Parcel parcel) {
        this.f398f = parcel.createIntArray();
        this.f399g = parcel.createStringArrayList();
        this.f400h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.f401j = parcel.readInt();
        this.f402k = parcel.readString();
        this.f403l = parcel.readInt();
        this.f404m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f405n = (CharSequence) creator.createFromParcel(parcel);
        this.f406o = parcel.readInt();
        this.f407p = (CharSequence) creator.createFromParcel(parcel);
        this.f408q = parcel.createStringArrayList();
        this.f409r = parcel.createStringArrayList();
        this.f410s = parcel.readInt() != 0;
    }
}
