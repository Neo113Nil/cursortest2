package m0;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private e0.i f18849f;

    /* renamed from: g, reason: collision with root package name */
    private String f18850g;

    /* renamed from: h, reason: collision with root package name */
    private WorkerParameters.a f18851h;

    public h(e0.i iVar, String str, WorkerParameters.a aVar) {
        this.f18849f = iVar;
        this.f18850g = str;
        this.f18851h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f18849f.m().k(this.f18850g, this.f18851h);
    }
}
