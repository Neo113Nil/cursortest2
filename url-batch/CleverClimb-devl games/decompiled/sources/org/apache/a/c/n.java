package org.apache.a.c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ManagedClientConnection.java */
/* loaded from: classes2.dex */
public interface n extends i, m, org.apache.a.h {
    void a(long j, TimeUnit timeUnit);

    void a(Object obj);

    void a(org.apache.a.c.b.b bVar, org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException;

    void a(org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException;

    void a(org.apache.a.m mVar, boolean z, org.apache.a.i.d dVar) throws IOException;

    void a(boolean z, org.apache.a.i.d dVar) throws IOException;

    @Override // org.apache.a.c.m
    org.apache.a.c.b.b l();

    void n();
}
