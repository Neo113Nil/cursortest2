package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dam implements cyl {
    private final Status a;
    private final ParcelFileDescriptor b;

    public dam(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.cna
    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cnc
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.cyl
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}
