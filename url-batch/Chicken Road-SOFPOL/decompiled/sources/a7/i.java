package a7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f264c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(h hVar, Throwable th, boolean z3) {
        super(th, z3);
        if (th == null) {
            th = new CancellationException("Continuation " + hVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
