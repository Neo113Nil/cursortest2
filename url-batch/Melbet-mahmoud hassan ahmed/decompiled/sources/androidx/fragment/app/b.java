package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.e;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final int[] f642f;

    /* renamed from: g, reason: collision with root package name */
    final ArrayList<String> f643g;

    /* renamed from: h, reason: collision with root package name */
    final int[] f644h;

    /* renamed from: i, reason: collision with root package name */
    final int[] f645i;

    /* renamed from: j, reason: collision with root package name */
    final int f646j;

    /* renamed from: k, reason: collision with root package name */
    final int f647k;

    /* renamed from: l, reason: collision with root package name */
    final String f648l;

    /* renamed from: m, reason: collision with root package name */
    final int f649m;

    /* renamed from: n, reason: collision with root package name */
    final int f650n;

    /* renamed from: o, reason: collision with root package name */
    final CharSequence f651o;

    /* renamed from: p, reason: collision with root package name */
    final int f652p;

    /* renamed from: q, reason: collision with root package name */
    final CharSequence f653q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList<String> f654r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList<String> f655s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f656t;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    public b(Parcel parcel) {
        this.f642f = parcel.createIntArray();
        this.f643g = parcel.createStringArrayList();
        this.f644h = parcel.createIntArray();
        this.f645i = parcel.createIntArray();
        this.f646j = parcel.readInt();
        this.f647k = parcel.readInt();
        this.f648l = parcel.readString();
        this.f649m = parcel.readInt();
        this.f650n = parcel.readInt();
        this.f651o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f652p = parcel.readInt();
        this.f653q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f654r = parcel.createStringArrayList();
        this.f655s = parcel.createStringArrayList();
        this.f656t = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f765a.size();
        this.f642f = new int[size * 5];
        if (!aVar.f772h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f643g = new ArrayList<>(size);
        this.f644h = new int[size];
        this.f645i = new int[size];
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            n.a aVar2 = aVar.f765a.get(i7);
            int i9 = i8 + 1;
            this.f642f[i8] = aVar2.f783a;
            ArrayList<String> arrayList = this.f643g;
            Fragment fragment = aVar2.f784b;
            arrayList.add(fragment != null ? fragment.f599j : null);
            int[] iArr = this.f642f;
            int i10 = i9 + 1;
            iArr[i9] = aVar2.f785c;
            int i11 = i10 + 1;
            iArr[i10] = aVar2.f786d;
            int i12 = i11 + 1;
            iArr[i11] = aVar2.f787e;
            iArr[i12] = aVar2.f788f;
            this.f644h[i7] = aVar2.f789g.ordinal();
            this.f645i[i7] = aVar2.f790h.ordinal();
            i7++;
            i8 = i12 + 1;
        }
        this.f646j = aVar.f770f;
        this.f647k = aVar.f771g;
        this.f648l = aVar.f774j;
        this.f649m = aVar.f641u;
        this.f650n = aVar.f775k;
        this.f651o = aVar.f776l;
        this.f652p = aVar.f777m;
        this.f653q = aVar.f778n;
        this.f654r = aVar.f779o;
        this.f655s = aVar.f780p;
        this.f656t = aVar.f781q;
    }

    public androidx.fragment.app.a a(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.f642f.length) {
            n.a aVar2 = new n.a();
            int i9 = i7 + 1;
            aVar2.f783a = this.f642f[i7];
            if (j.M) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i8 + " base fragment #" + this.f642f[i9]);
            }
            String str = this.f643g.get(i8);
            aVar2.f784b = str != null ? jVar.f692l.get(str) : null;
            aVar2.f789g = e.c.values()[this.f644h[i8]];
            aVar2.f790h = e.c.values()[this.f645i[i8]];
            int[] iArr = this.f642f;
            int i10 = i9 + 1;
            int i11 = iArr[i9];
            aVar2.f785c = i11;
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            aVar2.f786d = i13;
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            aVar2.f787e = i15;
            int i16 = iArr[i14];
            aVar2.f788f = i16;
            aVar.f766b = i11;
            aVar.f767c = i13;
            aVar.f768d = i15;
            aVar.f769e = i16;
            aVar.c(aVar2);
            i8++;
            i7 = i14 + 1;
        }
        aVar.f770f = this.f646j;
        aVar.f771g = this.f647k;
        aVar.f774j = this.f648l;
        aVar.f641u = this.f649m;
        aVar.f772h = true;
        aVar.f775k = this.f650n;
        aVar.f776l = this.f651o;
        aVar.f777m = this.f652p;
        aVar.f778n = this.f653q;
        aVar.f779o = this.f654r;
        aVar.f780p = this.f655s;
        aVar.f781q = this.f656t;
        aVar.h(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f642f);
        parcel.writeStringList(this.f643g);
        parcel.writeIntArray(this.f644h);
        parcel.writeIntArray(this.f645i);
        parcel.writeInt(this.f646j);
        parcel.writeInt(this.f647k);
        parcel.writeString(this.f648l);
        parcel.writeInt(this.f649m);
        parcel.writeInt(this.f650n);
        TextUtils.writeToParcel(this.f651o, parcel, 0);
        parcel.writeInt(this.f652p);
        TextUtils.writeToParcel(this.f653q, parcel, 0);
        parcel.writeStringList(this.f654r);
        parcel.writeStringList(this.f655s);
        parcel.writeInt(this.f656t ? 1 : 0);
    }
}
