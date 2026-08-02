package kotlin.reflect.jvm.internal.impl.name;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class ClassId {
    public static final Companion Companion = new Companion(null);
    public final boolean isLocal;
    public final FqName packageFqName;
    public final FqName relativeClassName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ ClassId fromString$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromString(str, z);
        }

        public final ClassId fromString(String str, boolean z) {
            String replace$default;
            str.getClass();
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '`', 0, false, 6);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            int lastIndexOf$default = StringsKt.lastIndexOf$default(str, "/", indexOf$default, 4);
            String str2 = "";
            if (lastIndexOf$default == -1) {
                replace$default = StringsKt__StringsJVMKt.replace$default(str, "`", "");
            } else {
                String replace = StringsKt__StringsJVMKt.replace(str.substring(0, lastIndexOf$default), '/', '.', false);
                replace$default = StringsKt__StringsJVMKt.replace$default(str.substring(lastIndexOf$default + 1), "`", "");
                str2 = replace;
            }
            return new ClassId(new FqName(str2), new FqName(replace$default), z);
        }

        public final ClassId topLevel(FqName fqName) {
            fqName.getClass();
            return new ClassId(fqName.parent(), fqName.shortName());
        }
    }

    public ClassId(FqName fqName, FqName fqName2, boolean z) {
        fqName.getClass();
        fqName2.getClass();
        this.packageFqName = fqName;
        this.relativeClassName = fqName2;
        this.isLocal = z;
        fqName2.isRoot();
    }

    public static final String asString$escapeSlashes(FqName fqName) {
        String asString = fqName.asString();
        return StringsKt.contains((CharSequence) asString, '/', false) ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m('`', "`", asString) : asString;
    }

    public static final ClassId topLevel(FqName fqName) {
        return Companion.topLevel(fqName);
    }

    public final FqName asSingleFqName() {
        FqName fqName = this.packageFqName;
        boolean isRoot = fqName.isRoot();
        FqName fqName2 = this.relativeClassName;
        if (isRoot) {
            return fqName2;
        }
        return new FqName(fqName.asString() + '.' + fqName2.asString());
    }

    public final String asString() {
        FqName fqName = this.packageFqName;
        boolean isRoot = fqName.isRoot();
        FqName fqName2 = this.relativeClassName;
        if (isRoot) {
            return asString$escapeSlashes(fqName2);
        }
        return StringsKt__StringsJVMKt.replace(fqName.asString(), '.', '/', false) + "/" + asString$escapeSlashes(fqName2);
    }

    public final ClassId createNestedClassId(Name name) {
        name.getClass();
        return new ClassId(this.packageFqName, this.relativeClassName.child(name), this.isLocal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.areEqual(this.packageFqName, classId.packageFqName) && Intrinsics.areEqual(this.relativeClassName, classId.relativeClassName) && this.isLocal == classId.isLocal;
    }

    public final ClassId getOuterClassId() {
        FqName parent = this.relativeClassName.parent();
        if (parent.isRoot()) {
            return null;
        }
        return new ClassId(this.packageFqName, parent, this.isLocal);
    }

    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    public final FqName getRelativeClassName() {
        return this.relativeClassName;
    }

    public final Name getShortClassName() {
        return this.relativeClassName.shortName();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLocal) + ((this.relativeClassName.hashCode() + (this.packageFqName.hashCode() * 31)) * 31);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final boolean isNestedClass() {
        return !this.relativeClassName.parent().isRoot();
    }

    public String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName fqName, Name name) {
        this(fqName, FqName.Companion.topLevel(name), false);
        fqName.getClass();
        name.getClass();
    }
}
