package f;

import g.AbstractC0407a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0383b f4743a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0407a f4744b;

    public C0386e(AbstractC0407a contract, InterfaceC0383b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f4743a = callback;
        this.f4744b = contract;
    }
}
