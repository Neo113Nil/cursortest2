package e6;

import java.io.IOException;

/* loaded from: classes.dex */
public final class E extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public final EnumC0356b f4036f;

    public E(EnumC0356b enumC0356b) {
        super("stream was reset: " + enumC0356b);
        this.f4036f = enumC0356b;
    }
}
