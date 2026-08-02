package t2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197g extends C1204n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10419c = AtomicIntegerFieldUpdater.newUpdater(C1197g.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1197g(C1196f c1196f, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + c1196f + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
