package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dat extends cyp {
    final /* synthetic */ String a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dat(cmv cmvVar, String str, int i) {
        super(cmvVar);
        this.a = str;
        this.h = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ cnc a(Status status) {
        return new das(status);
    }

    @Override // defpackage.cnq
    protected final /* bridge */ /* synthetic */ void b(cmh cmhVar) {
        cqq cqqVar;
        dan danVar = (dan) cmhVar;
        dak dakVar = new dak(this);
        int i = this.h;
        String str = this.a;
        cqq cqqVar2 = null;
        try {
            daf L = danVar.L();
            Context context = danVar.x;
            cmn A = dih.A();
            Parcel a = L.a();
            bmt.d(a, dakVar);
            a.writeString(str);
            a.writeString(null);
            a.writeInt(i);
            a.writeInt(1);
            bmt.c(a, A);
            Parcel b = L.b(505, a);
            IBinder readStrongBinder = b.readStrongBinder();
            if (readStrongBinder == null) {
                cqqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                cqqVar = queryLocalInterface instanceof cqq ? (cqq) queryLocalInterface : new cqq(readStrongBinder);
            }
            b.recycle();
            cqqVar2 = cqqVar;
        } catch (RemoteException unused) {
            dakVar.d(8, null, null, null);
        }
        synchronized (this.c) {
            this.g = cqqVar2;
        }
    }
}
