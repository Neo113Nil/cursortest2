package a;

import com.huawei.hms.framework.common.BundleUtil;
import io.jsonwebtoken.JwtParser;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1235b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9753a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f9753a + JwtParser.SEPARATOR_CHAR + str, BundleUtil.UNDERLINE_TAG, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
