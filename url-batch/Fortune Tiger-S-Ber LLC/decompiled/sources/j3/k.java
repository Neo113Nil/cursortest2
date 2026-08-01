package j3;

import androidx.fragment.app.w0;
import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k extends f3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f2434f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, p pVar, int i4, int i5, int i6) {
        super(str, true);
        this.f2433e = i6;
        this.f2434f = pVar;
        this.g = i4;
        this.h = i5;
    }

    @Override // f3.a
    public final long a() {
        switch (this.f2433e) {
            case 0:
                p pVar = this.f2434f;
                try {
                    pVar.B.r(this.g, this.h, true);
                    return -1L;
                } catch (IOException e4) {
                    pVar.m(2, 2, e4);
                    return -1L;
                }
            case 1:
                b0 b0Var = this.f2434f.f2450p;
                int i4 = this.h;
                b0Var.getClass();
                w0.h("errorCode", i4);
                synchronized (this.f2434f) {
                    this.f2434f.D.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                p pVar2 = this.f2434f;
                try {
                    int i5 = this.g;
                    int i6 = this.h;
                    w0.h("statusCode", i6);
                    pVar2.B.s(i5, i6);
                    return -1L;
                } catch (IOException e5) {
                    pVar2.m(2, 2, e5);
                    return -1L;
                }
        }
    }
}
