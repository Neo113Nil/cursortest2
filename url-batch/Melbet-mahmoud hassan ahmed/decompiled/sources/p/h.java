package p;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f19937a;

    h(LocaleList localeList) {
        this.f19937a = localeList;
    }

    @Override // p.g
    public Object a() {
        return this.f19937a;
    }

    public boolean equals(Object obj) {
        return this.f19937a.equals(((g) obj).a());
    }

    @Override // p.g
    public Locale get(int i7) {
        return this.f19937a.get(i7);
    }

    public int hashCode() {
        return this.f19937a.hashCode();
    }

    public String toString() {
        return this.f19937a.toString();
    }
}
