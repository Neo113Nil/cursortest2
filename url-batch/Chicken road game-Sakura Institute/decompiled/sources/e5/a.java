package e5;

import android.content.Context;
import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements f, z5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2753b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f2752a = i7;
        this.f2753b = obj;
    }

    @Override // z5.a
    public void a(z5.b bVar) {
        switch (this.f2752a) {
            case 2:
                AtomicReference atomicReference = ((h5.b) this.f2753b).f4652c;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                atomicReference.set(null);
                return;
            default:
                AtomicReference atomicReference2 = ((h5.b) this.f2753b).f4652c;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                atomicReference2.set(null);
                return;
        }
    }

    @Override // e5.f
    public Object b(v vVar) {
        switch (this.f2752a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (b6.a) this.f2753b;
            case 1:
                return this.f2753b;
            default:
                t tVar = (t) this.f2753b;
                Context context = (Context) vVar.a(Context.class);
                a5.f fVar = (a5.f) vVar.a(a5.f.class);
                StringBuilder sb = new StringBuilder();
                fVar.b();
                byte[] bytes = fVar.f500b.getBytes(Charset.defaultCharset());
                sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
                sb.append("+");
                fVar.b();
                byte[] bytes2 = fVar.f501c.f513b.getBytes(Charset.defaultCharset());
                sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
                return new y5.b(context, sb.toString(), vVar.f(t.a(y5.c.class)), vVar.e(b6.b.class), (Executor) vVar.d(tVar));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void c() {
        q6.e eVar = (q6.e) this.f2753b;
        synchronized (q0.n.f7427b) {
            ?? r22 = q0.n.f7432g;
            r6.k.f(r22, "<this>");
            ArrayList arrayList = new ArrayList(e6.n.a0(r22, 10));
            boolean z8 = false;
            for (Object obj : r22) {
                boolean z9 = true;
                if (!z8 && r6.k.a(obj, eVar)) {
                    z8 = true;
                    z9 = false;
                }
                if (z9) {
                    arrayList.add(obj);
                }
            }
            q0.n.f7432g = arrayList;
        }
    }
}
