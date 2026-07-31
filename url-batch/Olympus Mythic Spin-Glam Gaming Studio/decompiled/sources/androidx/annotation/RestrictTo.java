package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RestrictTo.jvm.kt */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "", "Landroidx/annotation/RestrictTo$Scope;", "value", "<init>", "(Lkotlin/Array;)V", "Scope", "annotation"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes15.dex */
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictTo.jvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "<init>", "(Ljava/lang/String;I)V", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES", "annotation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Scope {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Scope[] $VALUES;
        public static final Scope LIBRARY = new Scope("LIBRARY", 0);
        public static final Scope LIBRARY_GROUP = new Scope("LIBRARY_GROUP", 1);
        public static final Scope LIBRARY_GROUP_PREFIX = new Scope("LIBRARY_GROUP_PREFIX", 2);

        @Deprecated
        public static final Scope GROUP_ID = new Scope("GROUP_ID", 3);
        public static final Scope TESTS = new Scope("TESTS", 4);
        public static final Scope SUBCLASSES = new Scope("SUBCLASSES", 5);

        private static final /* synthetic */ Scope[] $values() {
            return new Scope[]{LIBRARY, LIBRARY_GROUP, LIBRARY_GROUP_PREFIX, GROUP_ID, TESTS, SUBCLASSES};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) $VALUES.clone();
        }

        private Scope(String str, int i) {
        }

        static {
            Scope[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
