package s3;

import A.AbstractC0017m;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlin.text.y;
import m3.m;
import m3.r;
import o.S0;
import q3.i;
import q3.l;
import z3.C1448f;
import z3.z;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: j, reason: collision with root package name */
    public final m f10599j;

    /* renamed from: k, reason: collision with root package name */
    public long f10600k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f10602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, m url) {
        super(lVar);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f10602m = lVar;
        this.f10599j = url;
        this.f10600k = -1L;
        this.f10601l = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10594e) {
            return;
        }
        if (this.f10601l && !n3.b.g(this, TimeUnit.MILLISECONDS)) {
            ((i) this.f10602m.f9428c).k();
            a();
        }
        this.f10594e = true;
    }

    @Override // s3.a, z3.F
    public final long l(C1448f sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        if (this.f10594e) {
            throw new IllegalStateException("closed");
        }
        if (!this.f10601l) {
            return -1L;
        }
        long j5 = this.f10600k;
        l lVar = this.f10602m;
        if (j5 == 0 || j5 == -1) {
            if (j5 != -1) {
                ((z) lVar.f9429d).r(Long.MAX_VALUE);
            }
            try {
                this.f10600k = ((z) lVar.f9429d).g();
                String obj = y.M(((z) lVar.f9429d).r(Long.MAX_VALUE)).toString();
                if (this.f10600k < 0 || (obj.length() > 0 && !u.n(obj, ";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f10600k + obj + '\"');
                }
                if (this.f10600k == 0) {
                    this.f10601l = false;
                    lVar.f9432g = ((S0) lVar.f9431f).a();
                    r rVar = (r) lVar.f9427b;
                    Intrinsics.c(rVar);
                    m3.l lVar2 = (m3.l) lVar.f9432g;
                    Intrinsics.c(lVar2);
                    r3.e.b(rVar.f8441p, this.f10599j, lVar2);
                    a();
                }
                if (!this.f10601l) {
                    return -1L;
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }
        long l4 = super.l(sink, Math.min(j4, this.f10600k));
        if (l4 != -1) {
            this.f10600k -= l4;
            return l4;
        }
        ((i) lVar.f9428c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
