package u8;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;
import l8.n;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final n f9686a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9687b;

    /* renamed from: c, reason: collision with root package name */
    public final w8.a f9688c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9689d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f9690e;

    public c(Context context, String str, Set set, w8.a aVar, Executor executor) {
        this.f9686a = new n(new g8.c(context, str));
        this.f9689d = set;
        this.f9690e = executor;
        this.f9688c = aVar;
        this.f9687b = context;
    }

    public final w7.n a() {
        if (!((UserManager) this.f9687b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return w.q("");
        }
        return w.i(this.f9690e, new b(0, this));
    }

    public final void b() {
        if (this.f9689d.size() <= 0) {
            w.q(null);
        } else if (!((UserManager) this.f9687b.getSystemService(UserManager.class)).isUserUnlocked()) {
            w.q(null);
        } else {
            w.i(this.f9690e, new b(1, this));
        }
    }
}
