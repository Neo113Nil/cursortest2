package defpackage;

import java.net.ProxySelector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khb implements hac {
    private final /* synthetic */ int a;

    public khb(int i) {
        this.a = i;
    }

    @Override // defpackage.hac
    public final /* synthetic */ Object bB() {
        int i = this.a;
        return i != 0 ? i != 1 ? ProxySelector.getDefault() : gzp.g(eos.I()) : new hab();
    }
}
