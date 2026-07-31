package p5;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k4.a;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f20133a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f20134b;

    a(Integer num, List<String> list) {
        this.f20133a = num;
        this.f20134b = list;
    }

    k4.a a(Context context) {
        a.C0085a c0085a = new a.C0085a(context);
        Integer num = this.f20133a;
        if (num != null) {
            c0085a.c(num.intValue());
        }
        List<String> list = this.f20134b;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                c0085a.a(it.next());
            }
        }
        return c0085a.b();
    }

    Integer b() {
        return this.f20133a;
    }

    List<String> c() {
        return this.f20134b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f20133a, aVar.b()) && Objects.equals(this.f20134b, aVar.c());
    }

    public int hashCode() {
        return Objects.hash(this.f20133a, this.f20134b);
    }
}
