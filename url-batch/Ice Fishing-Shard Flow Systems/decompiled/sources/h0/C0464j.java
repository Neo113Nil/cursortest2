package h0;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5108b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5109c;

    public /* synthetic */ C0464j(int i2, String str, boolean z7) {
        this.f5107a = i2;
        this.f5108b = str;
        this.f5109c = z7;
    }

    public String toString() {
        switch (this.f5107a) {
            case 1:
                String str = this.f5108b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f5109c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0464j(String str, boolean z7) {
        this.f5107a = 0;
        this.f5109c = z7;
        this.f5108b = str;
    }
}
