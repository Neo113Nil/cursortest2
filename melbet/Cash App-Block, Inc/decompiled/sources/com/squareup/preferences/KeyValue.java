package com.squareup.preferences;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface KeyValue {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class OnDeserializationFailure {
        public static final /* synthetic */ OnDeserializationFailure[] $VALUES;
        public static final OnDeserializationFailure Delete;
        public static final OnDeserializationFailure Throw;

        static {
            OnDeserializationFailure onDeserializationFailure = new OnDeserializationFailure("Delete", 0);
            Delete = onDeserializationFailure;
            OnDeserializationFailure onDeserializationFailure2 = new OnDeserializationFailure("Throw", 1);
            Throw = onDeserializationFailure2;
            $VALUES = new OnDeserializationFailure[]{onDeserializationFailure, onDeserializationFailure2};
        }

        public static OnDeserializationFailure valueOf(String str) {
            return (OnDeserializationFailure) Enum.valueOf(OnDeserializationFailure.class, str);
        }

        public static OnDeserializationFailure[] values() {
            return (OnDeserializationFailure[]) $VALUES.clone();
        }
    }

    Object blockingGet();

    void blockingSet(Object obj);

    Object delete(Continuation continuation);

    default Object get(Continuation continuation) {
        return blockingGet();
    }

    Flow observe();

    Object set(Object obj, Continuation continuation);
}
