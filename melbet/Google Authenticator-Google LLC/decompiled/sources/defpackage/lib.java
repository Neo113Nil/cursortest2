package defpackage;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lib extends CronetException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lib(HttpException httpException) {
        super(r0, httpException);
        String message;
        message = httpException.getMessage();
    }
}
