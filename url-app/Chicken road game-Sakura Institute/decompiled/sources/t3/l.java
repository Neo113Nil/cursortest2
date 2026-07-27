package t3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;

/* loaded from: classes.dex */
public final class l extends p3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f10794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1448f f10796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10797h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, p pVar, int i2, C1448f c1448f, int i4, boolean z4) {
        super(str, true);
        this.f10794e = pVar;
        this.f10795f = i2;
        this.f10796g = c1448f;
        this.f10797h = i4;
    }

    @Override // p3.a
    public final long a() {
        try {
            A a4 = this.f10794e.f10824q;
            C1448f source = this.f10796g;
            int i2 = this.f10797h;
            a4.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.s(i2);
            this.f10794e.f10811C.i(this.f10795f, EnumC1211b.CANCEL);
            synchronized (this.f10794e) {
                this.f10794e.f10813E.remove(Integer.valueOf(this.f10795f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
