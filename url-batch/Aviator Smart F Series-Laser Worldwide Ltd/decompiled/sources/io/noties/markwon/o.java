package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class o {
    private final String name;

    o(@NonNull String str) {
        this.name = str;
    }

    @NonNull
    public static <T> o of(@NonNull Class<T> cls, @NonNull String str) {
        return new o(str);
    }

    public void clear(@NonNull q qVar) {
        qVar.clear(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((o) obj).name);
    }

    @Nullable
    public Object get(@NonNull q qVar) {
        return qVar.get(this);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @NonNull
    public String name() {
        return this.name;
    }

    @NonNull
    public Object require(@NonNull q qVar) {
        Object obj = get(qVar);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.name);
    }

    public void set(@NonNull q qVar, @Nullable Object obj) {
        qVar.set(this, obj);
    }

    public String toString() {
        return "Prop{name='" + this.name + "'}";
    }

    @NonNull
    public static <T> o of(@NonNull String str) {
        return new o(str);
    }

    @NonNull
    public Object get(@NonNull q qVar, @NonNull Object obj) {
        return qVar.get(this, obj);
    }
}
