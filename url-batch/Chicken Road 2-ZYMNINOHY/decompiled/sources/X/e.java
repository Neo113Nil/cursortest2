package X;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3495a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f3496b;

    public /* synthetic */ e() {
    }

    public static String d(int i4) {
        return "" + ((char) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i4 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public void a(int i4) {
        this.f3496b = i4 | this.f3496b;
    }

    public boolean g(int i4) {
        return (this.f3496b & i4) == i4;
    }

    public String toString() {
        switch (this.f3495a) {
            case 0:
                return d(this.f3496b);
            default:
                return super.toString();
        }
    }

    public e(int i4) {
        this.f3496b = i4;
    }
}
