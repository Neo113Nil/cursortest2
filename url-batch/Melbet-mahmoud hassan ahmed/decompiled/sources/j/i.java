package j;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f18042a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f18043b;

    /* renamed from: c, reason: collision with root package name */
    String f18044c;

    /* renamed from: d, reason: collision with root package name */
    String f18045d;

    /* renamed from: e, reason: collision with root package name */
    boolean f18046e;

    /* renamed from: f, reason: collision with root package name */
    boolean f18047f;

    public IconCompat a() {
        return this.f18043b;
    }

    public String b() {
        return this.f18045d;
    }

    public CharSequence c() {
        return this.f18042a;
    }

    public String d() {
        return this.f18044c;
    }

    public boolean e() {
        return this.f18046e;
    }

    public boolean f() {
        return this.f18047f;
    }

    public String g() {
        String str = this.f18044c;
        if (str != null) {
            return str;
        }
        if (this.f18042a == null) {
            return "";
        }
        return "name:" + ((Object) this.f18042a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().u() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
