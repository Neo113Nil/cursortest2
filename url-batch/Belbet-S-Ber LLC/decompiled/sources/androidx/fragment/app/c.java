package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: f, reason: collision with root package name */
    public final int[] f513f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f514g;
    public final int[] h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int f515j;

    /* renamed from: k, reason: collision with root package name */
    public final String f516k;

    /* renamed from: l, reason: collision with root package name */
    public final int f517l;

    /* renamed from: m, reason: collision with root package name */
    public final int f518m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f519n;

    /* renamed from: o, reason: collision with root package name */
    public final int f520o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f521p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f522q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f523r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f524s;

    public c(a aVar) {
        int size = aVar.f493a.size();
        this.f513f = new int[size * 6];
        if (!aVar.f498g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f514g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            r0 r0Var = (r0) aVar.f493a.get(i4);
            int i5 = i + 1;
            this.f513f[i] = r0Var.f626a;
            ArrayList arrayList = this.f514g;
            u uVar = r0Var.f627b;
            arrayList.add(uVar != null ? uVar.f646j : null);
            int[] iArr = this.f513f;
            iArr[i5] = r0Var.f628c ? 1 : 0;
            iArr[i + 2] = r0Var.d;
            iArr[i + 3] = r0Var.f629e;
            int i6 = i + 5;
            iArr[i + 4] = r0Var.f630f;
            i += 6;
            iArr[i6] = r0Var.f631g;
            this.h[i4] = r0Var.h.ordinal();
            this.i[i4] = r0Var.i.ordinal();
        }
        this.f515j = aVar.f497f;
        this.f516k = aVar.h;
        this.f517l = aVar.f507r;
        this.f518m = aVar.i;
        this.f519n = aVar.f499j;
        this.f520o = aVar.f500k;
        this.f521p = aVar.f501l;
        this.f522q = aVar.f502m;
        this.f523r = aVar.f503n;
        this.f524s = aVar.f504o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f513f);
        parcel.writeStringList(this.f514g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.f515j);
        parcel.writeString(this.f516k);
        parcel.writeInt(this.f517l);
        parcel.writeInt(this.f518m);
        TextUtils.writeToParcel(this.f519n, parcel, 0);
        parcel.writeInt(this.f520o);
        TextUtils.writeToParcel(this.f521p, parcel, 0);
        parcel.writeStringList(this.f522q);
        parcel.writeStringList(this.f523r);
        parcel.writeInt(this.f524s ? 1 : 0);
    }

    public c(Parcel parcel) {
        this.f513f = parcel.createIntArray();
        this.f514g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.f515j = parcel.readInt();
        this.f516k = parcel.readString();
        this.f517l = parcel.readInt();
        this.f518m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f519n = (CharSequence) creator.createFromParcel(parcel);
        this.f520o = parcel.readInt();
        this.f521p = (CharSequence) creator.createFromParcel(parcel);
        this.f522q = parcel.createStringArrayList();
        this.f523r = parcel.createStringArrayList();
        this.f524s = parcel.readInt() != 0;
    }
}
