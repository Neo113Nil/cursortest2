package t1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3786e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3788g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3787f = oVar;
        this.f3788g = i;
    }

    @Override // p1.a
    public final long a() {
        switch (this.f3786e) {
            case 0:
                this.f3787f.f3800k.getClass();
                try {
                    this.f3787f.f3812w.m(this.f3788g, 9);
                    synchronized (this.f3787f) {
                        this.f3787f.f3814y.remove(Integer.valueOf(this.f3788g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3787f.f3800k.getClass();
                try {
                    this.f3787f.f3812w.m(this.f3788g, 9);
                    synchronized (this.f3787f) {
                        this.f3787f.f3814y.remove(Integer.valueOf(this.f3788g));
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
        this.f3787f = oVar;
        this.f3788g = i;
    }
}
