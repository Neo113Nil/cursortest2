package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dan extends cqd {
    private static volatile Bundle y;
    private static volatile Bundle z;
    private final HashMap A;
    public final String v;
    public final String w;
    public final Context x;

    static {
        Parcelable.Creator creator = cmn.CREATOR;
    }

    public dan(Context context, Looper looper, cmt cmtVar, cmu cmuVar, String str, cpr cprVar) {
        super(context.getApplicationContext(), looper, 5, cprVar, cmtVar, cmuVar);
        this.A = new HashMap();
        this.x = context;
        this.v = str;
        this.w = cprVar.d;
    }

    public static Status J(int i, Bundle bundle) {
        return new Status(i, null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"), null);
    }

    public final synchronized void I(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        dap.a = bundle.getBoolean("use_contactables_api", true);
        dbe.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        y = bundle.getBundle("config.email_type_map");
        z = bundle.getBundle("config.phone_type_map");
    }

    public final void K(cnr cnrVar, int i) {
        super.x();
        daj dajVar = new daj(cnrVar);
        try {
            daf L = L();
            cmn A = dih.A();
            Parcel a = L.a();
            bmt.d(a, dajVar);
            a.writeInt(0);
            a.writeInt(0);
            a.writeString(null);
            a.writeString(null);
            a.writeInt(i);
            bmt.c(a, A);
            L.c(305, a);
        } catch (RemoteException unused) {
            dajVar.c(8, null, null);
        }
    }

    public final daf L() {
        return (daf) super.v();
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return queryLocalInterface instanceof daf ? (daf) queryLocalInterface : new daf(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return cyj.F;
    }

    @Override // defpackage.cpo
    protected final Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.v);
        bundle.putString("real_client_package_name", this.w);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    @Override // defpackage.cpo
    public final void y() {
        HashMap hashMap = this.A;
        synchronized (hashMap) {
            if (m()) {
                for (dai daiVar : hashMap.values()) {
                    daiVar.a.c();
                    try {
                        L().e(daiVar, false, 0, dih.A());
                    } catch (RemoteException e) {
                        dih.z("Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        dih.z("PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.A.clear();
        }
        super.y();
    }

    @Override // defpackage.cpo
    protected final void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                I(bundle.getBundle("post_init_configuration"));
            }
        }
        super.z(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }
}
