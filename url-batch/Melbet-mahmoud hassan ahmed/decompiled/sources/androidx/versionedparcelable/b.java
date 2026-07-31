package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f1374d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f1375e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1376f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1377g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1378h;

    /* renamed from: i, reason: collision with root package name */
    private int f1379i;

    /* renamed from: j, reason: collision with root package name */
    private int f1380j;

    /* renamed from: k, reason: collision with root package name */
    private int f1381k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new h.a(), new h.a(), new h.a());
    }

    private b(Parcel parcel, int i7, int i8, String str, h.a<String, Method> aVar, h.a<String, Method> aVar2, h.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1374d = new SparseIntArray();
        this.f1379i = -1;
        this.f1380j = 0;
        this.f1381k = -1;
        this.f1375e = parcel;
        this.f1376f = i7;
        this.f1377g = i8;
        this.f1380j = i7;
        this.f1378h = str;
    }

    @Override // androidx.versionedparcelable.a
    public String D() {
        return this.f1375e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public IBinder F() {
        return this.f1375e.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.a
    public void J(int i7) {
        a();
        this.f1379i = i7;
        this.f1374d.put(i7, this.f1375e.dataPosition());
        X(0);
        X(i7);
    }

    @Override // androidx.versionedparcelable.a
    public void L(boolean z6) {
        this.f1375e.writeInt(z6 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void N(Bundle bundle) {
        this.f1375e.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.a
    public void P(byte[] bArr) {
        if (bArr == null) {
            this.f1375e.writeInt(-1);
        } else {
            this.f1375e.writeInt(bArr.length);
            this.f1375e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void R(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1375e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void V(float f7) {
        this.f1375e.writeFloat(f7);
    }

    @Override // androidx.versionedparcelable.a
    public void X(int i7) {
        this.f1375e.writeInt(i7);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i7 = this.f1379i;
        if (i7 >= 0) {
            int i8 = this.f1374d.get(i7);
            int dataPosition = this.f1375e.dataPosition();
            this.f1375e.setDataPosition(i8);
            this.f1375e.writeInt(dataPosition - i8);
            this.f1375e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void a0(long j7) {
        this.f1375e.writeLong(j7);
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f1375e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f1380j;
        if (i7 == this.f1376f) {
            i7 = this.f1377g;
        }
        return new b(parcel, dataPosition, i7, this.f1378h + "  ", this.f1370a, this.f1371b, this.f1372c);
    }

    @Override // androidx.versionedparcelable.a
    public void c0(Parcelable parcelable) {
        this.f1375e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void g0(String str) {
        this.f1375e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public boolean h() {
        return this.f1375e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public void i0(IBinder iBinder) {
        this.f1375e.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.a
    public Bundle j() {
        return this.f1375e.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public byte[] l() {
        int readInt = this.f1375e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1375e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1375e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean q(int i7) {
        while (this.f1380j < this.f1377g) {
            int i8 = this.f1381k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f1375e.setDataPosition(this.f1380j);
            int readInt = this.f1375e.readInt();
            this.f1381k = this.f1375e.readInt();
            this.f1380j += readInt;
        }
        return this.f1381k == i7;
    }

    @Override // androidx.versionedparcelable.a
    public float r() {
        return this.f1375e.readFloat();
    }

    @Override // androidx.versionedparcelable.a
    public int u() {
        return this.f1375e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public long x() {
        return this.f1375e.readLong();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T z() {
        return (T) this.f1375e.readParcelable(getClass().getClassLoader());
    }
}
