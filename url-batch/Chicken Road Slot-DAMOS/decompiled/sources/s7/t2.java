package s7;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9021d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9022e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9023i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9024r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Cloneable f9025s;

    public /* synthetic */ t2(l.d dVar, int i3, v0 v0Var, Intent intent) {
        this.f9023i = dVar;
        this.f9022e = i3;
        this.f9024r = v0Var;
        this.f9025s = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9021d) {
            case 0:
                y0 y0Var = (y0) this.f9023i;
                ((s2) y0Var.f9124t).a(this.f9022e, (Exception) this.f9024r, (byte[]) this.f9025s);
                break;
            default:
                l.d dVar = (l.d) this.f9023i;
                v0 v0Var = (v0) this.f9024r;
                Intent intent = (Intent) this.f9025s;
                Service service = (Service) dVar.f5643e;
                o3 o3Var = (o3) service;
                int i3 = this.f9022e;
                if (o3Var.a(i3)) {
                    v0Var.B.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    v0 v0Var2 = q1.r(service, null, null, null).f8937t;
                    q1.l(v0Var2);
                    v0Var2.B.a("Completed wakeful intent.");
                    o3Var.b(intent);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t2(y0 y0Var, int i3, Exception exc, byte[] bArr, Map map) {
        this.f9023i = y0Var;
        this.f9022e = i3;
        this.f9024r = exc;
        this.f9025s = bArr;
    }
}
