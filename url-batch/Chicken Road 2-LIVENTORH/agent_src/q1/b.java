package q1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(16);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Boolean I;
    public Integer J;

    /* renamed from: f, reason: collision with root package name */
    public int f3082f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f3083g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f3084h;
    public Integer i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f3085j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f3086k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f3087l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f3088m;

    /* renamed from: n, reason: collision with root package name */
    public int f3089n;

    /* renamed from: o, reason: collision with root package name */
    public String f3090o;

    /* renamed from: p, reason: collision with root package name */
    public int f3091p;

    /* renamed from: q, reason: collision with root package name */
    public int f3092q;

    /* renamed from: r, reason: collision with root package name */
    public int f3093r;

    /* renamed from: s, reason: collision with root package name */
    public Locale f3094s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f3095t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f3096u;

    /* renamed from: v, reason: collision with root package name */
    public int f3097v;

    /* renamed from: w, reason: collision with root package name */
    public int f3098w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f3099x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f3100y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f3101z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3082f);
        parcel.writeSerializable(this.f3083g);
        parcel.writeSerializable(this.f3084h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.f3085j);
        parcel.writeSerializable(this.f3086k);
        parcel.writeSerializable(this.f3087l);
        parcel.writeSerializable(this.f3088m);
        parcel.writeInt(this.f3089n);
        parcel.writeString(this.f3090o);
        parcel.writeInt(this.f3091p);
        parcel.writeInt(this.f3092q);
        parcel.writeInt(this.f3093r);
        CharSequence charSequence = this.f3095t;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f3096u;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f3097v);
        parcel.writeSerializable(this.f3099x);
        parcel.writeSerializable(this.f3101z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.f3100y);
        parcel.writeSerializable(this.f3094s);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.J);
    }
}
