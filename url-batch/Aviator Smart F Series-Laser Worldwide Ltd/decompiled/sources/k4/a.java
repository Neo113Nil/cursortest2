package k4;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17031a;

    /* renamed from: b, reason: collision with root package name */
    private int f17032b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f17033c = 0;

    public a(boolean z7) {
        this.f17031a = z7;
    }

    public int a() {
        return this.f17033c;
    }

    public int b() {
        return this.f17032b;
    }

    public boolean c() {
        return this.f17031a;
    }

    public String toString() {
        return "TCPConnectEntity{connected=" + this.f17031a + ", fd=" + this.f17032b + ", errorCode=" + this.f17033c + '}';
    }

    public void a(int i8) {
        this.f17033c = i8;
    }

    public void b(int i8) {
        this.f17032b = i8;
    }

    public void a(boolean z7) {
        this.f17031a = z7;
    }
}
