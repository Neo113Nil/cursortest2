package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211b implements Parcelable {
    public static final Parcelable.Creator<C0211b> CREATOR = new I1.c(4);

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3699d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3700e;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f3701i;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f3702l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3703m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3704n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3705o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3706p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f3707q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3708r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f3709s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3710t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f3711u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3712v;

    public C0211b(C0210a c0210a) {
        int size = c0210a.f3682a.size();
        this.f3699d = new int[size * 6];
        if (!c0210a.f3688g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3700e = new ArrayList(size);
        this.f3701i = new int[size];
        this.f3702l = new int[size];
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Z z7 = (Z) c0210a.f3682a.get(i5);
            int i7 = i2 + 1;
            this.f3699d[i2] = z7.f3673a;
            ArrayList arrayList = this.f3700e;
            ComponentCallbacksC0228t componentCallbacksC0228t = z7.f3674b;
            arrayList.add(componentCallbacksC0228t != null ? componentCallbacksC0228t.f3803m : null);
            int[] iArr = this.f3699d;
            iArr[i7] = z7.f3675c ? 1 : 0;
            iArr[i2 + 2] = z7.f3676d;
            iArr[i2 + 3] = z7.f3677e;
            int i8 = i2 + 5;
            iArr[i2 + 4] = z7.f3678f;
            i2 += 6;
            iArr[i8] = z7.f3679g;
            this.f3701i[i5] = z7.f3680h.ordinal();
            this.f3702l[i5] = z7.f3681i.ordinal();
        }
        this.f3703m = c0210a.f3687f;
        this.f3704n = c0210a.f3689h;
        this.f3705o = c0210a.f3698r;
        this.f3706p = c0210a.f3690i;
        this.f3707q = c0210a.j;
        this.f3708r = c0210a.f3691k;
        this.f3709s = c0210a.f3692l;
        this.f3710t = c0210a.f3693m;
        this.f3711u = c0210a.f3694n;
        this.f3712v = c0210a.f3695o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f3699d);
        parcel.writeStringList(this.f3700e);
        parcel.writeIntArray(this.f3701i);
        parcel.writeIntArray(this.f3702l);
        parcel.writeInt(this.f3703m);
        parcel.writeString(this.f3704n);
        parcel.writeInt(this.f3705o);
        parcel.writeInt(this.f3706p);
        TextUtils.writeToParcel(this.f3707q, parcel, 0);
        parcel.writeInt(this.f3708r);
        TextUtils.writeToParcel(this.f3709s, parcel, 0);
        parcel.writeStringList(this.f3710t);
        parcel.writeStringList(this.f3711u);
        parcel.writeInt(this.f3712v ? 1 : 0);
    }

    public C0211b(Parcel parcel) {
        this.f3699d = parcel.createIntArray();
        this.f3700e = parcel.createStringArrayList();
        this.f3701i = parcel.createIntArray();
        this.f3702l = parcel.createIntArray();
        this.f3703m = parcel.readInt();
        this.f3704n = parcel.readString();
        this.f3705o = parcel.readInt();
        this.f3706p = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3707q = (CharSequence) creator.createFromParcel(parcel);
        this.f3708r = parcel.readInt();
        this.f3709s = (CharSequence) creator.createFromParcel(parcel);
        this.f3710t = parcel.createStringArrayList();
        this.f3711u = parcel.createStringArrayList();
        this.f3712v = parcel.readInt() != 0;
    }
}
