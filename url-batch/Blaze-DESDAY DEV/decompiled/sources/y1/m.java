package y1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4260e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f4261f = oVar;
        this.f4262g = i;
    }

    @Override // u1.a
    public final long a() {
        switch (this.f4260e) {
            case 0:
                this.f4261f.f4274k.getClass();
                try {
                    this.f4261f.f4286w.m(this.f4262g, 9);
                    synchronized (this.f4261f) {
                        this.f4261f.f4288y.remove(Integer.valueOf(this.f4262g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f4261f.f4274k.getClass();
                try {
                    this.f4261f.f4286w.m(this.f4262g, 9);
                    synchronized (this.f4261f) {
                        this.f4261f.f4288y.remove(Integer.valueOf(this.f4262g));
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
        this.f4261f = oVar;
        this.f4262g = i;
    }
}
