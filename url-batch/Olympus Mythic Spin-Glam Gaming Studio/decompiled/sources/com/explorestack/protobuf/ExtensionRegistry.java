package com.explorestack.protobuf;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.explorestack.protobuf.Descriptors;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes12.dex */
public class ExtensionRegistry extends ExtensionRegistryLite {
    static final ExtensionRegistry EMPTY_REGISTRY = new ExtensionRegistry(true);
    private final Map immutableExtensionsByName;
    private final Map immutableExtensionsByNumber;
    private final Map mutableExtensionsByName;
    private final Map mutableExtensionsByNumber;

    public static final class ExtensionInfo {
    }

    public static ExtensionRegistry getEmptyRegistry() {
        return EMPTY_REGISTRY;
    }

    public ExtensionInfo findImmutableExtensionByName(String str) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.immutableExtensionsByName.get(str));
        return null;
    }

    public ExtensionInfo findExtensionByNumber(Descriptors.Descriptor descriptor, int i) {
        findImmutableExtensionByNumber(descriptor, i);
        return null;
    }

    public ExtensionInfo findImmutableExtensionByNumber(Descriptors.Descriptor descriptor, int i) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.immutableExtensionsByNumber.get(new DescriptorIntPair(descriptor, i)));
        return null;
    }

    ExtensionRegistry(boolean z) {
        super(ExtensionRegistryLite.EMPTY_REGISTRY_LITE);
        this.immutableExtensionsByName = Collections.emptyMap();
        this.mutableExtensionsByName = Collections.emptyMap();
        this.immutableExtensionsByNumber = Collections.emptyMap();
        this.mutableExtensionsByNumber = Collections.emptyMap();
    }

    private static final class DescriptorIntPair {
        private final Descriptors.Descriptor descriptor;
        private final int number;

        DescriptorIntPair(Descriptors.Descriptor descriptor, int i) {
            this.descriptor = descriptor;
            this.number = i;
        }

        public int hashCode() {
            return (this.descriptor.hashCode() * 65535) + this.number;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DescriptorIntPair)) {
                return false;
            }
            DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
            return this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number;
        }
    }
}
