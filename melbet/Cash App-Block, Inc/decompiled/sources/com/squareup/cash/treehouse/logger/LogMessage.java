package com.squareup.cash.treehouse.logger;

import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public final class LogMessage {
    public final LogLevel logLevel;
    public final String message;
    public final String tag;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(5)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/logger/LogMessage$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/logger/LogMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LogMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogMessage(int i, LogLevel logLevel, String str, String str2) {
        if (4 != (i & 4)) {
            TuplesKt.throwMissingFieldException(i, 4, LogMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.logLevel = (i & 1) == 0 ? LogLevel.INFO : logLevel;
        if ((i & 2) == 0) {
            this.tag = null;
        } else {
            this.tag = str;
        }
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogMessage)) {
            return false;
        }
        LogMessage logMessage = (LogMessage) obj;
        return this.logLevel == logMessage.logLevel && Intrinsics.areEqual(this.tag, logMessage.tag) && Intrinsics.areEqual(this.message, logMessage.message);
    }

    public final int hashCode() {
        int hashCode = this.logLevel.hashCode() * 31;
        String str = this.tag;
        return this.message.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogMessage(logLevel=");
        sb.append(this.logLevel);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", message=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.message, ")");
    }
}
