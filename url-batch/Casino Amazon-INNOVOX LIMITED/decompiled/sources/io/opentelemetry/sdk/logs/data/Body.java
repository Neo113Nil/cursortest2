package io.opentelemetry.sdk.logs.data;

@Deprecated
/* loaded from: classes3.dex */
public interface Body {

    @Deprecated
    public enum Type {
        EMPTY,
        STRING
    }

    String asString();

    @Deprecated
    Type getType();

    static Body string(String str) {
        return StringBody.create(str);
    }

    static Body empty() {
        return EmptyBody.INSTANCE;
    }
}
