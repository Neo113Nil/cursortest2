package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sy0 extends it2 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ vy0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(String str, vy0 vy0Var, int i, List list, boolean z) {
        super(str, true);
        this.f = vy0Var;
        this.g = i;
    }

    @Override // defpackage.it2
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.w.getClass();
                try {
                    this.f.I.q(this.g, 9);
                    synchronized (this.f) {
                        this.f.K.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.w.getClass();
                try {
                    this.f.I.q(this.g, 9);
                    synchronized (this.f) {
                        this.f.K.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(String str, vy0 vy0Var, int i, List list) {
        super(str, true);
        this.f = vy0Var;
        this.g = i;
    }
}
