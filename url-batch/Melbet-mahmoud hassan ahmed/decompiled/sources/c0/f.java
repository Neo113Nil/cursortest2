package c0;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class f implements l {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f1706a = new String[0];

    @Override // c0.l
    public String[] a() {
        return f1706a;
    }

    @Override // c0.l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
