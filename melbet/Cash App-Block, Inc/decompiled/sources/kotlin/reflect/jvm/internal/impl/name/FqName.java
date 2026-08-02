package kotlin.reflect.jvm.internal.impl.name;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FqName {
    public static final Companion Companion = new Companion(null);
    public static final FqName ROOT = new FqName("");
    public final FqNameUnsafe fqName;
    public transient FqName parent;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FqName topLevel(Name name) {
            name.getClass();
            return new FqName(FqNameUnsafe.Companion.topLevel(name));
        }
    }

    public FqName(String str) {
        str.getClass();
        this.fqName = new FqNameUnsafe(str, this);
    }

    public final String asString() {
        return this.fqName.asString();
    }

    public final FqName child(Name name) {
        name.getClass();
        return new FqName(this.fqName.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FqName) {
            return Intrinsics.areEqual(this.fqName, ((FqName) obj).fqName);
        }
        return false;
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.isRoot();
    }

    public final FqName parent() {
        FqName fqName = this.parent;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            a$$ExternalSyntheticBUOutline0.m$1("root");
            return null;
        }
        FqName fqName2 = new FqName(this.fqName.parent());
        this.parent = fqName2;
        return fqName2;
    }

    public final List<Name> pathSegments() {
        return this.fqName.pathSegments();
    }

    public final Name shortName() {
        return this.fqName.shortName();
    }

    public final Name shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    public final boolean startsWith(Name name) {
        name.getClass();
        return this.fqName.startsWith(name);
    }

    public String toString() {
        return this.fqName.toString();
    }

    public final FqNameUnsafe toUnsafe() {
        return this.fqName;
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        this.fqName = fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }
}
