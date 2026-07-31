package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f11831a;

    k(Object obj) {
        this.f11831a = (LocaleList) obj;
    }

    @Override // androidx.core.os.j
    public String a() {
        return this.f11831a.toLanguageTags();
    }

    @Override // androidx.core.os.j
    public Object b() {
        return this.f11831a;
    }

    public boolean equals(Object obj) {
        return this.f11831a.equals(((j) obj).b());
    }

    @Override // androidx.core.os.j
    public Locale get(int i4) {
        return this.f11831a.get(i4);
    }

    public int hashCode() {
        return this.f11831a.hashCode();
    }

    @Override // androidx.core.os.j
    public boolean isEmpty() {
        return this.f11831a.isEmpty();
    }

    @Override // androidx.core.os.j
    public int size() {
        return this.f11831a.size();
    }

    public String toString() {
        return this.f11831a.toString();
    }
}
