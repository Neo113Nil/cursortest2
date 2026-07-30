package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.annotation.Nullable;
import cn.hutool.core.util.l;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    @Nullable
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(l.UTF_8);
        } catch (UnsupportedEncodingException e8) {
            Log.e("AUTH", "Error serializing object.", e8);
            return null;
        }
    }
}
