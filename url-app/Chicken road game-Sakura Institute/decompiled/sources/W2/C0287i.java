package W2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: W2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287i extends C0294p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4268c = AtomicIntegerFieldUpdater.newUpdater(C0287i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0287i(C0286h c0286h, Throwable th, boolean z4) {
        super(th, z4);
        if (th == null) {
            th = new CancellationException("Continuation " + c0286h + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
