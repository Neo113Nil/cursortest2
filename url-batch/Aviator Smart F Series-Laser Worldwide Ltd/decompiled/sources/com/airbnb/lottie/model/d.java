package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    public static final d COMPOSITION = new d("COMPOSITION");
    private final List<String> keys;

    @Nullable
    private e resolvedElement;

    public d(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    private boolean endsWithGlobstar() {
        return this.keys.get(r0.size() - 1).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d addKey(String str) {
        d dVar = new d(this);
        dVar.keys.add(str);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.keys.equals(dVar.keys)) {
            return false;
        }
        e eVar = this.resolvedElement;
        e eVar2 = dVar.resolvedElement;
        return eVar != null ? eVar.equals(eVar2) : eVar2 == null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean fullyResolvesTo(String str, int i8) {
        if (i8 >= this.keys.size()) {
            return false;
        }
        boolean z7 = i8 == this.keys.size() - 1;
        String str2 = this.keys.get(i8);
        if (!str2.equals("**")) {
            return (z7 || (i8 == this.keys.size() + (-2) && endsWithGlobstar())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z7 && this.keys.get(i8 + 1).equals(str)) {
            return i8 == this.keys.size() + (-2) || (i8 == this.keys.size() + (-3) && endsWithGlobstar());
        }
        if (z7) {
            return true;
        }
        int i9 = i8 + 1;
        if (i9 < this.keys.size() - 1) {
            return false;
        }
        return this.keys.get(i9).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e getResolvedElement() {
        return this.resolvedElement;
    }

    public int hashCode() {
        int hashCode = this.keys.hashCode() * 31;
        e eVar = this.resolvedElement;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int incrementDepthBy(String str, int i8) {
        if (isContainer(str)) {
            return 0;
        }
        if (this.keys.get(i8).equals("**")) {
            return (i8 != this.keys.size() - 1 && this.keys.get(i8 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean matches(String str, int i8) {
        if (isContainer(str)) {
            return true;
        }
        if (i8 >= this.keys.size()) {
            return false;
        }
        return this.keys.get(i8).equals(str) || this.keys.get(i8).equals("**") || this.keys.get(i8).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean propagateToChildren(String str, int i8) {
        return "__container".equals(str) || i8 < this.keys.size() - 1 || this.keys.get(i8).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d resolve(e eVar) {
        d dVar = new d(this);
        dVar.resolvedElement = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.keys);
        sb.append(",resolved=");
        sb.append(this.resolvedElement != null);
        sb.append('}');
        return sb.toString();
    }

    private d(d dVar) {
        this.keys = new ArrayList(dVar.keys);
        this.resolvedElement = dVar.resolvedElement;
    }
}
