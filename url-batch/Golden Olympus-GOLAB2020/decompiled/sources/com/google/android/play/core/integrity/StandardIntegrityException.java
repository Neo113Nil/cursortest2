package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes.dex */
public class StandardIntegrityException extends ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f13475a;

    StandardIntegrityException(int i4, Throwable th) {
        super(new Status(i4, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i4), com.google.android.play.core.integrity.model.b.a(i4))));
        if (i4 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f13475a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f13475a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
