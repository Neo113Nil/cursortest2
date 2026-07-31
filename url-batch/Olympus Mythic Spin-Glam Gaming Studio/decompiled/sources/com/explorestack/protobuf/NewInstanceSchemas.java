package com.explorestack.protobuf;

/* loaded from: classes5.dex */
abstract class NewInstanceSchemas {
    private static final NewInstanceSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final NewInstanceSchema LITE_SCHEMA = new NewInstanceSchemaLite();

    static NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    static NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    private static NewInstanceSchema loadSchemaForFullRuntime() {
        try {
            return (NewInstanceSchema) NewInstanceSchemaFull.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
