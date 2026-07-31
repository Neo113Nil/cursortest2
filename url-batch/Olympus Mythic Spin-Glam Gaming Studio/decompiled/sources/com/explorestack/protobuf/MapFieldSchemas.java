package com.explorestack.protobuf;

/* loaded from: classes5.dex */
abstract class MapFieldSchemas {
    private static final MapFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final MapFieldSchema LITE_SCHEMA = new MapFieldSchemaLite();

    static MapFieldSchema full() {
        return FULL_SCHEMA;
    }

    static MapFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static MapFieldSchema loadSchemaForFullRuntime() {
        try {
            return (MapFieldSchema) MapFieldSchemaFull.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
