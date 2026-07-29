package org.apache.a.f.c.a;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.a.c.o;
import org.apache.a.f.c.j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AbstractConnPool.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    protected volatile boolean f9800c;
    private final Log e = LogFactory.getLog(getClass());

    /* renamed from: b, reason: collision with root package name */
    protected Set<b> f9799b = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    protected j f9801d = new j();

    /* renamed from: a, reason: collision with root package name */
    protected final Lock f9798a = new ReentrantLock();

    protected a() {
    }

    public void a() {
        this.f9798a.lock();
        try {
            if (this.f9800c) {
                return;
            }
            Iterator<b> it = this.f9799b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                it.remove();
                a(next.c());
            }
            this.f9801d.a();
            this.f9800c = true;
        } finally {
            this.f9798a.unlock();
        }
    }

    protected void a(o oVar) {
        if (oVar != null) {
            try {
                oVar.c();
            } catch (IOException e) {
                this.e.debug("I/O error closing connection", e);
            }
        }
    }
}
