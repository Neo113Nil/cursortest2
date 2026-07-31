package com.explorestack.protobuf;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.explorestack.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes13.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map extensionsByNumber;

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite = emptyRegistry;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = emptyRegistry;
                    if (extensionRegistryLite == null) {
                        extensionRegistryLite = doFullRuntimeInheritanceCheck ? ExtensionRegistryFactory.createEmpty() : EMPTY_REGISTRY_LITE;
                        emptyRegistry = extensionRegistryLite;
                    }
                } finally {
                }
            }
        }
        return extensionRegistryLite;
    }

    public GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber(MessageLite messageLite, int i) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.extensionsByNumber.get(new ObjectIntPair(messageLite, i)));
        return null;
    }

    ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.emptyMap();
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(extensionRegistryLite.extensionsByNumber);
        }
    }

    ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }

    private static final class ObjectIntPair {
        private final int number;
        private final Object object;

        ObjectIntPair(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }
    }
}
