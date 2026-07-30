package r1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    public static final o f7459b = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7460a;

    public /* synthetic */ o(int i2) {
        this.f7460a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7460a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return g.f7439l;
                }
                int M7 = d4.c.M(parcel);
                boolean z7 = false;
                h hVar = null;
                while (parcel.dataPosition() < M7) {
                    int readInt = parcel.readInt();
                    char c7 = (char) readInt;
                    if (c7 == 1) {
                        hVar = (h) d4.c.h(parcel, readInt, h.CREATOR);
                    } else if (c7 != 2) {
                        d4.c.J(parcel, readInt);
                    } else {
                        z7 = d4.c.D(parcel, readInt);
                    }
                }
                d4.c.n(parcel, M7);
                return new g(hVar, z7);
            case 1:
                int M8 = d4.c.M(parcel);
                int i2 = 0;
                boolean z8 = true;
                int i5 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < M8) {
                    int readInt2 = parcel.readInt();
                    char c8 = (char) readInt2;
                    if (c8 == 1) {
                        i2 = d4.c.G(parcel, readInt2);
                    } else if (c8 == 2) {
                        i5 = d4.c.G(parcel, readInt2);
                    } else if (c8 == 3) {
                        i7 = d4.c.G(parcel, readInt2);
                    } else if (c8 != 4) {
                        d4.c.J(parcel, readInt2);
                    } else {
                        z8 = d4.c.D(parcel, readInt2);
                    }
                }
                d4.c.n(parcel, M8);
                return new h(i2, i5, i7, z8);
            case 2:
                int M9 = d4.c.M(parcel);
                String str = null;
                int i8 = 0;
                while (parcel.dataPosition() < M9) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 == 1) {
                        i8 = d4.c.G(parcel, readInt3);
                    } else if (c9 != 2) {
                        d4.c.J(parcel, readInt3);
                    } else {
                        str = d4.c.i(parcel, readInt3);
                    }
                }
                d4.c.n(parcel, M9);
                return new Scope(i8, str);
            default:
                int M10 = d4.c.M(parcel);
                String str2 = null;
                q1.b bVar = null;
                int i9 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < M10) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        i9 = d4.c.G(parcel, readInt4);
                    } else if (c10 == 2) {
                        str2 = d4.c.i(parcel, readInt4);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) d4.c.h(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        d4.c.J(parcel, readInt4);
                    } else {
                        bVar = (q1.b) d4.c.h(parcel, readInt4, q1.b.CREATOR);
                    }
                }
                d4.c.n(parcel, M10);
                return new Status(i9, str2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f7460a) {
            case 0:
                return new g[i2];
            case 1:
                return new h[i2];
            case 2:
                return new Scope[i2];
            default:
                return new Status[i2];
        }
    }
}
