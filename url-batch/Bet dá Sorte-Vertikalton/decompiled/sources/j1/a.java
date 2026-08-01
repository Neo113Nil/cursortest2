package j1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a extends k1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2569c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: b, reason: collision with root package name */
    public int f2570b;

    public a(Object obj) {
        this._state = obj;
    }
}
