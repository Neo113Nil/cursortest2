package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195b implements Parcelable {
    public static final Parcelable.Creator<C0195b> CREATOR = new H.h(5);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4805a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4806b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4807c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4808d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4809e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4810f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4811g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4812h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f4813i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4814j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f4815k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4816l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f4817m;
    public final boolean n;

    public C0195b(C0193a c0193a) {
        int size = c0193a.f4788a.size();
        this.f4805a = new int[size * 6];
        if (!c0193a.f4794g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4806b = new ArrayList(size);
        this.f4807c = new int[size];
        this.f4808d = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            o0 o0Var = (o0) c0193a.f4788a.get(i5);
            int i6 = i4 + 1;
            this.f4805a[i4] = o0Var.f4940a;
            ArrayList arrayList = this.f4806b;
            F f4 = o0Var.f4941b;
            arrayList.add(f4 != null ? f4.mWho : null);
            int[] iArr = this.f4805a;
            iArr[i6] = o0Var.f4942c ? 1 : 0;
            iArr[i4 + 2] = o0Var.f4943d;
            iArr[i4 + 3] = o0Var.f4944e;
            int i7 = i4 + 5;
            iArr[i4 + 4] = o0Var.f4945f;
            i4 += 6;
            iArr[i7] = o0Var.f4946g;
            this.f4807c[i5] = o0Var.f4947h.ordinal();
            this.f4808d[i5] = o0Var.f4948i.ordinal();
        }
        this.f4809e = c0193a.f4793f;
        this.f4810f = c0193a.f4795h;
        this.f4811g = c0193a.f4803r;
        this.f4812h = c0193a.f4796i;
        this.f4813i = c0193a.f4797j;
        this.f4814j = c0193a.f4798k;
        this.f4815k = c0193a.f4799l;
        this.f4816l = c0193a.f4800m;
        this.f4817m = c0193a.n;
        this.n = c0193a.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f4805a);
        parcel.writeStringList(this.f4806b);
        parcel.writeIntArray(this.f4807c);
        parcel.writeIntArray(this.f4808d);
        parcel.writeInt(this.f4809e);
        parcel.writeString(this.f4810f);
        parcel.writeInt(this.f4811g);
        parcel.writeInt(this.f4812h);
        TextUtils.writeToParcel(this.f4813i, parcel, 0);
        parcel.writeInt(this.f4814j);
        TextUtils.writeToParcel(this.f4815k, parcel, 0);
        parcel.writeStringList(this.f4816l);
        parcel.writeStringList(this.f4817m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public C0195b(Parcel parcel) {
        this.f4805a = parcel.createIntArray();
        this.f4806b = parcel.createStringArrayList();
        this.f4807c = parcel.createIntArray();
        this.f4808d = parcel.createIntArray();
        this.f4809e = parcel.readInt();
        this.f4810f = parcel.readString();
        this.f4811g = parcel.readInt();
        this.f4812h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4813i = (CharSequence) creator.createFromParcel(parcel);
        this.f4814j = parcel.readInt();
        this.f4815k = (CharSequence) creator.createFromParcel(parcel);
        this.f4816l = parcel.createStringArrayList();
        this.f4817m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
