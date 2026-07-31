package I2;

import java.util.Vector;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Vector f779a = new Vector();

    public void a(b bVar) {
        this.f779a.addElement(bVar);
    }

    public b b(int i4) {
        return (b) this.f779a.elementAt(i4);
    }

    public int c() {
        return this.f779a.size();
    }
}
