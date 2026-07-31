package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.z;
import androidx.lifecycle.AbstractC1346l;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final int[] f12240b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f12241c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f12242d;

    /* renamed from: e, reason: collision with root package name */
    final int[] f12243e;

    /* renamed from: f, reason: collision with root package name */
    final int f12244f;

    /* renamed from: g, reason: collision with root package name */
    final String f12245g;

    /* renamed from: h, reason: collision with root package name */
    final int f12246h;

    /* renamed from: i, reason: collision with root package name */
    final int f12247i;

    /* renamed from: j, reason: collision with root package name */
    final CharSequence f12248j;

    /* renamed from: k, reason: collision with root package name */
    final int f12249k;

    /* renamed from: l, reason: collision with root package name */
    final CharSequence f12250l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList f12251m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f12252n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f12253o;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i4) {
            return new BackStackRecordState[i4];
        }
    }

    BackStackRecordState(C1326a c1326a) {
        int size = c1326a.f12533c.size();
        this.f12240b = new int[size * 6];
        if (!c1326a.f12539i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f12241c = new ArrayList(size);
        this.f12242d = new int[size];
        this.f12243e = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            z.a aVar = (z.a) c1326a.f12533c.get(i5);
            int i6 = i4 + 1;
            this.f12240b[i4] = aVar.f12550a;
            ArrayList arrayList = this.f12241c;
            Fragment fragment = aVar.f12551b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f12240b;
            iArr[i6] = aVar.f12552c ? 1 : 0;
            iArr[i4 + 2] = aVar.f12553d;
            iArr[i4 + 3] = aVar.f12554e;
            int i7 = i4 + 5;
            iArr[i4 + 4] = aVar.f12555f;
            i4 += 6;
            iArr[i7] = aVar.f12556g;
            this.f12242d[i5] = aVar.f12557h.ordinal();
            this.f12243e[i5] = aVar.f12558i.ordinal();
        }
        this.f12244f = c1326a.f12538h;
        this.f12245g = c1326a.f12541k;
        this.f12246h = c1326a.f12428v;
        this.f12247i = c1326a.f12542l;
        this.f12248j = c1326a.f12543m;
        this.f12249k = c1326a.f12544n;
        this.f12250l = c1326a.f12545o;
        this.f12251m = c1326a.f12546p;
        this.f12252n = c1326a.f12547q;
        this.f12253o = c1326a.f12548r;
    }

    private void a(C1326a c1326a) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 >= this.f12240b.length) {
                c1326a.f12538h = this.f12244f;
                c1326a.f12541k = this.f12245g;
                c1326a.f12539i = true;
                c1326a.f12542l = this.f12247i;
                c1326a.f12543m = this.f12248j;
                c1326a.f12544n = this.f12249k;
                c1326a.f12545o = this.f12250l;
                c1326a.f12546p = this.f12251m;
                c1326a.f12547q = this.f12252n;
                c1326a.f12548r = this.f12253o;
                return;
            }
            z.a aVar = new z.a();
            int i6 = i4 + 1;
            aVar.f12550a = this.f12240b[i4];
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1326a + " op #" + i5 + " base fragment #" + this.f12240b[i6]);
            }
            aVar.f12557h = AbstractC1346l.b.values()[this.f12242d[i5]];
            aVar.f12558i = AbstractC1346l.b.values()[this.f12243e[i5]];
            int[] iArr = this.f12240b;
            int i7 = i4 + 2;
            if (iArr[i6] == 0) {
                z4 = false;
            }
            aVar.f12552c = z4;
            int i8 = iArr[i7];
            aVar.f12553d = i8;
            int i9 = iArr[i4 + 3];
            aVar.f12554e = i9;
            int i10 = i4 + 5;
            int i11 = iArr[i4 + 4];
            aVar.f12555f = i11;
            i4 += 6;
            int i12 = iArr[i10];
            aVar.f12556g = i12;
            c1326a.f12534d = i8;
            c1326a.f12535e = i9;
            c1326a.f12536f = i11;
            c1326a.f12537g = i12;
            c1326a.e(aVar);
            i5++;
        }
    }

    public C1326a b(FragmentManager fragmentManager) {
        C1326a c1326a = new C1326a(fragmentManager);
        a(c1326a);
        c1326a.f12428v = this.f12246h;
        for (int i4 = 0; i4 < this.f12241c.size(); i4++) {
            String str = (String) this.f12241c.get(i4);
            if (str != null) {
                ((z.a) c1326a.f12533c.get(i4)).f12551b = fragmentManager.e0(str);
            }
        }
        c1326a.r(1);
        return c1326a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f12240b);
        parcel.writeStringList(this.f12241c);
        parcel.writeIntArray(this.f12242d);
        parcel.writeIntArray(this.f12243e);
        parcel.writeInt(this.f12244f);
        parcel.writeString(this.f12245g);
        parcel.writeInt(this.f12246h);
        parcel.writeInt(this.f12247i);
        TextUtils.writeToParcel(this.f12248j, parcel, 0);
        parcel.writeInt(this.f12249k);
        TextUtils.writeToParcel(this.f12250l, parcel, 0);
        parcel.writeStringList(this.f12251m);
        parcel.writeStringList(this.f12252n);
        parcel.writeInt(this.f12253o ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f12240b = parcel.createIntArray();
        this.f12241c = parcel.createStringArrayList();
        this.f12242d = parcel.createIntArray();
        this.f12243e = parcel.createIntArray();
        this.f12244f = parcel.readInt();
        this.f12245g = parcel.readString();
        this.f12246h = parcel.readInt();
        this.f12247i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f12248j = (CharSequence) creator.createFromParcel(parcel);
        this.f12249k = parcel.readInt();
        this.f12250l = (CharSequence) creator.createFromParcel(parcel);
        this.f12251m = parcel.createStringArrayList();
        this.f12252n = parcel.createStringArrayList();
        this.f12253o = parcel.readInt() != 0;
    }
}
