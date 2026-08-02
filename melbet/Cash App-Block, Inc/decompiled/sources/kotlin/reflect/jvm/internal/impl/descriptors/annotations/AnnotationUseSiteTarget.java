package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* loaded from: classes9.dex */
public enum AnnotationUseSiteTarget {
    ALL(null),
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String renderName;

    AnnotationUseSiteTarget(String str) {
        this.renderName = str == null ? CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(name()) : str;
    }

    public final String getRenderName() {
        return this.renderName;
    }
}
