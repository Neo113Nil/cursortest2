package Y;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f3694a;

    public i(int i4) {
        this.f3694a = i4;
    }

    public i(Exception exc, int i4) {
        super(exc);
        this.f3694a = i4;
    }

    public i(String str, int i4) {
        super(str);
        this.f3694a = i4;
    }

    public i(int i4, String str, Exception exc) {
        super(str, exc);
        this.f3694a = i4;
    }
}
