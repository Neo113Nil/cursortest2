package com.explorestack.protobuf;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.explorestack.protobuf.MapEntryLite;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
class MapFieldSchemaLite implements MapFieldSchema {
    MapFieldSchemaLite() {
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public Map forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public MapEntryLite.Metadata forMapMetadata(Object obj) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public Object toImmutable(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public Object newMapField(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    private static MapFieldLite mergeFromLite(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // com.explorestack.protobuf.MapFieldSchema
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return getSerializedSizeLite(i, obj, obj2);
    }

    private static int getSerializedSizeLite(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
