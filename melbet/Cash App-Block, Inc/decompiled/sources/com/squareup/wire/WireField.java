package com.squareup.wire;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface WireField {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Label {
        public static final /* synthetic */ Label[] $VALUES;
        public static final Label OMIT_IDENTITY;
        public static final Label ONE_OF;
        public static final Label OPTIONAL;
        public static final Label PACKED;
        public static final Label REPEATED;
        public static final Label REQUIRED;

        static {
            Label label = new Label("REQUIRED", 0);
            REQUIRED = label;
            Label label2 = new Label("OPTIONAL", 1);
            OPTIONAL = label2;
            Label label3 = new Label("REPEATED", 2);
            REPEATED = label3;
            Label label4 = new Label("ONE_OF", 3);
            ONE_OF = label4;
            Label label5 = new Label("PACKED", 4);
            PACKED = label5;
            Label label6 = new Label("OMIT_IDENTITY", 5);
            OMIT_IDENTITY = label6;
            $VALUES = new Label[]{label, label2, label3, label4, label5, label6};
        }

        public static Label valueOf(String str) {
            return (Label) Enum.valueOf(Label.class, str);
        }

        public static Label[] values() {
            return (Label[]) $VALUES.clone();
        }

        public final boolean isPacked() {
            return this == PACKED;
        }

        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }
    }

    String adapter();

    String declaredName() default "";

    String jsonName() default "";

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    String oneofName() default "";

    boolean redacted() default false;

    int schemaIndex() default -1;

    int tag();
}
