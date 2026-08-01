package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3811e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3813g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3812f = oVar;
        this.f3813g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3811e) {
            case 0:
                this.f3812f.f3826k.getClass();
                try {
                    this.f3812f.f3838w.m(this.f3813g, 9);
                    synchronized (this.f3812f) {
                        this.f3812f.f3840y.remove(Integer.valueOf(this.f3813g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3812f.f3826k.getClass();
                try {
                    this.f3812f.f3838w.m(this.f3813g, 9);
                    synchronized (this.f3812f) {
                        this.f3812f.f3840y.remove(Integer.valueOf(this.f3813g));
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
        this.f3812f = oVar;
        this.f3813g = i;
    }
}
