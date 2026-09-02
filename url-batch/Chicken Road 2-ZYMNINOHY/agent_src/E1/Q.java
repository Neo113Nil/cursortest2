package E1;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractBinderC0310e;
import com.google.android.gms.internal.play_billing.AbstractC0313f;
import com.google.android.gms.internal.play_billing.H1;

/* loaded from: classes.dex */
public final class Q extends AbstractBinderC0310e {

    /* renamed from: b, reason: collision with root package name */
    public final H1 f520b;

    public Q(H1 h1) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 0);
        this.f520b = h1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0310e
    public final boolean e(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        AbstractC0313f.b(parcel);
        this.f520b.a(Integer.valueOf(readInt));
        return true;
    }
}
