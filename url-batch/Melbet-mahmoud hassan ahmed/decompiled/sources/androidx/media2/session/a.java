package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: androidx.media2.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0021a extends Binder implements a {

        /* renamed from: androidx.media2.session.a$a$a, reason: collision with other inner class name */
        private static class C0022a implements a {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f1226f;

            C0022a(IBinder iBinder) {
                this.f1226f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1226f;
            }
        }

        public static a E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0022a(iBinder) : (a) queryLocalInterface;
        }
    }
}
