package c2;

import K1.p;
import S1.n;
import android.content.Context;
import android.os.UserManager;
import e2.InterfaceC0372a;
import java.util.Set;
import java.util.concurrent.Executor;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final n f4180a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4181b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0372a f4182c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4183d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4184e;

    public d(Context context, String str, Set set, InterfaceC0372a interfaceC0372a, Executor executor) {
        this.f4180a = new n(new P1.c(context, str));
        this.f4183d = set;
        this.f4184e = executor;
        this.f4182c = interfaceC0372a;
        this.f4181b = context;
    }

    public final p a() {
        if (!((UserManager) this.f4181b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return AbstractC1053a.w("");
        }
        return AbstractC1053a.i(this.f4184e, new CallableC0293c(0, this));
    }

    public final void b() {
        if (this.f4183d.size() <= 0) {
            AbstractC1053a.w(null);
        } else if (!((UserManager) this.f4181b.getSystemService(UserManager.class)).isUserUnlocked()) {
            AbstractC1053a.w(null);
        } else {
            AbstractC1053a.i(this.f4184e, new CallableC0293c(1, this));
        }
    }
}
