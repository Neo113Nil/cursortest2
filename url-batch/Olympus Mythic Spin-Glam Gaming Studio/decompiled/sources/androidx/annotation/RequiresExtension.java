package androidx.annotation;

import com.facebook.share.internal.ShareConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RequiresExtension.jvm.kt */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/annotation/RequiresExtension;", "", "", ShareConstants.MEDIA_EXTENSION, "version", "<init>", "(II)V", "annotation"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Documented
@Repeatable(Container.class)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes15.dex */
public @interface RequiresExtension {

    /* compiled from: RequiresExtension.jvm.kt */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    public @interface Container {
    }
}
