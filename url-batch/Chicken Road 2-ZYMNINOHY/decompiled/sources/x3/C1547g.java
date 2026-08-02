package x3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547g extends C1554n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16037c = AtomicIntegerFieldUpdater.newUpdater(C1547g.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1547g(C1546f c1546f, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + c1546f + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
