package z6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class v {

    /* renamed from: d, reason: collision with root package name */
    public static final v f10914d = new v(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10915a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10916b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f10917c;

    public v(boolean z10, String str, Exception exc) {
        this.f10915a = z10;
        this.f10916b = str;
        this.f10917c = exc;
    }

    public static v b(String str) {
        return new v(false, str, null);
    }

    public static v c(String str, Exception exc) {
        return new v(false, str, exc);
    }

    public String a() {
        return this.f10916b;
    }
}
