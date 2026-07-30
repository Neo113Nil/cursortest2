package z4;

import androidx.room.o;
import b3.z;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10104b;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10106d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10103a = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10105c = new Object();

    public f(Executor executor, androidx.room.c cVar) {
        this.f10104b = executor;
        this.f10106d = cVar;
    }

    public final void a(i iVar) {
        switch (this.f10103a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (iVar.f10111d) {
                    synchronized (this.f10105c) {
                    }
                    this.f10104b.execute(new o(11, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.f10105c) {
                }
                this.f10104b.execute(new z(10, (Object) this, (Object) iVar, false));
                return;
            case 2:
                if (iVar.b() || iVar.f10111d) {
                    return;
                }
                synchronized (this.f10105c) {
                }
                this.f10104b.execute(new z(11, (Object) this, (Object) iVar, false));
                return;
            default:
                if (iVar.b()) {
                    synchronized (this.f10105c) {
                    }
                    this.f10104b.execute(new z(12, (Object) this, (Object) iVar, false));
                    return;
                }
                return;
        }
    }

    public f(Executor executor, a aVar) {
        this.f10104b = executor;
        this.f10106d = aVar;
    }

    public f(Executor executor, b bVar) {
        this.f10104b = executor;
        this.f10106d = bVar;
    }

    public f(Executor executor, e eVar) {
        this.f10104b = executor;
        this.f10106d = eVar;
    }
}
