package com.explorestack.protobuf;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite {
    private static Map defaultInstanceMap = new ConcurrentHashMap();

    public static class GeneratedExtension extends ExtensionLite {
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static GeneratedMessageLite getDefaultInstance(Class cls) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(defaultInstanceMap.get(cls));
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(defaultInstanceMap.get(cls));
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(UnsafeUtil.allocateInstance(cls));
            throw null;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        }
    }

    protected static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        SerializedForm(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = messageLite.toByteArray();
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e4) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e4);
            }
        }

        private Object readResolveFallback() {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e5);
            }
        }

        private Class resolveMessageClass() {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }
    }
}
