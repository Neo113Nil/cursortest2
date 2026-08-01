package w1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends s1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4116e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f4117f = oVar;
        this.f4118g = i;
    }

    @Override // s1.a
    public final long a() {
        switch (this.f4116e) {
            case 0:
                this.f4117f.f4130k.getClass();
                try {
                    this.f4117f.f4142w.m(this.f4118g, 9);
                    synchronized (this.f4117f) {
                        this.f4117f.f4144y.remove(Integer.valueOf(this.f4118g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f4117f.f4130k.getClass();
                try {
                    this.f4117f.f4142w.m(this.f4118g, 9);
                    synchronized (this.f4117f) {
                        this.f4117f.f4144y.remove(Integer.valueOf(this.f4118g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z2) {
        super(str, true);
        this.f4117f = oVar;
        this.f4118g = i;
    }
}
