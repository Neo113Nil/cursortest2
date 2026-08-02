package kotlin.reflect.jvm.internal.impl.name;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class FqNameUnsafe {
    public static final Companion Companion = new Companion(null);
    public static final Name ROOT_NAME;
    public final String fqName;
    public transient FqNameUnsafe parent;
    public transient FqName safe;
    public transient Name shortName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FqNameUnsafe topLevel(Name name) {
            name.getClass();
            String asString = name.asString();
            asString.getClass();
            return new FqNameUnsafe(asString, FqName.ROOT.toUnsafe(), name, null);
        }
    }

    static {
        Name special = Name.special("<root>");
        special.getClass();
        ROOT_NAME = special;
        Pattern.compile("\\.").getClass();
    }

    public FqNameUnsafe(String str, FqName fqName) {
        str.getClass();
        fqName.getClass();
        this.fqName = str;
        this.safe = fqName;
    }

    public static final List pathSegments$collectSegmentsOf(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isRoot()) {
            return new ArrayList();
        }
        List pathSegments$collectSegmentsOf = pathSegments$collectSegmentsOf(fqNameUnsafe.parent());
        pathSegments$collectSegmentsOf.add(fqNameUnsafe.shortName());
        return pathSegments$collectSegmentsOf;
    }

    public final String asString() {
        return this.fqName;
    }

    public final FqNameUnsafe child(Name name) {
        String str;
        name.getClass();
        if (isRoot()) {
            str = name.asString();
        } else {
            str = this.fqName + '.' + name.asString();
        }
        str.getClass();
        return new FqNameUnsafe(str, this, name);
    }

    public final void compute() {
        String str = this.fqName;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char charAt = str.charAt(length);
            if (charAt == '.' && !z) {
                break;
            }
            if (charAt == '`') {
                z = !z;
            } else if (charAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.shortName = Name.guessByFirstCharacter(str.substring(length + 1));
            this.parent = new FqNameUnsafe(str.substring(0, length));
        } else {
            this.shortName = Name.guessByFirstCharacter(str);
            this.parent = FqName.ROOT.toUnsafe();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FqNameUnsafe) {
            return Intrinsics.areEqual(this.fqName, ((FqNameUnsafe) obj).fqName);
        }
        return false;
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.length() == 0;
    }

    public final boolean isSafe() {
        return this.safe != null || StringsKt.indexOf$default((CharSequence) asString(), '<', 0, false, 6) < 0;
    }

    public final FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.parent;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (isRoot()) {
            a$$ExternalSyntheticBUOutline0.m$1("root");
            return null;
        }
        compute();
        FqNameUnsafe fqNameUnsafe2 = this.parent;
        fqNameUnsafe2.getClass();
        return fqNameUnsafe2;
    }

    public final List<Name> pathSegments() {
        return pathSegments$collectSegmentsOf(this);
    }

    public final Name shortName() {
        Name name = this.shortName;
        if (name != null) {
            return name;
        }
        if (isRoot()) {
            a$$ExternalSyntheticBUOutline0.m$1("root");
            return null;
        }
        compute();
        Name name2 = this.shortName;
        name2.getClass();
        return name2;
    }

    public final Name shortNameOrSpecial() {
        return isRoot() ? ROOT_NAME : shortName();
    }

    public final boolean startsWith(Name name) {
        name.getClass();
        if (!isRoot()) {
            String str = this.fqName;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '.', 0, false, 6);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            int i = indexOf$default;
            String asString = name.asString();
            asString.getClass();
            if (i == asString.length() && StringsKt__StringsJVMKt.regionMatches(0, 0, i, this.fqName, asString, false)) {
                return true;
            }
        }
        return false;
    }

    public final FqName toSafe() {
        FqName fqName = this.safe;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.safe = fqName2;
        return fqName2;
    }

    public String toString() {
        if (!isRoot()) {
            return this.fqName;
        }
        String asString = ROOT_NAME.asString();
        asString.getClass();
        return asString;
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public FqNameUnsafe(String str) {
        str.getClass();
        this.fqName = str;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.fqName = str;
        this.parent = fqNameUnsafe;
        this.shortName = name;
    }
}
