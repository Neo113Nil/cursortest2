package com.squareup.cash.support.chat.backend.api;

import androidx.glance.session.TimerScopeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MessageStatus$Failed extends TimerScopeKt {
    public final boolean clientDetermined;
    public final boolean retryable;
    public final Integer statusCode;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1206type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type DELIVERY;
        public static final Type FILE_TOO_LARGE;
        public static final Type INVALID_FILE;
        public static final Type UNSUPPORTED_FILE_TYPE;

        static {
            Type type2 = new Type("DELIVERY", 0);
            DELIVERY = type2;
            Type type3 = new Type("INVALID_FILE", 1);
            INVALID_FILE = type3;
            Type type4 = new Type("FILE_TOO_LARGE", 2);
            FILE_TOO_LARGE = type4;
            Type type5 = new Type("UNSUPPORTED_FILE_TYPE", 3);
            UNSUPPORTED_FILE_TYPE = type5;
            $VALUES = new Type[]{type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MessageStatus$Failed(Type type2, boolean z, Integer num, boolean z2, int i) {
        z = (i & 2) != 0 ? type2 == Type.DELIVERY : z;
        num = (i & 4) != 0 ? null : num;
        z2 = (i & 8) != 0 ? false : z2;
        this.f1206type = type2;
        this.retryable = z;
        this.statusCode = num;
        this.clientDetermined = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageStatus$Failed)) {
            return false;
        }
        MessageStatus$Failed messageStatus$Failed = (MessageStatus$Failed) obj;
        return this.f1206type == messageStatus$Failed.f1206type && this.retryable == messageStatus$Failed.retryable && Intrinsics.areEqual(this.statusCode, messageStatus$Failed.statusCode) && this.clientDetermined == messageStatus$Failed.clientDetermined;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1206type.hashCode() * 31, 31, this.retryable);
        Integer num = this.statusCode;
        return Boolean.hashCode(this.clientDetermined) + ((m + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Failed(type=" + this.f1206type + ", retryable=" + this.retryable + ", statusCode=" + this.statusCode + ", clientDetermined=" + this.clientDetermined + ")";
    }
}
