package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czq extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(19);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    private final int e;

    public czq(String str, String str2, int i, int i2, boolean z) {
        if (i == 3) {
            if (!str.equals(str2)) {
                throw new IllegalArgumentException("Active contacts backup account must be the same as requested account name when backup sync mode is MODE_SYNC_AND_BACKUP.");
            }
            i = 3;
        }
        if (i != 3 && i2 != 0) {
            throw new IllegalArgumentException("Backup scope must be BACKUP_SCOPE_UNKNOWN when backup sync mode is not MODE_SYNC_AND_BACKUP.");
        }
        this.a = str;
        this.b = str2;
        this.c = i;
        this.e = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czq)) {
            return false;
        }
        czq czqVar = (czq) obj;
        return Objects.equals(this.a, czqVar.a) && Objects.equals(this.b, czqVar.b) && this.c == czqVar.c && this.e == czqVar.e && this.d == czqVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.e), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 2, this.b);
        int i2 = this.c;
        oy.v(parcel, 3, i2);
        oy.v(parcel, 4, i2 == 3 ? this.e : 0);
        oy.s(parcel, 5, this.d);
        oy.r(parcel, q);
    }
}
