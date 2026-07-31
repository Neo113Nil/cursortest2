package q2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822i extends C0829p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7905c = AtomicIntegerFieldUpdater.newUpdater(C0822i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0822i(C0821h c0821h, Throwable th, boolean z3) {
        super(th, z3);
        if (th == null) {
            th = new CancellationException("Continuation " + c0821h + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
