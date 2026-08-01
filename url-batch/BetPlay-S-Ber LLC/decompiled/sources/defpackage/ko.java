package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ko extends k50 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ no f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(String str, no noVar, int i, List list, boolean z) {
        super(str, true);
        this.f = noVar;
        this.g = i;
    }

    @Override // defpackage.k50
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(String str, no noVar, int i, List list) {
        super(str, true);
        this.f = noVar;
        this.g = i;
    }
}
