package u0;

import androidx.work.impl.WorkDatabase_Impl;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import n6.u;
import n6.v;
import n6.w;

/* renamed from: u0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684n implements v {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5993f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5994g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5995h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5996i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f5997j;

    public C0684n(WorkDatabase_Impl workDatabase_Impl) {
        this.f5993f = 0;
        this.f5994g = workDatabase_Impl;
        this.f5995h = new C0672b(workDatabase_Impl, 4);
        this.f5996i = new C0678h(workDatabase_Impl, 2);
        this.f5997j = new C0678h(workDatabase_Impl, 3);
    }

    @Override // n6.v
    public u b() {
        return (o6.c) this.f5997j;
    }

    @Override // n6.v
    public w c() {
        return (o6.d) this.f5996i;
    }

    public String toString() {
        switch (this.f5993f) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                String socket = ((Socket) this.f5994g).toString();
                kotlin.jvm.internal.i.d(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public C0684n(Socket socket) {
        this.f5993f = 2;
        this.f5994g = socket;
        this.f5995h = new AtomicInteger();
        this.f5996i = new o6.d(this);
        this.f5997j = new o6.c(this);
    }

    public C0684n(String str, String[] strArr, String str2, N3.p pVar) {
        this.f5993f = 1;
        this.f5994g = str;
        this.f5995h = strArr;
        this.f5997j = str2;
        this.f5996i = pVar;
    }
}
