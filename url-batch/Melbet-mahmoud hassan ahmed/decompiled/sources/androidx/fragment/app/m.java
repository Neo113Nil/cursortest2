package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.e;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final String f751f;

    /* renamed from: g, reason: collision with root package name */
    final String f752g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f753h;

    /* renamed from: i, reason: collision with root package name */
    final int f754i;

    /* renamed from: j, reason: collision with root package name */
    final int f755j;

    /* renamed from: k, reason: collision with root package name */
    final String f756k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f757l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f758m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f759n;

    /* renamed from: o, reason: collision with root package name */
    final Bundle f760o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f761p;

    /* renamed from: q, reason: collision with root package name */
    final int f762q;

    /* renamed from: r, reason: collision with root package name */
    Bundle f763r;

    /* renamed from: s, reason: collision with root package name */
    Fragment f764s;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i7) {
            return new m[i7];
        }
    }

    m(Parcel parcel) {
        this.f751f = parcel.readString();
        this.f752g = parcel.readString();
        this.f753h = parcel.readInt() != 0;
        this.f754i = parcel.readInt();
        this.f755j = parcel.readInt();
        this.f756k = parcel.readString();
        this.f757l = parcel.readInt() != 0;
        this.f758m = parcel.readInt() != 0;
        this.f759n = parcel.readInt() != 0;
        this.f760o = parcel.readBundle();
        this.f761p = parcel.readInt() != 0;
        this.f763r = parcel.readBundle();
        this.f762q = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f751f = fragment.getClass().getName();
        this.f752g = fragment.f599j;
        this.f753h = fragment.f607r;
        this.f754i = fragment.A;
        this.f755j = fragment.B;
        this.f756k = fragment.C;
        this.f757l = fragment.F;
        this.f758m = fragment.f606q;
        this.f759n = fragment.E;
        this.f760o = fragment.f600k;
        this.f761p = fragment.D;
        this.f762q = fragment.W.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.f764s == null) {
            Bundle bundle2 = this.f760o;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a7 = gVar.a(classLoader, this.f751f);
            this.f764s = a7;
            a7.d1(this.f760o);
            Bundle bundle3 = this.f763r;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f764s;
                bundle = this.f763r;
            } else {
                fragment = this.f764s;
                bundle = new Bundle();
            }
            fragment.f596g = bundle;
            Fragment fragment2 = this.f764s;
            fragment2.f599j = this.f752g;
            fragment2.f607r = this.f753h;
            fragment2.f609t = true;
            fragment2.A = this.f754i;
            fragment2.B = this.f755j;
            fragment2.C = this.f756k;
            fragment2.F = this.f757l;
            fragment2.f606q = this.f758m;
            fragment2.E = this.f759n;
            fragment2.D = this.f761p;
            fragment2.W = e.c.values()[this.f762q];
            if (j.M) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f764s);
            }
        }
        return this.f764s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f751f);
        sb.append(" (");
        sb.append(this.f752g);
        sb.append(")}:");
        if (this.f753h) {
            sb.append(" fromLayout");
        }
        if (this.f755j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f755j));
        }
        String str = this.f756k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f756k);
        }
        if (this.f757l) {
            sb.append(" retainInstance");
        }
        if (this.f758m) {
            sb.append(" removing");
        }
        if (this.f759n) {
            sb.append(" detached");
        }
        if (this.f761p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f751f);
        parcel.writeString(this.f752g);
        parcel.writeInt(this.f753h ? 1 : 0);
        parcel.writeInt(this.f754i);
        parcel.writeInt(this.f755j);
        parcel.writeString(this.f756k);
        parcel.writeInt(this.f757l ? 1 : 0);
        parcel.writeInt(this.f758m ? 1 : 0);
        parcel.writeInt(this.f759n ? 1 : 0);
        parcel.writeBundle(this.f760o);
        parcel.writeInt(this.f761p ? 1 : 0);
        parcel.writeBundle(this.f763r);
        parcel.writeInt(this.f762q);
    }
}
