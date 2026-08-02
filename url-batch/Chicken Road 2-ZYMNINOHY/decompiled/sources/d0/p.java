package d0;

import W.J;
import android.os.Handler;
import android.os.Message;
import e0.C0393c;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class p implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final B1.j f8197a;

    /* renamed from: b, reason: collision with root package name */
    public final C0377d f8198b;

    /* renamed from: f, reason: collision with root package name */
    public C0393c f8202f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8203g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8204h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8205i;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f8201e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8200d = J.o(this);

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f8199c = new I0.b(1);

    public p(C0393c c0393c, C0377d c0377d, B1.j jVar) {
        this.f8202f = c0393c;
        this.f8198b = c0377d;
        this.f8197a = jVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f8205i) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j4 = nVar.f8190a;
            long j5 = nVar.f8191b;
            Long valueOf = Long.valueOf(j5);
            TreeMap treeMap = this.f8201e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j5), Long.valueOf(j4));
                return true;
            }
            if (l4.longValue() > j4) {
                treeMap.put(Long.valueOf(j5), Long.valueOf(j4));
            }
        }
        return true;
    }
}
