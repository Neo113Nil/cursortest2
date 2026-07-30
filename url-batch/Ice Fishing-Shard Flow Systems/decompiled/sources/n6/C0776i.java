package n6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: n6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776i extends C0784q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7064c = AtomicIntegerFieldUpdater.newUpdater(C0776i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0776i(C0775h c0775h, Throwable th, boolean z7) {
        super(th, z7);
        if (th == null) {
            th = new CancellationException("Continuation " + c0775h + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
