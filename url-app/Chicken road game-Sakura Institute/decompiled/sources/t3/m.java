package t3;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends p3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10798e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f10801h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i2, List list) {
        super(str, true);
        this.f10799f = pVar;
        this.f10800g = i2;
        this.f10801h = list;
    }

    @Override // p3.a
    public final long a() {
        switch (this.f10798e) {
            case 0:
                A a4 = this.f10799f.f10824q;
                List responseHeaders = this.f10801h;
                a4.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    this.f10799f.f10811C.i(this.f10800g, EnumC1211b.CANCEL);
                    synchronized (this.f10799f) {
                        this.f10799f.f10813E.remove(Integer.valueOf(this.f10800g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                A a5 = this.f10799f.f10824q;
                List requestHeaders = this.f10801h;
                a5.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    this.f10799f.f10811C.i(this.f10800g, EnumC1211b.CANCEL);
                    synchronized (this.f10799f) {
                        this.f10799f.f10813E.remove(Integer.valueOf(this.f10800g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i2, List list, boolean z4) {
        super(str, true);
        this.f10799f = pVar;
        this.f10800g = i2;
        this.f10801h = list;
    }
}
