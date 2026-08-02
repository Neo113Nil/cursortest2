package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cli extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(6);
    public final String a;

    @Deprecated
    public final int b;
    public final boolean c;
    private final long d;

    public cli(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.d = j;
        this.c = z;
    }

    public final long a() {
        long j = this.d;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        cli cliVar;
        return (obj instanceof cli) && (cliVar = (cli) obj) != null && Objects.equals(this.a, cliVar.a) && a() == cliVar.a() && this.c == cliVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a()), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        oy.ax("name", this.a, arrayList);
        oy.ax("version", Long.valueOf(a()), arrayList);
        oy.ax("is_fully_rolled_out", Boolean.valueOf(this.c), arrayList);
        return oy.aw(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.v(parcel, 2, this.b);
        oy.w(parcel, 3, a());
        oy.s(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
