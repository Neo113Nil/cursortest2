package b5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements i5.a, oe.a {

    /* renamed from: d, reason: collision with root package name */
    public final i5.a f1140d;

    /* renamed from: e, reason: collision with root package name */
    public final oe.a f1141e;

    /* renamed from: i, reason: collision with root package name */
    public CoroutineContext f1142i;

    /* renamed from: r, reason: collision with root package name */
    public Throwable f1143r;

    /* renamed from: s, reason: collision with root package name */
    public final h f1144s;

    public i(i5.a aVar) {
        oe.c cVar = new oe.c();
        aVar.getClass();
        this.f1140d = aVar;
        this.f1141e = cVar;
        this.f1144s = new h(this);
    }

    @Override // i5.a
    public final i5.c K(String str) {
        str.getClass();
        h hVar = this.f1144s;
        if (hVar == null) {
            return this.f1140d.K(str);
        }
        Object c10 = hVar.c(str);
        c10.getClass();
        return new g((i5.c) c10);
    }

    @Override // oe.a
    public final Object a(nd.c cVar) {
        return this.f1141e.a(cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        h hVar = this.f1144s;
        if (hVar != null) {
            hVar.f(-1);
        }
        this.f1140d.close();
    }

    @Override // oe.a
    public final void d(Object obj) {
        this.f1141e.d(null);
    }

    public final void h(StringBuilder sb2) {
        int i3;
        if (this.f1142i == null && this.f1143r == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            CoroutineContext coroutineContext = this.f1142i;
            if (coroutineContext != null) {
                sb2.append("\t\tCoroutine: " + coroutineContext);
                sb2.append('\n');
            }
            Throwable th = this.f1143r;
            if (th != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                Iterator it = CollectionsKt.v(StringsKt.s(stringWriter2), 1).iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        if (this.f1144s != null) {
            StringBuilder sb3 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            h hVar = this.f1144s;
            synchronized (hVar.f8363c) {
                i3 = hVar.f8364d;
            }
            sb3.append(i3);
            sb2.append(sb3.toString());
            sb2.append('\n');
        }
    }

    @Override // i5.a
    public final boolean t() {
        return this.f1140d.t();
    }

    public final String toString() {
        return this.f1140d.toString();
    }
}
