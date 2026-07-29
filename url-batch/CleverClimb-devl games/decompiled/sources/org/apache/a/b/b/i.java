package org.apache.a.b.b;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.a.aa;
import org.apache.a.ac;
import org.apache.a.h.m;
import org.apache.a.h.q;

/* compiled from: HttpRequestBase.java */
/* loaded from: classes2.dex */
public abstract class i extends org.apache.a.h.a implements Cloneable, a, k {
    private Lock abortLock = new ReentrantLock();
    private boolean aborted;
    private org.apache.a.c.e connRequest;
    private org.apache.a.c.i releaseTrigger;
    private URI uri;

    public abstract String getMethod();

    @Override // org.apache.a.o
    public aa getProtocolVersion() {
        return org.apache.a.i.e.b(getParams());
    }

    @Override // org.apache.a.b.b.k
    public URI getURI() {
        return this.uri;
    }

    @Override // org.apache.a.p
    public ac getRequestLine() {
        String method = getMethod();
        aa protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new m(method, aSCIIString, protocolVersion);
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    @Override // org.apache.a.b.b.a
    public void setConnectionRequest(org.apache.a.c.e eVar) throws IOException {
        this.abortLock.lock();
        try {
            if (this.aborted) {
                throw new IOException("Request already aborted");
            }
            this.releaseTrigger = null;
            this.connRequest = eVar;
        } finally {
            this.abortLock.unlock();
        }
    }

    @Override // org.apache.a.b.b.a
    public void setReleaseTrigger(org.apache.a.c.i iVar) throws IOException {
        this.abortLock.lock();
        try {
            if (this.aborted) {
                throw new IOException("Request already aborted");
            }
            this.connRequest = null;
            this.releaseTrigger = iVar;
        } finally {
            this.abortLock.unlock();
        }
    }

    public void abort() {
        this.abortLock.lock();
        try {
            if (this.aborted) {
                return;
            }
            this.aborted = true;
            org.apache.a.c.e eVar = this.connRequest;
            org.apache.a.c.i iVar = this.releaseTrigger;
            if (eVar != null) {
                eVar.a();
            }
            if (iVar != null) {
                try {
                    iVar.j();
                } catch (IOException unused) {
                }
            }
        } finally {
            this.abortLock.unlock();
        }
    }

    public boolean isAborted() {
        return this.aborted;
    }

    public Object clone() throws CloneNotSupportedException {
        i iVar = (i) super.clone();
        iVar.abortLock = new ReentrantLock();
        iVar.aborted = false;
        iVar.releaseTrigger = null;
        iVar.connRequest = null;
        iVar.headergroup = (q) org.apache.a.b.e.a.a(this.headergroup);
        iVar.params = (org.apache.a.i.d) org.apache.a.b.e.a.a(this.params);
        return iVar;
    }
}
