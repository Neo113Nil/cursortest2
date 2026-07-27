package a5;

import java.io.IOException;

/* loaded from: classes.dex */
public final class G extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0200b f3915a;

    public G(EnumC0200b enumC0200b) {
        super("stream was reset: " + enumC0200b);
        this.f3915a = enumC0200b;
    }
}
