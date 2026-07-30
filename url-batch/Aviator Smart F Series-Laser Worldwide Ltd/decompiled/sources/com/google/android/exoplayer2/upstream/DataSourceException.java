package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

@Deprecated
/* loaded from: classes3.dex */
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i8) {
        this.reason = i8;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof DataSourceException) && ((DataSourceException) iOException2).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(@Nullable Throwable th, int i8) {
        super(th);
        this.reason = i8;
    }

    public DataSourceException(@Nullable String str, int i8) {
        super(str);
        this.reason = i8;
    }

    public DataSourceException(@Nullable String str, @Nullable Throwable th, int i8) {
        super(str, th);
        this.reason = i8;
    }
}
