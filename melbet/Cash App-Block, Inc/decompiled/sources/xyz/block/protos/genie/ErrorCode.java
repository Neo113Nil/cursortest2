package xyz.block.protos.genie;

import android.content.Context;
import android.view.View;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.tracking.ActionTrackingStrategy;
import com.datadog.android.rum.tracking.ViewTarget;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes10.dex */
public enum ErrorCode implements WireEnum {
    ERROR_CODE_UNSPECIFIED(0),
    ERROR_CODE_INVALID_REQUEST(1),
    ERROR_CODE_NOT_FOUND(2),
    ERROR_CODE_UNAUTHORIZED(3),
    ERROR_CODE_INTERNAL(4),
    ERROR_CODE_VALIDATION_FAILED(5);

    public static final ErrorCode$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    public final class Companion implements ActionTrackingStrategy {
        public static ErrorCode fromValue(int i) {
            if (i == 0) {
                return ErrorCode.ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return ErrorCode.ERROR_CODE_INVALID_REQUEST;
            }
            if (i == 2) {
                return ErrorCode.ERROR_CODE_NOT_FOUND;
            }
            if (i == 3) {
                return ErrorCode.ERROR_CODE_UNAUTHORIZED;
            }
            if (i == 4) {
                return ErrorCode.ERROR_CODE_INTERNAL;
            }
            if (i != 5) {
                return null;
            }
            return ErrorCode.ERROR_CODE_VALIDATION_FAILED;
        }

        @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
        public ViewTarget findTargetForScroll(View view, float f, float f2) {
            view.getClass();
            return null;
        }

        @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
        public ViewTarget findTargetForTap(View view, float f, float f2) {
            view.getClass();
            return null;
        }

        @Override // com.datadog.android.rum.tracking.TrackingStrategy
        public void register(InternalSdkCore internalSdkCore, Context context) {
            internalSdkCore.getClass();
            context.getClass();
        }

        @Override // com.datadog.android.rum.tracking.TrackingStrategy
        public void unregister(Context context) {
        }
    }

    static {
        ErrorCode errorCode = ERROR_CODE_UNSPECIFIED;
        Companion = new Companion();
        ADAPTER = new ErrorCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ErrorCode.class), Syntax.PROTO_2, errorCode);
    }

    ErrorCode(int i) {
        this.value = i;
    }

    public static final ErrorCode fromValue(int i) {
        Companion.getClass();
        return Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
