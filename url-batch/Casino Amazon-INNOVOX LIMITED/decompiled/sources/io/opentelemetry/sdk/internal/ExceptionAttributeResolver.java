package io.opentelemetry.sdk.internal;

import com.facebook.hermes.intl.Constants;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.internal.ConfigUtil;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExceptionAttributeResolver {
    public static final AttributeKey<String> EXCEPTION_TYPE = AttributeKey.stringKey("exception.type");
    public static final AttributeKey<String> EXCEPTION_MESSAGE = AttributeKey.stringKey("exception.message");
    public static final AttributeKey<String> EXCEPTION_STACKTRACE = AttributeKey.stringKey("exception.stacktrace");

    public interface AttributeSetter {
        <T> void setAttribute(AttributeKey<T> attributeKey, @Nullable T t);
    }

    void setExceptionAttributes(AttributeSetter attributeSetter, Throwable th, int i);

    static ExceptionAttributeResolver getDefault() {
        return getDefault(Boolean.parseBoolean(ConfigUtil.getString("otel.experimental.sdk.jvm_stacktrace", Constants.CASEFIRST_FALSE)));
    }

    static ExceptionAttributeResolver getDefault(boolean z) {
        return new DefaultExceptionAttributeResolver(z);
    }
}
