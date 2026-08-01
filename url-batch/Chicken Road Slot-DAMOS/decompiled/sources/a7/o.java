package a7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    public static final o f337b = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f338a;

    public /* synthetic */ o(int i3) {
        this.f338a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f338a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return f.f317r;
                }
                int g02 = c6.f.g0(parcel);
                boolean z10 = false;
                g gVar = null;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        gVar = (g) c6.f.w(parcel, readInt, g.CREATOR);
                    } else if (c10 != 2) {
                        c6.f.c0(parcel, readInt);
                    } else {
                        z10 = c6.f.V(parcel, readInt);
                    }
                }
                c6.f.A(parcel, g02);
                return new f(gVar, z10);
            case 1:
                int g03 = c6.f.g0(parcel);
                int i3 = 0;
                boolean z11 = true;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i3 = c6.f.X(parcel, readInt2);
                    } else if (c11 == 2) {
                        i10 = c6.f.X(parcel, readInt2);
                    } else if (c11 == 3) {
                        i11 = c6.f.X(parcel, readInt2);
                    } else if (c11 != 4) {
                        c6.f.c0(parcel, readInt2);
                    } else {
                        z11 = c6.f.V(parcel, readInt2);
                    }
                }
                c6.f.A(parcel, g03);
                return new g(i3, i10, i11, z11);
            case 2:
                int g04 = c6.f.g0(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < g04) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i12 = c6.f.X(parcel, readInt3);
                    } else if (c12 != 2) {
                        c6.f.c0(parcel, readInt3);
                    } else {
                        str = c6.f.x(parcel, readInt3);
                    }
                }
                c6.f.A(parcel, g04);
                return new Scope(i12, str);
            default:
                int g05 = c6.f.g0(parcel);
                String str2 = null;
                z6.b bVar = null;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < g05) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i13 = c6.f.X(parcel, readInt4);
                    } else if (c13 == 2) {
                        str2 = c6.f.x(parcel, readInt4);
                    } else if (c13 == 3) {
                        pendingIntent = (PendingIntent) c6.f.w(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        c6.f.c0(parcel, readInt4);
                    } else {
                        bVar = (z6.b) c6.f.w(parcel, readInt4, z6.b.CREATOR);
                    }
                }
                c6.f.A(parcel, g05);
                return new Status(i13, str2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f338a) {
            case 0:
                return new f[i3];
            case 1:
                return new g[i3];
            case 2:
                return new Scope[i3];
            default:
                return new Status[i3];
        }
    }
}
