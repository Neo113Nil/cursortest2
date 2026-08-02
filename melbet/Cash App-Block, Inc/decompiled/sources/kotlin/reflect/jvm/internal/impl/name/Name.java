package kotlin.reflect.jvm.internal.impl.name;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class Name implements Comparable<Name> {
    public final String name;
    public final boolean special;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    public Name(String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        this.name = str;
        this.special = z;
    }

    public static Name guessByFirstCharacter(String str) {
        if (str != null) {
            return str.startsWith("<") ? special(str) : identifier(str);
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public static Name identifier(String str) {
        if (str != null) {
            return new Name(str, false);
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public static boolean isValidIdentifier(String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static Name special(String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        a$$ExternalSyntheticBUOutline0.m$3("special name must start with '<': ".concat(str));
        return null;
    }

    public String asString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        $$$reportNull$$$0(1);
        throw null;
    }

    public String asStringStripSpecialMarkers() {
        if (isSpecial()) {
            return asString().substring(1, asString().length() - 1);
        }
        String asString = asString();
        if (asString != null) {
            return asString;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    @Override // java.lang.Comparable
    public int compareTo(Name name) {
        return this.name.compareTo(name.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.special == name.special && this.name.equals(name.name);
    }

    public String getIdentifier() {
        if (this.special) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "not identifier: ");
            return null;
        }
        String asString = asString();
        if (asString != null) {
            return asString;
        }
        $$$reportNull$$$0(2);
        throw null;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.special ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.special;
    }

    public String toString() {
        return this.name;
    }
}
