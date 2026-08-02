package com.squareup.wire.internal;

import androidx.room.Room;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;
import com.datadog.android.telemetry.internal.TelemetryEventId;
import com.squareup.cash.common.viewmodels.CashTagSymbol;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.ProtocolException;
import java.time.LocalDate;
import kotlin.Result;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class GrpcDecoderKt {
    public static final NextAvailableCashTag computeNextAvailableCashTag(String str, String str2, String str3, LocalDate localDate) {
        Object failure;
        Object failure2;
        CashTagSymbol cashTagSymbol;
        localDate.getClass();
        if (!StringsKt.isBlank(str2) && !StringsKt.isBlank(str3)) {
            try {
                Result.Companion companion = Result.Companion;
                failure = LocalDate.parse(str2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            LocalDate localDate2 = (LocalDate) failure;
            if (localDate2 != null) {
                try {
                    failure2 = LocalDate.parse(str3);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                Object obj = (LocalDate) failure2;
                if (obj != null && localDate.compareTo(obj) >= 0 && localDate.compareTo((Object) localDate2) <= 0) {
                    int hashCode = str.hashCode();
                    if (hashCode != 3046160) {
                        if (hashCode != 3641856) {
                            if (hashCode == 99151942 && str.equals("heart")) {
                                cashTagSymbol = CashTagSymbol.HEART;
                                return new NextAvailableCashTag(localDate2, cashTagSymbol);
                            }
                        } else if (str.equals("wand")) {
                            cashTagSymbol = CashTagSymbol.WAND;
                            return new NextAvailableCashTag(localDate2, cashTagSymbol);
                        }
                    } else if (str.equals("card")) {
                        cashTagSymbol = CashTagSymbol.CARD;
                        return new NextAvailableCashTag(localDate2, cashTagSymbol);
                    }
                }
            }
        }
        return null;
    }

    public static final TelemetryEventId getIdentity(InternalTelemetryEvent internalTelemetryEvent) {
        internalTelemetryEvent.getClass();
        String str = null;
        if (!(internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Error)) {
            return internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Debug ? new TelemetryEventId(type(internalTelemetryEvent), ((InternalTelemetryEvent.Log.Debug) internalTelemetryEvent).message, null) : new TelemetryEventId(type(internalTelemetryEvent), "", null);
        }
        int type2 = type(internalTelemetryEvent);
        InternalTelemetryEvent.Log.Error error = (InternalTelemetryEvent.Log.Error) internalTelemetryEvent;
        String str2 = error.message;
        Throwable th = error.error;
        String canonicalName = th != null ? th.getClass().getCanonicalName() : null;
        if (canonicalName != null) {
            str = canonicalName;
        } else if (th != null) {
            str = th.getClass().getSimpleName();
        }
        return new TelemetryEventId(type2, str2, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Room toGrpcDecoding(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -898026669:
                if (str.equals("snappy")) {
                    throw new ProtocolException("snappy not yet supported");
                }
                break;
            case -135761730:
                if (str.equals("identity")) {
                    return GrpcDecoder$IdentityGrpcDecoder.INSTANCE;
                }
                break;
            case 3189082:
                if (str.equals("gzip")) {
                    return GrpcDecoder$GzipGrpcDecoder.INSTANCE;
                }
                break;
            case 1545112619:
                if (str.equals("deflate")) {
                    throw new ProtocolException("deflate not yet supported");
                }
                break;
        }
        throw new ProtocolException("unsupported grpc-encoding: ".concat(str));
    }

    public static final int type(InternalTelemetryEvent internalTelemetryEvent) {
        internalTelemetryEvent.getClass();
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Debug) {
            return 1;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Error) {
            return 2;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Configuration) {
            return 3;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Metric) {
            return 6;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent$ApiUsage$AddViewLoadingTime) {
            return 5;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.InterceptorInstantiated) {
            return 4;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
