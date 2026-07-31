package p3;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import r3.o;

/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final h.a<q3.b<?>, o3.b> f20115f;

    public c(@RecentlyNonNull h.a<q3.b<?>, o3.b> aVar) {
        this.f20115f = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z6 = true;
        for (q3.b<?> bVar : this.f20115f.keySet()) {
            o3.b bVar2 = (o3.b) o.i(this.f20115f.get(bVar));
            z6 &= !bVar2.j();
            String b7 = bVar.b();
            String valueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(b7).length() + 2 + valueOf.length());
            sb.append(b7);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z6 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
