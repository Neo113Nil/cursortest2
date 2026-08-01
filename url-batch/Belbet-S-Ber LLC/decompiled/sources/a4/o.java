package a4;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o extends w3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f194g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, r rVar, int i, List list) {
        super(str, true);
        this.f193f = rVar;
        this.f194g = i;
    }

    @Override // w3.a
    public final long a() {
        switch (this.f192e) {
            case 0:
                this.f193f.f208p.getClass();
                try {
                    this.f193f.B.s(this.f194g, 9);
                    synchronized (this.f193f) {
                        this.f193f.D.remove(Integer.valueOf(this.f194g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f193f.f208p.getClass();
                try {
                    this.f193f.B.s(this.f194g, 9);
                    synchronized (this.f193f) {
                        this.f193f.D.remove(Integer.valueOf(this.f194g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, r rVar, int i, List list, boolean z4) {
        super(str, true);
        this.f193f = rVar;
        this.f194g = i;
    }
}
