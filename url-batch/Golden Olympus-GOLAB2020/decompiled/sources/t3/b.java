package t3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f46270a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46271b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46272c;

    /* renamed from: d, reason: collision with root package name */
    private final String f46273d;

    public b(String packageName, String versionName, String str, String str2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.f46270a = packageName;
        this.f46271b = versionName;
        this.f46272c = str;
        this.f46273d = str2;
    }

    public final String a() {
        return this.f46272c;
    }

    public final String b() {
        return this.f46273d;
    }

    public final String c() {
        return this.f46270a;
    }

    public final String d() {
        return this.f46271b;
    }
}
