package k2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: k2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537i extends C0544p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5366c = AtomicIntegerFieldUpdater.newUpdater(C0537i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0537i(C0536h c0536h, Throwable th, boolean z3) {
        super(th, z3);
        if (th == null) {
            th = new CancellationException("Continuation " + c0536h + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
