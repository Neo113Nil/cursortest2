package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class mo extends k50 {
    public final /* synthetic */ no e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(String str, no noVar, int i, long j) {
        super(str, true);
        this.e = noVar;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.k50
    public final long a() {
        no noVar = this.e;
        try {
            noVar.B.t(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            noVar.m(2, 2, e);
            return -1L;
        }
    }
}
