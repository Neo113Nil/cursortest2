package T;

import E.AbstractC0005f;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: T.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093k implements Parcelable {
    public static final Parcelable.Creator<C0093k> CREATOR = new C0092j(1);

    /* renamed from: a, reason: collision with root package name */
    public int f2796a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f2797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2798c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2799d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2800e;

    public C0093k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2797b = uuid;
        this.f2798c = str;
        str2.getClass();
        this.f2799d = F.n(str2);
        this.f2800e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0093k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0093k c0093k = (C0093k) obj;
        return Objects.equals(this.f2798c, c0093k.f2798c) && Objects.equals(this.f2799d, c0093k.f2799d) && Objects.equals(this.f2797b, c0093k.f2797b) && Arrays.equals(this.f2800e, c0093k.f2800e);
    }

    public final int hashCode() {
        if (this.f2796a == 0) {
            int hashCode = this.f2797b.hashCode() * 31;
            String str = this.f2798c;
            this.f2796a = Arrays.hashCode(this.f2800e) + AbstractC0005f.f((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2799d);
        }
        return this.f2796a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        UUID uuid = this.f2797b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2798c);
        parcel.writeString(this.f2799d);
        parcel.writeByteArray(this.f2800e);
    }

    public C0093k(Parcel parcel) {
        this.f2797b = new UUID(parcel.readLong(), parcel.readLong());
        this.f2798c = parcel.readString();
        String readString = parcel.readString();
        String str = W.J.f3263a;
        this.f2799d = readString;
        this.f2800e = parcel.createByteArray();
    }
}
