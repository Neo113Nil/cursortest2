package o2;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class U0 extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient InterfaceC3359v0 f42026b;

    public U0(String str, InterfaceC3359v0 interfaceC3359v0) {
        super(str);
        this.f42026b = interfaceC3359v0;
    }

    public U0(String str) {
        this(str, null);
    }
}
