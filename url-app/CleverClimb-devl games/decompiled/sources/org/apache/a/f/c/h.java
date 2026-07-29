package org.apache.a.f.c;

import java.io.IOException;
import org.apache.a.h.t;
import org.apache.a.h.u;
import org.apache.a.s;
import org.apache.a.x;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: DefaultResponseParser.java */
/* loaded from: classes2.dex */
public class h extends org.apache.a.f.f.a {

    /* renamed from: b, reason: collision with root package name */
    private final Log f9835b;

    /* renamed from: c, reason: collision with root package name */
    private final s f9836c;

    /* renamed from: d, reason: collision with root package name */
    private final org.apache.a.k.b f9837d;
    private final int e;

    public h(org.apache.a.g.f fVar, t tVar, s sVar, org.apache.a.i.d dVar) {
        super(fVar, tVar, dVar);
        this.f9835b = LogFactory.getLog(getClass());
        if (sVar == null) {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        this.f9836c = sVar;
        this.f9837d = new org.apache.a.k.b(128);
        this.e = dVar.a("http.connection.max-status-line-garbage", Integer.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        throw new org.apache.a.z("The server failed to respond with a valid HTTP response");
     */
    @Override // org.apache.a.f.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected org.apache.a.o a(org.apache.a.g.f fVar) throws IOException, org.apache.a.l {
        int i = 0;
        while (true) {
            this.f9837d.a();
            int a2 = fVar.a(this.f9837d);
            if (a2 == -1 && i == 0) {
                throw new x("The target server failed to respond");
            }
            u uVar = new u(0, this.f9837d.c());
            if (!this.f9893a.b(this.f9837d, uVar)) {
                if (a2 == -1 || i >= this.e) {
                    break;
                }
                if (this.f9835b.isDebugEnabled()) {
                    this.f9835b.debug("Garbage in response: " + this.f9837d.toString());
                }
                i++;
            } else {
                return this.f9836c.a(this.f9893a.c(this.f9837d, uVar), null);
            }
        }
    }
}
