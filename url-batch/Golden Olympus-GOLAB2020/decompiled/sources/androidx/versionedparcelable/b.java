package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f13201d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f13202e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13203f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13204g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13205h;

    /* renamed from: i, reason: collision with root package name */
    private int f13206i;

    /* renamed from: j, reason: collision with root package name */
    private int f13207j;

    /* renamed from: k, reason: collision with root package name */
    private int f13208k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f13202e.writeInt(-1);
        } else {
            this.f13202e.writeInt(bArr.length);
            this.f13202e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13202e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i4) {
        this.f13202e.writeInt(i4);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f13202e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f13202e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i4 = this.f13206i;
        if (i4 >= 0) {
            int i5 = this.f13201d.get(i4);
            int dataPosition = this.f13202e.dataPosition();
            this.f13202e.setDataPosition(i5);
            this.f13202e.writeInt(dataPosition - i5);
            this.f13202e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f13202e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f13207j;
        if (i4 == this.f13203f) {
            i4 = this.f13204g;
        }
        return new b(parcel, dataPosition, i4, this.f13205h + "  ", this.f13198a, this.f13199b, this.f13200c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f13202e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f13202e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f13202e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13202e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i4) {
        while (this.f13207j < this.f13204g) {
            int i5 = this.f13208k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f13202e.setDataPosition(this.f13207j);
            int readInt = this.f13202e.readInt();
            this.f13208k = this.f13202e.readInt();
            this.f13207j += readInt;
        }
        return this.f13208k == i4;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f13202e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f13202e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f13202e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i4) {
        a();
        this.f13206i = i4;
        this.f13201d.put(i4, this.f13202e.dataPosition());
        E(0);
        E(i4);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z4) {
        this.f13202e.writeInt(z4 ? 1 : 0);
    }

    private b(Parcel parcel, int i4, int i5, String str, androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f13201d = new SparseIntArray();
        this.f13206i = -1;
        this.f13208k = -1;
        this.f13202e = parcel;
        this.f13203f = i4;
        this.f13204g = i5;
        this.f13207j = i4;
        this.f13205h = str;
    }
}
